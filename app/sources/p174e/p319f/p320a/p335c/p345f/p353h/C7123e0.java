package p174e.p319f.p320a.p335c.p345f.p353h;

/* renamed from: e.f.a.c.f.h.e0 */
public final class C7123e0 {

    /* renamed from: a */
    private static C7121d0 f19096a;

    /* renamed from: a */
    public static synchronized C7148w m27108a(C7143r rVar) {
        C7148w wVar;
        synchronized (C7123e0.class) {
            if (f19096a == null) {
                f19096a = new C7121d0((C7119c0) null);
            }
            wVar = (C7148w) f19096a.mo24093b(rVar);
        }
        return wVar;
    }

    /* renamed from: b */
    public static synchronized C7148w m27109b(String str) {
        C7148w a;
        synchronized (C7123e0.class) {
            a = m27108a(C7143r.m27145d("common").mo20547c());
        }
        return a;
    }
}
