package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6846j3;

/* renamed from: com.google.android.gms.measurement.internal.lb */
final class C3961lb extends C3948kb {

    /* renamed from: g */
    private final C6846j3 f10944g;

    /* renamed from: h */
    final /* synthetic */ C3819b f10945h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3961lb(C3819b bVar, String str, int i, C6846j3 j3Var) {
        super(str, i);
        this.f10945h = bVar;
        this.f10944g = j3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12135a() {
        return this.f10944g.mo19856x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo12136b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo12137c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12185k(java.lang.Long r11, java.lang.Long r12, p174e.p319f.p320a.p335c.p345f.p352g.C6766e5 r13, boolean r14) {
        /*
            r10 = this;
            p174e.p319f.p320a.p335c.p345f.p352g.C6740cd.m25562b()
            com.google.android.gms.measurement.internal.b r0 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            java.lang.String r1 = r10.f10867a
            com.google.android.gms.measurement.internal.l3 r2 = com.google.android.gms.measurement.internal.C3966m3.f10982W
            boolean r0 = r0.mo12010B(r1, r2)
            e.f.a.c.f.g.j3 r1 = r10.f10944g
            boolean r1 = r1.mo19851D()
            e.f.a.c.f.g.j3 r2 = r10.f10944g
            boolean r2 = r2.mo19852E()
            e.f.a.c.f.g.j3 r3 = r10.f10944g
            boolean r3 = r3.mo19853F()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.b r11 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r11 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo11935b()
            com.google.android.gms.measurement.internal.x3 r11 = r11.mo12548v()
            int r12 = r10.f10868b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            e.f.a.c.f.g.j3 r13 = r10.f10944g
            boolean r13 = r13.mo19854G()
            if (r13 == 0) goto L_0x005a
            e.f.a.c.f.g.j3 r13 = r10.f10944g
            int r13 = r13.mo19856x()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo12478c(r13, r12, r2)
            return r5
        L_0x0060:
            e.f.a.c.f.g.j3 r6 = r10.f10944g
            e.f.a.c.f.g.c3 r6 = r6.mo19857y()
            boolean r7 = r6.mo19603D()
            boolean r8 = r13.mo19699N()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo19605F()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.b r6 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12549w()
            com.google.android.gms.measurement.internal.b r7 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r8 = r13.mo19696C()
            java.lang.String r7 = r7.mo12440f(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.mo12477b(r8, r7)
            goto L_0x0188
        L_0x0099:
            long r8 = r13.mo19703y()
            e.f.a.c.f.g.h3 r2 = r6.mo19608z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C3948kb.m14967h(r8, r2)
        L_0x00a5:
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C3948kb.m14969j(r2, r7)
            goto L_0x0188
        L_0x00ab:
            boolean r8 = r13.mo19698M()
            if (r8 == 0) goto L_0x00e3
            boolean r8 = r6.mo19605F()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.b r6 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12549w()
            com.google.android.gms.measurement.internal.b r7 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r8 = r13.mo19696C()
            java.lang.String r7 = r7.mo12440f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d6:
            double r8 = r13.mo19702x()
            e.f.a.c.f.g.h3 r2 = r6.mo19608z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C3948kb.m14966g(r8, r2)
            goto L_0x00a5
        L_0x00e3:
            boolean r8 = r13.mo19701P()
            if (r8 == 0) goto L_0x0168
            boolean r8 = r6.mo19607H()
            if (r8 != 0) goto L_0x0152
            boolean r8 = r6.mo19605F()
            if (r8 != 0) goto L_0x0114
            com.google.android.gms.measurement.internal.b r6 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12549w()
            com.google.android.gms.measurement.internal.b r7 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r8 = r13.mo19696C()
            java.lang.String r7 = r7.mo12440f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x0114:
            java.lang.String r8 = r13.mo19697D()
            boolean r8 = com.google.android.gms.measurement.internal.C4033ra.m15285N(r8)
            if (r8 == 0) goto L_0x012c
            java.lang.String r2 = r13.mo19697D()
            e.f.a.c.f.g.h3 r6 = r6.mo19608z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C3948kb.m14968i(r2, r6)
            goto L_0x00a5
        L_0x012c:
            com.google.android.gms.measurement.internal.b r6 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12549w()
            com.google.android.gms.measurement.internal.b r7 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r8 = r13.mo19696C()
            java.lang.String r7 = r7.mo12440f(r8)
            java.lang.String r8 = r13.mo19697D()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo12478c(r9, r7, r8)
            goto L_0x0188
        L_0x0152:
            java.lang.String r2 = r13.mo19697D()
            e.f.a.c.f.g.o3 r6 = r6.mo19601A()
            com.google.android.gms.measurement.internal.b r8 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r8 = r8.f10651a
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo11935b()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C3948kb.m14965f(r2, r6, r8)
            goto L_0x00a5
        L_0x0168:
            com.google.android.gms.measurement.internal.b r6 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12549w()
            com.google.android.gms.measurement.internal.b r7 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r8 = r13.mo19696C()
            java.lang.String r7 = r7.mo12440f(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0188:
            com.google.android.gms.measurement.internal.b r6 = r10.f10945h
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12548v()
            if (r2 != 0) goto L_0x0199
            java.lang.String r7 = "null"
            goto L_0x019a
        L_0x0199:
            r7 = r2
        L_0x019a:
            java.lang.String r8 = "Property filter result"
            r6.mo12477b(r8, r7)
            if (r2 != 0) goto L_0x01a2
            return r4
        L_0x01a2:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f10869c = r4
            if (r3 == 0) goto L_0x01b0
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            return r5
        L_0x01b0:
            if (r14 == 0) goto L_0x01ba
            e.f.a.c.f.g.j3 r14 = r10.f10944g
            boolean r14 = r14.mo19851D()
            if (r14 == 0) goto L_0x01bc
        L_0x01ba:
            r10.f10870d = r2
        L_0x01bc:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0201
            if (r1 == 0) goto L_0x0201
            boolean r14 = r13.mo19700O()
            if (r14 == 0) goto L_0x0201
            long r13 = r13.mo19704z()
            if (r11 == 0) goto L_0x01d4
            long r13 = r11.longValue()
        L_0x01d4:
            if (r0 == 0) goto L_0x01ec
            e.f.a.c.f.g.j3 r11 = r10.f10944g
            boolean r11 = r11.mo19851D()
            if (r11 == 0) goto L_0x01ec
            e.f.a.c.f.g.j3 r11 = r10.f10944g
            boolean r11 = r11.mo19852E()
            if (r11 != 0) goto L_0x01ec
            if (r12 == 0) goto L_0x01ec
            long r13 = r12.longValue()
        L_0x01ec:
            e.f.a.c.f.g.j3 r11 = r10.f10944g
            boolean r11 = r11.mo19852E()
            if (r11 == 0) goto L_0x01fb
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f10872f = r11
            goto L_0x0201
        L_0x01fb:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f10871e = r11
        L_0x0201:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3961lb.mo12185k(java.lang.Long, java.lang.Long, e.f.a.c.f.g.e5, boolean):boolean");
    }
}
