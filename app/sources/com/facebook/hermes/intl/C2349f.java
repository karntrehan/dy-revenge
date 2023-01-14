package com.facebook.hermes.intl;

/* renamed from: com.facebook.hermes.intl.f */
public class C2349f {
    /* renamed from: a */
    public static boolean m9695a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    public static boolean m9696b(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: c */
    public static boolean m9697c(char c) {
        return m9696b(c) || m9695a(c);
    }

    /* renamed from: d */
    public static boolean m9698d(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m9696b(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m9699e(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m9697c(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m9700f(CharSequence charSequence, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!m9695a(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m9701g(CharSequence charSequence, int i, int i2) {
        return (i2 - i) + 1 == 4 && m9696b(charSequence.charAt(i)) && m9699e(charSequence, i + 1, i2, 3, 3);
    }

    /* renamed from: h */
    public static boolean m9702h(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 1, 1);
    }

    /* renamed from: i */
    public static boolean m9703i(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 2, 8);
    }

    /* renamed from: j */
    public static boolean m9704j(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 1, 8);
    }

    /* renamed from: k */
    public static boolean m9705k(CharSequence charSequence, int i, int i2) {
        return i2 == i + 1 && m9696b(charSequence.charAt(i)) && m9695a(charSequence.charAt(i2));
    }

    /* renamed from: l */
    public static boolean m9706l(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: m */
    public static boolean m9707m(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: n */
    public static boolean m9708n(CharSequence charSequence, int i, int i2) {
        return i2 == i + 1 && m9697c(charSequence.charAt(i)) && m9696b(charSequence.charAt(i2));
    }

    /* renamed from: o */
    public static boolean m9709o(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 3, 8);
    }

    /* renamed from: p */
    public static boolean m9710p(CharSequence charSequence, int i, int i2) {
        if (m9698d(charSequence, i, i2, 2, 3) || m9698d(charSequence, i, i2, 5, 8)) {
            return true;
        }
        return (i2 - i) + 1 == 4 && charSequence.charAt(i) == 'r' && charSequence.charAt(i + 1) == 'o' && charSequence.charAt(i + 2) == 'o' && charSequence.charAt(i + 3) == 't';
    }

    /* renamed from: q */
    public static boolean m9711q(CharSequence charSequence, int i, int i2) {
        return m9698d(charSequence, i, i2, 2, 2) || m9700f(charSequence, i, i2, 3, 3);
    }

    /* renamed from: r */
    public static boolean m9712r(CharSequence charSequence, int i, int i2) {
        return m9698d(charSequence, i, i2, 4, 4);
    }

    /* renamed from: s */
    public static boolean m9713s(CharSequence charSequence, int i, int i2) {
        return m9699e(charSequence, i, i2, 5, 8) || m9701g(charSequence, i, i2);
    }
}
