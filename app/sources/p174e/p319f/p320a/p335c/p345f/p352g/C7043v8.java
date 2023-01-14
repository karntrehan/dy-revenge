package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.v8 */
final class C7043v8 implements C6771ea {

    /* renamed from: a */
    private static final C7043v8 f19023a = new C7043v8();

    private C7043v8() {
    }

    /* renamed from: c */
    public static C7043v8 m26930c() {
        return f19023a;
    }

    /* renamed from: a */
    public final C6754da mo19725a(Class cls) {
        Class<C6702a9> cls2 = C6702a9.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C6754da) C6702a9.m25419v(cls.asSubclass(cls2)).mo19497w(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo19726b(Class cls) {
        return C6702a9.class.isAssignableFrom(cls);
    }
}
