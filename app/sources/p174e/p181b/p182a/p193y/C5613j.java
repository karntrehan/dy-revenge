package p174e.p181b.p182a.p193y;

import java.util.ArrayList;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.C5527d;
import p174e.p181b.p182a.p188w.p190k.C5563n;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.j */
class C5613j {

    /* renamed from: a */
    private static final C5618c.C5619a f15901a = C5618c.C5619a.m20942a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final C5618c.C5619a f15902b = C5618c.C5619a.m20942a("shapes");

    /* renamed from: a */
    static C5527d m20919a(C5618c cVar, C5433e eVar) {
        ArrayList arrayList = new ArrayList();
        cVar.mo16867h();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15901a);
            if (u0 == 0) {
                c = cVar.mo16866e0().charAt(0);
            } else if (u0 == 1) {
                d = cVar.mo16862L();
            } else if (u0 == 2) {
                d2 = cVar.mo16862L();
            } else if (u0 == 3) {
                str = cVar.mo16866e0();
            } else if (u0 == 4) {
                str2 = cVar.mo16866e0();
            } else if (u0 != 5) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                cVar.mo16867h();
                while (cVar.mo16860E()) {
                    if (cVar.mo16872u0(f15902b) != 0) {
                        cVar.mo16873v0();
                        cVar.mo16874w0();
                    } else {
                        cVar.mo16865b();
                        while (cVar.mo16860E()) {
                            arrayList.add((C5563n) C5607g.m20911a(cVar, eVar));
                        }
                        cVar.mo16869o();
                    }
                }
                cVar.mo16870r();
            }
        }
        cVar.mo16870r();
        return new C5527d(arrayList, c, d, d2, str, str2);
    }
}
