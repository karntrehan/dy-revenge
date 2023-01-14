package p174e.p319f.p393c.p394a.p404z.p405a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: e.f.c.a.z.a.s1 */
final class C9539s1 {

    /* renamed from: a */
    private static final Logger f25476a = Logger.getLogger(C9539s1.class.getName());

    /* renamed from: b */
    private static final Unsafe f25477b = m32301B();

    /* renamed from: c */
    private static final Class<?> f25478c = C9446d.m31452b();

    /* renamed from: d */
    private static final boolean f25479d = m32329m(Long.TYPE);

    /* renamed from: e */
    private static final boolean f25480e = m32329m(Integer.TYPE);

    /* renamed from: f */
    private static final C9544e f25481f = m32342z();

    /* renamed from: g */
    private static final boolean f25482g = m32316Q();

    /* renamed from: h */
    private static final boolean f25483h = m32315P();

    /* renamed from: i */
    static final long f25484i;

    /* renamed from: j */
    private static final long f25485j;

    /* renamed from: k */
    private static final long f25486k;

    /* renamed from: l */
    private static final long f25487l;

    /* renamed from: m */
    private static final long f25488m;

    /* renamed from: n */
    private static final long f25489n;

    /* renamed from: o */
    private static final long f25490o;

    /* renamed from: p */
    private static final long f25491p;

    /* renamed from: q */
    private static final long f25492q;

    /* renamed from: r */
    private static final long f25493r;

    /* renamed from: s */
    private static final long f25494s;

    /* renamed from: t */
    private static final long f25495t;

    /* renamed from: u */
    private static final long f25496u;

    /* renamed from: v */
    private static final long f25497v = m32331o(m32328l());

    /* renamed from: w */
    private static final int f25498w;

    /* renamed from: x */
    static final boolean f25499x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: e.f.c.a.z.a.s1$a */
    class C9540a implements PrivilegedExceptionAction<Unsafe> {
        C9540a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: e.f.c.a.z.a.s1$b */
    private static final class C9541b extends C9544e {
        C9541b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo23988c(Object obj, long j) {
            return C9539s1.f25499x ? C9539s1.m32333q(obj, j) : C9539s1.m32334r(obj, j);
        }

        /* renamed from: d */
        public byte mo23989d(Object obj, long j) {
            return C9539s1.f25499x ? C9539s1.m32336t(obj, j) : C9539s1.m32337u(obj, j);
        }

        /* renamed from: e */
        public double mo23990e(Object obj, long j) {
            return Double.longBitsToDouble(mo23999h(obj, j));
        }

        /* renamed from: f */
        public float mo23991f(Object obj, long j) {
            return Float.intBitsToFloat(mo23998g(obj, j));
        }

        /* renamed from: k */
        public void mo23992k(Object obj, long j, boolean z) {
            if (C9539s1.f25499x) {
                C9539s1.m32305F(obj, j, z);
            } else {
                C9539s1.m32306G(obj, j, z);
            }
        }

        /* renamed from: l */
        public void mo23993l(Object obj, long j, byte b) {
            if (C9539s1.f25499x) {
                C9539s1.m32308I(obj, j, b);
            } else {
                C9539s1.m32309J(obj, j, b);
            }
        }

