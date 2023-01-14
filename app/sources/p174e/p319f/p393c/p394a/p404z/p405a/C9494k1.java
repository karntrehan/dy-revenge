package p174e.p319f.p393c.p394a.p404z.p405a;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p174e.p319f.p393c.p394a.p404z.p405a.C9563v;

/* renamed from: e.f.c.a.z.a.k1 */
class C9494k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f25410f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List<C9494k1<K, V>.e> f25411o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<K, V> f25412p;

    /* renamed from: q */
    private boolean f25413q;

    /* renamed from: r */
    private volatile C9494k1<K, V>.g f25414r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Map<K, V> f25415s;

    /* renamed from: t */
    private volatile C9494k1<K, V>.c f25416t;

    /* renamed from: e.f.c.a.z.a.k1$a */
    class C9495a extends C9494k1<FieldDescriptorType, Object> {
        C9495a(int i) {
            super(i, (C9495a) null);
        }

        /* renamed from: p */
        public void mo23737p() {
            if (!mo23736o()) {
                for (int i = 0; i < mo23733k(); i++) {
                    Map.Entry j = mo23732j(i);
                    if (((C9563v.C9565b) j.getKey()).mo24031f()) {
                        j.setValue(Collections.unmodifiableList((List) j.getValue()));
                    }
                }
                for (Map.Entry entry : mo23735m()) {
                    if (((C9563v.C9565b) entry.getKey()).mo24031f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C9494k1.super.mo23737p();
        }
    }

    /* renamed from: e.f.c.a.z.a.k1$b */
    private class C9496b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        private int f25417f;

        /* renamed from: o */
        private Iterator<Map.Entry<K, V>> f25418o;

        private C9496b() {
            this.f25417f = C9494k1.this.f25411o.size();
        }

        /* synthetic */ C9496b(C9494k1 k1Var, C9495a aVar) {
            this();
        }

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> m31945b() {
            if (this.f25418o == null) {
                this.f25418o = C9494k1.this.f25415s.entrySet().iterator();
            }
            return this.f25418o;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Object obj;
            if (m31945b().hasNext()) {
                obj = m31945b().next();
            } else {
                List b = C9494k1.this.f25411o;
                int i = this.f25417f - 1;
                this.f25417f = i;
                obj = b.get(i);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i = this.f25417f;
            return (i > 0 && i <= C9494k1.this.f25411o.size()) || m31945b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.f.c.a.z.a.k1$c */
    private class C9497c extends C9494k1<K, V>.g {
        private C9497c() {
            super(C9494k1.this, (C9495a) null);
        }

        /* synthetic */ C9497c(C9494k1 k1Var, C9495a aVar) {
            this();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C9496b(C9494k1.this, (C9495a) null);
        }
    }

    /* renamed from: e.f.c.a.z.a.k1$d */
    private static class C9498d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f25421a = new C9499a();

        /* renamed from: b */
        private static final Iterable<Object> f25422b = new C9500b();

        /* renamed from: e.f.c.a.z.a.k1$d$a */
        class C9499a implements Iterator<Object> {
            C9499a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: e.f.c.a.z.a.k1$d$b */
        class C9500b implements Iterable<Object> {
            C9500b() {
            }

            public Iterator<Object> iterator() {
                return C9498d.f25421a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m31948b() {
            return f25422b;
        }
    }

    /* renamed from: e.f.c.a.z.a.k1$e */
    private class C9501e implements Map.Entry<K, V>, Comparable<C9494k1<K, V>.e> {

        /* renamed from: f */
        private final K f25423f;

        /* renamed from: o */
        private V f25424o;

        C9501e(K k, V v) {
            this.f25423f = k;
            this.f25424o = v;
        }

        C9501e(C9494k1 k1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: g */
        private boolean m31949g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: e */
        public int compareTo(C9494k1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m31949g(this.f25423f, entry.getKey()) && m31949g(this.f25424o, entry.getValue());
        }

        public V getValue() {
            return this.f25424o;
        }

        /* renamed from: h */
        public K getKey() {
            return this.f25423f;
        }

        public int hashCode() {
            K k = this.f25423f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f25424o;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C9494k1.this.m31931g();
            V v2 = this.f25424o;
            this.f25424o = v;
            return v2;
        }

        public String toString() {
            return this.f25423f + "=" + this.f25424o;
        }
    }

    /* renamed from: e.f.c.a.z.a.k1$f */
    private class C9502f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        private int f25426f;

        /* renamed from: o */
        private boolean f25427o;

        /* renamed from: p */
        private Iterator<Map.Entry<K, V>> f25428p;

        private C9502f() {
            this.f25426f = -1;
        }

        /* synthetic */ C9502f(C9494k1 k1Var, C9495a aVar) {
            this();
        }

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> m31952b() {
            if (this.f25428p == null) {
                this.f25428p = C9494k1.this.f25412p.entrySet().iterator();
            }
            return this.f25428p;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f25427o = true;
            int i = this.f25426f + 1;
            this.f25426f = i;
            return (Map.Entry) (i < C9494k1.this.f25411o.size() ? C9494k1.this.f25411o.get(this.f25426f) : m31952b().next());
        }

        public boolean hasNext() {
            if (this.f25426f + 1 >= C9494k1.this.f25411o.size()) {
                return !C9494k1.this.f25412p.isEmpty() && m31952b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f25427o) {
                this.f25427o = false;
                C9494k1.this.m31931g();
                if (this.f25426f < C9494k1.this.f25411o.size()) {
                    C9494k1 k1Var = C9494k1.this;
                    int i = this.f25426f;
                    this.f25426f = i - 1;
                    Object unused = k1Var.m31935s(i);
                    return;
                }
                m31952b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: e.f.c.a.z.a.k1$g */
    private class C9503g extends AbstractSet<Map.Entry<K, V>> {
        private C9503g() {
        }

        /* synthetic */ C9503g(C9494k1 k1Var, C9495a aVar) {
            this();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C9494k1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C9494k1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C9494k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C9502f(C9494k1.this, (C9495a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C9494k1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C9494k1.this.size();
        }
    }

    private C9494k1(int i) {
        this.f25410f = i;
        this.f25411o = Collections.emptyList();
        this.f25412p = Collections.emptyMap();
        this.f25415s = Collections.emptyMap();
    }

    /* synthetic */ C9494k1(int i, C9495a aVar) {
        this(i);
    }

    /* renamed from: f */
    private int m31930f(K k) {
        int size = this.f25411o.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f25411o.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f25411o.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m31931g() {
        if (this.f25413q) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private void m31932i() {
        m31931g();
        if (this.f25411o.isEmpty() && !(this.f25411o instanceof ArrayList)) {
            this.f25411o = new ArrayList(this.f25410f);
        }
    }

    /* renamed from: n */
    private SortedMap<K, V> m31933n() {
        m31931g();
        if (this.f25412p.isEmpty() && !(this.f25412p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25412p = treeMap;
            this.f25415s = treeMap.descendingMap();
        }
        return (SortedMap) this.f25412p;
    }

    /* renamed from: q */
    static <FieldDescriptorType extends C9563v.C9565b<FieldDescriptorType>> C9494k1<FieldDescriptorType, Object> m31934q(int i) {
        return new C9495a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public V m31935s(int i) {
        m31931g();
        V value = this.f25411o.remove(i).getValue();
        if (!this.f25412p.isEmpty()) {
            Iterator it = m31933n().entrySet().iterator();
            this.f25411o.add(new C9501e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m31931g();
        if (!this.f25411o.isEmpty()) {
            this.f25411o.clear();
        }
        if (!this.f25412p.isEmpty()) {
            this.f25412p.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m31930f(comparable) >= 0 || this.f25412p.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f25414r == null) {
            this.f25414r = new C9503g(this, (C9495a) null);
        }
        return this.f25414r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9494k1)) {
            return super.equals(obj);
        }
        C9494k1 k1Var = (C9494k1) obj;
        int size = size();
        if (size != k1Var.size()) {
            return false;
        }
        int k = mo23733k();
        if (k != k1Var.mo23733k()) {
            return entrySet().equals(k1Var.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo23732j(i).equals(k1Var.mo23732j(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f25412p.equals(k1Var.f25412p);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = m31930f(comparable);
        return f >= 0 ? this.f25411o.get(f).getValue() : this.f25412p.get(comparable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo23730h() {
        if (this.f25416t == null) {
            this.f25416t = new C9497c(this, (C9495a) null);
        }
        return this.f25416t;
    }

    public int hashCode() {
        int k = mo23733k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f25411o.get(i2).hashCode();
        }
        return mo23734l() > 0 ? i + this.f25412p.hashCode() : i;
    }

    /* renamed from: j */
    public Map.Entry<K, V> mo23732j(int i) {
        return this.f25411o.get(i);
    }

    /* renamed from: k */
    public int mo23733k() {
        return this.f25411o.size();
    }

    /* renamed from: l */
    public int mo23734l() {
        return this.f25412p.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> mo23735m() {
        return this.f25412p.isEmpty() ? C9498d.m31948b() : this.f25412p.entrySet();
    }

    /* renamed from: o */
    public boolean mo23736o() {
        return this.f25413q;
    }

    /* renamed from: p */
    public void mo23737p() {
        if (!this.f25413q) {
            this.f25412p = this.f25412p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25412p);
            this.f25415s = this.f25415s.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25415s);
            this.f25413q = true;
        }
    }

    /* renamed from: r */
    public V put(K k, V v) {
        m31931g();
        int f = m31930f(k);
        if (f >= 0) {
            return this.f25411o.get(f).setValue(v);
        }
        m31932i();
        int i = -(f + 1);
        if (i >= this.f25410f) {
            return m31933n().put(k, v);
        }
        int size = this.f25411o.size();
        int i2 = this.f25410f;
        if (size == i2) {
            C9501e remove = this.f25411o.remove(i2 - 1);
            m31933n().put(remove.getKey(), remove.getValue());
        }
        this.f25411o.add(i, new C9501e(k, v));
        return null;
    }

    public V remove(Object obj) {
        m31931g();
        Comparable comparable = (Comparable) obj;
        int f = m31930f(comparable);
        if (f >= 0) {
            return m31935s(f);
        }
        if (this.f25412p.isEmpty()) {
            return null;
        }
        return this.f25412p.remove(comparable);
    }

    public int size() {
        return this.f25411o.size() + this.f25412p.size();
    }
}
