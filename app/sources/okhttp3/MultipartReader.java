package okhttp3;

import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10616i;
import p493i.C10625q;
import p493i.C10628t;

public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion((C10452g) null);
    /* access modifiers changed from: private */
    public static final C10628t afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C10616i crlfDashDashBoundary;
    /* access modifiers changed from: private */
    public PartSource currentPart;
    private final C10616i dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    /* access modifiers changed from: private */
    public final C10615h source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public final C10628t getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    public static final class Part implements Closeable {
        private final C10615h body;
        private final Headers headers;

        public Part(Headers headers2, C10615h hVar) {
            C10457l.m35320e(headers2, "headers");
            C10457l.m35320e(hVar, "body");
            this.headers = headers2;
            this.body = hVar;
        }

        public final C10615h body() {
            return this.body;
        }

        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    private final class PartSource implements C10598d0 {
        private final C10600e0 timeout = new C10600e0();

        public PartSource() {
        }

        public void close() {
            if (C10457l.m35316a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        public long read(C10603f fVar, long j) {
            C10603f fVar2 = fVar;
            long j2 = j;
            C10457l.m35320e(fVar2, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (C10457l.m35316a(MultipartReader.this.currentPart, this)) {
                C10600e0 timeout2 = MultipartReader.this.source.timeout();
                C10600e0 e0Var = this.timeout;
                long timeoutNanos = timeout2.timeoutNanos();
                long a = C10600e0.Companion.mo26306a(e0Var.timeoutNanos(), timeout2.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout2.timeout(a, timeUnit);
                if (timeout2.hasDeadline()) {
                    long deadlineNanoTime = timeout2.deadlineNanoTime();
                    if (e0Var.hasDeadline()) {
                        timeout2.deadlineNanoTime(Math.min(timeout2.deadlineNanoTime(), e0Var.deadlineNanoTime()));
                    }
                    try {
                        long access$currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(j2);
                        long read = access$currentPartBytesRemaining == 0 ? -1 : MultipartReader.this.source.read(fVar2, access$currentPartBytesRemaining);
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (e0Var.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        return read;
                    } catch (Throwable th) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (e0Var.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th;
                    }
                } else {
                    if (e0Var.hasDeadline()) {
                        timeout2.deadlineNanoTime(e0Var.deadlineNanoTime());
                    }
                    try {
                        long access$currentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(j2);
                        long read2 = access$currentPartBytesRemaining2 == 0 ? -1 : MultipartReader.this.source.read(fVar2, access$currentPartBytesRemaining2);
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (e0Var.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        return read2;
                    } catch (Throwable th2) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (e0Var.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public C10600e0 timeout() {
            return this.timeout;
        }
    }

    static {
        C10628t.C10629a aVar = C10628t.f28070o;
        C10616i.C10617a aVar2 = C10616i.f28050o;
        afterBoundaryOptions = aVar.mo26450d(aVar2.mo26428d("\r\n"), aVar2.mo26428d("--"), aVar2.mo26428d(" "), aVar2.mo26428d("\t"));
    }

    public MultipartReader(C10615h hVar, String str) {
        C10457l.m35320e(hVar, "source");
        C10457l.m35320e(str, "boundary");
        this.source = hVar;
        this.boundary = str;
        this.dashDashBoundary = new C10603f().mo26320K("--").mo26320K(str).mo26335T();
        this.crlfDashDashBoundary = new C10603f().mo26320K("\r\n--").mo26320K(str).mo26335T();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            i.h r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L_0x001b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L_0x001b
            r2.<init>(r0, r3)
            return
        L_0x001b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }

    /* access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.mo26359l0((long) this.crlfDashDashBoundary.mo26420Y());
        long w = this.source.mo26350d().mo26382w(this.crlfDashDashBoundary);
        if (w == -1) {
            w = (this.source.mo26350d().size() - ((long) this.crlfDashDashBoundary.mo26420Y())) + 1;
        }
        return Math.min(j, w);
    }

    public final String boundary() {
        return this.boundary;
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            this.currentPart = null;
            this.source.close();
        }
    }

    public final Part nextPart() {
        C10615h hVar;
        C10616i iVar;
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.noMoreParts) {
            return null;
        } else {
            if (this.partCount != 0 || !this.source.mo26323M(0, this.dashDashBoundary)) {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.mo26358l(currentPartBytesRemaining);
                }
                hVar = this.source;
                iVar = this.crlfDashDashBoundary;
            } else {
                hVar = this.source;
                iVar = this.dashDashBoundary;
            }
            hVar.mo26358l((long) iVar.mo26420Y());
            boolean z = false;
            while (true) {
                int t0 = this.source.mo26377t0(afterBoundaryOptions);
                if (t0 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (t0 == 0) {
                    this.partCount++;
                    Headers readHeaders = new HeadersReader(this.source).readHeaders();
                    PartSource partSource = new PartSource();
                    this.currentPart = partSource;
                    return new Part(readHeaders, C10625q.m36156d(partSource));
                } else if (t0 != 1) {
                    if (t0 == 2 || t0 == 3) {
                        z = true;
                    }
                } else if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                } else {
                    throw new ProtocolException("expected at least 1 part");
                }
            }
        }
    }
}
