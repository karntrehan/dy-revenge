package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.g.j0 */
public final class C6843j0 extends C7066x {
    protected C6843j0() {
        this.f19041a.add(C6907n0.FOR_IN);
        this.f19041a.add(C6907n0.FOR_IN_CONST);
        this.f19041a.add(C6907n0.FOR_IN_LET);
        this.f19041a.add(C6907n0.FOR_LET);
        this.f19041a.add(C6907n0.FOR_OF);
        this.f19041a.add(C6907n0.FOR_OF_CONST);
        this.f19041a.add(C6907n0.FOR_OF_LET);
        this.f19041a.add(C6907n0.WHILE);
    }

    /* renamed from: c */
    private static C6954q m25928c(C6811h0 h0Var, Iterator it, C6954q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C6954q c = h0Var.mo19753a((C6954q) it.next()).mo20145c((C6777f) qVar);
                if (c instanceof C6810h) {
                    C6810h hVar = (C6810h) c;
                    if ("break".equals(hVar.mo19808c())) {
                        return C6954q.f18804c;
                    }
                    if ("return".equals(hVar.mo19808c())) {
                        return hVar;
                    }
                }
            }
        }
        return C6954q.f18804c;
    }

    /* renamed from: d */
    private static C6954q m25929d(C6811h0 h0Var, C6954q qVar, C6954q qVar2) {
        return m25928c(h0Var, qVar.mo19745j(), qVar2);
    }

    /* renamed from: e */
    private static C6954q m25930e(C6811h0 h0Var, C6954q qVar, C6954q qVar2) {
        if (qVar instanceof Iterable) {
            return m25928c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        C6907n0 n0Var = C6907n0.ADD;
        int ordinal = C7008t5.m26535e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C7008t5.m26538h(C6907n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C7018u) {
                        String g = ((C6954q) list.get(0)).mo19741g();
                        return m25929d(new C6827i0(s4Var, g), s4Var.mo20144b((C6954q) list.get(1)), s4Var.mo20144b((C6954q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C7008t5.m26538h(C6907n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C7018u) {
                        String g2 = ((C6954q) list.get(0)).mo19741g();
                        return m25929d(new C6778f0(s4Var, g2), s4Var.mo20144b((C6954q) list.get(1)), s4Var.mo20144b((C6954q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C7008t5.m26538h(C6907n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C7018u) {
                        String g3 = ((C6954q) list.get(0)).mo19741g();
                        return m25929d(new C6795g0(s4Var, g3), s4Var.mo20144b((C6954q) list.get(1)), s4Var.mo20144b((C6954q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C7008t5.m26538h(C6907n0.FOR_LET.name(), 4, list);
                    C6954q b = s4Var.mo20144b((C6954q) list.get(0));
                    if (b instanceof C6777f) {
                        C6777f fVar = (C6777f) b;
                        C6954q qVar = (C6954q) list.get(1);
                        C6954q qVar2 = (C6954q) list.get(2);
                        C6954q b2 = s4Var.mo20144b((C6954q) list.get(3));
                        C6991s4 a = s4Var.mo20143a();
                        for (int i = 0; i < fVar.mo19752z(); i++) {
                            String g4 = fVar.mo19729A(i).mo19741g();
                            a.mo20149g(g4, s4Var.mo20146d(g4));
                        }
                        while (s4Var.mo20144b(qVar).mo19742h().booleanValue()) {
                            C6954q c = s4Var.mo20145c((C6777f) b2);
                            if (c instanceof C6810h) {
                                C6810h hVar = (C6810h) c;
                                if ("break".equals(hVar.mo19808c())) {
                                    return C6954q.f18804c;
                                }
                                if ("return".equals(hVar.mo19808c())) {
                                    return hVar;
                                }
                            }
                            C6991s4 a2 = s4Var.mo20143a();
                            for (int i2 = 0; i2 < fVar.mo19752z(); i2++) {
                                String g5 = fVar.mo19729A(i2).mo19741g();
                                a2.mo20149g(g5, a.mo20146d(g5));
                            }
                            a2.mo20144b(qVar2);
                            a = a2;
                        }
                        return C6954q.f18804c;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C7008t5.m26538h(C6907n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C7018u) {
                        String g6 = ((C6954q) list.get(0)).mo19741g();
                        return m25930e(new C6827i0(s4Var, g6), s4Var.mo20144b((C6954q) list.get(1)), s4Var.mo20144b((C6954q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C7008t5.m26538h(C6907n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C7018u) {
                        String g7 = ((C6954q) list.get(0)).mo19741g();
                        return m25930e(new C6778f0(s4Var, g7), s4Var.mo20144b((C6954q) list.get(1)), s4Var.mo20144b((C6954q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C7008t5.m26538h(C6907n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C7018u) {
                        String g8 = ((C6954q) list.get(0)).mo19741g();
                        return m25930e(new C6795g0(s4Var, g8), s4Var.mo20144b((C6954q) list.get(1)), s4Var.mo20144b((C6954q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo20424b(str);
            }
        } else {
            C7008t5.m26538h(C6907n0.WHILE.name(), 4, list);
            C6954q qVar3 = (C6954q) list.get(0);
            C6954q qVar4 = (C6954q) list.get(1);
            C6954q b3 = s4Var.mo20144b((C6954q) list.get(3));
            if (s4Var.mo20144b((C6954q) list.get(2)).mo19742h().booleanValue()) {
                C6954q c2 = s4Var.mo20145c((C6777f) b3);
                if (c2 instanceof C6810h) {
                    C6810h hVar2 = (C6810h) c2;
                    if (!"break".equals(hVar2.mo19808c())) {
                        if ("return".equals(hVar2.mo19808c())) {
                            return hVar2;
                        }
                    }
                    return C6954q.f18804c;
                }
            }
            while (s4Var.mo20144b(qVar3).mo19742h().booleanValue()) {
                C6954q c3 = s4Var.mo20145c((C6777f) b3);
                if (c3 instanceof C6810h) {
                    C6810h hVar3 = (C6810h) c3;
                    if ("break".equals(hVar3.mo19808c())) {
                        break;
                    } else if ("return".equals(hVar3.mo19808c())) {
                        return hVar3;
                    }
                }
                s4Var.mo20144b(qVar4);
            }
            return C6954q.f18804c;
        }
    }
}
