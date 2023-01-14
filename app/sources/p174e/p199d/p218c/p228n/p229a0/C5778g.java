package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.g */
public class C5778g extends C5739i<C5780h> {
    public C5778g(C5780h hVar) {
        super(hVar);
    }

    /* renamed from: A */
    public String mo17479A() {
        return mo17194m(12311, "Off");
    }

    /* renamed from: B */
    public String mo17480B() {
        return mo17194m(8244, "Off");
    }

    /* renamed from: C */
    public String mo17481C() {
        Double h = ((C5780h) this.f16215a).mo17144h(29);
        if (h == null) {
            return null;
        }
        return C5739i.m21433i(h.doubleValue() / 10.0d);
    }

    /* renamed from: D */
    public String mo17482D() {
        return mo17194m(13, "Normal", "Macro");
    }

    /* renamed from: E */
    public String mo17483E() {
        Integer l = ((C5780h) this.f16215a).mo17148l(12291);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "Fixation";
        }
        if (intValue == 6) {
            return "Multi-Area Focus";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: F */
    public String mo17484F() {
        Integer l = ((C5780h) this.f16215a).mo17148l(9);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "640 x 480 pixels";
        }
        if (intValue == 36) {
            return "3008 x 2008 pixels";
        }
        if (intValue == 4) {
            return "1600 x 1200 pixels";
        }
        if (intValue == 5) {
            return "2048 x 1536 pixels";
        }
        switch (intValue) {
            case 20:
                return "2288 x 1712 pixels";
            case 21:
                return "2592 x 1944 pixels";
            case 22:
                return "2304 x 1728 pixels";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: G */
    public String mo17485G() {
        Integer l = ((C5780h) this.f16215a).mo17148l(20);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 3) {
            return "50";
        }
        if (intValue == 4) {
            return "64";
        }
        if (intValue == 6) {
            return "100";
        }
        if (intValue == 9) {
            return "200";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: H */
    public String mo17486H() {
        Integer l = ((C5780h) this.f16215a).mo17148l(8226);
        if (l == null) {
            return null;
        }
        return Integer.toString(l.intValue()) + " mm";
    }

    /* renamed from: I */
    public String mo17487I() {
        return mo17193l(12290, 3, "Fine");
    }

    /* renamed from: J */
    public String mo17488J() {
        return mo17193l(8, 1, "Fine", "Super Fine");
    }

    /* renamed from: K */
    public String mo17489K() {
        return mo17193l(12288, 2, "Normal");
    }

    /* renamed from: L */
    public String mo17490L() {
        return mo17194m(31, "-1", "Normal", "+1");
    }

    /* renamed from: M */
    public String mo17491M() {
        return mo17193l(12289, 1, "Off");
    }

    /* renamed from: N */
    public String mo17492N() {
        return mo17194m(33, "-1", "Normal", "+1");
    }

    /* renamed from: O */
    public String mo17493O() {
        int[] k = ((C5780h) this.f16215a).mo17147k(2);
        if (k == null || k.length != 2) {
            return ((C5780h) this.f16215a).mo17153r(2);
        }
        return k[0] + " x " + k[1] + " pixels";
    }

    /* renamed from: P */
    public String mo17494P() {
        return ((C5780h) this.f16215a).mo17153r(4);
    }

    /* renamed from: Q */
    public String mo17495Q() {
        Integer l = ((C5780h) this.f16215a).mo17148l(3);
        if (l == null) {
            return null;
        }
        return Integer.toString(l.intValue()) + " bytes";
    }

    /* renamed from: R */
    public String mo17496R() {
        return ((C5780h) this.f16215a).mo17153r(12294);
    }

    /* renamed from: S */
    public String mo17497S() {
        return mo17194m(25, "Auto", "Daylight", "Shade", "Tungsten", "Florescent", "Manual");
    }

    /* renamed from: T */
    public String mo17498T() {
        Integer l = ((C5780h) this.f16215a).mo17148l(8210);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Manual";
        }
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 4 || intValue == 12) {
            return "Flash";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: U */
    public String mo17499U() {
        return ((C5780h) this.f16215a).mo17153r(8209);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 2) {
            return mo17493O();
        }
        if (i == 3) {
            return mo17495Q();
        }
        if (i == 4) {
            return mo17494P();
        }
        if (i == 8) {
            return mo17488J();
        }
        if (i == 9) {
            return mo17484F();
        }
        if (i == 13) {
            return mo17482D();
        }
        if (i == 20) {
            return mo17485G();
        }
        if (i == 25) {
            return mo17497S();
        }
        if (i == 29) {
            return mo17481C();
        }
        if (i == 8192) {
            return mo17500v();
        }
        if (i == 8226) {
            return mo17486H();
        }
        if (i == 8244) {
            return mo17480B();
        }
        if (i == 12294) {
            return mo17496R();
        }
        if (i == 8209) {
            return mo17499U();
        }
        if (i == 8210) {
            return mo17498T();
        }
        switch (i) {
            case 31:
                return mo17490L();
            case 32:
                return mo17503y();
            case 33:
                return mo17492N();
            default:
                switch (i) {
                    case 12288:
                        return mo17489K();
                    case 12289:
                        return mo17491M();
                    case 12290:
                        return mo17487I();
                    case 12291:
                        return mo17483E();
                    default:
                        switch (i) {
                            case 12308:
                                return mo17501w();
                            case 12309:
                                return mo17502x();
                            case 12310:
                                return mo17504z();
                            case 12311:
                                return mo17479A();
                            default:
                                return super.mo17110f(i);
                        }
                }
        }
    }

    /* renamed from: v */
    public String mo17500v() {
        byte[] e = ((C5780h) this.f16215a).mo17141e(8192);
        if (e == null) {
            return null;
        }
        return "<" + e.length + " bytes of image data>";
    }

    /* renamed from: w */
    public String mo17501w() {
        return mo17194m(12308, "Off", "On");
    }

    /* renamed from: x */
    public String mo17502x() {
        return mo17194m(12309, "Off");
    }

    /* renamed from: y */
    public String mo17503y() {
        return mo17194m(32, "-1", "Normal", "+1");
    }

    /* renamed from: z */
    public String mo17504z() {
        return mo17194m(12310, "Off");
    }
}
