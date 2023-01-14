package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10590b0;
import p493i.C10593d;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10615h;

public final class Http2Stream {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* renamed from: id */
    private final int f28431id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout = new StreamTimeout();
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout = new StreamTimeout();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    public final class FramingSink implements C10590b0 {
        private boolean closed;
        private boolean finished;
        private final C10603f sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new C10603f();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, C10452g gVar) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX INFO: finally extract failed */
        private final void emitFrame(boolean z) {
            long min;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout$okhttp().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    try {
                        Http2Stream.this.waitForIo$okhttp();
                    } catch (Throwable th) {
                        Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                min = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.size());
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z2 = z && min == this.sendBuffer.size() && Http2Stream.this.getErrorCode$okhttp() == null;
                C10323s sVar = C10323s.f27547a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.this$0.getSink$okhttp().finished != false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.trailers == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            if (r4 == false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            emitFrame(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = r10.this$0.getConnection();
            r2 = r10.this$0.getId();
            r4 = r10.trailers;
            p455g.p470y.p472d.C10457l.m35317b(r4);
            r0.writeHeaders$okhttp(r2, r1, okhttp3.internal.Util.toHeaderList(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
            if (r0 == false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
            if (r1 == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
            r10.this$0.getConnection().writeData(r10.this$0.getId(), true, (p493i.C10603f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
            r0 = r10.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            r10.closed = true;
            r1 = p455g.C10323s.f27547a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
            r10.this$0.getConnection().flush();
            r10.this$0.cancelStreamIfNecessary$okhttp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                p455g.p470y.p472d.C10457l.m35319d(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r10.closed     // Catch:{ all -> 0x00da }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x00da }
                okhttp3.internal.http2.ErrorCode r1 = r1.getErrorCode$okhttp()     // Catch:{ all -> 0x00da }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                g.s r4 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00da }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto L_0x00c0
                i.f r0 = r10.sendBuffer
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = 1
                goto L_0x006b
            L_0x006a:
                r0 = 0
            L_0x006b:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L_0x0071
                r4 = 1
                goto L_0x0072
            L_0x0071:
                r4 = 0
            L_0x0072:
                if (r4 == 0) goto L_0x009b
            L_0x0074:
                i.f r0 = r10.sendBuffer
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r10.emitFrame(r2)
                goto L_0x0074
            L_0x0082:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                p455g.p470y.p472d.C10457l.m35317b(r4)
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r2, r1, r4)
                goto L_0x00c0
            L_0x009b:
                if (r0 == 0) goto L_0x00ab
            L_0x009d:
                i.f r0 = r10.sendBuffer
                long r0 = r0.size()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x00c0
                r10.emitFrame(r3)
                goto L_0x009d
            L_0x00ab:
                if (r1 == 0) goto L_0x00c0
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r5 = r0.getId()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.writeData(r5, r6, r7, r8)
            L_0x00c0:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r10.closed = r3     // Catch:{ all -> 0x00d7 }
                g.s r1 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00d7 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary$okhttp()
                return
            L_0x00d7:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00da:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                synchronized (Http2Stream.this) {
                    Http2Stream.this.checkOutNotClosed$okhttp();
                    C10323s sVar = C10323s.f27547a;
                }
                while (this.sendBuffer.size() > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public C10600e0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        public void write(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(fVar, j);
                while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }
    }

    public final class FramingSource implements C10598d0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final C10603f readBuffer = new C10603f();
        private final C10603f receiveBuffer = new C10603f();
        private Headers trailers;

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        public void close() {
            long size;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.mo26366r();
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream != null) {
                    http2Stream.notifyAll();
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final C10603f getReadBuffer() {
            return this.readBuffer;
        }

        public final C10603f getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX INFO: finally extract failed */
        public long read(C10603f fVar, long j) {
            Throwable th;
            long j2;
            boolean z;
            C10603f fVar2 = fVar;
            long j3 = j;
            C10457l.m35320e(fVar2, "sink");
            if (j3 >= 0) {
                do {
                    th = null;
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.getReadTimeout$okhttp().enter();
                        try {
                            if (Http2Stream.this.getErrorCode$okhttp() != null) {
                                th = Http2Stream.this.getErrorException$okhttp();
                                if (th == null) {
                                    ErrorCode errorCode$okhttp = Http2Stream.this.getErrorCode$okhttp();
                                    C10457l.m35317b(errorCode$okhttp);
                                    th = new StreamResetException(errorCode$okhttp);
                                }
                            }
                            if (!this.closed) {
                                if (this.readBuffer.size() > 0) {
                                    C10603f fVar3 = this.readBuffer;
                                    j2 = fVar3.read(fVar2, Math.min(j3, fVar3.size()));
                                    Http2Stream http2Stream = Http2Stream.this;
                                    http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                                    long readBytesTotal = Http2Stream.this.getReadBytesTotal() - Http2Stream.this.getReadBytesAcknowledged();
                                    if (th == null && readBytesTotal >= ((long) (Http2Stream.this.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                                        Http2Stream.this.getConnection().writeWindowUpdateLater$okhttp(Http2Stream.this.getId(), readBytesTotal);
                                        Http2Stream http2Stream2 = Http2Stream.this;
                                        http2Stream2.setReadBytesAcknowledged$okhttp(http2Stream2.getReadBytesTotal());
                                    }
                                } else if (this.finished || th != null) {
                                    j2 = -1;
                                } else {
                                    Http2Stream.this.waitForIo$okhttp();
                                    j2 = -1;
                                    z = true;
                                    Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                    C10323s sVar = C10323s.f27547a;
                                }
                                z = false;
                                Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                C10323s sVar2 = C10323s.f27547a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                            throw th2;
                        }
                    }
                } while (z);
                if (j2 != -1) {
                    updateConnectionFlowControl(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    C10457l.m35317b(th);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
            }
        }

        public final void receive$okhttp(C10615h hVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C10457l.m35320e(hVar, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                while (j > 0) {
                    synchronized (Http2Stream.this) {
                        z = this.finished;
                        z2 = true;
                        z3 = this.readBuffer.size() + j > this.maxByteCount;
                        C10323s sVar = C10323s.f27547a;
                    }
                    if (z3) {
                        hVar.mo26358l(j);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        hVar.mo26358l(j);
                        return;
                    } else {
                        long read = hVar.read(this.receiveBuffer, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (Http2Stream.this) {
                                if (this.closed) {
                                    j2 = this.receiveBuffer.size();
                                    this.receiveBuffer.mo26366r();
                                } else {
                                    if (this.readBuffer.size() != 0) {
                                        z2 = false;
                                    }
                                    this.readBuffer.mo26330Q(this.receiveBuffer);
                                    if (z2) {
                                        Http2Stream http2Stream2 = Http2Stream.this;
                                        if (http2Stream2 != null) {
                                            http2Stream2.notifyAll();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                updateConnectionFlowControl(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public C10600e0 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    public final class StreamTimeout extends C10593d {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        C10457l.m35320e(http2Connection, "connection");
        this.f28431id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = (long) http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource((long) http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode2, IOException iOException) {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.errorCode != null) {
                    return false;
                }
                if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                    return false;
                }
                this.errorCode = errorCode2;
                this.errorException = iOException;
                notifyAll();
                C10323s sVar = C10323s.f27547a;
                this.connection.removeStream$okhttp(this.f28431id);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z;
        boolean isOpen;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
                isOpen = isOpen();
                C10323s sVar = C10323s.f27547a;
            }
            if (z) {
                close(ErrorCode.CANCEL, (IOException) null);
            } else if (!isOpen) {
                this.connection.removeStream$okhttp(this.f28431id);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    public final void checkOutNotClosed$okhttp() {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        } else if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                C10457l.m35317b(errorCode2);
                th = new StreamResetException(errorCode2);
            }
            throw th;
        }
    }

    public final void close(ErrorCode errorCode2, IOException iOException) {
        C10457l.m35320e(errorCode2, "rstStatusCode");
        if (closeInternal(errorCode2, iOException)) {
            this.connection.writeSynReset$okhttp(this.f28431id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        C10457l.m35320e(errorCode2, "errorCode");
        if (closeInternal(errorCode2, (IOException) null)) {
            this.connection.writeSynResetLater$okhttp(this.f28431id, errorCode2);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        C10457l.m35320e(headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!this.sink.getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.sink.setTrailers(headers);
                    C10323s sVar = C10323s.f27547a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f28431id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p493i.C10590b0 getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.isLocallyInitiated()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():i.b0");
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final C10598d0 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.f28431id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        return (!this.source.getFinished$okhttp() && !this.source.getClosed$okhttp()) || (!this.sink.getFinished() && !this.sink.getClosed()) || !this.hasResponseHeaders;
    }

    public final C10600e0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(C10615h hVar, int i) {
        C10457l.m35320e(hVar, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(hVar, (long) i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            p455g.p470y.p472d.C10457l.m35319d(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch:{ all -> 0x006d }
            r0.setTrailers(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x004b:
            r2.hasResponseHeaders = r1     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x006d }
            r0.add(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch:{ all -> 0x006d }
            r3.setFinished$okhttp(r1)     // Catch:{ all -> 0x006d }
        L_0x0059:
            boolean r3 = r2.isOpen()     // Catch:{ all -> 0x006d }
            r2.notifyAll()     // Catch:{ all -> 0x006d }
            g.s r4 = p455g.C10323s.f27547a     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f28431id
            r3.removeStream$okhttp(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        C10457l.m35320e(errorCode2, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode2) {
        this.errorCode = errorCode2;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r2.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.Headers takeHeaders() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004b }
            r0.enter()     // Catch:{ all -> 0x004b }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0016
            r2.waitForIo$okhttp()     // Catch:{ all -> 0x0044 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004b }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004b }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "headersQueue.removeFirst()"
            p455g.p470y.p472d.C10457l.m35319d(r0, r1)     // Catch:{ all -> 0x004b }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x004b }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.errorException     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004b }
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch:{ all -> 0x004b }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x004b }
            r0.<init>(r1)     // Catch:{ all -> 0x004b }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0044:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch:{ all -> 0x004b }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders():okhttp3.Headers");
    }

    public final synchronized Headers trailers() {
        Headers trailers;
        if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                C10457l.m35317b(errorCode2);
                th = new StreamResetException(errorCode2);
            }
            throw th;
        }
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().mo26390x() && this.source.getReadBuffer().mo26390x()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        return trailers;
    }

    public final void waitForIo$okhttp() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) {
        boolean z3;
        C10457l.m35320e(list, "responseHeaders");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                z3 = true;
                this.hasResponseHeaders = true;
                if (z) {
                    this.sink.setFinished(true);
                }
                C10323s sVar = C10323s.f27547a;
            }
            if (!z2) {
                synchronized (this.connection) {
                    if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                        z3 = false;
                    }
                }
                z2 = z3;
            }
            this.connection.writeHeaders$okhttp(this.f28431id, z, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final C10600e0 writeTimeout() {
        return this.writeTimeout;
    }
}
