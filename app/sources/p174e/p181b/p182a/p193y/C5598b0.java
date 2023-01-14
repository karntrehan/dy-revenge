package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5544l;
import p174e.p181b.p182a.p188w.p190k.C5560k;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.b0 */
class C5598b0 {

    /* renamed from: a */
    private static C5618c.C5619a f15883a = C5618c.C5619a.m20942a("nm", "c", "o", "tr", "hd");

    /* renamed from: a */
    static C5560k m20883a(C5618c cVar, C5433e eVar) {
        String str = null;
        C5534b bVar = null;
        C5534b bVar2 = null;
        C5544l lVar = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15883a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                bVar = C5601d.m20898f(cVar, eVar, false);
            } else if (u0 == 2) {
                bVar2 = C5601d.m20898f(cVar, eVar, false);
            } else if (u0 == 3) {
                lVar = C5599c.m20890g(cVar, eVar);
            } else if (u0 != 4) {
                cVar.mo16874w0();
            } else {
                z = cVar.mo16861I();
            }
        }
        return new C5560k(str, bVar, bVar2, lVar, z);
    }
}
