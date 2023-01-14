package p174e.p319f.p320a.p335c.p345f.p357l;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.l.uf */
final class C8494uf {

    /* renamed from: a */
    private static final Unsafe f23132a;

    /* renamed from: b */
    private static final Class<?> f23133b = C8400pb.m28931a();

    /* renamed from: c */
    private static final boolean f23134c;

    /* renamed from: d */
    private static final boolean f23135d;

    /* renamed from: e */
    private static final C8476tf f23136e;

    /* renamed from: f */
    private static final boolean f23137f;

    /* renamed from: g */
    private static final boolean f23138g;

    /* renamed from: h */
    static final long f23139h = ((long) m29094E(byte[].class));

    /* renamed from: i */
    static final boolean f23140i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m29106l()
            f23132a = r7
            java.lang.Class r8 = p174e.p319f.p320a.p335c.p345f.p357l.C8400pb.m28931a()
            f23133b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m29090A(r8)
            f23134c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m29090A(r10)
            f23135d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            e.f.a.c.f.l.sf r11 = new e.f.a.c.f.l.sf
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            e.f.a.c.f.l.rf r11 = new e.f.a.c.f.l.rf
            r11.<init>(r7)
        L_0x003d:
            f23136e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = 0
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f23099a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m29096b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = 1
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m29107m(r8)
            goto L_0x0048
        L_0x0073:
            f23137f = r8
            e.f.a.c.f.l.tf r8 = f23136e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = 0
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f23099a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = 1
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            m29107m(r6)
            goto L_0x0079
        L_0x00f6:
            f23138g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m29094E(r6)
            long r6 = (long) r6
            f23139h = r6
            m29094E(r5)
            m29095a(r5)
            m29094E(r4)
            m29095a(r4)
            m29094E(r3)
            m29095a(r3)
            m29094E(r2)
            m29095a(r2)
            m29094E(r1)
            m29095a(r1)
            m29094E(r0)
            m29095a(r0)
            java.lang.reflect.Field r0 = m29096b()
            if (r0 == 0) goto L_0x0132
            e.f.a.c.f.l.tf r1 = f23136e
            if (r1 == 0) goto L_0x0132
            r1.mo22155l(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = 0
        L_0x013c:
            f23140i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8494uf.<clinit>():void");
    }

    private C8494uf() {
    }

    /* renamed from: A */
    static boolean m29090A(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C8400pb.f22907a;
        try {
            Class<?> cls3 = f23133b;
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
    static boolean m29091B(Object obj, long j) {
        return f23136e.mo22127g(obj, j);
    }

    /* renamed from: C */
    static boolean m29092C() {
        return f23138g;
    }

    /* renamed from: D */
    static boolean m29093D() {
        return f23137f;
    }

    /* renamed from: E */
    private static int m29094E(Class<?> cls) {
        if (f23138g) {
            return f23136e.mo22151h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m29095a(Class<?> cls) {
        if (f23138g) {
            return f23136e.mo22152i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m29096b() {
        int i = C8400pb.f22907a;
        Field c = m29097c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m29097c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m29097c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m29098d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C8476tf tfVar = f23136e;
        int j3 = tfVar.mo22153j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        tfVar.mo22157n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m29099e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C8476tf tfVar = f23136e;
        int i = (((int) j) & 3) << 3;
        tfVar.mo22157n(obj, j2, ((255 & b) << i) | (tfVar.mo22153j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m29100f(Object obj, long j) {
        return f23136e.mo22121a(obj, j);
    }

    /* renamed from: g */
    static float m29101g(Object obj, long j) {
        return f23136e.mo22122b(obj, j);
    }

    /* renamed from: h */
    static int m29102h(Object obj, long j) {
        return f23136e.mo22153j(obj, j);
    }

    /* renamed from: i */
    static long m29103i(Object obj, long j) {
        return f23136e.mo22154k(obj, j);
    }

    /* renamed from: j */
    static <T> T m29104j(Class<T> cls) {
        try {
            return f23132a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m29105k(Object obj, long j) {
        return f23136e.mo22156m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m29106l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8422qf());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m29107m(Throwable th) {
        Logger logger = Logger.getLogger(C8494uf.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* renamed from: r */
    static void m29112r(Object obj, long j, boolean z) {
        f23136e.mo22123c(obj, j, z);
    }

    /* renamed from: s */
    static void m29113s(byte[] bArr, long j, byte b) {
        f23136e.mo22124d(bArr, f23139h + j, b);
    }

    /* renamed from: t */
    static void m29114t(Object obj, long j, double d) {
        f23136e.mo22125e(obj, j, d);
    }

    /* renamed from: u */
    static void m29115u(Object obj, long j, float f) {
        f23136e.mo22126f(obj, j, f);
    }

    /* renamed from: v */
    static void m29116v(Object obj, long j, int i) {
        f23136e.mo22157n(obj, j, i);
    }

    /* renamed from: w */
    static void m29117w(Object obj, long j, long j2) {
        f23136e.mo22158o(obj, j, j2);
    }

    /* renamed from: x */
    static void m29118x(Object obj, long j, Object obj2) {
        f23136e.mo22159p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* synthetic */ boolean m29119y(Object obj, long j) {
        return ((byte) ((f23136e.mo22153j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* synthetic */ boolean m29120z(Object obj, long j) {
        return ((byte) ((f23136e.mo22153j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
