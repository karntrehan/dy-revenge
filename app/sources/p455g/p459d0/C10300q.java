package p455g.p459d0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p455g.C10314l;
import p455g.C10320p;
import p455g.p456a0.C10240a;
import p455g.p456a0.C10243c;
import p455g.p458c0.C10268d;
import p455g.p460t.C10364y;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: g.d0.q */
class C10300q extends C10299p {

    /* renamed from: g.d0.q$a */
    static final class C10301a extends C10458m implements C10434p<CharSequence, Integer, C10314l<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ char[] f27527f;

        /* renamed from: o */
        final /* synthetic */ boolean f27528o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10301a(char[] cArr, boolean z) {
            super(2);
            this.f27527f = cArr;
            this.f27528o = z;
        }

        /* renamed from: a */
        public final C10314l<Integer, Integer> mo25600a(CharSequence charSequence, int i) {
            C10457l.m35320e(charSequence, "$this$$receiver");
            int S = C10300q.m34962S(charSequence, this.f27527f, i, this.f27528o);
            if (S < 0) {
                return null;
            }
            return C10320p.m35019a(Integer.valueOf(S), 1);
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ Object mo15709j(Object obj, Object obj2) {
            return mo25600a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: g.d0.q$b */
    static final class C10302b extends C10458m implements C10434p<CharSequence, Integer, C10314l<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List<String> f27529f;

        /* renamed from: o */
        final /* synthetic */ boolean f27530o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10302b(List<String> list, boolean z) {
            super(2);
            this.f27529f = list;
            this.f27530o = z;
        }

        /* renamed from: a */
        public final C10314l<Integer, Integer> mo25601a(CharSequence charSequence, int i) {
            C10457l.m35320e(charSequence, "$this$$receiver");
            C10314l C = C10300q.m34953J(charSequence, this.f27529f, i, this.f27530o, false);
            if (C != null) {
                return C10320p.m35019a(C.mo25611c(), Integer.valueOf(((String) C.mo25612d()).length()));
            }
            return null;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ Object mo15709j(Object obj, Object obj2) {
            return mo25601a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: g.d0.q$c */
    static final class C10303c extends C10458m implements C10430l<C10243c, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f27531f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10303c(CharSequence charSequence) {
            super(1);
            this.f27531f = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C10243c cVar) {
            C10457l.m35320e(cVar, "it");
            return C10300q.m34989t0(this.f27531f, cVar);
        }
    }

    /* renamed from: A0 */
    public static final String m34941A0(String str, char c, String str2) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "missingDelimiterValue");
        int Q = m34960Q(str, c, 0, false, 6, (Object) null);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(0, Q);
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: B0 */
    public static final String m34942B0(String str, String str2, String str3) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "delimiter");
        C10457l.m35320e(str3, "missingDelimiterValue");
        int R = m34961R(str, str2, 0, false, 6, (Object) null);
        if (R == -1) {
            return str3;
        }
        String substring = str.substring(0, R);
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: C0 */
    public static /* synthetic */ String m34944C0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m34941A0(str, c, str2);
    }

