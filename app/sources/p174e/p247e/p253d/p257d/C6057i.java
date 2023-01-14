package p174e.p247e.p253d.p257d;

/* renamed from: e.e.d.d.i */
public class C6057i {
    /* renamed from: a */
    public static int m22824a(int... iArr) {
        C6062k.m22834b(Boolean.valueOf(iArr.length > 0));
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
