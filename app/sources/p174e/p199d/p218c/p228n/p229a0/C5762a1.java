package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.a1 */
public class C5762a1 extends C5739i<C5765b1> {
    public C5762a1(C5765b1 b1Var) {
        super(b1Var);
    }

    /* renamed from: v */
    private String m21603v() {
        String r = ((C5765b1) this.f16215a).mo17153r(8);
        if (r == null || r.length() == 0) {
            return null;
        }
        char charAt = r.charAt(0);
        return charAt != 'A' ? charAt != 'M' ? charAt != 'P' ? charAt != 'S' ? r : "Shutter Speed Priority AE" : "Program AE" : "Manual" : "Aperture Priority AE";
    }

    /* renamed from: w */
    private String m21604w() {
        String r = ((C5765b1) this.f16215a).mo17153r(9);
        if (r == null || r.length() == 0) {
            return null;
        }
        char charAt = r.charAt(0);
        return charAt != '8' ? charAt != 'A' ? charAt != 'C' ? r : "Center Weighted Average" : "Average" : "Multi Segment";
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 8 ? i != 9 ? super.mo17110f(i) : m21604w() : m21603v();
    }
}
