package p174e.p199d.p218c;

/* renamed from: e.d.c.a */
public class C5718a {

    /* renamed from: a */
    private final int f16177a;

    /* renamed from: b */
    private final int f16178b;

    /* renamed from: c */
    private final int f16179c;

    /* renamed from: d */
    private final int f16180d;

    /* renamed from: e */
    private final int f16181e;

    /* renamed from: f */
    private final int f16182f;

    public C5718a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f16177a = i;
        this.f16178b = i2;
        this.f16179c = i3;
        this.f16180d = i4;
        this.f16181e = i5;
        this.f16182f = i6;
    }

    /* renamed from: a */
    private static void m21302a(StringBuilder sb, int i, String str) {
        if (i != 0) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append(' ');
            sb.append(str);
            if (i != 1) {
                sb.append('s');
            }
        }
    }

    /* renamed from: b */
    public static C5718a m21303b(String str) {
        if (str.length() == 19 && !str.startsWith("9999:99:99")) {
            try {
                return new C5718a(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)), Integer.parseInt(str.substring(11, 13)), Integer.parseInt(str.substring(14, 16)), Integer.parseInt(str.substring(17, 19)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo17100c() {
        StringBuilder sb = new StringBuilder();
        m21302a(sb, this.f16177a, "year");
        m21302a(sb, this.f16178b, "month");
        m21302a(sb, this.f16179c, "day");
        m21302a(sb, this.f16180d, "hour");
        m21302a(sb, this.f16181e, "minute");
        m21302a(sb, this.f16182f, "second");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5718a.class != obj.getClass()) {
            return false;
        }
        C5718a aVar = (C5718a) obj;
        return this.f16179c == aVar.f16179c && this.f16180d == aVar.f16180d && this.f16181e == aVar.f16181e && this.f16178b == aVar.f16178b && this.f16182f == aVar.f16182f && this.f16177a == aVar.f16177a;
    }

    public int hashCode() {
        return (((((((((this.f16177a * 31) + this.f16178b) * 31) + this.f16179c) * 31) + this.f16180d) * 31) + this.f16181e) * 31) + this.f16182f;
    }

    public String toString() {
        return String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[]{Integer.valueOf(this.f16177a), Integer.valueOf(this.f16178b), Integer.valueOf(this.f16179c), Integer.valueOf(this.f16180d), Integer.valueOf(this.f16181e), Integer.valueOf(this.f16182f)});
    }
}
