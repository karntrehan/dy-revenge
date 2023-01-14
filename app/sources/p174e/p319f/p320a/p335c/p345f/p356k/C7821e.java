package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.k.e */
abstract class C7821e<E> extends C7836f1<E> {

    /* renamed from: f */
    private final int f21325f;

    /* renamed from: o */
    private int f21326o;

    protected C7821e(int i, int i2) {
        C7795c.m27869b(i2, i, "index");
        this.f21325f = i;
        this.f21326o = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo21279b(int i);

    public final boolean hasNext() {
        return this.f21326o < this.f21325f;
    }

    public final boolean hasPrevious() {
        return this.f21326o > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f21326o;
            this.f21326o = i + 1;
            return mo21279b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f21326o;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f21326o - 1;
            this.f21326o = i;
            return mo21279b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f21326o - 1;
    }
}
