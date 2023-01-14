package p174e.p319f.p320a.p335c.p345f.p358m;

import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;

/* renamed from: e.f.a.c.f.m.p4 */
final class C8786p4 implements C4881d<C8711j7> {

    /* renamed from: a */
    static final C8786p4 f23993a = new C8786p4();

    /* renamed from: b */
    private static final C4878c f23994b;

    /* renamed from: c */
    private static final C4878c f23995c;

    /* renamed from: d */
    private static final C4878c f23996d;

    /* renamed from: e */
    private static final C4878c f23997e;

    /* renamed from: f */
    private static final C4878c f23998f;

    /* renamed from: g */
    private static final C4878c f23999g;

    static {
        C4878c.C4880b a = C4878c.m18654a("maxMs");
        C8770o1 o1Var = new C8770o1();
        o1Var.mo22585a(1);
        f23994b = a.mo14853b(o1Var.mo22586b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("minMs");
        C8770o1 o1Var2 = new C8770o1();
        o1Var2.mo22585a(2);
        f23995c = a2.mo14853b(o1Var2.mo22586b()).mo14852a();
        C4878c.C4880b a3 = C4878c.m18654a("avgMs");
        C8770o1 o1Var3 = new C8770o1();
        o1Var3.mo22585a(3);
        f23996d = a3.mo14853b(o1Var3.mo22586b()).mo14852a();
        C4878c.C4880b a4 = C4878c.m18654a("firstQuartileMs");
        C8770o1 o1Var4 = new C8770o1();
        o1Var4.mo22585a(4);
        f23997e = a4.mo14853b(o1Var4.mo22586b()).mo14852a();
        C4878c.C4880b a5 = C4878c.m18654a("medianMs");
        C8770o1 o1Var5 = new C8770o1();
        o1Var5.mo22585a(5);
        f23998f = a5.mo14853b(o1Var5.mo22586b()).mo14852a();
        C4878c.C4880b a6 = C4878c.m18654a("thirdQuartileMs");
        C8770o1 o1Var6 = new C8770o1();
        o1Var6.mo22585a(6);
        f23999g = a6.mo14853b(o1Var6.mo22586b()).mo14852a();
    }

    private C8786p4() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10875a(Object obj, Object obj2) {
        C8711j7 j7Var = (C8711j7) obj;
        C4882e eVar = (C4882e) obj2;
        eVar.mo14857f(f23994b, j7Var.mo22491c());
        eVar.mo14857f(f23995c, j7Var.mo22493e());
        eVar.mo14857f(f23996d, j7Var.mo22489a());
        eVar.mo14857f(f23997e, j7Var.mo22490b());
        eVar.mo14857f(f23998f, j7Var.mo22492d());
        eVar.mo14857f(f23999g, j7Var.mo22494f());
    }
}
