package p174e.p247e.p315l.p316a;

/* renamed from: e.e.l.a.a */
public class C6409a {
    /* renamed from: a */
    public static void m24519a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static void m24520b(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    /* renamed from: c */
    public static <T> T m24521c(T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public static <T> T m24522d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    /* renamed from: e */
    public static AssertionError m24523e() {
        throw new AssertionError();
    }

    /* renamed from: f */
    public static <T> T m24524f(T t) {
        return t;
    }
}
