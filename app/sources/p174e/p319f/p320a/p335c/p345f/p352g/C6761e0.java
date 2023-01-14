package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.e0 */
public final class C6761e0 extends C7066x {
    protected C6761e0() {
        this.f19041a.add(C6907n0.AND);
        this.f19041a.add(C6907n0.NOT);
        this.f19041a.add(C6907n0.OR);
    }

    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        C6907n0 n0Var = C6907n0.ADD;
        int ordinal = C7008t5.m26535e(str).ordinal();
        if (ordinal == 1) {
            C7008t5.m26538h(C6907n0.AND.name(), 2, list);
            C6954q b = s4Var.mo20144b((C6954q) list.get(0));
            if (!b.mo19742h().booleanValue()) {
                return b;
            }
        } else if (ordinal == 47) {
            C7008t5.m26538h(C6907n0.NOT.name(), 1, list);
            return new C6794g(Boolean.valueOf(!s4Var.mo20144b((C6954q) list.get(0)).mo19742h().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo20424b(str);
        } else {
            C7008t5.m26538h(C6907n0.OR.name(), 2, list);
            C6954q b2 = s4Var.mo20144b((C6954q) list.get(0));
            if (b2.mo19742h().booleanValue()) {
                return b2;
            }
        }
        return s4Var.mo20144b((C6954q) list.get(1));
    }
}
