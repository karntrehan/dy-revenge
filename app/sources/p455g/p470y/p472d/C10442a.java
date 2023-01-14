package p455g.p470y.p472d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.y.d.a */
final class C10442a<T> implements Iterator<T>, C10445a {

    /* renamed from: f */
    private final T[] f27607f;

    /* renamed from: o */
    private int f27608o;

    public C10442a(T[] tArr) {
        C10457l.m35320e(tArr, "array");
        this.f27607f = tArr;
    }

    public boolean hasNext() {
        return this.f27608o < this.f27607f.length;
    }

    public T next() {
        try {
            T[] tArr = this.f27607f;
            int i = this.f27608o;
            this.f27608o = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f27608o--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
