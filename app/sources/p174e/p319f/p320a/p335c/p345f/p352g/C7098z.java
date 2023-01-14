package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.f.a.c.f.g.z */
public final class C7098z extends C7066x {
    public C7098z() {
        this.f19041a.add(C6907n0.EQUALS);
        this.f19041a.add(C6907n0.GREATER_THAN);
        this.f19041a.add(C6907n0.GREATER_THAN_EQUALS);
        this.f19041a.add(C6907n0.IDENTITY_EQUALS);
        this.f19041a.add(C6907n0.IDENTITY_NOT_EQUALS);
        this.f19041a.add(C6907n0.LESS_THAN);
        this.f19041a.add(C6907n0.LESS_THAN_EQUALS);
        this.f19041a.add(C6907n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m27052c(C6954q qVar, C6954q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C7034v) || (qVar instanceof C6922o)) {
                return true;
            }
            return qVar instanceof C6826i ? !Double.isNaN(qVar.mo19739d().doubleValue()) && !Double.isNaN(qVar2.mo19739d().doubleValue()) && qVar.mo19739d().doubleValue() == qVar2.mo19739d().doubleValue() : qVar instanceof C7018u ? qVar.mo19741g().equals(qVar2.mo19741g()) : qVar instanceof C6794g ? qVar.mo19742h().equals(qVar2.mo19742h()) : qVar == qVar2;
        } else if (((qVar instanceof C7034v) || (qVar instanceof C6922o)) && ((qVar2 instanceof C7034v) || (qVar2 instanceof C6922o))) {
            return true;
        } else {
            boolean z = qVar instanceof C6826i;
            if (z && (qVar2 instanceof C7018u)) {
                return m27052c(qVar, new C6826i(qVar2.mo19739d()));
            }
            boolean z2 = qVar instanceof C7018u;
            if (z2 && (qVar2 instanceof C6826i)) {
                return m27052c(new C6826i(qVar.mo19739d()), qVar2);
            }
            if (qVar instanceof C6794g) {
                return m27052c(new C6826i(qVar.mo19739d()), qVar2);
            }
            if (qVar2 instanceof C6794g) {
                return m27052c(qVar, new C6826i(qVar2.mo19739d()));
            }
            if ((z2 || z) && (qVar2 instanceof C6890m)) {
                return m27052c(qVar, new C7018u(qVar2.mo19741g()));
            }
            if (!(qVar instanceof C6890m) || (!(qVar2 instanceof C7018u) && !(qVar2 instanceof C6826i))) {
                return false;
            }
            return m27052c(new C7018u(qVar.mo19741g()), qVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m27053d(p174e.p319f.p320a.p335c.p345f.p352g.C6954q r8, p174e.p319f.p320a.p335c.p345f.p352g.C6954q r9) {
        /*
            boolean r0 = r8 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6890m
            if (r0 == 0) goto L_0x000e
            e.f.a.c.f.g.u r0 = new e.f.a.c.f.g.u
            java.lang.String r8 = r8.mo19741g()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6890m
            if (r0 == 0) goto L_0x001c
            e.f.a.c.f.g.u r0 = new e.f.a.c.f.g.u
            java.lang.String r9 = r9.mo19741g()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7018u
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7018u
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.mo19741g()
            java.lang.String r9 = r9.mo19741g()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.mo19739d()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.mo19739d()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7098z.m27053d(e.f.a.c.f.g.q, e.f.a.c.f.g.q):boolean");
    }

    /* renamed from: e */
    private static boolean m27054e(C6954q qVar, C6954q qVar2) {
        if (qVar instanceof C6890m) {
            qVar = new C7018u(qVar.mo19741g());
        }
        if (qVar2 instanceof C6890m) {
            qVar2 = new C7018u(qVar2.mo19741g());
        }
        return (((qVar instanceof C7018u) && (qVar2 instanceof C7018u)) || (!Double.isNaN(qVar.mo19739d().doubleValue()) && !Double.isNaN(qVar2.mo19739d().doubleValue()))) && !m27053d(qVar2, qVar);
    }

    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        boolean z;
        boolean c;
        C7008t5.m26538h(C7008t5.m26535e(str).name(), 2, list);
        C6954q b = s4Var.mo20144b((C6954q) list.get(0));
        C6954q b2 = s4Var.mo20144b((C6954q) list.get(1));
        int ordinal = C7008t5.m26535e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m27052c(b, b2);
            } else if (ordinal == 42) {
                z = m27053d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m27053d(b2, b);
                        break;
                    case 38:
                        z = m27054e(b2, b);
                        break;
                    case 39:
                        z = C7008t5.m26542l(b, b2);
                        break;
                    case C9024k.f24728k4 /*40*/:
                        c = C7008t5.m26542l(b, b2);
                        break;
                    default:
                        return super.mo20424b(str);
                }
            } else {
                z = m27054e(b, b2);
            }
            z = !c;
        } else {
            z = m27052c(b, b2);
        }
        return z ? C6954q.f18809i : C6954q.f18810j;
    }
}
