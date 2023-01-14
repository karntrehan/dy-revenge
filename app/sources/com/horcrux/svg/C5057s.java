package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import p027c.p028a.C1444j;

/* renamed from: com.horcrux.svg.s */
class C5057s {

    /* renamed from: a */
    static float f14266a;

    /* renamed from: b */
    private static int f14267b;

    /* renamed from: c */
    private static int f14268c;

    /* renamed from: d */
    private static String f14269d;

    /* renamed from: e */
    private static Path f14270e;

    /* renamed from: f */
    static ArrayList<C5055r> f14271f;

    /* renamed from: g */
    private static float f14272g;

    /* renamed from: h */
    private static float f14273h;

    /* renamed from: i */
    private static float f14274i;

    /* renamed from: j */
    private static float f14275j;

    /* renamed from: k */
    private static float f14276k;

    /* renamed from: l */
    private static float f14277l;

    /* renamed from: m */
    private static boolean f14278m;

    /* renamed from: A */
    private static void m19100A(float f, float f2, float f3, float f4) {
        f14274i = f;
        f14275j = f2;
        m19107e((f14272g * 2.0f) - f14274i, (f14273h * 2.0f) - f14275j, f, f2, f3, f4);
    }

    /* renamed from: B */
    private static void m19101B(float f, float f2) {
        m19102C(f + f14272g, f2 + f14273h);
    }

    /* renamed from: C */
    private static void m19102C(float f, float f2) {
        m19123u((f14272g * 2.0f) - f14274i, (f14273h * 2.0f) - f14275j, f, f2);
    }

