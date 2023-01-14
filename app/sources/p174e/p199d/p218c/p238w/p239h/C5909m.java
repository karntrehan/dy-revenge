package p174e.p199d.p218c.p238w.p239h;

import p174e.p199d.p217b.C5714o;

/* renamed from: e.d.c.w.h.m */
public class C5909m extends C5903i<C5910a> {

    /* renamed from: e.d.c.w.h.m$a */
    class C5910a extends C5902h {

        /* renamed from: d */
        int f16431d;

        /* renamed from: e */
        int f16432e;

        /* renamed from: f */
        int[] f16433f;

        /* renamed from: g */
        long f16434g;

        /* renamed from: h */
        int f16435h;

        /* renamed from: i */
        int f16436i;

        /* renamed from: j */
        int[] f16437j;

        /* renamed from: k */
        String f16438k;

        public C5910a(C5714o oVar) {
            super(oVar);
            this.f16431d = oVar.mo17087f();
            this.f16432e = oVar.mo17087f();
            this.f16433f = new int[]{oVar.mo17096p(), oVar.mo17096p(), oVar.mo17096p()};
            this.f16434g = oVar.mo17088g();
            oVar.mo17084t(8);
            this.f16435h = oVar.mo17096p();
            this.f16436i = oVar.mo17096p();
            oVar.mo17084t(1);
            oVar.mo17084t(2);
            this.f16437j = new int[]{oVar.mo17096p(), oVar.mo17096p(), oVar.mo17096p()};
            this.f16438k = oVar.mo17093m(oVar.mo17098r());
        }
    }

    public C5909m(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17838b(p174e.p199d.p218c.p238w.p240i.C5930l r12) {
        /*
            r11 = this;
            java.util.ArrayList<T> r0 = r11.f16414f
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            e.d.c.w.h.m$a r0 = (p174e.p199d.p218c.p238w.p239h.C5909m.C5910a) r0
            int r2 = r0.f16431d
            r3 = 2
            r2 = r2 & r3
            r4 = 1
            if (r2 != r3) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r12.mo17117B(r4, r2)
            int r2 = r0.f16431d
            r5 = 8
            r2 = r2 & r5
            if (r2 != r5) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            r12.mo17117B(r3, r2)
            r2 = 3
            int r6 = r0.f16431d
            r7 = 32
            r6 = r6 & r7
            if (r6 != r7) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            r12.mo17117B(r2, r6)
            int r2 = r0.f16431d
            r6 = 64
            r2 = r2 & r6
            if (r2 != r6) goto L_0x003a
            r2 = 1
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            r8 = 4
            r12.mo17117B(r8, r2)
            r2 = 5
            int r9 = r0.f16431d
            r10 = 128(0x80, float:1.794E-43)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x004a
            java.lang.String r9 = "Horizontal"
            goto L_0x004c
        L_0x004a:
            java.lang.String r9 = "Vertical"
        L_0x004c:
            r12.mo17133R(r2, r9)
            r2 = 6
            int r9 = r0.f16431d
            r10 = 256(0x100, float:3.59E-43)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x005a
            java.lang.String r9 = "Reverse"
            goto L_0x005c
        L_0x005a:
            java.lang.String r9 = "Normal"
        L_0x005c:
            r12.mo17133R(r2, r9)
            r2 = 7
            int r9 = r0.f16431d
            r10 = 512(0x200, float:7.175E-43)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0069
            r9 = 1
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            r12.mo17117B(r2, r9)
            int r2 = r0.f16431d
            r9 = 4096(0x1000, float:5.74E-42)
            r2 = r2 & r9
            if (r2 != r9) goto L_0x0076
            r2 = 1
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            r12.mo17117B(r5, r2)
            r2 = 9
            int r9 = r0.f16431d
            r10 = 8192(0x2000, float:1.14794E-41)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0085
            r9 = 1
            goto L_0x0086
        L_0x0085:
            r9 = 0
        L_0x0086:
            r12.mo17117B(r2, r9)
            r2 = 10
            int r9 = r0.f16431d
            r10 = 16384(0x4000, float:2.2959E-41)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0093
            r1 = 1
        L_0x0093:
            r12.mo17117B(r2, r1)
            int r1 = r0.f16432e
            r2 = -1
            r9 = 11
            if (r1 == r2) goto L_0x00a8
            if (r1 == 0) goto L_0x00a5
            if (r1 == r4) goto L_0x00a2
            goto L_0x00ad
        L_0x00a2:
            java.lang.String r1 = "Center"
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r1 = "Left"
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r1 = "Right"
        L_0x00aa:
            r12.mo17133R(r9, r1)
        L_0x00ad:
            r1 = 12
            int[] r2 = r0.f16433f
            r12.mo17126K(r1, r2)
            r1 = 13
            long r9 = r0.f16434g
            r12.mo17127L(r1, r9)
            r1 = 14
            int r2 = r0.f16435h
            r12.mo17125J(r1, r2)
            int r1 = r0.f16436i
            r2 = 16
            r9 = 15
            if (r1 == r4) goto L_0x00e9
            if (r1 == r3) goto L_0x00e6
            if (r1 == r8) goto L_0x00e3
            if (r1 == r5) goto L_0x00e0
            if (r1 == r2) goto L_0x00dd
            if (r1 == r7) goto L_0x00da
            if (r1 == r6) goto L_0x00d7
            goto L_0x00ee
        L_0x00d7:
            java.lang.String r1 = "Extend"
            goto L_0x00eb
        L_0x00da:
            java.lang.String r1 = "Condense"
            goto L_0x00eb
        L_0x00dd:
            java.lang.String r1 = "Shadow"
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r1 = "Outline"
            goto L_0x00eb
        L_0x00e3:
            java.lang.String r1 = "Underline"
            goto L_0x00eb
        L_0x00e6:
            java.lang.String r1 = "Italic"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r1 = "Bold"
        L_0x00eb:
            r12.mo17133R(r9, r1)
        L_0x00ee:
            int[] r1 = r0.f16437j
            r12.mo17126K(r2, r1)
            r1 = 17
            java.lang.String r0 = r0.f16438k
            r12.mo17133R(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p238w.p239h.C5909m.mo17838b(e.d.c.w.i.l):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5910a mo17830a(C5714o oVar) {
        return new C5910a(oVar);
    }
}
