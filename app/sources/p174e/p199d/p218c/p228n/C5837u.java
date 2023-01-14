package p174e.p199d.p218c.p228n;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.u */
public class C5837u extends C5739i<C5838v> {
    public C5837u(C5838v vVar) {
        super(vVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return (i == 1 || i == 5 || i == 9 || i == 13 || i == 17 || i == 21 || i == 25) ? mo17770v(i) : super.mo17110f(i);
    }

    /* renamed from: v */
    public String mo17770v(int i) {
        Integer l = ((C5838v) this.f16215a).mo17148l(i);
        if (l == null) {
            return null;
        }
        return super.mo17196o(l.shortValue());
    }
}
