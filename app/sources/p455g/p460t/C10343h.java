package p455g.p460t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import p455g.p456a0.C10243c;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.h */
class C10343h extends C10341g {
    /* renamed from: A */
    public static final <T> T[] m35079A(T[] tArr, Comparator<? super T> comparator) {
        C10457l.m35320e(tArr, "<this>");
        C10457l.m35320e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C10457l.m35319d(copyOf, "copyOf(this, size)");
        C10341g.m35076l(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: B */
    public static <T> List<T> m35080B(T[] tArr, Comparator<? super T> comparator) {
        C10457l.m35320e(tArr, "<this>");
        C10457l.m35320e(comparator, "comparator");
        return C10341g.m35066b(m35079A(tArr, comparator));
    }

    /* renamed from: C */
    public static <T> List<T> m35081C(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m35082D(tArr) : C10349k.m35133b(tArr[0]) : C10350l.m35138g();
    }

    /* renamed from: D */
    public static <T> List<T> m35082D(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        return new ArrayList(C10350l.m35135d(tArr));
    }

    /* renamed from: n */
    public static boolean m35083n(int[] iArr, int i) {
        C10457l.m35320e(iArr, "<this>");
        return m35089t(iArr, i) >= 0;
    }

    /* renamed from: o */
    public static final <T> boolean m35084o(T[] tArr, T t) {
        C10457l.m35320e(tArr, "<this>");
        return m35090u(tArr, t) >= 0;
    }

    /* renamed from: p */
    public static final <T> List<T> m35085p(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        return (List) m35086q(tArr, new ArrayList());
    }

    /* renamed from: q */
    public static final <C extends Collection<? super T>, T> C m35086q(T[] tArr, C c) {
        C10457l.m35320e(tArr, "<this>");
        C10457l.m35320e(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: r */
    public static <T> C10243c m35087r(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        return new C10243c(0, m35088s(tArr));
    }

    /* renamed from: s */
    public static <T> int m35088s(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: t */
    public static final int m35089t(int[] iArr, int i) {
        C10457l.m35320e(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: u */
    public static final <T> int m35090u(T[] tArr, T t) {
        C10457l.m35320e(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C10457l.m35316a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: v */
    public static final <A extends Appendable> A m35091v(int[] iArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l<? super Integer, ? extends CharSequence> lVar) {
        C10457l.m35320e(iArr, "<this>");
        C10457l.m35320e(a, "buffer");
        C10457l.m35320e(charSequence, "separator");
        C10457l.m35320e(charSequence2, "prefix");
        C10457l.m35320e(charSequence3, "postfix");
        C10457l.m35320e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(lVar != null ? (CharSequence) lVar.invoke(Integer.valueOf(i3)) : String.valueOf(i3));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: w */
    public static final String m35092w(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l<? super Integer, ? extends CharSequence> lVar) {
        C10457l.m35320e(iArr, "<this>");
        C10457l.m35320e(charSequence, "separator");
        C10457l.m35320e(charSequence2, "prefix");
        C10457l.m35320e(charSequence3, "postfix");
        C10457l.m35320e(charSequence4, "truncated");
        String sb = ((StringBuilder) m35091v(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C10457l.m35319d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: x */
    public static /* synthetic */ String m35093x(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = HttpUrl.FRAGMENT_ENCODE_SET;
        CharSequence charSequence6 = i3 != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m35092w(iArr, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    /* renamed from: y */
    public static char m35094y(char[] cArr) {
        C10457l.m35320e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: z */
    public static <T> T m35095z(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
