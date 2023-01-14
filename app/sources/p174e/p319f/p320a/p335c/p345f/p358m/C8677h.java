package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.h */
final class C8677h extends C8909z0 {

    /* renamed from: p */
    final transient Map f23750p;

    /* renamed from: q */
    final /* synthetic */ C8781p f23751q;

    C8677h(C8781p pVar, Map map) {
        this.f23751q = pVar;
        this.f23750p = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set<Map.Entry> mo22430a() {
        return new C8651f(this);
    }

    public final void clear() {
        if (this.f23750p == this.f23751q.f23986p) {
            this.f23751q.mo22594q();
        } else {
            C8769o0.m29584a(new C8664g(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return C8588a1.m29364b(this.f23750p, obj);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f23750p.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C8588a1.m29363a(this.f23750p, obj);
        if (collection == null) {
            return null;
        }
        return this.f23751q.mo22383h(obj, collection);
    }

    public final int hashCode() {
        return this.f23750p.hashCode();
    }

    public final Set keySet() {
        return this.f23751q.mo22325e();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f23750p.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection g = this.f23751q.mo22591g();
        g.addAll(collection);
        C8781p.m29594l(this.f23751q, collection.size());
        collection.clear();
        return g;
    }

    public final int size() {
        return this.f23750p.size();
    }

    public final String toString() {
        return this.f23750p.toString();
    }
}
