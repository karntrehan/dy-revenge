package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: e.f.a.c.f.g.ff */
public final class C6793ff {

    /* renamed from: a */
    final TreeMap f18496a = new TreeMap();

    /* renamed from: b */
    final TreeMap f18497b = new TreeMap();

    /* renamed from: c */
    private static final int m25719c(C6991s4 s4Var, C6938p pVar, C6954q qVar) {
        C6954q a = pVar.mo19542a(s4Var, Collections.singletonList(qVar));
        if (a instanceof C6826i) {
            return C7008t5.m26532b(a.mo19739d().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo19787a(String str, int i, C6938p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f18497b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f18496a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo19788b(C6991s4 s4Var, C6726c cVar) {
        C7028u9 u9Var = new C7028u9(cVar);
        for (Integer num : this.f18496a.keySet()) {
            C6709b b = cVar.mo19587b().clone();
            int c = m25719c(s4Var, (C6938p) this.f18496a.get(num), u9Var);
            if (c == 2 || c == -1) {
                cVar.mo19592f(b);
            }
        }
        for (Integer num2 : this.f18497b.keySet()) {
            m25719c(s4Var, (C6938p) this.f18497b.get(num2), u9Var);
        }
    }
}
