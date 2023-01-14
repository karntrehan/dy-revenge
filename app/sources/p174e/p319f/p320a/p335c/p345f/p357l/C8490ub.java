package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.l.ub */
final class C8490ub extends C8544xb {

    /* renamed from: f */
    private int f23124f = 0;

    /* renamed from: o */
    private final int f23125o;

    /* renamed from: p */
    final /* synthetic */ C8177dc f23126p;

    C8490ub(C8177dc dcVar) {
        this.f23126p = dcVar;
        this.f23125o = dcVar.mo21692h();
    }

    public final boolean hasNext() {
        return this.f23124f < this.f23125o;
    }

    public final byte zza() {
        int i = this.f23124f;
        if (i < this.f23125o) {
            this.f23124f = i + 1;
            return this.f23126p.mo21691g(i);
        }
        throw new NoSuchElementException();
    }
}
