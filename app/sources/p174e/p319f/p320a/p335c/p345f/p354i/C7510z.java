package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.z */
final class C7510z extends C7288j1 {

    /* renamed from: o */
    final /* synthetic */ C7243g0 f20211o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7510z(C7243g0 g0Var, Map map) {
        super(map);
        this.f20211o = g0Var;
    }

    public final void clear() {
        C7229f1.m27228a(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f19424f.keySet().containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f19424f.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f19424f.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new C7496y(this, this.f19424f.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f19424f.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        C7243g0.m27277l(this.f20211o, size);
        return size > 0;
    }
}
