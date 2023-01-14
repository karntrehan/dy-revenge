package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.j */
final class C7886j implements Iterator {
    @NullableDecl

    /* renamed from: f */
    Map.Entry f21502f;

    /* renamed from: o */
    final /* synthetic */ Iterator f21503o;

    /* renamed from: p */
    final /* synthetic */ C7899k f21504p;

    C7886j(C7899k kVar, Iterator it) {
        this.f21504p = kVar;
        this.f21503o = it;
    }

    public final boolean hasNext() {
        return this.f21503o.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f21503o.next();
        this.f21502f = entry;
        return entry.getKey();
    }

    public final void remove() {
        C7795c.m27871d(this.f21502f != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f21502f.getValue();
        this.f21503o.remove();
        C7977q.m28145l(this.f21504p.f21526o, collection.size());
        collection.clear();
        this.f21502f = null;
    }
}
