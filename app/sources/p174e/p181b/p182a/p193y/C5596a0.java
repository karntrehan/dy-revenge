package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5538f;
import p174e.p181b.p182a.p188w.p189j.C5545m;
import p174e.p181b.p182a.p188w.p190k.C5559j;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.a0 */
class C5596a0 {

    /* renamed from: a */
    private static C5618c.C5619a f15880a = C5618c.C5619a.m20942a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static C5559j m20880a(C5618c cVar, C5433e eVar) {
        String str = null;
        C5545m<PointF, PointF> mVar = null;
        C5538f fVar = null;
        C5534b bVar = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15880a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                mVar = C5595a.m20879b(cVar, eVar);
            } else if (u0 == 2) {
                fVar = C5601d.m20901i(cVar, eVar);
            } else if (u0 == 3) {
                bVar = C5601d.m20897e(cVar, eVar);
            } else if (u0 != 4) {
                cVar.mo16874w0();
            } else {
                z = cVar.mo16861I();
            }
        }
        return new C5559j(str, mVar, fVar, bVar, z);
    }
}
