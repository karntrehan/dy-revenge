package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.f.a.c.f.k.t0 */
class C8017t0<K, V> extends C7771a1<K> {

    /* renamed from: f */
    final Map<K, V> f21783f;

    C8017t0(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f21783f = map;
    }

    public final boolean contains(Object obj) {
        return this.f21783f.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f21783f.isEmpty();
    }

    public Iterator<K> iterator() {
        throw null;
    }

    public final int size() {
        return this.f21783f.size();
    }
}