    /* renamed from: a */
    private static void m19103a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m19104b(f, f2, f3, z, z2, f4 + f14272g, f5 + f14273h);
    }

    /* renamed from: b */
    private static void m19104b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        boolean z3 = z;
        boolean z4 = z2;
        float f9 = f14272g;
        float f10 = f14273h;
        float abs = Math.abs(f2 == 0.0f ? f == 0.0f ? f5 - f10 : f : f2);
        float abs2 = Math.abs(f == 0.0f ? f4 - f9 : f);
        if (abs2 == 0.0f || abs == 0.0f || (f4 == f9 && f5 == f10)) {
            m19114l(f4, f5);
            return;
        }
        float radians = (float) Math.toRadians((double) f3);
        double d = (double) radians;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f11 = f4 - f9;
        float f12 = f5 - f10;
        float f13 = ((cos * f11) / 2.0f) + ((sin * f12) / 2.0f);
        float f14 = -sin;
        float f15 = ((f14 * f11) / 2.0f) + ((cos * f12) / 2.0f);
        float f16 = abs2 * abs2;
        float f17 = f16 * abs * abs;
        float f18 = abs * abs * f13 * f13;
        float f19 = f16 * f15 * f15;
        float f20 = (f17 - f19) - f18;
        if (f20 < 0.0f) {
            f6 = f14;
            float sqrt = (float) Math.sqrt((double) (1.0f - (f20 / f17)));
            abs2 *= sqrt;
            abs *= sqrt;
            f7 = f11 / 2.0f;
            f8 = f12 / 2.0f;
        } else {
            f6 = f14;
            float sqrt2 = (float) Math.sqrt((double) (f20 / (f19 + f18)));
            if (z3 == z4) {
                sqrt2 = -sqrt2;
            }
            float f21 = (((-sqrt2) * f15) * abs2) / abs;
            float f22 = ((sqrt2 * f13) * abs) / abs2;
            f7 = ((cos * f21) - (sin * f22)) + (f11 / 2.0f);
            f8 = (f12 / 2.0f) + (f21 * sin) + (f22 * cos);
        }
        float f23 = cos / abs2;
        float f24 = sin / abs2;
        float f25 = f6 / abs;
        float f26 = cos / abs;
        float f27 = -f7;
        float f28 = -f8;
        float f29 = abs;
        float f30 = abs2;
        float f31 = radians;
        float atan2 = (float) Math.atan2((double) ((f25 * f27) + (f26 * f28)), (double) ((f27 * f23) + (f28 * f24)));
        float f32 = f11 - f7;
        float f33 = f12 - f8;
        float atan22 = (float) Math.atan2((double) ((f25 * f32) + (f26 * f33)), (double) ((f23 * f32) + (f24 * f33)));
        float f34 = f7 + f9;
        float f35 = f8 + f10;
        float f36 = f11 + f9;
        float f37 = f12 + f10;
        m19125w();
        f14274i = f36;
        f14272g = f36;
        f14275j = f37;
        f14273h = f37;
        if (f30 == f29 && f31 == 0.0f) {
            float degrees = (float) Math.toDegrees((double) atan2);
            float abs3 = Math.abs((degrees - ((float) Math.toDegrees((double) atan22))) % 360.0f);
            if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
                abs3 = 360.0f - abs3;
            }
            if (!z2) {
                abs3 = -abs3;
            }
            float f38 = f14266a;
            f14270e.arcTo(new RectF((f34 - f30) * f38, (f35 - f30) * f38, (f34 + f30) * f38, (f35 + f30) * f38), degrees, abs3);
            f14271f.add(new C5055r(C5027f.kCGPathElementAddCurveToPoint, new C5063v[]{new C5063v((double) f36, (double) f37)}));
            return;
        }
        m19105c(f34, f35, f30, f29, atan2, atan22, z2, f31);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068 A[LOOP:0: B:10:0x0066->B:11:0x0068, LOOP_END] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19105c(float r24, float r25, float r26, float r27, float r28, float r29, boolean r30, float r31) {
        /*
            r0 = r28
            r1 = r31
            double r1 = (double) r1
            double r3 = java.lang.Math.cos(r1)
            float r3 = (float) r3
            double r1 = java.lang.Math.sin(r1)
            float r1 = (float) r1
            float r2 = r3 * r26
            float r4 = -r1
            float r4 = r4 * r27
            float r1 = r1 * r26
            float r3 = r3 * r27
            float r5 = r29 - r0
            r6 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 >= 0) goto L_0x002a
            if (r30 == 0) goto L_0x002a
            double r8 = (double) r5
            double r8 = r8 + r6
        L_0x0028:
            float r5 = (float) r8
            goto L_0x0033
        L_0x002a:
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0033
            if (r30 != 0) goto L_0x0033
            double r8 = (double) r5
            double r8 = r8 - r6
            goto L_0x0028
        L_0x0033:
            double r6 = (double) r5
            r8 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 / r8
            double r6 = m19124v(r6)
            double r6 = java.lang.Math.abs(r6)
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r7 = (float) r6
            float r5 = r5 / r7
            r7 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            r9 = 1082130432(0x40800000, float:4.0)
            float r9 = r5 / r9
            double r9 = (double) r9
            double r9 = java.lang.Math.tan(r9)
            double r9 = r9 * r7
            float r7 = (float) r9
            double r8 = (double) r0
            double r10 = java.lang.Math.cos(r8)
            float r10 = (float) r10
            double r8 = java.lang.Math.sin(r8)
            float r8 = (float) r8
            r11 = 0
        L_0x0066:
            if (r11 >= r6) goto L_0x0126
            float r12 = r7 * r8
            float r12 = r10 - r12
            float r10 = r10 * r7
            float r8 = r8 + r10
            float r0 = r0 + r5
            double r13 = (double) r0
            double r9 = java.lang.Math.cos(r13)
            float r10 = (float) r9
            double r13 = java.lang.Math.sin(r13)
            float r9 = (float) r13
            float r13 = r7 * r9
            float r13 = r13 + r10
            float r14 = r7 * r10
            float r14 = r9 - r14
            float r15 = r2 * r12
            float r15 = r24 + r15
            float r16 = r4 * r8
            float r15 = r15 + r16
            float r12 = r12 * r1
            float r12 = r25 + r12
            float r8 = r8 * r3
            float r12 = r12 + r8
            float r8 = r2 * r13
            float r8 = r24 + r8
            float r16 = r4 * r14
            float r8 = r8 + r16
            float r13 = r13 * r1
            float r13 = r25 + r13
            float r14 = r14 * r3
            float r13 = r13 + r14
            float r14 = r2 * r10
            float r14 = r24 + r14
            float r16 = r4 * r9
            float r14 = r14 + r16
            float r16 = r1 * r10
            float r16 = r25 + r16
            float r17 = r3 * r9
            r27 = r0
            float r0 = r16 + r17
            android.graphics.Path r16 = f14270e
            float r17 = f14266a
            float r18 = r15 * r17
            float r19 = r12 * r17
            float r20 = r8 * r17
            float r21 = r13 * r17
            float r22 = r14 * r17
            float r23 = r0 * r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r16.cubicTo(r17, r18, r19, r20, r21, r22)
            r31 = r1
            java.util.ArrayList<com.horcrux.svg.r> r1 = f14271f
            r16 = r2
            com.horcrux.svg.r r2 = new com.horcrux.svg.r
            r17 = r3
            com.horcrux.svg.f r3 = com.horcrux.svg.C5027f.kCGPathElementAddCurveToPoint
            r18 = r4
            r4 = 3
            com.horcrux.svg.v[] r4 = new com.horcrux.svg.C5063v[r4]
            r29 = r5
            com.horcrux.svg.v r5 = new com.horcrux.svg.v
            r19 = r6
            r20 = r7
            double r6 = (double) r15
            r21 = r9
            r15 = r10
            double r9 = (double) r12
            r5.<init>(r6, r9)
            r6 = 0
            r4[r6] = r5
            com.horcrux.svg.v r5 = new com.horcrux.svg.v
            double r7 = (double) r8
            double r9 = (double) r13
            r5.<init>(r7, r9)
            r7 = 1
            r4[r7] = r5
            r5 = 2
            com.horcrux.svg.v r7 = new com.horcrux.svg.v
            double r8 = (double) r14
            double r12 = (double) r0
            r7.<init>(r8, r12)
            r4[r5] = r7
            r2.<init>(r3, r4)
            r1.add(r2)
            int r11 = r11 + 1
            r0 = r27
            r5 = r29
            r1 = r31
            r10 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            goto L_0x0066
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5057s.m19105c(float, float, float, float, float, float, boolean, float):void");
    }

    /* renamed from: d */
    private static void m19106d() {
        if (f14278m) {
            f14272g = f14276k;
            f14273h = f14277l;
            f14278m = false;
            f14270e.close();
            f14271f.add(new C5055r(C5027f.kCGPathElementCloseSubpath, new C5063v[]{new C5063v((double) f14272g, (double) f14273h)}));
        }
    }

    /* renamed from: e */
    private static void m19107e(float f, float f2, float f3, float f4, float f5, float f6) {
        m19125w();
        f14272g = f5;
        f14273h = f6;
        Path path = f14270e;
        float f7 = f14266a;
        path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f6 * f7);
        f14271f.add(new C5055r(C5027f.kCGPathElementAddCurveToPoint, new C5063v[]{new C5063v((double) f, (double) f2), new C5063v((double) f3, (double) f4), new C5063v((double) f5, (double) f6)}));
    }

    /* renamed from: f */
    private static void m19108f(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f14272g;
        float f8 = f14273h;
        m19109g(f + f7, f2 + f8, f3 + f7, f4 + f8, f5 + f7, f6 + f8);
    }

    /* renamed from: g */
    private static void m19109g(float f, float f2, float f3, float f4, float f5, float f6) {
        f14274i = f3;
        f14275j = f4;
        m19107e(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: h */
    private static boolean m19110h(char c) {
        return Character.isUpperCase(c);
    }

    /* renamed from: i */
    private static boolean m19111i(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case C1444j.f4211C0:
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case C1444j.f4221E0:
            case C1444j.f4226F0:
            case C1444j.f4236H0:
            case C1444j.f4256L0:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    private static boolean m19112j(char c) {
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+';
    }

    /* renamed from: k */
    private static void m19113k(float f, float f2) {
        m19114l(f + f14272g, f2 + f14273h);
    }

    /* renamed from: l */
    private static void m19114l(float f, float f2) {
        m19125w();
        f14272g = f;
        f14274i = f;
        f14273h = f2;
        f14275j = f2;
        Path path = f14270e;
        float f3 = f14266a;
        path.lineTo(f * f3, f3 * f2);
        f14271f.add(new C5055r(C5027f.kCGPathElementAddLineToPoint, new C5063v[]{new C5063v((double) f, (double) f2)}));
    }

    /* renamed from: m */
    private static void m19115m(float f, float f2) {
        m19116n(f + f14272g, f2 + f14273h);
    }

    /* renamed from: n */
    private static void m19116n(float f, float f2) {
        f14272g = f;
        f14274i = f;
        f14276k = f;
        f14273h = f2;
        f14275j = f2;
        f14277l = f2;
        Path path = f14270e;
        float f3 = f14266a;
        path.moveTo(f * f3, f3 * f2);
        f14271f.add(new C5055r(C5027f.kCGPathElementMoveToPoint, new C5063v[]{new C5063v((double) f, (double) f2)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b4, code lost:
        r7 = m19119q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01bf, code lost:
        m19114l(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fe, code lost:
        if (r4 == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0200, code lost:
        if (r6 == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0202, code lost:
        r3 = 'M';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0206, code lost:
        r3 = 'm';
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ae A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Path m19117o(java.lang.String r25) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f14271f = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            f14270e = r0
            if (r25 != 0) goto L_0x0011
            return r0
        L_0x0011:
            int r0 = r25.length()
            f14268c = r0
            f14269d = r25
            r0 = 0
            f14267b = r0
            r1 = 0
            f14272g = r1
            f14273h = r1
            f14274i = r1
            f14275j = r1
            f14276k = r1
            f14277l = r1
            f14278m = r0
            r2 = 32
            r3 = 32
        L_0x002f:
            int r4 = f14267b
            int r5 = f14268c
            if (r4 >= r5) goto L_0x023a
            m19127y()
            int r4 = f14267b
            int r5 = f14268c
            if (r4 < r5) goto L_0x0040
            goto L_0x023a
        L_0x0040:
            r5 = 1
            if (r3 == r2) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            java.lang.String r7 = f14269d
            char r4 = r7.charAt(r4)
            r7 = 3
            java.lang.String r8 = "Unexpected character '%c' (i=%d, s=%s)"
            r9 = 2
            r10 = 109(0x6d, float:1.53E-43)
            r11 = 77
            if (r6 != 0) goto L_0x0079
            if (r4 == r11) goto L_0x0079
            if (r4 != r10) goto L_0x005b
            goto L_0x0079
        L_0x005b:
            java.lang.Error r1 = new java.lang.Error
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Character r3 = java.lang.Character.valueOf(r4)
            r2[r0] = r3
            int r0 = f14267b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r5] = r0
            java.lang.String r0 = f14269d
            r2[r9] = r0
            java.lang.String r0 = java.lang.String.format(r8, r2)
            r1.<init>(r0)
            throw r1
        L_0x0079:
            boolean r12 = m19111i(r4)
            if (r12 == 0) goto L_0x0087
            int r3 = f14267b
            int r3 = r3 + r5
            f14267b = r3
            r3 = r4
        L_0x0085:
            r4 = 0
            goto L_0x00a7
        L_0x0087:
            boolean r12 = m19112j(r4)
            if (r12 == 0) goto L_0x021c
            if (r6 == 0) goto L_0x021c
            r4 = 90
            if (r3 == r4) goto L_0x020a
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L_0x020a
            if (r3 == r11) goto L_0x009b
            if (r3 != r10) goto L_0x0085
        L_0x009b:
            boolean r3 = m19110h(r3)
            if (r3 == 0) goto L_0x00a4
            r3 = 76
            goto L_0x00a6
        L_0x00a4:
            r3 = 108(0x6c, float:1.51E-43)
        L_0x00a6:
            r4 = 1
        L_0x00a7:
            boolean r6 = m19110h(r3)
            switch(r3) {
                case 65: goto L_0x01df;
                case 67: goto L_0x01c3;
                case 72: goto L_0x01b9;
                case 76: goto L_0x01b0;
                case 77: goto L_0x01a4;
                case 81: goto L_0x0190;
                case 83: goto L_0x017c;
                case 84: goto L_0x016f;
                case 86: goto L_0x016c;
                case 90: goto L_0x0167;
                case 97: goto L_0x0146;
                case 99: goto L_0x0129;
                case 104: goto L_0x0120;
                case 108: goto L_0x0113;
                case 109: goto L_0x0106;
                case 113: goto L_0x00f1;
                case 115: goto L_0x00dc;
                case 116: goto L_0x00cf;
                case 118: goto L_0x00c6;
                case 122: goto L_0x0167;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            java.lang.Error r1 = new java.lang.Error
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = f14269d
            r2[r5] = r0
            java.lang.String r0 = "Unexpected comand '%c' (s=%s)"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x00c6:
            float r5 = m19119q()
            m19113k(r1, r5)
            goto L_0x01fe
        L_0x00cf:
            float r5 = m19119q()
            float r7 = m19119q()
            m19101B(r5, r7)
            goto L_0x01fe
        L_0x00dc:
            float r5 = m19119q()
            float r7 = m19119q()
            float r8 = m19119q()
            float r9 = m19119q()
            m19128z(r5, r7, r8, r9)
            goto L_0x01fe
        L_0x00f1:
            float r5 = m19119q()
            float r7 = m19119q()
            float r8 = m19119q()
            float r9 = m19119q()
            m19122t(r5, r7, r8, r9)
            goto L_0x01fe
        L_0x0106:
            float r5 = m19119q()
            float r7 = m19119q()
            m19115m(r5, r7)
            goto L_0x01fe
        L_0x0113:
            float r5 = m19119q()
            float r7 = m19119q()
            m19113k(r5, r7)
            goto L_0x01fe
        L_0x0120:
            float r5 = m19119q()
            m19113k(r5, r1)
            goto L_0x01fe
        L_0x0129:
            float r12 = m19119q()
            float r13 = m19119q()
            float r14 = m19119q()
            float r15 = m19119q()
            float r16 = m19119q()
            float r17 = m19119q()
            m19108f(r12, r13, r14, r15, r16, r17)
            goto L_0x01fe
        L_0x0146:
            float r18 = m19119q()
            float r19 = m19119q()
            float r20 = m19119q()
            boolean r21 = m19118p()
            boolean r22 = m19118p()
            float r23 = m19119q()
            float r24 = m19119q()
            m19103a(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x01fe
        L_0x0167:
            m19106d()
            goto L_0x01fe
        L_0x016c:
            float r5 = f14272g
            goto L_0x01b4
        L_0x016f:
            float r5 = m19119q()
            float r7 = m19119q()
            m19102C(r5, r7)
            goto L_0x01fe
        L_0x017c:
            float r5 = m19119q()
            float r7 = m19119q()
            float r8 = m19119q()
            float r9 = m19119q()
            m19100A(r5, r7, r8, r9)
            goto L_0x01fe
        L_0x0190:
            float r5 = m19119q()
            float r7 = m19119q()
            float r8 = m19119q()
            float r9 = m19119q()
            m19123u(r5, r7, r8, r9)
            goto L_0x01fe
        L_0x01a4:
            float r5 = m19119q()
            float r7 = m19119q()
            m19116n(r5, r7)
            goto L_0x01fe
        L_0x01b0:
            float r5 = m19119q()
        L_0x01b4:
            float r7 = m19119q()
            goto L_0x01bf
        L_0x01b9:
            float r5 = m19119q()
            float r7 = f14273h
        L_0x01bf:
            m19114l(r5, r7)
            goto L_0x01fe
        L_0x01c3:
            float r12 = m19119q()
            float r13 = m19119q()
            float r14 = m19119q()
            float r15 = m19119q()
            float r16 = m19119q()
            float r17 = m19119q()
            m19109g(r12, r13, r14, r15, r16, r17)
            goto L_0x01fe
        L_0x01df:
            float r18 = m19119q()
            float r19 = m19119q()
            float r20 = m19119q()
            boolean r21 = m19118p()
            boolean r22 = m19118p()
            float r23 = m19119q()
            float r24 = m19119q()
            m19104b(r18, r19, r20, r21, r22, r23, r24)
        L_0x01fe:
            if (r4 == 0) goto L_0x002f
            if (r6 == 0) goto L_0x0206
            r3 = 77
            goto L_0x002f
        L_0x0206:
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x002f
        L_0x020a:
            java.lang.Error r1 = new java.lang.Error
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = f14269d
            r2[r0] = r3
            java.lang.String r0 = "Unexpected number after 'z' (s=%s)"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x021c:
            java.lang.Error r1 = new java.lang.Error
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Character r3 = java.lang.Character.valueOf(r4)
            r2[r0] = r3
            int r0 = f14267b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r5] = r0
            java.lang.String r0 = f14269d
            r2[r9] = r0
            java.lang.String r0 = java.lang.String.format(r8, r2)
            r1.<init>(r0)
            throw r1
        L_0x023a:
            android.graphics.Path r0 = f14270e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5057s.m19117o(java.lang.String):android.graphics.Path");
    }

    /* renamed from: p */
    private static boolean m19118p() {
        m19127y();
        char charAt = f14269d.charAt(f14267b);
        if (charAt == '0' || charAt == '1') {
            int i = f14267b + 1;
            f14267b = i;
            if (i < f14268c && f14269d.charAt(i) == ',') {
                f14267b++;
            }
            m19127y();
            return charAt == '1';
        }
        throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt), Integer.valueOf(f14267b), f14269d}));
    }

    /* renamed from: q */
    private static float m19119q() {
        if (f14267b != f14268c) {
            float s = m19121s();
            m19127y();
            m19120r();
            return s;
        }
        throw new Error(String.format("Unexpected end (s=%s)", new Object[]{f14269d}));
    }

    /* renamed from: r */
    private static void m19120r() {
        int i = f14267b;
        if (i < f14268c && f14269d.charAt(i) == ',') {
            f14267b++;
        }
    }

    /* renamed from: s */
    private static float m19121s() {
        char charAt;
        m19127y();
        int i = f14267b;
        if (i != f14268c) {
            char charAt2 = f14269d.charAt(i);
            if (charAt2 == '-' || charAt2 == '+') {
                int i2 = f14267b + 1;
                f14267b = i2;
                charAt2 = f14269d.charAt(i2);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                m19126x();
                int i3 = f14267b;
                if (i3 < f14268c) {
                    charAt2 = f14269d.charAt(i3);
                }
            } else if (charAt2 != '.') {
                throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt2), Integer.valueOf(f14267b), f14269d}));
            }
            if (charAt2 == '.') {
                f14267b++;
                m19126x();
                int i4 = f14267b;
                if (i4 < f14268c) {
                    charAt2 = f14269d.charAt(i4);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i5 = f14267b;
                if (!(i5 + 1 >= f14268c || (charAt = f14269d.charAt(i5 + 1)) == 'm' || charAt == 'x')) {
                    int i6 = f14267b + 1;
                    f14267b = i6;
                    char charAt3 = f14269d.charAt(i6);
                    if (charAt3 == '+' || charAt3 == '-') {
                        f14267b++;
                    } else if (charAt3 < '0' || charAt3 > '9') {
                        throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt3), Integer.valueOf(f14267b), f14269d}));
                    }
                    m19126x();
                }
            }
            String substring = f14269d.substring(i, f14267b);
            float parseFloat = Float.parseFloat(substring);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            throw new Error(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", new Object[]{substring, Integer.valueOf(i), Integer.valueOf(f14267b), f14269d}));
        }
        throw new Error(String.format("Unexpected end (s=%s)", new Object[]{f14269d}));
    }

    /* renamed from: t */
    private static void m19122t(float f, float f2, float f3, float f4) {
        float f5 = f14272g;
        float f6 = f14273h;
        m19123u(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    /* renamed from: u */
    private static void m19123u(float f, float f2, float f3, float f4) {
        f14274i = f;
        f14275j = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        float f7 = (f14272g + f5) / 3.0f;
        float f8 = (f14273h + f6) / 3.0f;
        m19107e(f7, f8, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    /* renamed from: v */
    private static double m19124v(double d) {
        double pow = Math.pow(10.0d, 4.0d);
        return ((double) Math.round(d * pow)) / pow;
    }

    /* renamed from: w */
    private static void m19125w() {
        if (!f14278m) {
            f14276k = f14272g;
            f14277l = f14273h;
            f14278m = true;
        }
    }

    /* renamed from: x */
    private static void m19126x() {
        while (true) {
            int i = f14267b;
            if (i < f14268c && Character.isDigit(f14269d.charAt(i))) {
                f14267b++;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    private static void m19127y() {
        while (true) {
            int i = f14267b;
            if (i < f14268c && Character.isWhitespace(f14269d.charAt(i))) {
                f14267b++;
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    private static void m19128z(float f, float f2, float f3, float f4) {
        float f5 = f14272g;
        float f6 = f14273h;
        m19100A(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }
}
