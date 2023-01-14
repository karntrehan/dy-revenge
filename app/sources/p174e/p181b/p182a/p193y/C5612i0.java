package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.i0 */
class C5612i0 {

    /* renamed from: a */
    private static C5618c.C5619a f15900a = C5618c.C5619a.m20942a("s", "e", "o", "nm", "m", "hd");

    /* renamed from: a */
    static C5569q m20918a(C5618c cVar, C5433e eVar) {
        String str = null;
        C5569q.C5570a aVar = null;
        C5534b bVar = null;
        C5534b bVar2 = null;
        C5534b bVar3 = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15900a);
            if (u0 == 0) {
                bVar = C5601d.m20898f(cVar, eVar, false);
            } else if (u0 == 1) {
                bVar2 = C5601d.m20898f(cVar, eVar, false);
            } else if (u0 == 2) {
                bVar3 = C5601d.m20898f(cVar, eVar, false);
            } else if (u0 == 3) {
                str = cVar.mo16866e0();
            } else if (u0 == 4) {
                aVar = C5569q.C5570a.m20760e(cVar.mo16863W());
            } else if (u0 != 5) {
                cVar.mo16874w0();
            } else {
                z = cVar.mo16861I();
            }
        }
        return new C5569q(str, aVar, bVar, bVar2, bVar3, z);
    }
}
