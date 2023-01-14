package p174e.p319f.p320a.p335c.p345f.p353h;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.h.c */
abstract class C7118c<E> extends C7136l<E> {

    /* renamed from: f */
    private final int f19093f;

    /* renamed from: o */
    private int f19094o;

    protected C7118c(int i, int i2) {
        C7137l0.m27131b(i2, i, "index");
        this.f19093f = i;
        this.f19094o = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo20487b(int i);

    public final boolean hasNext() {
        return this.f19094o < this.f19093f;
    }

    public final boolean hasPrevious() {
        return this.f19094o > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f19094o;
            this.f19094o = i + 1;
            return mo20487b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f19094o;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f19094o - 1;
            this.f19094o = i;
            return mo20487b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f19094o - 1;
    }
}
