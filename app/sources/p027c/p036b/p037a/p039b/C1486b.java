package p027c.p036b.p037a.p039b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: c.b.a.b.b */
public class C1486b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    C1489c<K, V> f4638f;

    /* renamed from: o */
    private C1489c<K, V> f4639o;

    /* renamed from: p */
    private WeakHashMap<C1492f<K, V>, Boolean> f4640p = new WeakHashMap<>();

    /* renamed from: q */
    private int f4641q = 0;

    /* renamed from: c.b.a.b.b$a */
    static class C1487a<K, V> extends C1491e<K, V> {
        C1487a(C1489c<K, V> cVar, C1489c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1489c<K, V> mo5535c(C1489c<K, V> cVar) {
            return cVar.f4645q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C1489c<K, V> mo5536d(C1489c<K, V> cVar) {
            return cVar.f4644p;
        }
    }

    /* renamed from: c.b.a.b.b$b */
    private static class C1488b<K, V> extends C1491e<K, V> {
        C1488b(C1489c<K, V> cVar, C1489c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1489c<K, V> mo5535c(C1489c<K, V> cVar) {
            return cVar.f4644p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C1489c<K, V> mo5536d(C1489c<K, V> cVar) {
            return cVar.f4645q;
        }
    }

    /* renamed from: c.b.a.b.b$c */
    static class C1489c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f4642f;

        /* renamed from: o */
        final V f4643o;

        /* renamed from: p */
        C1489c<K, V> f4644p;

        /* renamed from: q */
        C1489c<K, V> f4645q;

        C1489c(K k, V v) {
            this.f4642f = k;
            this.f4643o = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1489c)) {
                return false;
            }
            C1489c cVar = (C1489c) obj;
            return this.f4642f.equals(cVar.f4642f) && this.f4643o.equals(cVar.f4643o);
        }

        public K getKey() {
            return this.f4642f;
        }

        public V getValue() {
            return this.f4643o;
        }

        public int hashCode() {
            return this.f4642f.hashCode() ^ this.f4643o.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f4642f + "=" + this.f4643o;
        }
    }

    /* renamed from: c.b.a.b.b$d */
    private class C1490d implements Iterator<Map.Entry<K, V>>, C1492f<K, V> {

        /* renamed from: f */
        private C1489c<K, V> f4646f;

        /* renamed from: o */
        private boolean f4647o = true;

        C1490d() {
        }

        /* renamed from: b */
        public void mo5543b(C1489c<K, V> cVar) {
            C1489c<K, V> cVar2 = this.f4646f;
            if (cVar == cVar2) {
                C1489c<K, V> cVar3 = cVar2.f4645q;
                this.f4646f = cVar3;
                this.f4647o = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            C1489c<K, V> cVar;
            if (this.f4647o) {
                this.f4647o = false;
                cVar = C1486b.this.f4638f;
            } else {
                C1489c<K, V> cVar2 = this.f4646f;
                cVar = cVar2 != null ? cVar2.f4644p : null;
            }
            this.f4646f = cVar;
            return this.f4646f;
        }

        public boolean hasNext() {
            if (this.f4647o) {
                return C1486b.this.f4638f != null;
            }
            C1489c<K, V> cVar = this.f4646f;
            return (cVar == null || cVar.f4644p == null) ? false : true;
        }
    }

    /* renamed from: c.b.a.b.b$e */
    private static abstract class C1491e<K, V> implements Iterator<Map.Entry<K, V>>, C1492f<K, V> {

        /* renamed from: f */
        C1489c<K, V> f4649f;

        /* renamed from: o */
        C1489c<K, V> f4650o;

        C1491e(C1489c<K, V> cVar, C1489c<K, V> cVar2) {
            this.f4649f = cVar2;
            this.f4650o = cVar;
        }

        /* renamed from: f */
        private C1489c<K, V> m6642f() {
            C1489c<K, V> cVar = this.f4650o;
            C1489c<K, V> cVar2 = this.f4649f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo5536d(cVar);
        }

        /* renamed from: b */
        public void mo5543b(C1489c<K, V> cVar) {
            if (this.f4649f == cVar && cVar == this.f4650o) {
                this.f4650o = null;
                this.f4649f = null;
            }
            C1489c<K, V> cVar2 = this.f4649f;
            if (cVar2 == cVar) {
                this.f4649f = mo5535c(cVar2);
            }
            if (this.f4650o == cVar) {
                this.f4650o = m6642f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C1489c<K, V> mo5535c(C1489c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C1489c<K, V> mo5536d(C1489c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C1489c<K, V> cVar = this.f4650o;
            this.f4650o = m6642f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f4650o != null;
        }
    }

    /* renamed from: c.b.a.b.b$f */
    interface C1492f<K, V> {
        /* renamed from: b */
        void mo5543b(C1489c<K, V> cVar);
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo5525b() {
        C1488b bVar = new C1488b(this.f4639o, this.f4638f);
        this.f4640p.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1486b)) {
            return false;
        }
        C1486b bVar = (C1486b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* renamed from: g */
    public Map.Entry<K, V> mo5527g() {
        return this.f4638f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1489c<K, V> mo5521h(K k) {
        C1489c<K, V> cVar = this.f4638f;
        while (cVar != null && !cVar.f4642f.equals(k)) {
            cVar = cVar.f4644p;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C1487a aVar = new C1487a(this.f4638f, this.f4639o);
        this.f4640p.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public C1486b<K, V>.d mo5530j() {
        C1486b<K, V>.d dVar = new C1490d();
        this.f4640p.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: k */
    public Map.Entry<K, V> mo5531k() {
        return this.f4639o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C1489c<K, V> mo5532o(K k, V v) {
        C1489c<K, V> cVar = new C1489c<>(k, v);
        this.f4641q++;
        C1489c<K, V> cVar2 = this.f4639o;
        if (cVar2 == null) {
            this.f4638f = cVar;
        } else {
            cVar2.f4644p = cVar;
            cVar.f4645q = cVar2;
        }
        this.f4639o = cVar;
        return cVar;
    }

    /* renamed from: p */
    public V mo5522p(K k, V v) {
        C1489c h = mo5521h(k);
        if (h != null) {
            return h.f4643o;
        }
        mo5532o(k, v);
        return null;
    }

    /* renamed from: r */
    public V mo5523r(K k) {
        C1489c h = mo5521h(k);
        if (h == null) {
            return null;
        }
        this.f4641q--;
        if (!this.f4640p.isEmpty()) {
            for (C1492f<K, V> b : this.f4640p.keySet()) {
                b.mo5543b(h);
            }
        }
        C1489c<K, V> cVar = h.f4645q;
        C1489c<K, V> cVar2 = h.f4644p;
        if (cVar != null) {
            cVar.f4644p = cVar2;
        } else {
            this.f4638f = cVar2;
        }
        C1489c<K, V> cVar3 = h.f4644p;
        if (cVar3 != null) {
            cVar3.f4645q = cVar;
        } else {
            this.f4639o = cVar;
        }
        h.f4644p = null;
        h.f4645q = null;
        return h.f4643o;
    }

    public int size() {
        return this.f4641q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
