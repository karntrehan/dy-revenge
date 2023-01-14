package p174e.p319f.p320a.p335c.p345f.p354i;

/* renamed from: e.f.a.c.f.i.kb */
public final class C7312kb {

    /* renamed from: a */
    private static C7298jb f19520a;

    /* renamed from: a */
    public static synchronized C7521za m27336a(C7423sa saVar) {
        C7521za zaVar;
        synchronized (C7312kb.class) {
            if (f19520a == null) {
                f19520a = new C7298jb((C7284ib) null);
            }
            zaVar = (C7521za) f19520a.mo24093b(saVar);
        }
        return zaVar;
    }

    /* renamed from: b */
    public static synchronized C7521za m27337b(String str) {
        C7521za a;
        synchronized (C7312kb.class) {
            a = m27336a(C7423sa.m27474d(str).mo20846c());
        }
        return a;
    }
}
