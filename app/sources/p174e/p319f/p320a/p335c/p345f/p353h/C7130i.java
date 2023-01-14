package p174e.p319f.p320a.p335c.p345f.p353h;

/* renamed from: e.f.a.c.f.h.i */
public final class C7130i {
    /* renamed from: a */
    static Object[] m27121a(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
