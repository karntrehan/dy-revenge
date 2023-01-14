package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.j */
final class C8703j extends C8885x0 {

    /* renamed from: o */
    final /* synthetic */ C8781p f23799o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8703j(C8781p pVar, Map map) {
        super(map);
        this.f23799o = pVar;
    }

    public final void clear() {
        C8769o0.m29584a(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f24197f.keySet().containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f24197f.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f24197f.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new C8690i(this, this.f24197f.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f24197f.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        C8781p.m29594l(this.f23799o, size);
        return size > 0;
    }
}
