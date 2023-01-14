package p174e.p247e.p253d.p257d;

import java.util.Objects;

/* renamed from: e.e.d.d.k */
public final class C6062k {
    /* renamed from: a */
    private static String m22833a(int i, int i2, String str) {
        if (i < 0) {
            return m22843k("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m22843k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: b */
    public static void m22834b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m22835c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m22836d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m22843k(str, objArr));
        }
    }

    /* renamed from: e */
    public static int m22837e(int i, int i2) {
        return m22838f(i, i2, "index");
    }

    /* renamed from: f */
    public static int m22838f(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m22833a(i, i2, str));
    }

    /* renamed from: g */
    public static <T> T m22839g(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: h */
    public static <T> T m22840h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m22841i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public static void m22842j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: k */
    static String m22843k(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            int i3 = i + 1;
            i2 = indexOf + 2;
            i = i3;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
