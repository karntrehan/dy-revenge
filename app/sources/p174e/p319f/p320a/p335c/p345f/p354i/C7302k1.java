package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.k1 */
final class C7302k1<K, V> extends AbstractCollection<V> {

    /* renamed from: f */
    final Map<K, V> f19449f;

    C7302k1(Map<K, V> map) {
        this.f19449f = map;
    }

    public final void clear() {
        this.f19449f.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f19449f.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f19449f.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new C7259h1(this.f19449f.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f19449f.entrySet()) {
                if (C7342n.m27360a(obj, next.getValue())) {
                    this.f19449f.remove(next.getKey());
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
            for (Map.Entry next : this.f19449f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f19449f.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f19449f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f19449f.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f19449f.size();
    }
}
