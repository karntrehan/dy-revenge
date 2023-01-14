package p174e.p319f.p416e.p436x.p437b;

import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.x.b.a */
final class C9784a {

    /* renamed from: a */
    private final C9680b f26217a;

    /* renamed from: b */
    private C9802j f26218b;

    /* renamed from: c */
    private C9799g f26219c;

    /* renamed from: d */
    private boolean f26220d;

    C9784a(C9680b bVar) {
        int j = bVar.mo24268j();
        if (j < 21 || (j & 3) != 1) {
            throw C9660f.m32836a();
        }
        this.f26217a = bVar;
    }

    /* renamed from: a */
    private int m33433a(int i, int i2, int i3) {
        return this.f26220d ? this.f26217a.mo24264f(i2, i) : this.f26217a.mo24264f(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24508b() {
        int i = 0;
        while (i < this.f26217a.mo24271m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f26217a.mo24268j(); i3++) {
                if (this.f26217a.mo24264f(i, i3) != this.f26217a.mo24264f(i3, i)) {
                    this.f26217a.mo24262e(i3, i);
                    this.f26217a.mo24262e(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo24509c() {
        C9799g d = mo24510d();
        C9802j e = mo24511e();
        C9786c cVar = C9786c.values()[d.mo24519c()];
        int j = this.f26217a.mo24268j();
        cVar.mo24517g(this.f26217a, j);
        C9680b a = e.mo24525a();
        byte[] bArr = new byte[e.mo24529h()];
        int i = j - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < j; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.mo24264f(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f26217a.mo24264f(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo24529h()) {
            return bArr;
        }
        throw C9660f.m32836a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9799g mo24510d() {
        C9799g gVar = this.f26219c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m33433a(i3, 8, i2);
        }
        int a = m33433a(8, 7, m33433a(8, 8, m33433a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m33433a(8, i4, a);
        }
        int j = this.f26217a.mo24268j();
        int i5 = j - 7;
        for (int i6 = j - 1; i6 >= i5; i6--) {
            i = m33433a(8, i6, i);
        }
        for (int i7 = j - 8; i7 < j; i7++) {
            i = m33433a(i7, 8, i);
        }
        C9799g a2 = C9799g.m33465a(a, i);
        this.f26219c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C9660f.m32836a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C9802j mo24511e() {
        C9802j jVar = this.f26218b;
        if (jVar != null) {
            return jVar;
        }
        int j = this.f26217a.mo24268j();
        int i = (j - 17) / 4;
        if (i <= 6) {
            return C9802j.m33476i(i);
        }
        int i2 = j - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = j - 9; i6 >= i2; i6--) {
                i4 = m33433a(i6, i5, i4);
            }
        }
        C9802j c = C9802j.m33474c(i4);
        if (c == null || c.mo24527e() != j) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = j - 9; i8 >= i2; i8--) {
                    i3 = m33433a(i7, i8, i3);
                }
            }
            C9802j c2 = C9802j.m33474c(i3);
            if (c2 == null || c2.mo24527e() != j) {
                throw C9660f.m32836a();
            }
            this.f26218b = c2;
            return c2;
        }
        this.f26218b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24512f() {
        if (this.f26219c != null) {
            C9786c.values()[this.f26219c.mo24519c()].mo24517g(this.f26217a, this.f26217a.mo24268j());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24513g(boolean z) {
        this.f26218b = null;
        this.f26219c = null;
        this.f26220d = z;
    }
}
