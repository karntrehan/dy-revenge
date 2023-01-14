package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.ListIterator;

/* renamed from: e.f.a.c.f.l.mf */
final class C8350mf implements ListIterator<String> {

    /* renamed from: f */
    final ListIterator<String> f22803f;

    /* renamed from: o */
    final /* synthetic */ int f22804o;

    /* renamed from: p */
    final /* synthetic */ C8404pf f22805p;

    C8350mf(C8404pf pfVar, int i) {
        this.f22805p = pfVar;
        this.f22804o = i;
        this.f22803f = pfVar.f22910f.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f22803f.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f22803f.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f22803f.next();
    }

    public final int nextIndex() {
        return this.f22803f.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f22803f.previous();
    }

    public final int previousIndex() {
        return this.f22803f.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
