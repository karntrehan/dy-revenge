package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.w */
public final class C7050w extends C7066x {
    public C7050w() {
        this.f19041a.add(C6907n0.BITWISE_AND);
        this.f19041a.add(C6907n0.BITWISE_LEFT_SHIFT);
        this.f19041a.add(C6907n0.BITWISE_NOT);
        this.f19041a.add(C6907n0.BITWISE_OR);
        this.f19041a.add(C6907n0.BITWISE_RIGHT_SHIFT);
        this.f19041a.add(C6907n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f19041a.add(C6907n0.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        C6907n0 n0Var = C6907n0.ADD;
        switch (C7008t5.m26535e(str).ordinal()) {
            case 4:
                C7008t5.m26538h(C6907n0.BITWISE_AND.name(), 2, list);
                return new C6826i(Double.valueOf((double) (C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()) & C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()))));
            case 5:
                C7008t5.m26538h(C6907n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C6826i(Double.valueOf((double) (C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()) << ((int) (C7008t5.m26534d(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()) & 31)))));
            case 6:
                C7008t5.m26538h(C6907n0.BITWISE_NOT.name(), 1, list);
                return new C6826i(Double.valueOf((double) (~C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()))));
            case 7:
                C7008t5.m26538h(C6907n0.BITWISE_OR.name(), 2, list);
                return new C6826i(Double.valueOf((double) (C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()) | C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()))));
            case 8:
                C7008t5.m26538h(C6907n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C6826i(Double.valueOf((double) (C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()) >> ((int) (C7008t5.m26534d(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()) & 31)))));
            case 9:
                C7008t5.m26538h(C6907n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C6826i(Double.valueOf((double) (C7008t5.m26534d(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()) >>> ((int) (C7008t5.m26534d(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()) & 31)))));
            case 10:
                C7008t5.m26538h(C6907n0.BITWISE_XOR.name(), 2, list);
                return new C6826i(Double.valueOf((double) (C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue()) ^ C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue()))));
            default:
                return super.mo20424b(str);
        }
    }
}
