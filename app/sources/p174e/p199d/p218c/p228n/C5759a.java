package p174e.p199d.p218c.p228n;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p174e.p199d.p200a.C5660e;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a */
public abstract class C5759a<T extends C5722b> extends C5739i<T> {

    /* renamed from: b */
    private final boolean f16272b = true;

    public C5759a(T t) {
        super(t);
    }

    /* renamed from: D0 */
    private String m21515D0(int i) {
        byte[] e = this.f16215a.mo17141e(i);
        if (e == null) {
            return null;
        }
        try {
            return new String(e, "UTF-16LE").trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r12.length >= ((r5 * r6) + 2)) goto L_0x0052;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m21516v(int r12) {
        /*
            r11 = this;
            T r0 = r11.f16215a
            byte[] r12 = r0.mo17141e(r12)
            if (r12 != 0) goto L_0x000a
            r12 = 0
            return r12
        L_0x000a:
            int r0 = r12.length
            r1 = 4
            r2 = 0
            if (r0 >= r1) goto L_0x001d
            int r0 = r12.length
            int[] r0 = new int[r0]
        L_0x0012:
            int r1 = r12.length
            if (r2 >= r1) goto L_0x001c
            byte r1 = r12[r2]
            r0[r2] = r1
            int r2 = r2 + 1
            goto L_0x0012
        L_0x001c:
            return r0
        L_0x001d:
            int r0 = r12.length
            r3 = 2
            int r0 = r0 - r3
            int[] r0 = new int[r0]
            e.d.b.b r4 = new e.d.b.b     // Catch:{ IOException -> 0x006c }
            r4.<init>(r12)     // Catch:{ IOException -> 0x006c }
            short r5 = r4.mo17042f(r2)     // Catch:{ IOException -> 0x006c }
            short r6 = r4.mo17042f(r3)     // Catch:{ IOException -> 0x006c }
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x006c }
            int r8 = r5 * r6
            int r8 = r8 + r3
            int r9 = r12.length     // Catch:{ IOException -> 0x006c }
            r10 = 1
            if (r8 <= r9) goto L_0x0052
            boolean r5 = r4.mo17057v()     // Catch:{ IOException -> 0x006c }
            if (r5 != 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r4.mo17058w(r5)     // Catch:{ IOException -> 0x006c }
            short r5 = r4.mo17042f(r2)     // Catch:{ IOException -> 0x006c }
            short r6 = r4.mo17042f(r3)     // Catch:{ IOException -> 0x006c }
            int r8 = r12.length     // Catch:{ IOException -> 0x006c }
            int r9 = r5 * r6
            int r9 = r9 + r3
            if (r8 < r9) goto L_0x0054
        L_0x0052:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x006c }
        L_0x0054:
            boolean r3 = r7.booleanValue()     // Catch:{ IOException -> 0x006c }
            if (r3 == 0) goto L_0x0087
            r0[r2] = r5     // Catch:{ IOException -> 0x006c }
            r0[r10] = r6     // Catch:{ IOException -> 0x006c }
        L_0x005e:
            int r2 = r12.length     // Catch:{ IOException -> 0x006c }
            if (r1 >= r2) goto L_0x0087
            int r2 = r1 + -2
            byte r3 = r4.mo17046j(r1)     // Catch:{ IOException -> 0x006c }
            r0[r2] = r3     // Catch:{ IOException -> 0x006c }
            int r1 = r1 + 1
            goto L_0x005e
        L_0x006c:
            r12 = move-exception
            T r1 = r11.f16215a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IO exception processing data: "
            r2.append(r3)
            java.lang.String r12 = r12.getMessage()
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.mo17137a(r12)
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p228n.C5759a.m21516v(int):int[]");
    }

    /* renamed from: w */
    private static String m21517w(int[] iArr) {
        String str;
        if (iArr == null) {
            return null;
        }
        if (iArr.length < 2) {
            return "<truncated data>";
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return "<zero pattern size>";
        }
        int i = (iArr[0] * iArr[1]) + 2;
        if (i > iArr.length) {
            return "<invalid pattern size>";
        }
        String[] strArr = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "White"};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i2 = 2; i2 < i; i2++) {
            sb.append(iArr[i2] <= 6 ? strArr[iArr[i2]] : "Unknown");
            if ((i2 - 2) % iArr[1] == 0) {
                str = ",";
            } else if (i2 != i - 1) {
                str = "][";
            }
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: A */
    public String mo17231A() {
        byte[] e = this.f16215a.mo17141e(33422);
        if (e == null) {
            return null;
        }
        int[] k = this.f16215a.mo17147k(33421);
        if (k == null) {
            return String.format("Repeat Pattern not found for CFAPattern (%s)", new Object[]{super.mo17110f(33422)});
        } else if (k.length == 2 && e.length == k[0] * k[1]) {
            int[] iArr = new int[(e.length + 2)];
            iArr[0] = k[0];
            iArr[1] = k[1];
            for (int i = 0; i < e.length; i++) {
                iArr[i + 2] = e[i] & 255;
            }
            return m21517w(iArr);
        } else {
            return String.format("Unknown Pattern (%s)", new Object[]{super.mo17110f(33422)});
        }
    }

    /* renamed from: A0 */
    public String mo17232A0() {
        C5712m p = this.f16215a.mo17151p(37382);
        if (p == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        return decimalFormat.format(p.doubleValue()) + " metres";
    }

    /* renamed from: B */
    public String mo17233B() {
        return m21517w(m21516v(41730));
    }

    /* renamed from: B0 */
    public String mo17234B0() {
        return mo17194m(41996, "Unknown", "Macro", "Close view", "Distant view");
    }

    /* renamed from: C */
    public String mo17235C() {
        Integer l = this.f16215a.mo17148l(40961);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 1) {
            return "sRGB";
        }
        if (l.intValue() == 65535) {
            return "Undefined";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: C0 */
    public String mo17236C0() {
        return mo17193l(263, 1, "No dithering or halftoning", "Ordered dither or halftone", "Randomized dither");
    }

    /* renamed from: D */
    public String mo17237D() {
        int[] k = this.f16215a.mo17147k(37121);
        if (k == null) {
            return null;
        }
        String[] strArr = {HttpUrl.FRAGMENT_ENCODE_SET, "Y", "Cb", "Cr", "R", "G", "B"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(4, k.length); i++) {
            int i2 = k[i];
            if (i2 > 0 && i2 < 7) {
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }

    /* renamed from: E */
    public String mo17238E() {
        String str;
        StringBuilder sb;
        C5712m p = this.f16215a.mo17151p(37122);
        if (p == null) {
            return null;
        }
        String K = p.mo17064K(true);
        if (!p.mo17062D() || p.intValue() != 1) {
            sb = new StringBuilder();
            sb.append(K);
            str = " bits/pixel";
        } else {
            sb = new StringBuilder();
            sb.append(K);
            str = " bit/pixel";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: E0 */
    public String mo17239E0() {
        byte[] e = this.f16215a.mo17141e(37510);
        if (e == null) {
            return null;
        }
        if (e.length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ASCII", System.getProperty("file.encoding"));
        hashMap.put("UNICODE", "UTF-16LE");
        hashMap.put("JIS", "Shift-JIS");
        try {
            if (e.length >= 10) {
                String str = new String(e, 0, 10);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str.startsWith(str2)) {
                        for (int length = str2.length(); length < 10; length++) {
                            byte b = e[length];
                            if (b != 0 && b != 32) {
                                return new String(e, length, e.length - length, str3).trim();
                            }
                        }
                        return new String(e, 10, e.length - 10, str3).trim();
                    }
                }
            }
            return new String(e, System.getProperty("file.encoding")).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: F */
    public String mo17240F() {
        Integer l = this.f16215a.mo17148l(259);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 32766) {
            return "Next";
        }
        if (intValue == 32767) {
            return "Sony ARW Compressed";
        }
        switch (intValue) {
            case 1:
                return "Uncompressed";
            case 2:
                return "CCITT 1D";
            case 3:
                return "T4/Group 3 Fax";
            case 4:
                return "T6/Group 4 Fax";
            case 5:
                return "LZW";
            case 6:
                return "JPEG (old-style)";
            case 7:
                return "JPEG";
            case 8:
                return "Adobe Deflate";
            case 9:
                return "JBIG B&W";
            case 10:
                return "JBIG Color";
            default:
                switch (intValue) {
                    case 99:
                        return "JPEG";
                    case 262:
                        return "Kodak 262";
                    case 32809:
                        return "Thunderscan";
                    case 32867:
                        return "Kodak KDC Compressed";
                    case 34661:
                        return "JBIG";
                    case 34715:
                        return "JBIG2 TIFF FX";
                    case 34892:
                        return "Lossy JPEG";
                    case 65000:
                        return "Kodak DCR Compressed";
                    case Settings.DEFAULT_INITIAL_WINDOW_SIZE /*65535*/:
                        return "Pentax PEF Compressed";
                    default:
                        switch (intValue) {
                            case 32769:
                                return "Packed RAW";
                            case 32770:
                                return "Samsung SRW Compressed";
                            case 32771:
                                return "CCIRLEW";
                            case 32772:
                                return "Samsung SRW Compressed 2";
                            case 32773:
                                return "PackBits";
                            default:
                                switch (intValue) {
                                    case 32895:
                                        return "IT8CTPAD";
                                    case 32896:
                                        return "IT8LW";
                                    case 32897:
                                        return "IT8MP";
                                    case 32898:
                                        return "IT8BL";
                                    default:
                                        switch (intValue) {
                                            case 32908:
                                                return "PixarFilm";
                                            case 32909:
                                                return "PixarLog";
                                            default:
                                                switch (intValue) {
                                                    case 32946:
                                                        return "Deflate";
                                                    case 32947:
                                                        return "DCS";
                                                    default:
                                                        switch (intValue) {
                                                            case 34676:
                                                                return "SGILog";
                                                            case 34677:
                                                                return "SGILog24";
                                                            default:
                                                                switch (intValue) {
                                                                    case 34712:
                                                                        return "JPEG 2000";
                                                                    case 34713:
                                                                        return "Nikon NEF Compressed";
                                                                    default:
                                                                        switch (intValue) {
                                                                            case 34718:
                                                                                return "Microsoft Document Imaging (MDI) Binary Level Codec";
                                                                            case 34719:
                                                                                return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                                                                            case 34720:
                                                                                return "Microsoft Document Imaging (MDI) Vector";
                                                                            default:
                                                                                return "Unknown (" + l + ")";
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: F0 */
    public String mo17241F0() {
        Integer l = this.f16215a.mo17148l(37384);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Unknown";
        }
        if (intValue == 1) {
            return "Daylight";
        }
        if (intValue == 2) {
            return "Florescent";
        }
        if (intValue == 3) {
            return "Tungsten";
        }
        if (intValue == 4) {
            return "Flash";
        }
        if (intValue == 255) {
            return "(Other)";
        }
        switch (intValue) {
            case 9:
                return "Fine Weather";
            case 10:
                return "Cloudy";
            case 11:
                return "Shade";
            case 12:
                return "Daylight Fluorescent";
            case 13:
                return "Day White Fluorescent";
            case 14:
                return "Cool White Fluorescent";
            case 15:
                return "White Fluorescent";
            case 16:
                return "Warm White Fluorescent";
            case 17:
                return "Standard light";
            case 18:
                return "Standard light (B)";
            case 19:
                return "Standard light (C)";
            case 20:
                return "D55";
            case 21:
                return "D65";
            case 22:
                return "D75";
            case 23:
                return "D50";
            case 24:
                return "Studio Tungsten";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: G */
    public String mo17242G() {
        return mo17194m(41992, "None", "Soft", "Hard");
    }

    /* renamed from: G0 */
    public String mo17243G0() {
        return mo17194m(41987, "Auto white balance", "Manual white balance");
    }

    /* renamed from: H */
    public String mo17244H() {
        return mo17194m(41985, "Normal process", "Custom process");
    }

    /* renamed from: H0 */
    public String mo17245H0() {
        return m21515D0(40093);
    }

    /* renamed from: I */
    public String mo17246I() {
        C5712m p = this.f16215a.mo17151p(41988);
        if (p == null) {
            return null;
        }
        return p.mo17078z() == 0 ? "Digital zoom not used" : new DecimalFormat("0.#").format(p.doubleValue());
    }

    /* renamed from: I0 */
    public String mo17247I0() {
        return m21515D0(40092);
    }

    /* renamed from: J */
    public String mo17248J() {
        Integer l = this.f16215a.mo17148l(40963);
        if (l == null) {
            return null;
        }
        return l + " pixels";
    }

    /* renamed from: J0 */
    public String mo17249J0() {
        return m21515D0(40094);
    }

    /* renamed from: K */
    public String mo17250K() {
        Integer l = this.f16215a.mo17148l(40962);
        if (l == null) {
            return null;
        }
        return l + " pixels";
    }

    /* renamed from: K0 */
    public String mo17251K0() {
        return m21515D0(40095);
    }

    /* renamed from: L */
    public String mo17252L() {
        return mo17202u(36864, 2);
    }

    /* renamed from: L0 */
    public String mo17253L0() {
        return m21515D0(40091);
    }

    /* renamed from: M */
    public String mo17254M() {
        C5712m p = this.f16215a.mo17151p(37380);
        if (p == null) {
            return null;
        }
        return p.mo17064K(true) + " EV";
    }

    /* renamed from: M0 */
    public String mo17255M0() {
        C5712m p = this.f16215a.mo17151p(282);
        if (p == null) {
            return null;
        }
        String o0 = mo17286o0();
        Object[] objArr = new Object[2];
        objArr[0] = p.mo17064K(true);
        objArr[1] = o0 == null ? "unit" : o0.toLowerCase();
        return String.format("%s dots per %s", objArr);
    }

    /* renamed from: N */
    public String mo17256N() {
        return mo17194m(41986, "Auto exposure", "Manual exposure", "Auto bracket");
    }

    /* renamed from: N0 */
    public String mo17257N0() {
        return mo17193l(531, 1, "Center of pixel array", "Datum point");
    }

    /* renamed from: O */
    public String mo17258O() {
        return mo17193l(34850, 1, "Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode");
    }

    /* renamed from: O0 */
    public String mo17259O0() {
        int[] k = this.f16215a.mo17147k(530);
        if (k == null || k.length < 2) {
            return null;
        }
        return (k[0] == 2 && k[1] == 1) ? "YCbCr4:2:2" : (k[0] == 2 && k[1] == 2) ? "YCbCr4:2:0" : "(Unknown)";
    }

    /* renamed from: P */
    public String mo17260P() {
        String r = this.f16215a.mo17153r(33434);
        if (r == null) {
            return null;
        }
        return r + " sec";
    }

    /* renamed from: P0 */
    public String mo17261P0() {
        C5712m p = this.f16215a.mo17151p(283);
        if (p == null) {
            return null;
        }
        String o0 = mo17286o0();
        Object[] objArr = new Object[2];
        objArr[0] = p.mo17064K(true);
        objArr[1] = o0 == null ? "unit" : o0.toLowerCase();
        return String.format("%s dots per %s", objArr);
    }

    /* renamed from: Q */
    public String mo17262Q() {
        C5712m p = this.f16215a.mo17151p(33437);
        if (p == null) {
            return null;
        }
        return C5739i.m21432h(p.doubleValue());
    }

    /* renamed from: R */
    public String mo17263R() {
        return mo17193l(41728, 1, "Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)");
    }

    /* renamed from: S */
    public String mo17264S() {
        return mo17193l(266, 1, "Normal", "Reversed");
    }

    /* renamed from: T */
    public String mo17265T() {
        Integer l = this.f16215a.mo17148l(37385);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((l.intValue() & 1) != 0 ? "Flash fired" : "Flash did not fire");
        if ((l.intValue() & 4) != 0) {
            sb.append((l.intValue() & 2) != 0 ? ", return detected" : ", return not detected");
        }
        if ((l.intValue() & 16) != 0) {
            sb.append(", auto");
        }
        if ((l.intValue() & 64) != 0) {
            sb.append(", red-eye reduction");
        }
        return sb.toString();
    }

    /* renamed from: U */
    public String mo17266U() {
        return mo17202u(40960, 2);
    }

    /* renamed from: V */
    public String mo17267V() {
        C5712m p = this.f16215a.mo17151p(37386);
        if (p == null) {
            return null;
        }
        return C5739i.m21433i(p.doubleValue());
    }

    /* renamed from: W */
    public String mo17268W() {
        return mo17193l(41488, 1, "(No unit)", "Inches", "cm");
    }

    /* renamed from: X */
    public String mo17269X() {
        String str;
        C5712m p = this.f16215a.mo17151p(41486);
        if (p == null) {
            return null;
        }
        String W = mo17268W();
        StringBuilder sb = new StringBuilder();
        sb.append(p.mo17060A().mo17064K(true));
        if (W == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = " " + W.toLowerCase();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: Y */
    public String mo17270Y() {
        String str;
        C5712m p = this.f16215a.mo17151p(41487);
        if (p == null) {
            return null;
        }
        String W = mo17268W();
        StringBuilder sb = new StringBuilder();
        sb.append(p.mo17060A().mo17064K(true));
        if (W == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = " " + W.toLowerCase();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: Z */
    public String mo17271Z() {
        return mo17194m(41991, "None", "Low gain up", "Low gain down", "High gain up", "High gain down");
    }

    /* renamed from: a0 */
    public String mo17272a0() {
        String r = this.f16215a.mo17153r(257);
        if (r == null) {
            return null;
        }
        return r + " pixels";
    }

    /* renamed from: b0 */
    public String mo17273b0() {
        String r = this.f16215a.mo17153r(256);
        if (r == null) {
            return null;
        }
        return r + " pixels";
    }

    /* renamed from: c0 */
    public String mo17274c0() {
        String r = this.f16215a.mo17153r(1);
        if (r == null) {
            return null;
        }
        if ("R98".equalsIgnoreCase(r.trim())) {
            return "Recommended Exif Interoperability Rules (ExifR98)";
        }
        return "Unknown (" + r + ")";
    }

    /* renamed from: d0 */
    public String mo17275d0() {
        return mo17202u(2, 2);
    }

    /* renamed from: e0 */
    public String mo17276e0() {
        Integer l = this.f16215a.mo17148l(34855);
        if (l != null) {
            return Integer.toString(l.intValue());
        }
        return null;
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 1:
                return mo17274c0();
            case 2:
                return mo17275d0();
            case 254:
                return mo17281j0();
            case 255:
                return mo17300z0();
            case 256:
                return mo17273b0();
            case 257:
                return mo17272a0();
            case 258:
                return mo17299z();
            case 259:
                return mo17240F();
            case 262:
                return mo17283l0();
            case 263:
                return mo17236C0();
            case 266:
                return mo17264S();
            case 274:
                return mo17282k0();
            case 277:
                return mo17288q0();
            case 278:
                return mo17287p0();
            case 279:
                return mo17298y0();
            case 282:
                return mo17255M0();
            case 283:
                return mo17261P0();
            case 284:
                return mo17284m0();
            case 296:
                return mo17286o0();
            case 512:
                return mo17277f0();
            case 530:
                return mo17259O0();
            case 531:
                return mo17257N0();
            case 532:
                return mo17285n0();
            case 33422:
                return mo17231A();
            case 33434:
                return mo17260P();
            case 33437:
                return mo17262Q();
            case 34850:
                return mo17258O();
            case 34855:
                return mo17276e0();
            case 34864:
                return mo17293v0();
            case 36864:
                return mo17252L();
            case 37121:
                return mo17237D();
            case 37122:
                return mo17238E();
            case 37377:
                return mo17296x0();
            case 37378:
                return mo17297y();
            case 37380:
                return mo17254M();
            case 37381:
                return mo17279h0();
            case 37382:
                return mo17232A0();
            case 37383:
                return mo17280i0();
            case 37384:
                return mo17241F0();
            case 37385:
                return mo17265T();
            case 37386:
                return mo17267V();
            case 37510:
                return mo17239E0();
            case 40091:
                return mo17253L0();
            case 40092:
                return mo17247I0();
            case 40093:
                return mo17245H0();
            case 40094:
                return mo17249J0();
            case 40095:
                return mo17251K0();
            case 40960:
                return mo17266U();
            case 40961:
                return mo17235C();
            case 40962:
                return mo17250K();
            case 40963:
                return mo17248J();
            case 41486:
                return mo17269X();
            case 41487:
                return mo17270Y();
            case 41488:
                return mo17268W();
            case 41495:
                return mo17292u0();
            case 41728:
                return mo17263R();
            case 41729:
                return mo17291t0();
            case 41730:
                return mo17233B();
            case 41985:
                return mo17244H();
            case 41986:
                return mo17256N();
            case 41987:
                return mo17243G0();
            case 41988:
                return mo17246I();
            case 41989:
                return mo17295x();
            case 41990:
                return mo17290s0();
            case 41991:
                return mo17271Z();
            case 41992:
                return mo17242G();
            case 41993:
                return mo17289r0();
            case 41994:
                return mo17294w0();
            case 41996:
                return mo17234B0();
            case 42034:
                return mo17278g0();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: f0 */
    public String mo17277f0() {
        Integer l = this.f16215a.mo17148l(512);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "Baseline";
        }
        if (intValue == 14) {
            return "Lossless";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: g0 */
    public String mo17278g0() {
        return mo17195n(42034);
    }

    /* renamed from: h0 */
    public String mo17279h0() {
        Double h = this.f16215a.mo17144h(37381);
        if (h == null) {
            return null;
        }
        return C5739i.m21432h(C5660e.m21091a(h.doubleValue()));
    }

    /* renamed from: i0 */
    public String mo17280i0() {
        Integer l = this.f16215a.mo17148l(37383);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 255) {
            return "(Other)";
        }
        switch (intValue) {
            case 0:
                return "Unknown";
            case 1:
                return "Average";
            case 2:
                return "Center weighted average";
            case 3:
                return "Spot";
            case 4:
                return "Multi-spot";
            case 5:
                return "Multi-segment";
            case 6:
                return "Partial";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: j0 */
    public String mo17281j0() {
        return mo17193l(254, 0, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image");
    }

    /* renamed from: k0 */
    public String mo17282k0() {
        return super.mo17197p(274);
    }

    /* renamed from: l0 */
    public String mo17283l0() {
        Integer l = this.f16215a.mo17148l(262);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 32803) {
            return "Color Filter Array";
        }
        if (intValue == 32892) {
            return "Linear Raw";
        }
        switch (intValue) {
            case 0:
                return "WhiteIsZero";
            case 1:
                return "BlackIsZero";
            case 2:
                return "RGB";
            case 3:
                return "RGB Palette";
            case 4:
                return "Transparency Mask";
            case 5:
                return "CMYK";
            case 6:
                return "YCbCr";
            default:
                switch (intValue) {
                    case 8:
                        return "CIELab";
                    case 9:
                        return "ICCLab";
                    case 10:
                        return "ITULab";
                    default:
                        switch (intValue) {
                            case 32844:
                                return "Pixar LogL";
                            case 32845:
                                return "Pixar LogLuv";
                            default:
                                return "Unknown colour space";
                        }
                }
        }
    }

    /* renamed from: m0 */
    public String mo17284m0() {
        return mo17193l(284, 1, "Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)");
    }

    /* renamed from: n0 */
    public String mo17285n0() {
        int[] k = this.f16215a.mo17147k(532);
        if (k == null || k.length < 6) {
            Object o = this.f16215a.mo17150o(532);
            if (o == null || !(o instanceof long[])) {
                return null;
            }
            long[] jArr = (long[]) o;
            if (jArr.length < 6) {
                return null;
            }
            int[] iArr = new int[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                iArr[i] = (int) jArr[i];
            }
            k = iArr;
        }
        int i2 = k[0];
        int i3 = k[1];
        int i4 = k[2];
        int i5 = k[3];
        return String.format("[%d,%d,%d] [%d,%d,%d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(k[4]), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(k[5])});
    }

    /* renamed from: o0 */
    public String mo17286o0() {
        return mo17193l(296, 1, "(No unit)", "Inch", "cm");
    }

    /* renamed from: p0 */
    public String mo17287p0() {
        String r = this.f16215a.mo17153r(278);
        if (r == null) {
            return null;
        }
        return r + " rows/strip";
    }

    /* renamed from: q0 */
    public String mo17288q0() {
        String r = this.f16215a.mo17153r(277);
        if (r == null) {
            return null;
        }
        return r + " samples/pixel";
    }

    /* renamed from: r0 */
    public String mo17289r0() {
        return mo17194m(41993, "None", "Low saturation", "High saturation");
    }

    /* renamed from: s0 */
    public String mo17290s0() {
        return mo17194m(41990, "Standard", "Landscape", "Portrait", "Night scene");
    }

    /* renamed from: t0 */
    public String mo17291t0() {
        return mo17193l(41729, 1, "Directly photographed image");
    }

    /* renamed from: u0 */
    public String mo17292u0() {
        return mo17193l(41495, 1, "(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", null, "Trilinear sensor", "Color sequential linear sensor");
    }

    /* renamed from: v0 */
    public String mo17293v0() {
        return mo17194m(34864, "Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed");
    }

    /* renamed from: w0 */
    public String mo17294w0() {
        return mo17194m(41994, "None", "Low", "Hard");
    }

    /* renamed from: x */
    public String mo17295x() {
        Integer l = this.f16215a.mo17148l(41989);
        if (l == null) {
            return null;
        }
        return l.intValue() == 0 ? "Unknown" : C5739i.m21433i((double) l.intValue());
    }

    /* renamed from: x0 */
    public String mo17296x0() {
        return super.mo17199r(37377);
    }

    /* renamed from: y */
    public String mo17297y() {
        Double h = this.f16215a.mo17144h(37378);
        if (h == null) {
            return null;
        }
        return C5739i.m21432h(C5660e.m21091a(h.doubleValue()));
    }

    /* renamed from: y0 */
    public String mo17298y0() {
        String r = this.f16215a.mo17153r(279);
        if (r == null) {
            return null;
        }
        return r + " bytes";
    }

    /* renamed from: z */
    public String mo17299z() {
        String r = this.f16215a.mo17153r(258);
        if (r == null) {
            return null;
        }
        return r + " bits/component/pixel";
    }

    /* renamed from: z0 */
    public String mo17300z0() {
        return mo17193l(255, 1, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image");
    }
}
