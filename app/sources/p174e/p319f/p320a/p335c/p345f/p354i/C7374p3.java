package p174e.p319f.p320a.p335c.p345f.p354i;

import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4882e;

/* renamed from: e.f.a.c.f.i.p3 */
final class C7374p3 implements C4881d<C7429t2> {

    /* renamed from: a */
    static final C7374p3 f19819a = new C7374p3();

    /* renamed from: b */
    private static final C4878c f19820b;

    /* renamed from: c */
    private static final C4878c f19821c;

    /* renamed from: d */
    private static final C4878c f19822d;

    static {
        C4878c.C4880b a = C4878c.m18654a("logEventKey");
        C7498y1 y1Var = new C7498y1();
        y1Var.mo21005a(1);
        f19820b = a.mo14853b(y1Var.mo21006b()).mo14852a();
        C4878c.C4880b a2 = C4878c.m18654a("eventCount");
        C7498y1 y1Var2 = new C7498y1();
        y1Var2.mo21005a(2);
        f19821c = a2.mo14853b(y1Var2.mo21006b()).mo14852a();
        C4878c.C4880b a3 = C4878c.m18654a("inferenceDurationStats");
        C7498y1 y1Var3 = new C7498y1();
        y1Var3.mo21005a(3);
        f19822d = a3.mo14853b(y1Var3.mo21006b()).mo14852a();
    }

    private C7374p3() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10875a(Object obj, Object obj2) {
        C7429t2 t2Var = (C7429t2) obj;
        C4882e eVar = (C4882e) obj2;
        eVar.mo14857f(f19820b, t2Var.mo20935a());
        eVar.mo14857f(f19821c, t2Var.mo20937c());
        eVar.mo14857f(f19822d, t2Var.mo20936b());
    }
}
