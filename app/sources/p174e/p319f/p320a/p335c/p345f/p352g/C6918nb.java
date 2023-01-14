package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;

/* renamed from: e.f.a.c.f.g.nb */
final class C6918nb implements Iterator {

    /* renamed from: f */
    final Iterator f18720f;

    /* renamed from: o */
    final /* synthetic */ C6934ob f18721o;

    C6918nb(C6934ob obVar) {
        this.f18721o = obVar;
        this.f18720f = obVar.f18744f.iterator();
    }

    public final boolean hasNext() {
        return this.f18720f.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f18720f.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
