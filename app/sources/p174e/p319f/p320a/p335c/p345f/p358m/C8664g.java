package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.g */
final class C8664g implements Iterator<Map.Entry> {

    /* renamed from: f */
    final Iterator<Map.Entry> f23715f;
    @NullableDecl

    /* renamed from: o */
    Collection f23716o;

    /* renamed from: p */
    final /* synthetic */ C8677h f23717p;

    C8664g(C8677h hVar) {
        this.f23717p = hVar;
        this.f23715f = hVar.f23750p.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f23715f.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f23715f.next();
        this.f23716o = (Collection) next.getValue();
        C8677h hVar = this.f23717p;
        Object key = next.getKey();
        return new C8704j0(key, hVar.f23751q.mo22383h(key, (Collection) next.getValue()));
    }

    public final void remove() {
        C8599b.m29381d(this.f23716o != null, "no calls to next() since the last call to remove()");
        this.f23715f.remove();
        C8781p.m29594l(this.f23717p.f23751q, this.f23716o.size());
        this.f23716o.clear();
        this.f23716o = null;
    }
}
