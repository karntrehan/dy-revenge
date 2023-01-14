package p174e.p319f.p320a.p335c.p345f.p356k;

/* renamed from: e.f.a.c.f.k.wa */
public final class C8066wa {

    /* renamed from: a */
    private static C8053va f21953a;

    /* renamed from: a */
    public static synchronized C7923la m28279a(C7819da daVar) {
        C7923la laVar;
        synchronized (C8066wa.class) {
            if (f21953a == null) {
                f21953a = new C8053va((C8040ua) null);
            }
            laVar = (C7923la) f21953a.mo24093b(daVar);
        }
        return laVar;
    }

    /* renamed from: b */
    public static synchronized C7923la m28280b(String str) {
        C7923la a;
        synchronized (C8066wa.class) {
            a = m28279a(C7819da.m27928d(str).mo21226c());
        }
        return a;
    }
}
