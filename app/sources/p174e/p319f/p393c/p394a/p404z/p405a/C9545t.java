package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.t */
final class C9545t {

    /* renamed from: a */
    private static final C9530r<?> f25501a = new C9535s();

    /* renamed from: b */
    private static final C9530r<?> f25502b = m32387c();

    /* renamed from: a */
    static C9530r<?> m32385a() {
        C9530r<?> rVar = f25502b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C9530r<?> m32386b() {
        return f25501a;
    }

    /* renamed from: c */
    private static C9530r<?> m32387c() {
        try {
            return (C9530r) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
