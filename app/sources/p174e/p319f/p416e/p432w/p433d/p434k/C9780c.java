package p174e.p319f.p416e.p432w.p433d.p434k;

/* renamed from: e.f.e.w.d.k.c */
final class C9780c {

    /* renamed from: a */
    private final C9779b f26207a;

    /* renamed from: b */
    private final int[] f26208b;

    C9780c(C9779b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f26207a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f26208b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f26208b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f26208b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9780c mo24495a(C9780c cVar) {
        if (!this.f26207a.equals(cVar.f26207a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo24499e()) {
            return cVar;
        } else {
            if (cVar.mo24499e()) {
                return this;
            }
            int[] iArr = this.f26208b;
            int[] iArr2 = cVar.f26208b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f26207a.mo24485a(iArr2[i - length], iArr[i]);
            }
            return new C9780c(this.f26207a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24496b(int i) {
        if (i == 0) {
            return mo24497c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f26208b) {
                i2 = this.f26207a.mo24485a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f26208b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C9779b bVar = this.f26207a;
            i3 = bVar.mo24485a(bVar.mo24493i(i, i3), this.f26208b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24497c(int i) {
        int[] iArr = this.f26208b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24498d() {
        return this.f26208b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo24499e() {
        return this.f26208b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C9780c mo24500f(int i) {
        if (i == 0) {
            return this.f26207a.mo24490f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f26208b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f26207a.mo24493i(this.f26208b[i2], i);
        }
        return new C9780c(this.f26207a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9780c mo24501g(C9780c cVar) {
        if (!this.f26207a.equals(cVar.f26207a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo24499e() || cVar.mo24499e()) {
            return this.f26207a.mo24490f();
        } else {
            int[] iArr = this.f26208b;
            int length = iArr.length;
            int[] iArr2 = cVar.f26208b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C9779b bVar = this.f26207a;
                    iArr3[i4] = bVar.mo24485a(iArr3[i4], bVar.mo24493i(i2, iArr2[i3]));
                }
            }
            return new C9780c(this.f26207a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C9780c mo24502h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f26207a.mo24490f();
        } else {
            int length = this.f26208b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f26207a.mo24493i(this.f26208b[i3], i2);
            }
            return new C9780c(this.f26207a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9780c mo24503i() {
        int length = this.f26208b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f26207a.mo24494j(0, this.f26208b[i]);
        }
        return new C9780c(this.f26207a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C9780c mo24504j(C9780c cVar) {
        if (this.f26207a.equals(cVar.f26207a)) {
            return cVar.mo24499e() ? this : mo24495a(cVar.mo24503i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo24498d() * 8);
        for (int d = mo24498d(); d >= 0; d--) {
            int c = mo24497c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
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
