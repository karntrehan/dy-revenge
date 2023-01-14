package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;

/* renamed from: e.f.a.c.f.k.k4 */
final class C7904k4 implements C4881d<C7816d7> {

    /* renamed from: a */
    static final C7904k4 f21534a = new C7904k4();

    /* renamed from: b */
    private static final C4878c f21535b;

    /* renamed from: c */
    private static final C4878c f21536c;

    /* renamed from: d */
    private static final C4878c f21537d;

    /* renamed from: e */
    private static final C4878c f21538e;

    /* renamed from: f */
    private static final C4878c f21539f;

    /* renamed from: g */
    private static final C4878c f21540g;

    static {
        C4878c.C4880b a = C4878c.m18654a("maxMs");
        C7888j1 j1Var = new C7888j1();
        j1Var.mo21417a(1);
        f21535b = a.mo14853b(j1Var.mo21418b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("minMs");
        C7888j1 j1Var2 = new C7888j1();
        j1Var2.mo21417a(2);
        f21536c = a2.mo14853b(j1Var2.mo21418b()).mo14852a();
        C4878c.C4880b a3 = C4878c.m18654a("avgMs");
        C7888j1 j1Var3 = new C7888j1();
        j1Var3.mo21417a(3);
        f21537d = a3.mo14853b(j1Var3.mo21418b()).mo14852a();
        C4878c.C4880b a4 = C4878c.m18654a("firstQuartileMs");
        C7888j1 j1Var4 = new C7888j1();
        j1Var4.mo21417a(4);
        f21538e = a4.mo14853b(j1Var4.mo21418b()).mo14852a();
        C4878c.C4880b a5 = C4878c.m18654a("medianMs");
        C7888j1 j1Var5 = new C7888j1();
        j1Var5.mo21417a(5);
        f21539f = a5.mo14853b(j1Var5.mo21418b()).mo14852a();
        C4878c.C4880b a6 = C4878c.m18654a("thirdQuartileMs");
        C7888j1 j1Var6 = new C7888j1();
        j1Var6.mo21417a(6);
        f21540g = a6.mo14853b(j1Var6.mo21418b()).mo14852a();
    }

    private C7904k4() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10875a(Object obj, Object obj2) {
        C7816d7 d7Var = (C7816d7) obj;
        C4882e eVar = (C4882e) obj2;
        eVar.mo14857f(f21535b, d7Var.mo21266c());
        eVar.mo14857f(f21536c, d7Var.mo21268e());
        eVar.mo14857f(f21537d, d7Var.mo21264a());
        eVar.mo14857f(f21538e, d7Var.mo21265b());
        eVar.mo14857f(f21539f, d7Var.mo21267d());
        eVar.mo14857f(f21540g, d7Var.mo21269f());
    }
}
