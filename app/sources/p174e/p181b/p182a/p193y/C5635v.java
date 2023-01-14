package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.p188w.p190k.C5555h;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.v */
class C5635v {

    /* renamed from: a */
    private static final C5618c.C5619a f15957a = C5618c.C5619a.m20942a("nm", "mm", "hd");

    /* renamed from: a */
    static C5555h m21006a(C5618c cVar) {
        String str = null;
        C5555h.C5556a aVar = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15957a);
            if (u0 == 0) {
                str = cVar.mo16866e0();
            } else if (u0 == 1) {
                aVar = C5555h.C5556a.m20696e(cVar.mo16863W());
            } else if (u0 != 2) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                z = cVar.mo16861I();
            }
        }
        return new C5555h(str, aVar, z);
    }
}
