package p174e.p181b.p182a.p193y;

import android.graphics.Path;
import java.util.Collections;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5535c;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p189j.C5538f;
import p174e.p181b.p182a.p188w.p190k.C5550d;
import p174e.p181b.p182a.p188w.p190k.C5552f;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.m */
class C5624m {

    /* renamed from: a */
    private static final C5618c.C5619a f15936a = C5618c.C5619a.m20942a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final C5618c.C5619a f15937b = C5618c.C5619a.m20942a("p", "k");

    /* renamed from: a */
    static C5550d m20976a(C5618c cVar, C5433e eVar) {
        C5536d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        C5552f fVar = null;
        C5535c cVar2 = null;
        C5538f fVar2 = null;
        C5538f fVar3 = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            switch (cVar.mo16872u0(f15936a)) {
                case 0:
                    str = cVar.mo16866e0();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo16867h();
                    while (cVar.mo16860E()) {
                        int u0 = cVar.mo16872u0(f15937b);
                        if (u0 == 0) {
                            i = cVar.mo16863W();
                        } else if (u0 != 1) {
                            cVar.mo16873v0();
                            cVar.mo16874w0();
                        } else {
                            cVar2 = C5601d.m20899g(cVar, eVar, i);
                        }
                    }
                    cVar.mo16870r();
                    break;
                case 2:
                    dVar = C5601d.m20900h(cVar, eVar);
                    break;
                case 3:
                    fVar = cVar.mo16863W() == 1 ? C5552f.LINEAR : C5552f.RADIAL;
                    break;
                case 4:
                    fVar2 = C5601d.m20901i(cVar, eVar);
                    break;
                case 5:
                    fVar3 = C5601d.m20901i(cVar, eVar);
                    break;
                case 6:
                    fillType = cVar.mo16863W() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = cVar.mo16861I();
                    break;
                default:
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                    break;
            }
        }
        return new C5550d(str, fVar, fillType, cVar2, dVar == null ? new C5536d(Collections.singletonList(new C5417a(100))) : dVar, fVar2, fVar3, (C5534b) null, (C5534b) null, z);
    }
}
