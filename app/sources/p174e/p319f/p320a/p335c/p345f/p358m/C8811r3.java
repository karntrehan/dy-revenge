package p174e.p319f.p320a.p335c.p345f.p358m;

import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;

/* renamed from: e.f.a.c.f.m.r3 */
final class C8811r3 implements C4881d<C8862v2> {

    /* renamed from: a */
    static final C8811r3 f24037a = new C8811r3();

    /* renamed from: b */
    private static final C4878c f24038b;

    /* renamed from: c */
    private static final C4878c f24039c;

    /* renamed from: d */
    private static final C4878c f24040d;

    static {
        C4878c.C4880b a = C4878c.m18654a("logEventKey");
        C8770o1 o1Var = new C8770o1();
        o1Var.mo22585a(1);
        f24038b = a.mo14853b(o1Var.mo22586b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("eventCount");
        C8770o1 o1Var2 = new C8770o1();
        o1Var2.mo22585a(2);
        f24039c = a2.mo14853b(o1Var2.mo22586b()).mo14852a();
        C4878c.C4880b a3 = C4878c.m18654a("inferenceDurationStats");
        C8770o1 o1Var3 = new C8770o1();
        o1Var3.mo22585a(3);
        f24040d = a3.mo14853b(o1Var3.mo22586b()).mo14852a();
    }

    private C8811r3() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10875a(Object obj, Object obj2) {
        C8862v2 v2Var = (C8862v2) obj;
        C4882e eVar = (C4882e) obj2;
        eVar.mo14857f(f24038b, v2Var.mo22677a());
        eVar.mo14857f(f24039c, v2Var.mo22679c());
        eVar.mo14857f(f24040d, v2Var.mo22678b());
    }
}
