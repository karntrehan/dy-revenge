package p174e.p319f.p320a.p335c.p345f.p352g;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.List;

/* renamed from: e.f.a.c.f.g.bf */
public final class C6725bf extends C6842j {

    /* renamed from: p */
    private final C6793ff f18407p;

    public C6725bf(C6793ff ffVar) {
        super("internal.registerCallback");
        this.f18407p = ffVar;
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        C7008t5.m26538h(this.f18539f, 3, list);
        String g = s4Var.mo20144b((C6954q) list.get(0)).mo19741g();
        C6954q b = s4Var.mo20144b((C6954q) list.get(1));
        if (b instanceof C6938p) {
            C6954q b2 = s4Var.mo20144b((C6954q) list.get(2));
            if (b2 instanceof C6906n) {
                C6906n nVar = (C6906n) b2;
                if (nVar.mo19746k("type")) {
                    this.f18407p.mo19787a(g, nVar.mo19746k("priority") ? C7008t5.m26532b(nVar.mo19749r("priority").mo19739d().doubleValue()) : RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, (C6938p) b, nVar.mo19749r("type").mo19741g());
                    return C6954q.f18804c;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
