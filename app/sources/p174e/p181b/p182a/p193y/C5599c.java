package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5420d;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p189j.C5537e;
import p174e.p181b.p182a.p188w.p189j.C5539g;
import p174e.p181b.p182a.p188w.p189j.C5541i;
import p174e.p181b.p182a.p188w.p189j.C5544l;
import p174e.p181b.p182a.p188w.p189j.C5545m;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.c */
public class C5599c {

    /* renamed from: a */
    private static final C5618c.C5619a f15884a = C5618c.C5619a.m20942a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final C5618c.C5619a f15885b = C5618c.C5619a.m20942a("k");

    /* renamed from: a */
    private static boolean m20884a(C5537e eVar) {
        return eVar == null || (eVar.mo16695c() && ((PointF) eVar.mo16694b().get(0).f15114b).equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    private static boolean m20885b(C5545m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof C5541i) && mVar.mo16695c() && ((PointF) mVar.mo16694b().get(0).f15114b).equals(0.0f, 0.0f));
    }

    /* renamed from: c */
    private static boolean m20886c(C5534b bVar) {
        return bVar == null || (bVar.mo16695c() && ((Float) ((C5417a) bVar.mo16694b().get(0)).f15114b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    private static boolean m20887d(C5539g gVar) {
        return gVar == null || (gVar.mo16695c() && ((C5420d) ((C5417a) gVar.mo16694b().get(0)).f15114b).mo16372a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m20888e(C5534b bVar) {
        return bVar == null || (bVar.mo16695c() && ((Float) ((C5417a) bVar.mo16694b().get(0)).f15114b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    private static boolean m20889f(C5534b bVar) {
        return bVar == null || (bVar.mo16695c() && ((Float) ((C5417a) bVar.mo16694b().get(0)).f15114b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C5544l m20890g(C5618c cVar, C5433e eVar) {
        C5618c cVar2 = cVar;
        C5433e eVar2 = eVar;
        boolean z = false;
        boolean z2 = cVar.mo16868n0() == C5618c.C5620b.BEGIN_OBJECT;
        if (z2) {
            cVar.mo16867h();
        }
        C5534b bVar = null;
        C5537e eVar3 = null;
        C5545m<PointF, PointF> mVar = null;
        C5539g gVar = null;
        C5534b bVar2 = null;
        C5534b bVar3 = null;
        C5536d dVar = null;
        C5534b bVar4 = null;
        C5534b bVar5 = null;
        while (cVar.mo16860E()) {
            switch (cVar2.mo16872u0(f15884a)) {
                case 0:
                    cVar.mo16867h();
                    while (cVar.mo16860E()) {
                        if (cVar2.mo16872u0(f15885b) != 0) {
                            cVar.mo16873v0();
                            cVar.mo16874w0();
                        } else {
                            eVar3 = C5595a.m20878a(cVar, eVar);
                        }
                    }
                    cVar.mo16870r();
                    break;
                case 1:
                    mVar = C5595a.m20879b(cVar, eVar);
                    break;
                case 2:
                    gVar = C5601d.m20902j(cVar, eVar);
                    break;
                case 3:
                    eVar2.mo16455a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C5601d.m20900h(cVar, eVar);
                    continue;
                case 6:
                    bVar4 = C5601d.m20898f(cVar2, eVar2, z);
                    continue;
                case 7:
                    bVar5 = C5601d.m20898f(cVar2, eVar2, z);
                    continue;
                case 8:
                    bVar2 = C5601d.m20898f(cVar2, eVar2, z);
                    continue;
                case 9:
                    bVar3 = C5601d.m20898f(cVar2, eVar2, z);
                    continue;
                default:
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                    break;
            }
            C5534b f = C5601d.m20898f(cVar2, eVar2, z);
            if (f.mo16694b().isEmpty()) {
                C5417a aVar = r1;
                C5417a aVar2 = new C5417a(eVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(eVar.mo16460f()));
                f.mo16694b().add(aVar);
            } else if (((C5417a) f.mo16694b().get(0)).f15114b == null) {
                f.mo16694b().set(0, new C5417a(eVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(eVar.mo16460f())));
                bVar = f;
                z = false;
            }
            bVar = f;
            z = false;
        }
        if (z2) {
            cVar.mo16870r();
        }
        C5537e eVar4 = m20884a(eVar3) ? null : eVar3;
        C5545m<PointF, PointF> mVar2 = m20885b(mVar) ? null : mVar;
        C5534b bVar6 = m20886c(bVar) ? null : bVar;
        if (m20887d(gVar)) {
            gVar = null;
        }
        return new C5544l(eVar4, mVar2, gVar, bVar6, dVar, bVar4, bVar5, m20889f(bVar2) ? null : bVar2, m20888e(bVar3) ? null : bVar3);
    }
}
