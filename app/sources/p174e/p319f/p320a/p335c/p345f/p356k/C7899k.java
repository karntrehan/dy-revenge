package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.k */
final class C7899k extends C8017t0 {

    /* renamed from: o */
    final /* synthetic */ C7977q f21526o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7899k(C7977q qVar, Map map) {
        super(map);
        this.f21526o = qVar;
    }

    public final void clear() {
        C7965p0.m28119a(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f21783f.keySet().containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f21783f.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f21783f.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new C7886j(this, this.f21783f.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f21783f.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        C7977q.m28145l(this.f21526o, size);
        return size > 0;
    }
}
