package p493i.p494g0;

import p455g.p470y.p472d.C10457l;
import p493i.C10588a0;

/* renamed from: i.g0.e */
public final class C10614e {
    /* renamed from: a */
    public static final int m36083a(int[] iArr, int i, int i2, int i3) {
        C10457l.m35320e(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m36084b(C10588a0 a0Var, int i) {
        C10457l.m35320e(a0Var, "$this$segment");
        int a = m36083a(a0Var.mo26271e0(), i + 1, 0, a0Var.mo26273f0().length);
        return a >= 0 ? a : ~a;
    }
}
