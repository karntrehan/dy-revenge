package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: e.f.a.c.f.g.fb */
class C6789fb extends AbstractMap {

    /* renamed from: f */
    private final int f18481f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List f18482o = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map f18483p = Collections.emptyMap();

    /* renamed from: q */
    private boolean f18484q;

    /* renamed from: r */
    private volatile C6755db f18485r;

    /* renamed from: s */
    private Map f18486s = Collections.emptyMap();

    /* synthetic */ C6789fb(int i, C6772eb ebVar) {
        this.f18481f = i;
    }

    /* renamed from: k */
    private final int m25706k(Comparable comparable) {
        int size = this.f18482o.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C7109za) this.f18482o.get(size)).mo20479e());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C7109za) this.f18482o.get(i2)).mo20479e());
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
    public final Object m25707l(int i) {
        m25709n();
        Object value = ((C7109za) this.f18482o.remove(i)).getValue();
        if (!this.f18483p.isEmpty()) {
            Iterator it = m25708m().entrySet().iterator();
            List list = this.f18482o;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C7109za(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m25708m() {
        m25709n();
        if (this.f18483p.isEmpty() && !(this.f18483p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18483p = treeMap;
            this.f18486s = treeMap.descendingMap();
        }
        return (SortedMap) this.f18483p;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m25709n() {
        if (this.f18484q) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo19769a() {
        if (!this.f18484q) {
            this.f18483p = this.f18483p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18483p);
            this.f18486s = this.f18486s.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18486s);
            this.f18484q = true;
        }
    }

    /* renamed from: b */
    public final int mo19770b() {
        return this.f18482o.size();
    }

    /* renamed from: c */
    public final Iterable mo19771c() {
        return this.f18483p.isEmpty() ? C7093ya.m27047a() : this.f18483p.entrySet();
    }

    public final void clear() {
        m25709n();
        if (!this.f18482o.isEmpty()) {
            this.f18482o.clear();
        }
        if (!this.f18483p.isEmpty()) {
            this.f18483p.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m25706k(comparable) >= 0 || this.f18483p.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m25709n();
        int k = m25706k(comparable);
        if (k >= 0) {
            return ((C7109za) this.f18482o.get(k)).setValue(obj);
        }
        m25709n();
        if (this.f18482o.isEmpty() && !(this.f18482o instanceof ArrayList)) {
            this.f18482o = new ArrayList(this.f18481f);
        }
        int i = -(k + 1);
        if (i >= this.f18481f) {
            return m25708m().put(comparable, obj);
        }
        int size = this.f18482o.size();
        int i2 = this.f18481f;
        if (size == i2) {
            C7109za zaVar = (C7109za) this.f18482o.remove(i2 - 1);
            m25708m().put(zaVar.mo20479e(), zaVar.getValue());
        }
        this.f18482o.add(i, new C7109za(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f18485r == null) {
            this.f18485r = new C6755db(this, (C6738cb) null);
        }
        return this.f18485r;
    }

    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6789fb)) {
            return super.equals(obj);
        }
        C6789fb fbVar = (C6789fb) obj;
        int size = size();
        if (size != fbVar.size()) {
            return false;
        }
        int b = mo19770b();
        if (b == fbVar.mo19770b()) {
            for (int i = 0; i < b; i++) {
                if (!mo19777g(i).equals(fbVar.mo19777g(i))) {
                    return false;
                }
            }
            if (b == size) {
                return true;
            }
            entrySet = this.f18483p;
            entrySet2 = fbVar.f18483p;
        } else {
            entrySet = entrySet();
            entrySet2 = fbVar.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    /* renamed from: g */
    public final Map.Entry mo19777g(int i) {
        return (Map.Entry) this.f18482o.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m25706k(comparable);
        return k >= 0 ? ((C7109za) this.f18482o.get(k)).getValue() : this.f18483p.get(comparable);
    }

    public final int hashCode() {
        int b = mo19770b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C7109za) this.f18482o.get(i2)).hashCode();
        }
        return this.f18483p.size() > 0 ? i + this.f18483p.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo19780j() {
        return this.f18484q;
    }

    public final Object remove(Object obj) {
        m25709n();
        Comparable comparable = (Comparable) obj;
        int k = m25706k(comparable);
        if (k >= 0) {
            return m25707l(k);
        }
        if (this.f18483p.isEmpty()) {
            return null;
        }
        return this.f18483p.remove(comparable);
    }

    public final int size() {
        return this.f18482o.size() + this.f18483p.size();
    }
}
