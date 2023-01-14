package p174e.p319f.p416e.p432w.p433d;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p432w.C9763a;
import p174e.p319f.p416e.p432w.p433d.p434k.C9778a;

/* renamed from: e.f.e.w.d.j */
public final class C9777j {

    /* renamed from: a */
    private static final C9778a f26199a = new C9778a();

    /* renamed from: a */
    private static C9768c m33373a(C9775h hVar) {
        int[] j;
        if (hVar == null || (j = hVar.mo24482j()) == null) {
            return null;
        }
        int p = m33388p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C9769d[] d = hVar.mo24476d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo24473a().mo24444a(i2, i, hVar.mo24483k());
    }

    /* renamed from: b */
    private static void m33374b(C9773f fVar, C9767b[][] bVarArr) {
        C9767b bVar = bVarArr[0][1];
        int[] a = bVar.mo24442a();
        int j = (fVar.mo24464j() * fVar.mo24466l()) - m33390r(fVar.mo24465k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw C9664j.m32854a();
            }
            bVar.mo24443b(j);
        } else if (a[0] != j) {
            bVar.mo24443b(j);
        }
    }

    /* renamed from: c */
    private static int m33375c(C9680b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo24264f(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    private static boolean m33376d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m33377e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f26199a.mo24484a(iArr, i, iArr2);
        }
        throw C9658d.m32835a();
    }

    /* renamed from: f */
    private static C9767b[][] m33378f(C9773f fVar) {
        int c;
        int l = fVar.mo24466l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo24464j() + 2;
        iArr[0] = l;
        C9767b[][] bVarArr = (C9767b[][]) Array.newInstance(C9767b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C9767b();
            }
        }
        int i3 = 0;
        for (C9774g gVar : fVar.mo24469o()) {
            if (gVar != null) {
                for (C9769d dVar : gVar.mo24476d()) {
                    if (dVar != null && (c = dVar.mo24455c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i3].mo24443b(dVar.mo24457e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C9683e m33379g(C9773f fVar) {
        C9767b[][] f = m33378f(fVar);
        m33374b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo24466l() * fVar.mo24464j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo24466l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo24464j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo24442a();
                int j = (fVar.mo24464j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m33380h(fVar.mo24465k(), iArr, C9763a.m33284b(arrayList), C9763a.m33284b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C9683e m33380h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m33382j(iArr, i, iArr2);
                } catch (C9658d unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw C9658d.m32835a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C9658d.m32835a();
                    }
                }
            } else {
                throw C9658d.m32835a();
            }
        }
    }

    /* renamed from: i */
    public static C9683e m33381i(C9680b bVar, C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4, int i, int i2) {
        C9774g gVar;
        int i3;
        int i4;
        int i5;
        C9775h hVar = null;
        C9775h hVar2 = null;
        C9773f fVar = null;
        C9768c cVar = new C9768c(bVar, pVar, pVar2, pVar3, pVar4);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (pVar != null) {
                hVar = m33391s(bVar, cVar, pVar, true, i, i2);
            }
            if (pVar3 != null) {
                hVar2 = m33391s(bVar, cVar, pVar3, false, i, i2);
            }
            fVar = m33394v(hVar, hVar2);
            if (fVar == null) {
                throw C9664j.m32854a();
            } else if (i6 != 0 || fVar.mo24467m() == null || (fVar.mo24467m().mo24450g() >= cVar.mo24450g() && fVar.mo24467m().mo24448e() <= cVar.mo24448e())) {
                fVar.mo24470p(cVar);
            } else {
                cVar = fVar.mo24467m();
                i6++;
            }
        }
        fVar.mo24470p(cVar);
        int j = fVar.mo24464j() + 1;
        fVar.mo24471q(0, hVar);
        fVar.mo24471q(j, hVar2);
        boolean z = hVar != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (fVar.mo24468n(i10) == null) {
                if (i10 == 0 || i10 == j) {
                    gVar = new C9775h(cVar, i10 == 0);
                } else {
                    gVar = new C9774g(cVar);
                }
                fVar.mo24471q(i10, gVar);
                int i11 = -1;
                int g = cVar.mo24450g();
                int i12 = -1;
                while (g <= cVar.mo24448e()) {
                    int t = m33392t(fVar, i10, g, z);
                    if (t >= 0 && t <= cVar.mo24447d()) {
                        i5 = t;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i4 = i12;
                        i3 = g;
                        i12 = i4;
                        g = i3 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = g;
                    C9769d k = m33383k(bVar, cVar.mo24449f(), cVar.mo24447d(), z, i5, i13, i7, i8);
                    i3 = i13;
                    if (k != null) {
                        gVar.mo24478f(i3, k);
                        i7 = Math.min(i7, k.mo24458f());
                        i8 = Math.max(i8, k.mo24458f());
                        i12 = i5;
                        g = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    g = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return m33379g(fVar);
    }

    /* renamed from: j */
    private static C9683e m33382j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m33377e(iArr, iArr2, i2);
            m33395w(iArr, i2);
            C9683e b = C9770e.m33332b(iArr, String.valueOf(i));
            b.mo24292k(Integer.valueOf(e));
            b.mo24291j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw C9660f.m32836a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p174e.p319f.p416e.p432w.p433d.C9776i.m33371d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p174e.p319f.p416e.p432w.p433d.C9769d m33383k(p174e.p319f.p416e.p420s.C9680b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m33375c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m33389q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p174e.p319f.p416e.p420s.p421m.C9691a.m32983d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m33376d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p174e.p319f.p416e.p432w.p433d.C9776i.m33371d(r7)
            int r9 = p174e.p319f.p416e.p432w.C9763a.m33283a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            e.f.e.w.d.d r8 = new e.f.e.w.d.d
            int r7 = m33386n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p432w.p433d.C9777j.m33383k(e.f.e.s.b, int, int, boolean, int, int, int, int):e.f.e.w.d.d");
    }

    /* renamed from: l */
    private static C9766a m33384l(C9775h hVar, C9775h hVar2) {
        C9766a i;
        C9766a i2;
        if (hVar == null || (i = hVar.mo24481i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo24481i();
        } else if (hVar2 == null || (i2 = hVar2.mo24481i()) == null || i.mo24437a() == i2.mo24437a() || i.mo24438b() == i2.mo24438b() || i.mo24439c() == i2.mo24439c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m33385m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m33386n(int i) {
        return m33387o(m33385m(i));
    }

    /* renamed from: o */
    private static int m33387o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m33388p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m33389q(C9680b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo24264f(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    private static int m33390r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C9775h m33391s(C9680b bVar, C9768c cVar, C9670p pVar, boolean z, int i, int i2) {
        boolean z2 = z;
        C9775h hVar = new C9775h(cVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int c = (int) pVar.mo24230c();
            int d = (int) pVar.mo24231d();
            while (d <= cVar.mo24448e() && d >= cVar.mo24450g()) {
                C9769d k = m33383k(bVar, 0, bVar.mo24271m(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo24478f(d, k);
                    c = z2 ? k.mo24456d() : k.mo24454b();
                }
                d += i4;
            }
            i3++;
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m33392t(C9773f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C9769d dVar = null;
        int i4 = i - i3;
        if (m33393u(fVar, i4)) {
            dVar = fVar.mo24468n(i4).mo24474b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo24454b() : dVar.mo24456d();
        }
        C9769d c = fVar.mo24468n(i).mo24475c(i2);
        if (c != null) {
            return z ? c.mo24456d() : c.mo24454b();
        }
        if (m33393u(fVar, i4)) {
            c = fVar.mo24468n(i4).mo24475c(i2);
        }
        if (c != null) {
            return z ? c.mo24454b() : c.mo24456d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m33393u(fVar, i)) {
                for (C9769d dVar2 : fVar.mo24468n(i).mo24476d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo24454b() : dVar2.mo24456d()) + (i3 * i5 * (dVar2.mo24454b() - dVar2.mo24456d()));
                    }
                }
                i5++;
            } else {
                C9768c m = fVar.mo24467m();
                return z ? m.mo24449f() : m.mo24447d();
            }
        }
    }

    /* renamed from: u */
    private static boolean m33393u(C9773f fVar, int i) {
        return i >= 0 && i <= fVar.mo24464j() + 1;
    }

    /* renamed from: v */
    private static C9773f m33394v(C9775h hVar, C9775h hVar2) {
        C9766a l;
        if ((hVar == null && hVar2 == null) || (l = m33384l(hVar, hVar2)) == null) {
            return null;
        }
        return new C9773f(l, C9768c.m33311j(m33373a(hVar), m33373a(hVar2)));
    }

    /* renamed from: w */
    private static void m33395w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C9660f.m32836a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C9660f.m32836a();
            }
        } else {
            throw C9660f.m32836a();
        }
    }
}
