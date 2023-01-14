package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5545m;
import p174e.p181b.p182a.p188w.p190k.C5557i;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.z */
class C5639z {

    /* renamed from: a */
    private static final C5618c.C5619a f15960a = C5618c.C5619a.m20942a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    static C5557i m21012a(C5618c cVar, C5433e eVar) {
        String str = null;
        C5557i.C5558a aVar = null;
        C5534b bVar = null;
        C5545m<PointF, PointF> mVar = null;
        C5534b bVar2 = null;
        C5534b bVar3 = null;
        C5534b bVar4 = null;
        C5534b bVar5 = null;
        C5534b bVar6 = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            switch (cVar.mo16872u0(f15960a)) {
                case 0:
                    str = cVar.mo16866e0();
                    break;
                case 1:
                    aVar = C5557i.C5558a.m20708e(cVar.mo16863W());
                    break;
                case 2:
                    bVar = C5601d.m20898f(cVar, eVar, false);
                    break;
                case 3:
                    mVar = C5595a.m20879b(cVar, eVar);
                    break;
                case 4:
                    bVar2 = C5601d.m20898f(cVar, eVar, false);
                    break;
                case 5:
                    bVar4 = C5601d.m20897e(cVar, eVar);
                    break;
                case 6:
                    bVar6 = C5601d.m20898f(cVar, eVar, false);
                    break;
                case 7:
                    bVar3 = C5601d.m20897e(cVar, eVar);
                    break;
                case 8:
                    bVar5 = C5601d.m20898f(cVar, eVar, false);
                    break;
                case 9:
                    z = cVar.mo16861I();
                    break;
                default:
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                    break;
            }
        }
        return new C5557i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
