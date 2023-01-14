package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: e.f.a.c.f.l.ce */
public final class C8160ce<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    private static final C8160ce f22163f;

    /* renamed from: o */
    private boolean f22164o = true;

    static {
        C8160ce ceVar = new C8160ce();
        f22163f = ceVar;
        ceVar.f22164o = false;
    }

    private C8160ce() {
    }

    private C8160ce(Map<K, V> map) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> C8160ce<K, V> m28390c() {
        return f22163f;
    }

    /* renamed from: i */
    private static int m28391i(Object obj) {
        if (obj instanceof byte[]) {
            return C8311kd.m28698b((byte[]) obj);
        }
        if (!(obj instanceof C8235gd)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    private final void m28392j() {
        if (!this.f22164o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        m28392j();
        super.clear();
    }

    /* renamed from: d */
    public final C8160ce<K, V> mo21719d() {
        return isEmpty() ? new C8160ce<>() : new C8160ce<>(this);
    }

    /* renamed from: e */
    public final void mo21720e() {
        this.f22164o = false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo21723f(C8160ce<K, V> ceVar) {
        m28392j();
        if (!ceVar.isEmpty()) {
            putAll(ceVar);
        }
    }

    /* renamed from: g */
    public final boolean mo21724g() {
        return this.f22164o;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m28391i(entry.getValue()) ^ m28391i(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m28392j();
        C8311kd.m28701e(k);
        C8311kd.m28701e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m28392j();
        for (Object next : map.keySet()) {
            C8311kd.m28701e(next);
            C8311kd.m28701e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m28392j();
        return super.remove(obj);
    }
}
