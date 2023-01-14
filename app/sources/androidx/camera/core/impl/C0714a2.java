package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.C0809g1;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.a2 */
public final class C0714a2 extends C0802e2 implements C0922z1 {

    /* renamed from: z */
    private static final C0809g1.C0812c f2223z = C0809g1.C0812c.OPTIONAL;

    private C0714a2(TreeMap<C0809g1.C0810a<?>, Map<C0809g1.C0812c, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: J */
    public static C0714a2 m2954J() {
        return new C0714a2(new TreeMap(C0802e2.f2384w));
    }

    /* renamed from: K */
    public static C0714a2 m2955K(C0809g1 g1Var) {
        TreeMap treeMap = new TreeMap(C0802e2.f2384w);
        for (C0809g1.C0810a next : g1Var.mo2496c()) {
            Set<C0809g1.C0812c> v = g1Var.mo2507v(next);
            ArrayMap arrayMap = new ArrayMap();
            for (C0809g1.C0812c next2 : v) {
                arrayMap.put(next2, g1Var.mo2503n(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new C0714a2(treeMap);
    }

    /* renamed from: L */
    public <ValueT> ValueT mo2812L(C0809g1.C0810a<ValueT> aVar) {
        return this.f2386y.remove(aVar);
    }

    /* renamed from: l */
    public <ValueT> void mo2813l(C0809g1.C0810a<ValueT> aVar, C0809g1.C0812c cVar, ValueT valuet) {
        Map map = this.f2386y.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f2386y.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        C0809g1.C0812c cVar2 = (C0809g1.C0812c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !C0805f1.m3165a(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.mo2986c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    /* renamed from: q */
    public <ValueT> void mo2814q(C0809g1.C0810a<ValueT> aVar, ValueT valuet) {
        mo2813l(aVar, f2223z, valuet);
    }
}
