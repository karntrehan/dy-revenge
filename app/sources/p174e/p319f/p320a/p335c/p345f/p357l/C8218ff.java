package p174e.p319f.p320a.p335c.p345f.p357l;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: e.f.a.c.f.l.ff */
class C8218ff<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f22504f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List<C8161cf> f22505o = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<K, V> f22506p = Collections.emptyMap();

    /* renamed from: q */
    private boolean f22507q;

    /* renamed from: r */
    private volatile C8199ef f22508r;

    /* renamed from: s */
    private Map<K, V> f22509s = Collections.emptyMap();

    /* synthetic */ C8218ff(int i, C8565ye yeVar) {
        this.f22504f = i;
    }

    /* renamed from: k */
    private final int m28508k(K k) {
        int size = this.f22505o.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f22505o.get(size).mo21730e());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f22505o.get(i2).mo21730e());
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
    /* renamed from: l */
    public final V m28509l(int i) {
        m28511n();
        V value = this.f22505o.remove(i).getValue();
        if (!this.f22506p.isEmpty()) {
            Iterator it = m28510m().entrySet().iterator();
            List<C8161cf> list = this.f22505o;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C8161cf(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap<K, V> m28510m() {
        m28511n();
        if (this.f22506p.isEmpty() && !(this.f22506p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22506p = treeMap;
            this.f22509s = treeMap.descendingMap();
        }
        return (SortedMap) this.f22506p;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m28511n() {
        if (this.f22507q) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo21806a() {
        if (!this.f22507q) {
            this.f22506p = this.f22506p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22506p);
            this.f22509s = this.f22509s.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22509s);
            this.f22507q = true;
        }
    }

    /* renamed from: b */
    public final int mo21807b() {
        return this.f22505o.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo21808c() {
        return this.f22506p.isEmpty() ? C8142bf.m28369a() : this.f22506p.entrySet();
    }

    public final void clear() {
        m28511n();
        if (!this.f22505o.isEmpty()) {
            this.f22505o.clear();
        }
        if (!this.f22506p.isEmpty()) {
            this.f22506p.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m28508k(comparable) >= 0 || this.f22506p.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        m28511n();
        int k2 = m28508k(k);
        if (k2 >= 0) {
            return this.f22505o.get(k2).setValue(v);
        }
        m28511n();
        if (this.f22505o.isEmpty() && !(this.f22505o instanceof ArrayList)) {
            this.f22505o = new ArrayList(this.f22504f);
        }
        int i = -(k2 + 1);
        if (i >= this.f22504f) {
            return m28510m().put(k, v);
        }
        int size = this.f22505o.size();
        int i2 = this.f22504f;
        if (size == i2) {
            C8161cf remove = this.f22505o.remove(i2 - 1);
            m28510m().put(remove.mo21730e(), remove.getValue());
        }
        this.f22505o.add(i, new C8161cf(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f22508r == null) {
            this.f22508r = new C8199ef(this, (C8565ye) null);
        }
        return this.f22508r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8218ff)) {
            return super.equals(obj);
        }
        C8218ff ffVar = (C8218ff) obj;
        int size = size();
        if (size != ffVar.size()) {
            return false;
        }
        int b = mo21807b();
        if (b != ffVar.mo21807b()) {
            return entrySet().equals(ffVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo21814g(i).equals(ffVar.mo21814g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f22506p.equals(ffVar.f22506p);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry<K, V> mo21814g(int i) {
        return this.f22505o.get(i);
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m28508k(comparable);
        return k >= 0 ? this.f22505o.get(k).getValue() : this.f22506p.get(comparable);
    }

    public final int hashCode() {
        int b = mo21807b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f22505o.get(i2).hashCode();
        }
        return this.f22506p.size() > 0 ? i + this.f22506p.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo21817j() {
        return this.f22507q;
    }

    public final V remove(Object obj) {
        m28511n();
        Comparable comparable = (Comparable) obj;
        int k = m28508k(comparable);
        if (k >= 0) {
            return m28509l(k);
        }
        if (this.f22506p.isEmpty()) {
            return null;
        }
        return this.f22506p.remove(comparable);
    }

    public final int size() {
        return this.f22505o.size() + this.f22506p.size();
    }
}
