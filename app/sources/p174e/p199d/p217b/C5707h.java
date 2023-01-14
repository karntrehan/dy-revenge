package p174e.p199d.p217b;

/* renamed from: e.d.b.h */
public class C5707h {

    /* renamed from: a */
    private static int[] f16159a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: a */
    public static boolean m21215a(int i, int i2, int i3) {
        if (i < 1 || i > 9999 || i2 < 0 || i2 > 11) {
            return false;
        }
        int i4 = f16159a[i2];
        if (i2 == 1) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                i4++;
            }
        }
        return i3 >= 1 && i3 <= i4;
    }

    /* renamed from: b */
    public static boolean m21216b(int i, int i2, int i3) {
        return i >= 0 && i < 24 && i2 >= 0 && i2 < 60 && i3 >= 0 && i3 < 60;
    }
}
