package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.g.p7 */
final class C6946p7 extends C6978r7 {

    /* renamed from: f */
    private int f18792f = 0;

    /* renamed from: o */
    private final int f18793o;

    /* renamed from: p */
    final /* synthetic */ C7106z7 f18794p;

    C6946p7(C7106z7 z7Var) {
        this.f18794p = z7Var;
        this.f18793o = z7Var.mo20156h();
    }

    public final boolean hasNext() {
        return this.f18792f < this.f18793o;
    }

    public final byte zza() {
        int i = this.f18792f;
        if (i < this.f18793o) {
            this.f18792f = i + 1;
            return this.f18794p.mo20155g(i);
        }
        throw new NoSuchElementException();
    }
}
