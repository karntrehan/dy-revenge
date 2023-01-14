package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import p455g.C10323s;
import p455g.p470y.p472d.C10457l;
import p493i.C10593d;

public final class RealCall implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed = new AtomicBoolean();
    private boolean expectMoreExchanges = true;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    /* access modifiers changed from: private */
    public final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost = new AtomicInteger(0);
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            C10457l.m35320e(callback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = callback;
        }

        public final void executeOn(ExecutorService executorService) {
            C10457l.m35320e(executorService, "executorService");
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (!Util.assertionsEnabled || !Thread.holdsLock(dispatcher)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                } catch (Throwable th) {
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C10457l.m35319d(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            C10457l.m35320e(asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.internal.connection.RealCall r1 = r6.this$0
                java.lang.String r1 = r1.redactedUrl$okhttp()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p455g.p470y.p472d.C10457l.m35319d(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                okhttp3.internal.connection.RealCall r3 = r6.this$0     // Catch:{ all -> 0x00c9 }
                okhttp3.internal.connection.RealCall$timeout$1 r3 = r3.timeout     // Catch:{ all -> 0x00c9 }
                r3.enter()     // Catch:{ all -> 0x00c9 }
                okhttp3.internal.connection.RealCall r3 = r6.this$0     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                okhttp3.Response r0 = r3.getResponseWithInterceptorChain$okhttp()     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                r3 = 1
                okhttp3.Callback r4 = r6.responseCallback     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                okhttp3.internal.connection.RealCall r5 = r6.this$0     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                okhttp3.internal.connection.RealCall r0 = r6.this$0     // Catch:{ all -> 0x00c9 }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x00c9 }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x00c9 }
            L_0x0049:
                r0.finished$okhttp((okhttp3.internal.connection.RealCall.AsyncCall) r6)     // Catch:{ all -> 0x00c9 }
                goto L_0x00b7
            L_0x004d:
                r0 = move-exception
                goto L_0x0054
            L_0x004f:
                r0 = move-exception
                goto L_0x0081
            L_0x0051:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0054:
                okhttp3.internal.connection.RealCall r4 = r6.this$0     // Catch:{ all -> 0x007c }
                r4.cancel()     // Catch:{ all -> 0x007c }
                if (r3 != 0) goto L_0x007b
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                r4.append(r0)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r3.<init>(r4)     // Catch:{ all -> 0x007c }
                p455g.C10248b.m34834a(r3, r0)     // Catch:{ all -> 0x007c }
                okhttp3.Callback r4 = r6.responseCallback     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.RealCall r5 = r6.this$0     // Catch:{ all -> 0x007c }
                r4.onFailure(r5, r3)     // Catch:{ all -> 0x007c }
            L_0x007b:
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                goto L_0x00bb
            L_0x007e:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0081:
                if (r3 == 0) goto L_0x00a5
                okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x007c }
                okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.RealCall r5 = r6.this$0     // Catch:{ all -> 0x007c }
                java.lang.String r5 = r5.toLoggableString()     // Catch:{ all -> 0x007c }
                r4.append(r5)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r5 = 4
                r3.log(r4, r5, r0)     // Catch:{ all -> 0x007c }
                goto L_0x00ac
            L_0x00a5:
                okhttp3.Callback r3 = r6.responseCallback     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.RealCall r4 = r6.this$0     // Catch:{ all -> 0x007c }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x007c }
            L_0x00ac:
                okhttp3.internal.connection.RealCall r0 = r6.this$0     // Catch:{ all -> 0x00c9 }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x00c9 }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x00c9 }
                goto L_0x0049
            L_0x00b7:
                r1.setName(r2)
                return
            L_0x00bb:
                okhttp3.internal.connection.RealCall r3 = r6.this$0     // Catch:{ all -> 0x00c9 }
                okhttp3.OkHttpClient r3 = r3.getClient()     // Catch:{ all -> 0x00c9 }
                okhttp3.Dispatcher r3 = r3.dispatcher()     // Catch:{ all -> 0x00c9 }
                r3.finished$okhttp((okhttp3.internal.connection.RealCall.AsyncCall) r6)     // Catch:{ all -> 0x00c9 }
                throw r0     // Catch:{ all -> 0x00c9 }
            L_0x00c9:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.AsyncCall.run():void");
        }
    }

    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            C10457l.m35320e(realCall, "referent");
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        C10457l.m35320e(okHttpClient, "client");
        C10457l.m35320e(request, "originalRequest");
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        RealCall$timeout$1 realCall$timeout$1 = new RealCall$timeout$1(this);
        realCall$timeout$1.timeout((long) okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        C10323s sVar = C10323s.f27547a;
        this.timeout = realCall$timeout$1;
    }

    private final <E extends IOException> E callDone(E e) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = Util.assertionsEnabled;
        if (!z || !Thread.holdsLock(this)) {
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                if (!z || !Thread.holdsLock(realConnection)) {
                    synchronized (realConnection) {
                        releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
                    }
                    if (this.connection == null) {
                        if (releaseConnectionNoEvents$okhttp != null) {
                            Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                        }
                        this.eventListener.connectionReleased(this, realConnection);
                    } else {
                        if (!(releaseConnectionNoEvents$okhttp == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    C10457l.m35319d(currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(realConnection);
                    throw new AssertionError(sb.toString());
                }
            }
            E timeoutExit = timeoutExit(e);
            if (e != null) {
                EventListener eventListener2 = this.eventListener;
                C10457l.m35317b(timeoutExit);
                eventListener2.callFailed(this, timeoutExit);
            } else {
                this.eventListener.callEnd(this);
            }
            return timeoutExit;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        C10457l.m35319d(currentThread2, "Thread.currentThread()");
        sb2.append(currentThread2.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        C10457l.m35320e(realConnection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            if (this.connection == null) {
                this.connection = realConnection;
                realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnection);
        throw new AssertionError(sb.toString());
    }

    public void cancel() {
        if (!this.canceled) {
            this.canceled = true;
            Exchange exchange2 = this.exchange;
            if (exchange2 != null) {
                exchange2.cancel();
            }
            RealConnection realConnection = this.connectionToCancel;
            if (realConnection != null) {
                realConnection.cancel();
            }
            this.eventListener.canceled(this);
        }
    }

    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    public void enqueue(Callback callback) {
        C10457l.m35320e(callback, "responseCallback");
        if (this.executed.compareAndSet(false, true)) {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean z) {
        C10457l.m35320e(request, "request");
        if (this.interceptorScopedExchange == null) {
            synchronized (this) {
                if (!(!this.responseBodyOpen)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.requestBodyOpen) {
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            this.timeout.enter();
            callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return getResponseWithInterceptorChain$okhttp();
            } finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange2;
        synchronized (this) {
            if (this.expectMoreExchanges) {
                C10323s sVar = C10323s.f27547a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (exchange2 = this.exchange) != null) {
            exchange2.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r10.client
            java.util.List r0 = r0.interceptors()
            boolean unused = p455g.p460t.C10355q.m35149r(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r10.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r10.client
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r10.client
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r10.forWebSocket
            if (r0 != 0) goto L_0x0046
            okhttp3.OkHttpClient r0 = r10.client
            java.util.List r0 = r0.networkInterceptors()
            boolean unused = p455g.p460t.C10355q.m35149r(r2, r0)
        L_0x0046:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r10.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r10.originalRequest
            okhttp3.OkHttpClient r0 = r10.client
            int r6 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r10.client
            int r7 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r10.client
            int r8 = r0.writeTimeoutMillis()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r10.originalRequest     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            okhttp3.Response r2 = r9.proceed(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            boolean r3 = r10.isCanceled()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x007f
            r10.noMoreExchanges$okhttp(r1)
            return r2
        L_0x007f:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            throw r2     // Catch:{ IOException -> 0x008c, all -> 0x008a }
        L_0x008a:
            r2 = move-exception
            goto L_0x00a0
        L_0x008c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.noMoreExchanges$okhttp(r0)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x009c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a0:
            if (r0 != 0) goto L_0x00a5
            r10.noMoreExchanges$okhttp(r1)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.getResponseWithInterceptorChain$okhttp():okhttp3.Response");
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain realInterceptorChain) {
        C10457l.m35320e(realInterceptorChain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.responseBodyOpen)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.requestBodyOpen) {
                C10323s sVar = C10323s.f27547a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        C10457l.m35317b(exchangeFinder2);
        Exchange exchange2 = new Exchange(this, this.eventListener, exchangeFinder2, exchangeFinder2.find(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange2;
        this.exchange = exchange2;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange2;
        }
        throw new IOException("Canceled");
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003e A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003f A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            boolean r3 = p455g.p470y.p472d.C10457l.m35316a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.requestBodyOpen     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x005a
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.responseBodyOpen     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.requestBodyOpen = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.responseBodyOpen = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.requestBodyOpen     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.responseBodyOpen     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.responseBodyOpen     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.expectMoreExchanges     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            g.s r4 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0052
            r3 = 0
            r2.exchange = r3
            okhttp3.internal.connection.RealConnection r3 = r2.connection
            if (r3 == 0) goto L_0x0052
            r3.incrementSuccessCount$okhttp()
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            java.io.IOException r3 = r2.callDone(r6)
            return r3
        L_0x0059:
            return r6
        L_0x005a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z = true;
                }
            }
            C10323s sVar = C10323s.f27547a;
        }
        return z ? callDone(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        C10457l.m35317b(realConnection);
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            List<Reference<RealCall>> calls = realConnection.getCalls();
            Iterator<Reference<RealCall>> it = calls.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C10457l.m35316a((RealCall) it.next().get(), this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                calls.remove(i);
                this.connection = null;
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs$okhttp(System.nanoTime());
                    if (this.connectionPool.connectionBecameIdle(realConnection)) {
                        return realConnection.socket();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(realConnection);
        throw new AssertionError(sb.toString());
    }

    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        C10457l.m35317b(exchangeFinder2);
        return exchangeFinder2.retryAfterFailure();
    }

    public final void setConnectionToCancel(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public C10593d timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            this.timeout.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
