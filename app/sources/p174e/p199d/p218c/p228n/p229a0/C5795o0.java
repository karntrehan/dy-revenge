package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.o0 */
public class C5795o0 extends C5739i<C5797p0> {
    public C5795o0(C5797p0 p0Var) {
        super(p0Var);
    }

    /* renamed from: A */
    public String mo17628A() {
        return mo17193l(3, 2, "Custom", "Auto");
    }

    /* renamed from: B */
    public String mo17629B() {
        Integer l = ((C5797p0) this.f16215a).mo17148l(20);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 10) {
            return "ISO 100";
        }
        if (intValue == 16) {
            return "ISO 200";
        }
        if (intValue == 100) {
            return "ISO 100";
        }
        if (intValue == 200) {
            return "ISO 200";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: C */
    public String mo17630C() {
        return mo17194m(2, "Good", "Better", "Best");
    }

    /* renamed from: D */
    public String mo17631D() {
        return mo17194m(13, "Normal", "Low", "High");
    }

    /* renamed from: E */
    public String mo17632E() {
        return mo17194m(11, "Normal", "Soft", "Hard");
    }

    /* renamed from: F */
    public String mo17633F() {
        return mo17194m(7, "Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 1) {
            return mo17634v();
        }
        if (i == 2) {
            return mo17630C();
        }
        if (i == 3) {
            return mo17628A();
        }
        if (i == 4) {
            return mo17638z();
        }
        if (i == 7) {
            return mo17633F();
        }
        if (i == 20) {
            return mo17629B();
        }
        if (i == 23) {
            return mo17635w();
        }
        switch (i) {
            case 10:
                return mo17637y();
            case 11:
                return mo17632E();
            case 12:
                return mo17636x();
            case 13:
                return mo17631D();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17634v() {
        return mo17194m(1, "Auto", "Night-scene", "Manual", null, "Multiple");
    }

    /* renamed from: w */
    public String mo17635w() {
        return mo17193l(23, 1, "Normal", "Black & White", "Sepia");
    }

    /* renamed from: x */
    public String mo17636x() {
        return mo17194m(12, "Normal", "Low", "High");
    }

    /* renamed from: y */
    public String mo17637y() {
        Float i = ((C5797p0) this.f16215a).mo17145i(10);
        if (i == null) {
            return null;
        }
        return i.floatValue() == 0.0f ? "Off" : Float.toString(i.floatValue());
    }

    /* renamed from: z */
    public String mo17638z() {
        return mo17193l(4, 1, "Auto", "Flash On", null, "Flash Off", null, "Red-eye Reduction");
    }
}
