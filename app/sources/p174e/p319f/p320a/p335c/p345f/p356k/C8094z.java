package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.k.z */
abstract class C8094z<T> implements Iterator<T> {

    /* renamed from: f */
    int f22006f;

    /* renamed from: o */
    int f22007o;

    /* renamed from: p */
    int f22008p = -1;

    /* renamed from: q */
    final /* synthetic */ C7822e0 f22009q;

    /* synthetic */ C8094z(C7822e0 e0Var, C8042v vVar) {
        this.f22009q = e0Var;
        this.f22006f = e0Var.f21332s;
        this.f22007o = e0Var.mo21289e();
    }

    /* renamed from: c */
    private final void m28296c() {
        if (this.f22009q.f21332s != this.f22006f) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo21610b(int i);

    public final boolean hasNext() {
        return this.f22007o >= 0;
    }

    public final T next() {
        m28296c();
        if (hasNext()) {
            int i = this.f22007o;
            this.f22008p = i;
            T b = mo21610b(i);
            this.f22007o = this.f22009q.mo21291f(this.f22007o);
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m28296c();
        C7795c.m27871d(this.f22008p >= 0, "no calls to next() since the last call to remove()");
        this.f22006f += 32;
        C7822e0 e0Var = this.f22009q;
        e0Var.remove(e0Var.f21330q[this.f22008p]);
        this.f22007o--;
        this.f22008p = -1;
    }
}
