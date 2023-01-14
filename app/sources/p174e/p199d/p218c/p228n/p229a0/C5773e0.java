package p174e.p199d.p218c.p228n.p229a0;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import p174e.p199d.p200a.C5660e;
import p174e.p199d.p217b.C5707h;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.e0 */
public class C5773e0 extends C5739i<C5776f0> {
    public C5773e0(C5776f0 f0Var) {
        super(f0Var);
    }

    /* renamed from: A */
    public String mo17404A() {
        return mo17194m(515, "Off", "On");
    }

    /* renamed from: A0 */
    public String mo17405A0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61472);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue() - 3);
    }

    /* renamed from: B */
    public String mo17406B() {
        return super.mo17110f(61483);
    }

    /* renamed from: B0 */
    public String mo17407B0() {
        return mo17194m(61474, "Hard", "Normal", "Soft");
    }

    /* renamed from: C */
    public String mo17408C() {
        int[] k = ((C5776f0) this.f16215a).mo17147k(4120);
        if (k == null) {
            return null;
        }
        return String.valueOf(((double) ((short) k[0])) / 256.0d);
    }

    /* renamed from: C0 */
    public String mo17409C0() {
        return mo17194m(4111, "Normal", "Hard", "Soft");
    }

    /* renamed from: D */
    public String mo17410D() {
        return mo17194m(61455, "1/3 EV", "2/3 EV", "1 EV");
    }

    /* renamed from: D0 */
    public String mo17411D0() {
        return mo17194m(61447, "Single", "Continuous", "Self Timer", null, "Bracketing", "Interval", "UHS Continuous", "HS Continuous");
    }

    /* renamed from: E */
    public String mo17412E() {
        byte[] e = ((C5776f0) this.f16215a).mo17141e(521);
        if (e == null) {
            return null;
        }
        return new String(e);
    }

    /* renamed from: E0 */
    public String mo17413E0() {
        return super.mo17199r(4096);
    }

    /* renamed from: F */
    public String mo17414F() {
        return mo17194m(61478, "DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17415F0() {
        /*
            r8 = this;
            T r0 = r8.f16215a
            e.d.c.n.a0.f0 r0 = (p174e.p199d.p218c.p228n.p229a0.C5776f0) r0
            r1 = 512(0x200, float:7.175E-43)
            java.lang.Object r0 = r0.mo17150o(r1)
            long[] r0 = (long[]) r0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            int r1 = r0.length
            r2 = 1
            if (r1 >= r2) goto L_0x0017
            java.lang.String r0 = ""
            return r0
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 0
            r3 = r0[r3]
            int r4 = (int) r3
            r3 = 3
            r5 = 2
            if (r4 == 0) goto L_0x0037
            java.lang.String r6 = "Unknown picture taking mode"
            if (r4 == r2) goto L_0x0033
            if (r4 == r5) goto L_0x0030
            if (r4 == r3) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            java.lang.String r4 = "Panorama picture taking mode"
            goto L_0x0039
        L_0x0030:
            java.lang.String r4 = "Fast picture taking mode"
            goto L_0x0039
        L_0x0033:
            r1.append(r6)
            goto L_0x003c
        L_0x0037:
            java.lang.String r4 = "Normal picture taking mode"
        L_0x0039:
            r1.append(r4)
        L_0x003c:
            int r4 = r0.length
            if (r4 < r5) goto L_0x0062
            r6 = r0[r2]
            int r4 = (int) r6
            if (r4 == 0) goto L_0x0062
            if (r4 == r2) goto L_0x005d
            if (r4 == r5) goto L_0x005a
            if (r4 == r3) goto L_0x0057
            java.lang.String r4 = " / "
            r1.append(r4)
            r6 = r0[r2]
            r1.append(r6)
            java.lang.String r4 = "th in a sequence"
            goto L_0x005f
        L_0x0057:
            java.lang.String r4 = " / 3rd in a sequence"
            goto L_0x005f
        L_0x005a:
            java.lang.String r4 = " / 2nd in a sequence"
            goto L_0x005f
        L_0x005d:
            java.lang.String r4 = " / 1st in a sequence"
        L_0x005f:
            r1.append(r4)
        L_0x0062:
            int r4 = r0.length
            if (r4 < r3) goto L_0x0080
            r6 = r0[r5]
            int r0 = (int) r6
            if (r0 == r2) goto L_0x007b
            if (r0 == r5) goto L_0x0078
            if (r0 == r3) goto L_0x0075
            r2 = 4
            if (r0 == r2) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            java.lang.String r0 = " / Top to bottom panorama direction"
            goto L_0x007d
        L_0x0075:
            java.lang.String r0 = " / Bottom to top panorama direction"
            goto L_0x007d
        L_0x0078:
            java.lang.String r0 = " / Right to left panorama direction"
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = " / Left to right panorama direction"
        L_0x007d:
            r1.append(r0)
        L_0x0080:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p228n.p229a0.C5773e0.mo17415F0():java.lang.String");
    }

    /* renamed from: G */
    public String mo17416G() {
        String r = ((C5776f0) this.f16215a).mo17153r(519);
        if (r == null) {
            return null;
        }
        HashMap<String, String> hashMap = C5776f0.f16282g;
        return hashMap.containsKey(r) ? hashMap.get(r) : r;
    }

    /* renamed from: G0 */
    public String mo17417G0() {
        return super.mo17110f(61486);
    }

    /* renamed from: H */
    public String mo17418H() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61482);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue() - 3);
    }

    /* renamed from: H0 */
    public String mo17419H0() {
        return super.mo17110f(61487);
    }

    /* renamed from: I */
    public String mo17420I() {
        int[] k = ((C5776f0) this.f16215a).mo17147k(4113);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            sb.append((short) k[i]);
            if (i < k.length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: I0 */
    public String mo17421I0() {
        return mo17194m(61475, "None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action");
    }

    /* renamed from: J */
    public String mo17422J() {
        return mo17194m(61481, "Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB");
    }

    /* renamed from: J0 */
    public String mo17423J0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61463);
        if (m == null) {
            return null;
        }
        int longValue = (int) ((m.longValue() >> 8) & 255);
        int longValue2 = (int) ((m.longValue() >> 16) & 255);
        int longValue3 = (int) (255 & m.longValue());
        if (!C5707h.m21216b(longValue, longValue2, longValue3)) {
            return "Invalid time";
        }
        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(longValue), Integer.valueOf(longValue2), Integer.valueOf(longValue3)});
    }

    /* renamed from: K */
    public String mo17424K() {
        return mo17194m(257, "Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB");
    }

    /* renamed from: K0 */
    public String mo17425K0() {
        int[] k = ((C5776f0) this.f16215a).mo17147k(4117);
        if (k == null) {
            return null;
        }
        String format = String.format("%d %d", new Object[]{Integer.valueOf(k[0]), Integer.valueOf(k[1])});
        if (format.equals("1 0")) {
            return "Auto";
        }
        if (format.equals("1 2")) {
            return "Auto (2)";
        }
        if (format.equals("1 4")) {
            return "Auto (4)";
        }
        if (format.equals("2 2")) {
            return "3000 Kelvin";
        }
        if (format.equals("2 3")) {
            return "3700 Kelvin";
        }
        if (format.equals("2 4")) {
            return "4000 Kelvin";
        }
        if (format.equals("2 5")) {
            return "4500 Kelvin";
        }
        if (format.equals("2 6")) {
            return "5500 Kelvin";
        }
        if (format.equals("2 7")) {
            return "6500 Kelvin";
        }
        if (format.equals("2 8")) {
            return "7500 Kelvin";
        }
        if (format.equals("3 0")) {
            return "One-touch";
        }
        return "Unknown " + format;
    }

    /* renamed from: L */
    public String mo17426L() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61473);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue() - 3);
    }

    /* renamed from: L0 */
    public String mo17427L0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61471);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m == null) {
            return null;
        }
        return decimalFormat.format(((double) m.longValue()) / 256.0d);
    }

    /* renamed from: M */
    public String mo17428M() {
        return mo17194m(4137, "High", "Normal", "Low");
    }

    /* renamed from: M0 */
    public String mo17429M0() {
        return mo17194m(61444, "Auto", "Daylight", "Cloudy", "Tungsten", null, "Custom", null, "Fluorescent", "Fluorescent 2", null, null, "Custom 2", "Custom 3");
    }

    /* renamed from: N */
    public String mo17430N() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61462);
        if (m == null) {
            return null;
        }
        int longValue = (int) (m.longValue() & 255);
        int longValue2 = (int) ((m.longValue() >> 16) & 255);
        int longValue3 = ((int) (255 & (m.longValue() >> 8))) + 1970;
        if (!C5707h.m21215a(longValue3, longValue2, longValue)) {
            return "Invalid date";
        }
        return String.format("%04d-%02d-%02d", new Object[]{Integer.valueOf(longValue3), Integer.valueOf(longValue2 + 1), Integer.valueOf(longValue)});
    }

    /* renamed from: N0 */
    public String mo17431N0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61470);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m == null) {
            return null;
        }
        return decimalFormat.format(((double) m.longValue()) / 256.0d);
    }

    /* renamed from: O */
    public String mo17432O() {
        return mo17194m(61491, "Exposure", "Contrast", "Saturation", "Filter");
    }

    /* renamed from: O0 */
    public String mo17433O0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61469);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m == null) {
            return null;
        }
        return decimalFormat.format(((double) m.longValue()) / 256.0d);
    }

    /* renamed from: P */
    public String mo17434P() {
        return mo17194m(61453, "Off", "Electronic magnification", "Digital zoom 2x");
    }

    /* renamed from: P0 */
    public String mo17435P0() {
        return mo17194m(61488, "No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone");
    }

    /* renamed from: Q */
    public String mo17436Q() {
        C5712m p = ((C5776f0) this.f16215a).mo17151p(516);
        if (p == null) {
            return null;
        }
        return p.mo17064K(false);
    }

    /* renamed from: R */
    public String mo17437R() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61454);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m == null) {
            return null;
        }
        return decimalFormat.format((((double) m.longValue()) / 3.0d) - 2.0d) + " EV";
    }

    /* renamed from: S */
    public String mo17438S() {
        return mo17194m(61442, "P", "A", "S", "M");
    }

    /* renamed from: T */
    public String mo17439T() {
        return mo17194m(61467, "Off", "On");
    }

    /* renamed from: U */
    public String mo17440U() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61476);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m == null) {
            return null;
        }
        return decimalFormat.format(((double) (m.longValue() - 6)) / 3.0d) + " EV";
    }

    /* renamed from: V */
    public String mo17441V() {
        return mo17194m(61461, "No", "Yes");
    }

    /* renamed from: W */
    public String mo17442W() {
        return mo17194m(61443, "Normal", "Red-eye reduction", "Rear flash sync", "Wireless");
    }

    /* renamed from: X */
    public String mo17443X() {
        return mo17194m(4100, null, null, "On", "Off");
    }

    /* renamed from: Y */
    public String mo17444Y() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61459);
        if (m == null) {
            return null;
        }
        return C5739i.m21433i(((double) m.longValue()) / 256.0d);
    }

    /* renamed from: Z */
    public String mo17445Z() {
        C5712m p = ((C5776f0) this.f16215a).mo17151p(517);
        if (p == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        return decimalFormat.format(p.doubleValue()) + " mm";
    }

    /* renamed from: a0 */
    public String mo17446a0() {
        return mo17194m(61490, "Wide Focus (Normal)", "Spot Focus");
    }

    /* renamed from: b0 */
    public String mo17447b0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61460);
        if (m == null) {
            return null;
        }
        if (m.longValue() == 0) {
            return "Infinity";
        }
        return m + " mm";
    }

    /* renamed from: c0 */
    public String mo17448c0() {
        return mo17194m(61489, "Auto Focus", "Manual Focus");
    }

    /* renamed from: d0 */
    public String mo17449d0() {
        return mo17194m(4107, "Auto", "Manual");
    }

    /* renamed from: e0 */
    public String mo17450e0() {
        return mo17194m(4106, "Normal", "Macro");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 0) {
            return mo17466u0();
        }
        if (i == 519) {
            return mo17416G();
        }
        if (i == 521) {
            return mo17412E();
        }
        if (i == 770) {
            return mo17472x0();
        }
        if (i == 4100) {
            return mo17443X();
        }
        if (i == 4111) {
            return mo17409C0();
        }
        if (i == 4113) {
            return mo17420I();
        }
        if (i == 4117) {
            return mo17425K0();
        }
        if (i == 4137) {
            return mo17428M();
        }
        if (i == 4149) {
            return mo17474y0();
        }
        if (i == 4106) {
            return mo17450e0();
        }
        if (i == 4107) {
            return mo17449d0();
        }
        if (i == 4119) {
            return mo17476z0();
        }
        if (i == 4120) {
            return mo17408C();
        }
        switch (i) {
            case 257:
                return mo17424K();
            case 258:
                return mo17452g0();
            case 259:
                return mo17453h0();
            default:
                switch (i) {
                    case 512:
                        return mo17415F0();
                    case 513:
                        return mo17462q0();
                    case 514:
                        return mo17465t0();
                    case 515:
                        return mo17404A();
                    case 516:
                        return mo17436Q();
                    case 517:
                        return mo17445Z();
                    default:
                        switch (i) {
                            case 4096:
                                return mo17413E0();
                            case 4097:
                                return mo17461p0();
                            case 4098:
                                return mo17467v();
                            default:
                                switch (i) {
                                    case 61442:
                                        return mo17438S();
                                    case 61443:
                                        return mo17442W();
                                    case 61444:
                                        return mo17429M0();
                                    case 61445:
                                        return mo17455j0();
                                    case 61446:
                                        return mo17454i0();
                                    case 61447:
                                        return mo17411D0();
                                    case 61448:
                                        return mo17470w0();
                                    case 61449:
                                        return mo17473y();
                                    case 61450:
                                        return mo17475z();
                                    case 61451:
                                        return mo17469w();
                                    case 61452:
                                        return mo17464s0();
                                    case 61453:
                                        return mo17434P();
                                    case 61454:
                                        return mo17437R();
                                    case 61455:
                                        return mo17410D();
                                    default:
                                        switch (i) {
                                            case 61457:
                                                return mo17457l0();
                                            case 61458:
                                                return mo17459n0();
                                            case 61459:
                                                return mo17444Y();
                                            case 61460:
                                                return mo17447b0();
                                            case 61461:
                                                return mo17441V();
                                            case 61462:
                                                return mo17430N();
                                            case 61463:
                                                return mo17423J0();
                                            case 61464:
                                                return mo17468v0();
                                            default:
                                                switch (i) {
                                                    case 61467:
                                                        return mo17439T();
                                                    case 61468:
                                                        return mo17463r0();
                                                    case 61469:
                                                        return mo17433O0();
                                                    case 61470:
                                                        return mo17431N0();
                                                    case 61471:
                                                        return mo17427L0();
                                                    case 61472:
                                                        return mo17405A0();
                                                    case 61473:
                                                        return mo17426L();
                                                    case 61474:
                                                        return mo17407B0();
                                                    case 61475:
                                                        return mo17421I0();
                                                    case 61476:
                                                        return mo17440U();
                                                    case 61477:
                                                        return mo17460o0();
                                                    case 61478:
                                                        return mo17414F();
                                                    case 61479:
                                                        return mo17458m0();
                                                    case 61480:
                                                        return mo17451f0();
                                                    case 61481:
                                                        return mo17422J();
                                                    case 61482:
                                                        return mo17418H();
                                                    case 61483:
                                                        return mo17406B();
                                                    case 61484:
                                                        return mo17456k0();
                                                    case 61485:
                                                        return mo17471x();
                                                    case 61486:
                                                        return mo17417G0();
                                                    case 61487:
                                                        return mo17419H0();
                                                    case 61488:
                                                        return mo17435P0();
                                                    case 61489:
                                                        return mo17448c0();
                                                    case 61490:
                                                        return mo17446a0();
                                                    case 61491:
                                                        return mo17432O();
                                                    default:
                                                        return super.mo17110f(i);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: f0 */
    public String mo17451f0() {
        return mo17194m(61480, "Standard Form", "Data Form");
    }

    /* renamed from: g0 */
    public String mo17452g0() {
        return mo17194m(258, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    /* renamed from: h0 */
    public String mo17453h0() {
        return mo17194m(259, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    /* renamed from: i0 */
    public String mo17454i0() {
        return mo17194m(61446, "Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine");
    }

    /* renamed from: j0 */
    public String mo17455j0() {
        return mo17194m(61445, "2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480");
    }

    /* renamed from: k0 */
    public String mo17456k0() {
        return mo17194m(61484, "Did Not Fire", "Fired");
    }

    /* renamed from: l0 */
    public String mo17457l0() {
        if (!((C5776f0) this.f16215a).mo17478V()) {
            return "N/A";
        }
        Long m = ((C5776f0) this.f16215a).mo17149m(61457);
        if (m == null) {
            return null;
        }
        return m + " min";
    }

    /* renamed from: m0 */
    public String mo17458m0() {
        return mo17194m(61479, "Still Image", "Time Lapse Movie");
    }

    /* renamed from: n0 */
    public String mo17459n0() {
        if (!((C5776f0) this.f16215a).mo17478V()) {
            return "N/A";
        }
        Long m = ((C5776f0) this.f16215a).mo17149m(61458);
        if (m == null) {
            return null;
        }
        return Long.toString(m.longValue());
    }

    /* renamed from: o0 */
    public String mo17460o0() {
        return mo17194m(61477, "100", "200", "400", "800", "Auto", "64");
    }

    /* renamed from: p0 */
    public String mo17461p0() {
        C5712m p = ((C5776f0) this.f16215a).mo17151p(4097);
        if (p == null) {
            return null;
        }
        return String.valueOf(Math.round(Math.pow(2.0d, p.doubleValue() - 5.0d) * 100.0d));
    }

    /* renamed from: q0 */
    public String mo17462q0() {
        String r = ((C5776f0) this.f16215a).mo17153r(519);
        if (r == null) {
            return mo17193l(513, 1, "Standard Quality", "High Quality", "Super High Quality");
        }
        Integer l = ((C5776f0) this.f16215a).mo17148l(513);
        if (l == null) {
            return null;
        }
        if ((!r.startsWith("SX") || r.startsWith("SX151")) && !r.startsWith("D4322")) {
            int intValue = l.intValue();
            if (intValue == 0) {
                return "Standard Quality (Low)";
            }
            if (intValue == 1) {
                return "High Quality (Normal)";
            }
            if (intValue == 2) {
                return "Super High Quality (Fine)";
            }
            if (intValue == 4) {
                return "RAW";
            }
            if (intValue == 5) {
                return "Medium-Fine";
            }
            if (intValue == 6) {
                return "Small-Fine";
            }
            if (intValue == 33) {
                return "Uncompressed";
            }
            return "Unknown (" + l.toString() + ")";
        }
        int intValue2 = l.intValue();
        if (intValue2 == 0) {
            return "Standard Quality (Low)";
        }
        if (intValue2 == 1) {
            return "High Quality (Normal)";
        }
        if (intValue2 == 2) {
            return "Super High Quality (Fine)";
        }
        if (intValue2 == 6) {
            return "RAW";
        }
        return "Unknown (" + l.toString() + ")";
    }

    /* renamed from: r0 */
    public String mo17463r0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61468);
        if (m == null) {
            return null;
        }
        return m.longValue() == 0 ? "File Number Memory Off" : Long.toString(m.longValue());
    }

    /* renamed from: s0 */
    public String mo17464s0() {
        return mo17194m(61452, "Off", "On");
    }

    /* renamed from: t0 */
    public String mo17465t0() {
        return mo17194m(514, "Normal (no macro)", "Macro");
    }

    /* renamed from: u0 */
    public String mo17466u0() {
        return mo17202u(0, 2);
    }

    /* renamed from: v */
    public String mo17467v() {
        Double h = ((C5776f0) this.f16215a).mo17144h(4098);
        if (h == null) {
            return null;
        }
        return C5739i.m21432h(C5660e.m21091a(h.doubleValue()));
    }

    /* renamed from: v0 */
    public String mo17468v0() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61463);
        if (m == null) {
            return null;
        }
        return C5739i.m21432h(Math.pow((((double) m.longValue()) / 16.0d) - 0.5d, 2.0d));
    }

    /* renamed from: w */
    public String mo17469w() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61451);
        if (m == null) {
            return null;
        }
        return C5739i.m21432h(Math.pow((((double) m.longValue()) / 16.0d) - 0.5d, 2.0d));
    }

    /* renamed from: w0 */
    public String mo17470w0() {
        return mo17194m(61448, "Multi-Segment", "Centre Weighted", "Spot");
    }

    /* renamed from: x */
    public String mo17471x() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61485);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (m == null) {
            return null;
        }
        return decimalFormat.format((((double) m.longValue()) / 8.0d) - 6.0d);
    }

    /* renamed from: x0 */
    public String mo17472x0() {
        return mo17194m(770, "Off", "On", "On (Preset)");
    }

    /* renamed from: y */
    public String mo17473y() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61449);
        if (m == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(Math.pow((((double) m.longValue()) / 8.0d) - 1.0d, 2.0d) * 3.125d);
    }

    /* renamed from: y0 */
    public String mo17474y0() {
        return mo17194m(4149, "No", "Yes");
    }

    /* renamed from: z */
    public String mo17475z() {
        Long m = ((C5776f0) this.f16215a).mo17149m(61450);
        if (m == null) {
            return null;
        }
        double pow = Math.pow(((double) (49 - m.longValue())) / 8.0d, 2.0d);
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(pow) + " sec";
    }

    /* renamed from: z0 */
    public String mo17476z0() {
        int[] k = ((C5776f0) this.f16215a).mo17147k(4119);
        if (k == null) {
            return null;
        }
        return String.valueOf(((double) ((short) k[0])) / 256.0d);
    }
}
