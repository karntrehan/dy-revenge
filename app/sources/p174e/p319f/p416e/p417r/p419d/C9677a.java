package p174e.p319f.p416e.p417r.p419d;

import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p417r.C9672a;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9687i;
import p174e.p319f.p416e.p420s.p421m.C9691a;
import p174e.p319f.p416e.p420s.p421m.C9692b;
import p174e.p319f.p416e.p420s.p422n.C9693a;
import p174e.p319f.p416e.p420s.p422n.C9695c;
import p174e.p319f.p416e.p420s.p422n.C9696d;

/* renamed from: e.f.e.r.d.a */
public final class C9677a {

    /* renamed from: a */
    private static final int[] f25883a = {3808, 476, 2107, 1799};

    /* renamed from: b */
    private final C9680b f25884b;

    /* renamed from: c */
    private boolean f25885c;

    /* renamed from: d */
    private int f25886d;

    /* renamed from: e */
    private int f25887e;

    /* renamed from: f */
    private int f25888f;

    /* renamed from: g */
    private int f25889g;

    /* renamed from: e.f.e.r.d.a$a */
    static final class C9678a {

        /* renamed from: a */
        private final int f25890a;

        /* renamed from: b */
        private final int f25891b;

        C9678a(int i, int i2) {
            this.f25890a = i;
            this.f25891b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo24241a() {
            return this.f25890a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo24242b() {
            return this.f25891b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C9670p mo24243c() {
            return new C9670p((float) mo24241a(), (float) mo24242b());
        }

        public String toString() {
            return "<" + this.f25890a + ' ' + this.f25891b + '>';
        }
    }

    public C9677a(C9680b bVar) {
        this.f25884b = bVar;
    }

    /* renamed from: b */
    private static float m32889b(C9670p pVar, C9670p pVar2) {
        return C9691a.m32980a(pVar.mo24230c(), pVar.mo24231d(), pVar2.mo24230c(), pVar2.mo24231d());
    }

    /* renamed from: c */
    private static float m32890c(C9678a aVar, C9678a aVar2) {
        return C9691a.m32981b(aVar.mo24241a(), aVar.mo24242b(), aVar2.mo24241a(), aVar2.mo24242b());
    }

    /* renamed from: d */
    private static C9670p[] m32891d(C9670p[] pVarArr, int i, int i2) {
        float f = ((float) i2) / (((float) i) * 2.0f);
        float c = pVarArr[0].mo24230c() - pVarArr[2].mo24230c();
        float d = pVarArr[0].mo24231d() - pVarArr[2].mo24231d();
        float c2 = (pVarArr[0].mo24230c() + pVarArr[2].mo24230c()) / 2.0f;
        float d2 = (pVarArr[0].mo24231d() + pVarArr[2].mo24231d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        C9670p pVar = new C9670p(c2 + f2, d2 + f3);
        C9670p pVar2 = new C9670p(c2 - f2, d2 - f3);
        float c3 = pVarArr[1].mo24230c() - pVarArr[3].mo24230c();
        float d3 = pVarArr[1].mo24231d() - pVarArr[3].mo24231d();
        float c4 = (pVarArr[1].mo24230c() + pVarArr[3].mo24230c()) / 2.0f;
        float d4 = (pVarArr[1].mo24231d() + pVarArr[3].mo24231d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new C9670p[]{pVar, new C9670p(c4 + f4, d4 + f5), pVar2, new C9670p(c4 - f4, d4 - f5)};
    }

    /* renamed from: e */
    private void m32892e(C9670p[] pVarArr) {
        int i;
        long j;
        long j2;
        if (!m32902o(pVarArr[0]) || !m32902o(pVarArr[1]) || !m32902o(pVarArr[2]) || !m32902o(pVarArr[3])) {
            throw C9664j.m32854a();
        }
        int i2 = this.f25888f * 2;
        int[] iArr = {m32905r(pVarArr[0], pVarArr[1], i2), m32905r(pVarArr[1], pVarArr[2], i2), m32905r(pVarArr[2], pVarArr[3], i2), m32905r(pVarArr[3], pVarArr[0], i2)};
        this.f25889g = m32900m(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f25889g + i3) % 4];
            if (this.f25885c) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m32895h(j3, this.f25885c);
        if (this.f25885c) {
            this.f25886d = (h >> 6) + 1;
            i = h & 63;
        } else {
            this.f25886d = (h >> 11) + 1;
            i = h & 2047;
        }
        this.f25887e = i + 1;
    }

    /* renamed from: f */
    private C9670p[] m32893f(C9678a aVar) {
        this.f25888f = 1;
        C9678a aVar2 = aVar;
        C9678a aVar3 = aVar2;
        C9678a aVar4 = aVar3;
        C9678a aVar5 = aVar4;
        boolean z = true;
        while (this.f25888f < 9) {
            C9678a j = m32897j(aVar2, z, 1, -1);
            C9678a j2 = m32897j(aVar3, z, 1, 1);
            C9678a j3 = m32897j(aVar4, z, -1, 1);
            C9678a j4 = m32897j(aVar5, z, -1, -1);
            if (this.f25888f > 2) {
                double c = (double) ((m32890c(j4, j) * ((float) this.f25888f)) / (m32890c(aVar5, aVar2) * ((float) (this.f25888f + 2))));
                if (c < 0.75d || c > 1.25d || !m32903p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f25888f++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f25888f;
        if (i == 5 || i == 7) {
            this.f25885c = i == 5;
            C9670p[] pVarArr = {new C9670p(((float) aVar2.mo24241a()) + 0.5f, ((float) aVar2.mo24242b()) - 0.5f), new C9670p(((float) aVar3.mo24241a()) + 0.5f, ((float) aVar3.mo24242b()) + 0.5f), new C9670p(((float) aVar4.mo24241a()) - 0.5f, ((float) aVar4.mo24242b()) + 0.5f), new C9670p(((float) aVar5.mo24241a()) - 0.5f, ((float) aVar5.mo24242b()) - 0.5f)};
            int i2 = this.f25888f;
            return m32891d(pVarArr, (i2 * 2) - 3, i2 * 2);
        }
        throw C9664j.m32854a();
    }

    /* renamed from: g */
    private int m32894g(C9678a aVar, C9678a aVar2) {
        float c = m32890c(aVar, aVar2);
        float a = ((float) (aVar2.mo24241a() - aVar.mo24241a())) / c;
        float b = ((float) (aVar2.mo24242b() - aVar.mo24242b())) / c;
        float a2 = (float) aVar.mo24241a();
        float b2 = (float) aVar.mo24242b();
        boolean f = this.f25884b.mo24264f(aVar.mo24241a(), aVar.mo24242b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f25884b.mo24264f(C9691a.m32982c(a2), C9691a.m32982c(b2)) != f) {
                i++;
            }
        }
        float f2 = ((float) i) / c;
        if (f2 > 0.1f && f2 < 0.9f) {
            return 0;
        }
        if (f2 <= 0.1f) {
            z = true;
        }
        return z == f ? 1 : -1;
    }

    /* renamed from: h */
    private static int m32895h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C9695c(C9693a.f25971d).mo24322a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C9696d unused) {
            throw C9664j.m32854a();
        }
    }

    /* renamed from: i */
    private int m32896i() {
        if (this.f25885c) {
            return (this.f25886d * 4) + 11;
        }
        int i = this.f25886d;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C9678a m32897j(C9678a aVar, boolean z, int i, int i2) {
        int a = aVar.mo24241a() + i;
        int b = aVar.mo24242b();
        while (true) {
            b += i2;
            if (!m32901n(a, b) || this.f25884b.mo24264f(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m32901n(i32, i42) && this.f25884b.mo24264f(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m32901n(i5, i42) && this.f25884b.mo24264f(i5, i42) == z) {
            i42 += i2;
        }
        return new C9678a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C9678a m32898k() {
        C9670p pVar;
        C9670p pVar2;
        C9670p pVar3;
        C9670p pVar4;
        C9670p pVar5;
        C9670p pVar6;
        C9670p pVar7;
        C9670p pVar8;
        try {
            C9670p[] c = new C9692b(this.f25884b).mo24302c();
            pVar3 = c[0];
            pVar2 = c[1];
            pVar = c[2];
            pVar4 = c[3];
        } catch (C9664j unused) {
            int m = this.f25884b.mo24271m() / 2;
            int j = this.f25884b.mo24268j() / 2;
            int i = m + 7;
            int i2 = j - 7;
            C9670p c2 = m32897j(new C9678a(i, i2), false, 1, -1).mo24243c();
            int i3 = j + 7;
            C9670p c3 = m32897j(new C9678a(i, i3), false, 1, 1).mo24243c();
            int i4 = m - 7;
            C9670p c4 = m32897j(new C9678a(i4, i3), false, -1, 1).mo24243c();
            pVar4 = m32897j(new C9678a(i4, i2), false, -1, -1).mo24243c();
            C9670p pVar9 = c3;
            pVar = c4;
            pVar3 = c2;
            pVar2 = pVar9;
        }
        int c5 = C9691a.m32982c((((pVar3.mo24230c() + pVar4.mo24230c()) + pVar2.mo24230c()) + pVar.mo24230c()) / 4.0f);
        int c6 = C9691a.m32982c((((pVar3.mo24231d() + pVar4.mo24231d()) + pVar2.mo24231d()) + pVar.mo24231d()) / 4.0f);
        try {
            C9670p[] c7 = new C9692b(this.f25884b, 15, c5, c6).mo24302c();
            pVar6 = c7[0];
            pVar5 = c7[1];
            pVar7 = c7[2];
            pVar8 = c7[3];
        } catch (C9664j unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            pVar6 = m32897j(new C9678a(i5, i6), false, 1, -1).mo24243c();
            int i7 = c6 + 7;
            pVar5 = m32897j(new C9678a(i5, i7), false, 1, 1).mo24243c();
            int i8 = c5 - 7;
            pVar7 = m32897j(new C9678a(i8, i7), false, -1, 1).mo24243c();
            pVar8 = m32897j(new C9678a(i8, i6), false, -1, -1).mo24243c();
        }
        return new C9678a(C9691a.m32982c((((pVar6.mo24230c() + pVar8.mo24230c()) + pVar5.mo24230c()) + pVar7.mo24230c()) / 4.0f), C9691a.m32982c((((pVar6.mo24231d() + pVar8.mo24231d()) + pVar5.mo24231d()) + pVar7.mo24231d()) / 4.0f));
    }

    /* renamed from: l */
    private C9670p[] m32899l(C9670p[] pVarArr) {
        return m32891d(pVarArr, this.f25888f * 2, m32896i());
    }

    /* renamed from: m */
    private static int m32900m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f25883a[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C9664j.m32854a();
    }

    /* renamed from: n */
    private boolean m32901n(int i, int i2) {
        return i >= 0 && i < this.f25884b.mo24271m() && i2 > 0 && i2 < this.f25884b.mo24268j();
    }

    /* renamed from: o */
    private boolean m32902o(C9670p pVar) {
        return m32901n(C9691a.m32982c(pVar.mo24230c()), C9691a.m32982c(pVar.mo24231d()));
    }

    /* renamed from: p */
    private boolean m32903p(C9678a aVar, C9678a aVar2, C9678a aVar3, C9678a aVar4) {
        C9678a aVar5 = new C9678a(aVar.mo24241a() - 3, aVar.mo24242b() + 3);
        C9678a aVar6 = new C9678a(aVar2.mo24241a() - 3, aVar2.mo24242b() - 3);
        C9678a aVar7 = new C9678a(aVar3.mo24241a() + 3, aVar3.mo24242b() - 3);
        C9678a aVar8 = new C9678a(aVar4.mo24241a() + 3, aVar4.mo24242b() + 3);
        int g = m32894g(aVar8, aVar5);
        return g != 0 && m32894g(aVar5, aVar6) == g && m32894g(aVar6, aVar7) == g && m32894g(aVar7, aVar8) == g;
    }

    /* renamed from: q */
    private C9680b m32904q(C9680b bVar, C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4) {
        C9687i b = C9687i.m32964b();
        int i = m32896i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f25888f;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo24295c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, pVar.mo24230c(), pVar.mo24231d(), pVar2.mo24230c(), pVar2.mo24231d(), pVar3.mo24230c(), pVar3.mo24231d(), pVar4.mo24230c(), pVar4.mo24231d());
    }

    /* renamed from: r */
    private int m32905r(C9670p pVar, C9670p pVar2, int i) {
        float b = m32889b(pVar, pVar2);
        float f = b / ((float) i);
        float c = pVar.mo24230c();
        float d = pVar.mo24231d();
        float c2 = ((pVar2.mo24230c() - pVar.mo24230c()) * f) / b;
        float d2 = (f * (pVar2.mo24231d() - pVar.mo24231d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f25884b.mo24264f(C9691a.m32982c((f2 * c2) + c), C9691a.m32982c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C9672a mo24240a(boolean z) {
        C9670p[] f = m32893f(m32898k());
        if (z) {
            C9670p pVar = f[0];
            f[0] = f[2];
            f[2] = pVar;
        }
        m32892e(f);
        C9680b bVar = this.f25884b;
        int i = this.f25889g;
        return new C9672a(m32904q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m32899l(f), this.f25885c, this.f25887e, this.f25886d);
    }
}
