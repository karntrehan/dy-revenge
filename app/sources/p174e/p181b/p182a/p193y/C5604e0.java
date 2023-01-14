package p174e.p181b.p182a.p193y;

import android.graphics.Path;
import java.util.Collections;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p188w.p189j.C5533a;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p190k.C5562m;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.e0 */
class C5604e0 {

    /* renamed from: a */
    private static final C5618c.C5619a f15890a = C5618c.C5619a.m20942a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    static C5562m m20907a(C5618c cVar, C5433e eVar) {
        C5536d dVar = null;
        String str = null;
        C5533a aVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15890a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                aVar = C5601d.m20895c(cVar, eVar);
            } else if (u0 == 2) {
                dVar = C5601d.m20900h(cVar, eVar);
            } else if (u0 == 3) {
                z = cVar.mo16861I();
            } else if (u0 == 4) {
                i = cVar.mo16863W();
            } else if (u0 != 5) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                z2 = cVar.mo16861I();
            }
        }
        return new C5562m(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar == null ? new C5536d(Collections.singletonList(new C5417a(100))) : dVar, z2);
    }
}
