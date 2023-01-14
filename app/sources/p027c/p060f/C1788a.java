package p027c.p060f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: c.f.a */
public class C1788a<K, V> extends C1801g<K, V> implements Map<K, V> {

    /* renamed from: u */
    C1795f<K, V> f5307u;

    /* renamed from: c.f.a$a */
    class C1789a extends C1795f<K, V> {
        C1789a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6131a() {
            C1788a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo6132b(int i, int i2) {
            return C1788a.this.f5356s[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo6133c() {
            return C1788a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo6134d() {
            return C1788a.this.f5357t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo6135e(Object obj) {
            return C1788a.this.mo6252f(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo6136f(Object obj) {
            return C1788a.this.mo6256h(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo6137g(K k, V v) {
            C1788a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo6138h(int i) {
            C1788a.this.mo6261k(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo6139i(int i, V v) {
            return C1788a.this.mo6262l(i, v);
        }
    }

    public C1788a() {
    }

    public C1788a(int i) {
        super(i);
    }

    public C1788a(C1801g gVar) {
        super(gVar);
    }

    /* renamed from: n */
    private C1795f<K, V> m7598n() {
        if (this.f5307u == null) {
            this.f5307u = new C1789a();
        }
        return this.f5307u;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m7598n().mo6184l();
    }

    public Set<K> keySet() {
        return m7598n().mo6185m();
    }

    /* renamed from: o */
    public boolean mo6128o(Collection<?> collection) {
        return C1795f.m7658p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo6246c(this.f5357t + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m7598n().mo6186n();
    }
}
