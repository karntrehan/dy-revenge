package p174e.p199d.p218c.p232q;

import java.io.IOException;
import okhttp3.HttpUrl;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.q.a */
public class C5858a extends C5739i<C5859b> {
    public C5858a(C5859b bVar) {
        super(bVar);
    }

    /* renamed from: A */
    private String m22258A() {
        return mo17194m(64, "Perceptual", "Media-Relative Colorimetric", "Saturation", "ICC-Absolute Colorimetric");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:20|21|22|23|24|80|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        return new java.lang.String(r2, 8, (r2.length - 8) - 1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0082 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0082=Splitter:B:23:0x0082, B:13:0x0043=Splitter:B:13:0x0043} */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m22259B(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            T r2 = r0.f16215a     // Catch:{ IOException -> 0x020a }
            e.d.c.q.b r2 = (p174e.p199d.p218c.p232q.C5859b) r2     // Catch:{ IOException -> 0x020a }
            byte[] r2 = r2.mo17141e(r1)     // Catch:{ IOException -> 0x020a }
            if (r2 != 0) goto L_0x0017
            T r2 = r0.f16215a     // Catch:{ IOException -> 0x020a }
            e.d.c.q.b r2 = (p174e.p199d.p218c.p232q.C5859b) r2     // Catch:{ IOException -> 0x020a }
            java.lang.String r1 = r2.mo17153r(r1)     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x0017:
            e.d.b.b r1 = new e.d.b.b     // Catch:{ IOException -> 0x020a }
            r1.<init>(r2)     // Catch:{ IOException -> 0x020a }
            r3 = 0
            int r4 = r1.mo17044h(r3)     // Catch:{ IOException -> 0x020a }
            java.lang.String r5 = ")"
            java.lang.String r6 = "("
            r7 = 7
            r8 = 16
            r9 = 3
            java.lang.String r10 = ", "
            r11 = 2
            r12 = 12
            r13 = 1
            r14 = 8
            switch(r4) {
                case 1482250784: goto L_0x019b;
                case 1668641398: goto L_0x016c;
                case 1684370275: goto L_0x0161;
                case 1835360627: goto L_0x00a0;
                case 1835824483: goto L_0x0055;
                case 1936287520: goto L_0x004c;
                case 1952807028: goto L_0x0038;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r1 = "%s (0x%08X): %d bytes"
            goto L_0x01f0
        L_0x0038:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0043 }
            int r3 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x0043 }
            int r3 = r3 - r14
            int r3 = r3 - r13
            java.lang.String r4 = "ASCII"
            r1.<init>(r2, r14, r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x0043 }
            return r1
        L_0x0043:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x020a }
            int r3 = r2.length     // Catch:{ IOException -> 0x020a }
            int r3 = r3 - r14
            int r3 = r3 - r13
            r1.<init>(r2, r14, r3)     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x004c:
            int r1 = r1.mo17044h(r14)     // Catch:{ IOException -> 0x020a }
            java.lang.String r1 = p174e.p199d.p218c.p232q.C5860c.m22268e(r1)     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x0055:
            int r4 = r1.mo17044h(r14)     // Catch:{ IOException -> 0x020a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x020a }
            r7.<init>()     // Catch:{ IOException -> 0x020a }
            r7.append(r4)     // Catch:{ IOException -> 0x020a }
        L_0x0061:
            if (r3 >= r4) goto L_0x009b
            int r9 = r3 * 12
            int r9 = r9 + r8
            int r10 = r1.mo17044h(r9)     // Catch:{ IOException -> 0x020a }
            java.lang.String r10 = p174e.p199d.p218c.p232q.C5860c.m22268e(r10)     // Catch:{ IOException -> 0x020a }
            int r11 = r9 + 4
            int r11 = r1.mo17044h(r11)     // Catch:{ IOException -> 0x020a }
            int r9 = r9 + 8
            int r9 = r1.mo17044h(r9)     // Catch:{ IOException -> 0x020a }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0082 }
            java.lang.String r13 = "UTF-16BE"
            r12.<init>(r2, r9, r11, r13)     // Catch:{ UnsupportedEncodingException -> 0x0082 }
            goto L_0x0087
        L_0x0082:
            java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x020a }
            r12.<init>(r2, r9, r11)     // Catch:{ IOException -> 0x020a }
        L_0x0087:
            java.lang.String r9 = " "
            r7.append(r9)     // Catch:{ IOException -> 0x020a }
            r7.append(r10)     // Catch:{ IOException -> 0x020a }
            r7.append(r6)     // Catch:{ IOException -> 0x020a }
            r7.append(r12)     // Catch:{ IOException -> 0x020a }
            r7.append(r5)     // Catch:{ IOException -> 0x020a }
            int r3 = r3 + 1
            goto L_0x0061
        L_0x009b:
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x00a0:
            int r2 = r1.mo17044h(r14)     // Catch:{ IOException -> 0x020a }
            float r4 = r1.mo17050o(r12)     // Catch:{ IOException -> 0x020a }
            float r5 = r1.mo17050o(r8)     // Catch:{ IOException -> 0x020a }
            r6 = 20
            float r6 = r1.mo17050o(r6)     // Catch:{ IOException -> 0x020a }
            r8 = 24
            int r8 = r1.mo17044h(r8)     // Catch:{ IOException -> 0x020a }
            r10 = 28
            float r10 = r1.mo17050o(r10)     // Catch:{ IOException -> 0x020a }
            r12 = 32
            int r1 = r1.mo17044h(r12)     // Catch:{ IOException -> 0x020a }
            java.lang.String r12 = "Unknown"
            java.lang.String r14 = "Unknown %d"
            if (r2 == 0) goto L_0x00e1
            if (r2 == r13) goto L_0x00de
            if (r2 == r11) goto L_0x00db
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ IOException -> 0x020a }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x020a }
            r15[r3] = r16     // Catch:{ IOException -> 0x020a }
            java.lang.String r15 = java.lang.String.format(r14, r15)     // Catch:{ IOException -> 0x020a }
            goto L_0x00e2
        L_0x00db:
            java.lang.String r15 = "1964 10°"
            goto L_0x00e2
        L_0x00de:
            java.lang.String r15 = "1931 2°"
            goto L_0x00e2
        L_0x00e1:
            r15 = r12
        L_0x00e2:
            if (r8 == 0) goto L_0x00fa
            if (r8 == r13) goto L_0x00f8
            if (r8 == r11) goto L_0x00f5
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ IOException -> 0x020a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x020a }
            r8[r3] = r2     // Catch:{ IOException -> 0x020a }
            java.lang.String r12 = java.lang.String.format(r14, r8)     // Catch:{ IOException -> 0x020a }
            goto L_0x00fa
        L_0x00f5:
            java.lang.String r12 = "0/d or d/0"
            goto L_0x00fa
        L_0x00f8:
            java.lang.String r12 = "0/45 or 45/0"
        L_0x00fa:
            switch(r1) {
                case 0: goto L_0x0116;
                case 1: goto L_0x0113;
                case 2: goto L_0x0110;
                case 3: goto L_0x010d;
                case 4: goto L_0x010a;
                case 5: goto L_0x0107;
                case 6: goto L_0x0104;
                case 7: goto L_0x0101;
                case 8: goto L_0x00fe;
                default: goto L_0x00fd;
            }     // Catch:{ IOException -> 0x020a }
        L_0x00fd:
            goto L_0x0119
        L_0x00fe:
            java.lang.String r1 = "F8"
            goto L_0x0125
        L_0x0101:
            java.lang.String r1 = "Equi-Power (E)"
            goto L_0x0125
        L_0x0104:
            java.lang.String r1 = "A"
            goto L_0x0125
        L_0x0107:
            java.lang.String r1 = "D55"
            goto L_0x0125
        L_0x010a:
            java.lang.String r1 = "F2"
            goto L_0x0125
        L_0x010d:
            java.lang.String r1 = "D93"
            goto L_0x0125
        L_0x0110:
            java.lang.String r1 = "D65"
            goto L_0x0125
        L_0x0113:
            java.lang.String r1 = "D50"
            goto L_0x0125
        L_0x0116:
            java.lang.String r1 = "unknown"
            goto L_0x0125
        L_0x0119:
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ IOException -> 0x020a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x020a }
            r2[r3] = r1     // Catch:{ IOException -> 0x020a }
            java.lang.String r1 = java.lang.String.format(r14, r2)     // Catch:{ IOException -> 0x020a }
        L_0x0125:
            java.text.DecimalFormat r2 = new java.text.DecimalFormat     // Catch:{ IOException -> 0x020a }
            java.lang.String r8 = "0.###"
            r2.<init>(r8)     // Catch:{ IOException -> 0x020a }
            java.lang.String r8 = "%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x020a }
            r7[r3] = r15     // Catch:{ IOException -> 0x020a }
            double r3 = (double) r4     // Catch:{ IOException -> 0x020a }
            java.lang.String r3 = r2.format(r3)     // Catch:{ IOException -> 0x020a }
            r7[r13] = r3     // Catch:{ IOException -> 0x020a }
            double r3 = (double) r5     // Catch:{ IOException -> 0x020a }
            java.lang.String r3 = r2.format(r3)     // Catch:{ IOException -> 0x020a }
            r7[r11] = r3     // Catch:{ IOException -> 0x020a }
            double r3 = (double) r6     // Catch:{ IOException -> 0x020a }
            java.lang.String r2 = r2.format(r3)     // Catch:{ IOException -> 0x020a }
            r7[r9] = r2     // Catch:{ IOException -> 0x020a }
            r2 = 4
            r7[r2] = r12     // Catch:{ IOException -> 0x020a }
            r2 = 5
            r3 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r3
            int r3 = java.lang.Math.round(r10)     // Catch:{ IOException -> 0x020a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x020a }
            r7[r2] = r3     // Catch:{ IOException -> 0x020a }
            r2 = 6
            r7[r2] = r1     // Catch:{ IOException -> 0x020a }
            java.lang.String r1 = java.lang.String.format(r8, r7)     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x0161:
            int r1 = r1.mo17044h(r14)     // Catch:{ IOException -> 0x020a }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x020a }
            int r1 = r1 - r13
            r3.<init>(r2, r12, r1)     // Catch:{ IOException -> 0x020a }
            return r3
        L_0x016c:
            int r2 = r1.mo17044h(r14)     // Catch:{ IOException -> 0x020a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x020a }
            r4.<init>()     // Catch:{ IOException -> 0x020a }
            r5 = 0
        L_0x0176:
            if (r5 >= r2) goto L_0x0196
            if (r5 == 0) goto L_0x017d
            r4.append(r10)     // Catch:{ IOException -> 0x020a }
        L_0x017d:
            int r6 = r5 * 2
            int r6 = r6 + r12
            int r6 = r1.mo17054s(r6)     // Catch:{ IOException -> 0x020a }
            float r6 = (float) r6     // Catch:{ IOException -> 0x020a }
            double r8 = (double) r6     // Catch:{ IOException -> 0x020a }
            r13 = 4679239875398991872(0x40efffe000000000, double:65535.0)
            double r8 = r8 / r13
            java.lang.String r6 = m22260v(r8, r7, r3)     // Catch:{ IOException -> 0x020a }
            r4.append(r6)     // Catch:{ IOException -> 0x020a }
            int r5 = r5 + 1
            goto L_0x0176
        L_0x0196:
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x019b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x020a }
            r4.<init>()     // Catch:{ IOException -> 0x020a }
            java.text.DecimalFormat r7 = new java.text.DecimalFormat     // Catch:{ IOException -> 0x020a }
            java.lang.String r8 = "0.####"
            r7.<init>(r8)     // Catch:{ IOException -> 0x020a }
            int r2 = r2.length     // Catch:{ IOException -> 0x020a }
            int r2 = r2 - r14
            int r2 = r2 / r12
        L_0x01aa:
            if (r3 >= r2) goto L_0x01eb
            int r8 = r3 * 12
            int r8 = r8 + r14
            float r9 = r1.mo17050o(r8)     // Catch:{ IOException -> 0x020a }
            int r11 = r8 + 4
            float r11 = r1.mo17050o(r11)     // Catch:{ IOException -> 0x020a }
            int r8 = r8 + 8
            float r8 = r1.mo17050o(r8)     // Catch:{ IOException -> 0x020a }
            if (r3 <= 0) goto L_0x01c4
            r4.append(r10)     // Catch:{ IOException -> 0x020a }
        L_0x01c4:
            r4.append(r6)     // Catch:{ IOException -> 0x020a }
            double r12 = (double) r9     // Catch:{ IOException -> 0x020a }
            java.lang.String r9 = r7.format(r12)     // Catch:{ IOException -> 0x020a }
            r4.append(r9)     // Catch:{ IOException -> 0x020a }
            r4.append(r10)     // Catch:{ IOException -> 0x020a }
            double r11 = (double) r11     // Catch:{ IOException -> 0x020a }
            java.lang.String r9 = r7.format(r11)     // Catch:{ IOException -> 0x020a }
            r4.append(r9)     // Catch:{ IOException -> 0x020a }
            r4.append(r10)     // Catch:{ IOException -> 0x020a }
            double r8 = (double) r8     // Catch:{ IOException -> 0x020a }
            java.lang.String r8 = r7.format(r8)     // Catch:{ IOException -> 0x020a }
            r4.append(r8)     // Catch:{ IOException -> 0x020a }
            r4.append(r5)     // Catch:{ IOException -> 0x020a }
            int r3 = r3 + 1
            goto L_0x01aa
        L_0x01eb:
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x01f0:
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x020a }
            java.lang.String r6 = p174e.p199d.p218c.p232q.C5860c.m22268e(r4)     // Catch:{ IOException -> 0x020a }
            r5[r3] = r6     // Catch:{ IOException -> 0x020a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x020a }
            r5[r13] = r3     // Catch:{ IOException -> 0x020a }
            int r2 = r2.length     // Catch:{ IOException -> 0x020a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x020a }
            r5[r11] = r2     // Catch:{ IOException -> 0x020a }
            java.lang.String r1 = java.lang.String.format(r1, r5)     // Catch:{ IOException -> 0x020a }
            return r1
        L_0x020a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p232q.C5858a.m22259B(int):java.lang.String");
    }

    /* renamed from: v */
    public static String m22260v(double d, int i, boolean z) {
        double d2 = d;
        int i2 = i;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        boolean z2 = true;
        if (i2 < 1) {
            return str + Math.round(d);
        }
        long abs = Math.abs((long) d2);
        long round = (long) ((int) Math.round((Math.abs(d) - ((double) abs)) * Math.pow(10.0d, (double) i2)));
        String str2 = str;
        long j = round;
        while (i2 > 0) {
            byte abs2 = (byte) ((int) Math.abs(j % 10));
            j /= 10;
            if (str2.length() > 0 || z || abs2 != 0 || i2 == 1) {
                str2 = abs2 + str2;
            }
            i2--;
        }
        long j2 = abs + j;
        if (d2 >= 0.0d || (j2 == 0 && round == 0)) {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            str = "-";
        }
        sb.append(str);
        sb.append(j2);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: w */
    private static int m22261w(String str) {
        return new C5700b(str.getBytes()).mo17044h(0);
    }

    /* renamed from: x */
    private String m22262x() {
        String r = ((C5859b) this.f16215a).mo17153r(40);
        if (r == null) {
            return null;
        }
        try {
            switch (m22261w(r)) {
                case 1095782476:
                    return "Apple Computer, Inc.";
                case 1297303124:
                    return "Microsoft Corporation";
                case 1397180704:
                    return "Silicon Graphics, Inc.";
                case 1398099543:
                    return "Sun Microsystems, Inc.";
                case 1413959252:
                    return "Taligent, Inc.";
                default:
                    return String.format("Unknown (%s)", new Object[]{r});
            }
        } catch (IOException unused) {
            return r;
        }
    }

    /* renamed from: y */
    private String m22263y() {
        String r = ((C5859b) this.f16215a).mo17153r(12);
        if (r == null) {
            return null;
        }
        try {
            switch (m22261w(r)) {
                case 1633842036:
                    return "Abstract";
                case 1818848875:
                    return "DeviceLink";
                case 1835955314:
                    return "Display Device";
                case 1852662636:
                    return "Named Color";
                case 1886549106:
                    return "Output Device";
                case 1935896178:
                    return "Input Device";
                case 1936744803:
                    return "ColorSpace Conversion";
                default:
                    return String.format("Unknown (%s)", new Object[]{r});
            }
        } catch (IOException unused) {
            return r;
        }
    }

    /* renamed from: z */
    private String m22264z() {
        Integer l = ((C5859b) this.f16215a).mo17148l(8);
        if (l == null) {
            return null;
        }
        return String.format("%d.%d.%d", new Object[]{Integer.valueOf((l.intValue() & -16777216) >> 24), Integer.valueOf((l.intValue() & 15728640) >> 20), Integer.valueOf((l.intValue() & 983040) >> 16)});
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 8 ? i != 12 ? i != 40 ? i != 64 ? (i <= 538976288 || i >= 2054847098) ? super.mo17110f(i) : m22259B(i) : m22258A() : m22262x() : m22263y() : m22264z();
    }
}
