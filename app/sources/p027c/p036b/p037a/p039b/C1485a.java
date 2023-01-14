package p027c.p036b.p037a.p039b;

import java.util.HashMap;
import java.util.Map;
import p027c.p036b.p037a.p039b.C1486b;

/* renamed from: c.b.a.b.a */
public class C1485a<K, V> extends C1486b<K, V> {

    /* renamed from: r */
    private HashMap<K, C1486b.C1489c<K, V>> f4637r = new HashMap<>();

    public boolean contains(K k) {
        return this.f4637r.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1486b.C1489c<K, V> mo5521h(K k) {
        return this.f4637r.get(k);
    }

    /* renamed from: p */
    public V mo5522p(K k, V v) {
        C1486b.C1489c h = mo5521h(k);
        if (h != null) {
            return h.f4643o;
        }
        this.f4637r.put(k, mo5532o(k, v));
        return null;
    }

    /* renamed from: r */
    public V mo5523r(K k) {
        V r = super.mo5523r(k);
        this.f4637r.remove(k);
        return r;
    }

    /* renamed from: v */
    public Map.Entry<K, V> mo5524v(K k) {
        if (contains(k)) {
            return this.f4637r.get(k).f4645q;
        }
        return null;
    }
}
