package p174e.p181b.p182a.p193y;

import java.util.ArrayList;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p188w.p190k.C5548b;
import p174e.p181b.p182a.p188w.p190k.C5563n;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.f0 */
class C5606f0 {

    /* renamed from: a */
    private static C5618c.C5619a f15892a = C5618c.C5619a.m20942a("nm", "hd", "it");

    /* renamed from: a */
    static C5563n m20910a(C5618c cVar, C5433e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15892a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                z = cVar.mo16861I();
            } else if (u0 != 2) {
                cVar.mo16874w0();
            } else {
                cVar.mo16865b();
                while (cVar.mo16860E()) {
                    C5548b a = C5607g.m20911a(cVar, eVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                cVar.mo16869o();
            }
        }
        return new C5563n(str, arrayList, z);
    }
}
