package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.p0 */
final class C9524p0 {

    /* renamed from: a */
    private static final C9518n0 f25455a = m32200c();

    /* renamed from: b */
    private static final C9518n0 f25456b = new C9521o0();

    /* renamed from: a */
    static C9518n0 m32198a() {
        return f25455a;
    }

    /* renamed from: b */
    static C9518n0 m32199b() {
        return f25456b;
    }

    /* renamed from: c */
    private static C9518n0 m32200c() {
        try {
            return (C9518n0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
