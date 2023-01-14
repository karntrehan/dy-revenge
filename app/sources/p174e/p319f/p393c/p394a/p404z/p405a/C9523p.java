package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.p */
final class C9523p {

    /* renamed from: a */
    static final Class<?> f25454a = m32197c();

    /* renamed from: a */
    public static C9526q m32195a() {
        C9526q b = m32196b("getEmptyRegistry");
        return b != null ? b : C9526q.f25465c;
    }

    /* renamed from: b */
    private static final C9526q m32196b(String str) {
        Class<?> cls = f25454a;
        if (cls == null) {
            return null;
        }
        try {
            return (C9526q) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m32197c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
