package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import java.util.ArrayList;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5537e;
import p174e.p181b.p182a.p188w.p189j.C5541i;
import p174e.p181b.p182a.p188w.p189j.C5545m;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.y.a */
public class C5595a {

    /* renamed from: a */
    private static final C5618c.C5619a f15879a = C5618c.C5619a.m20942a("k", "x", "y");

    /* renamed from: a */
    public static C5537e m20878a(C5618c cVar, C5433e eVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo16868n0() == C5618c.C5620b.BEGIN_ARRAY) {
            cVar.mo16865b();
            while (cVar.mo16860E()) {
                arrayList.add(C5636w.m21007a(cVar, eVar));
            }
            cVar.mo16869o();
            C5630r.m20996b(arrayList);
        } else {
            arrayList.add(new C5417a(C5627p.m20984e(cVar, C5647h.m21070e())));
        }
        return new C5537e(arrayList);
    }

    /* renamed from: b */
    static C5545m<PointF, PointF> m20879b(C5618c cVar, C5433e eVar) {
        cVar.mo16867h();
        C5537e eVar2 = null;
        C5534b bVar = null;
        C5534b bVar2 = null;
        boolean z = false;
        while (cVar.mo16868n0() != C5618c.C5620b.END_OBJECT) {
            int u0 = cVar.mo16872u0(f15879a);
            if (u0 != 0) {
                if (u0 != 1) {
                    if (u0 != 2) {
                        cVar.mo16873v0();
                        cVar.mo16874w0();
                    } else if (cVar.mo16868n0() != C5618c.C5620b.STRING) {
                        bVar2 = C5601d.m20897e(cVar, eVar);
                    }
                } else if (cVar.mo16868n0() != C5618c.C5620b.STRING) {
                    bVar = C5601d.m20897e(cVar, eVar);
                }
                cVar.mo16874w0();
                z = true;
            } else {
                eVar2 = m20878a(cVar, eVar);
            }
        }
        cVar.mo16870r();
        if (z) {
            eVar.mo16455a("Lottie doesn't support expressions.");
        }
        return eVar2 != null ? eVar2 : new C5541i(bVar, bVar2);
    }
}
