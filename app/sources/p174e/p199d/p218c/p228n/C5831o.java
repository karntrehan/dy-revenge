package p174e.p199d.p218c.p228n;

import java.text.DecimalFormat;
import p174e.p199d.p217b.C5708i;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.o */
public class C5831o extends C5739i<C5832p> {
    public C5831o(C5832p pVar) {
        super(pVar);
    }

    /* renamed from: H */
    private String m22191H() {
        return mo17202u(0, 1);
    }

    /* renamed from: A */
    public String mo17750A(int i) {
        String r = ((C5832p) this.f16215a).mo17153r(i);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if ("T".equalsIgnoreCase(trim)) {
            return "True direction";
        }
        if ("M".equalsIgnoreCase(trim)) {
            return "Magnetic direction";
        }
        return "Unknown (" + trim + ")";
    }

    /* renamed from: B */
    public String mo17751B() {
        C5708i W = ((C5832p) this.f16215a).mo17762W();
        if (W == null) {
            return null;
        }
        return C5708i.m21218b(W.mo17032d());
    }

    /* renamed from: C */
    public String mo17752C() {
        C5708i W = ((C5832p) this.f16215a).mo17762W();
        if (W == null) {
            return null;
        }
        return C5708i.m21218b(W.mo17033e());
    }

    /* renamed from: D */
    public String mo17753D() {
        String r = ((C5832p) this.f16215a).mo17153r(10);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if ("2".equalsIgnoreCase(trim)) {
            return "2-dimensional measurement";
        }
        if ("3".equalsIgnoreCase(trim)) {
            return "3-dimensional measurement";
        }
        return "Unknown (" + trim + ")";
    }

    /* renamed from: E */
    public String mo17754E() {
        String r = ((C5832p) this.f16215a).mo17153r(12);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if ("K".equalsIgnoreCase(trim)) {
            return "kph";
        }
        if ("M".equalsIgnoreCase(trim)) {
            return "mph";
        }
        if ("N".equalsIgnoreCase(trim)) {
            return "knots";
        }
        return "Unknown (" + trim + ")";
    }

    /* renamed from: F */
    public String mo17755F() {
        String r = ((C5832p) this.f16215a).mo17153r(9);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if ("A".equalsIgnoreCase(trim)) {
            return "Active (Measurement in progress)";
        }
        if ("V".equalsIgnoreCase(trim)) {
            return "Void (Measurement Interoperability)";
        }
        return "Unknown (" + trim + ")";
    }

    /* renamed from: G */
    public String mo17756G() {
        C5712m[] q = ((C5832p) this.f16215a).mo17152q(7);
        DecimalFormat decimalFormat = new DecimalFormat("00.000");
        if (q == null) {
            return null;
        }
        return String.format("%02d:%02d:%s UTC", new Object[]{Integer.valueOf(q[0].intValue()), Integer.valueOf(q[1].intValue()), decimalFormat.format(q[2].doubleValue())});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        return mo17761z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        return mo17750A(r2);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17110f(int r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0068
            r0 = 2
            if (r2 == r0) goto L_0x0063
            r0 = 12
            if (r2 == r0) goto L_0x005e
            r0 = 30
            if (r2 == r0) goto L_0x0059
            r0 = 4
            if (r2 == r0) goto L_0x0054
            r0 = 5
            if (r2 == r0) goto L_0x004f
            r0 = 6
            if (r2 == r0) goto L_0x004a
            r0 = 7
            if (r2 == r0) goto L_0x0045
            r0 = 9
            if (r2 == r0) goto L_0x0040
            r0 = 10
            if (r2 == r0) goto L_0x003b
            switch(r2) {
                case 14: goto L_0x0036;
                case 15: goto L_0x0031;
                case 16: goto L_0x0036;
                case 17: goto L_0x0031;
                default: goto L_0x0024;
            }
        L_0x0024:
            switch(r2) {
                case 23: goto L_0x0036;
                case 24: goto L_0x0031;
                case 25: goto L_0x002c;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.String r2 = super.mo17110f(r2)
            return r2
        L_0x002c:
            java.lang.String r2 = r1.mo17759x()
            return r2
        L_0x0031:
            java.lang.String r2 = r1.mo17761z(r2)
            return r2
        L_0x0036:
            java.lang.String r2 = r1.mo17750A(r2)
            return r2
        L_0x003b:
            java.lang.String r2 = r1.mo17753D()
            return r2
        L_0x0040:
            java.lang.String r2 = r1.mo17755F()
            return r2
        L_0x0045:
            java.lang.String r2 = r1.mo17756G()
            return r2
        L_0x004a:
            java.lang.String r2 = r1.mo17757v()
            return r2
        L_0x004f:
            java.lang.String r2 = r1.mo17758w()
            return r2
        L_0x0054:
            java.lang.String r2 = r1.mo17752C()
            return r2
        L_0x0059:
            java.lang.String r2 = r1.mo17760y()
            return r2
        L_0x005e:
            java.lang.String r2 = r1.mo17754E()
            return r2
        L_0x0063:
            java.lang.String r2 = r1.mo17751B()
            return r2
        L_0x0068:
            java.lang.String r2 = r1.m22191H()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p228n.C5831o.mo17110f(int):java.lang.String");
    }

    /* renamed from: v */
    public String mo17757v() {
        C5712m p = ((C5832p) this.f16215a).mo17151p(6);
        if (p == null) {
            return null;
        }
        return p.intValue() + " metres";
    }

    /* renamed from: w */
    public String mo17758w() {
        return mo17194m(5, "Sea level", "Below sea level");
    }

    /* renamed from: x */
    public String mo17759x() {
        String r = ((C5832p) this.f16215a).mo17153r(25);
        if (r == null) {
            return null;
        }
        String trim = r.trim();
        if ("K".equalsIgnoreCase(trim)) {
            return "kilometers";
        }
        if ("M".equalsIgnoreCase(trim)) {
            return "miles";
        }
        if ("N".equalsIgnoreCase(trim)) {
            return "knots";
        }
        return "Unknown (" + trim + ")";
    }

    /* renamed from: y */
    public String mo17760y() {
        return mo17194m(30, "No Correction", "Differential Corrected");
    }

    /* renamed from: z */
    public String mo17761z(int i) {
        C5712m p = ((C5832p) this.f16215a).mo17151p(i);
        String format = p != null ? new DecimalFormat("0.##").format(p.doubleValue()) : ((C5832p) this.f16215a).mo17153r(i);
        if (format == null || format.trim().length() == 0) {
            return null;
        }
        return format.trim() + " degrees";
    }
}
