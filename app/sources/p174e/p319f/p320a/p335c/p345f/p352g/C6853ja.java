package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p319f.p320a.p363d.C9024k;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.g.ja */
final class C6853ja<T> implements C6981ra<T> {

    /* renamed from: a */
    private static final int[] f18553a = new int[0];

    /* renamed from: b */
    private static final Unsafe f18554b = C7014tb.m26621l();

    /* renamed from: c */
    private final int[] f18555c;

    /* renamed from: d */
    private final Object[] f18556d;

    /* renamed from: e */
    private final int f18557e;

    /* renamed from: f */
    private final int f18558f;

    /* renamed from: g */
    private final C6805ga f18559g;

    /* renamed from: h */
    private final boolean f18560h;

    /* renamed from: i */
    private final boolean f18561i;

    /* renamed from: j */
    private final int[] f18562j;

    /* renamed from: k */
    private final int f18563k;

    /* renamed from: l */
    private final int f18564l;

    /* renamed from: m */
    private final C7012t9 f18565m;

    /* renamed from: n */
    private final C6854jb f18566n;

    /* renamed from: o */
    private final C6915n8 f18567o;

    /* renamed from: p */
    private final C6885la f18568p;

    /* renamed from: q */
    private final C6720ba f18569q;

    private C6853ja(int[] iArr, Object[] objArr, int i, int i2, C6805ga gaVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C6885la laVar, C7012t9 t9Var, C6854jb jbVar, C6915n8 n8Var, C6720ba baVar, byte[] bArr) {
        C6805ga gaVar2 = gaVar;
        C6915n8 n8Var2 = n8Var;
        this.f18555c = iArr;
        this.f18556d = objArr;
        this.f18557e = i;
        this.f18558f = i2;
        this.f18561i = z;
        boolean z3 = false;
        if (n8Var2 != null && n8Var2.mo20000c(gaVar)) {
            z3 = true;
        }
        this.f18560h = z3;
        this.f18562j = iArr2;
        this.f18563k = i3;
        this.f18564l = i4;
        this.f18568p = laVar;
        this.f18565m = t9Var;
        this.f18566n = jbVar;
        this.f18567o = n8Var2;
        this.f18559g = gaVar2;
        this.f18569q = baVar;
    }

    /* renamed from: A */
    private final boolean m25981A(Object obj, int i, int i2) {
        return C7014tb.m26617h(obj, (long) (m25998S(i2) & 1048575)) == i;
    }

    /* renamed from: B */
    private static boolean m25982B(Object obj, long j) {
        return ((Boolean) C7014tb.m26620k(obj, j)).booleanValue();
    }

    /* renamed from: C */
    private static final void m25983C(int i, Object obj, C6739cc ccVar) {
        if (obj instanceof String) {
            ccVar.mo19632g(i, (String) obj);
        } else {
            ccVar.mo19642q(i, (C7106z7) obj);
        }
    }

    /* renamed from: E */
    static C6870kb m25984E(Object obj) {
        C6702a9 a9Var = (C6702a9) obj;
        C6870kb kbVar = a9Var.zzc;
        if (kbVar != C6870kb.m26079c()) {
            return kbVar;
        }
        C6870kb e = C6870kb.m26081e();
        a9Var.zzc = e;
        return e;
    }

