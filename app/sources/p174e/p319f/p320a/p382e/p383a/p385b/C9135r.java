package p174e.p319f.p320a.p382e.p383a.p385b;

import java.io.InputStream;

/* renamed from: e.f.a.e.a.b.r */
public final class C9135r extends C9133q {

    /* renamed from: f */
    private final C9133q f25016f;

    /* renamed from: o */
    private final long f25017o;

    /* renamed from: p */
    private final long f25018p;

    public C9135r(C9133q qVar, long j, long j2) {
        this.f25016f = qVar;
        long o = m30419o(j);
        this.f25017o = o;
        this.f25018p = m30419o(o + j2);
    }

    /* renamed from: o */
    private final long m30419o(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f25016f.mo13950a() ? this.f25016f.mo13950a() : j;
    }

    /* renamed from: a */
    public final long mo13950a() {
        return this.f25018p - this.f25017o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo13951b(long j, long j2) {
        long o = m30419o(this.f25017o);
        return this.f25016f.mo13951b(o, m30419o(j2 + o) - o);
    }

    public final void close() {
    }
}
