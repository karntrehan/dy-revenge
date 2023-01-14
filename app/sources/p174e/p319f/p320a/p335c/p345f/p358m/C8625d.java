package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.NoSuchElementException;

/* renamed from: e.f.a.c.f.m.d */
abstract class C8625d<E> extends C8718k1<E> {

    /* renamed from: f */
    private final int f23637f;

    /* renamed from: o */
    private int f23638o;

    protected C8625d(int i, int i2) {
        C8599b.m29379b(i2, i, "index");
        this.f23637f = i;
        this.f23638o = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract E mo22342b(int i);

    public final boolean hasNext() {
        return this.f23638o < this.f23637f;
    }

    public final boolean hasPrevious() {
        return this.f23638o > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f23638o;
            this.f23638o = i + 1;
            return mo22342b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f23638o;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f23638o - 1;
            this.f23638o = i;
            return mo22342b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f23638o - 1;
    }
}
