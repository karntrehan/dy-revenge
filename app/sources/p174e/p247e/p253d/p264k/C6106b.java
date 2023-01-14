package p174e.p247e.p253d.p264k;

/* renamed from: e.e.d.k.b */
public class C6106b {
    /* renamed from: a */
    public static int m22988a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    /* renamed from: b */
    public static int m22989b(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    /* renamed from: c */
    public static int m22990c(Object obj, Object obj2) {
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return m22988a(hashCode, i);
    }

    /* renamed from: d */
    public static int m22991d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m22989b(obj == null ? 0 : obj.hashCode(), obj2 == null ? 0 : obj2.hashCode(), obj3 == null ? 0 : obj3.hashCode(), obj4 == null ? 0 : obj4.hashCode(), obj5 == null ? 0 : obj5.hashCode(), obj6 == null ? 0 : obj6.hashCode());
    }
}
