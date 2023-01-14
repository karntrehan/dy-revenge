package p174e.p181b.p182a.p193y;

import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p184u.p186c.C5512h;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.r */
class C5630r {

    /* renamed from: a */
    static C5618c.C5619a f15948a = C5618c.C5619a.m20942a("k");

    /* renamed from: a */
    static <T> List<C5417a<T>> m20995a(C5618c cVar, C5433e eVar, float f, C5614j0<T> j0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo16868n0() == C5618c.C5620b.STRING) {
            eVar.mo16455a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.mo16867h();
        while (cVar.mo16860E()) {
            if (cVar.mo16872u0(f15948a) != 0) {
                cVar.mo16874w0();
            } else if (cVar.mo16868n0() == C5618c.C5620b.BEGIN_ARRAY) {
                cVar.mo16865b();
                if (cVar.mo16868n0() == C5618c.C5620b.NUMBER) {
                    arrayList.add(C5629q.m20989c(cVar, eVar, f, j0Var, false, z));
                } else {
                    while (cVar.mo16860E()) {
                        arrayList.add(C5629q.m20989c(cVar, eVar, f, j0Var, true, z));
                    }
                }
                cVar.mo16869o();
            } else {
                arrayList.add(C5629q.m20989c(cVar, eVar, f, j0Var, false, z));
            }
        }
        cVar.mo16870r();
        m20996b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m20996b(List<? extends C5417a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C5417a aVar = (C5417a) list.get(i2);
            i2++;
            C5417a aVar2 = (C5417a) list.get(i2);
            aVar.f15120h = Float.valueOf(aVar2.f15119g);
            if (aVar.f15115c == null && (t = aVar2.f15114b) != null) {
                aVar.f15115c = t;
                if (aVar instanceof C5512h) {
                    ((C5512h) aVar).mo16638i();
                }
            }
        }
        C5417a aVar3 = (C5417a) list.get(i);
        if ((aVar3.f15114b == null || aVar3.f15115c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
