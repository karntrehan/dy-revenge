package androidx.camera.core.impl;

import androidx.camera.core.impl.C0809g1;

/* renamed from: androidx.camera.core.impl.f1 */
public final /* synthetic */ class C0805f1 {
    /* renamed from: a */
    public static boolean m3165a(C0809g1.C0812c cVar, C0809g1.C0812c cVar2) {
        C0809g1.C0812c cVar3 = C0809g1.C0812c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        C0809g1.C0812c cVar4 = C0809g1.C0812c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    /* renamed from: b */
    public static C0809g1 m3166b(C0809g1 g1Var, C0809g1 g1Var2) {
        if (g1Var == null && g1Var2 == null) {
            return C0802e2.m3154G();
        }
        C0714a2 K = g1Var2 != null ? C0714a2.m2955K(g1Var2) : C0714a2.m2954J();
        if (g1Var != null) {
            for (C0809g1.C0810a next : g1Var.mo2496c()) {
                K.mo2813l(next, g1Var.mo2498e(next), g1Var.mo2494a(next));
            }
        }
        return C0802e2.m3155H(K);
    }
}
