package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.y0 */
final class C8897y0<K, V> extends AbstractCollection<V> {

    /* renamed from: f */
    final Map<K, V> f24226f;

    C8897y0(Map<K, V> map) {
        this.f24226f = map;
    }

    public final void clear() {
        this.f24226f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f24226f.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f24226f.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new C8860v0(this.f24226f.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f24226f.entrySet()) {
                if (C8832sb.m29687a(obj, next.getValue())) {
                    this.f24226f.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f24226f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f24226f.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f24226f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f24226f.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f24226f.size();
    }
}
