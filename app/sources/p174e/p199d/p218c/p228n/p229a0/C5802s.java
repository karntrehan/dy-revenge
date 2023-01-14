package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.s */
public class C5802s extends C5739i<C5804t> {
    public C5802s(C5804t tVar) {
        super(tVar);
    }

    /* renamed from: A */
    public String mo17640A() {
        return mo17194m(5, "Normal", "Bright +", "Bright -", "Contrast +", "Contrast -");
    }

    /* renamed from: B */
    public String mo17641B() {
        return mo17193l(3, 1, "VGA Basic", "VGA Normal", "VGA Fine", "SXGA Basic", "SXGA Normal", "SXGA Fine");
    }

    /* renamed from: C */
    public String mo17642C() {
        return mo17194m(7, "Auto", "Preset", "Daylight", "Incandescence", "Florescence", "Cloudy", "SpeedLight");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 3:
                return mo17641B();
            case 4:
                return mo17644w();
            case 5:
                return mo17640A();
            case 6:
                return mo17643v();
            case 7:
                return mo17642C();
            case 8:
                return mo17647z();
            case 10:
                return mo17646y();
            case 11:
                return mo17645x();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17643v() {
        return mo17194m(6, "ISO80", null, "ISO160", null, "ISO320", "ISO100");
    }

    /* renamed from: w */
    public String mo17644w() {
        return mo17193l(4, 1, "Color", "Monochrome");
    }

    /* renamed from: x */
    public String mo17645x() {
        return mo17194m(11, "None", "Fisheye converter");
    }

    /* renamed from: y */
    public String mo17646y() {
        C5712m p = ((C5804t) this.f16215a).mo17151p(10);
        if (p == null) {
            return null;
        }
        if (p.mo17078z() == 0) {
            return "No digital zoom";
        }
        return p.mo17064K(true) + "x digital zoom";
    }

    /* renamed from: z */
    public String mo17647z() {
        C5712m p = ((C5804t) this.f16215a).mo17151p(8);
        if (p == null) {
            return null;
        }
        return (p.mo17078z() == 1 && p.mo17077v() == 0) ? "Infinite" : p.mo17064K(true);
    }
}
