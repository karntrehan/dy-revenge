package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p189j.C5533a;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5543k;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.b */
public class C5597b {

    /* renamed from: a */
    private static C5618c.C5619a f15881a = C5618c.C5619a.m20942a("a");

    /* renamed from: b */
    private static C5618c.C5619a f15882b = C5618c.C5619a.m20942a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C5543k m20881a(C5618c cVar, C5433e eVar) {
        cVar.mo16867h();
        C5543k kVar = null;
        while (cVar.mo16860E()) {
            if (cVar.mo16872u0(f15881a) != 0) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                kVar = m20882b(cVar, eVar);
            }
        }
        cVar.mo16870r();
        return kVar == null ? new C5543k((C5533a) null, (C5533a) null, (C5534b) null, (C5534b) null) : kVar;
    }

    /* renamed from: b */
    private static C5543k m20882b(C5618c cVar, C5433e eVar) {
        cVar.mo16867h();
        C5533a aVar = null;
        C5533a aVar2 = null;
        C5534b bVar = null;
        C5534b bVar2 = null;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15882b);
            if (u0 == 0) {
                aVar = C5601d.m20895c(cVar, eVar);
            } else if (u0 == 1) {
                aVar2 = C5601d.m20895c(cVar, eVar);
            } else if (u0 == 2) {
                bVar = C5601d.m20897e(cVar, eVar);
            } else if (u0 != 3) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                bVar2 = C5601d.m20897e(cVar, eVar);
            }
        }
        cVar.mo16870r();
        return new C5543k(aVar, aVar2, bVar, bVar2);
    }
}
