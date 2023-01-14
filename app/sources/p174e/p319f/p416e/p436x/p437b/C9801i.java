package p174e.p319f.p416e.p436x.p437b;

import p174e.p319f.p416e.C9670p;

/* renamed from: e.f.e.x.b.i */
public final class C9801i {

    /* renamed from: a */
    private final boolean f26258a;

    C9801i(boolean z) {
        this.f26258a = z;
    }

    /* renamed from: a */
    public void mo24524a(C9670p[] pVarArr) {
        if (this.f26258a && pVarArr != null && pVarArr.length >= 3) {
            C9670p pVar = pVarArr[0];
            pVarArr[0] = pVarArr[2];
            pVarArr[2] = pVar;
        }
    }
}
