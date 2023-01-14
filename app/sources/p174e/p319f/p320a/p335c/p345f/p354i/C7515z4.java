package p174e.p319f.p320a.p335c.p345f.p354i;

import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;

/* renamed from: e.f.a.c.f.i.z4 */
final class C7515z4 implements C4881d<C7434t7> {

    /* renamed from: a */
    static final C7515z4 f20219a = new C7515z4();

    /* renamed from: b */
    private static final C4878c f20220b;

    /* renamed from: c */
    private static final C4878c f20221c;

    /* renamed from: d */
    private static final C4878c f20222d;

    /* renamed from: e */
    private static final C4878c f20223e;

    /* renamed from: f */
    private static final C4878c f20224f;

    /* renamed from: g */
    private static final C4878c f20225g;

    static {
        C4878c.C4880b a = C4878c.m18654a("maxMs");
        C7498y1 y1Var = new C7498y1();
        y1Var.mo21005a(1);
        f20220b = a.mo14853b(y1Var.mo21006b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("minMs");
        C7498y1 y1Var2 = new C7498y1();
        y1Var2.mo21005a(2);
        f20221c = a2.mo14853b(y1Var2.mo21006b()).mo14852a();
        C4878c.C4880b a3 = C4878c.m18654a("avgMs");
        C7498y1 y1Var3 = new C7498y1();
        y1Var3.mo21005a(3);
        f20222d = a3.mo14853b(y1Var3.mo21006b()).mo14852a();
        C4878c.C4880b a4 = C4878c.m18654a("firstQuartileMs");
        C7498y1 y1Var4 = new C7498y1();
        y1Var4.mo21005a(4);
        f20223e = a4.mo14853b(y1Var4.mo21006b()).mo14852a();
        C4878c.C4880b a5 = C4878c.m18654a("medianMs");
        C7498y1 y1Var5 = new C7498y1();
        y1Var5.mo21005a(5);
        f20224f = a5.mo14853b(y1Var5.mo21006b()).mo14852a();
        C4878c.C4880b a6 = C4878c.m18654a("thirdQuartileMs");
        C7498y1 y1Var6 = new C7498y1();
        y1Var6.mo21005a(6);
        f20225g = a6.mo14853b(y1Var6.mo21006b()).mo14852a();
    }

    private C7515z4() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10875a(Object obj, Object obj2) {
        C7434t7 t7Var = (C7434t7) obj;
        C4882e eVar = (C4882e) obj2;
        eVar.mo14857f(f20220b, t7Var.mo20940c());
        eVar.mo14857f(f20221c, t7Var.mo20942e());
        eVar.mo14857f(f20222d, t7Var.mo20938a());
        eVar.mo14857f(f20223e, t7Var.mo20939b());
        eVar.mo14857f(f20224f, t7Var.mo20941d());
        eVar.mo14857f(f20225g, t7Var.mo20943f());
    }
}
