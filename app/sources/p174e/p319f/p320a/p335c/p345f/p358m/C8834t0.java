package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.t0 */
final class C8834t0<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: f */
    final List<F> f24100f;

    /* renamed from: o */
    final C8806qb<? super F, ? extends T> f24101o;

    C8834t0(List<F> list, C8806qb<? super F, ? extends T> qbVar) {
        Objects.requireNonNull(list);
        this.f24100f = list;
        Objects.requireNonNull(qbVar);
        this.f24101o = qbVar;
    }

    public final void clear() {
        this.f24100f.clear();
    }

    public final ListIterator<T> listIterator(int i) {
        return new C8821s0(this, this.f24100f.listIterator(i));
    }

    public final int size() {
        return this.f24100f.size();
    }
}
