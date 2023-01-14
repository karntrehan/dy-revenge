package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.k */
public final /* synthetic */ class C6858k {
    /* renamed from: a */
    public static C6954q m26039a(C6890m mVar, C6954q qVar, C6991s4 s4Var, List list) {
        if (mVar.mo19746k(qVar.mo19741g())) {
            C6954q r = mVar.mo19749r(qVar.mo19741g());
            if (r instanceof C6842j) {
                return ((C6842j) r).mo19542a(s4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo19741g()}));
        } else if ("hasOwnProperty".equals(qVar.mo19741g())) {
            C7008t5.m26538h("hasOwnProperty", 1, list);
            return mVar.mo19746k(s4Var.mo20144b((C6954q) list.get(0)).mo19741g()) ? C6954q.f18809i : C6954q.f18810j;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo19741g()}));
        }
    }

    /* renamed from: b */
    public static Iterator m26040b(Map map) {
        return new C6874l(map.keySet().iterator());
    }
}
