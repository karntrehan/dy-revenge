package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.a0 */
public class C5761a0 extends C5739i<C5764b0> {
    public C5761a0(C5764b0 b0Var) {
        super(b0Var);
    }

    /* renamed from: A */
    public String mo17302A() {
        C5712m p = ((C5764b0) this.f16215a).mo17151p(773);
        if (p == null || p.mo17078z() == 4294967295L || p.mo17078z() == 0) {
            return "inf";
        }
        return (((double) p.mo17078z()) / 1000.0d) + " m";
    }

    /* renamed from: B */
    public String mo17303B() {
        return mo17202u(0, 4);
    }

    /* renamed from: C */
    public String mo17304C() {
        byte[] e = ((C5764b0) this.f16215a).mo17141e(5632);
        if (e == null) {
            return null;
        }
        if ((e[0] | e[1] | e[2] | e[3]) == 0) {
            return "Off";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("On, ");
        sb.append((e[43] & 1) > 0 ? "Mode 1" : "Mode 2");
        return sb.toString();
    }

    /* renamed from: D */
    public String mo17305D() {
        return mo17194m(4618, "Off", "On");
    }

    /* renamed from: E */
    public String mo17306E() {
        int[] k = ((C5764b0) this.f16215a).mo17147k(4617);
        if (k == null) {
            return null;
        }
        if (((short) k[0]) == 0) {
            return "Off";
        }
        if (((short) k[1]) == 1) {
            return "Full";
        }
        return "On (1/" + ((short) k[1]) + " strength)";
    }

    /* renamed from: F */
    public String mo17307F() {
        return ((C5764b0) this.f16215a).mo17153r(5376);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 0 ? i != 521 ? i != 773 ? i != 776 ? i != 4609 ? i != 5376 ? i != 5632 ? i != 4612 ? i != 4613 ? i != 4617 ? i != 4618 ? super.mo17110f(i) : mo17305D() : mo17306E() : mo17312z() : mo17310x() : mo17304C() : mo17307F() : mo17311y() : mo17308v() : mo17302A() : mo17309w() : mo17303B();
    }

    /* renamed from: v */
    public String mo17308v() {
        Integer l = ((C5764b0) this.f16215a).mo17148l(776);
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    /* renamed from: w */
    public String mo17309w() {
        return mo17194m(521, "Off", "On");
    }

    /* renamed from: x */
    public String mo17310x() {
        return mo17194m(4612, "Bounce or Off", "Direct");
    }

    /* renamed from: y */
    public String mo17311y() {
        int[] k = ((C5764b0) this.f16215a).mo17147k(4609);
        if (k == null || k.length < 2) {
            return null;
        }
        String format = String.format("%d %d", new Object[]{Short.valueOf((short) k[0]), Short.valueOf((short) k[1])});
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("1 0")) {
            return "On";
        }
        return "Unknown (" + format + ")";
    }

    /* renamed from: z */
    public String mo17312z() {
        int[] k = ((C5764b0) this.f16215a).mo17147k(4613);
        if (k == null) {
            Integer l = ((C5764b0) this.f16215a).mo17148l(4613);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        String format = String.format("%d", new Object[]{Short.valueOf((short) k[0])});
        if (k.length > 1) {
            format = format + " " + String.format("%d", new Object[]{Short.valueOf((short) k[1])});
        }
        if (format.equals("0")) {
            return "Off";
        }
        if (format.equals("1")) {
            return "On";
        }
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("1 0")) {
            return "On";
        }
        return "Unknown (" + format + ")";
    }
}
