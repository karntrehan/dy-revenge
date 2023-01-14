package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.ze */
public final class C7113ze extends C6842j {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C7081xe f19088p;

    public C7113ze(C7081xe xeVar) {
        super("internal.logger");
        this.f19088p = xeVar;
        this.f18540o.put("log", new C7097ye(this, false, true));
        this.f18540o.put("silent", new C7096yd(this, "silent"));
        ((C6842j) this.f18540o.get("silent")).mo19747o("log", new C7097ye(this, true, true));
        this.f18540o.put("unmonitored", new C7065we(this, "unmonitored"));
        ((C6842j) this.f18540o.get("unmonitored")).mo19747o("log", new C7097ye(this, false, false));
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        return C6954q.f18804c;
    }
}
