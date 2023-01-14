package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.x */
final class C7482x extends C7316l1 {

    /* renamed from: p */
    final transient Map f20104p;

    /* renamed from: q */
    final /* synthetic */ C7243g0 f20105q;

    C7482x(C7243g0 g0Var, Map map) {
        this.f20105q = g0Var;
        this.f20104p = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set<Map.Entry> mo20800a() {
        return new C7454v(this);
    }

    public final void clear() {
        if (this.f20104p == this.f20105q.f19307p) {
            this.f20105q.mo20727q();
        } else {
            C7229f1.m27228a(new C7468w(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return C7330m1.m27352b(this.f20104p, obj);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f20104p.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C7330m1.m27351a(this.f20104p, obj);
        if (collection == null) {
            return null;
        }
        return this.f20105q.mo20724h(obj, collection);
    }

    public final int hashCode() {
        return this.f20104p.hashCode();
    }

    public final Set keySet() {
        return this.f20105q.mo20758e();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f20104p.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection g = this.f20105q.mo20723g();
        g.addAll(collection);
        C7243g0.m27277l(this.f20105q, collection.size());
        collection.clear();
        return g;
    }

    public final int size() {
        return this.f20104p.size();
    }

    public final String toString() {
        return this.f20104p.toString();
    }
}
