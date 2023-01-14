package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.C0809g1;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.e2 */
public class C0802e2 implements C0809g1 {

    /* renamed from: w */
    protected static final Comparator<C0809g1.C0810a<?>> f2384w;

    /* renamed from: x */
    private static final C0802e2 f2385x;

    /* renamed from: y */
    protected final TreeMap<C0809g1.C0810a<?>, Map<C0809g1.C0812c, Object>> f2386y;

    static {
        C0847n nVar = C0847n.f2487f;
        f2384w = nVar;
        f2385x = new C0802e2(new TreeMap(nVar));
    }

    C0802e2(TreeMap<C0809g1.C0810a<?>, Map<C0809g1.C0812c, Object>> treeMap) {
        this.f2386y = treeMap;
    }

    /* renamed from: G */
    public static C0802e2 m3154G() {
        return f2385x;
    }

    /* renamed from: H */
    public static C0802e2 m3155H(C0809g1 g1Var) {
        if (C0802e2.class.equals(g1Var.getClass())) {
            return (C0802e2) g1Var;
        }
        TreeMap treeMap = new TreeMap(f2384w);
        for (C0809g1.C0810a next : g1Var.mo2496c()) {
            Set<C0809g1.C0812c> v = g1Var.mo2507v(next);
            ArrayMap arrayMap = new ArrayMap();
            for (C0809g1.C0812c next2 : v) {
                arrayMap.put(next2, g1Var.mo2503n(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new C0802e2(treeMap);
    }

    /* renamed from: a */
    public <ValueT> ValueT mo2494a(C0809g1.C0810a<ValueT> aVar) {
        Map map = this.f2386y.get(aVar);
        if (map != null) {
            return map.get((C0809g1.C0812c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    /* renamed from: b */
    public boolean mo2495b(C0809g1.C0810a<?> aVar) {
        return this.f2386y.containsKey(aVar);
    }

    /* renamed from: c */
    public Set<C0809g1.C0810a<?>> mo2496c() {
        return Collections.unmodifiableSet(this.f2386y.keySet());
    }

    /* renamed from: d */
    public <ValueT> ValueT mo2497d(C0809g1.C0810a<ValueT> aVar, ValueT valuet) {
        try {
            return mo2494a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    /* renamed from: e */
    public C0809g1.C0812c mo2498e(C0809g1.C0810a<?> aVar) {
        Map map = this.f2386y.get(aVar);
        if (map != null) {
            return (C0809g1.C0812c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2502m(java.lang.String r4, androidx.camera.core.impl.C0809g1.C0811b r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            androidx.camera.core.impl.g1$a r0 = androidx.camera.core.impl.C0809g1.C0810a.m3180a(r4, r0)
            java.util.TreeMap<androidx.camera.core.impl.g1$a<?>, java.util.Map<androidx.camera.core.impl.g1$c, java.lang.Object>> r1 = r3.f2386y
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.core.impl.g1$a r2 = (androidx.camera.core.impl.C0809g1.C0810a) r2
            java.lang.String r2 = r2.mo2986c()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            java.lang.Object r1 = r1.getKey()
            androidx.camera.core.impl.g1$a r1 = (androidx.camera.core.impl.C0809g1.C0810a) r1
            boolean r1 = r5.mo2519a(r1)
            if (r1 != 0) goto L_0x0014
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0802e2.mo2502m(java.lang.String, androidx.camera.core.impl.g1$b):void");
    }

    /* renamed from: n */
    public <ValueT> ValueT mo2503n(C0809g1.C0810a<ValueT> aVar, C0809g1.C0812c cVar) {
        Map map = this.f2386y.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(cVar)) {
            return map.get(cVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
    }

    /* renamed from: v */
    public Set<C0809g1.C0812c> mo2507v(C0809g1.C0810a<?> aVar) {
        Map map = this.f2386y.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }
}
