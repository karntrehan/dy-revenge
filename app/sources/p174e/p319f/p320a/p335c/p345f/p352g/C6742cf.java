package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: e.f.a.c.f.g.cf */
public final class C6742cf extends C6842j {

    /* renamed from: p */
    private final C7042v7 f18424p;

    /* renamed from: q */
    final Map f18425q = new HashMap();

    public C6742cf(C7042v7 v7Var) {
        super("require");
        this.f18424p = v7Var;
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        C6954q qVar;
        C7008t5.m26538h("require", 1, list);
        String g = s4Var.mo20144b((C6954q) list.get(0)).mo19741g();
        if (this.f18425q.containsKey(g)) {
            return (C6954q) this.f18425q.get(g);
        }
        C7042v7 v7Var = this.f18424p;
        if (v7Var.f19022a.containsKey(g)) {
            try {
                qVar = (C6954q) ((Callable) v7Var.f19022a.get(g)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(g)));
            }
        } else {
            qVar = C6954q.f18804c;
        }
        if (qVar instanceof C6842j) {
            this.f18425q.put(g, (C6842j) qVar);
        }
        return qVar;
    }
}
