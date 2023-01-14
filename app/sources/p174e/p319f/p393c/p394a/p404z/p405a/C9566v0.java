package p174e.p319f.p393c.p394a.p404z.p405a;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9449e;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9508l0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9567v1;
import sun.misc.Unsafe;

/* renamed from: e.f.c.a.z.a.v0 */
final class C9566v0<T> implements C9467h1<T> {

    /* renamed from: a */
    private static final int[] f25546a = new int[0];

    /* renamed from: b */
    private static final Unsafe f25547b = C9539s1.m32301B();

    /* renamed from: c */
    private final int[] f25548c;

    /* renamed from: d */
    private final Object[] f25549d;

    /* renamed from: e */
    private final int f25550e;

    /* renamed from: f */
    private final int f25551f;

    /* renamed from: g */
    private final C9537s0 f25552g;

    /* renamed from: h */
    private final boolean f25553h;

    /* renamed from: i */
    private final boolean f25554i;

    /* renamed from: j */
    private final boolean f25555j;

    /* renamed from: k */
    private final boolean f25556k;

    /* renamed from: l */
    private final int[] f25557l;

    /* renamed from: m */
    private final int f25558m;

    /* renamed from: n */
    private final int f25559n;

    /* renamed from: o */
    private final C9574x0 f25560o;

    /* renamed from: p */
    private final C9480i0 f25561p;

    /* renamed from: q */
    private final C9522o1<?, ?> f25562q;

    /* renamed from: r */
    private final C9530r<?> f25563r;

    /* renamed from: s */
    private final C9518n0 f25564s;

    private C9566v0(int[] iArr, Object[] objArr, int i, int i2, C9537s0 s0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C9574x0 x0Var, C9480i0 i0Var, C9522o1<?, ?> o1Var, C9530r<?> rVar, C9518n0 n0Var) {
        this.f25548c = iArr;
        this.f25549d = objArr;
        this.f25550e = i;
        this.f25551f = i2;
        this.f25554i = s0Var instanceof C9577z;
        this.f25555j = z;
        this.f25553h = rVar != null && rVar.mo23951e(s0Var);
        this.f25556k = z2;
        this.f25557l = iArr2;
        this.f25558m = i3;
        this.f25559n = i4;
        this.f25560o = x0Var;
        this.f25561p = i0Var;
        this.f25562q = o1Var;
        this.f25563r = rVar;
        this.f25552g = s0Var;
        this.f25564s = n0Var;
    }

