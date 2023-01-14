package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.m0 */
public final class C9513m0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    private static final C9513m0 f25447f;

    /* renamed from: o */
    private boolean f25448o = true;

    static {
        C9513m0 m0Var = new C9513m0();
        f25447f = m0Var;
        m0Var.mo23866l();
    }

    private C9513m0() {
    }

    private C9513m0(Map<K, V> map) {
        super(map);
    }

    /* renamed from: c */
    static <K, V> int m32127c(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m32128d(next.getValue()) ^ m32128d(next.getKey());
        }
        return i;
    }

    /* renamed from: d */
    private static int m32128d(Object obj) {
        if (obj instanceof byte[]) {
            return C9431b0.m31425d((byte[]) obj);
        }
        if (!(obj instanceof C9431b0.C9434c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    private static void m32129e(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C9431b0.m31422a(next);
            C9431b0.m31422a(map.get(next));
        }
    }

    /* renamed from: f */
    public static <K, V> C9513m0<K, V> m32130f() {
        return f25447f;
    }

    /* renamed from: g */
    private void m32131g() {
        if (!mo23865k()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private static boolean m32132i(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean m32133j(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m32132i(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9513m0.m32133j(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        m32131g();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m32133j(this, (Map) obj);
    }

    public int hashCode() {
        return m32127c(this);
    }

    /* renamed from: k */
    public boolean mo23865k() {
        return this.f25448o;
    }

    /* renamed from: l */
    public void mo23866l() {
        this.f25448o = false;
    }

    /* renamed from: m */
    public void mo23867m(C9513m0<K, V> m0Var) {
        m32131g();
        if (!m0Var.isEmpty()) {
            putAll(m0Var);
        }
    }

    /* renamed from: n */
    public C9513m0<K, V> mo23868n() {
        return isEmpty() ? new C9513m0<>() : new C9513m0<>(this);
    }

    public V put(K k, V v) {
        m32131g();
        C9431b0.m31422a(k);
        C9431b0.m31422a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m32131g();
        m32129e(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        m32131g();
        return super.remove(obj);
    }
}
