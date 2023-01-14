package p174e.p319f.p320a.p335c.p345f.p355j;

/* renamed from: e.f.a.c.f.j.p7 */
public final class C7678p7 {

    /* renamed from: a */
    private static C7669o7 f20695a;

    /* renamed from: a */
    public static synchronized C7582f7 m27745a(C7767z6 z6Var) {
        C7582f7 f7Var;
        synchronized (C7678p7.class) {
            if (f20695a == null) {
                f20695a = new C7669o7((C7660n7) null);
            }
            f7Var = (C7582f7) f20695a.mo24093b(z6Var);
        }
        return f7Var;
    }

    /* renamed from: b */
    public static synchronized C7582f7 m27746b(String str) {
        C7582f7 a;
        synchronized (C7678p7.class) {
            a = m27745a(C7767z6.m27836d("vision-common").mo21183c());
        }
        return a;
    }
}
