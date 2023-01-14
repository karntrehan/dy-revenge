package p455g.p460t;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.u */
public final class C10360u implements ListIterator, C10445a {

    /* renamed from: f */
    public static final C10360u f27560f = new C10360u();

    private C10360u() {
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void next() {
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
