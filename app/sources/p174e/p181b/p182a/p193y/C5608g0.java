package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p189j.C5540h;
import p174e.p181b.p182a.p188w.p190k.C5564o;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.g0 */
class C5608g0 {

    /* renamed from: a */
    static C5618c.C5619a f15894a = C5618c.C5619a.m20942a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C5564o m20912a(C5618c cVar, C5433e eVar) {
        int i = 0;
        String str = null;
        C5540h hVar = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15894a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                i = cVar.mo16863W();
            } else if (u0 == 2) {
                hVar = C5601d.m20903k(cVar, eVar);
            } else if (u0 != 3) {
                cVar.mo16874w0();
            } else {
                z = cVar.mo16861I();
            }
        }
        return new C5564o(str, i, hVar, z);
    }
}