    /* renamed from: D */
    public static final boolean m34945D(CharSequence charSequence, char c, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        return m34960Q(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: D0 */
    public static /* synthetic */ String m34946D0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m34942B0(str, str2, str3);
    }

    /* renamed from: E */
    public static final boolean m34947E(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m34961R(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m34959P(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E0 */
    public static CharSequence m34948E0(CharSequence charSequence) {
        C10457l.m35320e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C10281b.m34865c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: F */
    public static /* synthetic */ boolean m34949F(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34945D(charSequence, c, z);
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m34950G(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34947E(charSequence, charSequence2, z);
    }

    /* renamed from: H */
    public static final boolean m34951H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C10299p.m34928n((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m34974e0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m34952I(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34951H(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final C10314l<Integer, String> m34953J(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            C10240a cVar = !z2 ? new C10243c(C10247f.m34826b(i, 0), charSequence.length()) : C10247f.m34831g(C10247f.m34828d(i, m34955L(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = cVar.mo25547b();
                int g = cVar.mo25549g();
                int h = cVar.mo25550h();
                if ((h > 0 && i2 <= g) || (h < 0 && g <= i2)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (C10299p.m34932r(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == g) {
                                break;
                            }
                            i2 += h;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int b = cVar.mo25547b();
            int g2 = cVar.mo25549g();
            int h2 = cVar.mo25550h();
            if ((h2 > 0 && b <= g2) || (h2 < 0 && g2 <= b)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (m34974e0(str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == g2) {
                            break;
                        }
                        b = i2 + h2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return C10320p.m35019a(Integer.valueOf(i2), str);
        }
        String str4 = (String) C10358t.m35166M(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int R = !z2 ? m34961R(charSequence2, str5, i3, false, 4, (Object) null) : m34966W(charSequence2, str5, i3, false, 4, (Object) null);
        if (R < 0) {
            return null;
        }
        return C10320p.m35019a(Integer.valueOf(R), str4);
    }

    /* renamed from: K */
    public static final C10243c m34954K(CharSequence charSequence) {
        C10457l.m35320e(charSequence, "<this>");
        return new C10243c(0, charSequence.length() - 1);
    }

    /* renamed from: L */
    public static final int m34955L(CharSequence charSequence) {
        C10457l.m35320e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: M */
    public static final int m34956M(CharSequence charSequence, char c, int i, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m34962S(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: N */
    public static final int m34957N(CharSequence charSequence, String str, int i, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m34959P(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: O */
    private static final int m34958O(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C10240a cVar = !z2 ? new C10243c(C10247f.m34826b(i, 0), C10247f.m34828d(i2, charSequence.length())) : C10247f.m34831g(C10247f.m34828d(i, m34955L(charSequence)), C10247f.m34826b(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int b = cVar.mo25547b();
            int g = cVar.mo25549g();
            int h = cVar.mo25550h();
            if ((h <= 0 || b > g) && (h >= 0 || g > b)) {
                return -1;
            }
            while (true) {
                if (m34974e0(charSequence2, 0, charSequence, b, charSequence2.length(), z)) {
                    return b;
                }
                if (b == g) {
                    return -1;
                }
                b += h;
            }
        } else {
            int b2 = cVar.mo25547b();
            int g2 = cVar.mo25549g();
            int h2 = cVar.mo25550h();
            if ((h2 <= 0 || b2 > g2) && (h2 >= 0 || g2 > b2)) {
                return -1;
            }
            while (true) {
                if (C10299p.m34932r((String) charSequence2, 0, (String) charSequence, b2, charSequence2.length(), z)) {
                    return b2;
                }
                if (b2 == g2) {
                    return -1;
                }
                b2 += h2;
            }
        }
    }

    /* renamed from: P */
    static /* synthetic */ int m34959P(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m34958O(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: Q */
    public static /* synthetic */ int m34960Q(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34956M(charSequence, c, i, z);
    }

    /* renamed from: R */
    public static /* synthetic */ int m34961R(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34957N(charSequence, str, i, z);
    }

    /* renamed from: S */
    public static final int m34962S(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C10364y j = new C10243c(C10247f.m34826b(i, 0), m34955L(charSequence)).iterator();
            while (j.hasNext()) {
                int b = j.mo25557b();
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C10282c.m34866d(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C10343h.m35094y(cArr), i);
    }

    /* renamed from: T */
    public static final int m34963T(CharSequence charSequence, char c, int i, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m34967X(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: U */
    public static final int m34964U(CharSequence charSequence, String str, int i, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(str, "string");
        return (z || !(charSequence instanceof String)) ? m34958O(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: V */
    public static /* synthetic */ int m34965V(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m34955L(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34963T(charSequence, c, i, z);
    }

    /* renamed from: W */
    public static /* synthetic */ int m34966W(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m34955L(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34964U(charSequence, str, i, z);
    }

    /* renamed from: X */
    public static final int m34967X(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d = C10247f.m34828d(i, m34955L(charSequence)); -1 < d; d--) {
                char charAt = charSequence.charAt(d);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C10282c.m34866d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return d;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C10343h.m35094y(cArr), i);
    }

    /* renamed from: Y */
    public static final C10268d<String> m34968Y(CharSequence charSequence) {
        C10457l.m35320e(charSequence, "<this>");
        return m34986q0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: Z */
    public static final List<String> m34969Z(CharSequence charSequence) {
        C10457l.m35320e(charSequence, "<this>");
        return C10275j.m34858j(m34968Y(charSequence));
    }

    /* renamed from: a0 */
    private static final C10268d<C10243c> m34970a0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m34979j0(i2);
        return new C10284e(charSequence, i, i2, new C10301a(cArr, z));
    }

    /* renamed from: b0 */
    private static final C10268d<C10243c> m34971b0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m34979j0(i2);
        return new C10284e(charSequence, i, i2, new C10302b(C10341g.m35066b(strArr), z));
    }

    /* renamed from: c0 */
    static /* synthetic */ C10268d m34972c0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m34970a0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: d0 */
    static /* synthetic */ C10268d m34973d0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m34971b0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: e0 */
    public static final boolean m34974e0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C10282c.m34866d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public static String m34975f0(String str, CharSequence charSequence) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(charSequence, "prefix");
        if (!m34988s0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C10457l.m35319d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: g0 */
    public static String m34976g0(String str, CharSequence charSequence) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(charSequence, "suffix");
        if (!m34952I(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h0 */
    public static String m34977h0(String str, CharSequence charSequence) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(charSequence, "delimiter");
        return m34978i0(str, charSequence, charSequence);
    }

    /* renamed from: i0 */
    public static final String m34978i0(String str, CharSequence charSequence, CharSequence charSequence2) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(charSequence, "prefix");
        C10457l.m35320e(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m34988s0(str, charSequence, false, 2, (Object) null) || !m34952I(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: j0 */
    public static final void m34979j0(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: k0 */
    public static final List<String> m34980k0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(cArr, "delimiters");
        if (cArr.length == 1) {
            return m34982m0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C10243c> c = C10275j.m34851c(m34972c0(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C10351m.m35147p(c, 10));
        for (C10243c t0 : c) {
            arrayList.add(m34989t0(charSequence, t0));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public static final List<String> m34981l0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m34982m0(charSequence, str, z, i);
            }
        }
        Iterable<C10243c> c = C10275j.m34851c(m34973d0(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C10351m.m35147p(c, 10));
        for (C10243c t0 : c) {
            arrayList.add(m34989t0(charSequence, t0));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    private static final List<String> m34982m0(CharSequence charSequence, String str, boolean z, int i) {
        m34979j0(i);
        int i2 = 0;
        int N = m34957N(charSequence, str, 0, z);
        if (N == -1 || i == 1) {
            return C10349k.m35133b(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C10247f.m34828d(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, N).toString());
            i2 = str.length() + N;
            if ((z2 && arrayList.size() == i - 1) || (N = m34957N(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, N).toString());
            i2 = str.length() + N;
            break;
        } while ((N = m34957N(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: n0 */
    public static /* synthetic */ List m34983n0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m34980k0(charSequence, cArr, z, i);
    }

    /* renamed from: o0 */
    public static /* synthetic */ List m34984o0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m34981l0(charSequence, strArr, z, i);
    }

    /* renamed from: p0 */
    public static final C10268d<String> m34985p0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(strArr, "delimiters");
        return C10275j.m34856h(m34973d0(charSequence, strArr, 0, z, i, 2, (Object) null), new C10303c(charSequence));
    }

    /* renamed from: q0 */
    public static /* synthetic */ C10268d m34986q0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m34985p0(charSequence, strArr, z, i);
    }

    /* renamed from: r0 */
    public static final boolean m34987r0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C10299p.m34926B((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m34974e0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: s0 */
    public static /* synthetic */ boolean m34988s0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34987r0(charSequence, charSequence2, z);
    }

    /* renamed from: t0 */
    public static final String m34989t0(CharSequence charSequence, C10243c cVar) {
        C10457l.m35320e(charSequence, "<this>");
        C10457l.m35320e(cVar, "range");
        return charSequence.subSequence(cVar.mo25561r().intValue(), cVar.mo25560p().intValue() + 1).toString();
    }

    /* renamed from: u0 */
    public static final String m34990u0(String str, char c, String str2) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "missingDelimiterValue");
        int Q = m34960Q(str, c, 0, false, 6, (Object) null);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(Q + 1, str.length());
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: v0 */
    public static final String m34991v0(String str, String str2, String str3) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "delimiter");
        C10457l.m35320e(str3, "missingDelimiterValue");
        int R = m34961R(str, str2, 0, false, 6, (Object) null);
        if (R == -1) {
            return str3;
        }
        String substring = str.substring(R + str2.length(), str.length());
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: w0 */
    public static /* synthetic */ String m34992w0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m34990u0(str, c, str2);
    }

    /* renamed from: x0 */
    public static /* synthetic */ String m34993x0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m34991v0(str, str2, str3);
    }

    /* renamed from: y0 */
    public static final String m34994y0(String str, char c, String str2) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "missingDelimiterValue");
        int V = m34965V(str, c, 0, false, 6, (Object) null);
        if (V == -1) {
            return str2;
        }
        String substring = str.substring(V + 1, str.length());
        C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: z0 */
    public static /* synthetic */ String m34995z0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m34994y0(str, c, str2);
    }
}
