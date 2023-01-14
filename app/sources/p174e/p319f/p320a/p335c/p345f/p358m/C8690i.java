package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.i */
final class C8690i implements Iterator {
    @NullableDecl

    /* renamed from: f */
    Map.Entry f23770f;

    /* renamed from: o */
    final /* synthetic */ Iterator f23771o;

    /* renamed from: p */
    final /* synthetic */ C8703j f23772p;

    C8690i(C8703j jVar, Iterator it) {
        this.f23772p = jVar;
        this.f23771o = it;
    }

    public final boolean hasNext() {
        return this.f23771o.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f23771o.next();
        this.f23770f = entry;
        return entry.getKey();
    }

    public final void remove() {
        C8599b.m29381d(this.f23770f != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f23770f.getValue();
        this.f23771o.remove();
        C8781p.m29594l(this.f23772p.f23799o, collection.size());
        collection.clear();
        this.f23770f = null;
    }
}
