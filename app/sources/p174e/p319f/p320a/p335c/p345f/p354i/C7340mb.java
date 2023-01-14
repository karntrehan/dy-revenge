package p174e.p319f.p320a.p335c.p345f.p354i;

/* renamed from: e.f.a.c.f.i.mb */
public final class C7340mb {

    /* renamed from: a */
    private static C7340mb f19751a;

    private C7340mb() {
    }

    /* renamed from: a */
    public static synchronized C7340mb m27358a() {
        C7340mb mbVar;
        synchronized (C7340mb.class) {
            if (f19751a == null) {
                f19751a = new C7340mb();
            }
            mbVar = f19751a;
        }
        return mbVar;
    }
}
