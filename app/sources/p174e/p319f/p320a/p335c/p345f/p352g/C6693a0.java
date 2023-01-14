package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.g.a0 */
public final class C6693a0 extends C7066x {
    protected C6693a0() {
        this.f19041a.add(C6907n0.APPLY);
        this.f19041a.add(C6907n0.BLOCK);
        this.f19041a.add(C6907n0.BREAK);
        this.f19041a.add(C6907n0.CASE);
        this.f19041a.add(C6907n0.DEFAULT);
        this.f19041a.add(C6907n0.CONTINUE);
        this.f19041a.add(C6907n0.DEFINE_FUNCTION);
        this.f19041a.add(C6907n0.FN);
        this.f19041a.add(C6907n0.IF);
        this.f19041a.add(C6907n0.QUOTE);
        this.f19041a.add(C6907n0.RETURN);
        this.f19041a.add(C6907n0.SWITCH);
        this.f19041a.add(C6907n0.TERNARY);
    }

    /* renamed from: c */
    private static C6954q m25355c(C6991s4 s4Var, List list) {
        C7008t5.m26539i(C6907n0.FN.name(), 2, list);
        C6954q b = s4Var.mo20144b((C6954q) list.get(0));
        C6954q b2 = s4Var.mo20144b((C6954q) list.get(1));
        if (b2 instanceof C6777f) {
            List D = ((C6777f) b2).mo19732D();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C6938p(b.mo19741g(), D, arrayList, s4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r8.equals("continue") == false) goto L_0x0127;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p352g.C6954q mo19484a(java.lang.String r8, p174e.p319f.p320a.p335c.p345f.p352g.C6991s4 r9, java.util.List r10) {
        /*
            r7 = this;
            e.f.a.c.f.g.n0 r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.ADD
            e.f.a.c.f.g.n0 r0 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26535e(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0205
            r5 = 15
            if (r0 == r5) goto L_0x01f9
            r5 = 25
            if (r0 == r5) goto L_0x01f4
            r5 = 41
            if (r0 == r5) goto L_0x01a2
            r5 = 54
            if (r0 == r5) goto L_0x019c
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x0179
            r5 = 19
            if (r0 == r5) goto L_0x015b
            r5 = 20
            if (r0 == r5) goto L_0x013a
            r5 = 60
            if (r0 == r5) goto L_0x0085
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x015b;
                default: goto L_0x0039;
            }
        L_0x0039:
            e.f.a.c.f.g.q r8 = super.mo20424b(r8)
            return r8
        L_0x003e:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.BREAK
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r4, r10)
            e.f.a.c.f.g.q r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18807g
            return r8
        L_0x004a:
            e.f.a.c.f.g.s4 r8 = r9.mo20143a()
            e.f.a.c.f.g.f r9 = new e.f.a.c.f.g.f
            r9.<init>(r10)
            e.f.a.c.f.g.q r8 = r8.mo20145c(r9)
            return r8
        L_0x0058:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.TERNARY
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            java.lang.Boolean r8 = r8.mo19742h()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r10.get(r3)
            goto L_0x007e
        L_0x007a:
            java.lang.Object r8 = r10.get(r2)
        L_0x007e:
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            return r8
        L_0x0085:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.SWITCH
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            java.lang.Object r0 = r10.get(r3)
            e.f.a.c.f.g.q r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r0
            e.f.a.c.f.g.q r0 = r9.mo20144b(r0)
            java.lang.Object r10 = r10.get(r2)
            e.f.a.c.f.g.q r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r10
            e.f.a.c.f.g.q r10 = r9.mo20144b(r10)
            boolean r1 = r0 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6777f
            if (r1 == 0) goto L_0x0132
            boolean r1 = r10 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6777f
            if (r1 == 0) goto L_0x012a
            e.f.a.c.f.g.f r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6777f) r0
            e.f.a.c.f.g.f r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6777f) r10
            r1 = 0
            r2 = 0
        L_0x00ba:
            int r5 = r0.mo19752z()
            if (r1 >= r5) goto L_0x00f5
            if (r2 != 0) goto L_0x00d3
            e.f.a.c.f.g.q r2 = r0.mo19729A(r1)
            e.f.a.c.f.g.q r2 = r9.mo20144b(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r2 = 0
            goto L_0x00f2
        L_0x00d3:
            e.f.a.c.f.g.q r2 = r10.mo19729A(r1)
            e.f.a.c.f.g.q r2 = r9.mo20144b(r2)
            boolean r5 = r2 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6810h
            if (r5 == 0) goto L_0x00f1
            r8 = r2
            e.f.a.c.f.g.h r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6810h) r8
            java.lang.String r8 = r8.mo19808c()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0126
            e.f.a.c.f.g.q r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            return r8
        L_0x00f1:
            r2 = 1
        L_0x00f2:
            int r1 = r1 + 1
            goto L_0x00ba
        L_0x00f5:
            int r8 = r0.mo19752z()
            int r8 = r8 + r3
            int r1 = r10.mo19752z()
            if (r8 != r1) goto L_0x0127
            int r8 = r0.mo19752z()
            e.f.a.c.f.g.q r8 = r10.mo19729A(r8)
            e.f.a.c.f.g.q r2 = r9.mo20144b(r8)
            boolean r8 = r2 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6810h
            if (r8 == 0) goto L_0x0127
            r8 = r2
            e.f.a.c.f.g.h r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6810h) r8
            java.lang.String r8 = r8.mo19808c()
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x0126
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            return r2
        L_0x0127:
            e.f.a.c.f.g.q r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            return r8
        L_0x012a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0132:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x013a:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26539i(r8, r2, r10)
            e.f.a.c.f.g.q r8 = m25355c(r9, r10)
            r10 = r8
            e.f.a.c.f.g.j r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6842j) r10
            java.lang.String r0 = r10.mo19845c()
            if (r0 != 0) goto L_0x0153
            java.lang.String r10 = ""
            goto L_0x0157
        L_0x0153:
            java.lang.String r10 = r10.mo19845c()
        L_0x0157:
            r9.mo20149g(r10, r8)
            return r8
        L_0x015b:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0164
        L_0x0161:
            e.f.a.c.f.g.q r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            goto L_0x0178
        L_0x0164:
            java.lang.Object r8 = r10.get(r4)
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            boolean r10 = r8 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6777f
            if (r10 == 0) goto L_0x0161
            e.f.a.c.f.g.f r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6777f) r8
            e.f.a.c.f.g.q r8 = r9.mo20145c(r8)
        L_0x0178:
            return r8
        L_0x0179:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0182
            e.f.a.c.f.g.q r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18808h
            goto L_0x019b
        L_0x0182:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.RETURN
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            e.f.a.c.f.g.h r9 = new e.f.a.c.f.g.h
            r9.<init>(r6, r8)
            r8 = r9
        L_0x019b:
            return r8
        L_0x019c:
            e.f.a.c.f.g.f r8 = new e.f.a.c.f.g.f
            r8.<init>(r10)
            return r8
        L_0x01a2:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.IF
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26539i(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            java.lang.Object r0 = r10.get(r3)
            e.f.a.c.f.g.q r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r0
            e.f.a.c.f.g.q r0 = r9.mo20144b(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01d0
            java.lang.Object r10 = r10.get(r2)
            e.f.a.c.f.g.q r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r10
            e.f.a.c.f.g.q r10 = r9.mo20144b(r10)
            goto L_0x01d1
        L_0x01d0:
            r10 = 0
        L_0x01d1:
            e.f.a.c.f.g.q r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            java.lang.Boolean r8 = r8.mo19742h()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01e4
            e.f.a.c.f.g.f r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6777f) r0
            e.f.a.c.f.g.q r8 = r9.mo20145c(r0)
            goto L_0x01ee
        L_0x01e4:
            if (r10 == 0) goto L_0x01ed
            e.f.a.c.f.g.f r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6777f) r10
            e.f.a.c.f.g.q r8 = r9.mo20145c(r10)
            goto L_0x01ee
        L_0x01ed:
            r8 = r1
        L_0x01ee:
            boolean r9 = r8 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6810h
            if (r9 == 0) goto L_0x01f3
            return r8
        L_0x01f3:
            return r1
        L_0x01f4:
            e.f.a.c.f.g.q r8 = m25355c(r9, r10)
            return r8
        L_0x01f9:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.BREAK
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r4, r10)
            e.f.a.c.f.g.q r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18806e
            return r8
        L_0x0205:
            e.f.a.c.f.g.n0 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6907n0.APPLY
            java.lang.String r8 = r8.name()
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            e.f.a.c.f.g.q r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r8
            e.f.a.c.f.g.q r8 = r9.mo20144b(r8)
            java.lang.Object r0 = r10.get(r3)
            e.f.a.c.f.g.q r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r0
            e.f.a.c.f.g.q r0 = r9.mo20144b(r0)
            java.lang.String r0 = r0.mo19741g()
            java.lang.Object r10 = r10.get(r2)
            e.f.a.c.f.g.q r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r10
            e.f.a.c.f.g.q r10 = r9.mo20144b(r10)
            boolean r1 = r10 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6777f
            if (r1 == 0) goto L_0x024d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0245
            e.f.a.c.f.g.f r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6777f) r10
            java.util.List r10 = r10.mo19732D()
            e.f.a.c.f.g.q r8 = r8.mo19748p(r0, r9, r10)
            return r8
        L_0x0245:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x024d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6693a0.mo19484a(java.lang.String, e.f.a.c.f.g.s4, java.util.List):e.f.a.c.f.g.q");
    }
}
