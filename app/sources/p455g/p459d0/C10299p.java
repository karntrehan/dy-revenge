package p455g.p459d0;

import java.util.Comparator;
import okhttp3.HttpUrl;
import p455g.p456a0.C10243c;
import p455g.p460t.C10364y;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10471z;

/* renamed from: g.d0.p */
class C10299p extends C10298o {
    /* renamed from: A */
    public static /* synthetic */ boolean m34925A(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34939y(str, str2, i, z);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m34926B(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34940z(str, str2, z);
    }

    /* renamed from: m */
    public static final boolean m34927m(String str, String str2, boolean z) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m34932r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m34928n(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34927m(str, str2, z);
    }

    /* renamed from: o */
    public static boolean m34929o(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: p */
    public static Comparator<String> m34930p(C10471z zVar) {
        C10457l.m35320e(zVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C10457l.m35319d(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m34931q(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            p455g.p470y.p472d.C10457l.m35320e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            g.a0.c r0 = p455g.p459d0.C10300q.m34954K(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            g.t.y r3 = (p455g.p460t.C10364y) r3
            int r3 = r3.mo25557b()
            char r3 = r4.charAt(r3)
            boolean r3 = p455g.p459d0.C10281b.m34865c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p455g.p459d0.C10299p.m34931q(java.lang.CharSequence):boolean");
    }

    /* renamed from: r */
    public static final boolean m34932r(String str, int i, String str2, int i2, int i3, boolean z) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m34933s(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return m34932r(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    /* renamed from: t */
    public static String m34934t(CharSequence charSequence, int i) {
        C10457l.m35320e(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C10364y j = new C10243c(1, i).iterator();
                while (j.hasNext()) {
                    j.mo25557b();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C10457l.m35319d(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: u */
    public static final String m34935u(String str, char c, char c2, boolean z) {
        String sb;
        String str2;
        C10457l.m35320e(str, "<this>");
        if (!z) {
            sb = str.replace(c, c2);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (C10282c.m34866d(charAt, c, z)) {
                    charAt = c2;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        C10457l.m35319d(sb, str2);
        return sb;
    }

    /* renamed from: v */
    public static final String m34936v(String str, String str2, String str3, boolean z) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "oldValue");
        C10457l.m35320e(str3, "newValue");
        int i = 0;
        int N = C10300q.m34957N(str, str2, 0, z);
        if (N < 0) {
            return str;
        }
        int length = str2.length();
        int b = C10247f.m34826b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, N);
                sb.append(str3);
                i = N + length;
                if (N >= str.length() || (N = C10300q.m34957N(str, str2, N + b, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C10457l.m35319d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, N);
                sb.append(str3);
                i = N + length;
                break;
            } while ((N = C10300q.m34957N(str, str2, N + b, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C10457l.m35319d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: w */
    public static /* synthetic */ String m34937w(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m34935u(str, c, c2, z);
    }

    /* renamed from: x */
    public static /* synthetic */ String m34938x(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m34936v(str, str2, str3, z);
    }

    /* renamed from: y */
    public static boolean m34939y(String str, String str2, int i, boolean z) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m34932r(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: z */
    public static boolean m34940z(String str, String str2, boolean z) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m34932r(str, 0, str2, 0, str2.length(), z);
    }
}
