package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.List;
import okhttp3.internal.p510ws.WebSocketProtocol;

/* renamed from: e.f.a.c.f.g.m0 */
public final class C6891m0 extends C7066x {
    protected C6891m0() {
        this.f19041a.add(C6907n0.ASSIGN);
        this.f19041a.add(C6907n0.CONST);
        this.f19041a.add(C6907n0.CREATE_ARRAY);
        this.f19041a.add(C6907n0.CREATE_OBJECT);
        this.f19041a.add(C6907n0.EXPRESSION_LIST);
        this.f19041a.add(C6907n0.GET);
        this.f19041a.add(C6907n0.GET_INDEX);
        this.f19041a.add(C6907n0.GET_PROPERTY);
        this.f19041a.add(C6907n0.NULL);
        this.f19041a.add(C6907n0.SET_PROPERTY);
        this.f19041a.add(C6907n0.TYPEOF);
        this.f19041a.add(C6907n0.UNDEFINED);
        this.f19041a.add(C6907n0.VAR);
    }

    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        String str2;
        C6907n0 n0Var = C6907n0.ADD;
        int ordinal = C7008t5.m26535e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C7008t5.m26538h(C6907n0.ASSIGN.name(), 2, list);
            C6954q b = s4Var.mo20144b((C6954q) list.get(0));
            if (!(b instanceof C7018u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (s4Var.mo20150h(b.mo19741g())) {
                C6954q b2 = s4Var.mo20144b((C6954q) list.get(1));
                s4Var.mo20149g(b.mo19741g(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo19741g()}));
            }
        } else if (ordinal == 14) {
            C7008t5.m26539i(C6907n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C6954q b3 = s4Var.mo20144b((C6954q) list.get(i2));
                    if (b3 instanceof C7018u) {
                        s4Var.mo20148f(b3.mo19741g(), s4Var.mo20144b((C6954q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C6954q.f18804c;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C7008t5.m26539i(C6907n0.EXPRESSION_LIST.name(), 1, list);
            C6954q qVar = C6954q.f18804c;
            while (i < list.size()) {
                qVar = s4Var.mo20144b((C6954q) list.get(i));
                if (!(qVar instanceof C6810h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C7008t5.m26538h(C6907n0.GET.name(), 1, list);
            C6954q b4 = s4Var.mo20144b((C6954q) list.get(0));
            if (b4 instanceof C7018u) {
                return s4Var.mo20146d(b4.mo19741g());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C7008t5.m26538h(C6907n0.NULL.name(), 0, list);
            return C6954q.f18805d;
        } else if (ordinal == 58) {
            C7008t5.m26538h(C6907n0.SET_PROPERTY.name(), 3, list);
            C6954q b5 = s4Var.mo20144b((C6954q) list.get(0));
            C6954q b6 = s4Var.mo20144b((C6954q) list.get(1));
            C6954q b7 = s4Var.mo20144b((C6954q) list.get(2));
            if (b5 == C6954q.f18804c || b5 == C6954q.f18805d) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo19741g(), b5.mo19741g()}));
            }
            if ((b5 instanceof C6777f) && (b6 instanceof C6826i)) {
                ((C6777f) b5).mo19736H(b6.mo19739d().intValue(), b7);
            } else if (b5 instanceof C6890m) {
                ((C6890m) b5).mo19747o(b6.mo19741g(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C7008t5.m26538h(C6907n0.GET_PROPERTY.name(), 2, list);
                    C6954q b8 = s4Var.mo20144b((C6954q) list.get(0));
                    C6954q b9 = s4Var.mo20144b((C6954q) list.get(1));
                    if ((b8 instanceof C6777f) && C7008t5.m26541k(b9)) {
                        return ((C6777f) b8).mo19729A(b9.mo19739d().intValue());
                    }
                    if (b8 instanceof C6890m) {
                        return ((C6890m) b8).mo19749r(b9.mo19741g());
                    }
                    if (b8 instanceof C7018u) {
                        if ("length".equals(b9.mo19741g())) {
                            return new C6826i(Double.valueOf((double) b8.mo19741g().length()));
                        }
                        if (C7008t5.m26541k(b9) && b9.mo19739d().doubleValue() < ((double) b8.mo19741g().length())) {
                            return new C7018u(String.valueOf(b8.mo19741g().charAt(b9.mo19739d().intValue())));
                        }
                    }
                    return C6954q.f18804c;
                }
                switch (ordinal) {
                    case 62:
                        C7008t5.m26538h(C6907n0.TYPEOF.name(), 1, list);
                        C6954q b10 = s4Var.mo20144b((C6954q) list.get(0));
                        if (b10 instanceof C7034v) {
                            str2 = "undefined";
                        } else if (b10 instanceof C6794g) {
                            str2 = "boolean";
                        } else if (b10 instanceof C6826i) {
                            str2 = "number";
                        } else if (b10 instanceof C7018u) {
                            str2 = "string";
                        } else if (b10 instanceof C6938p) {
                            str2 = "function";
                        } else if ((b10 instanceof C6970r) || (b10 instanceof C6810h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C7018u(str2);
                    case 63:
                        C7008t5.m26538h(C6907n0.UNDEFINED.name(), 0, list);
                        return C6954q.f18804c;
                    case WebSocketProtocol.B0_FLAG_RSV1 /*64*/:
                        C7008t5.m26539i(C6907n0.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C6954q b11 = s4Var.mo20144b((C6954q) it.next());
                            if (b11 instanceof C7018u) {
                                s4Var.mo20147e(b11.mo19741g(), C6954q.f18804c);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return C6954q.f18804c;
                    default:
                        return super.mo20424b(str);
                }
            } else if (list.isEmpty()) {
                return new C6906n();
            } else {
                if (list.size() % 2 == 0) {
                    C6906n nVar = new C6906n();
                    while (i < list.size() - 1) {
                        C6954q b12 = s4Var.mo20144b((C6954q) list.get(i));
                        C6954q b13 = s4Var.mo20144b((C6954q) list.get(i + 1));
                        if ((b12 instanceof C6810h) || (b13 instanceof C6810h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo19747o(b12.mo19741g(), b13);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C6777f();
        } else {
            C6777f fVar = new C6777f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C6954q b14 = s4Var.mo20144b((C6954q) it2.next());
                if (!(b14 instanceof C6810h)) {
                    fVar.mo19736H(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
