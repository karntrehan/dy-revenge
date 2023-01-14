package p174e.p319f.p416e.p420s.p422n;

/* renamed from: e.f.e.s.n.c */
public final class C9695c {

    /* renamed from: a */
    private final C9693a f25985a;

    public C9695c(C9693a aVar) {
        this.f25985a = aVar;
    }

    /* renamed from: b */
    private int[] m33006b(C9694b bVar) {
        int d = bVar.mo24316d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.mo24315c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f25985a.mo24307f() && i < d; i2++) {
            if (bVar.mo24314b(i2) == 0) {
                iArr[i] = this.f25985a.mo24309h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new C9696d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m33007c(C9694b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f25985a.mo24309h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f25985a.mo24311j(iArr[i3], h);
                    i2 = this.f25985a.mo24311j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f25985a.mo24311j(bVar.mo24314b(h), this.f25985a.mo24309h(i2));
            if (this.f25985a.mo24305d() != 0) {
                iArr2[i] = this.f25985a.mo24311j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C9694b[] m33008d(C9694b bVar, C9694b bVar2, int i) {
        if (bVar.mo24316d() < bVar2.mo24316d()) {
            C9694b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C9694b g = this.f25985a.mo24308g();
        C9694b e = this.f25985a.mo24306e();
        do {
            C9694b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C9694b bVar5 = e;
            C9694b bVar6 = g;
            g = bVar5;
            if (bVar.mo24316d() < i / 2) {
                int c = g.mo24315c(0);
                if (c != 0) {
                    int h = this.f25985a.mo24309h(c);
                    return new C9694b[]{g.mo24318f(h), bVar.mo24318f(h)};
                }
                throw new C9696d("sigmaTilde(0) was zero");
            } else if (!bVar.mo24317e()) {
                C9694b g2 = this.f25985a.mo24308g();
                int h2 = this.f25985a.mo24309h(bVar.mo24315c(bVar.mo24316d()));
                while (r11.mo24316d() >= bVar.mo24316d() && !r11.mo24317e()) {
                    int d = r11.mo24316d() - bVar.mo24316d();
                    int j = this.f25985a.mo24311j(r11.mo24315c(r11.mo24316d()), h2);
                    g2 = g2.mo24313a(this.f25985a.mo24303b(d, j));
                    r11 = r11.mo24313a(bVar.mo24320h(d, j));
                }
                e = g2.mo24319g(g).mo24313a(bVar6);
            } else {
                throw new C9696d("r_{i-1} was zero");
            }
        } while (r11.mo24316d() < bVar.mo24316d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo24322a(int[] iArr, int i) {
        C9694b bVar = new C9694b(this.f25985a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C9693a aVar = this.f25985a;
            int b = bVar.mo24314b(aVar.mo24304c(aVar.mo24305d() + i3));
            iArr2[(i - 1) - i3] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C9694b[] d = m33008d(this.f25985a.mo24303b(i, 1), new C9694b(this.f25985a, iArr2), i);
            C9694b bVar2 = d[0];
            C9694b bVar3 = d[1];
            int[] b2 = m33006b(bVar2);
            int[] c = m33007c(bVar3, b2);
            while (i2 < b2.length) {
                int length = (iArr.length - 1) - this.f25985a.mo24310i(b2[i2]);
                if (length >= 0) {
                    iArr[length] = C9693a.m32988a(iArr[length], c[i2]);
                    i2++;
                } else {
                    throw new C9696d("Bad error location");
                }
            }
        }
    }
}
