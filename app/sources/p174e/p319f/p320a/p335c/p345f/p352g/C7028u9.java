package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.u9 */
public final class C7028u9 extends C6906n {

    /* renamed from: o */
    private final C6726c f18987o;

    public C7028u9(C6726c cVar) {
        this.f18987o = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p352g.C6954q mo19748p(java.lang.String r17, p174e.p319f.p320a.p335c.p345f.p352g.C6991s4 r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            e.f.a.c.f.g.q r1 = super.mo19748p(r17, r18, r19)
            return r1
        L_0x0064:
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r2.mo20144b(r1)
            java.lang.String r1 = r1.mo19741g()
            java.lang.Object r3 = r3.get(r15)
            e.f.a.c.f.g.q r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r3
            e.f.a.c.f.g.q r2 = r2.mo20144b(r3)
            e.f.a.c.f.g.c r3 = r0.f18987o
            e.f.a.c.f.g.b r3 = r3.mo19587b()
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26536f(r2)
            r3.mo19551g(r1, r4)
            return r2
        L_0x008d:
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r2.mo20144b(r1)
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18805d
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            e.f.a.c.f.g.c r2 = r0.f18987o
            e.f.a.c.f.g.b r2 = r2.mo19587b()
            java.lang.String r3 = r1.mo19741g()
            r2.mo19550f(r3)
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.lang.String r1 = r1.mo19741g()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r12, r5, r3)
            e.f.a.c.f.g.c r1 = r0.f18987o
            e.f.a.c.f.g.b r1 = r1.mo19587b()
            e.f.a.c.f.g.i r2 = new e.f.a.c.f.g.i
            long r3 = r1.mo19543a()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r10, r5, r3)
            e.f.a.c.f.g.c r1 = r0.f18987o
            e.f.a.c.f.g.b r1 = r1.mo19587b()
            java.util.Map r1 = r1.mo19548e()
            e.f.a.c.f.g.n r2 = new e.f.a.c.f.g.n
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            e.f.a.c.f.g.q r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7025u6.m26736b(r5)
            r2.mo19747o(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            e.f.a.c.f.g.q r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1
            e.f.a.c.f.g.q r1 = r2.mo20144b(r1)
            java.lang.String r1 = r1.mo19741g()
            e.f.a.c.f.g.c r2 = r0.f18987o
            e.f.a.c.f.g.b r2 = r2.mo19587b()
            java.lang.Object r1 = r2.mo19545c(r1)
            e.f.a.c.f.g.q r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7025u6.m26736b(r1)
            return r1
        L_0x0134:
            p174e.p319f.p320a.p335c.p345f.p352g.C7008t5.m26538h(r13, r5, r3)
            e.f.a.c.f.g.c r1 = r0.f18987o
            e.f.a.c.f.g.b r1 = r1.mo19587b()
            e.f.a.c.f.g.u r2 = new e.f.a.c.f.g.u
            java.lang.String r1 = r1.mo19547d()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7028u9.mo19748p(java.lang.String, e.f.a.c.f.g.s4, java.util.List):e.f.a.c.f.g.q");
    }
}
