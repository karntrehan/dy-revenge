package kotlinx.coroutines;

import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.g2 */
public final class C10719g2 extends C10707f0 {

    /* renamed from: o */
    public static final C10719g2 f28204o = new C10719g2();

    private C10719g2() {
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    /* renamed from: u0 */
    public void mo26625u0(C10381g gVar, Runnable runnable) {
        C10774j2 j2Var = (C10774j2) gVar.get(C10774j2.f28279f);
        if (j2Var != null) {
            j2Var.f28280o = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: v0 */
    public boolean mo26626v0(C10381g gVar) {
        return false;
    }
}
