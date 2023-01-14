package p174e.p319f.p416e.p423t.p424b;

import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.t.b.a */
final class C9698a {

    /* renamed from: a */
    private final C9680b f25988a;

    /* renamed from: b */
    private final C9680b f25989b;

    /* renamed from: c */
    private final C9704e f25990c;

    C9698a(C9680b bVar) {
        int j = bVar.mo24268j();
        if (j < 8 || j > 144 || (j & 1) != 0) {
            throw C9660f.m32836a();
        }
        this.f25990c = m33021j(bVar);
        C9680b a = m33014a(bVar);
        this.f25988a = a;
        this.f25989b = new C9680b(a.mo24271m(), a.mo24268j());
    }

    /* renamed from: a */
    private C9680b m33014a(C9680b bVar) {
        int f = this.f25990c.mo24332f();
        int e = this.f25990c.mo24331e();
        if (bVar.mo24268j() == f) {
            int c = this.f25990c.mo24329c();
            int b = this.f25990c.mo24328b();
            int i = f / c;
            int i2 = e / b;
            C9680b bVar2 = new C9680b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo24264f(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo24273p(i6 + i10, i9);
                            }
                        }
                        C9680b bVar3 = bVar;
                    }
                    C9680b bVar4 = bVar;
                }
                C9680b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: d */
    private int m33015d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m33019h(i3, 0, i, i2) ? 1 : 0) << true;
        if (m33019h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m33019h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m33019h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m33019h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m33019h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m33019h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m33019h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    private int m33016e(int i, int i2) {
        int i3 = (m33019h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m33019h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m33019h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m33019h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m33019h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m33019h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m33019h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m33019h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    private int m33017f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m33019h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m33019h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m33019h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m33019h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m33019h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m33019h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m33019h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m33019h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    private int m33018g(int i, int i2) {
        int i3 = (m33019h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m33019h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m33019h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m33019h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m33019h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m33019h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m33019h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m33019h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    private boolean m33019h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f25989b.mo24273p(i2, i);
        return this.f25988a.mo24264f(i2, i);
    }

    /* renamed from: i */
    private int m33020i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m33019h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m33019h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m33019h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m33019h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m33019h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m33019h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m33019h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m33019h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: j */
    private static C9704e m33021j(C9680b bVar) {
        return C9704e.m33039h(bVar.mo24268j(), bVar.mo24271m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9704e mo24323b() {
        return this.f25990c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo24324c() {
        byte[] bArr = new byte[this.f25990c.mo24333g()];
        int j = this.f25988a.mo24268j();
        int m = this.f25988a.mo24271m();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == j && i == 0 && !z) {
                bArr[i2] = (byte) m33015d(j, m);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = j - 2;
                if (i3 == i4 && i == 0 && (m & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m33016e(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == j + 4 && i == 2 && (m & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m33017f(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (m & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m33018g(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < j && i >= 0 && !this.f25989b.mo24264f(i, i3)) {
                            bArr[i2] = (byte) m33020i(i3, i, j, m);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < m);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m && !this.f25989b.mo24264f(i6, i5)) {
                            bArr[i2] = (byte) m33020i(i5, i6, j, m);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= j) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= j && i >= m) {
                break;
            }
        }
        if (i2 == this.f25990c.mo24333g()) {
            return bArr;
        }
        throw C9660f.m32836a();
    }
}
