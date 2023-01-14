package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.y0 */
public class C5815y0 extends C5739i<C5817z0> {
    public C5815y0(C5817z0 z0Var) {
        super(z0Var);
    }

    /* renamed from: A */
    private String m22136A() {
        return mo17194m(541, "Off", "On");
    }

    /* renamed from: B */
    private String m22137B() {
        return mo17194m(514, "Normal", "Macro", "View", "Manual");
    }

    /* renamed from: C */
    private String m22138C() {
        return mo17194m(537, "Off", "On");
    }

    /* renamed from: D */
    private String m22139D() {
        return mo17194m(531, "Off", "On");
    }

    /* renamed from: E */
    private String m22140E() {
        return mo17194m(535, "Record while down", "Press start, press stop");
    }

    /* renamed from: F */
    private String m22141F() {
        return mo17194m(542, "No", "Yes");
    }

    /* renamed from: H */
    private String m22142H() {
        return mo17194m(543, "Off", "Sport", "TV", "Night", "User 1", "User 2", "Lamp");
    }

    /* renamed from: I */
    private String m22143I() {
        return mo17194m(532, "Off", "On");
    }

    /* renamed from: J */
    private String m22144J() {
        return mo17194m(548, "5 frames/sec", "10 frames/sec", "15 frames/sec", "20 frames/sec");
    }

    /* renamed from: K */
    private String m22145K() {
        return mo17194m(526, "None", "Standard", "Best", "Adjust Exposure");
    }

    /* renamed from: L */
    private String m22146L() {
        return mo17194m(534, "Off", "On");
    }

    /* renamed from: M */
    private String m22147M() {
        return mo17194m(527, "Off", "On");
    }

    /* renamed from: v */
    private String m22148v() {
        return mo17194m(528, "Off", "On");
    }

    /* renamed from: w */
    private String m22149w() {
        return mo17189e(516, 3);
    }

    /* renamed from: x */
    private String m22150x() {
        return mo17194m(539, "Off", "On");
    }

    /* renamed from: y */
    private String m22151y() {
        return mo17194m(549, "Auto", "Force", "Disabled", "Red eye");
    }

    /* renamed from: z */
    private String m22152z() {
        return mo17194m(536, "Off", "On");
    }

    /* renamed from: G */
    public String mo17744G() {
        Integer l = ((C5817z0) this.f16215a).mo17148l(513);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        switch (intValue) {
            case 0:
                return "Normal/Very Low";
            case 1:
                return "Normal/Low";
            case 2:
                return "Normal/Medium Low";
            case 3:
                return "Normal/Medium";
            case 4:
                return "Normal/Medium High";
            case 5:
                return "Normal/High";
            case 6:
                return "Normal/Very High";
            case 7:
                return "Normal/Super High";
            default:
                switch (intValue) {
                    case 256:
                        return "Fine/Very Low";
                    case 257:
                        return "Fine/Low";
                    case 258:
                        return "Fine/Medium Low";
                    case 259:
                        return "Fine/Medium";
                    case 260:
                        return "Fine/Medium High";
                    case 261:
                        return "Fine/High";
                    case 262:
                        return "Fine/Very High";
                    case 263:
                        return "Fine/Super High";
                    default:
                        switch (intValue) {
                            case 512:
                                return "Super Fine/Very Low";
                            case 513:
                                return "Super Fine/Low";
                            case 514:
                                return "Super Fine/Medium Low";
                            case 515:
                                return "Super Fine/Medium";
                            case 516:
                                return "Super Fine/Medium High";
                            case 517:
                                return "Super Fine/High";
                            case 518:
                                return "Super Fine/Very High";
                            case 519:
                                return "Super Fine/Super High";
                            default:
                                return "Unknown (" + l + ")";
                        }
                }
        }
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 513) {
            return mo17744G();
        }
        if (i == 514) {
            return m22137B();
        }
        if (i == 516) {
            return m22149w();
        }
        if (i == 539) {
            return m22150x();
        }
        if (i == 531) {
            return m22139D();
        }
        if (i == 532) {
            return m22143I();
        }
        if (i == 548) {
            return m22144J();
        }
        if (i == 549) {
            return m22151y();
        }
        switch (i) {
            case 526:
                return m22145K();
            case 527:
                return m22147M();
            case 528:
                return m22148v();
            default:
                switch (i) {
                    case 534:
                        return m22146L();
                    case 535:
                        return m22140E();
                    case 536:
                        return m22152z();
                    case 537:
                        return m22138C();
                    default:
                        switch (i) {
                            case 541:
                                return m22136A();
                            case 542:
                                return m22141F();
                            case 543:
                                return m22142H();
                            default:
                                return super.mo17110f(i);
                        }
                }
        }
    }
}
