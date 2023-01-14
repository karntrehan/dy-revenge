package p027c.p060f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: c.f.f */
abstract class C1795f<K, V> {

    /* renamed from: a */
    C1795f<K, V>.b f5336a;

    /* renamed from: b */
    C1795f<K, V>.c f5337b;

    /* renamed from: c */
    C1795f<K, V>.e f5338c;

    /* renamed from: c.f.f$a */
    final class C1796a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f5339f;

        /* renamed from: o */
        int f5340o;

        /* renamed from: p */
        int f5341p;

        /* renamed from: q */
        boolean f5342q = false;

        C1796a(int i) {
            this.f5339f = i;
            this.f5340o = C1795f.this.mo6134d();
        }

        public boolean hasNext() {
            return this.f5341p < this.f5340o;
        }

        public T next() {
            if (hasNext()) {
                T b = C1795f.this.mo6132b(this.f5341p, this.f5339f);
                this.f5341p++;
                this.f5342q = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f5342q) {
                int i = this.f5341p - 1;
                this.f5341p = i;
                this.f5340o--;
                this.f5342q = false;
                C1795f.this.mo6138h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: c.f.f$b */
    final class C1797b implements Set<Map.Entry<K, V>> {
        C1797b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C1795f.this.mo6134d();
            for (Map.Entry entry : collection) {
                C1795f.this.mo6137g(entry.getKey(), entry.getValue());
            }
            return d != C1795f.this.mo6134d();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1795f.this.mo6131a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C1795f.this.mo6135e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C1792c.m7628c(C1795f.this.mo6132b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C1795f.m7656k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C1795f.this.mo6134d() - 1; d >= 0; d--) {
                Object b = C1795f.this.mo6132b(d, 0);
                Object b2 = C1795f.this.mo6132b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C1795f.this.mo6134d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1799d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C1795f.this.mo6134d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c.f.f$c */
    final class C1798c implements Set<K> {
        C1798c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1795f.this.mo6131a();
        }

        public boolean contains(Object obj) {
            return C1795f.this.mo6135e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C1795f.m7655j(C1795f.this.mo6133c(), collection);
        }

        public boolean equals(Object obj) {
            return C1795f.m7656k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C1795f.this.mo6134d() - 1; d >= 0; d--) {
                Object b = C1795f.this.mo6132b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C1795f.this.mo6134d() == 0;
        }

        public Iterator<K> iterator() {
            return new C1796a(0);
        }

        public boolean remove(Object obj) {
            int e = C1795f.this.mo6135e(obj);
            if (e < 0) {
                return false;
            }
            C1795f.this.mo6138h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C1795f.m7657o(C1795f.this.mo6133c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C1795f.m7658p(C1795f.this.mo6133c(), collection);
        }

        public int size() {
            return C1795f.this.mo6134d();
        }

        public Object[] toArray() {
            return C1795f.this.mo6187q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1795f.this.mo6188r(tArr, 0);
        }
    }

    /* renamed from: c.f.f$d */
    final class C1799d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f5346f;

        /* renamed from: o */
        int f5347o;

        /* renamed from: p */
        boolean f5348p = false;

        C1799d() {
            this.f5346f = C1795f.this.mo6134d() - 1;
            this.f5347o = -1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f5347o++;
                this.f5348p = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f5348p) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C1792c.m7628c(entry.getKey(), C1795f.this.mo6132b(this.f5347o, 0)) && C1792c.m7628c(entry.getValue(), C1795f.this.mo6132b(this.f5347o, 1));
            }
        }

        public K getKey() {
            if (this.f5348p) {
                return C1795f.this.mo6132b(this.f5347o, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f5348p) {
                return C1795f.this.mo6132b(this.f5347o, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f5347o < this.f5346f;
        }

        public int hashCode() {
            if (this.f5348p) {
                int i = 0;
                Object b = C1795f.this.mo6132b(this.f5347o, 0);
                Object b2 = C1795f.this.mo6132b(this.f5347o, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f5348p) {
                C1795f.this.mo6138h(this.f5347o);
                this.f5347o--;
                this.f5346f--;
                this.f5348p = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f5348p) {
                return C1795f.this.mo6139i(this.f5347o, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: c.f.f$e */
    final class C1800e implements Collection<V> {
        C1800e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1795f.this.mo6131a();
        }

        public boolean contains(Object obj) {
            return C1795f.this.mo6136f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1795f.this.mo6134d() == 0;
        }

        public Iterator<V> iterator() {
            return new C1796a(1);
        }

        public boolean remove(Object obj) {
            int f = C1795f.this.mo6136f(obj);
            if (f < 0) {
                return false;
            }
            C1795f.this.mo6138h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C1795f.this.mo6134d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C1795f.this.mo6132b(i, 1))) {
                    C1795f.this.mo6138h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C1795f.this.mo6134d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C1795f.this.mo6132b(i, 1))) {
                    C1795f.this.mo6138h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C1795f.this.mo6134d();
        }

        public Object[] toArray() {
            return C1795f.this.mo6187q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1795f.this.mo6188r(tArr, 1);
        }
    }

    C1795f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m7655j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m7656k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m7657o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m7658p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6131a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo6132b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo6133c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo6134d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo6135e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo6136f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo6137g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo6138h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo6139i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo6184l() {
        if (this.f5336a == null) {
            this.f5336a = new C1797b();
        }
        return this.f5336a;
    }

    /* renamed from: m */
    public Set<K> mo6185m() {
        if (this.f5337b == null) {
            this.f5337b = new C1798c();
        }
        return this.f5337b;
    }

    /* renamed from: n */
    public Collection<V> mo6186n() {
        if (this.f5338c == null) {
            this.f5338c = new C1800e();
        }
        return this.f5338c;
    }

    /* renamed from: q */
    public Object[] mo6187q(int i) {
        int d = mo6134d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo6132b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo6188r(T[] tArr, int i) {
        int d = mo6134d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo6132b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
