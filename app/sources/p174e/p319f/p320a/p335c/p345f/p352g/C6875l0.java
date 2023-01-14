package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.l0 */
public final class C6875l0 extends C7066x {
    /* renamed from: a */
    public final C6954q mo19484a(String str, C6991s4 s4Var, List list) {
        if (str == null || str.isEmpty() || !s4Var.mo20150h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C6954q d = s4Var.mo20146d(str);
        if (d instanceof C6842j) {
            return ((C6842j) d).mo19542a(s4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
