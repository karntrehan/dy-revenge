package p174e.p199d.p218c.p224j;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.j.a */
public class C5740a extends C5739i<C5741b> {
    public C5740a(C5741b bVar) {
        super(bVar);
    }

    /* renamed from: v */
    private String m21452v() {
        return mo17194m(3, "Unknown (RGB or CMYK)", "YCbCr", "YCCK");
    }

    /* renamed from: w */
    private String m21453w() {
        Integer l = ((C5741b) this.f16215a).mo17148l(0);
        if (l == null) {
            return null;
        }
        return l.intValue() == 100 ? "100" : Integer.toString(l.intValue());
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 0 ? i != 3 ? super.mo17110f(i) : m21452v() : m21453w();
    }
}
