package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.i */
final class C7873i extends C8043v0 {

    /* renamed from: p */
    final transient Map f21478p;

    /* renamed from: q */
    final /* synthetic */ C7977q f21479q;

    C7873i(C7977q qVar, Map map) {
        this.f21479q = qVar;
        this.f21478p = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set<Map.Entry> mo21381a() {
        return new C7847g(this);
    }

    public final void clear() {
        if (this.f21478p == this.f21479q.f21704p) {
            this.f21479q.mo21542q();
        } else {
            C7965p0.m28119a(new C7860h(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return C8056w0.m28274b(this.f21478p, obj);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f21478p.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C8056w0.m28273a(this.f21478p, obj);
        if (collection == null) {
            return null;
        }
        return this.f21479q.mo21333h(obj, collection);
    }

    public final int hashCode() {
        return this.f21478p.hashCode();
    }

    public final Set keySet() {
        return this.f21479q.mo21564e();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f21478p.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection g = this.f21479q.mo21539g();
        g.addAll(collection);
        C7977q.m28145l(this.f21479q, collection.size());
        collection.clear();
        return g;
    }

    public final int size() {
        return this.f21478p.size();
    }

    public final String toString() {
        return this.f21478p.toString();
    }
}
