package p174e.p319f.p320a.p335c.p344e;

/* renamed from: e.f.a.c.e.e */
public abstract class C6642e {

    /* renamed from: a */
    private static C6642e f18309a;

    /* renamed from: b */
    public static synchronized C6642e m25279b() {
        C6642e eVar;
        synchronized (C6642e.class) {
            if (f18309a == null) {
                f18309a = new C6639b();
            }
            eVar = f18309a;
        }
        return eVar;
    }

    /* renamed from: a */
    public abstract C6643f<Boolean> mo19448a(String str, boolean z);
}
