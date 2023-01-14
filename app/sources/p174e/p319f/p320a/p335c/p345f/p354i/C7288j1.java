package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.j1 */
class C7288j1<K, V> extends C7386q1<K> {

    /* renamed from: f */
    final Map<K, V> f19424f;

    C7288j1(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f19424f = map;
    }

    public final boolean contains(Object obj) {
        return this.f19424f.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f19424f.isEmpty();
    }

    public Iterator<K> iterator() {
        throw null;
    }

    public final int size() {
        return this.f19424f.size();
    }
}
