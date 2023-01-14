package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import p455g.C10323s;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10615h;
import p493i.C10616i;
import p493i.C10625q;

public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion((C10452g) null);
    /* access modifiers changed from: private */
    public static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    /* access modifiers changed from: private */
    public long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    /* access modifiers changed from: private */
    public final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    /* access modifiers changed from: private */
    public long degradedPongsReceived;
    /* access modifiers changed from: private */
    public long intervalPingsSent;
    /* access modifiers changed from: private */
    public long intervalPongsReceived;
    /* access modifiers changed from: private */
    public boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    /* access modifiers changed from: private */
    public final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    /* access modifiers changed from: private */
    public final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final TaskRunner taskRunner;
    /* access modifiers changed from: private */
    public long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    /* access modifiers changed from: private */
    public final TaskQueue writerQueue;

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        private int pingIntervalMillis;
        private PushObserver pushObserver = PushObserver.CANCEL;
        public C10608g sink;
        public Socket socket;
        public C10615h source;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner2) {
            C10457l.m35320e(taskRunner2, "taskRunner");
            this.client = z;
            this.taskRunner = taskRunner2;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket2, String str, C10615h hVar, C10608g gVar, int i, Object obj) {
            if ((i & 2) != 0) {
                str = Util.peerName(socket2);
            }
            if ((i & 4) != 0) {
                hVar = C10625q.m36156d(C10625q.m36164l(socket2));
            }
            if ((i & 8) != 0) {
                gVar = C10625q.m36155c(C10625q.m36160h(socket2));
            }
            return builder.socket(socket2, str, hVar, gVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str == null) {
                C10457l.m35332q("connectionName");
            }
            return str;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final C10608g getSink$okhttp() {
            C10608g gVar = this.sink;
            if (gVar == null) {
                C10457l.m35332q("sink");
            }
            return gVar;
        }

        public final Socket getSocket$okhttp() {
            Socket socket2 = this.socket;
            if (socket2 == null) {
                C10457l.m35332q("socket");
            }
            return socket2;
        }

        public final C10615h getSource$okhttp() {
            C10615h hVar = this.source;
            if (hVar == null) {
                C10457l.m35332q("source");
            }
            return hVar;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener2) {
            C10457l.m35320e(listener2, "listener");
            this.listener = listener2;
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver2) {
            C10457l.m35320e(pushObserver2, "pushObserver");
            this.pushObserver = pushObserver2;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            C10457l.m35320e(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener2) {
            C10457l.m35320e(listener2, "<set-?>");
            this.listener = listener2;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver2) {
            C10457l.m35320e(pushObserver2, "<set-?>");
            this.pushObserver = pushObserver2;
        }

        public final void setSink$okhttp(C10608g gVar) {
            C10457l.m35320e(gVar, "<set-?>");
            this.sink = gVar;
        }

        public final void setSocket$okhttp(Socket socket2) {
            C10457l.m35320e(socket2, "<set-?>");
            this.socket = socket2;
        }

        public final void setSource$okhttp(C10615h hVar) {
            C10457l.m35320e(hVar, "<set-?>");
            this.source = hVar;
        }

        public final Builder socket(Socket socket2) {
            return socket$default(this, socket2, (String) null, (C10615h) null, (C10608g) null, 14, (Object) null);
        }

        public final Builder socket(Socket socket2, String str) {
            return socket$default(this, socket2, str, (C10615h) null, (C10608g) null, 12, (Object) null);
        }

        public final Builder socket(Socket socket2, String str, C10615h hVar) {
            return socket$default(this, socket2, str, hVar, (C10608g) null, 8, (Object) null);
        }

        public final Builder socket(Socket socket2, String str, C10615h hVar, C10608g gVar) {
            StringBuilder sb;
            C10457l.m35320e(socket2, "socket");
            C10457l.m35320e(str, "peerName");
            C10457l.m35320e(hVar, "source");
            C10457l.m35320e(gVar, "sink");
            this.socket = socket2;
            if (this.client) {
                sb = new StringBuilder();
                sb.append(Util.okHttpName);
                sb.append(' ');
            } else {
                sb = new StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            this.connectionName = sb.toString();
            this.source = hVar;
            this.sink = gVar;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion((C10452g) null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C10452g gVar) {
                this();
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            C10457l.m35320e(http2Connection, "connection");
            C10457l.m35320e(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    public final class ReaderRunnable implements Http2Reader.Handler, C10419a<C10323s> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            C10457l.m35320e(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        public void ackSettings() {
        }

        public void alternateService(int i, String str, C10616i iVar, String str2, int i2, long j) {
            C10457l.m35320e(str, "origin");
            C10457l.m35320e(iVar, "protocol");
            C10457l.m35320e(str2, "host");
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void applyAndAckSettings(boolean r22, okhttp3.internal.http2.Settings r23) {
            /*
                r21 = this;
                r12 = r21
                r0 = r23
                java.lang.String r1 = "settings"
                p455g.p470y.p472d.C10457l.m35320e(r0, r1)
                g.y.d.u r13 = new g.y.d.u
                r13.<init>()
                g.y.d.v r14 = new g.y.d.v
                r14.<init>()
                g.y.d.v r15 = new g.y.d.v
                r15.<init>()
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0
                okhttp3.internal.http2.Http2Writer r16 = r1.getWriter()
                monitor-enter(r16)
                okhttp3.internal.http2.Http2Connection r11 = r12.this$0     // Catch:{ all -> 0x010a }
                monitor-enter(r11)     // Catch:{ all -> 0x010a }
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Settings r1 = r1.getPeerSettings()     // Catch:{ all -> 0x0105 }
                if (r22 == 0) goto L_0x002c
                r2 = r0
                goto L_0x0039
            L_0x002c:
                okhttp3.internal.http2.Settings r2 = new okhttp3.internal.http2.Settings     // Catch:{ all -> 0x0105 }
                r2.<init>()     // Catch:{ all -> 0x0105 }
                r2.merge(r1)     // Catch:{ all -> 0x0105 }
                r2.merge(r0)     // Catch:{ all -> 0x0105 }
                g.s r3 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0105 }
            L_0x0039:
                r15.f27625f = r2     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch:{ all -> 0x0105 }
                int r2 = r2.getInitialWindowSize()     // Catch:{ all -> 0x0105 }
                long r2 = (long) r2     // Catch:{ all -> 0x0105 }
                int r1 = r1.getInitialWindowSize()     // Catch:{ all -> 0x0105 }
                long r4 = (long) r1     // Catch:{ all -> 0x0105 }
                long r2 = r2 - r4
                r13.f27624f = r2     // Catch:{ all -> 0x0105 }
                r10 = 0
                r8 = 0
                int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x007b
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch:{ all -> 0x0105 }
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch:{ all -> 0x0105 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0105 }
                if (r1 == 0) goto L_0x005e
                goto L_0x007b
            L_0x005e:
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch:{ all -> 0x0105 }
                java.util.Map r1 = r1.getStreams$okhttp()     // Catch:{ all -> 0x0105 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Http2Stream[] r2 = new okhttp3.internal.http2.Http2Stream[r10]     // Catch:{ all -> 0x0105 }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0105 }
                if (r1 == 0) goto L_0x0073
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1     // Catch:{ all -> 0x0105 }
                goto L_0x007c
            L_0x0073:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0105 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x0105 }
                throw r0     // Catch:{ all -> 0x0105 }
            L_0x007b:
                r1 = 0
            L_0x007c:
                r14.f27625f = r1     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch:{ all -> 0x0105 }
                T r2 = r15.f27625f     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch:{ all -> 0x0105 }
                r1.setPeerSettings(r2)     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch:{ all -> 0x0105 }
                okhttp3.internal.concurrent.TaskQueue r7 = r1.settingsListenerQueue     // Catch:{ all -> 0x0105 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0105 }
                r1.<init>()     // Catch:{ all -> 0x0105 }
                okhttp3.internal.http2.Http2Connection r2 = r12.this$0     // Catch:{ all -> 0x0105 }
                java.lang.String r2 = r2.getConnectionName$okhttp()     // Catch:{ all -> 0x0105 }
                r1.append(r2)     // Catch:{ all -> 0x0105 }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x0105 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0105 }
                r5 = 1
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 r6 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x0105 }
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r15
                r8 = r22
                r9 = r23
                r19 = 0
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0103 }
                r1 = r17
                r0 = r18
                r2 = 0
                r0.schedule(r1, r2)     // Catch:{ all -> 0x0103 }
                g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0103 }
                monitor-exit(r20)     // Catch:{ all -> 0x010a }
                okhttp3.internal.http2.Http2Connection r0 = r12.this$0     // Catch:{ IOException -> 0x00d8 }
                okhttp3.internal.http2.Http2Writer r0 = r0.getWriter()     // Catch:{ IOException -> 0x00d8 }
                T r1 = r15.f27625f     // Catch:{ IOException -> 0x00d8 }
                okhttp3.internal.http2.Settings r1 = (okhttp3.internal.http2.Settings) r1     // Catch:{ IOException -> 0x00d8 }
                r0.applyAndAckSettings(r1)     // Catch:{ IOException -> 0x00d8 }
                goto L_0x00de
            L_0x00d8:
                r0 = move-exception
                okhttp3.internal.http2.Http2Connection r1 = r12.this$0     // Catch:{ all -> 0x010a }
                r1.failConnection(r0)     // Catch:{ all -> 0x010a }
            L_0x00de:
                g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x010a }
                monitor-exit(r16)
                T r0 = r14.f27625f
                r1 = r0
                okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1
                if (r1 == 0) goto L_0x0102
                okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0
                p455g.p470y.p472d.C10457l.m35317b(r0)
                int r1 = r0.length
                r10 = 0
            L_0x00ef:
                if (r10 >= r1) goto L_0x0102
                r2 = r0[r10]
                monitor-enter(r2)
                long r3 = r13.f27624f     // Catch:{ all -> 0x00ff }
                r2.addBytesToWriteWindow(r3)     // Catch:{ all -> 0x00ff }
                g.s r3 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00ff }
                monitor-exit(r2)
                int r10 = r10 + 1
                goto L_0x00ef
            L_0x00ff:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0102:
                return
            L_0x0103:
                r0 = move-exception
                goto L_0x0108
            L_0x0105:
                r0 = move-exception
                r20 = r11
            L_0x0108:
                monitor-exit(r20)     // Catch:{ all -> 0x010a }
                throw r0     // Catch:{ all -> 0x010a }
            L_0x010a:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.applyAndAckSettings(boolean, okhttp3.internal.http2.Settings):void");
        }

        public void data(boolean z, int i, C10615h hVar, int i2) {
            C10457l.m35320e(hVar, "source");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, hVar, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                hVar.mo26358l(j);
                return;
            }
            stream.receiveData(hVar, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        public void goAway(int i, ErrorCode errorCode, C10616i iVar) {
            int i2;
            Http2Stream[] http2StreamArr;
            C10457l.m35320e(errorCode, "errorCode");
            C10457l.m35320e(iVar, "debugData");
            iVar.mo26420Y();
            synchronized (this.this$0) {
                Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2StreamArr = (Http2Stream[]) array;
                    this.this$0.isShutdown = true;
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        public void headers(boolean z, int i, int i2, List<Header> list) {
            boolean z2 = z;
            int i3 = i;
            List<Header> list2 = list;
            C10457l.m35320e(list2, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i3)) {
                this.this$0.pushHeadersLater$okhttp(i3, list2, z2);
                return;
            }
            synchronized (this.this$0) {
                Http2Stream stream = this.this$0.getStream(i3);
                if (stream != null) {
                    C10323s sVar = C10323s.f27547a;
                    stream.receiveHeaders(Util.toHeaders(list), z2);
                } else if (!this.this$0.isShutdown) {
                    if (i3 > this.this$0.getLastGoodStreamId$okhttp()) {
                        if (i3 % 2 != this.this$0.getNextStreamId$okhttp() % 2) {
                            Http2Stream http2Stream = new Http2Stream(i, this.this$0, false, z, Util.toHeaders(list));
                            this.this$0.setLastGoodStreamId$okhttp(i3);
                            this.this$0.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                            String str = this.this$0.getConnectionName$okhttp() + '[' + i3 + "] onStream";
                            this.this$0.taskRunner.newQueue().schedule(new C10870xe89ff7cd(str, true, str, true, http2Stream, this, stream, i, list, z), 0);
                        }
                    }
                }
            }
        }

        public void invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    this.this$0.close$okhttp(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        this.this$0.close$okhttp(errorCode3, errorCode3, e);
                        Util.closeQuietly((Closeable) this.reader);
                    } catch (Throwable th) {
                        th = th;
                        this.this$0.close$okhttp(errorCode, errorCode2, e);
                        Util.closeQuietly((Closeable) this.reader);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                this.this$0.close$okhttp(errorCode32, errorCode32, e);
                Util.closeQuietly((Closeable) this.reader);
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e);
                Util.closeQuietly((Closeable) this.reader);
                throw th;
            }
            Util.closeQuietly((Closeable) this.reader);
        }

        public void ping(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.this$0) {
                    if (i == 1) {
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.intervalPongsReceived = http2Connection.intervalPongsReceived + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            Http2Connection http2Connection2 = this.this$0;
                            http2Connection2.awaitPongsReceived = http2Connection2.awaitPongsReceived + 1;
                            Http2Connection http2Connection3 = this.this$0;
                            if (http2Connection3 != null) {
                                http2Connection3.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        C10323s sVar = C10323s.f27547a;
                    } else {
                        Http2Connection http2Connection4 = this.this$0;
                        http2Connection4.degradedPongsReceived = http2Connection4.degradedPongsReceived + 1;
                    }
                }
                return;
            }
            String str = this.this$0.getConnectionName$okhttp() + " ping";
            this.this$0.writerQueue.schedule(new Http2Connection$ReaderRunnable$ping$$inlined$execute$1(str, true, str, true, this, i, i2), 0);
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        public void pushPromise(int i, int i2, List<Header> list) {
            C10457l.m35320e(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        public void rstStream(int i, ErrorCode errorCode) {
            C10457l.m35320e(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        public void settings(boolean z, Settings settings) {
            C10457l.m35320e(settings, "settings");
            String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            this.this$0.writerQueue.schedule(new Http2Connection$ReaderRunnable$settings$$inlined$execute$1(str, true, str, true, this, z, settings), 0);
        }

        public void windowUpdate(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = this.this$0;
                synchronized (obj2) {
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    Http2Connection http2Connection2 = this.this$0;
                    if (http2Connection2 != null) {
                        http2Connection2.notifyAll();
                        C10323s sVar = C10323s.f27547a;
                        obj = obj2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
            } else {
                Http2Stream stream = this.this$0.getStream(i);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(j);
                        C10323s sVar2 = C10323s.f27547a;
                        obj = stream;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        C10457l.m35320e(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        C10323s sVar = C10323s.f27547a;
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = (long) settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) builder.getPingIntervalMillis$okhttp());
            String str = connectionName$okhttp + " ping";
            newQueue.schedule(new Http2Connection$$special$$inlined$schedule$1(str, str, this, nanos), nanos);
        }
    }

    /* access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0084 }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0081 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0081 }
            r10.shutdown(r0)     // Catch:{ all -> 0x0081 }
        L_0x0013:
            boolean r0 = r10.isShutdown     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x007b
            int r8 = r10.nextStreamId     // Catch:{ all -> 0x0081 }
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch:{ all -> 0x0081 }
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x0081 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0081 }
            r0 = 1
            if (r13 == 0) goto L_0x0041
            long r1 = r10.writeBytesTotal     // Catch:{ all -> 0x0081 }
            long r3 = r10.writeBytesMaximum     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            long r1 = r9.getWriteBytesTotal()     // Catch:{ all -> 0x0081 }
            long r3 = r9.getWriteBytesMaximum()     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = 1
        L_0x0042:
            boolean r1 = r9.isOpen()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0051
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r10.streams     // Catch:{ all -> 0x0081 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0081 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0081 }
        L_0x0051:
            g.s r1 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x005c
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch:{ all -> 0x0084 }
            r11.headers(r6, r8, r12)     // Catch:{ all -> 0x0084 }
            goto L_0x0066
        L_0x005c:
            boolean r1 = r10.client     // Catch:{ all -> 0x0084 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch:{ all -> 0x0084 }
            r0.pushPromise(r11, r8, r12)     // Catch:{ all -> 0x0084 }
        L_0x0066:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x006e
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L_0x006e:
            return r9
        L_0x006f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0084 }
            r12.<init>(r11)     // Catch:{ all -> 0x0084 }
            throw r12     // Catch:{ all -> 0x0084 }
        L_0x007b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0081 }
            r11.<init>()     // Catch:{ all -> 0x0081 }
            throw r11     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r11     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner2 = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner2);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|45|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close$okhttp(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            p455g.p470y.p472d.C10457l.m35320e(r4, r0)
            java.lang.String r0 = "streamCode"
            p455g.p470y.p472d.C10457l.m35320e(r5, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            p455g.p470y.p472d.C10457l.m35319d(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.shutdown(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch:{ all -> 0x0099 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0099 }
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0067
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4     // Catch:{ all -> 0x0099 }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x0099 }
            r0.clear()     // Catch:{ all -> 0x0099 }
            goto L_0x006f
        L_0x0067:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ all -> 0x0099 }
        L_0x006f:
            g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length
        L_0x0075:
            if (r1 >= r0) goto L_0x007f
            r2 = r4[r1]
            r2.close(r5, r6)     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x007f:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch:{ IOException -> 0x0084 }
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.net.Socket r4 = r3.socket     // Catch:{ IOException -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.writerQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.pushQueue
            r4.shutdown()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.settingsListenerQueue
            r4.shutdown()
            return
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.close$okhttp(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || j < this.degradedPongDeadlineNs;
    }

    public final Http2Stream newStream(List<Header> list, boolean z) {
        C10457l.m35320e(list, "requestHeaders");
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i, C10615h hVar, int i2, boolean z) {
        C10457l.m35320e(hVar, "source");
        C10603f fVar = new C10603f();
        long j = (long) i2;
        hVar.mo26359l0(j);
        hVar.read(fVar, j);
        String str = this.connectionName + '[' + i + "] onData";
        this.pushQueue.schedule(new Http2Connection$pushDataLater$$inlined$execute$1(str, true, str, true, this, i, fVar, i2, z), 0);
    }

    public final void pushHeadersLater$okhttp(int i, List<Header> list, boolean z) {
        C10457l.m35320e(list, "requestHeaders");
        String str = this.connectionName + '[' + i + "] onHeaders";
        this.pushQueue.schedule(new Http2Connection$pushHeadersLater$$inlined$execute$1(str, true, str, true, this, i, list, z), 0);
    }

    public final void pushRequestLater$okhttp(int i, List<Header> list) {
        C10457l.m35320e(list, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            String str = this.connectionName + '[' + i + "] onRequest";
            this.pushQueue.schedule(new Http2Connection$pushRequestLater$$inlined$execute$1(str, true, str, true, this, i, list), 0);
        }
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
        C10457l.m35320e(errorCode, "errorCode");
        String str = this.connectionName + '[' + i + "] onReset";
        this.pushQueue.schedule(new Http2Connection$pushResetLater$$inlined$execute$1(str, true, str, true, this, i, errorCode), 0);
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) {
        C10457l.m35320e(list, "requestHeaders");
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j >= j2) {
                this.degradedPingsSent = j2 + 1;
                this.degradedPongDeadlineNs = System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
                C10323s sVar = C10323s.f27547a;
                String str = this.connectionName + " ping";
                this.writerQueue.schedule(new Http2Connection$sendDegradedPingLater$$inlined$execute$1(str, true, str, true, this), 0);
            }
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        C10457l.m35320e(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        C10457l.m35320e(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) {
        C10457l.m35320e(errorCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.isShutdown = true;
                    int i = this.lastGoodStreamId;
                    C10323s sVar = C10323s.f27547a;
                    this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
                }
            }
        }
    }

    public final void start() {
        start$default(this, false, (TaskRunner) null, 3, (Object) null);
    }

    public final void start(boolean z) {
        start$default(this, z, (TaskRunner) null, 2, (Object) null);
    }

    public final void start(boolean z, TaskRunner taskRunner2) {
        C10457l.m35320e(taskRunner2, "taskRunner");
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            }
        }
        TaskQueue newQueue = taskRunner2.newQueue();
        String str = this.connectionName;
        newQueue.schedule(new TaskQueue$execute$1(this.readerRunnable, str, true, str, true), 0);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.writer.maxDataLength());
        r6 = (long) r3;
        r8.writeBytesTotal += r6;
        r4 = p455g.C10323s.f27547a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeData(int r9, boolean r10, p493i.C10603f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x006c
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.writeBytesTotal     // Catch:{ InterruptedException -> 0x005d }
            long r5 = r8.writeBytesMaximum     // Catch:{ InterruptedException -> 0x005d }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r8.streams     // Catch:{ InterruptedException -> 0x005d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005d }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005d }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005d }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005d }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005d }
            throw r9     // Catch:{ InterruptedException -> 0x005d }
        L_0x0032:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch:{ all -> 0x005b }
            int r4 = (int) r3     // Catch:{ all -> 0x005b }
            okhttp3.internal.http2.Http2Writer r3 = r8.writer     // Catch:{ all -> 0x005b }
            int r3 = r3.maxDataLength()     // Catch:{ all -> 0x005b }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x005b }
            long r4 = r8.writeBytesTotal     // Catch:{ all -> 0x005b }
            long r6 = (long) r3     // Catch:{ all -> 0x005b }
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch:{ all -> 0x005b }
            g.s r4 = p455g.C10323s.f27547a     // Catch:{ all -> 0x005b }
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L_0x0056
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r4.data(r5, r9, r11, r3)
            goto L_0x000d
        L_0x005b:
            r9 = move-exception
            goto L_0x006a
        L_0x005d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005b }
            r9.interrupt()     // Catch:{ all -> 0x005b }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x005b }
            r9.<init>()     // Catch:{ all -> 0x005b }
            throw r9     // Catch:{ all -> 0x005b }
        L_0x006a:
            monitor-exit(r8)
            throw r9
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, i.f, long):void");
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) {
        C10457l.m35320e(list, "alternating");
        this.writer.headers(z, i, list);
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) {
        C10457l.m35320e(errorCode, "statusCode");
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        C10457l.m35320e(errorCode, "errorCode");
        String str = this.connectionName + '[' + i + "] writeSynReset";
        this.writerQueue.schedule(new Http2Connection$writeSynResetLater$$inlined$execute$1(str, true, str, true, this, i, errorCode), 0);
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        String str = this.connectionName + '[' + i + "] windowUpdate";
        this.writerQueue.schedule(new Http2Connection$writeWindowUpdateLater$$inlined$execute$1(str, true, str, true, this, i, j), 0);
    }
}
