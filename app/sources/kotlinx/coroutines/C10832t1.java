package kotlinx.coroutines;

import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.t1 */
public abstract class C10832t1 extends C10682a0 implements C10849y0, C10727i1 {

    /* renamed from: q */
    public C10835u1 f28372q;

    /* renamed from: b */
    public boolean mo26676b() {
        return true;
    }

    /* renamed from: c */
    public C10853z1 mo26677c() {
        return null;
    }

    /* renamed from: e */
    public void mo26616e() {
        mo26837u().mo26848j0(this);
    }

    public String toString() {
        return C10822q0.m36786a(this) + '@' + C10822q0.m36787b(this) + "[job@" + C10822q0.m36787b(mo26837u()) + ']';
    }

    /* renamed from: u */
    public final C10835u1 mo26837u() {
        C10835u1 u1Var = this.f28372q;
        if (u1Var != null) {
            return u1Var;
        }
        C10457l.m35332q("job");
        return null;
    }

    /* renamed from: v */
    public final void mo26838v(C10835u1 u1Var) {
        this.f28372q = u1Var;
    }
}
