package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.g.p */
public final class C6938p extends C6842j implements C6890m {

    /* renamed from: p */
    protected final List f18786p;

    /* renamed from: q */
    protected final List f18787q;

    /* renamed from: r */
    protected C6991s4 f18788r;

    private C6938p(C6938p pVar) {
        super(pVar.f18539f);
        ArrayList arrayList = new ArrayList(pVar.f18786p.size());
        this.f18786p = arrayList;
        arrayList.addAll(pVar.f18786p);
        ArrayList arrayList2 = new ArrayList(pVar.f18787q.size());
        this.f18787q = arrayList2;
        arrayList2.addAll(pVar.f18787q);
        this.f18788r = pVar.f18788r;
    }

    public C6938p(String str, List list, List list2, C6991s4 s4Var) {
        super(str);
        this.f18786p = new ArrayList();
        this.f18788r = s4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f18786p.add(((C6954q) it.next()).mo19741g());
            }
        }
        this.f18787q = new ArrayList(list2);
    }

    /* renamed from: a */
    public final C6954q mo19542a(C6991s4 s4Var, List list) {
        C6954q qVar;
        String str;
        C6991s4 a = this.f18788r.mo20143a();
        for (int i = 0; i < this.f18786p.size(); i++) {
            if (i < list.size()) {
                str = (String) this.f18786p.get(i);
                qVar = s4Var.mo20144b((C6954q) list.get(i));
            } else {
                str = (String) this.f18786p.get(i);
                qVar = C6954q.f18804c;
            }
            a.mo20147e(str, qVar);
        }
        for (C6954q qVar2 : this.f18787q) {
            C6954q b = a.mo20144b(qVar2);
            if (b instanceof C6970r) {
                b = a.mo20144b(qVar2);
            }
            if (b instanceof C6810h) {
                return ((C6810h) b).mo19807a();
            }
        }
        return C6954q.f18804c;
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        return new C6938p(this);
    }
}
