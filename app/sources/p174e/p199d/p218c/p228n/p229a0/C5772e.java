package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.e */
public class C5772e extends C5739i<C5775f> {
    public C5772e(C5775f fVar) {
        super(fVar);
    }

    /* renamed from: A */
    public String mo17392A() {
        return mo17193l(3, 2, "Macro", "Auto focus", "Manual focus", "Infinity");
    }

    /* renamed from: B */
    public String mo17393B() {
        Integer l = ((C5775f) this.f16215a).mo17148l(6);
        if (l == null) {
            return null;
        }
        return C5739i.m21433i((double) l.intValue());
    }

    /* renamed from: C */
    public String mo17394C() {
        return mo17193l(2, 1, "Economy", "Normal", "Fine");
    }

    /* renamed from: D */
    public String mo17395D() {
        return mo17193l(1, 1, "Single shutter", "Panorama", "Night scene", "Portrait", "Landscape");
    }

    /* renamed from: E */
    public String mo17396E() {
        return mo17194m(13, "Normal", "Low", "High");
    }

    /* renamed from: F */
    public String mo17397F() {
        return mo17194m(11, "Normal", "Soft", "Hard");
    }

    /* renamed from: G */
    public String mo17398G() {
        Integer l = ((C5775f) this.f16215a).mo17148l(7);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 2) {
            return "Tungsten";
        }
        if (intValue == 3) {
            return "Daylight";
        }
        if (intValue == 4) {
            return "Florescent";
        }
        if (intValue == 5) {
            return "Shade";
        }
        if (intValue == 129) {
            return "Manual";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 20) {
            return mo17399v();
        }
        switch (i) {
            case 1:
                return mo17395D();
            case 2:
                return mo17394C();
            case 3:
                return mo17392A();
            case 4:
                return mo17403z();
            case 5:
                return mo17402y();
            case 6:
                return mo17393B();
            case 7:
                return mo17398G();
            default:
                switch (i) {
                    case 10:
                        return mo17401x();
                    case 11:
                        return mo17397F();
                    case 12:
                        return mo17400w();
                    case 13:
                        return mo17396E();
                    default:
                        return super.mo17110f(i);
                }
        }
    }

    /* renamed from: v */
    public String mo17399v() {
        Integer l = ((C5775f) this.f16215a).mo17148l(20);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 64) {
            return "Normal";
        }
        if (intValue == 80) {
            return "Normal (ISO 80 equivalent)";
        }
        if (intValue == 100) {
            return "High";
        }
        if (intValue == 125) {
            return "+1.0";
        }
        if (intValue == 244) {
            return "+3.0";
        }
        if (intValue == 250) {
            return "+2.0";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: w */
    public String mo17400w() {
        return mo17194m(12, "Normal", "Low", "High");
    }

    /* renamed from: x */
    public String mo17401x() {
        Integer l = ((C5775f) this.f16215a).mo17148l(10);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 65536) {
            return "No digital zoom";
        }
        if (intValue == 65537 || intValue == 131072) {
            return "2x digital zoom";
        }
        if (intValue == 262144) {
            return "4x digital zoom";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: y */
    public String mo17402y() {
        Integer l = ((C5775f) this.f16215a).mo17148l(5);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 11) {
            return "Weak";
        }
        if (intValue == 13) {
            return "Normal";
        }
        if (intValue == 15) {
            return "Strong";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: z */
    public String mo17403z() {
        return mo17193l(4, 1, "Auto", "On", "Off", "Red eye reduction");
    }
}
