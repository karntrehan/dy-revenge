package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.m.y */
abstract class C8896y<T> implements Iterator<T> {

    /* renamed from: f */
    int f24222f;

    /* renamed from: o */
    int f24223o;

    /* renamed from: p */
    int f24224p = -1;

    /* renamed from: q */
    final /* synthetic */ C8626d0 f24225q;

    /* synthetic */ C8896y(C8626d0 d0Var, C8846u uVar) {
        this.f24225q = d0Var;
        this.f24222f = d0Var.f23644s;
        this.f24223o = d0Var.mo22352e();
    }

    /* renamed from: c */
    private final void m29758c() {
        if (this.f24225q.f23644s != this.f24222f) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo22663b(int i);

    public final boolean hasNext() {
        return this.f24223o >= 0;
    }

    public final T next() {
        m29758c();
        if (hasNext()) {
            int i = this.f24223o;
            this.f24224p = i;
            T b = mo22663b(i);
            this.f24223o = this.f24225q.mo22354f(this.f24223o);
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m29758c();
        C8599b.m29381d(this.f24224p >= 0, "no calls to next() since the last call to remove()");
        this.f24222f += 32;
        C8626d0 d0Var = this.f24225q;
        d0Var.remove(d0Var.f23642q[this.f24224p]);
        this.f24223o--;
        this.f24224p = -1;
    }
}
