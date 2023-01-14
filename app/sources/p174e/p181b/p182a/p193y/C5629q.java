package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import p027c.p060f.C1802h;
import p027c.p064i.p072j.p074h0.C1976b;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p174e.p181b.p182a.p195z.C5646g;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.y.q */
class C5629q {

    /* renamed from: a */
    private static final Interpolator f15944a = new LinearInterpolator();

    /* renamed from: b */
    private static C1802h<WeakReference<Interpolator>> f15945b;

    /* renamed from: c */
    static C5618c.C5619a f15946c = C5618c.C5619a.m20942a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static C5618c.C5619a f15947d = C5618c.C5619a.m20942a("x", "y");

    C5629q() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m20987a(int i) {
        WeakReference<Interpolator> g;
        synchronized (C5629q.class) {
            g = m20993g().mo6276g(i);
        }
        return g;
    }

    /* renamed from: b */
    private static Interpolator m20988b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        pointF.x = C5646g.m21055c(pointF.x, -1.0f, 1.0f);
        pointF.y = C5646g.m21055c(pointF.y, -100.0f, 100.0f);
        pointF2.x = C5646g.m21055c(pointF2.x, -1.0f, 1.0f);
        float c = C5646g.m21055c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c;
        int i = C5647h.m21074i(pointF.x, pointF.y, pointF2.x, c);
        WeakReference<Interpolator> a = m20987a(i);
        Interpolator interpolator2 = a != null ? (Interpolator) a.get() : null;
        if (a == null || interpolator2 == null) {
            try {
                interpolator = C1976b.m8298a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? C1976b.m8298a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator2 = interpolator;
            try {
                m20994h(i, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    /* renamed from: c */
    static <T> C5417a<T> m20989c(C5618c cVar, C5433e eVar, float f, C5614j0<T> j0Var, boolean z, boolean z2) {
        return (!z || !z2) ? z ? m20990d(eVar, cVar, f, j0Var) : m20992f(cVar, f, j0Var) : m20991e(eVar, cVar, f, j0Var);
    }

    /* renamed from: d */
    private static <T> C5417a<T> m20990d(C5433e eVar, C5618c cVar, float f, C5614j0<T> j0Var) {
        Interpolator interpolator;
        T t;
        cVar.mo16867h();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (cVar.mo16860E()) {
            switch (cVar.mo16872u0(f15946c)) {
                case 0:
                    f2 = (float) cVar.mo16862L();
                    break;
                case 1:
                    t3 = j0Var.mo16853a(cVar, f);
                    break;
                case 2:
                    t2 = j0Var.mo16853a(cVar, f);
                    break;
                case 3:
                    pointF = C5627p.m20984e(cVar, 1.0f);
                    break;
                case 4:
                    pointF2 = C5627p.m20984e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.mo16863W() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = C5627p.m20984e(cVar, f);
                    break;
                case 7:
                    pointF4 = C5627p.m20984e(cVar, f);
                    break;
                default:
                    cVar.mo16874w0();
                    break;
            }
        }
        cVar.mo16870r();
        if (z) {
            interpolator = f15944a;
            t = t3;
        } else {
            interpolator = (pointF == null || pointF2 == null) ? f15944a : m20988b(pointF, pointF2);
            t = t2;
        }
        C5417a aVar = new C5417a(eVar, t3, t, interpolator, f2, (Float) null);
        aVar.f15127o = pointF3;
        aVar.f15128p = pointF4;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        r14 = r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> p174e.p181b.p182a.p183a0.C5417a<T> m20991e(p174e.p181b.p182a.C5433e r21, p174e.p181b.p182a.p193y.p194k0.C5618c r22, float r23, p174e.p181b.p182a.p193y.C5614j0<T> r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.mo16867h()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.mo16860E()
            if (r17 == 0) goto L_0x01a3
            e.b.a.y.k0.c$a r4 = f15946c
            int r4 = r0.mo16872u0(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x0196;
                case 1: goto L_0x018c;
                case 2: goto L_0x0182;
                case 3: goto L_0x00f1;
                case 4: goto L_0x0044;
                case 5: goto L_0x003a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0030;
                default: goto L_0x0026;
            }
        L_0x0026:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo16874w0()
            goto L_0x019f
        L_0x0030:
            android.graphics.PointF r3 = p174e.p181b.p182a.p193y.C5627p.m20984e(r22, r23)
            goto L_0x0016
        L_0x0035:
            android.graphics.PointF r15 = p174e.p181b.p182a.p193y.C5627p.m20984e(r22, r23)
            goto L_0x0016
        L_0x003a:
            int r4 = r22.mo16863W()
            if (r4 != r5) goto L_0x0042
            r6 = 1
            goto L_0x0016
        L_0x0042:
            r6 = 0
            goto L_0x0016
        L_0x0044:
            e.b.a.y.k0.c$b r4 = r22.mo16868n0()
            e.b.a.y.k0.c$b r5 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e6
            r22.mo16867h()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x0053:
            boolean r18 = r22.mo16860E()
            if (r18 == 0) goto L_0x00d0
            r18 = r15
            e.b.a.y.k0.c$a r15 = f15947d
            int r15 = r0.mo16872u0(r15)
            r19 = r3
            if (r15 == 0) goto L_0x00a5
            r3 = 1
            if (r15 == r3) goto L_0x0070
            r22.mo16874w0()
        L_0x006b:
            r15 = r18
            r3 = r19
            goto L_0x0053
        L_0x0070:
            e.b.a.y.k0.c$b r3 = r22.mo16868n0()
            e.b.a.y.k0.c$b r5 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.NUMBER
            if (r3 != r5) goto L_0x0081
            r3 = r14
            double r13 = r22.mo16862L()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x006b
        L_0x0081:
            r3 = r14
            r22.mo16865b()
            double r13 = r22.mo16862L()
            float r13 = (float) r13
            e.b.a.y.k0.c$b r14 = r22.mo16868n0()
            if (r14 != r5) goto L_0x0096
            double r14 = r22.mo16862L()
            float r5 = (float) r14
            goto L_0x0097
        L_0x0096:
            r5 = r13
        L_0x0097:
            r22.mo16869o()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x0053
        L_0x00a5:
            r3 = r14
            e.b.a.y.k0.c$b r4 = r22.mo16868n0()
            e.b.a.y.k0.c$b r12 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.NUMBER
            if (r4 != r12) goto L_0x00b6
            double r14 = r22.mo16862L()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x006b
        L_0x00b6:
            r22.mo16865b()
            double r14 = r22.mo16862L()
            float r4 = (float) r14
            e.b.a.y.k0.c$b r14 = r22.mo16868n0()
            if (r14 != r12) goto L_0x00ca
            double r14 = r22.mo16862L()
            float r12 = (float) r14
            goto L_0x00cb
        L_0x00ca:
            r12 = r4
        L_0x00cb:
            r22.mo16869o()
            r14 = r3
            goto L_0x006b
        L_0x00d0:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.mo16870r()
            r13 = r4
            r12 = r14
            goto L_0x0178
        L_0x00e6:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = p174e.p181b.p182a.p193y.C5627p.m20984e(r22, r23)
            goto L_0x019f
        L_0x00f1:
            r19 = r3
            r3 = r14
            r18 = r15
            e.b.a.y.k0.c$b r4 = r22.mo16868n0()
            e.b.a.y.k0.c$b r5 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017a
            r22.mo16867h()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0105:
            boolean r14 = r22.mo16860E()
            if (r14 == 0) goto L_0x0167
            e.b.a.y.k0.c$a r14 = f15947d
            int r14 = r0.mo16872u0(r14)
            if (r14 == 0) goto L_0x013f
            r15 = 1
            if (r14 == r15) goto L_0x011a
            r22.mo16874w0()
            goto L_0x0105
        L_0x011a:
            e.b.a.y.k0.c$b r5 = r22.mo16868n0()
            e.b.a.y.k0.c$b r11 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.NUMBER
            if (r5 != r11) goto L_0x0129
            double r14 = r22.mo16862L()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0105
        L_0x0129:
            r22.mo16865b()
            double r14 = r22.mo16862L()
            float r5 = (float) r14
            e.b.a.y.k0.c$b r14 = r22.mo16868n0()
            if (r14 != r11) goto L_0x013d
            double r14 = r22.mo16862L()
            float r11 = (float) r14
            goto L_0x0163
        L_0x013d:
            r11 = r5
            goto L_0x0163
        L_0x013f:
            e.b.a.y.k0.c$b r4 = r22.mo16868n0()
            e.b.a.y.k0.c$b r9 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.NUMBER
            if (r4 != r9) goto L_0x014e
            double r14 = r22.mo16862L()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0105
        L_0x014e:
            r22.mo16865b()
            double r14 = r22.mo16862L()
            float r4 = (float) r14
            e.b.a.y.k0.c$b r14 = r22.mo16868n0()
            if (r14 != r9) goto L_0x0162
            double r14 = r22.mo16862L()
            float r9 = (float) r14
            goto L_0x0163
        L_0x0162:
            r9 = r4
        L_0x0163:
            r22.mo16869o()
            goto L_0x0105
        L_0x0167:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.mo16870r()
            r11 = r4
            r9 = r14
            r15 = r18
        L_0x0178:
            r14 = r3
            goto L_0x019f
        L_0x017a:
            android.graphics.PointF r7 = p174e.p181b.p182a.p193y.C5627p.m20984e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x019f
        L_0x0182:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.mo16853a(r0, r1)
            goto L_0x019f
        L_0x018c:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.mo16853a(r0, r1)
            goto L_0x019f
        L_0x0196:
            r19 = r3
            r18 = r15
            double r3 = r22.mo16862L()
            float r14 = (float) r3
        L_0x019f:
            r3 = r19
            goto L_0x0016
        L_0x01a3:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo16870r()
            if (r6 == 0) goto L_0x01b3
            android.view.animation.Interpolator r0 = f15944a
            r11 = r10
        L_0x01b0:
            r12 = 0
            r13 = 0
            goto L_0x01d7
        L_0x01b3:
            if (r7 == 0) goto L_0x01bc
            if (r8 == 0) goto L_0x01bc
            android.view.animation.Interpolator r0 = m20988b(r7, r8)
            goto L_0x01d4
        L_0x01bc:
            if (r9 == 0) goto L_0x01d2
            if (r11 == 0) goto L_0x01d2
            if (r12 == 0) goto L_0x01d2
            if (r13 == 0) goto L_0x01d2
            android.view.animation.Interpolator r0 = m20988b(r9, r12)
            android.view.animation.Interpolator r1 = m20988b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01d7
        L_0x01d2:
            android.view.animation.Interpolator r0 = f15944a
        L_0x01d4:
            r11 = r16
            goto L_0x01b0
        L_0x01d7:
            if (r12 == 0) goto L_0x01e8
            if (r13 == 0) goto L_0x01e8
            e.b.a.a0.a r0 = new e.b.a.a0.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r5 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01f6
        L_0x01e8:
            r5 = r18
            e.b.a.a0.a r1 = new e.b.a.a0.a
            r14 = 0
            r8 = r1
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r1
        L_0x01f6:
            r0.f15127o = r5
            r3 = r19
            r0.f15128p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p193y.C5629q.m20991e(e.b.a.e, e.b.a.y.k0.c, float, e.b.a.y.j0):e.b.a.a0.a");
    }

    /* renamed from: f */
    private static <T> C5417a<T> m20992f(C5618c cVar, float f, C5614j0<T> j0Var) {
        return new C5417a<>(j0Var.mo16853a(cVar, f));
    }

    /* renamed from: g */
    private static C1802h<WeakReference<Interpolator>> m20993g() {
        if (f15945b == null) {
            f15945b = new C1802h<>();
        }
        return f15945b;
    }

    /* renamed from: h */
    private static void m20994h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C5629q.class) {
            f15945b.mo6281m(i, weakReference);
        }
    }
}
