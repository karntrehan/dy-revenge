package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.p188w.C5526c;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.k */
class C5615k {

    /* renamed from: a */
    private static final C5618c.C5619a f15903a = C5618c.C5619a.m20942a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C5526c m20921a(C5618c cVar) {
        cVar.mo16867h();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15903a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                str2 = cVar.mo16866e0();
            } else if (u0 == 2) {
                str3 = cVar.mo16866e0();
            } else if (u0 != 3) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                f = (float) cVar.mo16862L();
            }
        }
        cVar.mo16870r();
        return new C5526c(str, str2, str3, f);
    }
}
