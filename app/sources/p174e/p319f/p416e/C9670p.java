package p174e.p319f.p416e;

import p174e.p319f.p416e.p420s.p421m.C9691a;

/* renamed from: e.f.e.p */
public class C9670p {

    /* renamed from: a */
    private final float f25864a;

    /* renamed from: b */
    private final float f25865b;

    public C9670p(float f, float f2) {
        this.f25864a = f;
        this.f25865b = f2;
    }

    /* renamed from: a */
    private static float m32868a(C9670p pVar, C9670p pVar2, C9670p pVar3) {
        float f = pVar2.f25864a;
        float f2 = pVar2.f25865b;
        return ((pVar3.f25864a - f) * (pVar.f25865b - f2)) - ((pVar3.f25865b - f2) * (pVar.f25864a - f));
    }

    /* renamed from: b */
    public static float m32869b(C9670p pVar, C9670p pVar2) {
        return C9691a.m32980a(pVar.f25864a, pVar.f25865b, pVar2.f25864a, pVar2.f25865b);
    }

    /* renamed from: e */
    public static void m32870e(C9670p[] pVarArr) {
        C9670p pVar;
        C9670p pVar2;
        C9670p pVar3;
        float b = m32869b(pVarArr[0], pVarArr[1]);
        float b2 = m32869b(pVarArr[1], pVarArr[2]);
        float b3 = m32869b(pVarArr[0], pVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            pVar3 = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar = pVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            pVar3 = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar = pVarArr[1];
        } else {
            pVar3 = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar = pVarArr[2];
        }
        if (m32868a(pVar2, pVar3, pVar) < 0.0f) {
            C9670p pVar4 = pVar;
            pVar = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar3;
        pVarArr[2] = pVar;
    }

    /* renamed from: c */
    public final float mo24230c() {
        return this.f25864a;
    }

    /* renamed from: d */
    public final float mo24231d() {
        return this.f25865b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9670p) {
            C9670p pVar = (C9670p) obj;
            return this.f25864a == pVar.f25864a && this.f25865b == pVar.f25865b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f25864a) * 31) + Float.floatToIntBits(this.f25865b);
    }

    public final String toString() {
        return "(" + this.f25864a + ',' + this.f25865b + ')';
    }
}
