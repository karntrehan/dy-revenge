package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.y */
final class C7496y implements Iterator {
    @NullableDecl

    /* renamed from: f */
    Map.Entry f20146f;

    /* renamed from: o */
    final /* synthetic */ Iterator f20147o;

    /* renamed from: p */
    final /* synthetic */ C7510z f20148p;

    C7496y(C7510z zVar, Iterator it) {
        this.f20148p = zVar;
        this.f20147o = it;
    }

    public final boolean hasNext() {
        return this.f20147o.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f20147o.next();
        this.f20146f = entry;
        return entry.getKey();
    }

    public final void remove() {
        C7398r.m27426d(this.f20146f != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f20146f.getValue();
        this.f20147o.remove();
        C7243g0.m27277l(this.f20148p.f20211o, collection.size());
        collection.clear();
        this.f20146f = null;
    }
}
