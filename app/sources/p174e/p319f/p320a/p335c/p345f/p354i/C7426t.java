package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.i.t */
abstract class C7426t<E> extends C7442u1<E> {

    /* renamed from: f */
    private final int f19960f;

    /* renamed from: o */
    private int f19961o;

    protected C7426t(int i, int i2) {
        C7398r.m27424b(i2, i, "index");
        this.f19960f = i;
        this.f19961o = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo20583b(int i);

    public final boolean hasNext() {
        return this.f19961o < this.f19960f;
    }

    public final boolean hasPrevious() {
        return this.f19961o > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f19961o;
            this.f19961o = i + 1;
            return mo20583b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f19961o;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f19961o - 1;
            this.f19961o = i;
            return mo20583b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f19961o - 1;
    }
}
