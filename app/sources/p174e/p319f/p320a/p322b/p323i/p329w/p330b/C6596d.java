package p174e.p319f.p320a.p322b.p323i.p329w.p330b;

import java.util.Objects;

/* renamed from: e.f.a.b.i.w.b.d */
public final class C6596d {
    /* renamed from: a */
    public static <T> void m25198a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m25199b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m25200c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
