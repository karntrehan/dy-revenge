package p174e.p319f.p320a.p363d.p377v;

/* renamed from: e.f.a.d.v.a */
public final class C9057a {
    /* renamed from: a */
    public static float m30184a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m30185b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m30187d(m30184a(f, f2, f3, f4), m30184a(f, f2, f5, f4), m30184a(f, f2, f5, f6), m30184a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m30186c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m30187d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
