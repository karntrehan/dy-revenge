package p174e.p319f.p416e.p420s;

import p174e.p319f.p416e.C9656b;
import p174e.p319f.p416e.C9662h;
import p174e.p319f.p416e.C9664j;

/* renamed from: e.f.e.s.h */
public class C9686h extends C9656b {

    /* renamed from: b */
    private static final byte[] f25945b = new byte[0];

    /* renamed from: c */
    private byte[] f25946c = f25945b;

    /* renamed from: d */
    private final int[] f25947d = new int[32];

    public C9686h(C9662h hVar) {
        super(hVar);
    }

    /* renamed from: g */
    private static int m32959g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: h */
    private void m32960h(int i) {
        if (this.f25946c.length < i) {
            this.f25946c = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f25947d[i2] = 0;
        }
    }

    /* renamed from: b */
    public C9680b mo24196b() {
        C9662h e = mo24199e();
        int d = e.mo24213d();
        int a = e.mo24212a();
        C9680b bVar = new C9680b(d, a);
        m32960h(d);
        int[] iArr = this.f25947d;
        for (int i = 1; i < 5; i++) {
            byte[] c = e.mo24209c((a * i) / 5, this.f25946c);
            int i2 = (d << 2) / 5;
            for (int i3 = d / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m32959g(iArr);
        byte[] b = e.mo24208b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d;
            for (int i7 = 0; i7 < d; i7++) {
                if ((b[i6 + i7] & 255) < g) {
                    bVar.mo24273p(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public C9679a mo24197c(int i, C9679a aVar) {
        C9662h e = mo24199e();
        int d = e.mo24213d();
        if (aVar == null || aVar.mo24254j() < d) {
            aVar = new C9679a(d);
        } else {
            aVar.mo24245c();
        }
        m32960h(d);
        byte[] c = e.mo24209c(i, this.f25946c);
        int[] iArr = this.f25947d;
        for (int i2 = 0; i2 < d; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m32959g(iArr);
        if (d < 3) {
            for (int i4 = 0; i4 < d; i4++) {
                if ((c[i4] & 255) < g) {
                    aVar.mo24257n(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < g) {
                    aVar.mo24257n(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }
}
