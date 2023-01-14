package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.y */
public final class C7082y {

    /* renamed from: a */
    final Map f19050a = new HashMap();

    /* renamed from: b */
    final C6875l0 f19051b = new C6875l0();

    public C7082y() {
        mo20442b(new C7050w());
        mo20442b(new C7098z());
        mo20442b(new C6693a0());
        mo20442b(new C6761e0());
        mo20442b(new C6843j0());
        mo20442b(new C6859k0());
        mo20442b(new C6891m0());
    }

    /* renamed from: a */
    public final C6954q mo20441a(C6991s4 s4Var, C6954q qVar) {
        C7008t5.m26533c(s4Var);
        if (!(qVar instanceof C6970r)) {
            return qVar;
        }
        C6970r rVar = (C6970r) qVar;
        ArrayList c = rVar.mo20117c();
        String a = rVar.mo20116a();
        return (this.f19050a.containsKey(a) ? (C7066x) this.f19050a.get(a) : this.f19051b).mo19484a(a, s4Var, c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20442b(C7066x xVar) {
        for (C6907n0 g : xVar.f19041a) {
            this.f19050a.put(g.mo19976g().toString(), xVar);
        }
    }
}
