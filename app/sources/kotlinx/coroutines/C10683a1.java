package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10729a;

/* renamed from: kotlinx.coroutines.a1 */
public abstract class C10683a1 extends C10707f0 {

    /* renamed from: o */
    private long f28168o;

    /* renamed from: p */
    private boolean f28169p;

    /* renamed from: q */
    private C10729a<C10840v0<?>> f28170q;

    /* renamed from: B0 */
    public static /* synthetic */ void m36353B0(C10683a1 a1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            a1Var.mo26608A0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: x0 */
    private final long m36354x0(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: A0 */
    public final void mo26608A0(boolean z) {
        this.f28168o += m36354x0(z);
        if (!z) {
            this.f28169p = true;
        }
    }

    /* renamed from: C0 */
    public final boolean mo26609C0() {
        return this.f28168o >= m36354x0(true);
    }

    /* renamed from: D0 */
    public final boolean mo26610D0() {
        C10729a<C10840v0<?>> aVar = this.f28170q;
        if (aVar == null) {
            return true;
        }
        return aVar.mo26688c();
    }

    /* renamed from: E0 */
    public final boolean mo26611E0() {
        C10840v0 d;
        C10729a<C10840v0<?>> aVar = this.f28170q;
        if (aVar == null || (d = aVar.mo26689d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }

    /* renamed from: w0 */
    public final void mo26613w0(boolean z) {
        long x0 = this.f28168o - m36354x0(z);
        this.f28168o = x0;
        if (x0 <= 0) {
            if (C10819p0.m36781a()) {
                if (!(this.f28168o == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f28169p) {
                shutdown();
            }
        }
    }

    /* renamed from: y0 */
    public final void mo26614y0(C10840v0<?> v0Var) {
        C10729a<C10840v0<?>> aVar = this.f28170q;
        if (aVar == null) {
            aVar = new C10729a<>();
            this.f28170q = aVar;
        }
        aVar.mo26687a(v0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public long mo26615z0() {
        C10729a<C10840v0<?>> aVar = this.f28170q;
        return (aVar != null && !aVar.mo26688c()) ? 0 : Long.MAX_VALUE;
    }
}
