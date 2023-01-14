package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.va */
final class C7045va extends C6842j {

    /* renamed from: p */
    final /* synthetic */ C7079xc f19027p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7045va(C7062wb wbVar, String str, C7079xc xcVar) {
        super("getValue");
        this.f19027p = xcVar;
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        C7008t5.m26538h("getValue", 2, list);
        C6954q b = s4Var.mo20144b((C6954q) list.get(0));
        C6954q b2 = s4Var.mo20144b((C6954q) list.get(1));
        String a = this.f19027p.mo11860a(b.mo19741g());
        return a != null ? new C7018u(a) : b2;
    }
}
