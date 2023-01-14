package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10761t;
import kotlinx.coroutines.internal.C10767z;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.h2 */
public final class C10723h2<T> extends C10761t<T> {

    /* renamed from: q */
    private C10381g f28206q;

    /* renamed from: r */
    private Object f28207r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10723h2(p455g.p462v.C10381g r3, p455g.p462v.C10376d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.i2 r0 = kotlinx.coroutines.C10728i2.f28211f
            g.v.g$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            g.v.g r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10723h2.<init>(g.v.g, g.v.d):void");
    }

    /* renamed from: B0 */
    public final boolean mo26679B0() {
        if (this.f28206q == null) {
            return false;
        }
        this.f28206q = null;
        this.f28207r = null;
        return true;
    }

    /* renamed from: C0 */
    public final void mo26680C0(C10381g gVar, Object obj) {
        this.f28206q = gVar;
        this.f28207r = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo26651x0(Object obj) {
        C10381g gVar = this.f28206q;
        C10723h2<?> h2Var = null;
        if (gVar != null) {
            C10767z.m36610a(gVar, this.f28207r);
            this.f28206q = h2Var;
            this.f28207r = h2Var;
        }
        Object a = C10695c0.m36406a(obj, this.f28266p);
        C10376d<T> dVar = this.f28266p;
        C10381g a2 = dVar.mo25781a();
        Object c = C10767z.m36612c(a2, h2Var);
        if (c != C10767z.f28271a) {
            h2Var = C10703e0.m36422e(dVar, a2, c);
        }
        try {
            this.f28266p.mo25782d(a);
            C10323s sVar = C10323s.f27547a;
        } finally {
            if (h2Var == null || h2Var.mo26679B0()) {
                C10767z.m36610a(a2, c);
            }
        }
    }
}
