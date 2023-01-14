package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.w */
final class C7468w implements Iterator<Map.Entry> {

    /* renamed from: f */
    final Iterator<Map.Entry> f20060f;
    @NullableDecl

    /* renamed from: o */
    Collection f20061o;

    /* renamed from: p */
    final /* synthetic */ C7482x f20062p;

    C7468w(C7482x xVar) {
        this.f20062p = xVar;
        this.f20060f = xVar.f20104p.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f20060f.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f20060f.next();
        this.f20061o = (Collection) next.getValue();
        C7482x xVar = this.f20062p;
        Object key = next.getKey();
        return new C7511z0(key, xVar.f20105q.mo20724h(key, (Collection) next.getValue()));
    }

    public final void remove() {
        C7398r.m27426d(this.f20061o != null, "no calls to next() since the last call to remove()");
        this.f20060f.remove();
        C7243g0.m27277l(this.f20062p.f20105q, this.f20061o.size());
        this.f20061o.clear();
        this.f20061o = null;
    }
}
