package p174e.p319f.p416e.p420s.p422n;

/* renamed from: e.f.e.s.n.b */
final class C9694b {

    /* renamed from: a */
    private final C9693a f25983a;

    /* renamed from: b */
    private final int[] f25984b;

    C9694b(C9693a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f25983a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f25984b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f25984b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f25984b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9694b mo24313a(C9694b bVar) {
        if (!this.f25983a.equals(bVar.f25983a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo24317e()) {
            return bVar;
        } else {
            if (bVar.mo24317e()) {
                return this;
            }
            int[] iArr = this.f25984b;
            int[] iArr2 = bVar.f25984b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C9693a.m32988a(iArr2[i - length], iArr[i]);
            }
            return new C9694b(this.f25983a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24314b(int i) {
        if (i == 0) {
            return mo24315c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f25984b) {
                i2 = C9693a.m32988a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f25984b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C9693a.m32988a(this.f25983a.mo24311j(i, i3), this.f25984b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24315c(int i) {
        int[] iArr = this.f25984b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24316d() {
        return this.f25984b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo24317e() {
        return this.f25984b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C9694b mo24318f(int i) {
        if (i == 0) {
            return this.f25983a.mo24308g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f25984b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f25983a.mo24311j(this.f25984b[i2], i);
        }
        return new C9694b(this.f25983a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9694b mo24319g(C9694b bVar) {
        if (!this.f25983a.equals(bVar.f25983a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo24317e() || bVar.mo24317e()) {
            return this.f25983a.mo24308g();
        } else {
            int[] iArr = this.f25984b;
            int length = iArr.length;
            int[] iArr2 = bVar.f25984b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C9693a.m32988a(iArr3[i4], this.f25983a.mo24311j(i2, iArr2[i3]));
                }
            }
            return new C9694b(this.f25983a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C9694b mo24320h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f25983a.mo24308g();
        } else {
            int length = this.f25984b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f25983a.mo24311j(this.f25984b[i3], i2);
            }
            return new C9694b(this.f25983a, iArr);
        }
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo24316d() * 8);
        for (int d = mo24316d(); d >= 0; d--) {
            int c2 = mo24315c(d);
            if (c2 != 0) {
                if (c2 < 0) {
                    sb.append(" - ");
                    c2 = -c2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c2 != 1) {
                    int i = this.f25983a.mo24310i(c2);
                    if (i == 0) {
                        c = '1';
                    } else if (i == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
