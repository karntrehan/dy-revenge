package p174e.p319f.p416e.p420s;

import p174e.p319f.p416e.C9664j;

/* renamed from: e.f.e.s.f */
public final class C9684f extends C9687i {
    /* renamed from: c */
    public C9680b mo24295c(C9680b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C9680b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo24296d(bVar, i, i2, C9689k.m32973b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C9680b mo24296d(C9680b bVar, int i, int i2, C9689k kVar) {
        if (i <= 0 || i2 <= 0) {
            throw C9664j.m32854a();
        }
        C9680b bVar2 = new C9680b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.mo24301f(fArr);
            C9687i.m32963a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo24264f((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo24273p(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C9664j.m32854a();
                }
            }
        }
        return bVar2;
    }
}
