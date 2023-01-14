package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import okhttp3.HttpUrl;

/* renamed from: com.horcrux.svg.h */
class C5032h {

    /* renamed from: a */
    static final C5032h f14072a = new C5032h();

    /* renamed from: b */
    final double f14073b;

    /* renamed from: c */
    final String f14074c;

    /* renamed from: d */
    final C5041k0 f14075d;

    /* renamed from: e */
    final ReadableMap f14076e;

    /* renamed from: f */
    C5046m0 f14077f;

    /* renamed from: g */
    int f14078g;

    /* renamed from: h */
    final String f14079h;

    /* renamed from: i */
    final String f14080i;

    /* renamed from: j */
    final C5043l0 f14081j;

    /* renamed from: k */
    final C5048n0 f14082k;

    /* renamed from: l */
    private final C5050o0 f14083l;

    /* renamed from: m */
    final double f14084m;

    /* renamed from: n */
    final double f14085n;

    /* renamed from: o */
    final double f14086o;

    /* renamed from: p */
    final boolean f14087p;

    /* renamed from: com.horcrux.svg.h$a */
    static class C5033a {

        /* renamed from: a */
        private static final C5046m0[] f14088a;

        /* renamed from: b */
        private static final int[] f14089b = {400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};

        static {
            C5046m0 m0Var = C5046m0.w100;
            C5046m0 m0Var2 = C5046m0.w900;
            f14088a = new C5046m0[]{m0Var, m0Var, C5046m0.w200, C5046m0.w300, C5046m0.Normal, C5046m0.w500, C5046m0.w600, C5046m0.Bold, C5046m0.w800, m0Var2, m0Var2};
        }

        /* renamed from: a */
        private static int m19010a(int i) {
            if (i < 350) {
                return 400;
            }
            if (i < 550) {
                return 700;
            }
            if (i < 900) {
                return 900;
            }
            return i;
        }

        /* renamed from: b */
        static int m19011b(C5046m0 m0Var, C5032h hVar) {
            return m0Var == C5046m0.Bolder ? m19010a(hVar.f14078g) : m0Var == C5046m0.Lighter ? m19012c(hVar.f14078g) : f14089b[m0Var.ordinal()];
        }

        /* renamed from: c */
        private static int m19012c(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? 400 : 700;
        }

        /* renamed from: d */
        static C5046m0 m19013d(int i) {
            return f14088a[Math.round(((float) i) / 100.0f)];
        }
    }

