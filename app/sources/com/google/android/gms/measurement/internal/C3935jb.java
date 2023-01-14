package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6696a3;

/* renamed from: com.google.android.gms.measurement.internal.jb */
final class C3935jb extends C3948kb {

    /* renamed from: g */
    private final C6696a3 f10841g;

    /* renamed from: h */
    final /* synthetic */ C3819b f10842h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3935jb(C3819b bVar, String str, int i, C6696a3 a3Var) {
        super(str, i);
        this.f10842h = bVar;
        this.f10841g = a3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12135a() {
        return this.f10841g.mo19499y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo12136b() {
        return this.f10841g.mo19494K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo12137c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        if (r2.booleanValue() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0152, code lost:
        r2.mo12477b(r7, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d4  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12138k(java.lang.Long r16, java.lang.Long r17, p174e.p319f.p320a.p335c.p345f.p352g.C6863k4 r18, long r19, com.google.android.gms.measurement.internal.C4046t r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            p174e.p319f.p320a.p335c.p345f.p352g.C6740cd.m25562b()
            com.google.android.gms.measurement.internal.b r1 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r1 = r1.f10651a
            com.google.android.gms.measurement.internal.h r1 = r1.mo12181z()
            java.lang.String r2 = r0.f10867a
            com.google.android.gms.measurement.internal.l3 r3 = com.google.android.gms.measurement.internal.C3966m3.f10984Y
            boolean r1 = r1.mo12010B(r2, r3)
            e.f.a.c.f.g.a3 r2 = r0.f10841g
            boolean r2 = r2.mo19493J()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f11286e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.b r4 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            java.lang.String r4 = r4.mo12541C()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.b r4 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12548v()
            int r6 = r0.f10868b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            e.f.a.c.f.g.a3 r7 = r0.f10841g
            boolean r7 = r7.mo19495L()
            if (r7 == 0) goto L_0x005c
            e.f.a.c.f.g.a3 r7 = r0.f10841g
            int r7 = r7.mo19499y()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.b r8 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r8 = r8.f10651a
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo12152D()
            e.f.a.c.f.g.a3 r9 = r0.f10841g
            java.lang.String r9 = r9.mo19489D()
            java.lang.String r8 = r8.mo12438d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo12479d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.b r4 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12548v()
            com.google.android.gms.measurement.internal.b r6 = r0.f10842h
            com.google.android.gms.measurement.internal.pa r6 = r6.f10552b
            com.google.android.gms.measurement.internal.ra r6 = r6.mo12287g0()
            e.f.a.c.f.g.a3 r7 = r0.f10841g
            java.lang.String r6 = r6.mo12392E(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo12477b(r7, r6)
        L_0x0093:
            e.f.a.c.f.g.a3 r4 = r0.f10841g
            boolean r4 = r4.mo19495L()
            r6 = 0
            if (r4 == 0) goto L_0x0418
            e.f.a.c.f.g.a3 r4 = r0.f10841g
            int r4 = r4.mo19499y()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x0418
        L_0x00a8:
            e.f.a.c.f.g.a3 r4 = r0.f10841g
            boolean r4 = r4.mo19491H()
            e.f.a.c.f.g.a3 r7 = r0.f10841g
            boolean r7 = r7.mo19492I()
            e.f.a.c.f.g.a3 r8 = r0.f10841g
            boolean r8 = r8.mo19493J()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.b r1 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r1 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            int r2 = r0.f10868b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            e.f.a.c.f.g.a3 r3 = r0.f10841g
            boolean r3 = r3.mo19495L()
            if (r3 == 0) goto L_0x00ed
            e.f.a.c.f.g.a3 r3 = r0.f10841g
            int r3 = r3.mo19499y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo12478c(r3, r2, r5)
            return r9
        L_0x00f3:
            e.f.a.c.f.g.a3 r7 = r0.f10841g
            java.lang.String r8 = r18.mo19916E()
            boolean r10 = r7.mo19494K()
            if (r10 == 0) goto L_0x0115
            e.f.a.c.f.g.h3 r10 = r7.mo19488C()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C3948kb.m14967h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03ba
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
        L_0x0111:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03ba
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo19490E()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            e.f.a.c.f.g.c3 r10 = (p174e.p319f.p320a.p335c.p345f.p352g.C6730c3) r10
            java.lang.String r11 = r10.mo19602B()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
        L_0x0152:
            r2.mo12477b(r7, r3)
            goto L_0x03ba
        L_0x0157:
            java.lang.String r10 = r10.mo19602B()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            c.f.a r3 = new c.f.a
            r3.<init>()
            java.util.List r10 = r18.mo19917F()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01f7
            java.lang.Object r11 = r10.next()
            e.f.a.c.f.g.o4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r11
            java.lang.String r12 = r11.mo20057D()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo20062S()
            if (r12 == 0) goto L_0x019d
            java.lang.String r12 = r11.mo20057D()
            boolean r13 = r11.mo20062S()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo20056A()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x01c4
        L_0x019b:
            r11 = r5
            goto L_0x01c4
        L_0x019d:
            boolean r12 = r11.mo20060Q()
            if (r12 == 0) goto L_0x01b6
            java.lang.String r12 = r11.mo20057D()
            boolean r13 = r11.mo20060Q()
            if (r13 == 0) goto L_0x019b
            double r13 = r11.mo20065x()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01c4
        L_0x01b6:
            boolean r12 = r11.mo20064U()
            if (r12 == 0) goto L_0x01c8
            java.lang.String r12 = r11.mo20057D()
            java.lang.String r11 = r11.mo20058E()
        L_0x01c4:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01c8:
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r8 = r11.mo20057D()
            java.lang.String r7 = r7.mo12439e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
        L_0x01f2:
            r2.mo12478c(r8, r3, r7)
            goto L_0x03ba
        L_0x01f7:
            java.util.List r2 = r7.mo19490E()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ff:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03b8
            java.lang.Object r7 = r2.next()
            e.f.a.c.f.g.c3 r7 = (p174e.p319f.p320a.p335c.p345f.p352g.C6730c3) r7
            boolean r10 = r7.mo19604E()
            if (r10 == 0) goto L_0x0219
            boolean r10 = r7.mo19603D()
            if (r10 == 0) goto L_0x0219
            r10 = 1
            goto L_0x021a
        L_0x0219:
            r10 = 0
        L_0x021a:
            java.lang.String r11 = r7.mo19602B()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0240
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            goto L_0x0152
        L_0x0240:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0290
            boolean r13 = r7.mo19605F()
            if (r13 != 0) goto L_0x0276
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r7 = r7.mo12439e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            goto L_0x01f2
        L_0x0276:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            e.f.a.c.f.g.h3 r7 = r7.mo19608z()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C3948kb.m14967h(r11, r7)
            if (r7 != 0) goto L_0x0288
            goto L_0x03ba
        L_0x0288:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x0290:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02dc
            boolean r13 = r7.mo19605F()
            if (r13 != 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r7 = r7.mo12439e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            goto L_0x01f2
        L_0x02c2:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            e.f.a.c.f.g.h3 r7 = r7.mo19608z()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C3948kb.m14966g(r11, r7)
            if (r7 != 0) goto L_0x02d4
            goto L_0x03ba
        L_0x02d4:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x02dc:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x036b
            boolean r13 = r7.mo19607H()
            if (r13 == 0) goto L_0x02f9
            java.lang.String r12 = (java.lang.String) r12
            e.f.a.c.f.g.o3 r7 = r7.mo19601A()
            com.google.android.gms.measurement.internal.b r11 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r11 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo11935b()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C3948kb.m14965f(r12, r7, r11)
            goto L_0x030f
        L_0x02f9:
            boolean r13 = r7.mo19605F()
            if (r13 == 0) goto L_0x0343
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C4033ra.m15285N(r12)
            if (r13 == 0) goto L_0x031b
            e.f.a.c.f.g.h3 r7 = r7.mo19608z()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C3948kb.m14968i(r12, r7)
        L_0x030f:
            if (r7 != 0) goto L_0x0313
            goto L_0x03ba
        L_0x0313:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x031b:
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r7 = r7.mo12439e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            goto L_0x01f2
        L_0x0343:
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r7 = r7.mo12439e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            goto L_0x01f2
        L_0x036b:
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            if (r12 != 0) goto L_0x0398
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12548v()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r5 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12152D()
            java.lang.String r5 = r5.mo12439e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo12478c(r7, r3, r5)
            goto L_0x0111
        L_0x0398:
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()
            com.google.android.gms.measurement.internal.b r3 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r7 = r7.mo12439e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            goto L_0x01f2
        L_0x03b8:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03ba:
            com.google.android.gms.measurement.internal.b r2 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12548v()
            if (r5 != 0) goto L_0x03cb
            java.lang.String r3 = "null"
            goto L_0x03cc
        L_0x03cb:
            r3 = r5
        L_0x03cc:
            java.lang.String r7 = "Event filter result"
            r2.mo12477b(r7, r3)
            if (r5 != 0) goto L_0x03d4
            return r6
        L_0x03d4:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f10869c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x03df
            return r9
        L_0x03df:
            r0.f10870d = r2
            if (r4 == 0) goto L_0x0417
            boolean r2 = r18.mo19920Q()
            if (r2 == 0) goto L_0x0417
            long r2 = r18.mo19914A()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            e.f.a.c.f.g.a3 r3 = r0.f10841g
            boolean r3 = r3.mo19492I()
            if (r3 == 0) goto L_0x0409
            if (r1 == 0) goto L_0x0406
            e.f.a.c.f.g.a3 r1 = r0.f10841g
            boolean r1 = r1.mo19494K()
            if (r1 != 0) goto L_0x0404
            goto L_0x0406
        L_0x0404:
            r2 = r16
        L_0x0406:
            r0.f10872f = r2
            goto L_0x0417
        L_0x0409:
            if (r1 == 0) goto L_0x0415
            e.f.a.c.f.g.a3 r1 = r0.f10841g
            boolean r1 = r1.mo19494K()
            if (r1 == 0) goto L_0x0415
            r2 = r17
        L_0x0415:
            r0.f10871e = r2
        L_0x0417:
            return r9
        L_0x0418:
            com.google.android.gms.measurement.internal.b r1 = r0.f10842h
            com.google.android.gms.measurement.internal.l5 r1 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12549w()
            java.lang.String r2 = r0.f10867a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r2)
            e.f.a.c.f.g.a3 r3 = r0.f10841g
            boolean r3 = r3.mo19495L()
            if (r3 == 0) goto L_0x043c
            e.f.a.c.f.g.a3 r3 = r0.f10841g
            int r3 = r3.mo19499y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x043c:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo12478c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3935jb.mo12138k(java.lang.Long, java.lang.Long, e.f.a.c.f.g.k4, long, com.google.android.gms.measurement.internal.t, boolean):boolean");
    }
}