    /* renamed from: F */
    static C6853ja m25985F(Class cls, C6754da daVar, C6885la laVar, C7012t9 t9Var, C6854jb jbVar, C6915n8 n8Var, C6720ba baVar) {
        if (daVar instanceof C6965qa) {
            return m25986G((C6965qa) daVar, laVar, t9Var, jbVar, n8Var, baVar);
        }
        C6806gb gbVar = (C6806gb) daVar;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p174e.p319f.p320a.p335c.p345f.p352g.C6853ja m25986G(p174e.p319f.p320a.p335c.p345f.p352g.C6965qa r34, p174e.p319f.p320a.p335c.p345f.p352g.C6885la r35, p174e.p319f.p320a.p335c.p345f.p352g.C7012t9 r36, p174e.p319f.p320a.p335c.p345f.p352g.C6854jb r37, p174e.p319f.p320a.p335c.p345f.p352g.C6915n8 r38, p174e.p319f.p320a.p335c.p345f.p352g.C6720ba r39) {
        /*
            int r0 = r34.mo19680a()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo20105b()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f18553a
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f18554b
            java.lang.Object[] r17 = r34.mo20106c()
            e.f.a.c.f.g.ga r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m26006p(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m26006p(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m26006p(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m26006p(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            e.f.a.c.f.g.ja r0 = new e.f.a.c.f.g.ja
            r4 = r0
            e.f.a.c.f.g.ga r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.m25986G(e.f.a.c.f.g.qa, e.f.a.c.f.g.la, e.f.a.c.f.g.t9, e.f.a.c.f.g.jb, e.f.a.c.f.g.n8, e.f.a.c.f.g.ba):e.f.a.c.f.g.ja");
    }

    /* renamed from: H */
    private static double m25987H(Object obj, long j) {
        return ((Double) C7014tb.m26620k(obj, j)).doubleValue();
    }

    /* renamed from: I */
    private static float m25988I(Object obj, long j) {
        return ((Float) C7014tb.m26620k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ca, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x037f, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x038e, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3);
        r3 = ((p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r3).mo20156h();
        r4 = r4 + (p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03ee, code lost:
        r3 = r2.getInt(r1, r3);
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3);
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25812z(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03fc, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03fd, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x040a, code lost:
        r6 = r6 + (p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3) + p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r2.getLong(r1, r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0420, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x042f, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0439, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3);
        r3 = ((p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r3).mo20156h();
        r4 = r4 + (p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012a, code lost:
        r3 = m25991L(r1, r3);
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3);
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25812z(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013e, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0147, code lost:
        r6 = r6 + (p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3) + p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(m26002l(r1, r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015d, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015f, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        if (m25981A(r1, r11, r5) != false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016f, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r11 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a0, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ae, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bc, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ca, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d8, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e6, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f4, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0201, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020e, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021b, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0228, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0235, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0242, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024f, code lost:
        if (r3 > 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0251, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25805D(r11) + p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025a, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025b, code lost:
        r6 = r6 + r4;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25989J(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f18554b
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000f:
            int[] r9 = r0.f18555c
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0440
            int r9 = r0.m26001k(r5)
            int[] r10 = r0.f18555c
            r11 = r10[r5]
            int r12 = m26000j(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0039
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x042a;
                case 1: goto L_0x041b;
                case 2: goto L_0x0405;
                case 3: goto L_0x03ff;
                case 4: goto L_0x03e9;
                case 5: goto L_0x03e3;
                case 6: goto L_0x03dd;
                case 7: goto L_0x03cf;
                case 8: goto L_0x03b4;
                case 9: goto L_0x03a1;
                case 10: goto L_0x0385;
                case 11: goto L_0x0370;
                case 12: goto L_0x0369;
                case 13: goto L_0x0362;
                case 14: goto L_0x035b;
                case 15: goto L_0x0346;
                case 16: goto L_0x032c;
                case 17: goto L_0x0318;
                case 18: goto L_0x030a;
                case 19: goto L_0x02fe;
                case 20: goto L_0x02f2;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02da;
                case 23: goto L_0x030a;
                case 24: goto L_0x02fe;
                case 25: goto L_0x02ce;
                case 26: goto L_0x02c0;
                case 27: goto L_0x02b1;
                case 28: goto L_0x02a6;
                case 29: goto L_0x029a;
                case 30: goto L_0x028e;
                case 31: goto L_0x0282;
                case 32: goto L_0x0276;
                case 33: goto L_0x026a;
                case 34: goto L_0x025e;
                case 35: goto L_0x0245;
                case 36: goto L_0x0238;
                case 37: goto L_0x022b;
                case 38: goto L_0x021e;
                case 39: goto L_0x0211;
                case 40: goto L_0x0204;
                case 41: goto L_0x01f7;
                case 42: goto L_0x01ea;
                case 43: goto L_0x01dc;
                case 44: goto L_0x01ce;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b2;
                case 47: goto L_0x01a4;
                case 48: goto L_0x0196;
                case 49: goto L_0x0186;
                case 50: goto L_0x0179;
                case 51: goto L_0x0169;
                case 52: goto L_0x0159;
                case 53: goto L_0x0141;
                case 54: goto L_0x013a;
                case 55: goto L_0x0124;
                case 56: goto L_0x011d;
                case 57: goto L_0x0116;
                case 58: goto L_0x0107;
                case 59: goto L_0x00ea;
                case 60: goto L_0x00d6;
                case 61: goto L_0x00b8;
                case 62: goto L_0x00a2;
                case 63: goto L_0x009a;
                case 64: goto L_0x0092;
                case 65: goto L_0x008a;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x02cb
        L_0x0042:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
            e.f.a.c.f.g.ga r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6805ga) r3
            e.f.a.c.f.g.ra r4 = r0.m26004n(r5)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25811y(r11, r3, r4)
            goto L_0x02ca
        L_0x0058:
            boolean r10 = r0.m25981A(r1, r11, r5)
            if (r10 == 0) goto L_0x02cb
            long r3 = m26002l(r1, r3)
            int r10 = r11 << 3
            int r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x02cb
        L_0x0074:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            int r3 = m25991L(r1, r3)
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            goto L_0x00b2
        L_0x008a:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x016f
        L_0x0092:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x015f
        L_0x009a:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            goto L_0x012a
        L_0x00a2:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            int r3 = m25991L(r1, r3)
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
        L_0x00b2:
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            goto L_0x025a
        L_0x00b8:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
        L_0x00c2:
            e.f.a.c.f.g.z7 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r3
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r3 = r3.mo20156h()
            int r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x025b
        L_0x00d6:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
            e.f.a.c.f.g.ra r4 = r0.m26004n(r5)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26567Q(r11, r3, r4)
            goto L_0x02ca
        L_0x00ea:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7106z7
            if (r4 == 0) goto L_0x00f9
            goto L_0x00c2
        L_0x00f9:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25804C(r3)
            goto L_0x025a
        L_0x0107:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            int r3 = r11 << 3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r3 = r3 + r14
            goto L_0x02ca
        L_0x0116:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x015f
        L_0x011d:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x016f
        L_0x0124:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
        L_0x012a:
            int r3 = m25991L(r1, r3)
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25812z(r3)
            goto L_0x025a
        L_0x013a:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            goto L_0x0147
        L_0x0141:
            boolean r9 = r0.m25981A(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
        L_0x0147:
            long r3 = m26002l(r1, r3)
            int r9 = r11 << 3
            int r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r9)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x02cb
        L_0x0159:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
        L_0x015f:
            int r3 = r11 << 3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r3 = r3 + 4
            goto L_0x02ca
        L_0x0169:
            boolean r3 = r0.m25981A(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
        L_0x016f:
            int r3 = r11 << 3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r3 = r3 + 8
            goto L_0x02ca
        L_0x0179:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m26005o(r5)
            p174e.p319f.p320a.p335c.p345f.p352g.C6720ba.m25466a(r11, r3, r4)
            goto L_0x02cb
        L_0x0186:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            e.f.a.c.f.g.ra r4 = r0.m26004n(r5)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26562L(r11, r3, r4)
            goto L_0x02ca
        L_0x0196:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26572V(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26570T(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01b2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26561K(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26559I(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26557G(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01dc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26575Y(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01ea:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26554D(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x01f7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26559I(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x0204:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26561K(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x0211:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26564N(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x021e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26578a0(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x022b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26566P(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x0238:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26559I(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x0251
        L_0x0245:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26561K(r3)
            if (r3 <= 0) goto L_0x02cb
        L_0x0251:
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25805D(r11)
            int r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r4 = r4 + r9
        L_0x025a:
            int r4 = r4 + r3
        L_0x025b:
            int r6 = r6 + r4
            goto L_0x02cb
        L_0x025e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26571U(r11, r3, r9)
            goto L_0x02ca
        L_0x026a:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26569S(r11, r3, r9)
            goto L_0x02ca
        L_0x0276:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26560J(r11, r3, r9)
            goto L_0x02ca
        L_0x0282:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26558H(r11, r3, r9)
            goto L_0x02ca
        L_0x028e:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26556F(r11, r3, r9)
            goto L_0x02ca
        L_0x029a:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26574X(r11, r3, r9)
            goto L_0x02ca
        L_0x02a6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26555E(r11, r3)
            goto L_0x02ca
        L_0x02b1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            e.f.a.c.f.g.ra r4 = r0.m26004n(r5)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26568R(r11, r3, r4)
            goto L_0x02ca
        L_0x02c0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26573W(r11, r3)
        L_0x02ca:
            int r6 = r6 + r3
        L_0x02cb:
            r12 = 0
            goto L_0x0439
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26551A(r11, r3, r12)
            goto L_0x0315
        L_0x02da:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26563M(r11, r3, r12)
            goto L_0x0315
        L_0x02e6:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26576Z(r11, r3, r12)
            goto L_0x0315
        L_0x02f2:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26565O(r11, r3, r12)
            goto L_0x0315
        L_0x02fe:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26558H(r11, r3, r12)
            goto L_0x0315
        L_0x030a:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26560J(r11, r3, r12)
        L_0x0315:
            int r6 = r6 + r3
            goto L_0x0439
        L_0x0318:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            java.lang.Object r3 = r2.getObject(r1, r3)
            e.f.a.c.f.g.ga r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6805ga) r3
            e.f.a.c.f.g.ra r4 = r0.m26004n(r5)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25811y(r11, r3, r4)
            goto L_0x0315
        L_0x032c:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x0439
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x0439
        L_0x0346:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            goto L_0x037f
        L_0x035b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
            goto L_0x042f
        L_0x0362:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
            goto L_0x0420
        L_0x0369:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            goto L_0x03ee
        L_0x0370:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
        L_0x037f:
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            goto L_0x03fc
        L_0x0385:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            java.lang.Object r3 = r2.getObject(r1, r3)
        L_0x038e:
            e.f.a.c.f.g.z7 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r3
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r3 = r3.mo20156h()
            int r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x03fd
        L_0x03a1:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            java.lang.Object r3 = r2.getObject(r1, r3)
            e.f.a.c.f.g.ra r4 = r0.m26004n(r5)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26567Q(r11, r3, r4)
            goto L_0x0315
        L_0x03b4:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7106z7
            if (r4 == 0) goto L_0x03c2
            goto L_0x038e
        L_0x03c2:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25804C(r3)
            goto L_0x03fc
        L_0x03cf:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
            int r3 = r11 << 3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r3 = r3 + r14
            goto L_0x0315
        L_0x03dd:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
            goto L_0x0420
        L_0x03e3:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
            goto L_0x042f
        L_0x03e9:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
        L_0x03ee:
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25812z(r3)
        L_0x03fc:
            int r4 = r4 + r3
        L_0x03fd:
            int r6 = r6 + r4
            goto L_0x0439
        L_0x03ff:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
            goto L_0x040a
        L_0x0405:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x0439
        L_0x040a:
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r9)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0439
        L_0x041b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
        L_0x0420:
            int r3 = r11 << 3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r3 = r3 + 4
            goto L_0x0315
        L_0x042a:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x0439
        L_0x042f:
            int r3 = r11 << 3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r3)
            int r3 = r3 + 8
            goto L_0x0315
        L_0x0439:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0440:
            e.f.a.c.f.g.jb r2 = r0.f18566n
            java.lang.Object r3 = r2.mo19903c(r1)
            int r2 = r2.mo19901a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f18560h
            if (r2 != 0) goto L_0x0450
            return r6
        L_0x0450:
            e.f.a.c.f.g.n8 r2 = r0.f18567o
            r2.mo19998a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.m25989J(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0263, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25811y(r6, (p174e.p319f.p320a.p335c.p345f.p352g.C6805ga) p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7), m26004n(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027c, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3);
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b((r7 >> 63) ^ (r7 + r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0297, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c5, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cb, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3);
        r4 = ((p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r4).mo20156h();
        r5 = r5 + (p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f4, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26567Q(r6, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7), m26004n(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x030e, code lost:
        if ((r4 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0311, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3);
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25804C((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0324, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0346, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3);
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25812z(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0350, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0360, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0364, code lost:
        r3 = r3 + (p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3) + p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0377, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0387, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if ((r4 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r4 = m25991L(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r4 = m26002l(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25805D(r6) + p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
        r3 = r3 + r4;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25990K(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f18554b
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f18555c
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0395
            int r4 = r11.m26001k(r2)
            int r5 = m26000j(r4)
            int[] r6 = r11.f18555c
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            e.f.a.c.f.g.s8 r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6995s8.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            e.f.a.c.f.g.s8 r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6995s8.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f18555c
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0381;
                case 1: goto L_0x0371;
                case 2: goto L_0x035a;
                case 3: goto L_0x0353;
                case 4: goto L_0x033c;
                case 5: goto L_0x0335;
                case 6: goto L_0x032e;
                case 7: goto L_0x031e;
                case 8: goto L_0x0302;
                case 9: goto L_0x02ee;
                case 10: goto L_0x02d1;
                case 11: goto L_0x02bb;
                case 12: goto L_0x02b3;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a3;
                case 15: goto L_0x028d;
                case 16: goto L_0x0272;
                case 17: goto L_0x025d;
                case 18: goto L_0x0250;
                case 19: goto L_0x0245;
                case 20: goto L_0x023a;
                case 21: goto L_0x022f;
                case 22: goto L_0x0224;
                case 23: goto L_0x0250;
                case 24: goto L_0x0245;
                case 25: goto L_0x0219;
                case 26: goto L_0x020e;
                case 27: goto L_0x01ff;
                case 28: goto L_0x01f4;
                case 29: goto L_0x01e9;
                case 30: goto L_0x01dd;
                case 31: goto L_0x0245;
                case 32: goto L_0x0250;
                case 33: goto L_0x01d1;
                case 34: goto L_0x01c5;
                case 35: goto L_0x01ae;
                case 36: goto L_0x01a1;
                case 37: goto L_0x0194;
                case 38: goto L_0x0187;
                case 39: goto L_0x017a;
                case 40: goto L_0x016d;
                case 41: goto L_0x0160;
                case 42: goto L_0x0153;
                case 43: goto L_0x0145;
                case 44: goto L_0x0137;
                case 45: goto L_0x0129;
                case 46: goto L_0x011b;
                case 47: goto L_0x010d;
                case 48: goto L_0x00ff;
                case 49: goto L_0x00ef;
                case 50: goto L_0x00e2;
                case 51: goto L_0x00da;
                case 52: goto L_0x00d2;
                case 53: goto L_0x00c6;
                case 54: goto L_0x00bf;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ab;
                case 57: goto L_0x00a3;
                case 58: goto L_0x009b;
                case 59: goto L_0x008b;
                case 60: goto L_0x0083;
                case 61: goto L_0x007b;
                case 62: goto L_0x006f;
                case 63: goto L_0x0068;
                case 64: goto L_0x0060;
                case 65: goto L_0x0058;
                case 66: goto L_0x004c;
                case 67: goto L_0x0040;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0391
        L_0x0038:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0263
        L_0x0040:
            boolean r5 = r11.m25981A(r12, r6, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = m26002l(r12, r7)
            goto L_0x027c
        L_0x004c:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = m25991L(r12, r7)
            goto L_0x0297
        L_0x0058:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x0060:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0068:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00b9
        L_0x006f:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = m25991L(r12, r7)
            goto L_0x02c5
        L_0x007b:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02d7
        L_0x0083:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02f4
        L_0x008b:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            boolean r5 = r4 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7106z7
            if (r5 == 0) goto L_0x0311
            goto L_0x0310
        L_0x009b:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0324
        L_0x00a3:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00ab:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00b3:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00b9:
            int r4 = m25991L(r12, r7)
            goto L_0x0346
        L_0x00bf:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00cc
        L_0x00c6:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00cc:
            long r4 = m26002l(r12, r7)
            goto L_0x0364
        L_0x00d2:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00da:
            boolean r4 = r11.m25981A(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00e2:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.lang.Object r5 = r11.m26005o(r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C6720ba.m25466a(r6, r4, r5)
            goto L_0x0391
        L_0x00ef:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            e.f.a.c.f.g.ra r5 = r11.m26004n(r2)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26562L(r6, r4, r5)
            goto L_0x025a
        L_0x00ff:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26572V(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x010d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26570T(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x011b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26561K(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0129:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26559I(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0137:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26557G(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0145:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26575Y(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0153:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26554D(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0160:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26559I(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x016d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26561K(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x017a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26564N(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0187:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26578a0(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0194:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26566P(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01a1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26559I(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01ae:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26561K(r4)
            if (r4 <= 0) goto L_0x0391
        L_0x01ba:
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25805D(r6)
            int r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r5 = r5 + r6
            goto L_0x0350
        L_0x01c5:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26571U(r6, r4, r1)
            goto L_0x025a
        L_0x01d1:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26569S(r6, r4, r1)
            goto L_0x025a
        L_0x01dd:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26556F(r6, r4, r1)
            goto L_0x025a
        L_0x01e9:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26574X(r6, r4, r1)
            goto L_0x025a
        L_0x01f4:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26555E(r6, r4)
            goto L_0x025a
        L_0x01ff:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            e.f.a.c.f.g.ra r5 = r11.m26004n(r2)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26568R(r6, r4, r5)
            goto L_0x025a
        L_0x020e:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26573W(r6, r4)
            goto L_0x025a
        L_0x0219:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26551A(r6, r4, r1)
            goto L_0x025a
        L_0x0224:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26563M(r6, r4, r1)
            goto L_0x025a
        L_0x022f:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26576Z(r6, r4, r1)
            goto L_0x025a
        L_0x023a:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26565O(r6, r4, r1)
            goto L_0x025a
        L_0x0245:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26558H(r6, r4, r1)
            goto L_0x025a
        L_0x0250:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26560J(r6, r4, r1)
        L_0x025a:
            int r3 = r3 + r4
            goto L_0x0391
        L_0x025d:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0263:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            e.f.a.c.f.g.ga r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6805ga) r4
            e.f.a.c.f.g.ra r5 = r11.m26004n(r2)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25811y(r6, r4, r5)
            goto L_0x025a
        L_0x0272:
            boolean r5 = r11.m26014x(r12, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r12, r7)
        L_0x027c:
            int r5 = r6 << 3
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r6)
            goto L_0x0350
        L_0x028d:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r12, r7)
        L_0x0297:
            int r5 = r6 << 3
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02cb
        L_0x02a3:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x02ab:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x02b3:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0342
        L_0x02bb:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r12, r7)
        L_0x02c5:
            int r5 = r6 << 3
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r5)
        L_0x02cb:
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            goto L_0x0350
        L_0x02d1:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02d7:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
        L_0x02db:
            e.f.a.c.f.g.z7 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r4
            int r5 = r6 << 3
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r5)
            int r4 = r4.mo20156h()
            int r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x0351
        L_0x02ee:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02f4:
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            e.f.a.c.f.g.ra r5 = r11.m26004n(r2)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26567Q(r6, r4, r5)
            goto L_0x025a
        L_0x0302:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r7)
            boolean r5 = r4 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C7106z7
            if (r5 == 0) goto L_0x0311
        L_0x0310:
            goto L_0x02db
        L_0x0311:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25804C(r4)
            goto L_0x0350
        L_0x031e:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0324:
            int r4 = r6 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r4 = r4 + 1
            goto L_0x025a
        L_0x032e:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0335:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x033c:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0342:
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r12, r7)
        L_0x0346:
            int r5 = r6 << 3
            int r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25812z(r4)
        L_0x0350:
            int r5 = r5 + r4
        L_0x0351:
            int r3 = r3 + r5
            goto L_0x0391
        L_0x0353:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0360
        L_0x035a:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0360:
            long r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r12, r7)
        L_0x0364:
            int r6 = r6 << 3
            int r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r6)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25807b(r4)
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0391
        L_0x0371:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0377:
            int r4 = r6 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r4 = r4 + 4
            goto L_0x025a
        L_0x0381:
            boolean r4 = r11.m26014x(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0387:
            int r4 = r6 << 3
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6819h8.m25806a(r4)
            int r4 = r4 + 8
            goto L_0x025a
        L_0x0391:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0395:
            e.f.a.c.f.g.jb r0 = r11.f18566n
            java.lang.Object r12 = r0.mo19903c(r12)
            int r12 = r0.mo19901a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.m25990K(java.lang.Object):int");
    }

    /* renamed from: L */
    private static int m25991L(Object obj, long j) {
        return ((Integer) C7014tb.m26620k(obj, j)).intValue();
    }

    /* renamed from: M */
    private final int m25992M(Object obj, byte[] bArr, int i, int i2, int i3, long j, C6882l7 l7Var) {
        Unsafe unsafe = f18554b;
        Object o = m26005o(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C6703aa) object).mo19533g()) {
            C6703aa d = C6703aa.m25430c().mo19528d();
            C6720ba.m25467b(d, object);
            unsafe.putObject(obj, j, d);
        }
        C7108z9 z9Var = (C7108z9) o;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return r2;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25993N(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p174e.p319f.p320a.p335c.p345f.p352g.C6882l7 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f18554b
            int[] r7 = r0.f18555c
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0183;
                case 52: goto L_0x016b;
                case 53: goto L_0x0160;
                case 54: goto L_0x0160;
                case 55: goto L_0x0155;
                case 56: goto L_0x0140;
                case 57: goto L_0x012b;
                case 58: goto L_0x0114;
                case 59: goto L_0x00e0;
                case 60: goto L_0x00be;
                case 61: goto L_0x00b3;
                case 62: goto L_0x0155;
                case 63: goto L_0x0084;
                case 64: goto L_0x012b;
                case 65: goto L_0x0140;
                case 66: goto L_0x0071;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x019c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x019c
            e.f.a.c.f.g.ra r5 = r0.m26004n(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26128c(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f18614c
            if (r15 != 0) goto L_0x0052
            goto L_0x00ec
        L_0x0052:
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25838g(r15, r3)
            goto L_0x00ec
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            goto L_0x019c
        L_0x005c:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r4, r11)
            long r3 = r11.f18613b
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25596b(r3)
        L_0x0066:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x006a:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0071:
            if (r5 == 0) goto L_0x0075
            goto L_0x019c
        L_0x0075:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r11)
            int r3 = r11.f18612a
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25595a(r3)
        L_0x007f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x006a
        L_0x0084:
            if (r5 != 0) goto L_0x019c
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r11)
            int r4 = r11.f18612a
            e.f.a.c.f.g.d9 r5 = r0.m26003m(r6)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r5.mo19609e(r4)
            if (r5 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            e.f.a.c.f.g.kb r1 = m25984E(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo19931h(r2, r4)
            goto L_0x00b0
        L_0x00a6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00b0:
            r2 = r3
            goto L_0x019d
        L_0x00b3:
            if (r5 == r15) goto L_0x00b7
            goto L_0x019c
        L_0x00b7:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26126a(r3, r4, r11)
            java.lang.Object r3 = r11.f18614c
            goto L_0x006a
        L_0x00be:
            if (r5 != r15) goto L_0x019c
            e.f.a.c.f.g.ra r2 = r0.m26004n(r6)
            r5 = r20
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26129d(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d5
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            java.lang.Object r3 = r11.f18614c
            if (r15 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25838g(r15, r3)
            goto L_0x00ec
        L_0x00e0:
            if (r5 != r15) goto L_0x019c
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r11)
            int r4 = r11.f18612a
            if (r4 != 0) goto L_0x00f0
            java.lang.String r3 = ""
        L_0x00ec:
            r12.putObject(r1, r9, r3)
            goto L_0x010f
        L_0x00f0:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0104
            int r5 = r2 + r4
            boolean r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7110zb.m27094f(r3, r2, r5)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25977c()
            throw r1
        L_0x0104:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.f18520b
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x010f:
            r12.putInt(r1, r13, r8)
            goto L_0x019d
        L_0x0114:
            if (r5 != 0) goto L_0x019c
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r4, r11)
            long r3 = r11.f18613b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0124
            r15 = 1
            goto L_0x0125
        L_0x0124:
            r15 = 0
        L_0x0125:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x006a
        L_0x012b:
            if (r5 == r7) goto L_0x012f
            goto L_0x019c
        L_0x012f:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0140:
            r2 = 1
            if (r5 == r2) goto L_0x0144
            goto L_0x019c
        L_0x0144:
            long r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0155:
            if (r5 == 0) goto L_0x0158
            goto L_0x019c
        L_0x0158:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r11)
            int r3 = r11.f18612a
            goto L_0x007f
        L_0x0160:
            if (r5 == 0) goto L_0x0163
            goto L_0x019c
        L_0x0163:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r4, r11)
            long r3 = r11.f18613b
            goto L_0x0066
        L_0x016b:
            if (r5 == r7) goto L_0x016e
            goto L_0x019c
        L_0x016e:
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0183:
            r2 = 1
            if (r5 == r2) goto L_0x0187
            goto L_0x019c
        L_0x0187:
            long r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x019c:
            r2 = r4
        L_0x019d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.m25993N(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, e.f.a.c.f.g.l7):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02cf, code lost:
        if (r0 != r15) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0316, code lost:
        if (r0 != r15) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0337, code lost:
        if (r0 != r15) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010e, code lost:
        r1 = r11.f18614c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        r7.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c1, code lost:
        r1 = r11.f18612a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021f, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0223, code lost:
        r7 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0229, code lost:
        r2 = r5;
        r28 = r7;
        r23 = r10;
        r7 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25994O(java.lang.Object r31, byte[] r32, int r33, int r34, p174e.p319f.p320a.p335c.p345f.p352g.C6882l7 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f18554b
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0360
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26136k(r0, r12, r3, r11)
            int r3 = r11.f18612a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m25997R(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m25996Q(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = -1
            r23 = 0
            goto L_0x033a
        L_0x004e:
            int[] r0 = r15.f18555c
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = m26000j(r1)
            r33 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0234
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x008b
            if (r7 == r5) goto L_0x007f
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            if (r0 == r5) goto L_0x0088
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x0088:
            r2 = r7
            r7 = r0
            goto L_0x008d
        L_0x008b:
            r2 = r19
        L_0x008d:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01e9;
                case 2: goto L_0x01c8;
                case 3: goto L_0x01c8;
                case 4: goto L_0x01b0;
                case 5: goto L_0x018e;
                case 6: goto L_0x0177;
                case 7: goto L_0x0157;
                case 8: goto L_0x013a;
                case 9: goto L_0x0115;
                case 10: goto L_0x00fd;
                case 11: goto L_0x01b0;
                case 12: goto L_0x00eb;
                case 13: goto L_0x0177;
                case 14: goto L_0x018e;
                case 15: goto L_0x00d3;
                case 16: goto L_0x009e;
                default: goto L_0x0091;
            }
        L_0x0091:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            goto L_0x0229
        L_0x009e:
            if (r3 != 0) goto L_0x00c5
            int r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r12, r4, r11)
            long r0 = r11.f18613b
            long r21 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25596b(r0)
            r0 = r2
            r1 = r31
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r33
            r8 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x0223
        L_0x00c5:
            r19 = r7
            r8 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0229
        L_0x00d3:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r12, r4, r11)
            int r1 = r11.f18612a
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25595a(r1)
            goto L_0x01c3
        L_0x00eb:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r12, r4, r11)
            goto L_0x01c1
        L_0x00fd:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26126a(r12, r4, r11)
        L_0x010e:
            java.lang.Object r1 = r11.f18614c
        L_0x0110:
            r7.putObject(r14, r8, r1)
            goto L_0x021f
        L_0x0115:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            e.f.a.c.f.g.ra r0 = r15.m26004n(r10)
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26129d(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0133
            java.lang.Object r1 = r11.f18614c
            goto L_0x0110
        L_0x0133:
            java.lang.Object r2 = r11.f18614c
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25838g(r1, r2)
            goto L_0x0110
        L_0x013a:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0152
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26132g(r12, r4, r11)
            goto L_0x010e
        L_0x0152:
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26133h(r12, r4, r11)
            goto L_0x010e
        L_0x0157:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r12, r4, r11)
            long r1 = r11.f18613b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0171
            r1 = 1
            goto L_0x0172
        L_0x0171:
            r1 = 0
        L_0x0172:
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26627r(r14, r8, r1)
            goto L_0x021f
        L_0x0177:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x021f
        L_0x018e:
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            long r21 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x021f
        L_0x01ad:
            r5 = r4
            goto L_0x0229
        L_0x01b0:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0229
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r12, r5, r11)
        L_0x01c1:
            int r1 = r11.f18612a
        L_0x01c3:
            r7.putInt(r14, r8, r1)
            goto L_0x021f
        L_0x01c8:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0229
            int r17 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r12, r5, r11)
            long r4 = r11.f18613b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x0223
        L_0x01e9:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0229
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26630u(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x021f
        L_0x0204:
            r5 = r4
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0229
            long r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26629t(r14, r8, r0)
            int r0 = r5 + 8
        L_0x021f:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
        L_0x0223:
            r7 = r19
            r1 = r20
            goto L_0x035a
        L_0x0229:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x033a
        L_0x0234:
            r20 = r33
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x0292
            r0 = 2
            if (r3 != r0) goto L_0x0285
            java.lang.Object r0 = r7.getObject(r14, r8)
            e.f.a.c.f.g.g9 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6804g9) r0
            boolean r1 = r0.mo19801a()
            if (r1 != 0) goto L_0x0265
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025d
            r1 = 10
            goto L_0x025e
        L_0x025d:
            int r1 = r1 + r1
        L_0x025e:
            e.f.a.c.f.g.g9 r0 = r0.mo19570f(r1)
            r7.putObject(r14, r8, r0)
        L_0x0265:
            r8 = r0
            e.f.a.c.f.g.ra r0 = r15.m26004n(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26130e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
            goto L_0x035a
        L_0x0285:
            r23 = r4
            r15 = r5
            r26 = r6
            r28 = r7
            r27 = r19
            r19 = -1
            goto L_0x0319
        L_0x0292:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02e7
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r33
            r24 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r35
            int r0 = r0.m25995P(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02e5
        L_0x02d1:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0358
        L_0x02e5:
            r2 = r0
            goto L_0x031a
        L_0x02e7:
            r33 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            r7 = r33
            if (r9 != r0) goto L_0x031f
            r0 = 2
            if (r7 != r0) goto L_0x0319
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r23
            r6 = r24
            r8 = r35
            int r0 = r0.m25992M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02e5
            goto L_0x02d1
        L_0x0319:
            r2 = r15
        L_0x031a:
            r6 = r26
            r7 = r27
            goto L_0x033a
        L_0x031f:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r35
            int r0 = r0.m25993N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02e5
            goto L_0x02d1
        L_0x033a:
            e.f.a.c.f.g.kb r4 = m25984E(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26134i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
        L_0x0358:
            r9 = r28
        L_0x035a:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x0360:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0373
            long r1 = (long) r7
            r3 = r31
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0373:
            r1 = r34
            if (r0 != r1) goto L_0x0378
            return r0
        L_0x0378:
            e.f.a.c.f.g.j9 r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25979e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.m25994O(java.lang.Object, byte[], int, int, e.f.a.c.f.g.l7):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0254, code lost:
        if (r7.f18613b != 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0256, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0258, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0259, code lost:
        r12.mo19992g(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025c, code lost:
        if (r4 >= r5) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025e, code lost:
        r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0264, code lost:
        if (r2 == r7.f18612a) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0267, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026f, code lost:
        if (r7.f18613b == 0) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0272, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        if (r4 == 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r12.add(p174e.p319f.p320a.p335c.p345f.p352g.C7106z7.f19078f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r12.add(p174e.p319f.p320a.p335c.p345f.p352g.C7106z7.m27074A(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2 == r7.f18612a) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7);
        r4 = r7.f18612a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r4 < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r4 > (r3.length - r1)) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        if (r4 != 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        throw p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        throw p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25995P(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p174e.p319f.p320a.p335c.p345f.p352g.C6882l7 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f18554b
            java.lang.Object r12 = r11.getObject(r1, r9)
            e.f.a.c.f.g.g9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6804g9) r12
            boolean r13 = r12.mo19801a()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            e.f.a.c.f.g.g9 r12 = r12.mo19570f(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x0388;
                case 19: goto L_0x0342;
                case 20: goto L_0x030a;
                case 21: goto L_0x030a;
                case 22: goto L_0x02ef;
                case 23: goto L_0x02b1;
                case 24: goto L_0x0273;
                case 25: goto L_0x021f;
                case 26: goto L_0x017c;
                case 27: goto L_0x0161;
                case 28: goto L_0x0114;
                case 29: goto L_0x02ef;
                case 30: goto L_0x00dc;
                case 31: goto L_0x0273;
                case 32: goto L_0x02b1;
                case 33: goto L_0x009c;
                case 34: goto L_0x005c;
                case 35: goto L_0x0388;
                case 36: goto L_0x0342;
                case 37: goto L_0x030a;
                case 38: goto L_0x030a;
                case 39: goto L_0x02ef;
                case 40: goto L_0x02b1;
                case 41: goto L_0x0273;
                case 42: goto L_0x021f;
                case 43: goto L_0x02ef;
                case 44: goto L_0x00dc;
                case 45: goto L_0x0273;
                case 46: goto L_0x02b1;
                case 47: goto L_0x009c;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x03eb
            e.f.a.c.f.g.ra r1 = r15.m26004n(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26128c(r21, r22, r23, r24, r25, r26)
        L_0x0055:
            java.lang.Object r8 = r7.f18614c
            r12.add(r8)
            goto L_0x03cd
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            e.f.a.c.f.g.v9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7044v9) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r1, r7)
            long r4 = r7.f18613b
            long r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25596b(r4)
            r12.mo20388h(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x03ec
        L_0x007b:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x03eb
            e.f.a.c.f.g.v9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7044v9) r12
        L_0x0084:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r4, r7)
            long r8 = r7.f18613b
            long r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25596b(r8)
            r12.mo20388h(r8)
            if (r1 >= r5) goto L_0x009b
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x0084
        L_0x009b:
            return r1
        L_0x009c:
            if (r6 != r14) goto L_0x00c0
            e.f.a.c.f.g.b9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6719b9) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x00a7:
            if (r1 >= r2) goto L_0x00b7
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r4 = r7.f18612a
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25595a(r4)
            r12.mo19575j(r4)
            goto L_0x00a7
        L_0x00b7:
            if (r1 != r2) goto L_0x00bb
            goto L_0x03ec
        L_0x00bb:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x00c0:
            if (r6 != 0) goto L_0x03eb
            e.f.a.c.f.g.b9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6719b9) r12
        L_0x00c4:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r4 = r7.f18612a
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25595a(r4)
            r12.mo19575j(r4)
            if (r1 >= r5) goto L_0x00db
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x00c4
        L_0x00db:
            return r1
        L_0x00dc:
            if (r6 != r14) goto L_0x00e3
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26131f(r3, r4, r12, r7)
            goto L_0x00f4
        L_0x00e3:
            if (r6 != 0) goto L_0x03eb
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26137l(r2, r3, r4, r5, r6, r7)
        L_0x00f4:
            e.f.a.c.f.g.a9 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6702a9) r1
            e.f.a.c.f.g.kb r3 = r1.zzc
            e.f.a.c.f.g.kb r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6870kb.m26079c()
            if (r3 != r4) goto L_0x00ff
            r3 = 0
        L_0x00ff:
            e.f.a.c.f.g.d9 r4 = r15.m26003m(r8)
            e.f.a.c.f.g.jb r5 = r0.f18566n
            r6 = r21
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26581c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0240
        L_0x010f:
            e.f.a.c.f.g.kb r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6870kb) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r14) goto L_0x03eb
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r4 = r7.f18612a
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x012a
        L_0x0124:
            e.f.a.c.f.g.z7 r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7106z7.f19078f
            r12.add(r4)
            goto L_0x0132
        L_0x012a:
            e.f.a.c.f.g.z7 r6 = p174e.p319f.p320a.p335c.p345f.p352g.C7106z7.m27074A(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0132:
            if (r1 >= r5) goto L_0x0156
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x013d
            goto L_0x0156
        L_0x013d:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r4 = r7.f18612a
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x012a
            goto L_0x0124
        L_0x014c:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x0151:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x015c:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d()
            throw r1
        L_0x0161:
            if (r6 == r14) goto L_0x0165
            goto L_0x03eb
        L_0x0165:
            e.f.a.c.f.g.ra r1 = r15.m26004n(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26130e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x017c:
            if (r6 != r14) goto L_0x03eb
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            if (r6 != 0) goto L_0x01c9
            int r6 = r7.f18612a
            if (r6 < 0) goto L_0x01c4
            if (r6 != 0) goto L_0x0197
        L_0x0193:
            r12.add(r1)
            goto L_0x01a2
        L_0x0197:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.f18520b
            r8.<init>(r3, r4, r6, r9)
        L_0x019e:
            r12.add(r8)
            int r4 = r4 + r6
        L_0x01a2:
            if (r4 >= r5) goto L_0x03eb
            int r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r8 = r7.f18612a
            if (r2 != r8) goto L_0x03eb
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r6, r7)
            int r6 = r7.f18612a
            if (r6 < 0) goto L_0x01bf
            if (r6 != 0) goto L_0x01b7
            goto L_0x0193
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.f18520b
            r8.<init>(r3, r4, r6, r9)
            goto L_0x019e
        L_0x01bf:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d()
            throw r1
        L_0x01c4:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d()
            throw r1
        L_0x01c9:
            int r6 = r7.f18612a
            if (r6 < 0) goto L_0x021a
            if (r6 != 0) goto L_0x01d3
        L_0x01cf:
            r12.add(r1)
            goto L_0x01e6
        L_0x01d3:
            int r8 = r4 + r6
            boolean r9 = p174e.p319f.p320a.p335c.p345f.p352g.C7110zb.m27094f(r3, r4, r8)
            if (r9 == 0) goto L_0x0215
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.f18520b
            r9.<init>(r3, r4, r6, r10)
        L_0x01e2:
            r12.add(r9)
            r4 = r8
        L_0x01e6:
            if (r4 >= r5) goto L_0x03eb
            int r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r8 = r7.f18612a
            if (r2 != r8) goto L_0x03eb
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r6, r7)
            int r6 = r7.f18612a
            if (r6 < 0) goto L_0x0210
            if (r6 != 0) goto L_0x01fb
            goto L_0x01cf
        L_0x01fb:
            int r8 = r4 + r6
            boolean r9 = p174e.p319f.p320a.p335c.p345f.p352g.C7110zb.m27094f(r3, r4, r8)
            if (r9 == 0) goto L_0x020b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.f18520b
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01e2
        L_0x020b:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25977c()
            throw r1
        L_0x0210:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d()
            throw r1
        L_0x0215:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25977c()
            throw r1
        L_0x021a:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25978d()
            throw r1
        L_0x021f:
            r1 = 0
            if (r6 != r14) goto L_0x0248
            e.f.a.c.f.g.n7 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6914n7) r12
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r4 = r7.f18612a
            int r4 = r4 + r2
        L_0x022b:
            if (r2 >= r4) goto L_0x023e
            int r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r2, r7)
            long r5 = r7.f18613b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0239
            r5 = 1
            goto L_0x023a
        L_0x0239:
            r5 = 0
        L_0x023a:
            r12.mo19992g(r5)
            goto L_0x022b
        L_0x023e:
            if (r2 != r4) goto L_0x0243
        L_0x0240:
            r1 = r2
            goto L_0x03ec
        L_0x0243:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x0248:
            if (r6 != 0) goto L_0x03eb
            e.f.a.c.f.g.n7 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6914n7) r12
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r4, r7)
            long r8 = r7.f18613b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
        L_0x0256:
            r6 = 1
            goto L_0x0259
        L_0x0258:
            r6 = 0
        L_0x0259:
            r12.mo19992g(r6)
            if (r4 >= r5) goto L_0x0272
            int r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r8 = r7.f18612a
            if (r2 == r8) goto L_0x0267
            goto L_0x0272
        L_0x0267:
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r6, r7)
            long r8 = r7.f18613b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
            goto L_0x0256
        L_0x0272:
            return r4
        L_0x0273:
            if (r6 != r14) goto L_0x0293
            e.f.a.c.f.g.b9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6719b9) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x027e:
            if (r1 >= r2) goto L_0x028a
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r3, r1)
            r12.mo19575j(r4)
            int r1 = r1 + 4
            goto L_0x027e
        L_0x028a:
            if (r1 != r2) goto L_0x028e
            goto L_0x03ec
        L_0x028e:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x0293:
            if (r6 != r9) goto L_0x03eb
            e.f.a.c.f.g.b9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6719b9) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r17, r18)
        L_0x029b:
            r12.mo19575j(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02b0
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r3, r4)
            goto L_0x029b
        L_0x02b0:
            return r1
        L_0x02b1:
            if (r6 != r14) goto L_0x02d1
            e.f.a.c.f.g.v9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7044v9) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x02bc:
            if (r1 >= r2) goto L_0x02c8
            long r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r3, r1)
            r12.mo20388h(r4)
            int r1 = r1 + 8
            goto L_0x02bc
        L_0x02c8:
            if (r1 != r2) goto L_0x02cc
            goto L_0x03ec
        L_0x02cc:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x02d1:
            if (r6 != r13) goto L_0x03eb
            e.f.a.c.f.g.v9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7044v9) r12
            long r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r17, r18)
        L_0x02d9:
            r12.mo20388h(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02ee
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x02e9
            goto L_0x02ee
        L_0x02e9:
            long r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r3, r4)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x02f7
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26131f(r3, r4, r12, r7)
            goto L_0x03ec
        L_0x02f7:
            if (r6 == 0) goto L_0x02fb
            goto L_0x03eb
        L_0x02fb:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26137l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x030a:
            if (r6 != r14) goto L_0x032a
            e.f.a.c.f.g.v9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7044v9) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x0315:
            if (r1 >= r2) goto L_0x0321
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r1, r7)
            long r4 = r7.f18613b
            r12.mo20388h(r4)
            goto L_0x0315
        L_0x0321:
            if (r1 != r2) goto L_0x0325
            goto L_0x03ec
        L_0x0325:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x032a:
            if (r6 != 0) goto L_0x03eb
            e.f.a.c.f.g.v9 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7044v9) r12
        L_0x032e:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r3, r4, r7)
            long r8 = r7.f18613b
            r12.mo20388h(r8)
            if (r1 >= r5) goto L_0x0341
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x032e
        L_0x0341:
            return r1
        L_0x0342:
            if (r6 != r14) goto L_0x0366
            e.f.a.c.f.g.t8 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7011t8) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x034d:
            if (r1 >= r2) goto L_0x035d
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo20188g(r4)
            int r1 = r1 + 4
            goto L_0x034d
        L_0x035d:
            if (r1 != r2) goto L_0x0361
            goto L_0x03ec
        L_0x0361:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x0366:
            if (r6 != r9) goto L_0x03eb
            e.f.a.c.f.g.t8 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C7011t8) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r17, r18)
        L_0x036e:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo20188g(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0387
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r3, r4)
            goto L_0x036e
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ab
            e.f.a.c.f.g.j8 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6851j8) r12
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r2 = r7.f18612a
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            long r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo19885g(r4)
            int r1 = r1 + 8
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a6
            goto L_0x03ec
        L_0x03a6:
            e.f.a.c.f.g.j9 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r1
        L_0x03ab:
            if (r6 != r13) goto L_0x03eb
            e.f.a.c.f.g.j8 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6851j8) r12
            long r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r17, r18)
        L_0x03b3:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo19885g(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03cc
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r1, r7)
            int r6 = r7.f18612a
            if (r2 == r6) goto L_0x03c7
            goto L_0x03cc
        L_0x03c7:
            long r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r3, r4)
            goto L_0x03b3
        L_0x03cc:
            return r1
        L_0x03cd:
            if (r4 >= r5) goto L_0x03ea
            int r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r3, r4, r7)
            int r9 = r7.f18612a
            if (r2 == r9) goto L_0x03d8
            goto L_0x03ea
        L_0x03d8:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26128c(r21, r22, r23, r24, r25, r26)
            goto L_0x0055
        L_0x03ea:
            return r4
        L_0x03eb:
            r1 = r4
        L_0x03ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.m25995P(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, e.f.a.c.f.g.l7):int");
    }

    /* renamed from: Q */
    private final int m25996Q(int i) {
        if (i < this.f18557e || i > this.f18558f) {
            return -1;
        }
        return m25999T(i, 0);
    }

    /* renamed from: R */
    private final int m25997R(int i, int i2) {
        if (i < this.f18557e || i > this.f18558f) {
            return -1;
        }
        return m25999T(i, i2);
    }

    /* renamed from: S */
    private final int m25998S(int i) {
        return this.f18555c[i + 2];
    }

    /* renamed from: T */
    private final int m25999T(int i, int i2) {
        int length = (this.f18555c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f18555c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static int m26000j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m26001k(int i) {
        return this.f18555c[i + 1];
    }

    /* renamed from: l */
    private static long m26002l(Object obj, long j) {
        return ((Long) C7014tb.m26620k(obj, j)).longValue();
    }

    /* renamed from: m */
    private final C6753d9 m26003m(int i) {
        int i2 = i / 3;
        return (C6753d9) this.f18556d[i2 + i2 + 1];
    }

    /* renamed from: n */
    private final C6981ra m26004n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C6981ra raVar = (C6981ra) this.f18556d[i3];
        if (raVar != null) {
            return raVar;
        }
        C6981ra b = C6933oa.m26315a().mo20068b((Class) this.f18556d[i3 + 1]);
        this.f18556d[i3] = b;
        return b;
    }

    /* renamed from: o */
    private final Object m26005o(int i) {
        int i2 = i / 3;
        return this.f18556d[i2 + i2];
    }

    /* renamed from: p */
    private static Field m26006p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: q */
    private final void m26007q(Object obj, Object obj2, int i) {
        long k = (long) (m26001k(i) & 1048575);
        if (m26014x(obj2, i)) {
            Object k2 = C7014tb.m26620k(obj, k);
            Object k3 = C7014tb.m26620k(obj2, k);
            if (k2 != null && k3 != null) {
                k3 = C6820h9.m25838g(k2, k3);
            } else if (k3 == null) {
                return;
            }
            C7014tb.m26633x(obj, k, k3);
            m26009s(obj, i);
        }
    }

    /* renamed from: r */
    private final void m26008r(Object obj, Object obj2, int i) {
        int k = m26001k(i);
        int i2 = this.f18555c[i];
        long j = (long) (k & 1048575);
        if (m25981A(obj2, i2, i)) {
            Object k2 = m25981A(obj, i2, i) ? C7014tb.m26620k(obj, j) : null;
            Object k3 = C7014tb.m26620k(obj2, j);
            if (k2 != null && k3 != null) {
                k3 = C6820h9.m25838g(k2, k3);
            } else if (k3 == null) {
                return;
            }
            C7014tb.m26633x(obj, j, k3);
            m26010t(obj, i2, i);
        }
    }

    /* renamed from: s */
    private final void m26009s(Object obj, int i) {
        int S = m25998S(i);
        long j = (long) (1048575 & S);
        if (j != 1048575) {
            C7014tb.m26631v(obj, j, (1 << (S >>> 20)) | C7014tb.m26617h(obj, j));
        }
    }

    /* renamed from: t */
    private final void m26010t(Object obj, int i, int i2) {
        C7014tb.m26631v(obj, (long) (m25998S(i2) & 1048575), i);
    }

    /* renamed from: u */
    private final void m26011u(Object obj, C6739cc ccVar) {
        int i;
        Object obj2 = obj;
        C6739cc ccVar2 = ccVar;
        if (!this.f18560h) {
            int length = this.f18555c.length;
            Unsafe unsafe = f18554b;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int k = m26001k(i3);
                int[] iArr = this.f18555c;
                int i6 = iArr[i3];
                int j = m26000j(k);
                if (j <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j2 = (long) (k & i2);
                switch (j) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            ccVar2.mo19644s(i6, C7014tb.m26615f(obj2, j2));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19647v(i6, C7014tb.m26616g(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19633h(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19618C(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19641p(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19622G(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19629d(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19630e(i6, C7014tb.m26606B(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m25983C(i6, unsafe.getObject(obj2, j2), ccVar2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19621F(i6, unsafe.getObject(obj2, j2), m26004n(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19642q(i6, (C7106z7) unsafe.getObject(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19626a(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19639n(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19646u(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19635j(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19631f(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19624I(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            ccVar2.mo19650y(i6, unsafe.getObject(obj2, j2), m26004n(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C7013ta.m26588j(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 19:
                        C7013ta.m26592n(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 20:
                        C7013ta.m26595q(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 21:
                        C7013ta.m26603y(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 22:
                        C7013ta.m26594p(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 23:
                        C7013ta.m26591m(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 24:
                        C7013ta.m26590l(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 25:
                        C7013ta.m26586h(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        continue;
                    case 26:
                        C7013ta.m26601w(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2);
                        break;
                    case 27:
                        C7013ta.m26596r(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, m26004n(i3));
                        break;
                    case 28:
                        C7013ta.m26587i(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2);
                        break;
                    case 29:
                        C7013ta.m26602x(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        break;
                    case 30:
                        C7013ta.m26589k(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        break;
                    case 31:
                        C7013ta.m26597s(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        break;
                    case 32:
                        C7013ta.m26598t(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        break;
                    case 33:
                        C7013ta.m26599u(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        break;
                    case 34:
                        C7013ta.m26600v(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, false);
                        break;
                    case 35:
                        C7013ta.m26588j(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24704g4 /*36*/:
                        C7013ta.m26592n(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case 37:
                        C7013ta.m26595q(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case 38:
                        C7013ta.m26603y(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case 39:
                        C7013ta.m26594p(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24728k4 /*40*/:
                        C7013ta.m26591m(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24734l4 /*41*/:
                        C7013ta.m26590l(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24740m4 /*42*/:
                        C7013ta.m26586h(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case 43:
                        C7013ta.m26602x(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case 44:
                        C7013ta.m26589k(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24746n4 /*45*/:
                        C7013ta.m26597s(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24752o4 /*46*/:
                        C7013ta.m26598t(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24758p4 /*47*/:
                        C7013ta.m26599u(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24764q4 /*48*/:
                        C7013ta.m26600v(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, true);
                        break;
                    case C9024k.f24770r4 /*49*/:
                        C7013ta.m26593o(this.f18555c[i3], (List) unsafe.getObject(obj2, j2), ccVar2, m26004n(i3));
                        break;
                    case 50:
                        m26012v(ccVar2, i6, unsafe.getObject(obj2, j2), i3);
                        break;
                    case 51:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19644s(i6, m25987H(obj2, j2));
                            break;
                        }
                        break;
                    case 52:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19647v(i6, m25988I(obj2, j2));
                            break;
                        }
                        break;
                    case 53:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19633h(i6, m26002l(obj2, j2));
                            break;
                        }
                        break;
                    case 54:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19618C(i6, m26002l(obj2, j2));
                            break;
                        }
                        break;
                    case 55:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19641p(i6, m25991L(obj2, j2));
                            break;
                        }
                        break;
                    case 56:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19622G(i6, m26002l(obj2, j2));
                            break;
                        }
                        break;
                    case 57:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19629d(i6, m25991L(obj2, j2));
                            break;
                        }
                        break;
                    case 58:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19630e(i6, m25982B(obj2, j2));
                            break;
                        }
                        break;
                    case 59:
                        if (m25981A(obj2, i6, i3)) {
                            m25983C(i6, unsafe.getObject(obj2, j2), ccVar2);
                            break;
                        }
                        break;
                    case 60:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19621F(i6, unsafe.getObject(obj2, j2), m26004n(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19642q(i6, (C7106z7) unsafe.getObject(obj2, j2));
                            break;
                        }
                        break;
                    case 62:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19626a(i6, m25991L(obj2, j2));
                            break;
                        }
                        break;
                    case 63:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19639n(i6, m25991L(obj2, j2));
                            break;
                        }
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /*64*/:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19646u(i6, m25991L(obj2, j2));
                            break;
                        }
                        break;
                    case 65:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19635j(i6, m26002l(obj2, j2));
                            break;
                        }
                        break;
                    case 66:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19631f(i6, m25991L(obj2, j2));
                            break;
                        }
                        break;
                    case 67:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19624I(i6, m26002l(obj2, j2));
                            break;
                        }
                        break;
                    case 68:
                        if (m25981A(obj2, i6, i3)) {
                            ccVar2.mo19650y(i6, unsafe.getObject(obj2, j2), m26004n(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            C6854jb jbVar = this.f18566n;
            jbVar.mo19909i(jbVar.mo19903c(obj2), ccVar2);
            return;
        }
        this.f18567o.mo19998a(obj2);
        throw null;
    }

    /* renamed from: v */
    private final void m26012v(C6739cc ccVar, int i, Object obj, int i2) {
        if (obj != null) {
            C7108z9 z9Var = (C7108z9) m26005o(i2);
            throw null;
        }
    }

    /* renamed from: w */
    private final boolean m26013w(Object obj, Object obj2, int i) {
        return m26014x(obj, i) == m26014x(obj2, i);
    }

    /* renamed from: x */
    private final boolean m26014x(Object obj, int i) {
        int S = m25998S(i);
        long j = (long) (S & 1048575);
        if (j != 1048575) {
            return (C7014tb.m26617h(obj, j) & (1 << (S >>> 20))) != 0;
        }
        int k = m26001k(i);
        long j2 = (long) (k & 1048575);
        switch (m26000j(k)) {
            case 0:
                return Double.doubleToRawLongBits(C7014tb.m26615f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C7014tb.m26616g(obj, j2)) != 0;
            case 2:
                return C7014tb.m26618i(obj, j2) != 0;
            case 3:
                return C7014tb.m26618i(obj, j2) != 0;
            case 4:
                return C7014tb.m26617h(obj, j2) != 0;
            case 5:
                return C7014tb.m26618i(obj, j2) != 0;
            case 6:
                return C7014tb.m26617h(obj, j2) != 0;
            case 7:
                return C7014tb.m26606B(obj, j2);
            case 8:
                Object k2 = C7014tb.m26620k(obj, j2);
                if (k2 instanceof String) {
                    return !((String) k2).isEmpty();
                }
                if (k2 instanceof C7106z7) {
                    return !C7106z7.f19078f.equals(k2);
                }
                throw new IllegalArgumentException();
            case 9:
                return C7014tb.m26620k(obj, j2) != null;
            case 10:
                return !C7106z7.f19078f.equals(C7014tb.m26620k(obj, j2));
            case 11:
                return C7014tb.m26617h(obj, j2) != 0;
            case 12:
                return C7014tb.m26617h(obj, j2) != 0;
            case 13:
                return C7014tb.m26617h(obj, j2) != 0;
            case 14:
                return C7014tb.m26618i(obj, j2) != 0;
            case 15:
                return C7014tb.m26617h(obj, j2) != 0;
            case 16:
                return C7014tb.m26618i(obj, j2) != 0;
            case 17:
                return C7014tb.m26620k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: y */
    private final boolean m26015y(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m26014x(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: z */
    private static boolean m26016z(Object obj, int i, C6981ra raVar) {
        return raVar.mo19897f(C7014tb.m26620k(obj, (long) (i & 1048575)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x036d, code lost:
        if (r0 != r15) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0389, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03b5, code lost:
        if (r0 != r15) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d7, code lost:
        if (r0 != r15) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        r10.putInt(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0157, code lost:
        r10.putObject(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015a, code lost:
        r5 = r6 | r25;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015e, code lost:
        r3 = r8;
        r1 = r11;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018f, code lost:
        r21 = r3;
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f1, code lost:
        r5 = r6 | r25;
        r3 = r2;
        r1 = r11;
        r6 = r27;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f9, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fd, code lost:
        r13 = r2;
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0200, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a1, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a3, code lost:
        r5 = r6 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a5, code lost:
        r2 = r32;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a9, code lost:
        r3 = r13;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ae, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c3, code lost:
        r7 = r34;
        r22 = r6;
        r28 = r10;
        r8 = r18;
        r2 = r21;
        r6 = r27;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19891D(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p174e.p319f.p320a.p335c.p345f.p352g.C6882l7 r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f18554b
            r16 = 0
            r0 = r32
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x0448
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26136k(r0, r12, r1, r9)
            int r1 = r9.f18612a
            r4 = r1
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003a
            int r3 = r3 / r8
            int r2 = r15.m25997R(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m25996Q(r0)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r32 = r0
            r2 = r1
            r8 = r4
            r22 = r5
            r28 = r10
            r7 = r11
            r19 = -1
            r21 = 0
            goto L_0x03da
        L_0x0050:
            int[] r3 = r15.f18555c
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = m26000j(r8)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02d3
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r25 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            r18 = r4
            if (r0 == r6) goto L_0x0089
            if (r6 == r3) goto L_0x0081
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0081:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r27 = r0
            goto L_0x008b
        L_0x0089:
            r27 = r6
        L_0x008b:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0288;
                case 1: goto L_0x026c;
                case 2: goto L_0x0245;
                case 3: goto L_0x0245;
                case 4: goto L_0x022c;
                case 5: goto L_0x0204;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01b8;
                case 8: goto L_0x0194;
                case 9: goto L_0x0164;
                case 10: goto L_0x0140;
                case 11: goto L_0x022c;
                case 12: goto L_0x010d;
                case 13: goto L_0x01d9;
                case 14: goto L_0x0204;
                case 15: goto L_0x00ef;
                case 16: goto L_0x00bc;
                default: goto L_0x0090;
            }
        L_0x0090:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r0 = 3
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02ae
            e.f.a.c.f.g.ra r0 = r15.m26004n(r13)
            int r1 = r32 << 3
            r7 = r1 | 4
            r1 = r31
            r2 = r11
            r3 = r33
            r11 = r4
            r4 = r7
            r5 = r35
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26128c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x02b1
            java.lang.Object r1 = r9.f18614c
            goto L_0x02bb
        L_0x00bc:
            if (r7 != 0) goto L_0x00e5
            r3 = r21
            int r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r12, r3, r9)
            long r0 = r9.f18613b
            long r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25596b(r0)
            r11 = r20
            r0 = r10
            r1 = r30
            r8 = r2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r22
            r32 = r11
            r11 = r18
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r0 = r7
            goto L_0x015e
        L_0x00e5:
            r32 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r2
            goto L_0x02c3
        L_0x00ef:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x018f
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r12, r3, r9)
            int r1 = r9.f18612a
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6752d8.m25595a(r1)
            r4 = r22
        L_0x0109:
            r10.putInt(r14, r4, r1)
            goto L_0x015a
        L_0x010d:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x018f
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r12, r3, r9)
            int r1 = r9.f18612a
            e.f.a.c.f.g.d9 r2 = r15.m26003m(r8)
            if (r2 == 0) goto L_0x0109
            boolean r2 = r2.mo19609e(r1)
            if (r2 == 0) goto L_0x0130
            goto L_0x0109
        L_0x0130:
            e.f.a.c.f.g.kb r2 = m25984E(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo19931h(r11, r1)
            r2 = r32
            r5 = r6
            goto L_0x015e
        L_0x0140:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x018f
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26126a(r12, r3, r9)
            java.lang.Object r1 = r9.f18614c
        L_0x0157:
            r10.putObject(r14, r4, r1)
        L_0x015a:
            r5 = r6 | r25
            r2 = r32
        L_0x015e:
            r3 = r8
            r1 = r11
            r6 = r27
            goto L_0x01f9
        L_0x0164:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x018f
            e.f.a.c.f.g.ra r0 = r15.m26004n(r8)
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26129d(r0, r12, r3, r13, r9)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x0184
            java.lang.Object r1 = r9.f18614c
            goto L_0x0157
        L_0x0184:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r9.f18614c
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25838g(r1, r2)
            goto L_0x0157
        L_0x018f:
            r21 = r3
            r13 = r8
            goto L_0x0200
        L_0x0194:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01fd
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01ae
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26132g(r12, r3, r9)
            goto L_0x01b2
        L_0x01ae:
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26133h(r12, r3, r9)
        L_0x01b2:
            java.lang.Object r1 = r9.f18614c
            r10.putObject(r14, r4, r1)
            goto L_0x01f1
        L_0x01b8:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x01fd
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r12, r3, r9)
            long r7 = r9.f18613b
            r17 = 0
            int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x01d4
            goto L_0x01d5
        L_0x01d4:
            r1 = 0
        L_0x01d5:
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26627r(r14, r4, r1)
            goto L_0x01f1
        L_0x01d9:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01fd
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x01f1:
            r5 = r6 | r25
            r3 = r2
            r1 = r11
            r6 = r27
            r2 = r32
        L_0x01f9:
            r11 = r34
            goto L_0x0019
        L_0x01fd:
            r13 = r2
            r21 = r3
        L_0x0200:
            r18 = r11
            goto L_0x02c3
        L_0x0204:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0225
            long r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r12, r3)
            r0 = r10
            r1 = r30
            r13 = r2
            r18 = r11
            r11 = r3
            r2 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x02a1
        L_0x0225:
            r13 = r2
            r18 = r11
            r21 = r3
            goto L_0x02c3
        L_0x022c:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02ae
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26135j(r12, r11, r9)
            int r1 = r9.f18612a
            r10.putInt(r14, r4, r1)
            goto L_0x02a3
        L_0x0245:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02ae
            int r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26138m(r12, r11, r9)
            long r2 = r9.f18613b
            r0 = r10
            r1 = r30
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r11 = r34
            r0 = r7
            goto L_0x02a9
        L_0x026c:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02ae
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26127b(r12, r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26630u(r14, r4, r0)
            int r0 = r11 + 4
            goto L_0x02a3
        L_0x0288:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02ae
            long r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26139n(r12, r11)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26629t(r14, r4, r0)
        L_0x02a1:
            int r0 = r11 + 8
        L_0x02a3:
            r5 = r6 | r25
        L_0x02a5:
            r2 = r32
            r11 = r34
        L_0x02a9:
            r3 = r13
            r1 = r18
            goto L_0x0325
        L_0x02ae:
            r21 = r11
            goto L_0x02c3
        L_0x02b1:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f18614c
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25838g(r1, r2)
        L_0x02bb:
            r10.putObject(r14, r11, r1)
            r5 = r6 | r25
            r12 = r31
            goto L_0x02a5
        L_0x02c3:
            r7 = r34
            r22 = r6
            r28 = r10
            r8 = r18
            r2 = r21
            r6 = r27
            r21 = r13
            goto L_0x03da
        L_0x02d3:
            r13 = r2
            r18 = r4
            r3 = r11
            r4 = r20
            r11 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r3 != r0) goto L_0x0339
            r0 = 2
            if (r7 != r0) goto L_0x032b
            java.lang.Object r0 = r10.getObject(r14, r11)
            e.f.a.c.f.g.g9 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6804g9) r0
            boolean r1 = r0.mo19801a()
            if (r1 != 0) goto L_0x0304
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02fc
            r1 = 10
            goto L_0x02fd
        L_0x02fc:
            int r1 = r1 + r1
        L_0x02fd:
            e.f.a.c.f.g.g9 r0 = r0.mo19570f(r1)
            r10.putObject(r14, r11, r0)
        L_0x0304:
            r7 = r0
            e.f.a.c.f.g.ra r0 = r15.m26004n(r13)
            r1 = r18
            r2 = r31
            r3 = r21
            r8 = r4
            r4 = r33
            r22 = r5
            r5 = r7
            r27 = r6
            r6 = r35
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26130e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r31
            r11 = r34
            r2 = r8
            r3 = r13
            r5 = r22
        L_0x0325:
            r6 = r27
            r13 = r33
            goto L_0x0019
        L_0x032b:
            r22 = r5
            r27 = r6
            r32 = r4
            r28 = r10
            r15 = r21
            r21 = r13
            goto L_0x03b8
        L_0x0339:
            r22 = r5
            r27 = r6
            r6 = r4
            r0 = 49
            if (r3 > r0) goto L_0x038d
            long r4 = (long) r8
            r0 = r29
            r1 = r30
            r2 = r31
            r8 = r3
            r3 = r21
            r23 = r4
            r4 = r33
            r5 = r18
            r32 = r6
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r23
            r25 = r11
            r15 = r21
            r12 = r34
            r11 = r20
            r21 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.m25995P(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0389
        L_0x036f:
            r15 = r29
            r14 = r30
            r12 = r31
            r2 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r18
            r3 = r21
            r5 = r22
            r6 = r27
            r10 = r28
            goto L_0x0019
        L_0x0389:
            r7 = r34
            r2 = r0
            goto L_0x03bb
        L_0x038d:
            r20 = r3
            r32 = r6
            r28 = r10
            r25 = r11
            r15 = r21
            r21 = r13
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x03c0
            r0 = 2
            if (r7 != r0) goto L_0x03b8
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r25
            r8 = r35
            int r0 = r0.m25992M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0389
            goto L_0x036f
        L_0x03b8:
            r7 = r34
            r2 = r15
        L_0x03bb:
            r8 = r18
            r6 = r27
            goto L_0x03da
        L_0x03c0:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r32
            r10 = r25
            r12 = r21
            r13 = r35
            int r0 = r0.m25993N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0389
            goto L_0x036f
        L_0x03da:
            if (r8 != r7) goto L_0x03e8
            if (r7 == 0) goto L_0x03e8
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r22
            goto L_0x0451
        L_0x03e8:
            r9 = r29
            boolean r0 = r9.f18560h
            if (r0 == 0) goto L_0x0421
            r10 = r35
            e.f.a.c.f.g.m8 r0 = r10.f18615d
            e.f.a.c.f.g.m8 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6899m8.m26140a()
            if (r0 == r1) goto L_0x041c
            e.f.a.c.f.g.ga r0 = r9.f18559g
            e.f.a.c.f.g.m8 r1 = r10.f18615d
            r11 = r32
            e.f.a.c.f.g.z8 r0 = r1.mo19951c(r0, r11)
            if (r0 != 0) goto L_0x0416
            e.f.a.c.f.g.kb r4 = m25984E(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26134i(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0436
        L_0x0416:
            r12 = r30
            r0 = r12
            e.f.a.c.f.g.y8 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7091y8) r0
            throw r17
        L_0x041c:
            r12 = r30
            r11 = r32
            goto L_0x0427
        L_0x0421:
            r12 = r30
            r11 = r32
            r10 = r35
        L_0x0427:
            e.f.a.c.f.g.kb r4 = m25984E(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26134i(r0, r1, r2, r3, r4, r5)
        L_0x0436:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r21
            r5 = r22
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x0019
        L_0x0448:
            r22 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x0451:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x045c
            long r3 = (long) r6
            r6 = r28
            r6.putInt(r12, r3, r5)
        L_0x045c:
            int r3 = r9.f18563k
        L_0x045e:
            int r4 = r9.f18564l
            if (r3 >= r4) goto L_0x0489
            int[] r4 = r9.f18562j
            r4 = r4[r3]
            int[] r5 = r9.f18555c
            r5 = r5[r4]
            int r5 = r9.m26001k(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r12, r5)
            if (r5 != 0) goto L_0x0477
            goto L_0x047d
        L_0x0477:
            e.f.a.c.f.g.d9 r6 = r9.m26003m(r4)
            if (r6 != 0) goto L_0x0480
        L_0x047d:
            int r3 = r3 + 1
            goto L_0x045e
        L_0x0480:
            e.f.a.c.f.g.aa r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6703aa) r5
            java.lang.Object r0 = r9.m26005o(r4)
            e.f.a.c.f.g.z9 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7108z9) r0
            throw r17
        L_0x0489:
            r2 = r33
            if (r7 != 0) goto L_0x0495
            if (r0 != r2) goto L_0x0490
            goto L_0x0499
        L_0x0490:
            e.f.a.c.f.g.j9 r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25979e()
            throw r0
        L_0x0495:
            if (r0 > r2) goto L_0x049a
            if (r1 != r7) goto L_0x049a
        L_0x0499:
            return r0
        L_0x049a:
            e.f.a.c.f.g.j9 r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25979e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.mo19891D(java.lang.Object, byte[], int, int, int, e.f.a.c.f.g.l7):int");
    }

    /* renamed from: a */
    public final int mo19892a(Object obj) {
        return this.f18561i ? m25990K(obj) : m25989J(obj);
    }

    /* renamed from: b */
    public final void mo19893b(Object obj) {
        int i;
        int i2 = this.f18563k;
        while (true) {
            i = this.f18564l;
            if (i2 >= i) {
                break;
            }
            long k = (long) (m26001k(this.f18562j[i2]) & 1048575);
            Object k2 = C7014tb.m26620k(obj, k);
            if (k2 != null) {
                ((C6703aa) k2).mo19529e();
                C7014tb.m26633x(obj, k, k2);
            }
            i2++;
        }
        int length = this.f18562j.length;
        while (i < length) {
            this.f18565m.mo20082a(obj, (long) this.f18562j[i]);
            i++;
        }
        this.f18566n.mo19907g(obj);
        if (this.f18560h) {
            this.f18567o.mo19999b(obj);
        }
    }

    /* renamed from: c */
    public final Object mo19894c() {
        return ((C6702a9) this.f18559g).mo19497w(4, (Object) null, (Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = m25991L(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = m26002l(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25832a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25834c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19895d(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f18555c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0128
            int r3 = r8.m26001k(r1)
            int[] r4 = r8.f18555c
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m26000j(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0124
        L_0x001f:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x004b:
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            boolean r3 = m25982B(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x008d:
            int r2 = r2 * 53
            int r3 = m25991L(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = m26002l(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            float r3 = m25988I(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.m25981A(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            double r3 = m25987H(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0124
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26606B(r9, r5)
        L_0x00f7:
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25832a(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26616g(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26615f(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6820h9.m25834c(r3)
        L_0x0123:
            int r2 = r2 + r3
        L_0x0124:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0128:
            int r2 = r2 * 53
            e.f.a.c.f.g.jb r0 = r8.f18566n
            java.lang.Object r0 = r0.mo19903c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f18560h
            if (r0 != 0) goto L_0x013a
            return r2
        L_0x013a:
            e.f.a.c.f.g.n8 r0 = r8.f18567o
            r0.mo19998a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.mo19895d(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r7, r2, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r8, r2));
        m26010t(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r7, r2, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26631v(r7, r2, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26632w(r7, r2, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        m26009s(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19896e(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f18555c
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m26001k(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f18555c
            r4 = r4[r0]
            int r1 = m26000j(r1)
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m25981A(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m26008r(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m25981A(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r7, r2, r1)
            r6.m26010t(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            e.f.a.c.f.g.ba r1 = r6.f18569q
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26552B(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            e.f.a.c.f.g.t9 r1 = r6.f18565m
            r1.mo20083b(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m26007q(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26606B(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26627r(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26631v(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26632w(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26616g(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26630u(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m26014x(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26615f(r8, r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26629t(r7, r2, r4)
        L_0x00eb:
            r6.m26009s(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00f2:
            e.f.a.c.f.g.jb r0 = r6.f18566n
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26584f(r0, r7, r8)
            boolean r0 = r6.f18560h
            if (r0 == 0) goto L_0x0100
            e.f.a.c.f.g.n8 r0 = r6.f18567o
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26583e(r0, r7, r8)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.mo19896e(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: f */
    public final boolean mo19897f(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f18563k) {
            int i6 = this.f18562j[i5];
            int i7 = this.f18555c[i6];
            int k = m26001k(i6);
            int i8 = this.f18555c[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f18554b.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & k) != 0 && !m26015y(obj, i6, i2, i, i10)) {
                return false;
            }
            int j = m26000j(k);
            if (j != 9 && j != 17) {
                if (j != 27) {
                    if (j == 60 || j == 68) {
                        if (m25981A(obj2, i7, i6) && !m26016z(obj2, k, m26004n(i6))) {
                            return false;
                        }
                    } else if (j != 49) {
                        if (j == 50 && !((C6703aa) C7014tb.m26620k(obj2, (long) (k & 1048575))).isEmpty()) {
                            C7108z9 z9Var = (C7108z9) m26005o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C7014tb.m26620k(obj2, (long) (k & 1048575));
                if (!list.isEmpty()) {
                    C6981ra n = m26004n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!n.mo19897f(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m26015y(obj, i6, i2, i, i10) && !m26016z(obj2, k, m26004n(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f18560h) {
            return true;
        }
        this.f18567o.mo19998a(obj2);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ed, code lost:
        r11.mo19631f(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02fe, code lost:
        r11.mo19635j(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x030f, code lost:
        r11.mo19646u(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0320, code lost:
        r11.mo19639n(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0331, code lost:
        r11.mo19626a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x033c, code lost:
        r11.mo19642q(r4, (p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, (long) (r3 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x034f, code lost:
        r11.mo19621F(r4, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, (long) (r3 & 1048575)), m26004n(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0364, code lost:
        m25983C(r4, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, (long) (r3 & 1048575)), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037b, code lost:
        r11.mo19630e(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x038c, code lost:
        r11.mo19629d(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039c, code lost:
        r11.mo19622G(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03ac, code lost:
        r11.mo19641p(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03bc, code lost:
        r11.mo19618C(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03cc, code lost:
        r11.mo19633h(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03dc, code lost:
        r11.mo19647v(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ec, code lost:
        r11.mo19644s(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c1, code lost:
        r11.mo19650y(r4, p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, (long) (r3 & 1048575)), m26004n(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02dc, code lost:
        r11.mo19624I(r4, r5);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19898g(java.lang.Object r10, p174e.p319f.p320a.p335c.p345f.p352g.C6739cc r11) {
        /*
            r9 = this;
            boolean r0 = r9.f18561i
            if (r0 == 0) goto L_0x0404
            boolean r0 = r9.f18560h
            if (r0 != 0) goto L_0x03fd
            int[] r0 = r9.f18555c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x03f3
            int r3 = r9.m26001k(r2)
            int[] r4 = r9.f18555c
            r4 = r4[r2]
            int r5 = m26000j(r3)
            r6 = 1
            r7 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x03e0;
                case 1: goto L_0x03d0;
                case 2: goto L_0x03c0;
                case 3: goto L_0x03b0;
                case 4: goto L_0x03a0;
                case 5: goto L_0x0390;
                case 6: goto L_0x0380;
                case 7: goto L_0x036f;
                case 8: goto L_0x035e;
                case 9: goto L_0x0349;
                case 10: goto L_0x0336;
                case 11: goto L_0x0325;
                case 12: goto L_0x0314;
                case 13: goto L_0x0303;
                case 14: goto L_0x02f2;
                case 15: goto L_0x02e1;
                case 16: goto L_0x02d0;
                case 17: goto L_0x02bb;
                case 18: goto L_0x02ae;
                case 19: goto L_0x02a1;
                case 20: goto L_0x0294;
                case 21: goto L_0x0287;
                case 22: goto L_0x027a;
                case 23: goto L_0x026d;
                case 24: goto L_0x0260;
                case 25: goto L_0x0253;
                case 26: goto L_0x0246;
                case 27: goto L_0x0235;
                case 28: goto L_0x0228;
                case 29: goto L_0x021b;
                case 30: goto L_0x020e;
                case 31: goto L_0x0201;
                case 32: goto L_0x01f4;
                case 33: goto L_0x01e7;
                case 34: goto L_0x01da;
                case 35: goto L_0x01cd;
                case 36: goto L_0x01c0;
                case 37: goto L_0x01b3;
                case 38: goto L_0x01a6;
                case 39: goto L_0x0199;
                case 40: goto L_0x018c;
                case 41: goto L_0x017f;
                case 42: goto L_0x0172;
                case 43: goto L_0x0165;
                case 44: goto L_0x0158;
                case 45: goto L_0x014b;
                case 46: goto L_0x013e;
                case 47: goto L_0x0131;
                case 48: goto L_0x0124;
                case 49: goto L_0x0113;
                case 50: goto L_0x0108;
                case 51: goto L_0x00fa;
                case 52: goto L_0x00ec;
                case 53: goto L_0x00de;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c2;
                case 56: goto L_0x00b4;
                case 57: goto L_0x00a6;
                case 58: goto L_0x0098;
                case 59: goto L_0x0090;
                case 60: goto L_0x0088;
                case 61: goto L_0x0080;
                case 62: goto L_0x0072;
                case 63: goto L_0x0064;
                case 64: goto L_0x0056;
                case 65: goto L_0x0048;
                case 66: goto L_0x003a;
                case 67: goto L_0x002c;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x03ef
        L_0x0024:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            goto L_0x02c1
        L_0x002c:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m26002l(r10, r5)
            goto L_0x02dc
        L_0x003a:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m25991L(r10, r5)
            goto L_0x02ed
        L_0x0048:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m26002l(r10, r5)
            goto L_0x02fe
        L_0x0056:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m25991L(r10, r5)
            goto L_0x030f
        L_0x0064:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m25991L(r10, r5)
            goto L_0x0320
        L_0x0072:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m25991L(r10, r5)
            goto L_0x0331
        L_0x0080:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            goto L_0x033c
        L_0x0088:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            goto L_0x034f
        L_0x0090:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            goto L_0x0364
        L_0x0098:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = m25982B(r10, r5)
            goto L_0x037b
        L_0x00a6:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m25991L(r10, r5)
            goto L_0x038c
        L_0x00b4:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m26002l(r10, r5)
            goto L_0x039c
        L_0x00c2:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m25991L(r10, r5)
            goto L_0x03ac
        L_0x00d0:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m26002l(r10, r5)
            goto L_0x03bc
        L_0x00de:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m26002l(r10, r5)
            goto L_0x03cc
        L_0x00ec:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = m25988I(r10, r5)
            goto L_0x03dc
        L_0x00fa:
            boolean r5 = r9.m25981A(r10, r4, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = m25987H(r10, r5)
            goto L_0x03ec
        L_0x0108:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            r9.m26012v(r11, r4, r3, r2)
            goto L_0x03ef
        L_0x0113:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            e.f.a.c.f.g.ra r5 = r9.m26004n(r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26593o(r4, r3, r11, r5)
            goto L_0x03ef
        L_0x0124:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26600v(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x0131:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26599u(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x013e:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26598t(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x014b:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26597s(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x0158:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26589k(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x0165:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26602x(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x0172:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26586h(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x017f:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26590l(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x018c:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26591m(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x0199:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26594p(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x01a6:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26603y(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x01b3:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26595q(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x01c0:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26592n(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x01cd:
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r7)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26588j(r4, r3, r11, r6)
            goto L_0x03ef
        L_0x01da:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26600v(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x01e7:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26599u(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x01f4:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26598t(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x0201:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26597s(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x020e:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26589k(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x021b:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26602x(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x0228:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26587i(r4, r3, r11)
            goto L_0x03ef
        L_0x0235:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            e.f.a.c.f.g.ra r5 = r9.m26004n(r2)
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26596r(r4, r3, r11, r5)
            goto L_0x03ef
        L_0x0246:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26601w(r4, r3, r11)
            goto L_0x03ef
        L_0x0253:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26586h(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x0260:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26590l(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x026d:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26591m(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x027a:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26594p(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x0287:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26603y(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x0294:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26595q(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x02a1:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26592n(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x02ae:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            java.util.List r3 = (java.util.List) r3
            p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26588j(r4, r3, r11, r1)
            goto L_0x03ef
        L_0x02bb:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
        L_0x02c1:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            e.f.a.c.f.g.ra r5 = r9.m26004n(r2)
            r11.mo19650y(r4, r3, r5)
            goto L_0x03ef
        L_0x02d0:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
        L_0x02dc:
            r11.mo19624I(r4, r5)
            goto L_0x03ef
        L_0x02e1:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
        L_0x02ed:
            r11.mo19631f(r4, r3)
            goto L_0x03ef
        L_0x02f2:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
        L_0x02fe:
            r11.mo19635j(r4, r5)
            goto L_0x03ef
        L_0x0303:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
        L_0x030f:
            r11.mo19646u(r4, r3)
            goto L_0x03ef
        L_0x0314:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
        L_0x0320:
            r11.mo19639n(r4, r3)
            goto L_0x03ef
        L_0x0325:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
        L_0x0331:
            r11.mo19626a(r4, r3)
            goto L_0x03ef
        L_0x0336:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
        L_0x033c:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            e.f.a.c.f.g.z7 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C7106z7) r3
            r11.mo19642q(r4, r3)
            goto L_0x03ef
        L_0x0349:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
        L_0x034f:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            e.f.a.c.f.g.ra r5 = r9.m26004n(r2)
            r11.mo19621F(r4, r3, r5)
            goto L_0x03ef
        L_0x035e:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
        L_0x0364:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            m25983C(r4, r3, r11)
            goto L_0x03ef
        L_0x036f:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26606B(r10, r5)
        L_0x037b:
            r11.mo19630e(r4, r3)
            goto L_0x03ef
        L_0x0380:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
        L_0x038c:
            r11.mo19629d(r4, r3)
            goto L_0x03ef
        L_0x0390:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
        L_0x039c:
            r11.mo19622G(r4, r5)
            goto L_0x03ef
        L_0x03a0:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
        L_0x03ac:
            r11.mo19641p(r4, r3)
            goto L_0x03ef
        L_0x03b0:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
        L_0x03bc:
            r11.mo19618C(r4, r5)
            goto L_0x03ef
        L_0x03c0:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
        L_0x03cc:
            r11.mo19633h(r4, r5)
            goto L_0x03ef
        L_0x03d0:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26616g(r10, r5)
        L_0x03dc:
            r11.mo19647v(r4, r3)
            goto L_0x03ef
        L_0x03e0:
            boolean r5 = r9.m26014x(r10, r2)
            if (r5 == 0) goto L_0x03ef
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26615f(r10, r5)
        L_0x03ec:
            r11.mo19644s(r4, r5)
        L_0x03ef:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x03f3:
            e.f.a.c.f.g.jb r0 = r9.f18566n
            java.lang.Object r10 = r0.mo19903c(r10)
            r0.mo19909i(r10, r11)
            return
        L_0x03fd:
            e.f.a.c.f.g.n8 r11 = r9.f18567o
            r11.mo19998a(r10)
            r10 = 0
            throw r10
        L_0x0404:
            r9.m26011u(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.mo19898g(java.lang.Object, e.f.a.c.f.g.cc):void");
    }

    /* renamed from: h */
    public final void mo19899h(Object obj, byte[] bArr, int i, int i2, C6882l7 l7Var) {
        if (this.f18561i) {
            m25994O(obj, bArr, i, i2, l7Var);
        } else {
            mo19891D(obj, bArr, i, i2, 0, l7Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19900i(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int[] r0 = r8.f18555c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.m26001k(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = m26000j(r3)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.m25998S(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r3)
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26604z(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26604z(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26604z(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r9, r5)
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r9, r5)
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26604z(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26604z(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r9, r5)
            java.lang.Object r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r10, r5)
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7013ta.m26604z(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26606B(r9, r5)
            boolean r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26606B(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r9, r5)
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r9, r5)
            int r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26617h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r9, r5)
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r9, r5)
            long r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26618i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26616g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26616g(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.m26013w(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26615f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26615f(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            e.f.a.c.f.g.jb r0 = r8.f18566n
            java.lang.Object r0 = r0.mo19903c(r9)
            e.f.a.c.f.g.jb r2 = r8.f18566n
            java.lang.Object r2 = r2.mo19903c(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f18560h
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            e.f.a.c.f.g.n8 r0 = r8.f18567o
            r0.mo19998a(r9)
            e.f.a.c.f.g.n8 r9 = r8.f18567o
            r9.mo19998a(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6853ja.mo19900i(java.lang.Object, java.lang.Object):boolean");
    }
}
