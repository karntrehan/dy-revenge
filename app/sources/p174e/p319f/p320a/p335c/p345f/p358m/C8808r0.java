package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.m.r0 */
final class C8808r0<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

    /* renamed from: f */
    final List<F> f24031f;

    /* renamed from: o */
    final C8806qb<? super F, ? extends T> f24032o;

    C8808r0(List<F> list, C8806qb<? super F, ? extends T> qbVar) {
        Objects.requireNonNull(list);
        this.f24031f = list;
        Objects.requireNonNull(qbVar);
        this.f24032o = qbVar;
    }

    public final void clear() {
        this.f24031f.clear();
    }

    public final T get(int i) {
        return this.f24032o.mo15004a(this.f24031f.get(i));
    }

    public final boolean isEmpty() {
        return this.f24031f.isEmpty();
    }

    public final Iterator<T> iterator() {
        return listIterator();
    }

    public final ListIterator<T> listIterator(int i) {
        return new C8795q0(this, this.f24031f.listIterator(i));
    }

    public final T remove(int i) {
        return this.f24032o.mo15004a(this.f24031f.remove(i));
    }

    public final int size() {
        return this.f24031f.size();
    }
}
