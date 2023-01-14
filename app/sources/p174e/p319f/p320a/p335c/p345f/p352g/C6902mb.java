package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ListIterator;

/* renamed from: e.f.a.c.f.g.mb */
final class C6902mb implements ListIterator {

    /* renamed from: f */
    final ListIterator f18638f;

    /* renamed from: o */
    final /* synthetic */ int f18639o;

    /* renamed from: p */
    final /* synthetic */ C6934ob f18640p;

    C6902mb(C6934ob obVar, int i) {
        this.f18640p = obVar;
        this.f18639o = i;
        this.f18638f = obVar.f18744f.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f18638f.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f18638f.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f18638f.next();
    }

    public final int nextIndex() {
        return this.f18638f.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f18638f.previous();
    }

    public final int previousIndex() {
        return this.f18638f.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
