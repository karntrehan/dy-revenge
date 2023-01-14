package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.x0 */
class C8885x0<K, V> extends C8653f1<K> {

    /* renamed from: f */
    final Map<K, V> f24197f;

    C8885x0(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f24197f = map;
    }

    public final boolean contains(Object obj) {
        return this.f24197f.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f24197f.isEmpty();
    }

    public Iterator<K> iterator() {
        throw null;
    }

    public final int size() {
        return this.f24197f.size();
    }
}
