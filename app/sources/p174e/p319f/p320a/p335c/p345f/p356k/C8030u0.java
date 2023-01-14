package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.u0 */
final class C8030u0<K, V> extends AbstractCollection<V> {

    /* renamed from: f */
    final Map<K, V> f21810f;

    C8030u0(Map<K, V> map) {
        this.f21810f = map;
    }

    public final void clear() {
        this.f21810f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f21810f.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f21810f.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new C7991r0(this.f21810f.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f21810f.entrySet()) {
                if (C8080xb.m28291a(obj, next.getValue())) {
                    this.f21810f.remove(next.getKey());
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
            for (Map.Entry next : this.f21810f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f21810f.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f21810f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f21810f.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f21810f.size();
    }
}
