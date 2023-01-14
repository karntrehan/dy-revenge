package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.d */
final class C9446d {

    /* renamed from: a */
    private static final Class<?> f25315a = m31451a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f25316b = (m31451a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m31451a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class<?> m31452b() {
        return f25315a;
    }

    /* renamed from: c */
    static boolean m31453c() {
        return f25315a != null && !f25316b;
    }
}
