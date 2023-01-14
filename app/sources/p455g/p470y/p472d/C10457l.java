package p455g.p470y.p472d;

import java.util.Arrays;
import p455g.C10322r;

/* renamed from: g.y.d.l */
public class C10457l {
    private C10457l() {
    }

    /* renamed from: a */
    public static boolean m35316a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m35317b(Object obj) {
        if (obj == null) {
            m35327l();
        }
    }

    /* renamed from: c */
    public static void m35318c(Object obj, String str) {
        if (obj == null) {
            m35328m(str);
        }
    }

    /* renamed from: d */
    public static void m35319d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m35324i(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: e */
    public static void m35320e(Object obj, String str) {
        if (obj == null) {
            m35330o(str);
        }
    }

    /* renamed from: f */
    public static void m35321f(Object obj, String str) {
        if (obj == null) {
            m35329n(str);
        }
    }

    /* renamed from: g */
    public static int m35322g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: h */
    private static String m35323h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: i */
    private static <T extends Throwable> T m35324i(T t) {
        return m35325j(t, C10457l.class.getName());
    }

    /* renamed from: j */
    static <T extends Throwable> T m35325j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: k */
    public static String m35326k(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m35327l() {
        throw ((NullPointerException) m35324i(new NullPointerException()));
    }

    /* renamed from: m */
    public static void m35328m(String str) {
        throw ((NullPointerException) m35324i(new NullPointerException(str)));
    }

    /* renamed from: n */
    private static void m35329n(String str) {
        throw ((IllegalArgumentException) m35324i(new IllegalArgumentException(m35323h(str))));
    }

    /* renamed from: o */
    private static void m35330o(String str) {
        throw ((NullPointerException) m35324i(new NullPointerException(m35323h(str))));
    }

    /* renamed from: p */
    public static void m35331p(String str) {
        throw ((C10322r) m35324i(new C10322r(str)));
    }

    /* renamed from: q */
    public static void m35332q(String str) {
        m35331p("lateinit property " + str + " has not been initialized");
    }
}
