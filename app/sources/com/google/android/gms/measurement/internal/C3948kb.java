package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p174e.p319f.p320a.p335c.p345f.p352g.C6814h3;
import p174e.p319f.p320a.p335c.p345f.p352g.C6926o3;

/* renamed from: com.google.android.gms.measurement.internal.kb */
abstract class C3948kb {

    /* renamed from: a */
    final String f10867a;

    /* renamed from: b */
    final int f10868b;

    /* renamed from: c */
    Boolean f10869c;

    /* renamed from: d */
    Boolean f10870d;

    /* renamed from: e */
    Long f10871e;

    /* renamed from: f */
    Long f10872f;

    C3948kb(String str, int i) {
        this.f10867a = str;
        this.f10868b = i;
    }

    /* renamed from: d */
    private static Boolean m14963d(String str, int i, boolean z, String str2, List list, String str3, C4122z3 z3Var) {
        boolean startsWith;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (z3Var != null) {
                        z3Var.mo12549w().mo12477b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L_0x00a3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean m14964e(java.math.BigDecimal r8, p174e.p319f.p320a.p335c.p345f.p352g.C6814h3 r9, double r10) {
        /*
            com.google.android.gms.common.internal.C3705r.m14346k(r9)
            boolean r0 = r9.mo19814D()
            r1 = 0
            if (r0 == 0) goto L_0x0109
            int r0 = r9.mo19819I()
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0109
        L_0x0013:
            int r0 = r9.mo19819I()
            r3 = 5
            if (r0 != r3) goto L_0x0028
            boolean r0 = r9.mo19818H()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r9.mo19817G()
            if (r0 == 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r9.mo19815E()
            if (r0 != 0) goto L_0x002f
            return r1
        L_0x002f:
            int r0 = r9.mo19819I()
            int r4 = r9.mo19819I()
            if (r4 != r3) goto L_0x0064
            java.lang.String r4 = r9.mo19812B()
            boolean r4 = com.google.android.gms.measurement.internal.C4033ra.m15285N(r4)
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r9.mo19811A()
            boolean r4 = com.google.android.gms.measurement.internal.C4033ra.m15285N(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0063
        L_0x004e:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r5 = r9.mo19812B()     // Catch:{ NumberFormatException -> 0x0063 }
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x0063 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r9 = r9.mo19811A()     // Catch:{ NumberFormatException -> 0x0063 }
            r5.<init>(r9)     // Catch:{ NumberFormatException -> 0x0063 }
            r9 = r4
            r4 = r1
            goto L_0x007a
        L_0x0063:
            return r1
        L_0x0064:
            java.lang.String r4 = r9.mo19820z()
            boolean r4 = com.google.android.gms.measurement.internal.C4033ra.m15285N(r4)
            if (r4 != 0) goto L_0x006f
            return r1
        L_0x006f:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0109 }
            java.lang.String r9 = r9.mo19820z()     // Catch:{ NumberFormatException -> 0x0109 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0109 }
            r9 = r1
            r5 = r9
        L_0x007a:
            if (r0 != r3) goto L_0x007f
            if (r9 == 0) goto L_0x00fb
            goto L_0x0083
        L_0x007f:
            if (r4 != 0) goto L_0x0083
            goto L_0x00fb
        L_0x0083:
            int r0 = r0 + -1
            r3 = 0
            if (r0 == r2) goto L_0x00f9
            r6 = 2
            if (r0 == r6) goto L_0x00e9
            r7 = 3
            if (r0 == r7) goto L_0x00a8
            r10 = 4
            if (r0 == r10) goto L_0x0093
            goto L_0x00fb
        L_0x0093:
            if (r9 == 0) goto L_0x00fb
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a2
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x00fb
        L_0x00a8:
            if (r4 != 0) goto L_0x00ab
            goto L_0x00fb
        L_0x00ab:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00a2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00e2:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00e9:
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fb
        L_0x00ec:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f9:
            if (r4 != 0) goto L_0x00fc
        L_0x00fb:
            return r1
        L_0x00fc:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3948kb.m14964e(java.math.BigDecimal, e.f.a.c.f.g.h3, double):java.lang.Boolean");
    }

    /* renamed from: f */
    static Boolean m14965f(String str, C6926o3 o3Var, C4122z3 z3Var) {
        List list;
        C3705r.m14346k(o3Var);
        if (str == null || !o3Var.mo20053F() || o3Var.mo20054G() == 1) {
            return null;
        }
        if (o3Var.mo20054G() == 7) {
            if (o3Var.mo20055x() == 0) {
                return null;
            }
        } else if (!o3Var.mo20052E()) {
            return null;
        }
        int G = o3Var.mo20054G();
        boolean C = o3Var.mo20050C();
        String A = (C || G == 2 || G == 7) ? o3Var.mo20048A() : o3Var.mo20048A().toUpperCase(Locale.ENGLISH);
        if (o3Var.mo20055x() == 0) {
            list = null;
        } else {
            List<String> B = o3Var.mo20049B();
            if (!C) {
                ArrayList arrayList = new ArrayList(B.size());
                for (String upperCase : B) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                B = Collections.unmodifiableList(arrayList);
            }
            list = B;
        }
        return m14963d(str, G, C, A, list, G == 2 ? A : null, z3Var);
    }

    /* renamed from: g */
    static Boolean m14966g(double d, C6814h3 h3Var) {
        try {
            return m14964e(new BigDecimal(d), h3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m14967h(long j, C6814h3 h3Var) {
        try {
            return m14964e(new BigDecimal(j), h3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m14968i(String str, C6814h3 h3Var) {
        if (!C4033ra.m15285N(str)) {
            return null;
        }
        try {
            return m14964e(new BigDecimal(str), h3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static Boolean m14969j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo12135a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo12136b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo12137c();
}
