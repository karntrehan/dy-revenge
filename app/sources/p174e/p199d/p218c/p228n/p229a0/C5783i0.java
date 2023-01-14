package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.i0 */
public class C5783i0 extends C5739i<C5785j0> {
    public C5783i0(C5785j0 j0Var) {
        super(j0Var);
    }

    /* renamed from: A */
    public String mo17538A() {
        return mo17202u(0, 4);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 0) {
            return mo17538A();
        }
        switch (i) {
            case 264:
                return mo17539v();
            case 265:
                return mo17541x();
            case 266:
                return mo17542y();
            case 267:
                return mo17540w();
            case 268:
                return mo17543z();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17539v() {
        return mo17194m(264, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    /* renamed from: w */
    public String mo17540w() {
        Integer l = ((C5785j0) this.f16215a).mo17148l(267);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Original";
        }
        if (intValue == 1) {
            return "Edited (Landscape)";
        }
        if (intValue == 6 || intValue == 8) {
            return "Edited (Portrait)";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: x */
    public String mo17541x() {
        return mo17194m(265, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
    }

    /* renamed from: y */
    public String mo17542y() {
        Integer l = ((C5785j0) this.f16215a).mo17148l(266);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("Noise Filter, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: z */
    public String mo17543z() {
        Integer l = ((C5785j0) this.f16215a).mo17148l(268);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append("WB Color Temp, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("WB Gray Point, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Saturation, ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append("Contrast, ");
        }
        if (((intValue >> 4) & 1) != 0) {
            sb.append("Sharpness, ");
        }
        if (((intValue >> 5) & 1) != 0) {
            sb.append("Color Space, ");
        }
        if (((intValue >> 6) & 1) != 0) {
            sb.append("High Function, ");
        }
        if (((intValue >> 7) & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
