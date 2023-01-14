package p174e.p181b.p182a.p193y;

import java.util.ArrayList;
import java.util.Collections;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5535c;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p189j.C5538f;
import p174e.p181b.p182a.p188w.p190k.C5551e;
import p174e.p181b.p182a.p188w.p190k.C5552f;
import p174e.p181b.p182a.p188w.p190k.C5565p;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.n */
class C5625n {

    /* renamed from: a */
    private static C5618c.C5619a f15938a = C5618c.C5619a.m20942a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C5618c.C5619a f15939b = C5618c.C5619a.m20942a("p", "k");

    /* renamed from: c */
    private static final C5618c.C5619a f15940c = C5618c.C5619a.m20942a("n", "v");

    /* renamed from: a */
    static C5551e m20977a(C5618c cVar, C5433e eVar) {
        C5618c cVar2 = cVar;
        C5433e eVar2 = eVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C5552f fVar = null;
        C5535c cVar3 = null;
        C5538f fVar2 = null;
        C5538f fVar3 = null;
        C5534b bVar = null;
        C5565p.C5567b bVar2 = null;
        C5565p.C5568c cVar4 = null;
        float f = 0.0f;
        C5534b bVar3 = null;
        boolean z = false;
        C5536d dVar = null;
        while (cVar.mo16860E()) {
            switch (cVar2.mo16872u0(f15938a)) {
                case 0:
                    str = cVar.mo16866e0();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo16867h();
                    while (cVar.mo16860E()) {
                        int u0 = cVar2.mo16872u0(f15939b);
                        C5535c cVar5 = cVar3;
                        if (u0 == 0) {
                            i = cVar.mo16863W();
                        } else if (u0 != 1) {
                            cVar.mo16873v0();
                            cVar.mo16874w0();
                        } else {
                            cVar3 = C5601d.m20899g(cVar2, eVar2, i);
                        }
                        cVar3 = cVar5;
                    }
                    C5535c cVar6 = cVar3;
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
                    bVar = C5601d.m20897e(cVar, eVar);
                    break;
                case 7:
                    bVar2 = C5565p.C5567b.values()[cVar.mo16863W() - 1];
                    break;
                case 8:
                    cVar4 = C5565p.C5568c.values()[cVar.mo16863W() - 1];
                    break;
                case 9:
                    f = (float) cVar.mo16862L();
                    break;
                case 10:
                    z = cVar.mo16861I();
                    break;
                case 11:
                    cVar.mo16865b();
                    while (cVar.mo16860E()) {
                        cVar.mo16867h();
                        String str2 = null;
                        C5534b bVar4 = null;
                        while (cVar.mo16860E()) {
                            int u02 = cVar2.mo16872u0(f15940c);
                            C5534b bVar5 = bVar3;
                            if (u02 != 0) {
                                if (u02 != 1) {
                                    cVar.mo16873v0();
                                    cVar.mo16874w0();
                                } else {
                                    bVar4 = C5601d.m20897e(cVar, eVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = cVar.mo16866e0();
                            }
                        }
                        C5534b bVar6 = bVar3;
                        cVar.mo16870r();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                eVar2.mo16476u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    C5534b bVar7 = bVar3;
                    cVar.mo16869o();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    break;
                default:
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new C5536d(Collections.singletonList(new C5417a(100)));
        }
        return new C5551e(str, fVar, cVar3, dVar, fVar2, fVar3, bVar, bVar2, cVar4, f, arrayList, bVar3, z);
    }
}
