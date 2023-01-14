package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.p8 */
final class C6947p8 {

    /* renamed from: a */
    private static final C6915n8 f18795a = new C6931o8();

    /* renamed from: b */
    private static final C6915n8 f18796b;

    static {
        C6915n8 n8Var;
        try {
            n8Var = (C6915n8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n8Var = null;
        }
        f18796b = n8Var;
    }

    /* renamed from: a */
    static C6915n8 m26364a() {
        C6915n8 n8Var = f18796b;
        if (n8Var != null) {
            return n8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C6915n8 m26365b() {
        return f18795a;
    }
}