    private C5032h() {
        this.f14076e = null;
        this.f14074c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14075d = C5041k0.normal;
        this.f14077f = C5046m0.Normal;
        this.f14078g = 400;
        this.f14079h = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14080i = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14081j = C5043l0.normal;
        this.f14082k = C5048n0.start;
        this.f14083l = C5050o0.None;
        this.f14087p = false;
        this.f14084m = 0.0d;
        this.f14073b = 12.0d;
        this.f14085n = 0.0d;
        this.f14086o = 0.0d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C5032h(com.facebook.react.bridge.ReadableMap r12, com.horcrux.svg.C5032h r13, double r14) {
        /*
            r11 = this;
            r11.<init>()
            double r7 = r13.f14073b
            java.lang.String r0 = "fontSize"
            boolean r0 = r12.hasKey(r0)
            if (r0 == 0) goto L_0x001b
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r2 = "fontSize"
            r0 = r11
            r1 = r12
            r5 = r7
            double r0 = r0.m19009c(r1, r2, r3, r5, r7)
            r11.f14073b = r0
            goto L_0x001d
        L_0x001b:
            r11.f14073b = r7
        L_0x001d:
            java.lang.String r0 = "fontWeight"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x0057
            com.facebook.react.bridge.ReadableType r1 = r12.getType(r0)
            com.facebook.react.bridge.ReadableType r2 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r2) goto L_0x0035
            double r0 = r12.getDouble(r0)
        L_0x0031:
            r11.m19007a(r13, r0)
            goto L_0x005a
        L_0x0035:
            java.lang.String r0 = r12.getString(r0)
            boolean r1 = com.horcrux.svg.C5046m0.m19088h(r0)
            if (r1 == 0) goto L_0x0050
            com.horcrux.svg.m0 r0 = com.horcrux.svg.C5046m0.m19087g(r0)
            int r0 = com.horcrux.svg.C5032h.C5033a.m19011b(r0, r13)
            r11.f14078g = r0
            com.horcrux.svg.m0 r0 = com.horcrux.svg.C5032h.C5033a.m19013d(r0)
            r11.f14077f = r0
            goto L_0x005a
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            double r0 = java.lang.Double.parseDouble(r0)
            goto L_0x0031
        L_0x0057:
            r11.m19008b(r13)
        L_0x005a:
            java.lang.String r0 = "fontData"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x0067
            com.facebook.react.bridge.ReadableMap r0 = r12.getMap(r0)
            goto L_0x0069
        L_0x0067:
            com.facebook.react.bridge.ReadableMap r0 = r13.f14076e
        L_0x0069:
            r11.f14076e = r0
            java.lang.String r0 = "fontFamily"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = r12.getString(r0)
            goto L_0x007a
        L_0x0078:
            java.lang.String r0 = r13.f14074c
        L_0x007a:
            r11.f14074c = r0
            java.lang.String r0 = "fontStyle"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r12.getString(r0)
            com.horcrux.svg.k0 r0 = com.horcrux.svg.C5041k0.valueOf(r0)
            goto L_0x008f
        L_0x008d:
            com.horcrux.svg.k0 r0 = r13.f14075d
        L_0x008f:
            r11.f14075d = r0
            java.lang.String r0 = "fontFeatureSettings"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = r12.getString(r0)
            goto L_0x00a0
        L_0x009e:
            java.lang.String r0 = r13.f14079h
        L_0x00a0:
            r11.f14079h = r0
            java.lang.String r0 = "fontVariationSettings"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x00af
            java.lang.String r0 = r12.getString(r0)
            goto L_0x00b1
        L_0x00af:
            java.lang.String r0 = r13.f14080i
        L_0x00b1:
            r11.f14080i = r0
            java.lang.String r0 = "fontVariantLigatures"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = r12.getString(r0)
            com.horcrux.svg.l0 r0 = com.horcrux.svg.C5043l0.valueOf(r0)
            goto L_0x00c6
        L_0x00c4:
            com.horcrux.svg.l0 r0 = r13.f14081j
        L_0x00c6:
            r11.f14081j = r0
            java.lang.String r0 = "textAnchor"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = r12.getString(r0)
            com.horcrux.svg.n0 r0 = com.horcrux.svg.C5048n0.valueOf(r0)
            goto L_0x00db
        L_0x00d9:
            com.horcrux.svg.n0 r0 = r13.f14082k
        L_0x00db:
            r11.f14082k = r0
            java.lang.String r0 = "textDecoration"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x00ee
            java.lang.String r0 = r12.getString(r0)
            com.horcrux.svg.o0 r0 = com.horcrux.svg.C5050o0.m19093g(r0)
            goto L_0x00f0
        L_0x00ee:
            com.horcrux.svg.o0 r0 = r13.f14083l
        L_0x00f0:
            r11.f14083l = r0
            java.lang.String r0 = "kerning"
            boolean r0 = r12.hasKey(r0)
            if (r0 != 0) goto L_0x0101
            boolean r1 = r13.f14087p
            if (r1 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r1 = 0
            goto L_0x0102
        L_0x0101:
            r1 = 1
        L_0x0102:
            r11.f14087p = r1
            if (r0 == 0) goto L_0x0114
            double r7 = r11.f14073b
            r9 = 0
            java.lang.String r4 = "kerning"
            r2 = r11
            r3 = r12
            r5 = r14
            double r0 = r2.m19009c(r3, r4, r5, r7, r9)
            goto L_0x0116
        L_0x0114:
            double r0 = r13.f14084m
        L_0x0116:
            r11.f14084m = r0
            java.lang.String r0 = "wordSpacing"
            boolean r0 = r12.hasKey(r0)
            if (r0 == 0) goto L_0x012e
            double r6 = r11.f14073b
            r8 = 0
            java.lang.String r3 = "wordSpacing"
            r1 = r11
            r2 = r12
            r4 = r14
            double r0 = r1.m19009c(r2, r3, r4, r6, r8)
            goto L_0x0130
        L_0x012e:
            double r0 = r13.f14085n
        L_0x0130:
            r11.f14085n = r0
            java.lang.String r0 = "letterSpacing"
            boolean r0 = r12.hasKey(r0)
            if (r0 == 0) goto L_0x0148
            double r6 = r11.f14073b
            r8 = 0
            java.lang.String r3 = "letterSpacing"
            r1 = r11
            r2 = r12
            r4 = r14
            double r12 = r1.m19009c(r2, r3, r4, r6, r8)
            goto L_0x014a
        L_0x0148:
            double r12 = r13.f14086o
        L_0x014a:
            r11.f14086o = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5032h.<init>(com.facebook.react.bridge.ReadableMap, com.horcrux.svg.h, double):void");
    }

    /* renamed from: a */
    private void m19007a(C5032h hVar, double d) {
        long round = Math.round(d);
        if (round < 1 || round > 1000) {
            m19008b(hVar);
            return;
        }
        int i = (int) round;
        this.f14078g = i;
        this.f14077f = C5033a.m19013d(i);
    }

    /* renamed from: b */
    private void m19008b(C5032h hVar) {
        this.f14078g = hVar.f14078g;
        this.f14077f = hVar.f14077f;
    }

    /* renamed from: c */
    private double m19009c(ReadableMap readableMap, String str, double d, double d2, double d3) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : C5065w.m19148b(readableMap.getString(str), d3, d, d2);
    }
}
