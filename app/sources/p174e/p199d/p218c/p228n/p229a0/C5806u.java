package p174e.p199d.p218c.p228n.p229a0;

import java.text.DecimalFormat;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.u */
public class C5806u extends C5739i<C5808v> {
    public C5806u(C5808v vVar) {
        super(vVar);
    }

    /* renamed from: B */
    private String m22022B(int i) {
        int[] k = ((C5808v) this.f16215a).mo17147k(i);
        if (k == null || k.length < 2 || k.length < 3 || k[2] == 0) {
            return null;
        }
        return new DecimalFormat("0.##").format(((double) (k[0] * k[1])) / ((double) k[2])) + " EV";
    }

    /* renamed from: A */
    public String mo17648A() {
        C5712m p = ((C5808v) this.f16215a).mo17151p(134);
        if (p == null) {
            return null;
        }
        if (p.intValue() == 1) {
            return "No digital zoom";
        }
        return p.mo17064K(true) + "x digital zoom";
    }

    /* renamed from: C */
    public String mo17649C() {
        return m22022B(14);
    }

    /* renamed from: D */
    public String mo17650D() {
        return m22022B(28);
    }

    /* renamed from: E */
    public String mo17651E() {
        return mo17202u(1, 2);
    }

    /* renamed from: F */
    public String mo17652F() {
        return m22022B(24);
    }

    /* renamed from: G */
    public String mo17653G() {
        return m22022B(23);
    }

    /* renamed from: H */
    public String mo17654H() {
        return mo17194m(135, "Flash Not Used", "Manual Flash", null, "Flash Not Ready", null, null, null, "External Flash", "Fired, Commander Mode", "Fired, TTL Mode");
    }

    /* renamed from: I */
    public String mo17655I() {
        return mo17194m(177, "Off", "Minimal", "Low", null, "Normal", null, "High");
    }

    /* renamed from: J */
    public String mo17656J() {
        return mo17192k(146, "%s degrees");
    }

    /* renamed from: K */
    public String mo17657K() {
        int[] k = ((C5808v) this.f16215a).mo17147k(2);
        if (k == null) {
            return null;
        }
        if (k[0] != 0 || k[1] == 0) {
            return "Unknown (" + ((C5808v) this.f16215a).mo17153r(2) + ")";
        }
        return "ISO " + k[1];
    }

    /* renamed from: L */
    public String mo17658L() {
        return mo17195n(132);
    }

    /* renamed from: M */
    public String mo17659M() {
        return m22022B(139);
    }

    /* renamed from: N */
    public String mo17660N() {
        return mo17187c(131, new String[]{"AF", "MF"}, "D", "G", "VR");
    }

    /* renamed from: O */
    public String mo17661O() {
        return mo17193l(147, 1, "Lossy (Type 1)", null, "Uncompressed", null, null, null, "Lossless", "Lossy (Type 2)");
    }

    /* renamed from: P */
    public String mo17662P() {
        return mo17190g(182);
    }

    /* renamed from: Q */
    public String mo17663Q() {
        return m22022B(13);
    }

    /* renamed from: R */
    public String mo17664R() {
        return mo17187c(137, new String[]{"Single Frame", "Continuous"}, "Delay", null, "PC Control", "Exposure Bracketing", "Auto ISO", "White-Balance Bracketing", "IR Control");
    }

    /* renamed from: S */
    public String mo17665S() {
        Integer l = ((C5808v) this.f16215a).mo17148l(42);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Low";
        }
        if (intValue == 3) {
            return "Normal";
        }
        if (intValue == 5) {
            return "High";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 1) {
            return mo17651E();
        }
        if (i == 2) {
            return mo17657K();
        }
        if (i == 13) {
            return mo17663Q();
        }
        if (i == 14) {
            return mo17649C();
        }
        if (i == 18) {
            return mo17667w();
        }
        if (i == 28) {
            return mo17650D();
        }
        if (i == 30) {
            return mo17670z();
        }
        if (i == 34) {
            return mo17666v();
        }
        if (i == 42) {
            return mo17665S();
        }
        if (i == 139) {
            return mo17659M();
        }
        if (i == 141) {
            return mo17669y();
        }
        if (i == 177) {
            return mo17655I();
        }
        if (i == 182) {
            return mo17662P();
        }
        if (i == 23) {
            return mo17653G();
        }
        if (i == 24) {
            return mo17652F();
        }
        if (i == 131) {
            return mo17660N();
        }
        if (i == 132) {
            return mo17658L();
        }
        if (i == 146) {
            return mo17656J();
        }
        if (i == 147) {
            return mo17661O();
        }
        switch (i) {
            case 134:
                return mo17648A();
            case 135:
                return mo17654H();
            case 136:
                return mo17668x();
            case 137:
                return mo17664R();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17666v() {
        Integer l = ((C5808v) this.f16215a).mo17148l(34);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Light";
        }
        if (intValue == 3) {
            return "Normal";
        }
        if (intValue == 5) {
            return "High";
        }
        if (intValue == 7) {
            return "Extra High";
        }
        if (intValue == 65535) {
            return "Auto";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: w */
    public String mo17667w() {
        return m22022B(18);
    }

    /* renamed from: x */
    public String mo17668x() {
        int[] k = ((C5808v) this.f16215a).mo17147k(136);
        if (k == null) {
            return null;
        }
        if (k.length == 4 && k[0] == 0 && k[2] == 0 && k[3] == 0) {
            int i = k[1];
            if (i == 0) {
                return "Centre";
            }
            if (i == 1) {
                return "Top";
            }
            if (i == 2) {
                return "Bottom";
            }
            if (i == 3) {
                return "Left";
            }
            if (i == 4) {
                return "Right";
            }
            return "Unknown (" + k[1] + ")";
        }
        return "Unknown (" + ((C5808v) this.f16215a).mo17153r(136) + ")";
    }

    /* renamed from: y */
    public String mo17669y() {
        String r = ((C5808v) this.f16215a).mo17153r(141);
        if (r == null) {
            return null;
        }
        return r.startsWith("MODE1") ? "Mode I (sRGB)" : r;
    }

    /* renamed from: z */
    public String mo17670z() {
        return mo17193l(30, 1, "sRGB", "Adobe RGB");
    }
}
