package p455g.p466w;

/* renamed from: g.w.c */
public final class C10411c {
    /* renamed from: a */
    private static final int m35281a(int i, int i2, int i3) {
        return m35283c(m35283c(i, i3) - m35283c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m35282b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m35281a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m35281a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m35283c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
