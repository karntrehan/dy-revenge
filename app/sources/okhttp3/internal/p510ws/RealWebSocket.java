package okhttp3.internal.p510ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.p510ws.WebSocketReader;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10608g;
import p493i.C10615h;
import p493i.C10616i;

/* renamed from: okhttp3.internal.ws.RealWebSocket */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion((C10452g) null);
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = C10349k.m35133b(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    /* access modifiers changed from: private */
    public WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    /* access modifiers changed from: private */
    public final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private long minimumDeflateSize;
    /* access modifiers changed from: private */
    public String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<C10616i> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final C10616i reason;

        public Close(int i, C10616i iVar, long j) {
            this.code = i;
            this.reason = iVar;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final C10616i getReason() {
            return this.reason;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    public static final class Message {
        private final C10616i data;
        private final int formatOpcode;

        public Message(int i, C10616i iVar) {
            C10457l.m35320e(iVar, "data");
            this.formatOpcode = i;
            this.data = iVar;
        }

        public final C10616i getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final C10608g sink;
        private final C10615h source;

        public Streams(boolean z, C10615h hVar, C10608g gVar) {
            C10457l.m35320e(hVar, "source");
            C10457l.m35320e(gVar, "sink");
            this.client = z;
            this.source = hVar;
            this.sink = gVar;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final C10608g getSink() {
            return this.sink;
        }

        public final C10615h getSource() {
            return this.source;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$WriterTask */
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, (C10452g) null);
        }

        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0 : -1;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, (Response) null);
                return -1;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random2, long j, WebSocketExtensions webSocketExtensions, long j2) {
        C10457l.m35320e(taskRunner, "taskRunner");
        C10457l.m35320e(request, "originalRequest");
        C10457l.m35320e(webSocketListener, "listener");
        C10457l.m35320e(random2, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random2;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        if (C10457l.m35316a("GET", request.method())) {
            C10616i.C10617a aVar = C10616i.f28050o;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            C10323s sVar = C10323s.f27547a;
            this.key = C10616i.C10617a.m36135g(aVar, bArr, 0, 0, 3, (Object) null).mo26270e();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + request.method()).toString());
    }

    /* access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        return 8 <= intValue && 15 >= intValue;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0, 2, (Object) null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean send(p493i.C10616i r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.mo26420Y()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.mo26420Y()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.send(i.i, int):boolean");
    }

    public final void awaitTermination(long j, TimeUnit timeUnit) {
        C10457l.m35320e(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    public void cancel() {
        Call call2 = this.call;
        C10457l.m35317b(call2);
        call2.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) {
        C10457l.m35320e(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", (String) null, 2, (Object) null);
            if (C10299p.m34929o("Upgrade", header$default, true)) {
                String header$default2 = Response.header$default(response, "Upgrade", (String) null, 2, (Object) null);
                if (C10299p.m34929o("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    C10616i.C10617a aVar = C10616i.f28050o;
                    String e = aVar.mo26428d(this.key + WebSocketProtocol.ACCEPT_MAGIC).mo26418W().mo26270e();
                    if (!C10457l.m35316a(e, header$default3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + e + "' but was '" + header$default3 + '\'');
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
    }

    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean close(int r9, java.lang.String r10, long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p510ws.WebSocketProtocol.INSTANCE     // Catch:{ all -> 0x0059 }
            r0.validateCloseCode(r9)     // Catch:{ all -> 0x0059 }
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x003d
            i.i$a r0 = p493i.C10616i.f28050o     // Catch:{ all -> 0x0059 }
            i.i r0 = r0.mo26428d(r10)     // Catch:{ all -> 0x0059 }
            int r3 = r0.mo26420Y()     // Catch:{ all -> 0x0059 }
            long r3 = (long) r3     // Catch:{ all -> 0x0059 }
            r5 = 123(0x7b, double:6.1E-322)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = "reason.size() > 123: "
            r9.append(r11)     // Catch:{ all -> 0x0059 }
            r9.append(r10)     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0059 }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0059 }
            r10.<init>(r9)     // Catch:{ all -> 0x0059 }
            throw r10     // Catch:{ all -> 0x0059 }
        L_0x003d:
            boolean r10 = r8.failed     // Catch:{ all -> 0x0059 }
            if (r10 != 0) goto L_0x0057
            boolean r10 = r8.enqueuedClose     // Catch:{ all -> 0x0059 }
            if (r10 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            r8.enqueuedClose = r2     // Catch:{ all -> 0x0059 }
            java.util.ArrayDeque<java.lang.Object> r10 = r8.messageAndCloseQueue     // Catch:{ all -> 0x0059 }
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x0059 }
            r1.<init>(r9, r0, r11)     // Catch:{ all -> 0x0059 }
            r10.add(r1)     // Catch:{ all -> 0x0059 }
            r8.runWriter()     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            return r2
        L_0x0057:
            monitor-exit(r8)
            return r1
        L_0x0059:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.close(int, java.lang.String, long):boolean");
    }

    public final void connect(OkHttpClient okHttpClient) {
        C10457l.m35320e(okHttpClient, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (Response) null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        C10457l.m35317b(realCall);
        realCall.enqueue(new RealWebSocket$connect$1(this, build2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.listener.onFailure(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(java.lang.Exception r5, okhttp3.Response r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            p455g.p470y.p472d.C10457l.m35320e(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.failed     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.failed = r0     // Catch:{ all -> 0x004a }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x004a }
            r1 = 0
            r4.streams = r1     // Catch:{ all -> 0x004a }
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch:{ all -> 0x004a }
            r4.reader = r1     // Catch:{ all -> 0x004a }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch:{ all -> 0x004a }
            r4.writer = r1     // Catch:{ all -> 0x004a }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch:{ all -> 0x004a }
            r1.shutdown()     // Catch:{ all -> 0x004a }
            g.s r1 = p455g.C10323s.f27547a     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.listener     // Catch:{ all -> 0x0039 }
            r1.onFailure(r4, r5, r6)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x002e
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0038:
            return
        L_0x0039:
            r5 = move-exception
            if (r0 == 0) goto L_0x003f
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0049:
            throw r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams2) {
        String str2 = str;
        Streams streams3 = streams2;
        C10457l.m35320e(str2, "name");
        C10457l.m35320e(streams3, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        C10457l.m35317b(webSocketExtensions);
        synchronized (this) {
            this.name = str2;
            this.streams = streams3;
            this.writer = new WebSocketWriter(streams2.getClient(), streams2.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams2.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j = this.pingIntervalMillis;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                TaskQueue taskQueue2 = this.taskQueue;
                String str3 = str2 + " ping";
                RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 realWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 = r1;
                RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 realWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$12 = new RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1(str3, str3, nanos, this, str, streams2, webSocketExtensions);
                taskQueue2.schedule(realWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            C10323s sVar = C10323s.f27547a;
        }
        this.reader = new WebSocketReader(streams2.getClient(), streams2.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams2.getClient()));
    }

    public final void loopReader() {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            C10457l.m35317b(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [okhttp3.internal.ws.WebSocketWriter, okhttp3.internal.ws.WebSocketReader, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReadClose(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            p455g.p470y.p472d.C10457l.m35320e(r6, r0)
            r0 = 1
            r1 = 0
            r2 = -1
            if (r5 == r2) goto L_0x000c
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r3 == 0) goto L_0x007d
            monitor-enter(r4)
            int r3 = r4.receivedCloseCode     // Catch:{ all -> 0x007a }
            if (r3 != r2) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x006e
            r4.receivedCloseCode = r5     // Catch:{ all -> 0x007a }
            r4.receivedCloseReason = r6     // Catch:{ all -> 0x007a }
            boolean r0 = r4.enqueuedClose     // Catch:{ all -> 0x007a }
            r1 = 0
            if (r0 == 0) goto L_0x003c
            java.util.ArrayDeque<java.lang.Object> r0 = r4.messageAndCloseQueue     // Catch:{ all -> 0x007a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x003c
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x007a }
            r4.streams = r1     // Catch:{ all -> 0x007a }
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch:{ all -> 0x007a }
            r4.reader = r1     // Catch:{ all -> 0x007a }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch:{ all -> 0x007a }
            r4.writer = r1     // Catch:{ all -> 0x007a }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch:{ all -> 0x007a }
            r1.shutdown()     // Catch:{ all -> 0x007a }
            r1 = r0
            goto L_0x003e
        L_0x003c:
            r2 = r1
            r3 = r2
        L_0x003e:
            g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x007a }
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x005d }
            r0.onClosing(r4, r5, r6)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x004d
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x005d }
            r0.onClosed(r4, r5, r6)     // Catch:{ all -> 0x005d }
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x005c:
            return
        L_0x005d:
            r5 = move-exception
            if (r1 == 0) goto L_0x0063
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0068:
            if (r3 == 0) goto L_0x006d
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x006d:
            throw r5
        L_0x006e:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x007a }
            r6.<init>(r5)     // Catch:{ all -> 0x007a }
            throw r6     // Catch:{ all -> 0x007a }
        L_0x007a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x007d:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.onReadClose(int, java.lang.String):void");
    }

    public void onReadMessage(C10616i iVar) {
        C10457l.m35320e(iVar, "bytes");
        this.listener.onMessage((WebSocket) this, iVar);
    }

    public void onReadMessage(String str) {
        C10457l.m35320e(str, "text");
        this.listener.onMessage((WebSocket) this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(p493i.C10616i r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.failed     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque<i.i> r0 = r1.pongQueue     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.runWriter()     // Catch:{ all -> 0x0029 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.onReadPing(i.i):void");
    }

    public synchronized void onReadPong(C10616i iVar) {
        C10457l.m35320e(iVar, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(C10616i iVar) {
        boolean z;
        C10457l.m35320e(iVar, "payload");
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(iVar);
                runWriter();
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            C10457l.m35317b(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
            return false;
        }
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    public Request request() {
        return this.originalRequest;
    }

    public boolean send(C10616i iVar) {
        C10457l.m35320e(iVar, "bytes");
        return send(iVar, 2);
    }

    public boolean send(String str) {
        C10457l.m35320e(str, "text");
        return send(C10616i.f28050o.mo26428d(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        if (r3 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p455g.p470y.p472d.C10457l.m35317b(r21);
        r21.writePong(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        r1 = r21;
        r0 = r0.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010c, code lost:
        if ((r0 instanceof okhttp3.internal.p510ws.RealWebSocket.Message) == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010e, code lost:
        if (r0 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        r0 = (okhttp3.internal.p510ws.RealWebSocket.Message) r0;
        p455g.p470y.p472d.C10457l.m35317b(r1);
        r1.writeMessageFrame(r0.getFormatOpcode(), r0.getData());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        monitor-enter(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r15.queueSize -= (long) r0.getData().mo26420Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        monitor-exit(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013b, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013e, code lost:
        if ((r0 instanceof okhttp3.internal.p510ws.RealWebSocket.Close) == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r0 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0142, code lost:
        r0 = (okhttp3.internal.p510ws.RealWebSocket.Close) r0;
        p455g.p470y.p472d.C10457l.m35317b(r1);
        r1.writeClose(r0.getCode(), r0.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        if (((okhttp3.internal.p510ws.RealWebSocket.Streams) r1.f27625f) == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015a, code lost:
        r0 = r15.listener;
        r2 = r26.f27623f;
        r3 = (java.lang.String) r25.f27625f;
        p455g.p470y.p472d.C10457l.m35317b(r3);
        r0.onClosed(r15, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016c, code lost:
        r1 = (okhttp3.internal.p510ws.RealWebSocket.Streams) r1.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        if (r1 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0173, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        r1 = (okhttp3.internal.p510ws.WebSocketReader) r23.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017c, code lost:
        if (r1 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017e, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0181, code lost:
        r1 = (okhttp3.internal.p510ws.WebSocketWriter) r22.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0187, code lost:
        if (r1 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0189, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018e, code lost:
        r3 = r22;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0193, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ac, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b0, code lost:
        r3 = r22;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b6, code lost:
        r1 = (okhttp3.internal.p510ws.RealWebSocket.Streams) r1.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ba, code lost:
        if (r1 != null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        r1 = (okhttp3.internal.p510ws.WebSocketReader) r2.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c3, code lost:
        if (r1 != null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c5, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c8, code lost:
        r1 = (okhttp3.internal.p510ws.WebSocketWriter) r3.f27625f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cc, code lost:
        if (r1 != null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame$okhttp() {
        /*
            r27 = this;
            r15 = r27
            g.y.d.v r0 = new g.y.d.v
            r0.<init>()
            r1 = 0
            r0.f27625f = r1
            g.y.d.t r14 = new g.y.d.t
            r14.<init>()
            r2 = -1
            r14.f27623f = r2
            g.y.d.v r13 = new g.y.d.v
            r13.<init>()
            r13.f27625f = r1
            g.y.d.v r12 = new g.y.d.v
            r12.<init>()
            r12.f27625f = r1
            g.y.d.v r11 = new g.y.d.v
            r11.<init>()
            r11.f27625f = r1
            g.y.d.v r10 = new g.y.d.v
            r10.<init>()
            r10.f27625f = r1
            monitor-enter(r27)
            boolean r3 = r15.failed     // Catch:{ all -> 0x01d2 }
            r4 = 0
            if (r3 == 0) goto L_0x0036
            monitor-exit(r27)
            return r4
        L_0x0036:
            okhttp3.internal.ws.WebSocketWriter r9 = r15.writer     // Catch:{ all -> 0x01d2 }
            java.util.ArrayDeque<i.i> r3 = r15.pongQueue     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x01d2 }
            r8 = r3
            i.i r8 = (p493i.C10616i) r8     // Catch:{ all -> 0x01d2 }
            if (r8 != 0) goto L_0x00e6
            java.util.ArrayDeque<java.lang.Object> r3 = r15.messageAndCloseQueue     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x01d2 }
            r0.f27625f = r3     // Catch:{ all -> 0x01d2 }
            boolean r5 = r3 instanceof okhttp3.internal.p510ws.RealWebSocket.Close     // Catch:{ all -> 0x01d2 }
            if (r5 == 0) goto L_0x00d4
            int r3 = r15.receivedCloseCode     // Catch:{ all -> 0x01d2 }
            r14.f27623f = r3     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r15.receivedCloseReason     // Catch:{ all -> 0x01d2 }
            r13.f27625f = r4     // Catch:{ all -> 0x01d2 }
            if (r3 == r2) goto L_0x0072
            okhttp3.internal.ws.RealWebSocket$Streams r2 = r15.streams     // Catch:{ all -> 0x01d2 }
            r12.f27625f = r2     // Catch:{ all -> 0x01d2 }
            r15.streams = r1     // Catch:{ all -> 0x01d2 }
            okhttp3.internal.ws.WebSocketReader r2 = r15.reader     // Catch:{ all -> 0x01d2 }
            r11.f27625f = r2     // Catch:{ all -> 0x01d2 }
            r15.reader = r1     // Catch:{ all -> 0x01d2 }
            okhttp3.internal.ws.WebSocketWriter r2 = r15.writer     // Catch:{ all -> 0x01d2 }
            r10.f27625f = r2     // Catch:{ all -> 0x01d2 }
            r15.writer = r1     // Catch:{ all -> 0x01d2 }
            okhttp3.internal.concurrent.TaskQueue r1 = r15.taskQueue     // Catch:{ all -> 0x01d2 }
            r1.shutdown()     // Catch:{ all -> 0x01d2 }
            goto L_0x00e6
        L_0x0072:
            T r1 = r0.f27625f     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x00cc
            okhttp3.internal.ws.RealWebSocket$Close r1 = (okhttp3.internal.p510ws.RealWebSocket.Close) r1     // Catch:{ all -> 0x01d2 }
            long r1 = r1.getCancelAfterCloseMillis()     // Catch:{ all -> 0x01d2 }
            okhttp3.internal.concurrent.TaskQueue r7 = r15.taskQueue     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r3.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r15.name     // Catch:{ all -> 0x01d2 }
            r3.append(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = " cancel"
            r3.append(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x01d2 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01d2 }
            long r5 = r3.toNanos(r1)     // Catch:{ all -> 0x01d2 }
            r16 = 1
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x01d2 }
            r1 = r3
            r2 = r4
            r17 = r3
            r3 = r16
            r18 = r5
            r5 = r16
            r6 = r27
            r20 = r7
            r7 = r9
            r16 = r8
            r21 = r9
            r9 = r0
            r22 = r10
            r10 = r14
            r23 = r11
            r11 = r13
            r24 = r12
            r25 = r13
            r13 = r23
            r26 = r14
            r14 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01d2 }
            r4 = r17
            r2 = r18
            r1 = r20
            r1.schedule(r4, r2)     // Catch:{ all -> 0x01d2 }
            goto L_0x00f4
        L_0x00cc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r1)     // Catch:{ all -> 0x01d2 }
            throw r0     // Catch:{ all -> 0x01d2 }
        L_0x00d4:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            if (r3 != 0) goto L_0x00f4
            monitor-exit(r27)
            return r4
        L_0x00e6:
            r16 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
        L_0x00f4:
            g.s r1 = p455g.C10323s.f27547a     // Catch:{ all -> 0x01d2 }
            monitor-exit(r27)
            r3 = r16
            if (r3 == 0) goto L_0x0106
            p455g.p470y.p472d.C10457l.m35317b(r21)     // Catch:{ all -> 0x01af }
            r1 = r21
            r1.writePong(r3)     // Catch:{ all -> 0x01af }
        L_0x0103:
            r1 = r24
            goto L_0x016c
        L_0x0106:
            r1 = r21
            T r0 = r0.f27625f     // Catch:{ all -> 0x01af }
            boolean r2 = r0 instanceof okhttp3.internal.p510ws.RealWebSocket.Message     // Catch:{ all -> 0x01af }
            if (r2 == 0) goto L_0x013c
            if (r0 == 0) goto L_0x0134
            okhttp3.internal.ws.RealWebSocket$Message r0 = (okhttp3.internal.p510ws.RealWebSocket.Message) r0     // Catch:{ all -> 0x01af }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x01af }
            int r2 = r0.getFormatOpcode()     // Catch:{ all -> 0x01af }
            i.i r3 = r0.getData()     // Catch:{ all -> 0x01af }
            r1.writeMessageFrame(r2, r3)     // Catch:{ all -> 0x01af }
            monitor-enter(r27)     // Catch:{ all -> 0x01af }
            long r1 = r15.queueSize     // Catch:{ all -> 0x0131 }
            i.i r0 = r0.getData()     // Catch:{ all -> 0x0131 }
            int r0 = r0.mo26420Y()     // Catch:{ all -> 0x0131 }
            long r3 = (long) r0     // Catch:{ all -> 0x0131 }
            long r1 = r1 - r3
            r15.queueSize = r1     // Catch:{ all -> 0x0131 }
            monitor-exit(r27)     // Catch:{ all -> 0x01af }
            goto L_0x0103
        L_0x0131:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x0134:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01af }
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"
            r0.<init>(r1)     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x013c:
            boolean r2 = r0 instanceof okhttp3.internal.p510ws.RealWebSocket.Close     // Catch:{ all -> 0x01af }
            if (r2 == 0) goto L_0x01a1
            if (r0 == 0) goto L_0x0193
            okhttp3.internal.ws.RealWebSocket$Close r0 = (okhttp3.internal.p510ws.RealWebSocket.Close) r0     // Catch:{ all -> 0x01af }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x01af }
            int r2 = r0.getCode()     // Catch:{ all -> 0x01af }
            i.i r0 = r0.getReason()     // Catch:{ all -> 0x01af }
            r1.writeClose(r2, r0)     // Catch:{ all -> 0x01af }
            r1 = r24
            T r0 = r1.f27625f     // Catch:{ all -> 0x018d }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = (okhttp3.internal.p510ws.RealWebSocket.Streams) r0     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x016c
            okhttp3.WebSocketListener r0 = r15.listener     // Catch:{ all -> 0x018d }
            r2 = r26
            int r2 = r2.f27623f     // Catch:{ all -> 0x018d }
            r3 = r25
            T r3 = r3.f27625f     // Catch:{ all -> 0x018d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x018d }
            p455g.p470y.p472d.C10457l.m35317b(r3)     // Catch:{ all -> 0x018d }
            r0.onClosed(r15, r2, r3)     // Catch:{ all -> 0x018d }
        L_0x016c:
            r0 = 1
            T r1 = r1.f27625f
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.p510ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L_0x0176
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0176:
            r2 = r23
            T r1 = r2.f27625f
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.p510ws.WebSocketReader) r1
            if (r1 == 0) goto L_0x0181
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0181:
            r3 = r22
            T r1 = r3.f27625f
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.p510ws.WebSocketWriter) r1
            if (r1 == 0) goto L_0x018c
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x018c:
            return r0
        L_0x018d:
            r0 = move-exception
            r3 = r22
            r2 = r23
            goto L_0x01b6
        L_0x0193:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01ad }
            java.lang.String r4 = "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"
            r0.<init>(r4)     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01a1:
            r3 = r22
            r2 = r23
            r1 = r24
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x01ad }
            r0.<init>()     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r0 = move-exception
            goto L_0x01b6
        L_0x01af:
            r0 = move-exception
            r3 = r22
            r2 = r23
            r1 = r24
        L_0x01b6:
            T r1 = r1.f27625f
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.p510ws.RealWebSocket.Streams) r1
            if (r1 == 0) goto L_0x01bf
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x01bf:
            T r1 = r2.f27625f
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.p510ws.WebSocketReader) r1
            if (r1 == 0) goto L_0x01c8
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x01c8:
            T r1 = r3.f27625f
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.p510ws.WebSocketWriter) r1
            if (r1 == 0) goto L_0x01d1
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x01d1:
            throw r0
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r1 == -1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.pingIntervalMillis + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.writePing(p493i.C10616i.f28049f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x0059 }
            r2 = -1
            if (r1 == 0) goto L_0x0013
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x0059 }
            goto L_0x0014
        L_0x0013:
            r1 = -1
        L_0x0014:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x0059 }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x0059 }
            r7.awaitingPong = r4     // Catch:{ all -> 0x0059 }
            g.s r3 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004c
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L_0x004c:
            i.i r1 = p493i.C10616i.f28049f     // Catch:{ IOException -> 0x0052 }
            r0.writePing(r1)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
        L_0x0056:
            return
        L_0x0057:
            monitor-exit(r7)
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.RealWebSocket.writePingFrame$okhttp():void");
    }
}
