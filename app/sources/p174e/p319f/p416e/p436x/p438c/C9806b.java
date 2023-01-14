package p174e.p319f.p416e.p436x.p438c;

import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9671q;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.x.c.b */
final class C9806b {

    /* renamed from: a */
    private final C9680b f26270a;

    /* renamed from: b */
    private final List<C9805a> f26271b = new ArrayList(5);

    /* renamed from: c */
    private final int f26272c;

    /* renamed from: d */
    private final int f26273d;

    /* renamed from: e */
    private final int f26274e;

    /* renamed from: f */
    private final int f26275f;

    /* renamed from: g */
    private final float f26276g;

    /* renamed from: h */
    private final int[] f26277h;

    /* renamed from: i */
    private final C9671q f26278i;

    C9806b(C9680b bVar, int i, int i2, int i3, int i4, float f, C9671q qVar) {
        this.f26270a = bVar;
        this.f26272c = i;
        this.f26273d = i2;
        this.f26274e = i3;
        this.f26275f = i4;
        this.f26276g = f;
        this.f26277h = new int[3];
        this.f26278i = qVar;
    }

    /* renamed from: a */
    private static float m33489a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m33490b(int i, int i2, int i3, int i4) {
        C9680b bVar = this.f26270a;
        int j = bVar.mo24268j();
        int[] iArr = this.f26277h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo24264f(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo24264f(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < j && bVar.mo24264f(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != j && iArr[1] <= i3) {
                while (i6 < j && !bVar.mo24264f(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m33491d(iArr)) {
                    return m33489a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m33491d(int[] iArr) {
        float f = this.f26276g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C9805a m33492e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m33489a(iArr, i2);
        float b = m33490b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C9805a next : this.f26271b) {
            if (next.mo24536f(f, b, a)) {
                return next.mo24537g(b, a, f);
            }
        }
        C9805a aVar = new C9805a(a, b, f);
        this.f26271b.add(aVar);
        C9671q qVar = this.f26278i;
        if (qVar == null) {
            return null;
        }
        qVar.mo24235a(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9805a mo24538c() {
        C9805a e;
        C9805a e2;
        int i = this.f26272c;
        int i2 = this.f26275f;
        int i3 = this.f26274e + i;
        int i4 = this.f26273d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f26270a.mo24264f(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f26270a.mo24264f(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m33491d(iArr) && (e2 = m33492e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m33491d(iArr) && (e = m33492e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f26271b.isEmpty()) {
            return this.f26271b.get(0);
        }
        throw C9664j.m32854a();
    }
}
