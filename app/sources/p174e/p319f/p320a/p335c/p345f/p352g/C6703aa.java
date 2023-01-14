package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: e.f.a.c.f.g.aa */
public final class C6703aa extends LinkedHashMap {

    /* renamed from: f */
    private static final C6703aa f18349f;

    /* renamed from: o */
    private boolean f18350o = true;

    static {
        C6703aa aaVar = new C6703aa();
        f18349f = aaVar;
        aaVar.f18350o = false;
    }

    private C6703aa() {
    }

    private C6703aa(Map map) {
        super(map);
    }

    /* renamed from: c */
    public static C6703aa m25430c() {
        return f18349f;
    }

    /* renamed from: i */
    private static int m25431i(Object obj) {
        return obj instanceof byte[] ? C6820h9.m25833b((byte[]) obj) : obj.hashCode();
    }

    /* renamed from: j */
    private final void m25432j() {
        if (!this.f18350o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        m25432j();
        super.clear();
    }

    /* renamed from: d */
    public final C6703aa mo19528d() {
        return isEmpty() ? new C6703aa() : new C6703aa(this);
    }

    /* renamed from: e */
    public final void mo19529e() {
        this.f18350o = false;
    }

    public final Set entrySet() {
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
    public final void mo19532f(C6703aa aaVar) {
        m25432j();
        if (!aaVar.isEmpty()) {
            putAll(aaVar);
        }
    }

    /* renamed from: g */
    public final boolean mo19533g() {
        return this.f18350o;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m25431i(entry.getValue()) ^ m25431i(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m25432j();
        C6820h9.m25836e(obj);
        C6820h9.m25836e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m25432j();
        for (Object next : map.keySet()) {
            C6820h9.m25836e(next);
            C6820h9.m25836e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m25432j();
        return super.remove(obj);
    }
}
