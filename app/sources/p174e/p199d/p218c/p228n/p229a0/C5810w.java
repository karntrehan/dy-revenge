package p174e.p199d.p218c.p228n.p229a0;

import java.text.DecimalFormat;
import java.util.HashMap;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.d.c.n.a0.w */
public class C5810w extends C5739i<C5812x> {

    /* renamed from: b */
    private static final HashMap<Integer, String> f16304b;

    /* renamed from: c */
    private static final HashMap<Integer, String> f16305c;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16304b = hashMap;
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        f16305c = hashMap2;
        hashMap2.put(0, "Off");
        hashMap2.put(1, "Soft Focus");
        hashMap2.put(2, "Pop Art");
        hashMap2.put(3, "Pale & Light Color");
        hashMap2.put(4, "Light Tone");
        hashMap2.put(5, "Pin Hole");
        hashMap2.put(6, "Grainy Film");
        hashMap2.put(9, "Diorama");
        hashMap2.put(10, "Cross Process");
        hashMap2.put(12, "Fish Eye");
        hashMap2.put(13, "Drawing");
        hashMap2.put(14, "Gentle Sepia");
        hashMap2.put(15, "Pale & Light Color II");
        hashMap2.put(16, "Pop Art II");
        hashMap2.put(17, "Pin Hole II");
        hashMap2.put(18, "Pin Hole III");
        hashMap2.put(19, "Grainy Film II");
        hashMap2.put(20, "Dramatic Tone");
        hashMap2.put(21, "Punk");
        hashMap2.put(22, "Soft Focus 2");
        hashMap2.put(23, "Sparkle");
        hashMap2.put(24, "Watercolor");
        hashMap2.put(25, "Key Line");
        hashMap2.put(26, "Key Line II");
        hashMap2.put(27, "Miniature");
        hashMap2.put(28, "Reflection");
        hashMap2.put(29, "Fragmented");
        hashMap2.put(31, "Cross Process II");
        hashMap2.put(32, "Dramatic Tone II");
        hashMap2.put(33, "Watercolor I");
        hashMap2.put(34, "Watercolor II");
        hashMap2.put(35, "Diorama II");
        hashMap2.put(36, "Vintage");
        hashMap2.put(37, "Vintage II");
        hashMap2.put(38, "Vintage III");
        hashMap2.put(39, "Partial Color");
        hashMap2.put(40, "Partial Color II");
        hashMap2.put(41, "Partial Color III");
        hashMap.put(0, "0");
        hashMap.put(-31999, "Highlights ");
        hashMap.put(-31998, "Shadows ");
        hashMap.put(-31997, "Midtones ");
    }

    public C5810w(C5812x xVar) {
        super(xVar);
    }

    /* renamed from: N */
    private String m22052N(int i) {
        int[] k = ((C5812x) this.f16215a).mo17147k(i);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < k.length; i2++) {
            if (i2 == 0) {
                HashMap<Integer, String> hashMap = f16305c;
                sb.append(hashMap.containsKey(Integer.valueOf(k[i2])) ? hashMap.get(Integer.valueOf(k[i2])) : "[unknown]");
            } else {
                sb.append(k[i2]);
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: x0 */
    private String m22053x0(int i) {
        int[] k = ((C5812x) this.f16215a).mo17147k(i);
        if (k == null || k.length < 3) {
            return null;
        }
        return String.format("%d (min %d, max %d)", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2])});
    }

    /* renamed from: A */
    public String mo17671A() {
        return m22052N(1321);
    }

    /* renamed from: B */
    public String mo17672B() {
        int i;
        String str;
        int i2;
        int[] k = ((C5812x) this.f16215a).mo17147k(1327);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < k.length; i3++) {
            if (i3 == 0) {
                HashMap<Integer, String> hashMap = f16305c;
                str = hashMap.containsKey(Integer.valueOf(k[i3])) ? hashMap.get(Integer.valueOf(k[i3])) : "[unknown]";
            } else {
                if (i3 == 3) {
                    sb.append("Partial Color ");
                    i = k[i3];
                } else {
                    if (i3 == 4) {
                        switch (k[i3]) {
                            case 0:
                                str = "No Effect";
                                break;
                            case 32784:
                                str = "Star Light";
                                break;
                            case 32800:
                                str = "Pin Hole";
                                break;
                            case 32816:
                                str = "Frame";
                                break;
                            case 32832:
                                str = "Soft Focus";
                                break;
                            case 32848:
                                str = "White Edge";
                                break;
                            case 32864:
                                str = "B&W";
                                break;
                            default:
                                sb.append("Unknown (");
                                i2 = k[i3];
                                break;
                        }
                    } else if (i3 == 6) {
                        int i4 = k[i3];
                        if (i4 == 0) {
                            str = "No Color Filter";
                        } else if (i4 == 1) {
                            str = "Yellow Color Filter";
                        } else if (i4 == 2) {
                            str = "Orange Color Filter";
                        } else if (i4 == 3) {
                            str = "Red Color Filter";
                        } else if (i4 != 4) {
                            sb.append("Unknown (");
                            i2 = k[i3];
                        } else {
                            str = "Green Color Filter";
                        }
                    } else {
                        i = k[i3];
                    }
                    sb.append(i2);
                    sb.append(")");
                    sb.append("; ");
                }
                sb.append(i);
                sb.append("; ");
            }
            sb.append(str);
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: C */
    public String mo17673C() {
        return mo17202u(0, 4);
    }

    /* renamed from: D */
    public String mo17674D() {
        int i;
        int[] k = ((C5812x) this.f16215a).mo17147k(1330);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < k.length; i2++) {
            if (i2 == 0) {
                sb.append("Color ");
                i = k[i2];
            } else if (i2 == 3) {
                sb.append("Strength ");
                i = k[i2];
            } else {
                i = k[i2];
            }
            sb.append(i);
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: E */
    public String mo17675E() {
        return mo17194m(1287, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    /* renamed from: F */
    public String mo17676F() {
        return m22053x0(1285);
    }

    /* renamed from: G */
    public String mo17677G() {
        return m22053x0(1283);
    }

    /* renamed from: H */
    public String mo17678H() {
        Object o = ((C5812x) this.f16215a).mo17150o(2312);
        if (o == null) {
            return null;
        }
        return o.toString();
    }

    /* renamed from: I */
    public String mo17679I() {
        return mo17194m(1291, "Off", "On");
    }

    /* renamed from: J */
    public String mo17680J() {
        String str;
        int[] k = ((C5812x) this.f16215a).mo17147k(1536);
        if (k == null) {
            return null;
        }
        if (k.length == 0 || k[0] == 0) {
            return "Single Shot";
        }
        StringBuilder sb = new StringBuilder();
        if (k[0] != 5 || k.length < 3) {
            int i = k[0];
            if (i == 1) {
                str = "Continuous Shooting";
            } else if (i == 2) {
                str = "Exposure Bracketing";
            } else if (i == 3) {
                str = "White Balance Bracketing";
            } else if (i != 4) {
                sb.append("Unknown (");
                sb.append(k[0]);
                str = ")";
            } else {
                str = "Exposure+WB Bracketing";
            }
        } else {
            int i2 = k[2];
            if ((i2 & 1) > 0) {
                sb.append("AE");
            }
            if (((i2 >> 1) & 1) > 0) {
                sb.append("WB");
            }
            if (((i2 >> 2) & 1) > 0) {
                sb.append("FL");
            }
            if (((i2 >> 3) & 1) > 0) {
                sb.append("MF");
            }
            if (((i2 >> 6) & 1) > 0) {
                sb.append("Focus");
            }
            str = " Bracketing";
        }
        sb.append(str);
        sb.append(", Shot ");
        sb.append(k[1]);
        return sb.toString();
    }

    /* renamed from: K */
    public String mo17681K() {
        return mo17193l(512, 1, "Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift");
    }

    /* renamed from: L */
    public String mo17682L() {
        return mo17198q(515);
    }

    /* renamed from: M */
    public String mo17683M() {
        return mo17194m(2306, "Off", "On");
    }

    /* renamed from: O */
    public String mo17684O() {
        String str;
        int[] k = ((C5812x) this.f16215a).mo17147k(1028);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 0) {
            str = "Off";
        } else if (i == 3) {
            str = "TTL";
        } else if (i == 4) {
            str = "Auto";
        } else if (i != 5) {
            sb.append("Unknown (");
            sb.append(k[0]);
            str = ")";
        } else {
            str = "Manual";
        }
        sb.append(str);
        for (int i2 = 1; i2 < k.length; i2++) {
            sb.append("; ");
            sb.append(k[i2]);
        }
        return sb.toString();
    }

    /* renamed from: P */
    public String mo17685P() {
        C5712m[] q = ((C5812x) this.f16215a).mo17152q(1029);
        if (q == null || q.length == 0) {
            return null;
        }
        if (q.length == 3) {
            if (q[0].mo17077v() == 0 && q[1].mo17077v() == 0 && q[2].mo17077v() == 0) {
                return "n/a";
            }
        } else if (q.length == 4 && q[0].mo17077v() == 0 && q[1].mo17077v() == 0 && q[2].mo17077v() == 0 && q[3].mo17077v() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (C5712m append : q) {
            sb.append(append);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: Q */
    public String mo17686Q() {
        Integer l = ((C5812x) this.f16215a).mo17148l(1024);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "Off";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append("On, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("Fill-in, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Red-eye, ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append("Slow-sync, ");
        }
        if (((intValue >> 4) & 1) != 0) {
            sb.append("Forced On, ");
        }
        if (((intValue >> 5) & 1) != 0) {
            sb.append("2nd Curtain, ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: R */
    public String mo17687R() {
        Integer l = ((C5812x) this.f16215a).mo17148l(1027);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Channel 1, Low";
        }
        if (intValue == 2) {
            return "Channel 2, Low";
        }
        if (intValue == 3) {
            return "Channel 3, Low";
        }
        if (intValue == 4) {
            return "Channel 4, Low";
        }
        switch (intValue) {
            case 9:
                return "Channel 1, Mid";
            case 10:
                return "Channel 2, Mid";
            case 11:
                return "Channel 3, Mid";
            case 12:
                return "Channel 4, Mid";
            default:
                switch (intValue) {
                    case 17:
                        return "Channel 1, High";
                    case 18:
                        return "Channel 2, High";
                    case 19:
                        return "Channel 3, High";
                    case 20:
                        return "Channel 4, High";
                    default:
                        return "Unknown (" + l + ")";
                }
        }
    }

    /* renamed from: S */
    public String mo17688S() {
        String str;
        int[] k = ((C5812x) this.f16215a).mo17147k(769);
        if (k == null) {
            Integer l = ((C5812x) this.f16215a).mo17148l(769);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 0) {
            str = "Single AF";
        } else if (i == 1) {
            str = "Sequential shooting AF";
        } else if (i == 2) {
            str = "Continuous AF";
        } else if (i == 3) {
            str = "Multi AF";
        } else if (i == 4) {
            str = "Face detect";
        } else if (i != 10) {
            str = "Unknown (" + k[0] + ")";
        } else {
            str = "MF";
        }
        sb.append(str);
        if (k.length > 1) {
            sb.append("; ");
            int i2 = k[1];
            if (i2 == 0) {
                sb.append("(none)");
            } else {
                if ((i2 & 1) > 0) {
                    sb.append("S-AF, ");
                }
                if (((i2 >> 2) & 1) > 0) {
                    sb.append("C-AF, ");
                }
                if (((i2 >> 4) & 1) > 0) {
                    sb.append("MF, ");
                }
                if (((i2 >> 5) & 1) > 0) {
                    sb.append("Face detect, ");
                }
                if (((i2 >> 6) & 1) > 0) {
                    sb.append("Imager AF, ");
                }
                if (((i2 >> 7) & 1) > 0) {
                    sb.append("Live View Magnification Frame, ");
                }
                if (((i2 >> 8) & 1) > 0) {
                    sb.append("AF sensor, ");
                }
                sb.setLength(sb.length() - 2);
            }
        }
        return sb.toString();
    }

    /* renamed from: T */
    public String mo17689T() {
        String str;
        int[] k = ((C5812x) this.f16215a).mo17147k(770);
        if (k == null) {
            Integer l = ((C5812x) this.f16215a).mo17148l(770);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 0) {
            str = "AF not used";
        } else if (i != 1) {
            str = "Unknown (" + k[0] + ")";
        } else {
            str = "AF used";
        }
        sb.append(str);
        if (k.length > 1) {
            sb.append("; " + k[1]);
        }
        return sb.toString();
    }

    /* renamed from: U */
    public String mo17690U() {
        String str;
        StringBuilder sb;
        String str2;
        int[] k = ((C5812x) this.f16215a).mo17147k(1295);
        if (k == null || k.length < 3) {
            return null;
        }
        String format = String.format("%d %d %d", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2])});
        if (format.equals("0 0 0")) {
            str = "n/a";
        } else if (format.equals("-1 -1 1")) {
            str = "Low Key";
        } else if (format.equals("0 -1 1")) {
            str = "Normal";
        } else if (format.equals("1 -1 1")) {
            str = "High Key";
        } else {
            str = "Unknown (" + format + ")";
        }
        if (k.length <= 3) {
            return str;
        }
        if (k[3] == 0) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "; User-Selected";
        } else if (k[3] != 1) {
            return str;
        } else {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "; Auto-Override";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: V */
    public String mo17691V() {
        return mo17193l(1539, 1, "SQ", "HQ", "SHQ", "RAW", "SQ (5)");
    }

    /* renamed from: W */
    public String mo17692W() {
        return mo17194m(1540, "Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4");
    }

    /* renamed from: X */
    public String mo17693X() {
        return mo17194m(768, "Off", "On", "Super Macro");
    }

    /* renamed from: Y */
    public String mo17694Y() {
        return m22052N(1324);
    }

    /* renamed from: Z */
    public String mo17695Z() {
        Integer l = ((C5812x) this.f16215a).mo17148l(2304);
        if (l == null) {
            return null;
        }
        return String.format("%s kPa", new Object[]{new DecimalFormat("#.##").format(((double) l.intValue()) / 10.0d)});
    }

    /* renamed from: a0 */
    public String mo17696a0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(2305);
        if (k == null || k.length < 2) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s m, %s ft", new Object[]{decimalFormat.format(((double) k[0]) / 10.0d), decimalFormat.format(((double) k[1]) / 10.0d)});
    }

    /* renamed from: b0 */
    public String mo17697b0() {
        C5712m[] q = ((C5812x) this.f16215a).mo17152q(1030);
        if (q == null || q.length == 0) {
            return "n/a";
        }
        if (q.length == 3) {
            if (q[0].mo17077v() == 0 && q[1].mo17077v() == 0 && q[2].mo17077v() == 0) {
                return "n/a";
            }
        } else if (q.length == 4 && q[0].mo17077v() == 0 && q[1].mo17077v() == 0 && q[2].mo17077v() == 0 && q[3].mo17077v() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (C5712m append : q) {
            sb.append(append);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: c0 */
    public String mo17698c0() {
        Integer l = ((C5812x) this.f16215a).mo17148l(514);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 2) {
            return "Center-weighted average";
        }
        if (intValue == 3) {
            return "Spot";
        }
        if (intValue == 5) {
            return "ESP";
        }
        if (intValue == 261) {
            return "Pattern+AF";
        }
        if (intValue == 515) {
            return "Spot+Highlight control";
        }
        if (intValue == 1027) {
            return "Spot+Shadow control";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: d0 */
    public String mo17699d0() {
        return mo17194m(1284, "Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)");
    }

    /* renamed from: e0 */
    public String mo17700e0() {
        return mo17194m(516, "Off", "On");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i != 0) {
            if (i == 1280) {
                return mo17723y0();
            }
            if (i == 1281) {
                return mo17725z0();
            }
            if (i == 1312) {
                return mo17706k0();
            }
            if (i == 1313) {
                return mo17708m0();
            }
            if (i == 1536) {
                return mo17680J();
            }
            if (i == 1537) {
                return mo17703h0();
            }
            switch (i) {
                case 0:
                    break;
                case 256:
                    return mo17712q0();
                case 768:
                    return mo17693X();
                case 769:
                    return mo17688S();
                case 770:
                    return mo17689T();
                case 771:
                    return mo17724z();
                case 772:
                    return mo17719w();
                case 773:
                    return mo17722y();
                case 774:
                    return mo17721x();
                case 1024:
                    return mo17686Q();
                case 1295:
                    return mo17690U();
                case 1321:
                    return mo17671A();
                case 1330:
                    return mo17674D();
                case 1539:
                    return mo17691V();
                case 1540:
                    return mo17692W();
                case 2052:
                    return mo17718v0();
                case 2304:
                    return mo17695Z();
                case 2305:
                    return mo17696a0();
                case 2306:
                    return mo17683M();
                case 2307:
                    return mo17713r0();
                case 2308:
                    return mo17711p0();
                case 2312:
                    return mo17678H();
                default:
                    switch (i) {
                        case 512:
                            return mo17681K();
                        case 513:
                            return mo17717v();
                        case 514:
                            return mo17698c0();
                        case 515:
                            return mo17682L();
                        case 516:
                            return mo17700e0();
                        default:
                            switch (i) {
                                case 1027:
                                    return mo17687R();
                                case 1028:
                                    return mo17684O();
                                case 1029:
                                    return mo17685P();
                                case 1030:
                                    return mo17697b0();
                                default:
                                    switch (i) {
                                        case 1283:
                                            return mo17677G();
                                        case 1284:
                                            return mo17699d0();
                                        case 1285:
                                            return mo17676F();
                                        case 1286:
                                            return mo17716u0();
                                        case 1287:
                                            return mo17675E();
                                        default:
                                            switch (i) {
                                                case 1289:
                                                    return mo17714s0();
                                                case 1290:
                                                    return mo17702g0();
                                                case 1291:
                                                    return mo17679I();
                                                case 1292:
                                                    return mo17715t0();
                                                default:
                                                    switch (i) {
                                                        case 1315:
                                                            return mo17705j0();
                                                        case 1316:
                                                            return mo17709n0();
                                                        case 1317:
                                                            return mo17704i0();
                                                        case 1318:
                                                            return mo17710o0();
                                                        case 1319:
                                                            return mo17701f0();
                                                        default:
                                                            switch (i) {
                                                                case 1324:
                                                                    return mo17694Y();
                                                                case 1325:
                                                                    return mo17707l0();
                                                                case 1326:
                                                                    return mo17720w0();
                                                                case 1327:
                                                                    return mo17672B();
                                                                default:
                                                                    return super.mo17110f(i);
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return mo17673C();
    }

    /* renamed from: f0 */
    public String mo17701f0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(1319);
        if (k == null) {
            return null;
        }
        String format = String.format("%d %d %d", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2])});
        if (format.equals("0 0 0")) {
            return "n/a";
        }
        if (format.equals("-2 -2 1")) {
            return "Off";
        }
        if (format.equals("-1 -2 1")) {
            return "Low";
        }
        if (format.equals("0 -2 1")) {
            return "Standard";
        }
        if (format.equals("1 -2 1")) {
            return "High";
        }
        return "Unknown (" + format + ")";
    }

    /* renamed from: g0 */
    public String mo17702g0() {
        Integer l = ((C5812x) this.f16215a).mo17148l(1290);
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
        if (((intValue >> 3) & 1) != 0) {
            sb.append("Auto, ");
        }
        return sb.length() != 0 ? sb.substring(0, sb.length() - 2) : "(none)";
    }

    /* renamed from: h0 */
    public String mo17703h0() {
        String str;
        int[] k = ((C5812x) this.f16215a).mo17147k(1537);
        if (k == null) {
            return null;
        }
        if (k.length == 0 || k[0] == 0) {
            return "Off";
        }
        int i = k[0];
        if (i == 1) {
            str = "Left to Right";
        } else if (i == 2) {
            str = "Right to Left";
        } else if (i == 3) {
            str = "Bottom to Top";
        } else if (i != 4) {
            str = "Unknown (" + k[0] + ")";
        } else {
            str = "Top to Bottom";
        }
        return String.format("%s, Shot %d", new Object[]{str, Integer.valueOf(k[1])});
    }

    /* renamed from: i0 */
    public String mo17704i0() {
        return mo17194m(1317, "n/a", "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    /* renamed from: j0 */
    public String mo17705j0() {
        return m22053x0(1315);
    }

    /* renamed from: k0 */
    public String mo17706k0() {
        String str;
        int[] k = ((C5812x) this.f16215a).mo17147k(1312);
        if (k == null) {
            Integer l = ((C5812x) this.f16215a).mo17148l(1290);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = k[0];
        if (i == 1) {
            str = "Vivid";
        } else if (i == 2) {
            str = "Natural";
        } else if (i == 3) {
            str = "Muted";
        } else if (i == 4) {
            str = "Portrait";
        } else if (i == 5) {
            str = "i-Enhance";
        } else if (i == 256) {
            str = "Monotone";
        } else if (i != 512) {
            sb.append("Unknown (");
            sb.append(k[0]);
            str = ")";
        } else {
            str = "Sepia";
        }
        sb.append(str);
        if (k.length > 1) {
            sb.append("; ");
            sb.append(k[1]);
        }
        return sb.toString();
    }

    /* renamed from: l0 */
    public String mo17707l0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(1325);
        if (k == null) {
            return null;
        }
        String format = String.format("%d %d %d", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1]), Integer.valueOf(k[2])});
        if (format.equals("0 0 0")) {
            return "n/a";
        }
        if (format.equals("-1 -1 1")) {
            return "Low";
        }
        if (format.equals("0 -1 1")) {
            return "Standard";
        }
        if (format.equals("1 -1 1")) {
            return "High";
        }
        return "Unknown (" + format + ")";
    }

    /* renamed from: m0 */
    public String mo17708m0() {
        return m22053x0(1313);
    }

    /* renamed from: n0 */
    public String mo17709n0() {
        return m22053x0(1316);
    }

    /* renamed from: o0 */
    public String mo17710o0() {
        return mo17194m(1318, "n/a", "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    /* renamed from: p0 */
    public String mo17711p0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(2308);
        if (k == null || k.length < 2) {
            return null;
        }
        return String.format("%s %d", new Object[]{k[0] != 0 ? Double.toString(((double) k[0]) / 10.0d) : "n/a", Integer.valueOf(k[1])});
    }

    /* renamed from: q0 */
    public String mo17712q0() {
        return mo17194m(256, "No", "Yes");
    }

    /* renamed from: r0 */
    public String mo17713r0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(2307);
        if (k == null || k.length < 2) {
            return null;
        }
        return String.format("%s %d", new Object[]{k[0] != 0 ? Double.toString(((double) (-k[0])) / 10.0d) : "n/a", Integer.valueOf(k[1])});
    }

    /* renamed from: s0 */
    public String mo17714s0() {
        Integer l = ((C5812x) this.f16215a).mo17148l(1289);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Standard";
        }
        if (intValue == 54) {
            return "Face Portrait";
        }
        if (intValue == 57) {
            return "Bulb";
        }
        if (intValue == 142) {
            return "Hand-held Starlight";
        }
        if (intValue == 154) {
            return "HDR";
        }
        if (intValue == 59) {
            return "Smile Shot";
        }
        if (intValue == 60) {
            return "Quick Shutter";
        }
        switch (intValue) {
            case 6:
                return "Auto";
            case 7:
                return "Sport";
            case 8:
                return "Portrait";
            case 9:
                return "Landscape+Portrait";
            case 10:
                return "Landscape";
            case 11:
                return "Night Scene";
            case 12:
                return "Self Portrait";
            case 13:
                return "Panorama";
            case 14:
                return "2 in 1";
            case 15:
                return "Movie";
            case 16:
                return "Landscape+Portrait";
            case 17:
                return "Night+Portrait";
            case 18:
                return "Indoor";
            case 19:
                return "Fireworks";
            case 20:
                return "Sunset";
            case 21:
                return "Beauty Skin";
            case 22:
                return "Macro";
            case 23:
                return "Super Macro";
            case 24:
                return "Food";
            case 25:
                return "Documents";
            case 26:
                return "Museum";
            case 27:
                return "Shoot & Select";
            case 28:
                return "Beach & Snow";
            case 29:
                return "Self Portrait+Timer";
            case 30:
                return "Candle";
            case 31:
                return "Available Light";
            case 32:
                return "Behind Glass";
            case 33:
                return "My Mode";
            case 34:
                return "Pet";
            case 35:
                return "Underwater Wide1";
            case C9024k.f24704g4 /*36*/:
                return "Underwater Macro";
            case 37:
                return "Shoot & Select1";
            case 38:
                return "Shoot & Select2";
            case 39:
                return "High Key";
            case C9024k.f24728k4 /*40*/:
                return "Digital Image Stabilization";
            case C9024k.f24734l4 /*41*/:
                return "Auction";
            case C9024k.f24740m4 /*42*/:
                return "Beach";
            case 43:
                return "Snow";
            case 44:
                return "Underwater Wide2";
            case C9024k.f24746n4 /*45*/:
                return "Low Key";
            case C9024k.f24752o4 /*46*/:
                return "Children";
            case C9024k.f24758p4 /*47*/:
                return "Vivid";
            case C9024k.f24764q4 /*48*/:
                return "Nature Macro";
            case C9024k.f24770r4 /*49*/:
                return "Underwater Snapshot";
            case 50:
                return "Shooting Guide";
            default:
                switch (intValue) {
                    case 63:
                        return "Slow Shutter";
                    case WebSocketProtocol.B0_FLAG_RSV1 /*64*/:
                        return "Bird Watching";
                    case 65:
                        return "Multiple Exposure";
                    case 66:
                        return "e-Portrait";
                    case 67:
                        return "Soft Background Shot";
                    default:
                        return "Unknown (" + l + ")";
                }
        }
    }

    /* renamed from: t0 */
    public String mo17715t0() {
        return mo17194m(1292, "Off", "On");
    }

    /* renamed from: u0 */
    public String mo17716u0() {
        return m22053x0(1286);
    }

    /* renamed from: v */
    public String mo17717v() {
        return mo17194m(513, "Off", "On");
    }

    /* renamed from: v0 */
    public String mo17718v0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(2052);
        if (k == null || k.length < 2) {
            return null;
        }
        int i = k[0];
        int i2 = k[1];
        if (i == 0 && i2 == 0) {
            return "No";
        }
        if (i == 9 && i2 == 8) {
            return "Focus-stacked (8 images)";
        }
        return String.format("Unknown (%d %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* renamed from: w */
    public String mo17719w() {
        String str;
        Object o = ((C5812x) this.f16215a).mo17150o(772);
        if (o == null || !(o instanceof long[])) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (long j : (long[]) o) {
            if (j != 0) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                if (j == 913916549) {
                    str = "Left ";
                } else if (j == 2038007173) {
                    str = "Center ";
                } else {
                    if (j == 3178875269L) {
                        str = "Right ";
                    }
                    sb.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", new Object[]{Long.valueOf((j >> 24) & 255), Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf(j & 255)}));
                }
                sb.append(str);
                sb.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", new Object[]{Long.valueOf((j >> 24) & 255), Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf(j & 255)}));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: w0 */
    public String mo17720w0() {
        int[] k = ((C5812x) this.f16215a).mo17147k(1326);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20 || i == 24) {
                sb.append(f16304b.get(Integer.valueOf(k[i])));
            } else {
                sb.append(k[i]);
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: x */
    public String mo17721x() {
        return mo17194m(774, "Off", "On");
    }

    /* renamed from: y */
    public String mo17722y() {
        C5712m[] q = ((C5812x) this.f16215a).mo17152q(773);
        if (q == null) {
            return "n/a";
        }
        if (q.length < 4) {
            return null;
        }
        int i = (q.length == 5 && q[0].longValue() == 0) ? 1 : 0;
        int doubleValue = (int) (q[i].doubleValue() * 100.0d);
        int doubleValue2 = (int) (q[i + 1].doubleValue() * 100.0d);
        int doubleValue3 = (int) (q[i + 2].doubleValue() * 100.0d);
        int doubleValue4 = (int) (q[i + 3].doubleValue() * 100.0d);
        if (doubleValue + doubleValue2 + doubleValue3 + doubleValue4 == 0) {
            return "n/a";
        }
        return String.format("(%d%%,%d%%) (%d%%,%d%%)", new Object[]{Integer.valueOf(doubleValue), Integer.valueOf(doubleValue2), Integer.valueOf(doubleValue3), Integer.valueOf(doubleValue4)});
    }

    /* renamed from: y0 */
    public String mo17723y0() {
        Integer l = ((C5812x) this.f16215a).mo17148l(1280);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 1) {
            return "Auto (Keep Warm Color Off)";
        }
        if (intValue == 48) {
            return "3600K (Tungsten light-like)";
        }
        if (intValue == 67) {
            return "Underwater";
        }
        switch (intValue) {
            case 16:
                return "7500K (Fine Weather with Shade)";
            case 17:
                return "6000K (Cloudy)";
            case 18:
                return "5300K (Fine Weather)";
            default:
                switch (intValue) {
                    case 20:
                        return "3000K (Tungsten light)";
                    case 21:
                        return "3600K (Tungsten light-like)";
                    case 22:
                        return "Auto Setup";
                    case 23:
                        return "5500K (Flash)";
                    default:
                        switch (intValue) {
                            case 33:
                                return "6600K (Daylight fluorescent)";
                            case 34:
                                return "4500K (Neutral white fluorescent)";
                            case 35:
                                return "4000K (Cool white fluorescent)";
                            case C9024k.f24704g4 /*36*/:
                                return "White Fluorescent";
                            default:
                                switch (intValue) {
                                    case 256:
                                        return "One Touch WB 1";
                                    case 257:
                                        return "One Touch WB 2";
                                    case 258:
                                        return "One Touch WB 3";
                                    case 259:
                                        return "One Touch WB 4";
                                    default:
                                        switch (intValue) {
                                            case 512:
                                                return "Custom WB 1";
                                            case 513:
                                                return "Custom WB 2";
                                            case 514:
                                                return "Custom WB 3";
                                            case 515:
                                                return "Custom WB 4";
                                            default:
                                                return "Unknown (" + l + ")";
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: z */
    public String mo17724z() {
        return mo17194m(771, "Not Ready", "Ready");
    }

    /* renamed from: z0 */
    public String mo17725z0() {
        Integer l = ((C5812x) this.f16215a).mo17148l(1281);
        if (l == null) {
            return null;
        }
        return l.intValue() == 0 ? "Auto" : l.toString();
    }
}
