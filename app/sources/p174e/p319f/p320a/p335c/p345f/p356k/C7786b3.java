package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;

/* renamed from: e.f.a.c.f.k.b3 */
final class C7786b3 implements C4881d<C7850g2> {

    /* renamed from: a */
    static final C7786b3 f21103a = new C7786b3();

    /* renamed from: b */
    private static final C4878c f21104b;

    /* renamed from: c */
    private static final C4878c f21105c;

    /* renamed from: d */
    private static final C4878c f21106d;

    static {
        C4878c.C4880b a = C4878c.m18654a("logEventKey");
        C7888j1 j1Var = new C7888j1();
        j1Var.mo21417a(1);
        f21104b = a.mo14853b(j1Var.mo21418b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("eventCount");
        C7888j1 j1Var2 = new C7888j1();
        j1Var2.mo21417a(2);
        f21105c = a2.mo14853b(j1Var2.mo21418b()).mo14852a();
        C4878c.C4880b a3 = C4878c.m18654a("inferenceDurationStats");
        C7888j1 j1Var3 = new C7888j1();
        j1Var3.mo21417a(3);
        f21106d = a3.mo14853b(j1Var3.mo21418b()).mo14852a();
    }

    private C7786b3() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10875a(Object obj, Object obj2) {
        C7850g2 g2Var = (C7850g2) obj;
        C4882e eVar = (C4882e) obj2;
        eVar.mo14857f(f21104b, g2Var.mo21352a());
        eVar.mo14857f(f21105c, g2Var.mo21354c());
        eVar.mo14857f(f21106d, g2Var.mo21353b());
    }
}
