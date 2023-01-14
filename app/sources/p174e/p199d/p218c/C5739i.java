package p174e.p199d.p218c;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import okhttp3.HttpUrl;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p217b.C5717r;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.i */
public class C5739i<T extends C5722b> {

    /* renamed from: a */
    protected final T f16215a;

    public C5739i(T t) {
        this.f16215a = t;
    }

    /* renamed from: a */
    public static String m21431a(int[] iArr, int i) {
        if (iArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < 4 && i2 < iArr.length) {
            if (i2 == i) {
                sb.append('.');
            }
            char c = (char) iArr[i2];
            if (c < '0') {
                c = (char) (c + '0');
            }
            if (i2 != 0 || c != '0') {
                sb.append(c);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: h */
    protected static String m21432h(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return "f/" + decimalFormat.format(d);
    }

    /* renamed from: i */
    protected static String m21433i(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d) + " mm";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17186b(int i) {
        byte[] e = this.f16215a.mo17141e(i);
        if (e == null) {
            return null;
        }
        int length = e.length;
        int i2 = 0;
        while (true) {
            if (i2 >= e.length) {
                break;
            }
            byte b = e[i2] & 255;
            if (b == 0 || b > Byte.MAX_VALUE) {
                length = i2;
            } else {
                i2++;
            }
        }
        return new String(e, 0, length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17187c(int i, Object... objArr) {
        String str;
        Integer l = this.f16215a.mo17148l(i);
        if (l == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; objArr.length > i2; i2++) {
            String str2 = objArr[i2];
            if (str2 != null) {
                char c = (l.intValue() & 1) == 1 ? (char) 1 : 0;
                if (str2 instanceof String[]) {
                    str = ((String[]) str2)[c];
                } else if (c != 0 && (str2 instanceof String)) {
                    str = str2;
                }
                arrayList.add(str);
            }
            l = Integer.valueOf(l.intValue() >> 1);
        }
        return C5717r.m21300a(arrayList, ", ");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo17188d(int i) {
        byte[] e = this.f16215a.mo17141e(i);
        if (e == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(e.length);
        objArr[1] = e.length == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s";
        return String.format("(%d byte%s)", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo17189e(int i, int i2) {
        C5712m p = this.f16215a.mo17151p(i);
        if (p == null) {
            return null;
        }
        return String.format("%." + i2 + "f", new Object[]{Double.valueOf(p.doubleValue())});
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        int length;
        Object o = this.f16215a.mo17150o(i);
        if (o == null) {
            return null;
        }
        if (!o.getClass().isArray() || (length = Array.getLength(o)) <= 16) {
            return o instanceof Date ? new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").format((Date) o).replaceAll("([0-9]{2} [^ ]+)$", ":$1") : this.f16215a.mo17153r(i);
        }
        return String.format("[%d values]", new Object[]{Integer.valueOf(length)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo17190g(int i) {
        Long m = this.f16215a.mo17149m(i);
        if (m == null) {
            return null;
        }
        return new Date(m.longValue()).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo17191j(int i, String str) {
        Integer l = this.f16215a.mo17148l(i);
        if (l == null) {
            return null;
        }
        return String.format(str, new Object[]{l});
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo17192k(int i, String str) {
        String r = this.f16215a.mo17153r(i);
        if (r == null) {
            return null;
        }
        return String.format(str, new Object[]{r});
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo17193l(int i, int i2, String... strArr) {
        String str;
        Long m = this.f16215a.mo17149m(i);
        if (m == null) {
            return null;
        }
        long longValue = m.longValue() - ((long) i2);
        if (longValue >= 0 && longValue < ((long) strArr.length) && (str = strArr[(int) longValue]) != null) {
            return str;
        }
        return "Unknown (" + m + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo17194m(int i, String... strArr) {
        return mo17193l(i, 0, strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo17195n(int i) {
        C5712m mVar;
        String str;
        C5712m[] q = this.f16215a.mo17152q(i);
        if (q == null || q.length != 4) {
            return null;
        }
        if (q[0].mo17063F() && q[2].mo17063F()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (q[0].mo17071h(q[1])) {
            mVar = q[0];
        } else {
            sb.append(q[0].mo17064K(true));
            sb.append('-');
            mVar = q[1];
        }
        sb.append(mVar.mo17064K(true));
        sb.append("mm");
        if (!q[2].mo17063F()) {
            sb.append(' ');
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (q[2].mo17071h(q[3])) {
                str = m21432h(q[2].doubleValue());
            } else {
                sb.append("f/");
                sb.append(decimalFormat.format(q[2].doubleValue()));
                sb.append('-');
                str = decimalFormat.format(q[3].doubleValue());
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo17196o(short s) {
        if (s == 0) {
            return "Unknown";
        }
        if (s == 1) {
            return "Daylight";
        }
        if (s == 2) {
            return "Fluorescent";
        }
        if (s == 3) {
            return "Tungsten (Incandescent)";
        }
        if (s == 4) {
            return "Flash";
        }
        if (s == 255) {
            return "Other";
        }
        switch (s) {
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
                return "Standard Light A";
            case 18:
                return "Standard Light B";
            case 19:
                return "Standard Light C";
            case 20:
                return "D55";
            case 21:
                return "D65";
            case 22:
                return "D75";
            case 23:
                return "D50";
            case 24:
                return "ISO Studio Tungsten";
            default:
                return mo17110f(s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo17197p(int i) {
        return mo17193l(i, 1, "Top, left side (Horizontal / normal)", "Top, right side (Mirror horizontal)", "Bottom, right side (Rotate 180)", "Bottom, left side (Mirror vertical)", "Left side, top (Mirror horizontal and rotate 270 CW)", "Right side, top (Rotate 90 CW)", "Right side, bottom (Mirror horizontal and rotate 90 CW)", "Left side, bottom (Rotate 270 CW)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo17198q(int i) {
        C5712m p = this.f16215a.mo17151p(i);
        if (p != null) {
            return p.mo17064K(true);
        }
        Double h = this.f16215a.mo17144h(i);
        if (h != null) {
            return new DecimalFormat("0.###").format(h);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo17199r(int i) {
        Float i2 = this.f16215a.mo17145i(i);
        if (i2 == null) {
            return null;
        }
        if (i2.floatValue() <= 1.0f) {
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat.format((double) (((float) Math.round(((double) ((float) (1.0d / Math.exp(((double) i2.floatValue()) * Math.log(2.0d))))) * 10.0d)) / 10.0f)) + " sec";
        }
        int exp = (int) Math.exp(((double) i2.floatValue()) * Math.log(2.0d));
        return "1/" + exp + " sec";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public String mo17200s(int i) {
        C5712m p = this.f16215a.mo17151p(i);
        if (p == null) {
            return null;
        }
        return p.mo17064K(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo17201t(int i, Charset charset) {
        byte[] e = this.f16215a.mo17141e(i);
        if (e == null) {
            return null;
        }
        try {
            return new String(e, charset.name()).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo17202u(int i, int i2) {
        int[] k = this.f16215a.mo17147k(i);
        if (k == null) {
            return null;
        }
        return m21431a(k, i2);
    }
}
