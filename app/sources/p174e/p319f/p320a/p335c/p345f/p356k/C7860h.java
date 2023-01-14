package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.h */
final class C7860h implements Iterator<Map.Entry> {

    /* renamed from: f */
    final Iterator<Map.Entry> f21438f;
    @NullableDecl

    /* renamed from: o */
    Collection f21439o;

    /* renamed from: p */
    final /* synthetic */ C7873i f21440p;

    C7860h(C7873i iVar) {
        this.f21440p = iVar;
        this.f21438f = iVar.f21478p.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f21438f.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f21438f.next();
        this.f21439o = (Collection) next.getValue();
        C7873i iVar = this.f21440p;
        Object key = next.getKey();
        return new C7900k0(key, iVar.f21479q.mo21333h(key, (Collection) next.getValue()));
    }

    public final void remove() {
        C7795c.m27871d(this.f21439o != null, "no calls to next() since the last call to remove()");
        this.f21438f.remove();
        C7977q.m28145l(this.f21440p.f21479q, this.f21439o.size());
        this.f21439o.clear();
        this.f21439o = null;
    }
}
