package p174e.p319f.p416e.p420s.p421m;

import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.s.m.b */
public final class C9692b {

    /* renamed from: a */
    private final C9680b f25961a;

    /* renamed from: b */
    private final int f25962b;

    /* renamed from: c */
    private final int f25963c;

    /* renamed from: d */
    private final int f25964d;

    /* renamed from: e */
    private final int f25965e;

    /* renamed from: f */
    private final int f25966f;

    /* renamed from: g */
    private final int f25967g;

    public C9692b(C9680b bVar) {
        this(bVar, 10, bVar.mo24271m() / 2, bVar.mo24268j() / 2);
    }

    public C9692b(C9680b bVar, int i, int i2, int i3) {
        this.f25961a = bVar;
        int j = bVar.mo24268j();
        this.f25962b = j;
        int m = bVar.mo24271m();
        this.f25963c = m;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f25964d = i5;
        int i6 = i2 + i4;
        this.f25965e = i6;
        int i7 = i3 - i4;
        this.f25967g = i7;
        int i8 = i3 + i4;
        this.f25966f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= j || i6 >= m) {
            throw C9664j.m32854a();
        }
    }

    /* renamed from: a */
    private C9670p[] m32984a(C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4) {
        float c = pVar.mo24230c();
        float d = pVar.mo24231d();
        float c2 = pVar2.mo24230c();
        float d2 = pVar2.mo24231d();
        float c3 = pVar3.mo24230c();
        float d3 = pVar3.mo24231d();
        float c4 = pVar4.mo24230c();
        float d4 = pVar4.mo24231d();
        if (c < ((float) this.f25963c) / 2.0f) {
            return new C9670p[]{new C9670p(c4 - 1.0f, d4 + 1.0f), new C9670p(c2 + 1.0f, d2 + 1.0f), new C9670p(c3 - 1.0f, d3 - 1.0f), new C9670p(c + 1.0f, d - 1.0f)};
        }
        return new C9670p[]{new C9670p(c4 + 1.0f, d4 + 1.0f), new C9670p(c2 + 1.0f, d2 - 1.0f), new C9670p(c3 - 1.0f, d3 + 1.0f), new C9670p(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m32985b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f25961a.mo24264f(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f25961a.mo24264f(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C9670p m32986d(float f, float f2, float f3, float f4) {
        int c = C9691a.m32982c(C9691a.m32980a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C9691a.m32982c((f8 * f6) + f);
            int c3 = C9691a.m32982c((f8 * f7) + f2);
            if (this.f25961a.mo24264f(c2, c3)) {
                return new C9670p((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C9670p[] mo24302c() {
        int i = this.f25964d;
        int i2 = this.f25965e;
        int i3 = this.f25967g;
        int i4 = this.f25966f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f25963c) {
                    z8 = m32985b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f25963c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f25962b) {
                    z10 = m32985b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f25962b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = m32985b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z2 = z9;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = m32985b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z2 = true;
                        z7 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z2) {
                z6 = true;
            }
        }
        z = true;
        if (z || !z6) {
            throw C9664j.m32854a();
        }
        int i6 = i2 - i;
        C9670p pVar = null;
        C9670p pVar2 = null;
        int i7 = 1;
        while (pVar2 == null && i7 < i6) {
            pVar2 = m32986d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (pVar2 != null) {
            C9670p pVar3 = null;
            int i8 = 1;
            while (pVar3 == null && i8 < i6) {
                pVar3 = m32986d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (pVar3 != null) {
                C9670p pVar4 = null;
                int i9 = 1;
                while (pVar4 == null && i9 < i6) {
                    pVar4 = m32986d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (pVar4 != null) {
                    while (pVar == null && i5 < i6) {
                        pVar = m32986d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (pVar != null) {
                        return m32984a(pVar, pVar2, pVar4, pVar3);
                    }
                    throw C9664j.m32854a();
                }
                throw C9664j.m32854a();
            }
            throw C9664j.m32854a();
        }
        throw C9664j.m32854a();
    }
}
