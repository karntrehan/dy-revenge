package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.g.tb */
final class C7014tb {

    /* renamed from: a */
    private static final Unsafe f18961a;

    /* renamed from: b */
    private static final Class f18962b = C6866k7.m26067a();

    /* renamed from: c */
    private static final boolean f18963c;

    /* renamed from: d */
    private static final C6998sb f18964d;

    /* renamed from: e */
    private static final boolean f18965e;

    /* renamed from: f */
    private static final boolean f18966f;

    /* renamed from: g */
    static final long f18967g = ((long) m26609E(byte[].class));

    /* renamed from: h */
    static final boolean f18968h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m26621l()
            f18961a = r7
            java.lang.Class r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6866k7.m26067a()
            f18962b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m26605A(r8)
            f18963c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m26605A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            e.f.a.c.f.g.rb r11 = new e.f.a.c.f.g.rb
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            e.f.a.c.f.g.qb r11 = new e.f.a.c.f.g.qb
            r11.<init>(r7)
        L_0x003b:
            f18964d = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.f18940a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m26611b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f18965e = r8
            e.f.a.c.f.g.sb r8 = f18964d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f18940a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f18966f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m26609E(r6)
            long r6 = (long) r6
            f18967g = r6
            m26609E(r5)
            m26610a(r5)
            m26609E(r4)
            m26610a(r4)
            m26609E(r3)
            m26610a(r3)
            m26609E(r2)
            m26610a(r2)
            m26609E(r1)
            m26610a(r1)
            m26609E(r0)
            m26610a(r0)
            java.lang.reflect.Field r0 = m26611b()
            if (r0 == 0) goto L_0x0129
            e.f.a.c.f.g.sb r1 = f18964d
            if (r1 == 0) goto L_0x0129
            r1.mo20163l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f18968h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.<clinit>():void");
    }

    private C7014tb() {
    }

    /* renamed from: A */
    static boolean m26605A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C6866k7.f18579a;
        try {
            Class cls3 = f18962b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: B */
    static boolean m26606B(Object obj, long j) {
        return f18964d.mo20113g(obj, j);
    }

    /* renamed from: C */
    static boolean m26607C() {
        return f18966f;
    }

    /* renamed from: D */
    static boolean m26608D() {
        return f18965e;
    }

    /* renamed from: E */
    private static int m26609E(Class cls) {
        if (f18966f) {
            return f18964d.mo20159h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m26610a(Class cls) {
        if (f18966f) {
            return f18964d.mo20160i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m26611b() {
        int i = C6866k7.f18579a;
        Field c = m26612c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m26612c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m26612c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m26613d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C6998sb sbVar = f18964d;
        int j3 = sbVar.mo20161j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        sbVar.mo20165n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m26614e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C6998sb sbVar = f18964d;
        int i = (((int) j) & 3) << 3;
        sbVar.mo20165n(obj, j2, ((255 & b) << i) | (sbVar.mo20161j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m26615f(Object obj, long j) {
        return f18964d.mo20107a(obj, j);
    }

    /* renamed from: g */
    static float m26616g(Object obj, long j) {
        return f18964d.mo20108b(obj, j);
    }

    /* renamed from: h */
    static int m26617h(Object obj, long j) {
        return f18964d.mo20161j(obj, j);
    }

    /* renamed from: i */
    static long m26618i(Object obj, long j) {
        return f18964d.mo20162k(obj, j);
    }

    /* renamed from: j */
    static Object m26619j(Class cls) {
        try {
            return f18961a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m26620k(Object obj, long j) {
        return f18964d.mo20164m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m26621l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6950pb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m26627r(Object obj, long j, boolean z) {
        f18964d.mo20109c(obj, j, z);
    }

    /* renamed from: s */
    static void m26628s(byte[] bArr, long j, byte b) {
        f18964d.mo20110d(bArr, f18967g + j, b);
    }

    /* renamed from: t */
    static void m26629t(Object obj, long j, double d) {
        f18964d.mo20111e(obj, j, d);
    }

    /* renamed from: u */
    static void m26630u(Object obj, long j, float f) {
        f18964d.mo20112f(obj, j, f);
    }

    /* renamed from: v */
    static void m26631v(Object obj, long j, int i) {
        f18964d.mo20165n(obj, j, i);
    }

    /* renamed from: w */
    static void m26632w(Object obj, long j, long j2) {
        f18964d.mo20166o(obj, j, j2);
    }

    /* renamed from: x */
    static void m26633x(Object obj, long j, Object obj2) {
        f18964d.mo20167p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m26634y(Object obj, long j) {
        return ((byte) ((f18964d.mo20161j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m26635z(Object obj, long j) {
        return ((byte) ((f18964d.mo20161j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
