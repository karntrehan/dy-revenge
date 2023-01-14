package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.f.a.c.f.g.k0 */
public final class C6859k0 extends C7066x {
    protected C6859k0() {
        this.f19041a.add(C6907n0.ADD);
        this.f19041a.add(C6907n0.DIVIDE);
        this.f19041a.add(C6907n0.MODULUS);
        this.f19041a.add(C6907n0.MULTIPLY);
        this.f19041a.add(C6907n0.NEGATE);
        this.f19041a.add(C6907n0.POST_DECREMENT);
        this.f19041a.add(C6907n0.POST_INCREMENT);
        this.f19041a.add(C6907n0.PRE_DECREMENT);
        this.f19041a.add(C6907n0.PRE_INCREMENT);
        this.f19041a.add(C6907n0.SUBTRACT);
    }

    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        C6907n0 n0Var = C6907n0.ADD;
        int ordinal = C7008t5.m26535e(str).ordinal();
        if (ordinal == 0) {
            C7008t5.m26538h(n0Var.name(), 2, list);
            C6954q b = s4Var.mo20144b((C6954q) list.get(0));
            C6954q b2 = s4Var.mo20144b((C6954q) list.get(1));
            return ((b instanceof C6890m) || (b instanceof C7018u) || (b2 instanceof C6890m) || (b2 instanceof C7018u)) ? new C7018u(String.valueOf(b.mo19741g()).concat(String.valueOf(b2.mo19741g()))) : new C6826i(Double.valueOf(b.mo19739d().doubleValue() + b2.mo19739d().doubleValue()));
        } else if (ordinal == 21) {
            C7008t5.m26538h(C6907n0.DIVIDE.name(), 2, list);
            return new C6826i(Double.valueOf(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue() / s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()));
        } else if (ordinal == 59) {
            C7008t5.m26538h(C6907n0.SUBTRACT.name(), 2, list);
            return new C6826i(Double.valueOf(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue() + new C6826i(Double.valueOf(-s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue())).mo19739d().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C7008t5.m26538h(str, 2, list);
            C6954q b3 = s4Var.mo20144b((C6954q) list.get(0));
            s4Var.mo20144b((C6954q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C7008t5.m26538h(str, 1, list);
            return s4Var.mo20144b((C6954q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C7008t5.m26538h(C6907n0.MODULUS.name(), 2, list);
                    return new C6826i(Double.valueOf(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue() % s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()));
                case C9024k.f24746n4 /*45*/:
                    C7008t5.m26538h(C6907n0.MULTIPLY.name(), 2, list);
                    return new C6826i(Double.valueOf(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue() * s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()));
                case C9024k.f24752o4 /*46*/:
                    C7008t5.m26538h(C6907n0.NEGATE.name(), 1, list);
                    return new C6826i(Double.valueOf(-s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()));
                default:
                    return super.mo20424b(str);
            }
        }
    }
}
