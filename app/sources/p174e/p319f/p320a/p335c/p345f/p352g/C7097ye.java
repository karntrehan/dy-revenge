package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e.f.a.c.f.g.ye */
final class C7097ye extends C6842j {

    /* renamed from: p */
    final boolean f19071p;

    /* renamed from: q */
    final boolean f19072q;

    /* renamed from: r */
    final /* synthetic */ C7113ze f19073r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7097ye(C7113ze zeVar, boolean z, boolean z2) {
        super("log");
        this.f19073r = zeVar;
        this.f19071p = z;
        this.f19072q = z2;
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        List arrayList;
        C7081xe e;
        C7008t5.m26539i("log", 1, list);
        if (list.size() == 1) {
            this.f19073r.f19088p.mo11848a(3, s4Var.mo20144b((C6954q) list.get(0)).mo19741g(), Collections.emptyList(), this.f19071p, this.f19072q);
        } else {
            int b = C7008t5.m26532b(s4Var.mo20144b((C6954q) list.get(0)).mo19739d().doubleValue());
            int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
            String g = s4Var.mo20144b((C6954q) list.get(1)).mo19741g();
            if (list.size() == 2) {
                e = this.f19073r.f19088p;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(s4Var.mo20144b((C6954q) list.get(i2)).mo19741g());
                }
                e = this.f19073r.f19088p;
            }
            e.mo11848a(i, g, arrayList, this.f19071p, this.f19072q);
        }
        return C6954q.f18804c;
    }
}
