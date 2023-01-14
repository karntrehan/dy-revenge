package p174e.p199d.p218c.p228n.p229a0;

import com.facebook.react.modules.clipboard.ClipboardModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.text.DecimalFormat;
import p027c.p028a.C1444j;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p218c.C5718a;
import p174e.p199d.p218c.C5728d;
import p174e.p199d.p218c.C5739i;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.d.c.n.a0.m0 */
public class C5791m0 extends C5739i<C5793n0> {

    /* renamed from: b */
    private static final String[] f16291b = {"Normal", "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", "Night Scenery", "Food", "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", ClipboardModule.NAME, "High Speed Continuous Shooting", "Intelligent Auto", null, "Multi-aspect", null, "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", null, null, null, null, "HDR"};

    public C5791m0(C5793n0 n0Var) {
        super(n0Var);
    }

    /* renamed from: H0 */
    private String m21898H0(int i) {
        byte[] e = ((C5793n0) this.f16215a).mo17141e(i);
        if (e == null) {
            return null;
        }
        C5700b bVar = new C5700b(e);
        try {
            int s = bVar.mo17054s(0);
            int s2 = bVar.mo17054s(2);
            if (s == -1 && s2 == 1) {
                return "Slim Low";
            }
            if (s == -3 && s2 == 2) {
                return "Slim High";
            }
            if (s == 0 && s2 == 0) {
                return "Off";
            }
            if (s == 1 && s2 == 1) {
                return "Stretch Low";
            }
            if (s == 3 && s2 == 2) {
                return "Stretch High";
            }
            return "Unknown (" + s + " " + s2 + ")";
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: N0 */
    private static String m21899N0(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* renamed from: v */
    private String m21900v(C5728d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < dVarArr.length) {
            sb.append("Face ");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(": ");
            sb.append(dVarArr[i].toString());
            sb.append("\n");
            i = i2;
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }

    /* renamed from: A */
    public String mo17557A() {
        StringBuilder sb;
        int i;
        int[] k = ((C5793n0) this.f16215a).mo17147k(15);
        if (k == null || k.length < 2) {
            return null;
        }
        int i2 = k[0];
        if (i2 == 0) {
            int i3 = k[1];
            if (i3 == 1) {
                return "Spot Mode On";
            }
            if (i3 == 16) {
                return "Spot Mode Off";
            }
            sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(k[0]);
            sb.append(" ");
            i = k[1];
        } else if (i2 == 1) {
            int i4 = k[1];
            if (i4 == 0) {
                return "Spot Focusing";
            }
            if (i4 == 1) {
                return "5-area";
            }
            sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(k[0]);
            sb.append(" ");
            i = k[1];
        } else if (i2 == 16) {
            int i5 = k[1];
            if (i5 == 0) {
                return "1-area";
            }
            if (i5 == 16) {
                return "1-area (high speed)";
            }
            sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(k[0]);
            sb.append(" ");
            i = k[1];
        } else if (i2 == 32) {
            int i6 = k[1];
            if (i6 == 0) {
                return "Auto or Face Detect";
            }
            if (i6 == 1) {
                return "3-area (left)";
            }
            if (i6 == 2) {
                return "3-area (center)";
            }
            if (i6 == 3) {
                return "3-area (right)";
            }
            sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(k[0]);
            sb.append(" ");
            i = k[1];
        } else if (i2 == 64) {
            return "Face Detect";
        } else {
            sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(k[0]);
            sb.append(" ");
            i = k[1];
        }
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: A0 */
    public String mo17558A0() {
        return mo17193l(32777, 1, "Off", "On");
    }

    /* renamed from: B */
    public String mo17559B() {
        return mo17193l(49, 1, "Fired", "Enabled but not used", "Disabled but required", "Disabled and not required");
    }

    /* renamed from: B0 */
    public String mo17560B0() {
        return mo17193l(59, 1, "Off", "On");
    }

    /* renamed from: C */
    public String mo17561C() {
        return mo17193l(32, 1, "Off", "On");
    }

    /* renamed from: C0 */
    public String mo17562C0() {
        return mo17194m(150, "Off", "Time Lapse", "Stop-motion Animation");
    }

    /* renamed from: D */
    public String mo17563D() {
        C5718a V = ((C5793n0) this.f16215a).mo17625V(32784);
        if (V == null) {
            return null;
        }
        return V.mo17100c();
    }

    /* renamed from: D0 */
    public String mo17564D0() {
        return m21899N0(mo17201t(101, C5705f.f16151a));
    }

    /* renamed from: E */
    public String mo17565E() {
        C5718a V = ((C5793n0) this.f16215a).mo17625V(51);
        if (V == null) {
            return null;
        }
        return V.mo17100c();
    }

    /* renamed from: E0 */
    public String mo17566E0() {
        return mo17194m(171, "Off", "On");
    }

    /* renamed from: F */
    public String mo17567F() {
        return m21899N0(mo17201t(102, C5705f.f16151a));
    }

    /* renamed from: F0 */
    public String mo17568F0() {
        return m21898H0(32786);
    }

    /* renamed from: G */
    public String mo17569G() {
        return mo17194m(69, "No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+");
    }

    /* renamed from: G0 */
    public String mo17570G0() {
        return m21898H0(89);
    }

    /* renamed from: H */
    public String mo17571H() {
        return mo17194m(42, "Off", null, "On", "Indefinite", "Unlimited");
    }

    /* renamed from: I */
    public String mo17572I() {
        return mo17194m(143, "Normal", "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards");
    }

    /* renamed from: I0 */
    public String mo17573I0() {
        return mo17188d(33);
    }

    /* renamed from: J */
    public String mo17574J() {
        return m21899N0(mo17201t(109, C5705f.f16151a));
    }

    /* renamed from: J0 */
    public String mo17575J0() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(41);
        if (l == null) {
            return null;
        }
        return (((float) l.intValue()) / 100.0f) + " s";
    }

    /* renamed from: K */
    public String mo17576K() {
        return mo17194m(C1444j.f4266N0, "Off", "On");
    }

    /* renamed from: K0 */
    public String mo17577K0() {
        return mo17202u(2, 2);
    }

    /* renamed from: L */
    public String mo17578L() {
        return mo17193l(40, 1, "Off", "Warm", "Cool", "Black & White", "Sepia");
    }

    /* renamed from: L0 */
    public String mo17579L0() {
        return mo17193l(3, 1, "Auto", "Daylight", "Cloudy", "Incandescent", "Manual", null, null, "Flash", null, "Black & White", "Manual", "Shade");
    }

    /* renamed from: M */
    public String mo17580M() {
        return mo17194m(50, "Normal", "Natural", "Vivid");
    }

    /* renamed from: M0 */
    public String mo17581M0() {
        return mo17193l(58, 1, "Home", "Destination");
    }

    /* renamed from: N */
    public String mo17582N() {
        return mo17194m(57, "Normal");
    }

    /* renamed from: O */
    public String mo17583O() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(44);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 1) {
            return "Low";
        }
        if (intValue == 2) {
            return "High";
        }
        if (intValue == 6) {
            return "Medium Low";
        }
        if (intValue == 7) {
            return "Medium High";
        }
        if (intValue == 256) {
            return "Low";
        }
        if (intValue == 272) {
            return "Normal";
        }
        if (intValue == 288) {
            return "High";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: P */
    public String mo17584P() {
        return mo17193l(53, 1, "Off", "Wide", "Telephoto", "Macro");
    }

    /* renamed from: Q */
    public String mo17585Q() {
        return m21899N0(mo17201t(105, C5705f.f16151a));
    }

    /* renamed from: R */
    public String mo17586R() {
        return m21900v(((C5793n0) this.f16215a).mo17626W());
    }

    /* renamed from: S */
    public String mo17587S() {
        return mo17202u(38, 2);
    }

    /* renamed from: T */
    public String mo17588T() {
        return mo17194m(72, "n/a", "1st", "2nd");
    }

    /* renamed from: U */
    public String mo17589U() {
        return mo17193l(32775, 1, "Off", "On");
    }

    /* renamed from: V */
    public String mo17590V() {
        return mo17194m(98, "No", "Yes (Flash required but disabled)");
    }

    /* renamed from: W */
    public String mo17591W() {
        return mo17193l(7, 1, "Auto", "Manual", null, "Auto, Focus Button", "Auto, Continuous");
    }

    /* renamed from: X */
    public String mo17592X() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(158);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 100) {
            return "1 EV";
        }
        if (intValue == 200) {
            return "2 EV";
        }
        if (intValue == 300) {
            return "3 EV";
        }
        if (intValue == 32868) {
            return "1 EV (Auto)";
        }
        if (intValue == 32968) {
            return "2 EV (Auto)";
        }
        if (intValue == 33068) {
            return "3 EV (Auto)";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: Y */
    public String mo17593Y() {
        return mo17193l(26, 2, "On, Mode 1", "Off", "On, Mode 2");
    }

    /* renamed from: Z */
    public String mo17594Z() {
        return mo17194m(C1444j.f4251K0, "Off", "Low", "Standard", "High");
    }

    /* renamed from: a0 */
    public String mo17595a0() {
        return mo17194m(93, "Off", "Low", "Standard", "High");
    }

    /* renamed from: b0 */
    public String mo17596b0() {
        return mo17194m(112, "Off", null, "Auto", "On");
    }

    /* renamed from: c0 */
    public String mo17597c0() {
        return mo17186b(37);
    }

    /* renamed from: d0 */
    public String mo17598d0() {
        return m21899N0(mo17201t(111, C5705f.f16151a));
    }

    /* renamed from: e0 */
    public String mo17599e0() {
        byte[] e = ((C5793n0) this.f16215a).mo17141e(96);
        if (e == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < e.length; i++) {
            sb.append(e[i]);
            if (i < e.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 1:
                return mo17608n0();
            case 2:
                return mo17577K0();
            case 3:
                return mo17579L0();
            case 7:
                return mo17591W();
            case 15:
                return mo17557A();
            case 26:
                return mo17593Y();
            case 28:
                return mo17602h0();
            case 31:
                return mo17610p0();
            case 32:
                return mo17561C();
            case 33:
                return mo17573I0();
            case 37:
                return mo17597c0();
            case 38:
                return mo17587S();
            case C9024k.f24728k4 /*40*/:
                return mo17578L();
            case C9024k.f24734l4 /*41*/:
                return mo17575J0();
            case C9024k.f24740m4 /*42*/:
                return mo17571H();
            case 44:
                return mo17583O();
            case C9024k.f24746n4 /*45*/:
                return mo17604j0();
            case C9024k.f24752o4 /*46*/:
                return mo17614t0();
            case C9024k.f24764q4 /*48*/:
                return mo17612r0();
            case C9024k.f24770r4 /*49*/:
                return mo17559B();
            case 50:
                return mo17580M();
            case 51:
                return mo17565E();
            case 52:
                return mo17605k0();
            case 53:
                return mo17584P();
            case 57:
                return mo17582N();
            case 58:
                return mo17581M0();
            case 59:
                return mo17560B0();
            case 61:
                return mo17623z();
            case 62:
                return mo17622y0();
            case 69:
                return mo17569G();
            case 72:
                return mo17588T();
            case 73:
                return mo17601g0();
            case ModuleDescriptor.MODULE_VERSION:
                return mo17586R();
            case 89:
                return mo17570G0();
            case 93:
                return mo17595a0();
            case 96:
                return mo17599e0();
            case 97:
                return mo17609o0();
            case 98:
                return mo17590V();
            case 101:
                return mo17564D0();
            case 102:
                return mo17567F();
            case 103:
                return mo17600f0();
            case 105:
                return mo17585Q();
            case 107:
                return mo17618w0();
            case 109:
                return mo17574J();
            case 111:
                return mo17598d0();
            case 112:
                return mo17596b0();
            case C1444j.f4251K0:
                return mo17594Z();
            case C1444j.f4266N0:
                return mo17576K();
            case 137:
                return mo17606l0();
            case 138:
                return mo17615u0();
            case 140:
                return mo17621y();
            case 141:
                return mo17617w();
            case 142:
                return mo17619x();
            case 143:
                return mo17572I();
            case 144:
                return mo17611q0();
            case 145:
                return mo17607m0();
            case 147:
                return mo17620x0();
            case 150:
                return mo17562C0();
            case 158:
                return mo17592X();
            case 159:
                return mo17616v0();
            case 171:
                return mo17566E0();
            case 32768:
                return mo17603i0();
            case 32769:
                return mo17613s0();
            case 32775:
                return mo17589U();
            case 32776:
                return mo17624z0();
            case 32777:
                return mo17558A0();
            case 32784:
                return mo17563D();
            case 32786:
                return mo17568F0();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: f0 */
    public String mo17600f0() {
        return m21899N0(mo17201t(103, C5705f.f16151a));
    }

    /* renamed from: g0 */
    public String mo17601g0() {
        return mo17193l(73, 1, "Off", "On");
    }

    /* renamed from: h0 */
    public String mo17602h0() {
        return mo17193l(28, 1, "Off", "On");
    }

    /* renamed from: i0 */
    public String mo17603i0() {
        return mo17202u(32768, 2);
    }

    /* renamed from: j0 */
    public String mo17604j0() {
        return mo17194m(45, "Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)");
    }

    /* renamed from: k0 */
    public String mo17605k0() {
        return mo17193l(52, 1, "Standard", "Extended");
    }

    /* renamed from: l0 */
    public String mo17606l0() {
        return mo17194m(137, "Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait");
    }

    /* renamed from: m0 */
    public String mo17607m0() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(145);
        if (l == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(((double) (-l.shortValue())) / 10.0d);
    }

    /* renamed from: n0 */
    public String mo17608n0() {
        return mo17193l(1, 2, "High", "Normal", null, null, "Very High", "Raw", null, "Motion Picture");
    }

    /* renamed from: o0 */
    public String mo17609o0() {
        return m21900v(((C5793n0) this.f16215a).mo17627X());
    }

    /* renamed from: p0 */
    public String mo17610p0() {
        return mo17193l(31, 1, f16291b);
    }

    /* renamed from: q0 */
    public String mo17611q0() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(144);
        if (l == null) {
            return null;
        }
        return new DecimalFormat("0.#").format(((double) l.shortValue()) / 10.0d);
    }

    /* renamed from: r0 */
    public String mo17612r0() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(48);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "Horizontal";
        }
        if (intValue == 3) {
            return "Rotate 180";
        }
        if (intValue == 6) {
            return "Rotate 90 CW";
        }
        if (intValue == 8) {
            return "Rotate 270 CW";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: s0 */
    public String mo17613s0() {
        return mo17193l(32769, 1, f16291b);
    }

    /* renamed from: t0 */
    public String mo17614t0() {
        return mo17193l(46, 1, "Off", "10 s", "2 s");
    }

    /* renamed from: u0 */
    public String mo17615u0() {
        return mo17194m(138, "Off", "On");
    }

    /* renamed from: v0 */
    public String mo17616v0() {
        return mo17194m(159, "Mechanical", "Electronic", "Hybrid");
    }

    /* renamed from: w */
    public String mo17617w() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(141);
        if (l == null) {
            return null;
        }
        return String.valueOf(l.shortValue());
    }

    /* renamed from: w0 */
    public String mo17618w0() {
        return m21899N0(mo17201t(107, C5705f.f16151a));
    }

    /* renamed from: x */
    public String mo17619x() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(142);
        if (l == null) {
            return null;
        }
        return String.valueOf(l.shortValue());
    }

    /* renamed from: x0 */
    public String mo17620x0() {
        return mo17194m(147, "Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top");
    }

    /* renamed from: y */
    public String mo17621y() {
        Integer l = ((C5793n0) this.f16215a).mo17148l(140);
        if (l == null) {
            return null;
        }
        return String.valueOf(l.shortValue());
    }

    /* renamed from: y0 */
    public String mo17622y0() {
        return mo17193l(62, 1, "Off", "On");
    }

    /* renamed from: z */
    public String mo17623z() {
        return mo17193l(61, 1, "Normal", "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", null, "Expressive", "Retro", "Pure", "Elegant", null, "Monochrome", "Dynamic Art", "Silhouette");
    }

    /* renamed from: z0 */
    public String mo17624z0() {
        return mo17193l(32776, 1, "Off", "On");
    }
}
