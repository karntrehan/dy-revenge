package p174e.p319f.p320a.p335c.p345f.p355j;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.j.h6 */
abstract class C7601h6<E> extends C7553c8<E> {

    /* renamed from: f */
    private final int f20484f;

    /* renamed from: o */
    private int f20485o;

    protected C7601h6(int i, int i2) {
        C7579f4.m27634b(i2, i, "index");
        this.f20484f = i;
        this.f20485o = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo21095b(int i);

    public final boolean hasNext() {
        return this.f20485o < this.f20484f;
    }

    public final boolean hasPrevious() {
        return this.f20485o > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f20485o;
            this.f20485o = i + 1;
            return mo21095b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f20485o;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f20485o - 1;
            this.f20485o = i;
            return mo21095b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f20485o - 1;
    }
}
