package p174e.p319f.p320a.p335c.p345f.p358m;

/* renamed from: e.f.a.c.f.m.sa */
public final class C8831sa {

    /* renamed from: a */
    private static C8818ra f24099a;

    /* renamed from: a */
    public static synchronized C8675ga m29685a(C8597aa aaVar) {
        C8675ga gaVar;
        synchronized (C8831sa.class) {
            if (f24099a == null) {
                f24099a = new C8818ra((C8805qa) null);
            }
            gaVar = (C8675ga) f24099a.mo24093b(aaVar);
        }
        return gaVar;
    }

    /* renamed from: b */
    public static synchronized C8675ga m29686b(String str) {
        C8675ga a;
        synchronized (C8831sa.class) {
            a = m29685a(C8597aa.m29369d(str).mo22700c());
        }
        return a;
    }
}