    /* renamed from: A */
    private static boolean m32477A(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: B */
    private boolean m32478B(T t, int i) {
        if (this.f25555j) {
            int r0 = m32527r0(i);
            long U = m32497U(r0);
            switch (m32525q0(r0)) {
                case 0:
                    return C9539s1.m32338v(t, U) != 0.0d;
                case 1:
                    return C9539s1.m32339w(t, U) != 0.0f;
                case 2:
                    return C9539s1.m32341y(t, U) != 0;
                case 3:
                    return C9539s1.m32341y(t, U) != 0;
                case 4:
                    return C9539s1.m32340x(t, U) != 0;
                case 5:
                    return C9539s1.m32341y(t, U) != 0;
                case 6:
                    return C9539s1.m32340x(t, U) != 0;
                case 7:
                    return C9539s1.m32332p(t, U);
                case 8:
                    Object A = C9539s1.m32300A(t, U);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof C9468i) {
                        return !C9468i.f25367f.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C9539s1.m32300A(t, U) != null;
                case 10:
                    return !C9468i.f25367f.equals(C9539s1.m32300A(t, U));
                case 11:
                    return C9539s1.m32340x(t, U) != 0;
                case 12:
                    return C9539s1.m32340x(t, U) != 0;
                case 13:
                    return C9539s1.m32340x(t, U) != 0;
                case 14:
                    return C9539s1.m32341y(t, U) != 0;
                case 15:
                    return C9539s1.m32340x(t, U) != 0;
                case 16:
                    return C9539s1.m32341y(t, U) != 0;
                case 17:
                    return C9539s1.m32300A(t, U) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int h0 = m32509h0(i);
            return (C9539s1.m32340x(t, (long) (h0 & 1048575)) & (1 << (h0 >>> 20))) != 0;
        }
    }

    /* renamed from: C */
    private boolean m32479C(T t, int i, int i2, int i3) {
        return this.f25555j ? m32478B(t, i) : (i2 & i3) != 0;
    }

    /* renamed from: D */
    private static boolean m32480D(Object obj, int i, C9467h1 h1Var) {
        return h1Var.mo23631c(C9539s1.m32300A(obj, m32497U(i)));
    }

    /* renamed from: E */
    private <N> boolean m32481E(Object obj, int i, int i2) {
        List list = (List) C9539s1.m32300A(obj, m32497U(i));
        if (list.isEmpty()) {
            return true;
        }
        C9467h1 u = m32532u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u.mo23631c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private boolean m32482F(T t, int i, int i2) {
        if (this.f25564s.mo23896h(C9539s1.m32300A(t, m32497U(i))).isEmpty()) {
            return true;
        }
        this.f25564s.mo23891c(m32530t(i2));
        throw null;
    }

    /* renamed from: G */
    private boolean m32483G(T t, T t2, int i) {
        long h0 = (long) (m32509h0(i) & 1048575);
        return C9539s1.m32340x(t, h0) == C9539s1.m32340x(t2, h0);
    }

    /* renamed from: H */
    private boolean m32484H(T t, int i, int i2) {
        return C9539s1.m32340x(t, (long) (m32509h0(i2) & 1048575)) == i;
    }

    /* renamed from: I */
    private static boolean m32485I(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: J */
    private static List<?> m32486J(Object obj, long j) {
        return (List) C9539s1.m32300A(obj, j);
    }

    /* renamed from: K */
    private static <T> long m32487K(T t, long j) {
        return C9539s1.m32341y(t, j);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: L */
    private <UT, UB, ET extends p174e.p319f.p393c.p394a.p404z.p405a.C9563v.C9565b<ET>> void m32488L(p174e.p319f.p393c.p394a.p404z.p405a.C9522o1<UT, UB> r17, p174e.p319f.p393c.p394a.p404z.p405a.C9530r<ET> r18, T r19, p174e.p319f.p393c.p394a.p404z.p405a.C9464g1 r20, p174e.p319f.p393c.p394a.p404z.p405a.C9526q r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo23543B()     // Catch:{ all -> 0x056b }
            int r3 = r8.m32507f0(r1)     // Catch:{ all -> 0x056b }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f25558m
        L_0x001e:
            int r1 = r8.f25559n
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f25557l
            r1 = r1[r0]
            java.lang.Object r13 = r8.m32522p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo23912o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f25553h     // Catch:{ all -> 0x056b }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            e.f.c.a.z.a.s0 r2 = r8.f25552g     // Catch:{ all -> 0x056b }
            r15 = r18
            java.lang.Object r1 = r15.mo23948b(r11, r2, r1)     // Catch:{ all -> 0x056b }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            e.f.c.a.z.a.v r1 = r18.mo23950d(r19)     // Catch:{ all -> 0x056b }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo23953g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x056b }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo23914q(r0)     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo23549H()     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.mo23903f(r10)     // Catch:{ all -> 0x056b }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.mo23910m(r13, r0)     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f25558m
        L_0x0079:
            int r1 = r8.f25559n
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f25557l
            r1 = r1[r0]
            java.lang.Object r13 = r8.m32522p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.mo23912o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.m32527r0(r3)     // Catch:{ all -> 0x056b }
            int r2 = m32525q0(r4)     // Catch:{ a -> 0x0524 }
            switch(r2) {
                case 0: goto L_0x04f9;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04df;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04b8;
                case 6: goto L_0x04ab;
                case 7: goto L_0x049e;
                case 8: goto L_0x0499;
                case 9: goto L_0x0468;
                case 10: goto L_0x045c;
                case 11: goto L_0x0450;
                case 12: goto L_0x0438;
                case 13: goto L_0x042c;
                case 14: goto L_0x0420;
                case 15: goto L_0x0414;
                case 16: goto L_0x0408;
                case 17: goto L_0x03d1;
                case 18: goto L_0x03c5;
                case 19: goto L_0x03b9;
                case 20: goto L_0x03ad;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0395;
                case 23: goto L_0x0389;
                case 24: goto L_0x037d;
                case 25: goto L_0x0371;
                case 26: goto L_0x036c;
                case 27: goto L_0x035a;
                case 28: goto L_0x034b;
                case 29: goto L_0x033f;
                case 30: goto L_0x032c;
                case 31: goto L_0x0320;
                case 32: goto L_0x0314;
                case 33: goto L_0x0308;
                case 34: goto L_0x02fc;
                case 35: goto L_0x02ed;
                case 36: goto L_0x02de;
                case 37: goto L_0x02cf;
                case 38: goto L_0x02c0;
                case 39: goto L_0x02b1;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0293;
                case 42: goto L_0x0284;
                case 43: goto L_0x0275;
                case 44: goto L_0x025e;
                case 45: goto L_0x024f;
                case 46: goto L_0x0240;
                case 47: goto L_0x0231;
                case 48: goto L_0x0222;
                case 49: goto L_0x020c;
                case 50: goto L_0x01fb;
                case 51: goto L_0x01ea;
                case 52: goto L_0x01d9;
                case 53: goto L_0x01c8;
                case 54: goto L_0x01b7;
                case 55: goto L_0x01a6;
                case 56: goto L_0x0195;
                case 57: goto L_0x0184;
                case 58: goto L_0x0173;
                case 59: goto L_0x016e;
                case 60: goto L_0x0137;
                case 61: goto L_0x012a;
                case 62: goto L_0x011a;
                case 63: goto L_0x00f7;
                case 64: goto L_0x00e7;
                case 65: goto L_0x00d7;
                case 66: goto L_0x00c7;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ a -> 0x0524 }
        L_0x009b:
            if (r13 != 0) goto L_0x0507
            java.lang.Object r1 = r17.mo23911n()     // Catch:{ a -> 0x0524 }
            goto L_0x0506
        L_0x00a3:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r2 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.mo23577q(r2, r11)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
        L_0x00b2:
            r8.m32521o0(r10, r1, r3)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x00b7:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.mo23585w()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00c7:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.mo23584v()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00d7:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.mo23570j()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00e7:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.mo23550I()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00f7:
            int r2 = r20.mo23578r()     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.b0$e r5 = r8.m32528s(r3)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x010e
            boolean r5 = r5.mo23510a(r2)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x0108
            goto L_0x010e
        L_0x0108:
            java.lang.Object r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31820L(r1, r2, r13, r9)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x010e:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x011a:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.mo23572l()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x012a:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.i r2 = r20.mo23546E()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0137:
            boolean r2 = r8.m32484H(r10, r1, r3)     // Catch:{ a -> 0x0524 }
            if (r2 == 0) goto L_0x015a
            long r5 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r10, r5)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r5 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r5 = r0.mo23581s(r5, r11)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r2, r5)     // Catch:{ a -> 0x0524 }
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x015a:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r2 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.mo23581s(r2, r11)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            r8.m32519n0(r10, r3)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x016e:
            r8.m32513k0(r10, r4, r0)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0173:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            boolean r2 = r20.mo23569i()     // Catch:{ a -> 0x0524 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0184:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.mo23568h()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0195:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.mo23562c()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01a6:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.mo23548G()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01b7:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.mo23561b()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01c8:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.mo23555N()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01d9:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x0524 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01ea:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x0524 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01fb:
            java.lang.Object r4 = r8.m32530t(r3)     // Catch:{ a -> 0x0524 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.m32489M(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x020c:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r6 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.m32510i0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0222:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x022c:
            r0.mo23565e(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0231:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x023b:
            r0.mo23559a(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0240:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x024a:
            r0.mo23574n(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x024f:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x0259:
            r0.mo23564d(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x025e:
            e.f.c.a.z.a.i0 r2 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r2 = r2.mo23672e(r10, r4)     // Catch:{ a -> 0x0524 }
            r0.mo23576p(r2)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.b0$e r3 = r8.m32528s(r3)     // Catch:{ a -> 0x0524 }
        L_0x026f:
            java.lang.Object r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31809A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0275:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x027f:
            r0.mo23566f(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0284:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x028e:
            r0.mo23587y(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0293:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x029d:
            r0.mo23583u(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02a2:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02ac:
            r0.mo23557P(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02b1:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02bb:
            r0.mo23575o(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02c0:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02ca:
            r0.mo23571k(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02cf:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02d9:
            r0.mo23573m(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02de:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02e8:
            r0.mo23547F(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02ed:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02f7:
            r0.mo23553L(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02fc:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x022c
        L_0x0308:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x023b
        L_0x0314:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x024a
        L_0x0320:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x0259
        L_0x032c:
            e.f.c.a.z.a.i0 r2 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r2 = r2.mo23672e(r10, r4)     // Catch:{ a -> 0x0524 }
            r0.mo23576p(r2)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.b0$e r3 = r8.m32528s(r3)     // Catch:{ a -> 0x0524 }
            goto L_0x026f
        L_0x033f:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x027f
        L_0x034b:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            r0.mo23551J(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x035a:
            e.f.c.a.z.a.h1 r5 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.m32511j0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x036c:
            r8.m32515l0(r10, r4, r0)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0371:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x028e
        L_0x037d:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x029d
        L_0x0389:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02ac
        L_0x0395:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02bb
        L_0x03a1:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02ca
        L_0x03ad:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02d9
        L_0x03b9:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02e8
        L_0x03c5:
            e.f.c.a.z.a.i0 r1 = r8.f25561p     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.mo23672e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02f7
        L_0x03d1:
            boolean r1 = r8.m32478B(r10, r3)     // Catch:{ a -> 0x0524 }
            if (r1 == 0) goto L_0x03f4
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r10, r1)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r2 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.mo23577q(r2, r11)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r1, r2)     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
        L_0x03ef:
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r2, r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x03f4:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r4 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r4 = r0.mo23577q(r4, r11)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r1, r4)     // Catch:{ a -> 0x0524 }
        L_0x0403:
            r8.m32519n0(r10, r3)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0408:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.mo23585w()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0414:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.mo23584v()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0420:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.mo23570j()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x042c:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.mo23550I()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0438:
            int r2 = r20.mo23578r()     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.b0$e r5 = r8.m32528s(r3)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x0448
            boolean r5 = r5.mo23510a(r2)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x0108
        L_0x0448:
            long r4 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0450:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.mo23572l()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x045c:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.i r4 = r20.mo23546E()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0468:
            boolean r1 = r8.m32478B(r10, r3)     // Catch:{ a -> 0x0524 }
            if (r1 == 0) goto L_0x0488
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r10, r1)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r2 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.mo23581s(r2, r11)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r1, r2)     // Catch:{ a -> 0x0524 }
            long r2 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            goto L_0x03ef
        L_0x0488:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            e.f.c.a.z.a.h1 r4 = r8.m32532u(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r4 = r0.mo23581s(r4, r11)     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0499:
            r8.m32513k0(r10, r4, r0)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x049e:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            boolean r4 = r20.mo23569i()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32304E(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04ab:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.mo23568h()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04b8:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.mo23562c()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04c5:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.mo23548G()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04d2:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.mo23561b()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04df:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.mo23555N()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04ec:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32311L(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04f9:
            long r1 = m32497U(r4)     // Catch:{ a -> 0x0524 }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x0524 }
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32310K(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0506:
            r13 = r1
        L_0x0507:
            boolean r1 = r9.mo23910m(r13, r0)     // Catch:{ a -> 0x0524 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f25558m
        L_0x050f:
            int r1 = r8.f25559n
            if (r0 >= r1) goto L_0x051e
            int[] r1 = r8.f25557l
            r1 = r1[r0]
            java.lang.Object r13 = r8.m32522p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x050f
        L_0x051e:
            if (r13 == 0) goto L_0x0523
            r9.mo23912o(r10, r13)
        L_0x0523:
            return
        L_0x0524:
            boolean r1 = r9.mo23914q(r0)     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0547
            boolean r1 = r20.mo23549H()     // Catch:{ all -> 0x056b }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f25558m
        L_0x0532:
            int r1 = r8.f25559n
            if (r0 >= r1) goto L_0x0541
            int[] r1 = r8.f25557l
            r1 = r1[r0]
            java.lang.Object r13 = r8.m32522p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0532
        L_0x0541:
            if (r13 == 0) goto L_0x0546
            r9.mo23912o(r10, r13)
        L_0x0546:
            return
        L_0x0547:
            if (r13 != 0) goto L_0x054e
            java.lang.Object r1 = r9.mo23903f(r10)     // Catch:{ all -> 0x056b }
            r13 = r1
        L_0x054e:
            boolean r1 = r9.mo23910m(r13, r0)     // Catch:{ all -> 0x056b }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f25558m
        L_0x0556:
            int r1 = r8.f25559n
            if (r0 >= r1) goto L_0x0565
            int[] r1 = r8.f25557l
            r1 = r1[r0]
            java.lang.Object r13 = r8.m32522p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0556
        L_0x0565:
            if (r13 == 0) goto L_0x056a
            r9.mo23912o(r10, r13)
        L_0x056a:
            return
        L_0x056b:
            r0 = move-exception
            int r1 = r8.f25558m
        L_0x056e:
            int r2 = r8.f25559n
            if (r1 >= r2) goto L_0x057d
            int[] r2 = r8.f25557l
            r2 = r2[r1]
            java.lang.Object r13 = r8.m32522p(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x056e
        L_0x057d:
            if (r13 == 0) goto L_0x0582
            r9.mo23912o(r10, r13)
        L_0x0582:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32488L(e.f.c.a.z.a.o1, e.f.c.a.z.a.r, java.lang.Object, e.f.c.a.z.a.g1, e.f.c.a.z.a.q):void");
    }

    /* renamed from: M */
    private final <K, V> void m32489M(Object obj, int i, Object obj2, C9526q qVar, C9464g1 g1Var) {
        long U = m32497U(m32527r0(i));
        Object A = C9539s1.m32300A(obj, U);
        if (A == null) {
            A = this.f25564s.mo23893e(obj2);
            C9539s1.m32314O(obj, U, A);
        } else if (this.f25564s.mo23895g(A)) {
            Object e = this.f25564s.mo23893e(obj2);
            this.f25564s.mo23889a(e, A);
            C9539s1.m32314O(obj, U, e);
            A = e;
        }
        g1Var.mo23552K(this.f25564s.mo23892d(A), this.f25564s.mo23891c(obj2), qVar);
    }

    /* renamed from: N */
    private void m32490N(T t, T t2, int i) {
        long U = m32497U(m32527r0(i));
        if (m32478B(t2, i)) {
            Object A = C9539s1.m32300A(t, U);
            Object A2 = C9539s1.m32300A(t2, U);
            if (A != null && A2 != null) {
                A2 = C9431b0.m31429h(A, A2);
            } else if (A2 == null) {
                return;
            }
            C9539s1.m32314O(t, U, A2);
            m32519n0(t, i);
        }
    }

    /* renamed from: O */
    private void m32491O(T t, T t2, int i) {
        int r0 = m32527r0(i);
        int T = m32496T(i);
        long U = m32497U(r0);
        if (m32484H(t2, T, i)) {
            Object A = C9539s1.m32300A(t, U);
            Object A2 = C9539s1.m32300A(t2, U);
            if (A != null && A2 != null) {
                A2 = C9431b0.m31429h(A, A2);
            } else if (A2 == null) {
                return;
            }
            C9539s1.m32314O(t, U, A2);
            m32521o0(t, T, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r6, r1, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r6, r1, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r6, r1, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32341y(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        m32519n0(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r6, r1, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r7, r1));
        m32521o0(r6, r3, r8);
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32492P(T r6, T r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.m32527r0(r8)
            long r1 = m32497U(r0)
            int r3 = r5.m32496T(r8)
            int r0 = m32525q0(r0)
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a3;
                case 5: goto L_0x009c;
                case 6: goto L_0x0095;
                case 7: goto L_0x0087;
                case 8: goto L_0x0079;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x0066;
                case 12: goto L_0x005f;
                case 13: goto L_0x0058;
                case 14: goto L_0x0050;
                case 15: goto L_0x0049;
                case 16: goto L_0x0041;
                case 17: goto L_0x0074;
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
                case 50: goto L_0x0033;
                case 51: goto L_0x0021;
                case 52: goto L_0x0021;
                case 53: goto L_0x0021;
                case 54: goto L_0x0021;
                case 55: goto L_0x0021;
                case 56: goto L_0x0021;
                case 57: goto L_0x0021;
                case 58: goto L_0x0021;
                case 59: goto L_0x0021;
                case 60: goto L_0x001c;
                case 61: goto L_0x0015;
                case 62: goto L_0x0015;
                case 63: goto L_0x0015;
                case 64: goto L_0x0015;
                case 65: goto L_0x0015;
                case 66: goto L_0x0015;
                case 67: goto L_0x0015;
                case 68: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00e4
        L_0x0015:
            boolean r0 = r5.m32484H(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0027
        L_0x001c:
            r5.m32491O(r6, r7, r8)
            goto L_0x00e4
        L_0x0021:
            boolean r0 = r5.m32484H(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0027:
            java.lang.Object r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r6, r1, r7)
            r5.m32521o0(r6, r3, r8)
            goto L_0x00e4
        L_0x0033:
            e.f.c.a.z.a.n0 r8 = r5.f25564s
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31814F(r8, r6, r7, r1)
            goto L_0x00e4
        L_0x003a:
            e.f.c.a.z.a.i0 r8 = r5.f25561p
            r8.mo23671d(r6, r7, r1)
            goto L_0x00e4
        L_0x0041:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0049:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x0050:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0058:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x005f:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0065:
            goto L_0x00a9
        L_0x0066:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x006d:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x007f
        L_0x0074:
            r5.m32490N(r6, r7, r8)
            goto L_0x00e4
        L_0x0079:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x007f:
            java.lang.Object r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r6, r1, r7)
            goto L_0x00e1
        L_0x0087:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            boolean r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32332p(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32304E(r6, r1, r7)
            goto L_0x00e1
        L_0x0095:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x009c:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00a3:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32312M(r6, r1, r7)
            goto L_0x00e1
        L_0x00b1:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00b8:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00be:
            long r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32341y(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32313N(r6, r1, r3)
            goto L_0x00e1
        L_0x00c6:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            float r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32339w(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32311L(r6, r1, r7)
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = r5.m32478B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            double r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32338v(r7, r1)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32310K(r6, r1, r3)
        L_0x00e1:
            r5.m32519n0(r6, r8)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32492P(java.lang.Object, java.lang.Object, int):void");
    }

    /* renamed from: Q */
    static <T> C9566v0<T> m32493Q(Class<T> cls, C9528q0 q0Var, C9574x0 x0Var, C9480i0 i0Var, C9522o1<?, ?> o1Var, C9530r<?> rVar, C9518n0 n0Var) {
        return q0Var instanceof C9461f1 ? m32495S((C9461f1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var) : m32494R((C9510l1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    /* renamed from: R */
    static <T> C9566v0<T> m32494R(C9510l1 l1Var, C9574x0 x0Var, C9480i0 i0Var, C9522o1<?, ?> o1Var, C9530r<?> rVar, C9518n0 n0Var) {
        boolean z = l1Var.mo23596c() == C9445c1.PROTO3;
        C9553u[] e = l1Var.mo23819e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e.length <= 0) {
                int[] d = l1Var.mo23818d();
                if (d == null) {
                    d = f25546a;
                }
                if (e.length <= 0) {
                    int[] iArr2 = f25546a;
                    int[] iArr3 = f25546a;
                    int[] iArr4 = new int[(d.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d, 0, iArr4, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
                    return new C9566v0(iArr, objArr, 0, 0, l1Var.mo23595b(), z, true, iArr4, d.length, d.length + iArr2.length, x0Var, i0Var, o1Var, rVar, n0Var);
                }
                C9553u uVar = e[0];
                throw null;
            }
            C9553u uVar2 = e[0];
            throw null;
        }
        C9553u uVar3 = e[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0392  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> p174e.p319f.p393c.p394a.p404z.p405a.C9566v0<T> m32495S(p174e.p319f.p393c.p394a.p404z.p405a.C9461f1 r36, p174e.p319f.p393c.p394a.p404z.p405a.C9574x0 r37, p174e.p319f.p393c.p394a.p404z.p405a.C9480i0 r38, p174e.p319f.p393c.p394a.p404z.p405a.C9522o1<?, ?> r39, p174e.p319f.p393c.p394a.p404z.p405a.C9530r<?> r40, p174e.p319f.p393c.p394a.p404z.p405a.C9518n0 r41) {
        /*
            e.f.c.a.z.a.c1 r0 = r36.mo23596c()
            e.f.c.a.z.a.c1 r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9445c1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r36.mo23598e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f25546a
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = f25547b
            java.lang.Object[] r18 = r36.mo23597d()
            e.f.c.a.z.a.s0 r19 = r36.mo23595b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m32517m0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x029d
        L_0x0295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = m32517m0(r3, r6)
            r18[r15] = r6
        L_0x029d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L_0x03a9
        L_0x02b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m32517m0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0326
            r14 = 17
            if (r10 != r14) goto L_0x02c9
            goto L_0x0326
        L_0x02c9:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r9) goto L_0x02d0
            goto L_0x0316
        L_0x02d0:
            r14 = 12
            if (r10 == r14) goto L_0x0305
            r14 = 30
            if (r10 == r14) goto L_0x0305
            r14 = 44
            if (r10 != r14) goto L_0x02dd
            goto L_0x0305
        L_0x02dd:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0332
        L_0x02fe:
            r23 = r14
            r6 = r27
            goto L_0x0332
        L_0x0303:
            r9 = 1
            goto L_0x0332
        L_0x0305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0322
        L_0x0316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0322:
            r14 = r10
            r6 = r20
            goto L_0x0333
        L_0x0326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0332:
            r14 = r10
        L_0x0333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0351
        L_0x0363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0381
        L_0x0379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m32517m0(r3, r10)
            r18[r19] = r10
        L_0x0381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L_0x039b
        L_0x038c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0398
        L_0x0392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0398:
            r14 = r15
            r4 = 0
            r15 = 0
        L_0x039b:
            r3 = 18
            if (r9 < r3) goto L_0x03a9
            r3 = 49
            if (r9 > r3) goto L_0x03a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L_0x03a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L_0x0196
        L_0x03e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            e.f.c.a.z.a.v0 r0 = new e.f.c.a.z.a.v0
            e.f.c.a.z.a.s0 r9 = r36.mo23595b()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32495S(e.f.c.a.z.a.f1, e.f.c.a.z.a.x0, e.f.c.a.z.a.i0, e.f.c.a.z.a.o1, e.f.c.a.z.a.r, e.f.c.a.z.a.n0):e.f.c.a.z.a.v0");
    }

    /* renamed from: T */
    private int m32496T(int i) {
        return this.f25548c[i];
    }

    /* renamed from: U */
    private static long m32497U(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: V */
    private static <T> boolean m32498V(T t, long j) {
        return ((Boolean) C9539s1.m32300A(t, j)).booleanValue();
    }

    /* renamed from: W */
    private static <T> double m32499W(T t, long j) {
        return ((Double) C9539s1.m32300A(t, j)).doubleValue();
    }

    /* renamed from: X */
    private static <T> float m32500X(T t, long j) {
        return ((Float) C9539s1.m32300A(t, j)).floatValue();
    }

    /* renamed from: Y */
    private static <T> int m32501Y(T t, long j) {
        return ((Integer) C9539s1.m32300A(t, j)).intValue();
    }

    /* renamed from: Z */
    private static <T> long m32502Z(T t, long j) {
        return ((Long) C9539s1.m32300A(t, j)).longValue();
    }

    /* renamed from: a0 */
    private <K, V> int m32503a0(T t, byte[] bArr, int i, int i2, int i3, long j, C9449e.C9451b bVar) {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f25547b;
        int i4 = i3;
        Object t3 = m32530t(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f25564s.mo23895g(object)) {
            Object e = this.f25564s.mo23893e(t3);
            this.f25564s.mo23889a(e, object);
            unsafe.putObject(t, j2, e);
            object = e;
        }
        return m32516m(bArr, i, i2, this.f25564s.mo23891c(t3), this.f25564s.mo23892d(object), bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0134, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0153, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m32504b0(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p174e.p319f.p393c.p394a.p404z.p405a.C9449e.C9451b r29) {
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
            sun.misc.Unsafe r12 = f25547b
            int[] r7 = r0.f25548c
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0159;
                case 52: goto L_0x0149;
                case 53: goto L_0x0139;
                case 54: goto L_0x0139;
                case 55: goto L_0x012c;
                case 56: goto L_0x0120;
                case 57: goto L_0x0115;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a3;
                case 62: goto L_0x012c;
                case 63: goto L_0x0074;
                case 64: goto L_0x0115;
                case 65: goto L_0x0120;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x016d
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x016d
            r2 = r2 & -8
            r7 = r2 | 4
            e.f.c.a.z.a.h1 r2 = r0.m32532u(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31487n(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f25337c
            if (r15 != 0) goto L_0x0052
            goto L_0x0145
        L_0x0052:
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r15, r3)
            goto L_0x0145
        L_0x0058:
            if (r5 != 0) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r3, r4, r11)
            long r3 = r11.f25336b
            long r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9485j.m31731c(r3)
            goto L_0x0141
        L_0x0066:
            if (r5 != 0) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r3, r4, r11)
            int r3 = r11.f25335a
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9485j.m31730b(r3)
            goto L_0x0134
        L_0x0074:
            if (r5 != 0) goto L_0x016d
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r3, r4, r11)
            int r4 = r11.f25335a
            e.f.c.a.z.a.b0$e r5 = r0.m32528s(r6)
            if (r5 == 0) goto L_0x0096
            boolean r5 = r5.mo23510a(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0096
        L_0x0089:
            e.f.c.a.z.a.p1 r1 = m32534v(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo23925n(r2, r4)
            goto L_0x00a0
        L_0x0096:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00a0:
            r2 = r3
            goto L_0x016e
        L_0x00a3:
            if (r5 != r15) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31475b(r3, r4, r11)
            java.lang.Object r3 = r11.f25337c
            goto L_0x0145
        L_0x00ad:
            if (r5 != r15) goto L_0x016d
            e.f.c.a.z.a.h1 r2 = r0.m32532u(r6)
            r5 = r20
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31489p(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.f25337c
            if (r15 != 0) goto L_0x00cb
            goto L_0x0145
        L_0x00cb:
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r15, r3)
            goto L_0x0145
        L_0x00d1:
            if (r5 != r15) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r3, r4, r11)
            int r4 = r11.f25335a
            if (r4 != 0) goto L_0x00de
            java.lang.String r3 = ""
            goto L_0x0145
        L_0x00de:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f2
            int r5 = r2 + r4
            boolean r5 = p174e.p319f.p393c.p394a.p404z.p405a.C9547t1.m32403n(r3, r2, r5)
            if (r5 == 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            e.f.c.a.z.a.c0 r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9443c0.m31443c()
            throw r1
        L_0x00f2:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.f25305a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0169
        L_0x00ff:
            if (r5 != 0) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r3, r4, r11)
            long r3 = r11.f25336b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x010f
            r15 = 1
            goto L_0x0110
        L_0x010f:
            r15 = 0
        L_0x0110:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0145
        L_0x0115:
            if (r5 != r7) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31481h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0153
        L_0x0120:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            long r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31483j(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0164
        L_0x012c:
            if (r5 != 0) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r3, r4, r11)
            int r3 = r11.f25335a
        L_0x0134:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0145
        L_0x0139:
            if (r5 != 0) goto L_0x016d
            int r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r3, r4, r11)
            long r3 = r11.f25336b
        L_0x0141:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0145:
            r12.putObject(r1, r9, r3)
            goto L_0x0169
        L_0x0149:
            if (r5 != r7) goto L_0x016d
            float r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31485l(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0153:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0169
        L_0x0159:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            double r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31477d(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0164:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0169:
            r12.putInt(r1, r13, r8)
            goto L_0x016e
        L_0x016d:
            r2 = r4
        L_0x016e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32504b0(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, e.f.c.a.z.a.e$b):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r6 == 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r1 = r11.f25337c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0101, code lost:
        if (r6 == 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
        r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r8, r11);
        r1 = r11.f25335a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        r0.putLong(r1, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c2, code lost:
        if (r0 != r15) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f0, code lost:
        if (r0 != r15) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020d, code lost:
        if (r0 != r15) goto L_0x0221;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m32505d0(T r28, byte[] r29, int r30, int r31, p174e.p319f.p393c.p394a.p404z.p405a.C9449e.C9451b r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f25547b
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0013:
            if (r0 >= r13) goto L_0x0234
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0025
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31467H(r0, r12, r3, r11)
            int r3 = r11.f25335a
            r8 = r0
            r17 = r3
            goto L_0x0028
        L_0x0025:
            r17 = r0
            r8 = r3
        L_0x0028:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0035
            int r2 = r2 / 3
            int r0 = r15.m32508g0(r7, r2)
            goto L_0x0039
        L_0x0035:
            int r0 = r15.m32507f0(r7)
        L_0x0039:
            r4 = r0
            if (r4 != r10) goto L_0x0047
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0211
        L_0x0047:
            int[] r0 = r15.f25548c
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = m32525q0(r5)
            long r1 = m32497U(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0147
            r0 = 1
            switch(r3) {
                case 0: goto L_0x012e;
                case 1: goto L_0x011f;
                case 2: goto L_0x010d;
                case 3: goto L_0x010d;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00de;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00b6;
                case 9: goto L_0x009b;
                case 10: goto L_0x008e;
                case 11: goto L_0x00ff;
                case 12: goto L_0x0088;
                case 13: goto L_0x00de;
                case 14: goto L_0x00ef;
                case 15: goto L_0x0078;
                case 16: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0184
        L_0x0060:
            if (r6 != 0) goto L_0x0184
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r12, r8, r11)
            r19 = r1
            long r0 = r11.f25336b
            long r21 = p174e.p319f.p393c.p394a.p404z.p405a.C9485j.m31731c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            goto L_0x011a
        L_0x0078:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r8, r11)
            int r1 = r11.f25335a
            int r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9485j.m31730b(r1)
            goto L_0x0109
        L_0x0088:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
            goto L_0x0103
        L_0x008e:
            r2 = r1
            if (r6 != r10) goto L_0x0184
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31475b(r12, r8, r11)
        L_0x0095:
            java.lang.Object r1 = r11.f25337c
        L_0x0097:
            r9.putObject(r14, r2, r1)
            goto L_0x00eb
        L_0x009b:
            r2 = r1
            if (r6 != r10) goto L_0x0184
            e.f.c.a.z.a.h1 r0 = r15.m32532u(r4)
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31489p(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00af
            java.lang.Object r1 = r11.f25337c
            goto L_0x0097
        L_0x00af:
            java.lang.Object r5 = r11.f25337c
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r1, r5)
            goto L_0x0097
        L_0x00b6:
            r2 = r1
            if (r6 != r10) goto L_0x0184
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00c3
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31462C(r12, r8, r11)
            goto L_0x0095
        L_0x00c3:
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31465F(r12, r8, r11)
            goto L_0x0095
        L_0x00c8:
            r2 = r1
            if (r6 != 0) goto L_0x0184
            int r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r12, r8, r11)
            long r5 = r11.f25336b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32304E(r14, r2, r0)
            r0 = r1
            goto L_0x00eb
        L_0x00de:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x0184
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31481h(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x00eb:
            r2 = r4
            r1 = r7
            goto L_0x0231
        L_0x00ef:
            r2 = r1
            if (r6 != r0) goto L_0x0184
            long r5 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31483j(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0139
        L_0x00ff:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
        L_0x0103:
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r8, r11)
            int r1 = r11.f25335a
        L_0x0109:
            r9.putInt(r14, r2, r1)
            goto L_0x013b
        L_0x010d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r12, r8, r11)
            long r4 = r11.f25336b
            r0 = r9
            r1 = r28
        L_0x011a:
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x013b
        L_0x011f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x013f
            float r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31485l(r12, r8)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32311L(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x013b
        L_0x012e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x013f
            double r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31477d(r12, r8)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32310K(r14, r2, r0)
        L_0x0139:
            int r0 = r8 + 8
        L_0x013b:
            r1 = r7
            r2 = r10
            goto L_0x0231
        L_0x013f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x018b
        L_0x0147:
            r0 = 27
            if (r3 != r0) goto L_0x018f
            if (r6 != r10) goto L_0x0184
            java.lang.Object r0 = r9.getObject(r14, r1)
            e.f.c.a.z.a.b0$i r0 = (p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.C9440i) r0
            boolean r3 = r0.mo23512y()
            if (r3 != 0) goto L_0x016b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0162
            r3 = 10
            goto L_0x0164
        L_0x0162:
            int r3 = r3 * 2
        L_0x0164:
            e.f.c.a.z.a.b0$i r0 = r0.mo23497n(r3)
            r9.putObject(r14, r1, r0)
        L_0x016b:
            r5 = r0
            e.f.c.a.z.a.h1 r0 = r15.m32532u(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31490q(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0231
        L_0x0184:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x018b:
            r26 = -1
            goto L_0x01f3
        L_0x018f:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01c6
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.m32506e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0210
        L_0x01c4:
            goto L_0x0221
        L_0x01c6:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            r7 = r30
            if (r9 != r0) goto L_0x01f5
            if (r7 != r10) goto L_0x01f3
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.m32503a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0210
            goto L_0x01c4
        L_0x01f3:
            r2 = r15
            goto L_0x0211
        L_0x01f5:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.m32504b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0210
            goto L_0x01c4
        L_0x0210:
            r2 = r0
        L_0x0211:
            e.f.c.a.z.a.p1 r4 = m32534v(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31466G(r0, r1, r2, r3, r4, r5)
        L_0x0221:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0231:
            r10 = -1
            goto L_0x0013
        L_0x0234:
            r1 = r13
            if (r0 != r1) goto L_0x0238
            return r0
        L_0x0238:
            e.f.c.a.z.a.c0 r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9443c0.m31447g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32505d0(java.lang.Object, byte[], int, int, e.f.c.a.z.a.e$b):int");
    }

    /* renamed from: e0 */
    private int m32506e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C9449e.C9451b bVar) {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C9449e.C9451b bVar2 = bVar;
        Unsafe unsafe = f25547b;
        C9431b0.C9440i iVar = (C9431b0.C9440i) unsafe.getObject(t, j3);
        if (!iVar.mo23512y()) {
            int size = iVar.size();
            iVar = iVar.mo23497n(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, iVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C9449e.m31492s(bArr, i9, iVar, bVar2);
                }
                if (i10 == 1) {
                    return C9449e.m31478e(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 19:
            case C9024k.f24704g4:
                if (i10 == 2) {
                    return C9449e.m31495v(bArr, i9, iVar, bVar2);
                }
                if (i10 == 5) {
                    return C9449e.m31486m(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C9449e.m31499z(bArr, i9, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C9449e.m31472M(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return C9449e.m31498y(bArr, i9, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C9449e.m31469J(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case C9024k.f24728k4:
            case C9024k.f24752o4:
                if (i10 == 2) {
                    return C9449e.m31494u(bArr, i9, iVar, bVar2);
                }
                if (i10 == 1) {
                    return C9449e.m31484k(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case C9024k.f24734l4:
            case C9024k.f24746n4:
                if (i10 == 2) {
                    return C9449e.m31493t(bArr, i9, iVar, bVar2);
                }
                if (i10 == 5) {
                    return C9449e.m31482i(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 25:
            case C9024k.f24740m4:
                if (i10 == 2) {
                    return C9449e.m31491r(bArr, i9, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C9449e.m31474a(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    int i12 = ((j & 536870912) > 0 ? 1 : ((j & 536870912) == 0 ? 0 : -1));
                    byte[] bArr3 = bArr;
                    int i13 = i;
                    int i14 = i2;
                    C9431b0.C9440i iVar2 = iVar;
                    C9449e.C9451b bVar3 = bVar;
                    return i12 == 0 ? C9449e.m31463D(i3, bArr3, i13, i14, iVar2, bVar3) : C9449e.m31464E(i3, bArr3, i13, i14, iVar2, bVar3);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C9449e.m31490q(m32532u(i11), i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C9449e.m31476c(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = C9449e.m31498y(bArr, i9, iVar, bVar2);
                } else if (i10 == 0) {
                    i8 = C9449e.m31469J(i3, bArr, i, i2, iVar, bVar);
                }
                C9577z zVar = (C9577z) t2;
                C9525p1 p1Var = zVar.unknownFields;
                if (p1Var == C9525p1.m32204e()) {
                    p1Var = null;
                }
                C9525p1 p1Var2 = (C9525p1) C9489j1.m31809A(i4, iVar, m32528s(i11), p1Var, this.f25562q);
                if (p1Var2 != null) {
                    zVar.unknownFields = p1Var2;
                }
                return i8;
            case 33:
            case C9024k.f24758p4:
                if (i10 == 2) {
                    return C9449e.m31496w(bArr, i9, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C9449e.m31460A(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 34:
            case C9024k.f24764q4:
                if (i10 == 2) {
                    return C9449e.m31497x(bArr, i9, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C9449e.m31461B(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case C9024k.f24770r4:
                if (i10 == 3) {
                    return C9449e.m31488o(m32532u(i11), i3, bArr, i, i2, iVar, bVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: f0 */
    private int m32507f0(int i) {
        if (i < this.f25550e || i > this.f25551f) {
            return -1;
        }
        return m32523p0(i, 0);
    }

    /* renamed from: g0 */
    private int m32508g0(int i, int i2) {
        if (i < this.f25550e || i > this.f25551f) {
            return -1;
        }
        return m32523p0(i, i2);
    }

    /* renamed from: h0 */
    private int m32509h0(int i) {
        return this.f25548c[i + 2];
    }

    /* renamed from: i0 */
    private <E> void m32510i0(Object obj, long j, C9464g1 g1Var, C9467h1<E> h1Var, C9526q qVar) {
        g1Var.mo23554M(this.f25561p.mo23672e(obj, j), h1Var, qVar);
    }

    /* renamed from: j0 */
    private <E> void m32511j0(Object obj, int i, C9464g1 g1Var, C9467h1<E> h1Var, C9526q qVar) {
        g1Var.mo23567g(this.f25561p.mo23672e(obj, m32497U(i)), h1Var, qVar);
    }

    /* renamed from: k */
    private boolean m32512k(T t, T t2, int i) {
        return m32478B(t, i) == m32478B(t2, i);
    }

    /* renamed from: k0 */
    private void m32513k0(Object obj, int i, C9464g1 g1Var) {
        long U;
        Object E;
        if (m32477A(i)) {
            U = m32497U(i);
            E = g1Var.mo23556O();
        } else if (this.f25554i) {
            U = m32497U(i);
            E = g1Var.mo23588z();
        } else {
            U = m32497U(i);
            E = g1Var.mo23546E();
        }
        C9539s1.m32314O(obj, U, E);
    }

    /* renamed from: l */
    private static <T> boolean m32514l(T t, long j) {
        return C9539s1.m32332p(t, j);
    }

    /* renamed from: l0 */
    private void m32515l0(Object obj, int i, C9464g1 g1Var) {
        if (m32477A(i)) {
            g1Var.mo23545D(this.f25561p.mo23672e(obj, m32497U(i)));
        } else {
            g1Var.mo23544C(this.f25561p.mo23672e(obj, m32497U(i)));
        }
    }

    /* renamed from: m */
    private <K, V> int m32516m(byte[] bArr, int i, int i2, C9508l0.C9509a<K, V> aVar, Map<K, V> map, C9449e.C9451b bVar) {
        int I = C9449e.m31468I(bArr, i, bVar);
        int i3 = bVar.f25335a;
        if (i3 < 0 || i3 > i2 - I) {
            throw C9443c0.m31449j();
        }
        throw null;
    }

    /* renamed from: m0 */
    private static Field m32517m0(Class<?> cls, String str) {
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

    /* renamed from: n */
    private static <T> double m32518n(T t, long j) {
        return C9539s1.m32338v(t, j);
    }

    /* renamed from: n0 */
    private void m32519n0(T t, int i) {
        if (!this.f25555j) {
            int h0 = m32509h0(i);
            long j = (long) (h0 & 1048575);
            C9539s1.m32312M(t, j, C9539s1.m32340x(t, j) | (1 << (h0 >>> 20)));
        }
    }

    /* renamed from: o */
    private boolean m32520o(T t, T t2, int i) {
        int r0 = m32527r0(i);
        long U = m32497U(r0);
        switch (m32525q0(r0)) {
            case 0:
                return m32512k(t, t2, i) && Double.doubleToLongBits(C9539s1.m32338v(t, U)) == Double.doubleToLongBits(C9539s1.m32338v(t2, U));
            case 1:
                return m32512k(t, t2, i) && Float.floatToIntBits(C9539s1.m32339w(t, U)) == Float.floatToIntBits(C9539s1.m32339w(t2, U));
            case 2:
                return m32512k(t, t2, i) && C9539s1.m32341y(t, U) == C9539s1.m32341y(t2, U);
            case 3:
                return m32512k(t, t2, i) && C9539s1.m32341y(t, U) == C9539s1.m32341y(t2, U);
            case 4:
                return m32512k(t, t2, i) && C9539s1.m32340x(t, U) == C9539s1.m32340x(t2, U);
            case 5:
                return m32512k(t, t2, i) && C9539s1.m32341y(t, U) == C9539s1.m32341y(t2, U);
            case 6:
                return m32512k(t, t2, i) && C9539s1.m32340x(t, U) == C9539s1.m32340x(t2, U);
            case 7:
                return m32512k(t, t2, i) && C9539s1.m32332p(t, U) == C9539s1.m32332p(t2, U);
            case 8:
                return m32512k(t, t2, i) && C9489j1.m31819K(C9539s1.m32300A(t, U), C9539s1.m32300A(t2, U));
            case 9:
                return m32512k(t, t2, i) && C9489j1.m31819K(C9539s1.m32300A(t, U), C9539s1.m32300A(t2, U));
            case 10:
                return m32512k(t, t2, i) && C9489j1.m31819K(C9539s1.m32300A(t, U), C9539s1.m32300A(t2, U));
            case 11:
                return m32512k(t, t2, i) && C9539s1.m32340x(t, U) == C9539s1.m32340x(t2, U);
            case 12:
                return m32512k(t, t2, i) && C9539s1.m32340x(t, U) == C9539s1.m32340x(t2, U);
            case 13:
                return m32512k(t, t2, i) && C9539s1.m32340x(t, U) == C9539s1.m32340x(t2, U);
            case 14:
                return m32512k(t, t2, i) && C9539s1.m32341y(t, U) == C9539s1.m32341y(t2, U);
            case 15:
                return m32512k(t, t2, i) && C9539s1.m32340x(t, U) == C9539s1.m32340x(t2, U);
            case 16:
                return m32512k(t, t2, i) && C9539s1.m32341y(t, U) == C9539s1.m32341y(t2, U);
            case 17:
                return m32512k(t, t2, i) && C9489j1.m31819K(C9539s1.m32300A(t, U), C9539s1.m32300A(t2, U));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case C9024k.f24704g4:
            case 37:
            case 38:
            case 39:
            case C9024k.f24728k4:
            case C9024k.f24734l4:
            case C9024k.f24740m4:
            case 43:
            case 44:
            case C9024k.f24746n4:
            case C9024k.f24752o4:
            case C9024k.f24758p4:
            case C9024k.f24764q4:
            case C9024k.f24770r4:
            case 50:
                return C9489j1.m31819K(C9539s1.m32300A(t, U), C9539s1.m32300A(t2, U));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /*64*/:
            case 65:
            case 66:
            case 67:
            case 68:
                return m32483G(t, t2, i) && C9489j1.m31819K(C9539s1.m32300A(t, U), C9539s1.m32300A(t2, U));
            default:
                return true;
        }
    }

    /* renamed from: o0 */
    private void m32521o0(T t, int i, int i2) {
        C9539s1.m32312M(t, (long) (m32509h0(i2) & 1048575), i);
    }

    /* renamed from: p */
    private final <UT, UB> UB m32522p(Object obj, int i, UB ub, C9522o1<UT, UB> o1Var) {
        C9431b0.C9436e s;
        int T = m32496T(i);
        Object A = C9539s1.m32300A(obj, m32497U(m32527r0(i)));
        if (A == null || (s = m32528s(i)) == null) {
            return ub;
        }
        return m32524q(i, T, this.f25564s.mo23892d(A), s, ub, o1Var);
    }

    /* renamed from: p0 */
    private int m32523p0(int i, int i2) {
        int length = (this.f25548c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int T = m32496T(i4);
            if (i == T) {
                return i4;
            }
            if (i < T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    private final <K, V, UT, UB> UB m32524q(int i, int i2, Map<K, V> map, C9431b0.C9436e eVar, UB ub, C9522o1<UT, UB> o1Var) {
        C9508l0.C9509a<?, ?> c = this.f25564s.mo23891c(m32530t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo23510a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o1Var.mo23911n();
                }
                C9468i.C9476h B = C9468i.m31666B(C9508l0.m32074b(c, next.getKey(), next.getValue()));
                try {
                    C9508l0.m32075d(B.mo23668b(), c, next.getKey(), next.getValue());
                    o1Var.mo23901d(ub, i2, B.mo23667a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: q0 */
    private static int m32525q0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: r */
    private static <T> float m32526r(T t, long j) {
        return C9539s1.m32339w(t, j);
    }

    /* renamed from: r0 */
    private int m32527r0(int i) {
        return this.f25548c[i + 1];
    }

    /* renamed from: s */
    private C9431b0.C9436e m32528s(int i) {
        return (C9431b0.C9436e) this.f25549d[((i / 3) * 2) + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32529s0(T r18, p174e.p319f.p393c.p394a.p404z.p405a.C9567v1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f25553h
            if (r3 == 0) goto L_0x0021
            e.f.c.a.z.a.r<?> r3 = r0.f25563r
            e.f.c.a.z.a.v r3 = r3.mo23949c(r1)
            boolean r5 = r3.mo24021m()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo24024r()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f25548c
            int r7 = r7.length
            sun.misc.Unsafe r8 = f25547b
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.m32527r0(r10)
            int r13 = r0.m32496T(r10)
            int r14 = m32525q0(r12)
            boolean r15 = r0.f25555j
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f25548c
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            e.f.c.a.z.a.r<?> r9 = r0.f25563r
            int r9 = r9.mo23947a(r5)
            if (r9 > r13) goto L_0x0081
            e.f.c.a.z.a.r<?> r9 = r0.f25563r
            r9.mo23956j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = m32497U(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.f.c.a.z.a.h1 r5 = r0.m32532u(r10)
            r2.mo23849o(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m32502Z(r1, r5)
            r2.mo23825F(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m32501Y(r1, r5)
            r2.mo23833N(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m32502Z(r1, r5)
            r2.mo23860z(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m32501Y(r1, r5)
            r2.mo23855u(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m32501Y(r1, r5)
            r2.mo23829J(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m32501Y(r1, r5)
            r2.mo23836b(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.f.c.a.z.a.i r4 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r4
            r2.mo23822C(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.f.c.a.z.a.h1 r5 = r0.m32532u(r10)
            r2.mo23841g(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m32537w0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = m32498V(r1, r5)
            r2.mo23853s(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m32501Y(r1, r5)
            r2.mo23838d(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m32502Z(r1, r5)
            r2.mo23844j(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m32501Y(r1, r5)
            r2.mo23857w(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m32502Z(r1, r5)
            r2.mo23848n(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m32502Z(r1, r5)
            r2.mo23852r(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = m32500X(r1, r5)
            r2.mo23826G(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.m32484H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = m32499W(r1, r5)
            r2.mo23839e(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m32535v0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            e.f.c.a.z.a.h1 r6 = r0.m32532u(r10)
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31829U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31838b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31836a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31834Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31833Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31825Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31842d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31822N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31826R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31827S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31830V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31844e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31831W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31828T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31824P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31838b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31836a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31834Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31833Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31825Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31842d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31823O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            e.f.c.a.z.a.h1 r6 = r0.m32532u(r10)
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31832X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31840c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31822N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31826R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31827S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31830V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31844e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31831W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31828T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.m32496T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31824P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.f.c.a.z.a.h1 r5 = r0.m32532u(r10)
            r2.mo23849o(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo23825F(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo23833N(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo23860z(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo23855u(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo23829J(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo23836b(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.f.c.a.z.a.i r4 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r4
            r2.mo23822C(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.f.c.a.z.a.h1 r5 = r0.m32532u(r10)
            r2.mo23841g(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m32537w0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = m32514l(r1, r5)
            r2.mo23853s(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo23838d(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo23844j(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo23857w(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo23848n(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo23852r(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = m32526r(r1, r5)
            r2.mo23826G(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = m32518n(r1, r5)
            r2.mo23839e(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            e.f.c.a.z.a.r<?> r4 = r0.f25563r
            r4.mo23956j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            e.f.c.a.z.a.o1<?, ?> r3 = r0.f25562q
            r0.m32539x0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32529s0(java.lang.Object, e.f.c.a.z.a.v1):void");
    }

    /* renamed from: t */
    private Object m32530t(int i) {
        return this.f25549d[(i / 3) * 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d0, code lost:
        r14.mo23849o(r7, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, m32497U(r6)), m32532u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ef, code lost:
        r14.mo23825F(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0402, code lost:
        r14.mo23833N(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0415, code lost:
        r14.mo23860z(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0428, code lost:
        r14.mo23855u(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x043b, code lost:
        r14.mo23829J(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x044e, code lost:
        r14.mo23836b(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0459, code lost:
        r14.mo23822C(r7, (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, m32497U(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046e, code lost:
        r14.mo23841g(r7, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, m32497U(r6)), m32532u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0485, code lost:
        m32537w0(r7, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, m32497U(r6)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a0, code lost:
        r14.mo23853s(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b3, code lost:
        r14.mo23838d(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c5, code lost:
        r14.mo23844j(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r14.mo23857w(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04e9, code lost:
        r14.mo23848n(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04fb, code lost:
        r14.mo23852r(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x050d, code lost:
        r14.mo23826G(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051f, code lost:
        r14.mo23839e(r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32531t0(T r13, p174e.p319f.p393c.p394a.p404z.p405a.C9567v1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f25553h
            r1 = 0
            if (r0 == 0) goto L_0x001c
            e.f.c.a.z.a.r<?> r0 = r12.f25563r
            e.f.c.a.z.a.v r0 = r0.mo23949c(r13)
            boolean r2 = r0.mo24021m()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo24024r()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f25548c
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0526
            int r6 = r12.m32527r0(r5)
            int r7 = r12.m32496T(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            e.f.c.a.z.a.r<?> r8 = r12.f25563r
            int r8 = r8.mo23947a(r2)
            if (r8 > r7) goto L_0x004b
            e.f.c.a.z.a.r<?> r8 = r12.f25563r
            r8.mo23956j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m32525q0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0511;
                case 1: goto L_0x04ff;
                case 2: goto L_0x04ed;
                case 3: goto L_0x04db;
                case 4: goto L_0x04c9;
                case 5: goto L_0x04b7;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0492;
                case 8: goto L_0x047f;
                case 9: goto L_0x0468;
                case 10: goto L_0x0453;
                case 11: goto L_0x0440;
                case 12: goto L_0x042d;
                case 13: goto L_0x041a;
                case 14: goto L_0x0407;
                case 15: goto L_0x03f4;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03ca;
                case 18: goto L_0x03b7;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0391;
                case 21: goto L_0x037e;
                case 22: goto L_0x036b;
                case 23: goto L_0x0358;
                case 24: goto L_0x0345;
                case 25: goto L_0x0332;
                case 26: goto L_0x031f;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e2;
                case 30: goto L_0x02cf;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02a9;
                case 33: goto L_0x0296;
                case 34: goto L_0x0283;
                case 35: goto L_0x0270;
                case 36: goto L_0x025d;
                case 37: goto L_0x024a;
                case 38: goto L_0x0237;
                case 39: goto L_0x0224;
                case 40: goto L_0x0211;
                case 41: goto L_0x01fe;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01d8;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01b2;
                case 46: goto L_0x019f;
                case 47: goto L_0x018c;
                case 48: goto L_0x0179;
                case 49: goto L_0x0162;
                case 50: goto L_0x0155;
                case 51: goto L_0x0145;
                case 52: goto L_0x0135;
                case 53: goto L_0x0125;
                case 54: goto L_0x0115;
                case 55: goto L_0x0105;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00e5;
                case 58: goto L_0x00d5;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00bd;
                case 62: goto L_0x00ad;
                case 63: goto L_0x009d;
                case 64: goto L_0x008d;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0522
        L_0x0055:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x03d0
        L_0x005d:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32502Z(r13, r8)
            goto L_0x03ef
        L_0x006d:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32501Y(r13, r8)
            goto L_0x0402
        L_0x007d:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32502Z(r13, r8)
            goto L_0x0415
        L_0x008d:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32501Y(r13, r8)
            goto L_0x0428
        L_0x009d:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32501Y(r13, r8)
            goto L_0x043b
        L_0x00ad:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32501Y(r13, r8)
            goto L_0x044e
        L_0x00bd:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0459
        L_0x00c5:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x046e
        L_0x00cd:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0485
        L_0x00d5:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            boolean r6 = m32498V(r13, r8)
            goto L_0x04a0
        L_0x00e5:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32501Y(r13, r8)
            goto L_0x04b3
        L_0x00f5:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32502Z(r13, r8)
            goto L_0x04c5
        L_0x0105:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32501Y(r13, r8)
            goto L_0x04d7
        L_0x0115:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32502Z(r13, r8)
            goto L_0x04e9
        L_0x0125:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32502Z(r13, r8)
            goto L_0x04fb
        L_0x0135:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            float r6 = m32500X(r13, r8)
            goto L_0x050d
        L_0x0145:
            boolean r8 = r12.m32484H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            double r8 = m32499W(r13, r8)
            goto L_0x051f
        L_0x0155:
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            r12.m32535v0(r14, r7, r6, r5)
            goto L_0x0522
        L_0x0162:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            e.f.c.a.z.a.h1 r8 = r12.m32532u(r5)
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31829U(r7, r6, r14, r8)
            goto L_0x0522
        L_0x0179:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31838b0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x018c:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31836a0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x019f:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31834Z(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01b2:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31833Y(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01c5:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31825Q(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01d8:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31842d0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01eb:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31822N(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01fe:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31826R(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0211:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31827S(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0224:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31830V(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0237:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31844e0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x024a:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31831W(r7, r6, r14, r9)
            goto L_0x0522
        L_0x025d:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31828T(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0270:
            int r7 = r12.m32496T(r5)
            long r10 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31824P(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0283:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31838b0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0296:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31836a0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02a9:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31834Z(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02bc:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31833Y(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02cf:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31825Q(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02e2:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31842d0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02f5:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31823O(r7, r6, r14)
            goto L_0x0522
        L_0x0308:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            e.f.c.a.z.a.h1 r8 = r12.m32532u(r5)
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31832X(r7, r6, r14, r8)
            goto L_0x0522
        L_0x031f:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31840c0(r7, r6, r14)
            goto L_0x0522
        L_0x0332:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31822N(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0345:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31826R(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0358:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31827S(r7, r6, r14, r4)
            goto L_0x0522
        L_0x036b:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31830V(r7, r6, r14, r4)
            goto L_0x0522
        L_0x037e:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31844e0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0391:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31831W(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03a4:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31828T(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03b7:
            int r7 = r12.m32496T(r5)
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31824P(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03ca:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x03d0:
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            e.f.c.a.z.a.h1 r8 = r12.m32532u(r5)
            r14.mo23849o(r7, r6, r8)
            goto L_0x0522
        L_0x03e1:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32487K(r13, r8)
        L_0x03ef:
            r14.mo23825F(r7, r8)
            goto L_0x0522
        L_0x03f4:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32541z(r13, r8)
        L_0x0402:
            r14.mo23833N(r7, r6)
            goto L_0x0522
        L_0x0407:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32487K(r13, r8)
        L_0x0415:
            r14.mo23860z(r7, r8)
            goto L_0x0522
        L_0x041a:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32541z(r13, r8)
        L_0x0428:
            r14.mo23855u(r7, r6)
            goto L_0x0522
        L_0x042d:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32541z(r13, r8)
        L_0x043b:
            r14.mo23829J(r7, r6)
            goto L_0x0522
        L_0x0440:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32541z(r13, r8)
        L_0x044e:
            r14.mo23836b(r7, r6)
            goto L_0x0522
        L_0x0453:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0459:
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            e.f.c.a.z.a.i r6 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r6
            r14.mo23822C(r7, r6)
            goto L_0x0522
        L_0x0468:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x046e:
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            e.f.c.a.z.a.h1 r8 = r12.m32532u(r5)
            r14.mo23841g(r7, r6, r8)
            goto L_0x0522
        L_0x047f:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0485:
            long r8 = m32497U(r6)
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r13, r8)
            r12.m32537w0(r7, r6, r14)
            goto L_0x0522
        L_0x0492:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            boolean r6 = m32514l(r13, r8)
        L_0x04a0:
            r14.mo23853s(r7, r6)
            goto L_0x0522
        L_0x04a5:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32541z(r13, r8)
        L_0x04b3:
            r14.mo23838d(r7, r6)
            goto L_0x0522
        L_0x04b7:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32487K(r13, r8)
        L_0x04c5:
            r14.mo23844j(r7, r8)
            goto L_0x0522
        L_0x04c9:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            int r6 = m32541z(r13, r8)
        L_0x04d7:
            r14.mo23857w(r7, r6)
            goto L_0x0522
        L_0x04db:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32487K(r13, r8)
        L_0x04e9:
            r14.mo23848n(r7, r8)
            goto L_0x0522
        L_0x04ed:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            long r8 = m32487K(r13, r8)
        L_0x04fb:
            r14.mo23852r(r7, r8)
            goto L_0x0522
        L_0x04ff:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            float r6 = m32526r(r13, r8)
        L_0x050d:
            r14.mo23826G(r7, r6)
            goto L_0x0522
        L_0x0511:
            boolean r8 = r12.m32478B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = m32497U(r6)
            double r8 = m32518n(r13, r8)
        L_0x051f:
            r14.mo23839e(r7, r8)
        L_0x0522:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0526:
            if (r2 == 0) goto L_0x053c
            e.f.c.a.z.a.r<?> r3 = r12.f25563r
            r3.mo23956j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x053a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0526
        L_0x053a:
            r2 = r1
            goto L_0x0526
        L_0x053c:
            e.f.c.a.z.a.o1<?, ?> r0 = r12.f25562q
            r12.m32539x0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32531t0(java.lang.Object, e.f.c.a.z.a.v1):void");
    }

    /* renamed from: u */
    private C9467h1 m32532u(int i) {
        int i2 = (i / 3) * 2;
        C9467h1 h1Var = (C9467h1) this.f25549d[i2];
        if (h1Var != null) {
            return h1Var;
        }
        C9467h1 d = C9448d1.m31455a().mo23522d((Class) this.f25549d[i2 + 1]);
        this.f25549d[i2] = d;
        return d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d6, code lost:
        r12.mo23849o(r5, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, m32497U(r4)), m32532u(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f5, code lost:
        r12.mo23825F(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0408, code lost:
        r12.mo23833N(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041b, code lost:
        r12.mo23860z(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x042e, code lost:
        r12.mo23855u(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0441, code lost:
        r12.mo23829J(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0454, code lost:
        r12.mo23836b(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045f, code lost:
        r12.mo23822C(r5, (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, m32497U(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0474, code lost:
        r12.mo23841g(r5, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, m32497U(r4)), m32532u(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x048b, code lost:
        m32537w0(r5, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, m32497U(r4)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a6, code lost:
        r12.mo23853s(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b9, code lost:
        r12.mo23838d(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cb, code lost:
        r12.mo23844j(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04dd, code lost:
        r12.mo23857w(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ef, code lost:
        r12.mo23848n(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0501, code lost:
        r12.mo23852r(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0513, code lost:
        r12.mo23826G(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0525, code lost:
        r12.mo23839e(r5, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32533u0(T r11, p174e.p319f.p393c.p394a.p404z.p405a.C9567v1 r12) {
        /*
            r10 = this;
            e.f.c.a.z.a.o1<?, ?> r0 = r10.f25562q
            r10.m32539x0(r0, r11, r12)
            boolean r0 = r10.f25553h
            r1 = 0
            if (r0 == 0) goto L_0x0021
            e.f.c.a.z.a.r<?> r0 = r10.f25563r
            e.f.c.a.z.a.v r0 = r0.mo23949c(r11)
            boolean r2 = r0.mo24021m()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo24016g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f25548c
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x052c
            int r4 = r10.m32527r0(r3)
            int r5 = r10.m32496T(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            e.f.c.a.z.a.r<?> r6 = r10.f25563r
            int r6 = r6.mo23947a(r2)
            if (r6 <= r5) goto L_0x0050
            e.f.c.a.z.a.r<?> r6 = r10.f25563r
            r6.mo23956j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m32525q0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cf;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04ab;
                case 7: goto L_0x0498;
                case 8: goto L_0x0485;
                case 9: goto L_0x046e;
                case 10: goto L_0x0459;
                case 11: goto L_0x0446;
                case 12: goto L_0x0433;
                case 13: goto L_0x0420;
                case 14: goto L_0x040d;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03bd;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0397;
                case 21: goto L_0x0384;
                case 22: goto L_0x0371;
                case 23: goto L_0x035e;
                case 24: goto L_0x034b;
                case 25: goto L_0x0338;
                case 26: goto L_0x0325;
                case 27: goto L_0x030e;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02e8;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c2;
                case 32: goto L_0x02af;
                case 33: goto L_0x029c;
                case 34: goto L_0x0289;
                case 35: goto L_0x0276;
                case 36: goto L_0x0263;
                case 37: goto L_0x0250;
                case 38: goto L_0x023d;
                case 39: goto L_0x022a;
                case 40: goto L_0x0217;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cb;
                case 45: goto L_0x01b8;
                case 46: goto L_0x01a5;
                case 47: goto L_0x0192;
                case 48: goto L_0x017f;
                case 49: goto L_0x0168;
                case 50: goto L_0x015b;
                case 51: goto L_0x014b;
                case 52: goto L_0x013b;
                case 53: goto L_0x012b;
                case 54: goto L_0x011b;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fb;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00db;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00cb;
                case 61: goto L_0x00c3;
                case 62: goto L_0x00b3;
                case 63: goto L_0x00a3;
                case 64: goto L_0x0093;
                case 65: goto L_0x0083;
                case 66: goto L_0x0073;
                case 67: goto L_0x0063;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0528
        L_0x005b:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x03d6
        L_0x0063:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32502Z(r11, r6)
            goto L_0x03f5
        L_0x0073:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32501Y(r11, r6)
            goto L_0x0408
        L_0x0083:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32502Z(r11, r6)
            goto L_0x041b
        L_0x0093:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32501Y(r11, r6)
            goto L_0x042e
        L_0x00a3:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32501Y(r11, r6)
            goto L_0x0441
        L_0x00b3:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32501Y(r11, r6)
            goto L_0x0454
        L_0x00c3:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x045f
        L_0x00cb:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x0474
        L_0x00d3:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x048b
        L_0x00db:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            boolean r4 = m32498V(r11, r6)
            goto L_0x04a6
        L_0x00eb:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32501Y(r11, r6)
            goto L_0x04b9
        L_0x00fb:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32502Z(r11, r6)
            goto L_0x04cb
        L_0x010b:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32501Y(r11, r6)
            goto L_0x04dd
        L_0x011b:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32502Z(r11, r6)
            goto L_0x04ef
        L_0x012b:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32502Z(r11, r6)
            goto L_0x0501
        L_0x013b:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            float r4 = m32500X(r11, r6)
            goto L_0x0513
        L_0x014b:
            boolean r6 = r10.m32484H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            double r6 = m32499W(r11, r6)
            goto L_0x0525
        L_0x015b:
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            r10.m32535v0(r12, r5, r4, r3)
            goto L_0x0528
        L_0x0168:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            e.f.c.a.z.a.h1 r6 = r10.m32532u(r3)
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31829U(r5, r4, r12, r6)
            goto L_0x0528
        L_0x017f:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31838b0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0192:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31836a0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01a5:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31834Z(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01b8:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31833Y(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01cb:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31825Q(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01de:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31842d0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01f1:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31822N(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0204:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31826R(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0217:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31827S(r5, r4, r12, r7)
            goto L_0x0528
        L_0x022a:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31830V(r5, r4, r12, r7)
            goto L_0x0528
        L_0x023d:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31844e0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0250:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31831W(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0263:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31828T(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0276:
            int r5 = r10.m32496T(r3)
            long r8 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31824P(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0289:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31838b0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x029c:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31836a0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02af:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31834Z(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02c2:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31833Y(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02d5:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31825Q(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02e8:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31842d0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02fb:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31823O(r5, r4, r12)
            goto L_0x0528
        L_0x030e:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            e.f.c.a.z.a.h1 r6 = r10.m32532u(r3)
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31832X(r5, r4, r12, r6)
            goto L_0x0528
        L_0x0325:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31840c0(r5, r4, r12)
            goto L_0x0528
        L_0x0338:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31822N(r5, r4, r12, r8)
            goto L_0x0528
        L_0x034b:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31826R(r5, r4, r12, r8)
            goto L_0x0528
        L_0x035e:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31827S(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0371:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31830V(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0384:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31844e0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0397:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31831W(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03aa:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31828T(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03bd:
            int r5 = r10.m32496T(r3)
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31824P(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03d0:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x03d6:
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            e.f.c.a.z.a.h1 r6 = r10.m32532u(r3)
            r12.mo23849o(r5, r4, r6)
            goto L_0x0528
        L_0x03e7:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32487K(r11, r6)
        L_0x03f5:
            r12.mo23825F(r5, r6)
            goto L_0x0528
        L_0x03fa:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32541z(r11, r6)
        L_0x0408:
            r12.mo23833N(r5, r4)
            goto L_0x0528
        L_0x040d:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32487K(r11, r6)
        L_0x041b:
            r12.mo23860z(r5, r6)
            goto L_0x0528
        L_0x0420:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32541z(r11, r6)
        L_0x042e:
            r12.mo23855u(r5, r4)
            goto L_0x0528
        L_0x0433:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32541z(r11, r6)
        L_0x0441:
            r12.mo23829J(r5, r4)
            goto L_0x0528
        L_0x0446:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32541z(r11, r6)
        L_0x0454:
            r12.mo23836b(r5, r4)
            goto L_0x0528
        L_0x0459:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x045f:
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            e.f.c.a.z.a.i r4 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r4
            r12.mo23822C(r5, r4)
            goto L_0x0528
        L_0x046e:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x0474:
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            e.f.c.a.z.a.h1 r6 = r10.m32532u(r3)
            r12.mo23841g(r5, r4, r6)
            goto L_0x0528
        L_0x0485:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x048b:
            long r6 = m32497U(r4)
            java.lang.Object r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r11, r6)
            r10.m32537w0(r5, r4, r12)
            goto L_0x0528
        L_0x0498:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            boolean r4 = m32514l(r11, r6)
        L_0x04a6:
            r12.mo23853s(r5, r4)
            goto L_0x0528
        L_0x04ab:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32541z(r11, r6)
        L_0x04b9:
            r12.mo23838d(r5, r4)
            goto L_0x0528
        L_0x04bd:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32487K(r11, r6)
        L_0x04cb:
            r12.mo23844j(r5, r6)
            goto L_0x0528
        L_0x04cf:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            int r4 = m32541z(r11, r6)
        L_0x04dd:
            r12.mo23857w(r5, r4)
            goto L_0x0528
        L_0x04e1:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32487K(r11, r6)
        L_0x04ef:
            r12.mo23848n(r5, r6)
            goto L_0x0528
        L_0x04f3:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            long r6 = m32487K(r11, r6)
        L_0x0501:
            r12.mo23852r(r5, r6)
            goto L_0x0528
        L_0x0505:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            float r4 = m32526r(r11, r6)
        L_0x0513:
            r12.mo23826G(r5, r4)
            goto L_0x0528
        L_0x0517:
            boolean r6 = r10.m32478B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = m32497U(r4)
            double r6 = m32518n(r11, r6)
        L_0x0525:
            r12.mo23839e(r5, r6)
        L_0x0528:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x052c:
            if (r2 == 0) goto L_0x0543
            e.f.c.a.z.a.r<?> r11 = r10.f25563r
            r11.mo23956j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0541
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x052c
        L_0x0541:
            r2 = r1
            goto L_0x052c
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32533u0(java.lang.Object, e.f.c.a.z.a.v1):void");
    }

    /* renamed from: v */
    static C9525p1 m32534v(Object obj) {
        C9577z zVar = (C9577z) obj;
        C9525p1 p1Var = zVar.unknownFields;
        if (p1Var != C9525p1.m32204e()) {
            return p1Var;
        }
        C9525p1 l = C9525p1.m32208l();
        zVar.unknownFields = l;
        return l;
    }

    /* renamed from: v0 */
    private <K, V> void m32535v0(C9567v1 v1Var, int i, Object obj, int i2) {
        if (obj != null) {
            v1Var.mo23843i(i, this.f25564s.mo23891c(m32530t(i2)), this.f25564s.mo23896h(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e0, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f2, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0203, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0214, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0225, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0236, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0247, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0258, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x025a, code lost:
        r2.putInt(r1, (long) r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025e, code lost:
        r4 = (p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31975U(r9) + p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31977W(r3)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030f, code lost:
        if ((r7 & r14) != 0) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0311, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32000s(r9, (p174e.p319f.p393c.p394a.p404z.p405a.C9537s0) r2.getObject(r1, r12), m32532u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0328, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31971Q(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0335, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31969O(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x033c, code lost:
        if ((r7 & r14) != 0) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033e, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31967M(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0345, code lost:
        if ((r7 & r14) != 0) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0347, code lost:
        r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31965K(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034c, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0356, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31992k(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0363, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31976V(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036a, code lost:
        if ((r7 & r14) != 0) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x036c, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31988g(r9, (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r2.getObject(r1, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0379, code lost:
        if ((r7 & r14) != 0) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x037b, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31854o(r9, r2.getObject(r1, r12), m32532u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a6, code lost:
        if ((r7 & r14) != 0) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a8, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31983d(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0403, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (m32484H(r1, r9, r5) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (m32484H(r1, r9, r5) != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (m32484H(r1, r9, r5) != false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (m32484H(r1, r9, r5) != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b9, code lost:
        if (m32484H(r1, r9, r5) != false) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        if (m32484H(r1, r9, r5) != false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0174, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0186, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0198, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01aa, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bc, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ce, code lost:
        if (r0.f25556k != false) goto L_0x025a;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m32536w(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = f25547b
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f25548c
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0409
            int r8 = r0.m32527r0(r5)
            int r9 = r0.m32496T(r5)
            int r10 = m32525q0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f25548c
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f25556k
            if (r11 == 0) goto L_0x0055
            e.f.c.a.z.a.w r11 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.DOUBLE_LIST_PACKED
            int r11 = r11.mo24035e()
            if (r10 < r11) goto L_0x0055
            e.f.c.a.z.a.w r11 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.SINT64_LIST_PACKED
            int r11 = r11.mo24035e()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.f25548c
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = m32497U(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x03f7;
                case 1: goto L_0x03ed;
                case 2: goto L_0x03df;
                case 3: goto L_0x03d1;
                case 4: goto L_0x03c3;
                case 5: goto L_0x03b9;
                case 6: goto L_0x03af;
                case 7: goto L_0x03a4;
                case 8: goto L_0x0388;
                case 9: goto L_0x0377;
                case 10: goto L_0x0368;
                case 11: goto L_0x035b;
                case 12: goto L_0x034e;
                case 13: goto L_0x0343;
                case 14: goto L_0x033a;
                case 15: goto L_0x032d;
                case 16: goto L_0x0320;
                case 17: goto L_0x030d;
                case 18: goto L_0x02fe;
                case 19: goto L_0x02f2;
                case 20: goto L_0x02e6;
                case 21: goto L_0x02da;
                case 22: goto L_0x02ce;
                case 23: goto L_0x02fe;
                case 24: goto L_0x02f2;
                case 25: goto L_0x02c2;
                case 26: goto L_0x02b7;
                case 27: goto L_0x02a8;
                case 28: goto L_0x029d;
                case 29: goto L_0x0291;
                case 30: goto L_0x0284;
                case 31: goto L_0x02f2;
                case 32: goto L_0x02fe;
                case 33: goto L_0x0277;
                case 34: goto L_0x026a;
                case 35: goto L_0x024a;
                case 36: goto L_0x0239;
                case 37: goto L_0x0228;
                case 38: goto L_0x0217;
                case 39: goto L_0x0206;
                case 40: goto L_0x01f5;
                case 41: goto L_0x01e4;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c0;
                case 44: goto L_0x01ae;
                case 45: goto L_0x019c;
                case 46: goto L_0x018a;
                case 47: goto L_0x0178;
                case 48: goto L_0x0166;
                case 49: goto L_0x0156;
                case 50: goto L_0x0146;
                case 51: goto L_0x0138;
                case 52: goto L_0x012c;
                case 53: goto L_0x011c;
                case 54: goto L_0x010c;
                case 55: goto L_0x00fc;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e3;
                case 58: goto L_0x00db;
                case 59: goto L_0x00bd;
                case 60: goto L_0x00b5;
                case 61: goto L_0x00ad;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0095;
                case 64: goto L_0x008d;
                case 65: goto L_0x0085;
                case 66: goto L_0x0079;
                case 67: goto L_0x006d;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x030a
        L_0x0065:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x0311
        L_0x006d:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = m32502Z(r1, r12)
            goto L_0x0328
        L_0x0079:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = m32501Y(r1, r12)
            goto L_0x0335
        L_0x0085:
            boolean r8 = r0.m32484H(r1, r9, r5)
            if (r8 == 0) goto L_0x030a
            goto L_0x033e
        L_0x008d:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x0347
        L_0x0095:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = m32501Y(r1, r12)
            goto L_0x0356
        L_0x00a1:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = m32501Y(r1, r12)
            goto L_0x0363
        L_0x00ad:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x036c
        L_0x00b5:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x037b
        L_0x00bd:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9468i
            if (r4 == 0) goto L_0x00d3
            e.f.c.a.z.a.i r3 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31988g(r9, r3)
            goto L_0x0309
        L_0x00d3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31973S(r9, r3)
            goto L_0x0309
        L_0x00db:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x03a8
        L_0x00e3:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            r3 = 0
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31994m(r9, r3)
            goto L_0x034c
        L_0x00f0:
            boolean r8 = r0.m32484H(r1, r9, r5)
            if (r8 == 0) goto L_0x030a
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31996o(r9, r3)
            goto L_0x0309
        L_0x00fc:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = m32501Y(r1, r12)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32003v(r9, r3)
            goto L_0x0309
        L_0x010c:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = m32502Z(r1, r12)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31978X(r9, r3)
            goto L_0x0309
        L_0x011c:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = m32502Z(r1, r12)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32005x(r9, r3)
            goto L_0x0309
        L_0x012c:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31998q(r9, r8)
            goto L_0x0309
        L_0x0138:
            boolean r3 = r0.m32484H(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            r3 = 0
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31990i(r9, r3)
            goto L_0x0309
        L_0x0146:
            e.f.c.a.z.a.n0 r3 = r0.f25564s
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.m32530t(r5)
            int r3 = r3.mo23894f(r9, r4, r8)
            goto L_0x0309
        L_0x0156:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            e.f.c.a.z.a.h1 r4 = r0.m32532u(r5)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31849j(r9, r3, r4)
            goto L_0x0309
        L_0x0166:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31859t(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0178:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31857r(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x018a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31848i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x019c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31846g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01ae:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31843e(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31862w(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01d2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31837b(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31846g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31848i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0206:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31851l(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0217:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31864y(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0228:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31853n(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0239:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31846g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x024a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31848i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f25556k
            if (r4 == 0) goto L_0x025e
        L_0x025a:
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x025e:
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31975U(r9)
            int r8 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31977W(r3)
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x034c
        L_0x026a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31858s(r9, r3, r4)
            goto L_0x0309
        L_0x0277:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31856q(r9, r3, r4)
            goto L_0x0309
        L_0x0284:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31841d(r9, r3, r4)
            goto L_0x0309
        L_0x0291:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31861v(r9, r3, r4)
            goto L_0x0309
        L_0x029d:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31839c(r9, r3)
            goto L_0x0309
        L_0x02a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            e.f.c.a.z.a.h1 r4 = r0.m32532u(r5)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31855p(r9, r3, r4)
            goto L_0x0309
        L_0x02b7:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31860u(r9, r3)
            goto L_0x0309
        L_0x02c2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31835a(r9, r3, r4)
            goto L_0x0309
        L_0x02ce:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31850k(r9, r3, r4)
            goto L_0x0309
        L_0x02da:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31863x(r9, r3, r4)
            goto L_0x0309
        L_0x02e6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31852m(r9, r3, r4)
            goto L_0x0309
        L_0x02f2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31845f(r9, r3, r4)
            goto L_0x0309
        L_0x02fe:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31847h(r9, r3, r4)
        L_0x0309:
            int r6 = r6 + r3
        L_0x030a:
            r10 = 0
            goto L_0x0403
        L_0x030d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.f.c.a.z.a.s0 r3 = (p174e.p319f.p393c.p394a.p404z.p405a.C9537s0) r3
            e.f.c.a.z.a.h1 r4 = r0.m32532u(r5)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32000s(r9, r3, r4)
            goto L_0x0309
        L_0x0320:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            long r3 = r2.getLong(r1, r12)
        L_0x0328:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31971Q(r9, r3)
            goto L_0x0309
        L_0x032d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0335:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31969O(r9, r3)
            goto L_0x0309
        L_0x033a:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x030a
        L_0x033e:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31967M(r9, r3)
            goto L_0x0309
        L_0x0343:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x0347:
            r3 = 0
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31965K(r9, r3)
        L_0x034c:
            int r6 = r6 + r4
            goto L_0x030a
        L_0x034e:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0356:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31992k(r9, r3)
            goto L_0x0309
        L_0x035b:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0363:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31976V(r9, r3)
            goto L_0x0309
        L_0x0368:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x036c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.f.c.a.z.a.i r3 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31988g(r9, r3)
            goto L_0x0309
        L_0x0377:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x037b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.f.c.a.z.a.h1 r4 = r0.m32532u(r5)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31854o(r9, r3, r4)
            goto L_0x0309
        L_0x0388:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9468i
            if (r4 == 0) goto L_0x039c
            e.f.c.a.z.a.i r3 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31988g(r9, r3)
            goto L_0x0309
        L_0x039c:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31973S(r9, r3)
            goto L_0x0309
        L_0x03a4:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x03a8:
            r3 = 1
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31983d(r9, r3)
            goto L_0x0309
        L_0x03af:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            r10 = 0
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31994m(r9, r10)
            goto L_0x0402
        L_0x03b9:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0403
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31996o(r9, r3)
            goto L_0x0402
        L_0x03c3:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            int r3 = r2.getInt(r1, r12)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32003v(r9, r3)
            goto L_0x0402
        L_0x03d1:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            long r3 = r2.getLong(r1, r12)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31978X(r9, r3)
            goto L_0x0402
        L_0x03df:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            long r3 = r2.getLong(r1, r12)
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32005x(r9, r3)
            goto L_0x0402
        L_0x03ed:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31998q(r9, r8)
            goto L_0x0402
        L_0x03f7:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            r3 = 0
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31990i(r9, r3)
        L_0x0402:
            int r6 = r6 + r3
        L_0x0403:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x0409:
            e.f.c.a.z.a.o1<?, ?> r2 = r0.f25562q
            int r2 = r0.m32540y(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f25553h
            if (r2 == 0) goto L_0x041f
            e.f.c.a.z.a.r<?> r2 = r0.f25563r
            e.f.c.a.z.a.v r1 = r2.mo23949c(r1)
            int r1 = r1.mo24020l()
            int r6 = r6 + r1
        L_0x041f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32536w(java.lang.Object):int");
    }

    /* renamed from: w0 */
    private void m32537w0(int i, Object obj, C9567v1 v1Var) {
        if (obj instanceof String) {
            v1Var.mo23847m(i, (String) obj);
        } else {
            v1Var.mo23822C(i, (C9468i) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ec, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fd, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020e, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0210, code lost:
        r2.putInt(r1, (long) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        r6 = (p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31975U(r8) + p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31977W(r7)) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0299, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a2, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32000s(r8, (p174e.p319f.p393c.p394a.p404z.p405a.C9537s0) p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9), m32532u(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bb, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31971Q(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ca, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31969O(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d5, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31967M(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e0, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31965K(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ef, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31992k(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fe, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31976V(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0309, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030d, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31988g(r8, (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031a, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31854o(r8, p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9), m32532u(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        if ((r6 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9468i) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x033e, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31983d(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034a, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31994m(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0356, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31996o(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0366, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32003v(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0376, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31978X(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0386, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32005x(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0392, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31998q(r8, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x039e, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31990i(r8, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a6, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if ((r6 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9468i) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31973S(r8, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0172, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0184, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b9, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        if (r0.f25556k != false) goto L_0x0210;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m32538x(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f25547b
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f25548c
            int r6 = r6.length
            if (r4 >= r6) goto L_0x03aa
            int r6 = r15.m32527r0(r4)
            int r7 = m32525q0(r6)
            int r8 = r15.m32496T(r4)
            long r9 = m32497U(r6)
            e.f.c.a.z.a.w r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.DOUBLE_LIST_PACKED
            int r6 = r6.mo24035e()
            if (r7 < r6) goto L_0x0038
            e.f.c.a.z.a.w r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.SINT64_LIST_PACKED
            int r6 = r6.mo24035e()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f25548c
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x0398;
                case 1: goto L_0x038c;
                case 2: goto L_0x037c;
                case 3: goto L_0x036c;
                case 4: goto L_0x035c;
                case 5: goto L_0x0350;
                case 6: goto L_0x0344;
                case 7: goto L_0x0338;
                case 8: goto L_0x0328;
                case 9: goto L_0x0314;
                case 10: goto L_0x0303;
                case 11: goto L_0x02f4;
                case 12: goto L_0x02e5;
                case 13: goto L_0x02da;
                case 14: goto L_0x02cf;
                case 15: goto L_0x02c0;
                case 16: goto L_0x02b1;
                case 17: goto L_0x029c;
                case 18: goto L_0x0291;
                case 19: goto L_0x0288;
                case 20: goto L_0x027f;
                case 21: goto L_0x0276;
                case 22: goto L_0x026d;
                case 23: goto L_0x0291;
                case 24: goto L_0x0288;
                case 25: goto L_0x0264;
                case 26: goto L_0x025b;
                case 27: goto L_0x024e;
                case 28: goto L_0x0245;
                case 29: goto L_0x023c;
                case 30: goto L_0x0233;
                case 31: goto L_0x0288;
                case 32: goto L_0x0291;
                case 33: goto L_0x022a;
                case 34: goto L_0x0220;
                case 35: goto L_0x0200;
                case 36: goto L_0x01ef;
                case 37: goto L_0x01de;
                case 38: goto L_0x01cd;
                case 39: goto L_0x01bc;
                case 40: goto L_0x01ab;
                case 41: goto L_0x019a;
                case 42: goto L_0x0188;
                case 43: goto L_0x0176;
                case 44: goto L_0x0164;
                case 45: goto L_0x0152;
                case 46: goto L_0x0140;
                case 47: goto L_0x012e;
                case 48: goto L_0x011c;
                case 49: goto L_0x010e;
                case 50: goto L_0x00fe;
                case 51: goto L_0x00f6;
                case 52: goto L_0x00ee;
                case 53: goto L_0x00e2;
                case 54: goto L_0x00d6;
                case 55: goto L_0x00ca;
                case 56: goto L_0x00c2;
                case 57: goto L_0x00ba;
                case 58: goto L_0x00b2;
                case 59: goto L_0x009a;
                case 60: goto L_0x0092;
                case 61: goto L_0x008a;
                case 62: goto L_0x007e;
                case 63: goto L_0x0072;
                case 64: goto L_0x006a;
                case 65: goto L_0x0062;
                case 66: goto L_0x0056;
                case 67: goto L_0x004a;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03a6
        L_0x0042:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02a2
        L_0x004a:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = m32502Z(r1, r9)
            goto L_0x02bb
        L_0x0056:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = m32501Y(r1, r9)
            goto L_0x02ca
        L_0x0062:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02d5
        L_0x006a:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02e0
        L_0x0072:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = m32501Y(r1, r9)
            goto L_0x02ef
        L_0x007e:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = m32501Y(r1, r9)
            goto L_0x02fe
        L_0x008a:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0309
        L_0x0092:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x031a
        L_0x009a:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9)
            boolean r7 = r6 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9468i
            if (r7 == 0) goto L_0x00aa
        L_0x00a8:
            goto L_0x030d
        L_0x00aa:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31973S(r8, r6)
            goto L_0x0299
        L_0x00b2:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x033e
        L_0x00ba:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x034a
        L_0x00c2:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0356
        L_0x00ca:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = m32501Y(r1, r9)
            goto L_0x0366
        L_0x00d6:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = m32502Z(r1, r9)
            goto L_0x0376
        L_0x00e2:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = m32502Z(r1, r9)
            goto L_0x0386
        L_0x00ee:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0392
        L_0x00f6:
            boolean r6 = r15.m32484H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x039e
        L_0x00fe:
            e.f.c.a.z.a.n0 r6 = r0.f25564s
            java.lang.Object r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9)
            java.lang.Object r9 = r15.m32530t(r4)
            int r6 = r6.mo23894f(r8, r7, r9)
            goto L_0x0299
        L_0x010e:
            java.util.List r6 = m32486J(r1, r9)
            e.f.c.a.z.a.h1 r7 = r15.m32532u(r4)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31849j(r8, r6, r7)
            goto L_0x0299
        L_0x011c:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31859t(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x012e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31857r(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0140:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31848i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0152:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31846g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0164:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31843e(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0176:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31862w(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0188:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31837b(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x019a:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31846g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ab:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31848i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31851l(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01cd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31864y(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01de:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31853n(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ef:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31846g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0200:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31848i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f25556k
            if (r9 == 0) goto L_0x0214
        L_0x0210:
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0214:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31975U(r8)
            int r8 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31977W(r7)
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0299
        L_0x0220:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31858s(r8, r6, r3)
            goto L_0x0299
        L_0x022a:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31856q(r8, r6, r3)
            goto L_0x0299
        L_0x0233:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31841d(r8, r6, r3)
            goto L_0x0299
        L_0x023c:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31861v(r8, r6, r3)
            goto L_0x0299
        L_0x0245:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31839c(r8, r6)
            goto L_0x0299
        L_0x024e:
            java.util.List r6 = m32486J(r1, r9)
            e.f.c.a.z.a.h1 r7 = r15.m32532u(r4)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31855p(r8, r6, r7)
            goto L_0x0299
        L_0x025b:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31860u(r8, r6)
            goto L_0x0299
        L_0x0264:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31835a(r8, r6, r3)
            goto L_0x0299
        L_0x026d:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31850k(r8, r6, r3)
            goto L_0x0299
        L_0x0276:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31863x(r8, r6, r3)
            goto L_0x0299
        L_0x027f:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31852m(r8, r6, r3)
            goto L_0x0299
        L_0x0288:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31845f(r8, r6, r3)
            goto L_0x0299
        L_0x0291:
            java.util.List r6 = m32486J(r1, r9)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31847h(r8, r6, r3)
        L_0x0299:
            int r5 = r5 + r6
            goto L_0x03a6
        L_0x029c:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02a2:
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9)
            e.f.c.a.z.a.s0 r6 = (p174e.p319f.p393c.p394a.p404z.p405a.C9537s0) r6
            e.f.c.a.z.a.h1 r7 = r15.m32532u(r4)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32000s(r8, r6, r7)
            goto L_0x0299
        L_0x02b1:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32341y(r1, r9)
        L_0x02bb:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31971Q(r8, r6)
            goto L_0x0299
        L_0x02c0:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r1, r9)
        L_0x02ca:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31969O(r8, r6)
            goto L_0x0299
        L_0x02cf:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02d5:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31967M(r8, r13)
            goto L_0x0299
        L_0x02da:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02e0:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31965K(r8, r3)
            goto L_0x0299
        L_0x02e5:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r1, r9)
        L_0x02ef:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31992k(r8, r6)
            goto L_0x0299
        L_0x02f4:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r1, r9)
        L_0x02fe:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31976V(r8, r6)
            goto L_0x0299
        L_0x0303:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0309:
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9)
        L_0x030d:
            e.f.c.a.z.a.i r6 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r6
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31988g(r8, r6)
            goto L_0x0299
        L_0x0314:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x031a:
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9)
            e.f.c.a.z.a.h1 r7 = r15.m32532u(r4)
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9489j1.m31854o(r8, r6, r7)
            goto L_0x0299
        L_0x0328:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r1, r9)
            boolean r7 = r6 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9468i
            if (r7 == 0) goto L_0x00aa
            goto L_0x00a8
        L_0x0338:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x033e:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31983d(r8, r11)
            goto L_0x0299
        L_0x0344:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x034a:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31994m(r8, r3)
            goto L_0x0299
        L_0x0350:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0356:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31996o(r8, r13)
            goto L_0x0299
        L_0x035c:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r1, r9)
        L_0x0366:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32003v(r8, r6)
            goto L_0x0299
        L_0x036c:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32341y(r1, r9)
        L_0x0376:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31978X(r8, r6)
            goto L_0x0299
        L_0x037c:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32341y(r1, r9)
        L_0x0386:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m32005x(r8, r6)
            goto L_0x0299
        L_0x038c:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0392:
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31998q(r8, r12)
            goto L_0x0299
        L_0x0398:
            boolean r6 = r15.m32478B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x039e:
            r6 = 0
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9504l.m31990i(r8, r6)
            goto L_0x0299
        L_0x03a6:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x03aa:
            e.f.c.a.z.a.o1<?, ?> r2 = r0.f25562q
            int r1 = r15.m32540y(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.m32538x(java.lang.Object):int");
    }

    /* renamed from: x0 */
    private <UT, UB> void m32539x0(C9522o1<UT, UB> o1Var, T t, C9567v1 v1Var) {
        o1Var.mo23917t(o1Var.mo23904g(t), v1Var);
    }

    /* renamed from: y */
    private <UT, UB> int m32540y(C9522o1<UT, UB> o1Var, T t) {
        return o1Var.mo23905h(o1Var.mo23904g(t));
    }

    /* renamed from: z */
    private static <T> int m32541z(T t, long j) {
        return C9539s1.m32340x(t, j);
    }

    /* renamed from: a */
    public void mo23629a(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f25548c.length; i += 3) {
            m32492P(t, t2, i);
        }
        C9489j1.m31815G(this.f25562q, t, t2);
        if (this.f25553h) {
            C9489j1.m31813E(this.f25563r, t, t2);
        }
    }

    /* renamed from: b */
    public void mo23630b(T t) {
        int i;
        int i2 = this.f25558m;
        while (true) {
            i = this.f25559n;
            if (i2 >= i) {
                break;
            }
            long U = m32497U(m32527r0(this.f25557l[i2]));
            Object A = C9539s1.m32300A(t, U);
            if (A != null) {
                C9539s1.m32314O(t, U, this.f25564s.mo23890b(A));
            }
            i2++;
        }
        int length = this.f25557l.length;
        while (i < length) {
            this.f25561p.mo23670c(t, (long) this.f25557l[i]);
            i++;
        }
        this.f25562q.mo23907j(t);
        if (this.f25553h) {
            this.f25563r.mo23952f(t);
        }
    }

    /* renamed from: c */
    public final boolean mo23631c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25558m; i4++) {
            int i5 = this.f25557l[i4];
            int T = m32496T(i5);
            int r0 = m32527r0(i5);
            if (!this.f25555j) {
                int i6 = this.f25548c[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f25547b.getInt(t, (long) i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (m32485I(r0) && !m32479C(t, i5, i3, i)) {
                return false;
            }
            int q0 = m32525q0(r0);
            if (q0 != 9 && q0 != 17) {
                if (q0 != 27) {
                    if (q0 == 60 || q0 == 68) {
                        if (m32484H(t, T, i5) && !m32480D(t, r0, m32532u(i5))) {
                            return false;
                        }
                    } else if (q0 != 49) {
                        if (q0 == 50 && !m32482F(t, r0, i5)) {
                            return false;
                        }
                    }
                }
                if (!m32481E(t, r0, i5)) {
                    return false;
                }
            } else if (m32479C(t, i5, i3, i) && !m32480D(t, r0, m32532u(i5))) {
                return false;
            }
        }
        return !this.f25553h || this.f25563r.mo23949c(t).mo24023o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x032c, code lost:
        if (r0 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0375, code lost:
        if (r0 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0396, code lost:
        if (r0 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0399, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        r12 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a4, code lost:
        r10.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e2, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020a, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0221, code lost:
        r10.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023a, code lost:
        r10.putLong(r30, r2, r4);
        r6 = r6 | r20;
        r2 = r8;
        r0 = r11;
        r3 = r13;
        r1 = r17;
        r13 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0249, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027b, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027d, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027f, code lost:
        r11 = r34;
        r2 = r8;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0287, code lost:
        r0 = r34;
        r22 = r6;
        r19 = r7;
        r20 = r8;
        r28 = r10;
        r2 = r11;
        r8 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03cf  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24034c0(T r30, byte[] r31, int r32, int r33, int r34, p174e.p319f.p393c.p394a.p404z.p405a.C9449e.C9451b r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f25547b
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x03f2
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31467H(r0, r12, r3, r9)
            int r3 = r9.f25335a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.m32508g0(r3, r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.m32507f0(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004e
            r17 = r3
            r2 = r4
            r8 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r0 = r11
            r20 = 0
            goto L_0x039e
        L_0x004e:
            int[] r1 = r15.f25548c
            int r18 = r2 + 1
            r1 = r1[r18]
            int r8 = m32525q0(r1)
            long r11 = m32497U(r1)
            r18 = r5
            r5 = 17
            r19 = r1
            if (r8 > r5) goto L_0x0295
            int[] r5 = r15.f25548c
            int r20 = r2 + 2
            r5 = r5[r20]
            int r20 = r5 >>> 20
            r1 = 1
            int r20 = r1 << r20
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r22
            if (r5 == r7) goto L_0x0086
            r13 = -1
            r17 = r2
            if (r7 == r13) goto L_0x007f
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x007f:
            long r1 = (long) r5
            int r6 = r10.getInt(r14, r1)
            r7 = r5
            goto L_0x0089
        L_0x0086:
            r17 = r2
            r13 = -1
        L_0x0089:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0265;
                case 1: goto L_0x024d;
                case 2: goto L_0x0226;
                case 3: goto L_0x0226;
                case 4: goto L_0x020d;
                case 5: goto L_0x01eb;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01a8;
                case 8: goto L_0x0183;
                case 9: goto L_0x0153;
                case 10: goto L_0x0137;
                case 11: goto L_0x020d;
                case 12: goto L_0x010a;
                case 13: goto L_0x01ca;
                case 14: goto L_0x01eb;
                case 15: goto L_0x00f3;
                case 16: goto L_0x00d9;
                case 17: goto L_0x009a;
                default: goto L_0x008d;
            }
        L_0x008d:
            r12 = r31
            r11 = r4
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            goto L_0x0287
        L_0x009a:
            r2 = 3
            if (r0 != r2) goto L_0x00d2
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r17
            e.f.c.a.z.a.h1 r0 = r15.m32532u(r2)
            r1 = r31
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r33
            r4 = r5
            r13 = r18
            r5 = r35
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31487n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x00bf
            java.lang.Object r1 = r9.f25337c
            goto L_0x00c9
        L_0x00bf:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f25337c
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r1, r2)
        L_0x00c9:
            r10.putObject(r14, r11, r1)
            r6 = r6 | r20
            r12 = r31
            goto L_0x027f
        L_0x00d2:
            r8 = r17
            r13 = r18
            r17 = r3
            goto L_0x00f0
        L_0x00d9:
            r8 = r17
            r13 = r18
            r17 = r3
            if (r0 != 0) goto L_0x00f0
            r2 = r11
            r12 = r31
            int r11 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r12, r4, r9)
            long r0 = r9.f25336b
            long r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9485j.m31731c(r0)
            goto L_0x023a
        L_0x00f0:
            r12 = r31
            goto L_0x014e
        L_0x00f3:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != 0) goto L_0x014e
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r4, r9)
            int r1 = r9.f25335a
            int r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9485j.m31730b(r1)
            goto L_0x0221
        L_0x010a:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != 0) goto L_0x014e
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r4, r9)
            int r1 = r9.f25335a
            e.f.c.a.z.a.b0$e r4 = r15.m32528s(r8)
            if (r4 == 0) goto L_0x0221
            boolean r4 = r4.mo23510a(r1)
            if (r4 == 0) goto L_0x0129
            goto L_0x0221
        L_0x0129:
            e.f.c.a.z.a.p1 r2 = m32534v(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo23925n(r13, r1)
            goto L_0x027f
        L_0x0137:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != r1) goto L_0x014e
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31475b(r12, r4, r9)
            java.lang.Object r1 = r9.f25337c
            r10.putObject(r14, r2, r1)
            goto L_0x027d
        L_0x014e:
            r11 = r4
            r18 = -1
            goto L_0x0287
        L_0x0153:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != r1) goto L_0x017d
            e.f.c.a.z.a.h1 r0 = r15.m32532u(r8)
            r11 = r33
            r18 = -1
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31489p(r0, r12, r4, r11, r9)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x0172
            java.lang.Object r1 = r9.f25337c
            goto L_0x01a4
        L_0x0172:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f25337c
            java.lang.Object r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31429h(r1, r4)
            goto L_0x01a4
        L_0x017d:
            r11 = r33
            r18 = -1
            goto L_0x020a
        L_0x0183:
            r8 = r17
            r13 = r18
            r1 = 2
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x020a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x019e
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31462C(r12, r4, r9)
            goto L_0x01a2
        L_0x019e:
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31465F(r12, r4, r9)
        L_0x01a2:
            java.lang.Object r1 = r9.f25337c
        L_0x01a4:
            r10.putObject(r14, r2, r1)
            goto L_0x01e2
        L_0x01a8:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != 0) goto L_0x020a
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r12, r4, r9)
            long r4 = r9.f25336b
            r23 = 0
            int r1 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x01c5
            r1 = 1
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32304E(r14, r2, r1)
            goto L_0x01e2
        L_0x01ca:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x020a
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31481h(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x01e2:
            r6 = r6 | r20
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            goto L_0x0249
        L_0x01eb:
            r8 = r17
            r13 = r18
            r1 = 1
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x020a
            long r21 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31483j(r12, r4)
            r0 = r10
            r1 = r30
            r11 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x027b
        L_0x020a:
            r11 = r4
            goto L_0x0287
        L_0x020d:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != 0) goto L_0x0287
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r11, r9)
            int r1 = r9.f25335a
        L_0x0221:
            r10.putInt(r14, r2, r1)
            goto L_0x027d
        L_0x0226:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != 0) goto L_0x0287
            int r11 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31471L(r12, r11, r9)
            long r4 = r9.f25336b
        L_0x023a:
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r2 = r8
            r0 = r11
            r3 = r13
            r1 = r17
            r13 = r33
        L_0x0249:
            r11 = r34
            goto L_0x0017
        L_0x024d:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != r1) goto L_0x0287
            float r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31485l(r12, r11)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32311L(r14, r2, r0)
            int r0 = r11 + 4
            goto L_0x027d
        L_0x0265:
            r8 = r17
            r13 = r18
            r1 = 1
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != r1) goto L_0x0287
            double r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31477d(r12, r11)
            p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32310K(r14, r2, r0)
        L_0x027b:
            int r0 = r11 + 8
        L_0x027d:
            r6 = r6 | r20
        L_0x027f:
            r11 = r34
            r2 = r8
            r3 = r13
            r1 = r17
            goto L_0x02e4
        L_0x0287:
            r0 = r34
            r22 = r6
            r19 = r7
            r20 = r8
            r28 = r10
            r2 = r11
            r8 = r13
            goto L_0x039e
        L_0x0295:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r18
            r18 = -1
            r12 = r31
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x02f5
            r1 = 2
            if (r0 != r1) goto L_0x02e8
            java.lang.Object r0 = r10.getObject(r14, r2)
            e.f.c.a.z.a.b0$i r0 = (p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.C9440i) r0
            boolean r1 = r0.mo23512y()
            if (r1 != 0) goto L_0x02c5
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02bc
            r1 = 10
            goto L_0x02be
        L_0x02bc:
            int r1 = r1 * 2
        L_0x02be:
            e.f.c.a.z.a.b0$i r0 = r0.mo23497n(r1)
            r10.putObject(r14, r2, r0)
        L_0x02c5:
            r8 = r0
            e.f.c.a.z.a.h1 r0 = r15.m32532u(r5)
            r1 = r13
            r2 = r31
            r3 = r11
            r4 = r33
            r20 = r5
            r5 = r8
            r22 = r6
            r6 = r35
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31490q(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r3 = r13
            r1 = r17
            r2 = r20
            r6 = r22
        L_0x02e4:
            r13 = r33
            goto L_0x0017
        L_0x02e8:
            r20 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r15 = r11
            r18 = r13
            goto L_0x0378
        L_0x02f5:
            r20 = r5
            r22 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0348
            r1 = r19
            long r5 = (long) r1
            r4 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r11
            r32 = r4
            r4 = r33
            r25 = r5
            r5 = r13
            r6 = r17
            r19 = r7
            r7 = r32
            r27 = r8
            r8 = r20
            r28 = r10
            r9 = r25
            r15 = r11
            r11 = r27
            r18 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.m32506e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0399
        L_0x032e:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r17
            r3 = r18
            r7 = r19
            r2 = r20
            r6 = r22
        L_0x0344:
            r10 = r28
            goto L_0x0017
        L_0x0348:
            r32 = r0
            r23 = r2
            r27 = r8
            r28 = r10
            r15 = r11
            r18 = r13
            r1 = r19
            r19 = r7
            r0 = 50
            r9 = r27
            r7 = r32
            if (r9 != r0) goto L_0x037e
            r0 = 2
            if (r7 != r0) goto L_0x0378
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r23
            r8 = r35
            int r0 = r0.m32503a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0399
            goto L_0x032e
        L_0x0378:
            r0 = r34
            r2 = r15
            r8 = r18
            goto L_0x039e
        L_0x037e:
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r17
            r10 = r23
            r12 = r20
            r13 = r35
            int r0 = r0.m32504b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0399
            goto L_0x032e
        L_0x0399:
            r2 = r0
            r8 = r18
            r0 = r34
        L_0x039e:
            if (r8 != r0) goto L_0x03ac
            if (r0 == 0) goto L_0x03ac
            r9 = r29
            r10 = r0
            r0 = r2
            r3 = r8
            r7 = r19
            r6 = r22
            goto L_0x03fa
        L_0x03ac:
            r9 = r29
            r10 = r0
            boolean r0 = r9.f25553h
            r11 = r35
            if (r0 == 0) goto L_0x03cf
            e.f.c.a.z.a.q r0 = r11.f25338d
            e.f.c.a.z.a.q r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9526q.m32218b()
            if (r0 == r1) goto L_0x03cf
            e.f.c.a.z.a.s0 r5 = r9.f25552g
            e.f.c.a.z.a.o1<?, ?> r6 = r9.f25562q
            r0 = r8
            r1 = r31
            r3 = r33
            r4 = r30
            r7 = r35
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31480g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03de
        L_0x03cf:
            e.f.c.a.z.a.p1 r4 = m32534v(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31466G(r0, r1, r2, r3, r4, r5)
        L_0x03de:
            r14 = r30
            r12 = r31
            r13 = r33
            r3 = r8
            r15 = r9
            r9 = r11
            r1 = r17
            r7 = r19
            r2 = r20
            r6 = r22
            r11 = r10
            goto L_0x0344
        L_0x03f2:
            r22 = r6
            r19 = r7
            r28 = r10
            r10 = r11
            r9 = r15
        L_0x03fa:
            r1 = -1
            if (r7 == r1) goto L_0x0406
            long r1 = (long) r7
            r4 = r30
            r5 = r28
            r5.putInt(r4, r1, r6)
            goto L_0x0408
        L_0x0406:
            r4 = r30
        L_0x0408:
            r1 = 0
            int r2 = r9.f25558m
        L_0x040b:
            int r5 = r9.f25559n
            if (r2 >= r5) goto L_0x041e
            int[] r5 = r9.f25557l
            r5 = r5[r2]
            e.f.c.a.z.a.o1<?, ?> r6 = r9.f25562q
            java.lang.Object r1 = r9.m32522p(r4, r5, r1, r6)
            e.f.c.a.z.a.p1 r1 = (p174e.p319f.p393c.p394a.p404z.p405a.C9525p1) r1
            int r2 = r2 + 1
            goto L_0x040b
        L_0x041e:
            if (r1 == 0) goto L_0x0425
            e.f.c.a.z.a.o1<?, ?> r2 = r9.f25562q
            r2.mo23912o(r4, r1)
        L_0x0425:
            r1 = r33
            if (r10 != 0) goto L_0x0431
            if (r0 != r1) goto L_0x042c
            goto L_0x0435
        L_0x042c:
            e.f.c.a.z.a.c0 r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9443c0.m31447g()
            throw r0
        L_0x0431:
            if (r0 > r1) goto L_0x0436
            if (r3 != r10) goto L_0x0436
        L_0x0435:
            return r0
        L_0x0436:
            e.f.c.a.z.a.c0 r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9443c0.m31447g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.mo24034c0(java.lang.Object, byte[], int, int, int, e.f.c.a.z.a.e$b):int");
    }

    /* renamed from: d */
    public void mo23632d(T t, byte[] bArr, int i, int i2, C9449e.C9451b bVar) {
        if (this.f25555j) {
            m32505d0(t, bArr, i, i2, bVar);
        } else {
            mo24034c0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* renamed from: e */
    public void mo23633e(T t, C9567v1 v1Var) {
        if (v1Var.mo23845k() == C9567v1.C9568a.DESCENDING) {
            m32533u0(t, v1Var);
        } else if (this.f25555j) {
            m32531t0(t, v1Var);
        } else {
            m32529s0(t, v1Var);
        }
    }

    /* renamed from: f */
    public void mo23634f(T t, C9464g1 g1Var, C9526q qVar) {
        Objects.requireNonNull(qVar);
        m32488L(this.f25562q, this.f25563r, t, g1Var, qVar);
    }

    /* renamed from: g */
    public boolean mo23635g(T t, T t2) {
        int length = this.f25548c.length;
        for (int i = 0; i < length; i += 3) {
            if (!m32520o(t, t2, i)) {
                return false;
            }
        }
        if (!this.f25562q.mo23904g(t).equals(this.f25562q.mo23904g(t2))) {
            return false;
        }
        if (this.f25553h) {
            return this.f25563r.mo23949c(t).equals(this.f25563r.mo23949c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public int mo23636h(T t) {
        return this.f25555j ? m32538x(t) : m32536w(t);
    }

    /* renamed from: i */
    public T mo23637i() {
        return this.f25560o.mo24051a(this.f25552g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = r2 * 53;
        r3 = m32501Y(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r2 = r2 * 53;
        r3 = m32502Z(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = r2 * 53;
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31424c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31427f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23638j(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f25548c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.m32527r0(r1)
            int r4 = r8.m32496T(r1)
            long r5 = m32497U(r3)
            int r3 = m32525q0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x010e;
                case 2: goto L_0x0107;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x0107;
                case 6: goto L_0x0100;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00e8;
                case 9: goto L_0x00da;
                case 10: goto L_0x00cf;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x0107;
                case 15: goto L_0x0100;
                case 16: goto L_0x0107;
                case 17: goto L_0x00c8;
                case 18: goto L_0x00cf;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00cf;
                case 21: goto L_0x00cf;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00cf;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00cf;
                case 27: goto L_0x00cf;
                case 28: goto L_0x00cf;
                case 29: goto L_0x00cf;
                case 30: goto L_0x00cf;
                case 31: goto L_0x00cf;
                case 32: goto L_0x00cf;
                case 33: goto L_0x00cf;
                case 34: goto L_0x00cf;
                case 35: goto L_0x00cf;
                case 36: goto L_0x00cf;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00cf;
                case 39: goto L_0x00cf;
                case 40: goto L_0x00cf;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00cf;
                case 43: goto L_0x00cf;
                case 44: goto L_0x00cf;
                case 45: goto L_0x00cf;
                case 46: goto L_0x00cf;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00cf;
                case 49: goto L_0x00cf;
                case 50: goto L_0x00cf;
                case 51: goto L_0x00bb;
                case 52: goto L_0x00ae;
                case 53: goto L_0x00a0;
                case 54: goto L_0x0099;
                case 55: goto L_0x008b;
                case 56: goto L_0x0084;
                case 57: goto L_0x007d;
                case 58: goto L_0x006f;
                case 59: goto L_0x0067;
                case 60: goto L_0x0059;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0128
        L_0x001e:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x005f
        L_0x0025:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x002d:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0034:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x003c:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0043:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0049:
            goto L_0x0091
        L_0x004a:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0051:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00cf
        L_0x0059:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x005f:
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d5
        L_0x0067:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00e8
        L_0x006f:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = m32498V(r9, r5)
            goto L_0x00fb
        L_0x007d:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0084:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x008b:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0091:
            int r2 = r2 * 53
            int r3 = m32501Y(r9, r5)
            goto L_0x0127
        L_0x0099:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x00a0:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x00a6:
            int r2 = r2 * 53
            long r3 = m32502Z(r9, r5)
            goto L_0x0123
        L_0x00ae:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = m32500X(r9, r5)
            goto L_0x0114
        L_0x00bb:
            boolean r3 = r8.m32484H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = m32499W(r9, r5)
            goto L_0x011f
        L_0x00c8:
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00e0
        L_0x00cf:
            int r2 = r2 * 53
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5)
        L_0x00d5:
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00da:
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5)
            if (r3 == 0) goto L_0x00e4
        L_0x00e0:
            int r7 = r3.hashCode()
        L_0x00e4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00e8:
            int r2 = r2 * 53
            java.lang.Object r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32300A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00f5:
            int r2 = r2 * 53
            boolean r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32332p(r9, r5)
        L_0x00fb:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31424c(r3)
            goto L_0x0127
        L_0x0100:
            int r2 = r2 * 53
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32340x(r9, r5)
            goto L_0x0127
        L_0x0107:
            int r2 = r2 * 53
            long r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32341y(r9, r5)
            goto L_0x0123
        L_0x010e:
            int r2 = r2 * 53
            float r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32339w(r9, r5)
        L_0x0114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0127
        L_0x0119:
            int r2 = r2 * 53
            double r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32338v(r9, r5)
        L_0x011f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0123:
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.m31427f(r3)
        L_0x0127:
            int r2 = r2 + r3
        L_0x0128:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            e.f.c.a.z.a.o1<?, ?> r0 = r8.f25562q
            java.lang.Object r0 = r0.mo23904g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f25553h
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            e.f.c.a.z.a.r<?> r0 = r8.f25563r
            e.f.c.a.z.a.v r9 = r0.mo23949c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9566v0.mo23638j(java.lang.Object):int");
    }
}
