package androidx.core.util;

import java.util.Locale;
import java.util.Objects;

/* renamed from: androidx.core.util.h */
public final class C1177h {
    /* renamed from: a */
    public static void m4579a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m4580b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m4581c(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: d */
    public static int m4582d(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static <T> T m4583e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    public static <T> T m4584f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static void m4585g(boolean z) {
        m4586h(z, (String) null);
    }

    /* renamed from: h */
    public static void m4586h(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