        /* renamed from: m */
        public void mo23994m(Object obj, long j, double d) {
            mo24003p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public void mo23995n(Object obj, long j, float f) {
            mo24002o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: e.f.c.a.z.a.s1$c */
    private static final class C9542c extends C9544e {
        C9542c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo23988c(Object obj, long j) {
            return C9539s1.f25499x ? C9539s1.m32333q(obj, j) : C9539s1.m32334r(obj, j);
        }

        /* renamed from: d */
        public byte mo23989d(Object obj, long j) {
            return C9539s1.f25499x ? C9539s1.m32336t(obj, j) : C9539s1.m32337u(obj, j);
        }

        /* renamed from: e */
        public double mo23990e(Object obj, long j) {
            return Double.longBitsToDouble(mo23999h(obj, j));
        }

        /* renamed from: f */
        public float mo23991f(Object obj, long j) {
            return Float.intBitsToFloat(mo23998g(obj, j));
        }

        /* renamed from: k */
        public void mo23992k(Object obj, long j, boolean z) {
            if (C9539s1.f25499x) {
                C9539s1.m32305F(obj, j, z);
            } else {
                C9539s1.m32306G(obj, j, z);
            }
        }

        /* renamed from: l */
        public void mo23993l(Object obj, long j, byte b) {
            if (C9539s1.f25499x) {
                C9539s1.m32308I(obj, j, b);
            } else {
                C9539s1.m32309J(obj, j, b);
            }
        }

        /* renamed from: m */
        public void mo23994m(Object obj, long j, double d) {
            mo24003p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public void mo23995n(Object obj, long j, float f) {
            mo24002o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: e.f.c.a.z.a.s1$d */
    private static final class C9543d extends C9544e {
        C9543d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo23988c(Object obj, long j) {
            return this.f25500a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public byte mo23989d(Object obj, long j) {
            return this.f25500a.getByte(obj, j);
        }

        /* renamed from: e */
        public double mo23990e(Object obj, long j) {
            return this.f25500a.getDouble(obj, j);
        }

        /* renamed from: f */
        public float mo23991f(Object obj, long j) {
            return this.f25500a.getFloat(obj, j);
        }

        /* renamed from: k */
        public void mo23992k(Object obj, long j, boolean z) {
            this.f25500a.putBoolean(obj, j, z);
        }

        /* renamed from: l */
        public void mo23993l(Object obj, long j, byte b) {
            this.f25500a.putByte(obj, j, b);
        }

        /* renamed from: m */
        public void mo23994m(Object obj, long j, double d) {
            this.f25500a.putDouble(obj, j, d);
        }

        /* renamed from: n */
        public void mo23995n(Object obj, long j, float f) {
            this.f25500a.putFloat(obj, j, f);
        }
    }

    /* renamed from: e.f.c.a.z.a.s1$e */
    private static abstract class C9544e {

        /* renamed from: a */
        Unsafe f25500a;

        C9544e(Unsafe unsafe) {
            this.f25500a = unsafe;
        }

        /* renamed from: a */
        public final int mo23996a(Class<?> cls) {
            return this.f25500a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo23997b(Class<?> cls) {
            return this.f25500a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo23988c(Object obj, long j);

        /* renamed from: d */
        public abstract byte mo23989d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo23990e(Object obj, long j);

        /* renamed from: f */
        public abstract float mo23991f(Object obj, long j);

        /* renamed from: g */
        public final int mo23998g(Object obj, long j) {
            return this.f25500a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long mo23999h(Object obj, long j) {
            return this.f25500a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object mo24000i(Object obj, long j) {
            return this.f25500a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long mo24001j(Field field) {
            return this.f25500a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo23992k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo23993l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo23994m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo23995n(Object obj, long j, float f);

        /* renamed from: o */
        public final void mo24002o(Object obj, long j, int i) {
            this.f25500a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void mo24003p(Object obj, long j, long j2) {
            this.f25500a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void mo24004q(Object obj, long j, Object obj2) {
            this.f25500a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long j = (long) m32326j(byte[].class);
        f25484i = j;
        f25485j = (long) m32326j(cls6);
        f25486k = (long) m32327k(cls6);
        f25487l = (long) m32326j(cls5);
        f25488m = (long) m32327k(cls5);
        f25489n = (long) m32326j(cls4);
        f25490o = (long) m32327k(cls4);
        f25491p = (long) m32326j(cls3);
        f25492q = (long) m32327k(cls3);
        f25493r = (long) m32326j(cls2);
        f25494s = (long) m32327k(cls2);
        f25495t = (long) m32326j(cls);
        f25496u = (long) m32327k(cls);
        f25498w = (int) (7 & j);
    }

    private C9539s1() {
    }

    /* renamed from: A */
    static Object m32300A(Object obj, long j) {
        return f25481f.mo24000i(obj, j);
    }

    /* renamed from: B */
    static Unsafe m32301B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C9540a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    static boolean m32302C() {
        return f25483h;
    }

    /* renamed from: D */
    static boolean m32303D() {
        return f25482g;
    }

    /* renamed from: E */
    static void m32304E(Object obj, long j, boolean z) {
        f25481f.mo23992k(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static void m32305F(Object obj, long j, boolean z) {
        m32308I(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static void m32306G(Object obj, long j, boolean z) {
        m32309J(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: H */
    static void m32307H(byte[] bArr, long j, byte b) {
        f25481f.mo23993l(bArr, f25484i + j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static void m32308I(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int x = m32340x(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m32312M(obj, j2, ((255 & b) << i) | (x & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static void m32309J(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m32312M(obj, j2, ((255 & b) << i) | (m32340x(obj, j2) & (~(255 << i))));
    }

    /* renamed from: K */
    static void m32310K(Object obj, long j, double d) {
        f25481f.mo23994m(obj, j, d);
    }

    /* renamed from: L */
    static void m32311L(Object obj, long j, float f) {
        f25481f.mo23995n(obj, j, f);
    }

    /* renamed from: M */
    static void m32312M(Object obj, long j, int i) {
        f25481f.mo24002o(obj, j, i);
    }

    /* renamed from: N */
    static void m32313N(Object obj, long j, long j2) {
        f25481f.mo24003p(obj, j, j2);
    }

    /* renamed from: O */
    static void m32314O(Object obj, long j, Object obj2) {
        f25481f.mo24004q(obj, j, obj2);
    }

    /* renamed from: P */
    private static boolean m32315P() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f25477b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (C9446d.m31453c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f25476a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: Q */
    private static boolean m32316Q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f25477b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m32328l() == null) {
                return false;
            }
            if (C9446d.m31453c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = f25476a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    static <T> T m32325i(Class<T> cls) {
        try {
            return f25477b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: j */
    private static int m32326j(Class<?> cls) {
        if (f25483h) {
            return f25481f.mo23996a(cls);
        }
        return -1;
    }

    /* renamed from: k */
    private static int m32327k(Class<?> cls) {
        if (f25483h) {
            return f25481f.mo23997b(cls);
        }
        return -1;
    }

    /* renamed from: l */
    private static Field m32328l() {
        Field n;
        if (C9446d.m31453c() && (n = m32330n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n;
        }
        Field n2 = m32330n(Buffer.class, "address");
        if (n2 == null || n2.getType() != Long.TYPE) {
            return null;
        }
        return n2;
    }

    /* renamed from: m */
    private static boolean m32329m(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C9446d.m31453c()) {
            return false;
        }
        try {
            Class<?> cls3 = f25478c;
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

    /* renamed from: n */
    private static Field m32330n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    private static long m32331o(Field field) {
        C9544e eVar;
        if (field == null || (eVar = f25481f) == null) {
            return -1;
        }
        return eVar.mo24001j(field);
    }

    /* renamed from: p */
    static boolean m32332p(Object obj, long j) {
        return f25481f.mo23988c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static boolean m32333q(Object obj, long j) {
        return m32336t(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static boolean m32334r(Object obj, long j) {
        return m32337u(obj, j) != 0;
    }

    /* renamed from: s */
    static byte m32335s(byte[] bArr, long j) {
        return f25481f.mo23989d(bArr, f25484i + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static byte m32336t(Object obj, long j) {
        return (byte) ((m32340x(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static byte m32337u(Object obj, long j) {
        return (byte) ((m32340x(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: v */
    static double m32338v(Object obj, long j) {
        return f25481f.mo23990e(obj, j);
    }

    /* renamed from: w */
    static float m32339w(Object obj, long j) {
        return f25481f.mo23991f(obj, j);
    }

    /* renamed from: x */
    static int m32340x(Object obj, long j) {
        return f25481f.mo23998g(obj, j);
    }

    /* renamed from: y */
    static long m32341y(Object obj, long j) {
        return f25481f.mo23999h(obj, j);
    }

    /* renamed from: z */
    private static C9544e m32342z() {
        Unsafe unsafe = f25477b;
        if (unsafe == null) {
            return null;
        }
        if (!C9446d.m31453c()) {
            return new C9543d(unsafe);
        }
        if (f25479d) {
            return new C9542c(unsafe);
        }
        if (f25480e) {
            return new C9541b(unsafe);
        }
        return null;
    }
}
