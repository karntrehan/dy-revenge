package p174e.p199d.p218c.p231p;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.p.a */
public class C5845a extends C5739i<C5846b> {
    public C5845a(C5846b bVar) {
        super(bVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 1 ? super.mo17110f(i) : mo17772v();
    }

    /* renamed from: v */
    public String mo17772v() {
        Integer l = ((C5846b) this.f16215a).mo17148l(1);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "Infinite";
        }
        if (l.intValue() == 1) {
            return "Once";
        }
        if (l.intValue() == 2) {
            return "Twice";
        }
        return l.toString() + " times";
    }
}
