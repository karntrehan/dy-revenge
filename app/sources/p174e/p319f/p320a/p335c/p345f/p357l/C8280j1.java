package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.l.j1 */
abstract class C8280j1<E> extends C8462t1<E> {

    /* renamed from: f */
    private final int f22648f;

    /* renamed from: o */
    private int f22649o;

    protected C8280j1(int i, int i2) {
        C8109a1.m28307b(i2, i, "index");
        this.f22648f = i;
        this.f22649o = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo21880b(int i);

    public final boolean hasNext() {
        return this.f22649o < this.f22648f;
    }

    public final boolean hasPrevious() {
        return this.f22649o > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f22649o;
            this.f22649o = i + 1;
            return mo21880b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f22649o;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f22649o - 1;
            this.f22649o = i;
            return mo21880b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f22649o - 1;
    }
}
