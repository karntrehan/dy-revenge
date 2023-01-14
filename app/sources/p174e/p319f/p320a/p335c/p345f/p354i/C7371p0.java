package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.i.p0 */
abstract class C7371p0<T> implements Iterator<T> {

    /* renamed from: f */
    int f19812f;

    /* renamed from: o */
    int f19813o;

    /* renamed from: p */
    int f19814p = -1;

    /* renamed from: q */
    final /* synthetic */ C7427t0 f19815q;

    /* synthetic */ C7371p0(C7427t0 t0Var, C7315l0 l0Var) {
        this.f19815q = t0Var;
        this.f19812f = t0Var.f19967s;
        this.f19813o = t0Var.mo20919e();
    }

    /* renamed from: c */
    private final void m27394c() {
        if (this.f19815q.f19967s != this.f19812f) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo20799b(int i);

    public final boolean hasNext() {
        return this.f19813o >= 0;
    }

    public final T next() {
        m27394c();
        if (hasNext()) {
            int i = this.f19813o;
            this.f19814p = i;
            T b = mo20799b(i);
            this.f19813o = this.f19815q.mo20921f(this.f19813o);
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m27394c();
        C7398r.m27426d(this.f19814p >= 0, "no calls to next() since the last call to remove()");
        this.f19812f += 32;
        C7427t0 t0Var = this.f19815q;
        t0Var.remove(t0Var.f19965q[this.f19814p]);
        this.f19813o--;
        this.f19814p = -1;
    }
}
