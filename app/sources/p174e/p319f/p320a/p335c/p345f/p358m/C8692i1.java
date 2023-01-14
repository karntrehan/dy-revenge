package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.ListIterator;

/* renamed from: e.f.a.c.f.m.i1 */
abstract class C8692i1<F, T> extends C8679h1<F, T> implements ListIterator<T> {
    C8692i1(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f23752f).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f23752f).nextIndex();
    }

    public final T previous() {
        return mo22440b(((ListIterator) this.f23752f).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f23752f).previousIndex();
    }

    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
