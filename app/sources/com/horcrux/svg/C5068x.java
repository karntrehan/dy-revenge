package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.horcrux.svg.x */
class C5068x {

    /* renamed from: a */
    private static ArrayList<C5068x> f14319a;

    /* renamed from: b */
    private static int f14320b;

    /* renamed from: c */
    private static C5063v f14321c;

    /* renamed from: d */
    private static C5063v f14322d;

    /* renamed from: e */
    private static C5063v f14323e;

    /* renamed from: f */
    private static C5063v f14324f;

    /* renamed from: g */
    private static boolean f14325g;

    /* renamed from: h */
    C5072y f14326h;

    /* renamed from: i */
    C5063v f14327i;

    /* renamed from: j */
    double f14328j;

    /* renamed from: com.horcrux.svg.x$a */
    static /* synthetic */ class C5069a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14329a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14330b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                com.horcrux.svg.f[] r0 = com.horcrux.svg.C5027f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14330b = r0
                r1 = 1
                com.horcrux.svg.f r2 = com.horcrux.svg.C5027f.kCGPathElementAddCurveToPoint     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14330b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.f r3 = com.horcrux.svg.C5027f.kCGPathElementAddQuadCurveToPoint     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f14330b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.f r4 = com.horcrux.svg.C5027f.kCGPathElementMoveToPoint     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f14330b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.f r4 = com.horcrux.svg.C5027f.kCGPathElementAddLineToPoint     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f14330b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.f r4 = com.horcrux.svg.C5027f.kCGPathElementCloseSubpath     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.horcrux.svg.y[] r3 = com.horcrux.svg.C5072y.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f14329a = r3
                com.horcrux.svg.y r4 = com.horcrux.svg.C5072y.kStartMarker     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f14329a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.horcrux.svg.y r3 = com.horcrux.svg.C5072y.kMidMarker     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f14329a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.horcrux.svg.y r1 = com.horcrux.svg.C5072y.kEndMarker     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5068x.C5069a.<clinit>():void");
        }
    }

    private C5068x(C5072y yVar, C5063v vVar, double d) {
        this.f14326h = yVar;
        this.f14327i = vVar;
        this.f14328j = d;
    }

    /* renamed from: a */
    private static double m19151a(double d, double d2) {
        if (Math.abs(d - d2) > 180.0d) {
            d += 360.0d;
        }
        return (d + d2) / 2.0d;
    }

    /* renamed from: b */
    private static void m19152b(C5024d0 d0Var, C5063v vVar, C5063v vVar2, C5063v vVar3) {
        d0Var.f14030a = m19161k(vVar2, vVar);
        d0Var.f14031b = m19161k(vVar3, vVar2);
        if (m19159i(d0Var.f14030a)) {
            d0Var.f14030a = d0Var.f14031b;
        } else if (m19159i(d0Var.f14031b)) {
            d0Var.f14031b = d0Var.f14030a;
        }
    }

    /* renamed from: c */
    private static double m19153c(C5072y yVar) {
        double j = m19160j(m19156f(f14323e));
        double j2 = m19160j(m19156f(f14324f));
        int i = C5069a.f14329a[yVar.ordinal()];
        if (i == 1) {
            return f14325g ? j2 + 180.0d : j2;
        }
        if (i == 2) {
            return m19151a(j, j2);
        }
        if (i != 3) {
            return 0.0d;
        }
        return j;
    }

    /* renamed from: d */
    private static C5024d0 m19154d(C5055r rVar) {
        C5063v vVar;
        C5063v vVar2;
        C5063v vVar3;
        C5063v vVar4;
        C5024d0 d0Var = new C5024d0();
        C5063v[] vVarArr = rVar.f14262b;
        int i = C5069a.f14330b[rVar.f14261a.ordinal()];
        if (i == 1) {
            d0Var.f14032c = vVarArr[2];
            d0Var.f14030a = m19161k(vVarArr[0], f14321c);
            d0Var.f14031b = m19161k(vVarArr[2], vVarArr[1]);
            if (m19159i(d0Var.f14030a)) {
                m19152b(d0Var, vVarArr[0], vVarArr[1], vVarArr[2]);
            } else if (m19159i(d0Var.f14031b)) {
                vVar = f14321c;
                vVar2 = vVarArr[0];
                vVar3 = vVarArr[1];
            }
            return d0Var;
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                vVar4 = vVarArr[0];
            } else {
                if (i == 5) {
                    vVar4 = f14322d;
                }
                return d0Var;
            }
            d0Var.f14032c = vVar4;
            d0Var.f14030a = m19161k(vVar4, f14321c);
            d0Var.f14031b = m19161k(d0Var.f14032c, f14321c);
            return d0Var;
        } else {
            d0Var.f14032c = vVarArr[1];
            vVar = f14321c;
            vVar2 = vVarArr[0];
            vVar3 = vVarArr[1];
        }
        m19152b(d0Var, vVar, vVar2, vVar3);
        return d0Var;
    }

    /* renamed from: e */
    private static void m19155e() {
        C5072y yVar = C5072y.kEndMarker;
        f14319a.add(new C5068x(yVar, f14321c, m19153c(yVar)));
    }

    /* renamed from: f */
    private static double m19156f(C5063v vVar) {
        return Math.atan2(vVar.f14312b, vVar.f14311a);
    }

    /* renamed from: g */
    private static void m19157g(C5055r rVar) {
        C5063v vVar;
        C5024d0 d = m19154d(rVar);
        f14324f = d.f14030a;
        int i = f14320b;
        if (i > 0) {
            C5072y yVar = i == 1 ? C5072y.kStartMarker : C5072y.kMidMarker;
            f14319a.add(new C5068x(yVar, f14321c, m19153c(yVar)));
        }
        f14323e = d.f14031b;
        f14321c = d.f14032c;
        C5027f fVar = rVar.f14261a;
        if (fVar == C5027f.kCGPathElementMoveToPoint) {
            vVar = rVar.f14262b[0];
        } else {
            if (fVar == C5027f.kCGPathElementCloseSubpath) {
                vVar = new C5063v(0.0d, 0.0d);
            }
            f14320b++;
        }
        f14322d = vVar;
        f14320b++;
    }

    /* renamed from: h */
    static ArrayList<C5068x> m19158h(ArrayList<C5055r> arrayList) {
        f14319a = new ArrayList<>();
        f14320b = 0;
        f14321c = new C5063v(0.0d, 0.0d);
        f14322d = new C5063v(0.0d, 0.0d);
        Iterator<C5055r> it = arrayList.iterator();
        while (it.hasNext()) {
            m19157g(it.next());
        }
        m19155e();
        return f14319a;
    }

    /* renamed from: i */
    private static boolean m19159i(C5063v vVar) {
        return vVar.f14311a == 0.0d && vVar.f14312b == 0.0d;
    }

    /* renamed from: j */
    private static double m19160j(double d) {
        return d * 57.29577951308232d;
    }

    /* renamed from: k */
    private static C5063v m19161k(C5063v vVar, C5063v vVar2) {
        return new C5063v(vVar2.f14311a - vVar.f14311a, vVar2.f14312b - vVar.f14312b);
    }
}
