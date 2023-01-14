package p174e.p319f.p416e.p420s;

import java.util.Arrays;

/* renamed from: e.f.e.s.b */
public final class C9680b implements Cloneable {

    /* renamed from: f */
    private final int f25894f;

    /* renamed from: o */
    private final int f25895o;

    /* renamed from: p */
    private final int f25896p;

    /* renamed from: q */
    private final int[] f25897q;

    public C9680b(int i) {
        this(i, i);
    }

    public C9680b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f25894f = i;
        this.f25895o = i2;
        int i3 = (i + 31) / 32;
        this.f25896p = i3;
        this.f25897q = new int[(i3 * i2)];
    }

    private C9680b(int i, int i2, int i3, int[] iArr) {
        this.f25894f = i;
        this.f25895o = i2;
        this.f25896p = i3;
        this.f25897q = iArr;
    }

    /* renamed from: c */
    private String m32922c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f25895o * (this.f25894f + 1));
        for (int i = 0; i < this.f25895o; i++) {
            for (int i2 = 0; i2 < this.f25894f; i2++) {
                sb.append(mo24264f(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public C9680b clone() {
        return new C9680b(this.f25894f, this.f25895o, this.f25896p, (int[]) this.f25897q.clone());
    }

    /* renamed from: e */
    public void mo24262e(int i, int i2) {
        int i3 = (i2 * this.f25896p) + (i / 32);
        int[] iArr = this.f25897q;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9680b)) {
            return false;
        }
        C9680b bVar = (C9680b) obj;
        return this.f25894f == bVar.f25894f && this.f25895o == bVar.f25895o && this.f25896p == bVar.f25896p && Arrays.equals(this.f25897q, bVar.f25897q);
    }

    /* renamed from: f */
    public boolean mo24264f(int i, int i2) {
        return ((this.f25897q[(i2 * this.f25896p) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: g */
    public int[] mo24265g() {
        int length = this.f25897q.length - 1;
        while (length >= 0 && this.f25897q[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f25896p;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f25897q[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public int hashCode() {
        int i = this.f25894f;
        return (((((((i * 31) + i) * 31) + this.f25895o) * 31) + this.f25896p) * 31) + Arrays.hashCode(this.f25897q);
    }

    /* renamed from: i */
    public int[] mo24267i() {
        int i = this.f25894f;
        int i2 = this.f25895o;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f25895o; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f25896p;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f25897q[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: j */
    public int mo24268j() {
        return this.f25895o;
    }

    /* renamed from: k */
    public C9679a mo24269k(int i, C9679a aVar) {
        if (aVar == null || aVar.mo24254j() < this.f25894f) {
            aVar = new C9679a(this.f25894f);
        } else {
            aVar.mo24245c();
        }
        int i2 = i * this.f25896p;
        for (int i3 = 0; i3 < this.f25896p; i3++) {
            aVar.mo24258p(i3 << 5, this.f25897q[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: l */
    public int[] mo24270l() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f25897q;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f25896p;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: m */
    public int mo24271m() {
        return this.f25894f;
    }

    /* renamed from: n */
    public void mo24272n() {
        int m = mo24271m();
        int j = mo24268j();
        C9679a aVar = new C9679a(m);
        C9679a aVar2 = new C9679a(m);
        for (int i = 0; i < (j + 1) / 2; i++) {
            aVar = mo24269k(i, aVar);
            int i2 = (j - 1) - i;
            aVar2 = mo24269k(i2, aVar2);
            aVar.mo24256m();
            aVar2.mo24256m();
            mo24275r(i, aVar2);
            mo24275r(i2, aVar);
        }
    }

    /* renamed from: p */
    public void mo24273p(int i, int i2) {
        int i3 = (i2 * this.f25896p) + (i / 32);
        int[] iArr = this.f25897q;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: q */
    public void mo24274q(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f25895o || i5 > this.f25894f) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f25896p * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f25897q;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: r */
    public void mo24275r(int i, C9679a aVar) {
        int[] f = aVar.mo24250f();
        int[] iArr = this.f25897q;
        int i2 = this.f25896p;
        System.arraycopy(f, 0, iArr, i * i2, i2);
    }

    /* renamed from: s */
    public String mo24276s(String str, String str2) {
        return m32922c(str, str2, "\n");
    }

    public String toString() {
        return mo24276s("X ", "  ");
    }
}
