package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.HashMap;
import java.util.List;

/* renamed from: e.f.a.c.f.g.w8 */
public final class C7059w8 extends C6842j {

    /* renamed from: p */
    private final C6726c f19037p;

    public C7059w8(C6726c cVar) {
        super("internal.eventLogger");
        this.f19037p = cVar;
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        C7008t5.m26538h(this.f18539f, 3, list);
        String g = s4Var.mo20144b((C6954q) list.get(0)).mo19741g();
        long a = (long) C7008t5.m26531a(s4Var.mo20144b((C6954q) list.get(1)).mo19739d().doubleValue());
        C6954q b = s4Var.mo20144b((C6954q) list.get(2));
        this.f19037p.mo19591e(g, a, b instanceof C6906n ? C7008t5.m26537g((C6906n) b) : new HashMap());
        return C6954q.f18804c;
    }
}
