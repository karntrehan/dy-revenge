package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.tc */
final class C8473tc {

    /* renamed from: a */
    private static final C8437rc<?> f23094a = new C8455sc();

    /* renamed from: b */
    private static final C8437rc<?> f23095b;

    static {
        C8437rc<?> rcVar;
        try {
            rcVar = (C8437rc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rcVar = null;
        }
        f23095b = rcVar;
    }

    /* renamed from: a */
    static C8437rc<?> m29055a() {
        C8437rc<?> rcVar = f23095b;
        if (rcVar != null) {
            return rcVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C8437rc<?> m29056b() {
        return f23094a;
    }
}
