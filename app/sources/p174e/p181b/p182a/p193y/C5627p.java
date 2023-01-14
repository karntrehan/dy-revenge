package p174e.p181b.p182a.p193y;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.p */
class C5627p {

    /* renamed from: a */
    private static final C5618c.C5619a f15942a = C5618c.C5619a.m20942a("x", "y");

    /* renamed from: e.b.a.y.p$a */
    static /* synthetic */ class C5628a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15943a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.b.a.y.k0.c$b[] r0 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15943a = r0
                e.b.a.y.k0.c$b r1 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15943a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.y.k0.c$b r1 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15943a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.b.a.y.k0.c$b r1 = p174e.p181b.p182a.p193y.p194k0.C5618c.C5620b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p193y.C5627p.C5628a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static PointF m20980a(C5618c cVar, float f) {
        cVar.mo16865b();
        float L = (float) cVar.mo16862L();
        float L2 = (float) cVar.mo16862L();
        while (cVar.mo16868n0() != C5618c.C5620b.END_ARRAY) {
            cVar.mo16874w0();
        }
        cVar.mo16869o();
        return new PointF(L * f, L2 * f);
    }

    /* renamed from: b */
    private static PointF m20981b(C5618c cVar, float f) {
        float L = (float) cVar.mo16862L();
        float L2 = (float) cVar.mo16862L();
        while (cVar.mo16860E()) {
            cVar.mo16874w0();
        }
        return new PointF(L * f, L2 * f);
    }

    /* renamed from: c */
    private static PointF m20982c(C5618c cVar, float f) {
        cVar.mo16867h();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15942a);
            if (u0 == 0) {
                f2 = m20986g(cVar);
            } else if (u0 != 1) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                f3 = m20986g(cVar);
            }
        }
        cVar.mo16870r();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: d */
    static int m20983d(C5618c cVar) {
        cVar.mo16865b();
        int L = (int) (cVar.mo16862L() * 255.0d);
        int L2 = (int) (cVar.mo16862L() * 255.0d);
        int L3 = (int) (cVar.mo16862L() * 255.0d);
        while (cVar.mo16860E()) {
            cVar.mo16874w0();
        }
        cVar.mo16869o();
        return Color.argb(255, L, L2, L3);
    }

    /* renamed from: e */
    static PointF m20984e(C5618c cVar, float f) {
        int i = C5628a.f15943a[cVar.mo16868n0().ordinal()];
        if (i == 1) {
            return m20981b(cVar, f);
        }
        if (i == 2) {
            return m20980a(cVar, f);
        }
        if (i == 3) {
            return m20982c(cVar, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.mo16868n0());
    }

    /* renamed from: f */
    static List<PointF> m20985f(C5618c cVar, float f) {
        ArrayList arrayList = new ArrayList();
        cVar.mo16865b();
        while (cVar.mo16868n0() == C5618c.C5620b.BEGIN_ARRAY) {
            cVar.mo16865b();
            arrayList.add(m20984e(cVar, f));
            cVar.mo16869o();
        }
        cVar.mo16869o();
        return arrayList;
    }

    /* renamed from: g */
    static float m20986g(C5618c cVar) {
        C5618c.C5620b n0 = cVar.mo16868n0();
        int i = C5628a.f15943a[n0.ordinal()];
        if (i == 1) {
            return (float) cVar.mo16862L();
        }
        if (i == 2) {
            cVar.mo16865b();
            float L = (float) cVar.mo16862L();
            while (cVar.mo16860E()) {
                cVar.mo16874w0();
            }
            cVar.mo16869o();
            return L;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + n0);
    }
}
