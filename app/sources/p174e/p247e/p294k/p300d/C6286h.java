package p174e.p247e.p294k.p300d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p174e.p247e.p253d.p257d.C6063l;

/* renamed from: e.e.k.d.h */
public class C6286h<K, V> {

    /* renamed from: a */
    private final C6311y<V> f17399a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f17400b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f17401c = 0;

    public C6286h(C6311y<V> yVar) {
        this.f17399a = yVar;
    }

    /* renamed from: f */
    private int m23789f(V v) {
        if (v == null) {
            return 0;
        }
        return this.f17399a.mo18611a(v);
    }

    /* renamed from: a */
    public synchronized V mo18613a(K k) {
        return this.f17400b.get(k);
    }

    /* renamed from: b */
    public synchronized int mo18614b() {
        return this.f17400b.size();
    }

    /* renamed from: c */
    public synchronized K mo18615c() {
        return this.f17400b.isEmpty() ? null : this.f17400b.keySet().iterator().next();
    }

    /* renamed from: d */
    public synchronized ArrayList<Map.Entry<K, V>> mo18616d(C6063l<K> lVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f17400b.entrySet().size());
        for (Map.Entry next : this.f17400b.entrySet()) {
            if (lVar == null || lVar.apply(next.getKey())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized int mo18617e() {
        return this.f17401c;
    }

    /* renamed from: g */
    public synchronized V mo18618g(K k, V v) {
        V remove;
        remove = this.f17400b.remove(k);
        this.f17401c -= m23789f(remove);
        this.f17400b.put(k, v);
        this.f17401c += m23789f(v);
        return remove;
    }

    /* renamed from: h */
    public synchronized V mo18619h(K k) {
        V remove;
        remove = this.f17400b.remove(k);
        this.f17401c -= m23789f(remove);
        return remove;
    }

    /* renamed from: i */
    public synchronized ArrayList<V> mo18620i(C6063l<K> lVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f17400b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (lVar == null || lVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f17401c -= m23789f(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }
}
