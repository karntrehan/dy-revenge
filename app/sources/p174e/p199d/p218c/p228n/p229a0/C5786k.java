package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.k */
public class C5786k extends C5739i<C5788l> {
    public C5786k(C5788l lVar) {
        super(lVar);
    }

    /* renamed from: A */
    public String mo17544A() {
        return mo17193l(9, 1, "Fine", "Normal");
    }

    /* renamed from: B */
    public String mo17545B() {
        return mo17194m(107, "Normal");
    }

    /* renamed from: C */
    public String mo17546C() {
        Integer l = ((C5788l) this.f16215a).mo17148l(27);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 8) {
            return "Aperture Priority";
        }
        if (intValue == 32) {
            return "Manual";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: D */
    public String mo17547D() {
        return mo17194m(64, "Auto", "Flash", "Tungsten", "Daylight");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 9 ? i != 10 ? i != 27 ? i != 56 ? i != 64 ? i != 102 ? i != 107 ? i != 92 ? i != 93 ? super.mo17110f(i) : mo17550x() : mo17551y() : mo17545B() : mo17549w() : mo17547D() : mo17552z() : mo17546C() : mo17548v() : mo17544A();
    }

    /* renamed from: v */
    public String mo17548v() {
        return mo17194m(10, "Off", "On");
    }

    /* renamed from: w */
    public String mo17549w() {
        Integer l = ((C5788l) this.f16215a).mo17148l(102);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "B&W";
        }
        if (intValue == 2) {
            return "Sepia";
        }
        if (intValue == 3) {
            return "B&W Yellow Filter";
        }
        if (intValue == 4) {
            return "B&W Red Filter";
        }
        if (intValue == 32) {
            return "Saturated Color";
        }
        if (intValue == 64) {
            return "Neutral Color";
        }
        if (intValue == 256) {
            return "Saturated Color";
        }
        if (intValue == 512) {
            return "Neutral Color";
        }
        if (intValue == 8192) {
            return "B&W";
        }
        if (intValue == 16384) {
            return "Sepia";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: x */
    public String mo17550x() {
        return mo17194m(93, "No", "Yes");
    }

    /* renamed from: y */
    public String mo17551y() {
        Integer l = ((C5788l) this.f16215a).mo17148l(92);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 1) {
            return "Fill Flash";
        }
        if (intValue == 2) {
            return "Off";
        }
        if (intValue == 3) {
            return "Red Eye";
        }
        if (intValue == 16) {
            return "Fill Flash";
        }
        if (intValue == 32) {
            return "Off";
        }
        if (intValue == 64) {
            return "Red Eye";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: z */
    public String mo17552z() {
        return mo17194m(56, "Normal", null, "Macro");
    }
}
