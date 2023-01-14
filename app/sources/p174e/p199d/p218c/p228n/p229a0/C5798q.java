package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.q */
public class C5798q extends C5739i<C5800r> {
    public C5798q(C5800r rVar) {
        super(rVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 1037 ? super.mo17110f(i) : mo17639v();
    }

    /* renamed from: v */
    public String mo17639v() {
        byte[] e = ((C5800r) this.f16215a).mo17141e(1037);
        if (e == null || e.length < 4) {
            return null;
        }
        String format = String.format("%d %d %d %d", new Object[]{Byte.valueOf(e[0]), Byte.valueOf(e[1]), Byte.valueOf(e[2]), Byte.valueOf(e[3])});
        if (format.equals("0 0 0 0")) {
            return "Program AE";
        }
        if (format.equals("1 0 0 0")) {
            return "Aperture-priority AE";
        }
        if (format.equals("1 1 0 0")) {
            return "Aperture-priority AE (1)";
        }
        if (format.equals("2 0 0 0")) {
            return "Shutter speed priority AE";
        }
        if (format.equals("3 0 0 0")) {
            return "Manual";
        }
        return String.format("Unknown (%s)", new Object[]{format});
    }
}
