package p174e.p319f.p416e.p420s;

/* renamed from: e.f.e.s.c */
public final class C9681c {

    /* renamed from: a */
    private final byte[] f25898a;

    /* renamed from: b */
    private int f25899b;

    /* renamed from: c */
    private int f25900c;

    public C9681c(byte[] bArr) {
        this.f25898a = bArr;
    }

    /* renamed from: a */
    public int mo24278a() {
        return ((this.f25898a.length - this.f25899b) * 8) - this.f25900c;
    }

    /* renamed from: b */
    public int mo24279b() {
        return this.f25900c;
    }

    /* renamed from: c */
    public int mo24280c() {
        return this.f25899b;
    }

    /* renamed from: d */
    public int mo24281d(int i) {
        if (i <= 0 || i > 32 || i > mo24278a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f25900c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f25898a;
            int i6 = this.f25899b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = i2 + i4;
            this.f25900c = i8;
            if (i8 == 8) {
                this.f25900c = 0;
                this.f25899b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f25898a;
            int i10 = this.f25899b;
            b = (bArr2[i10] & 255) | i9;
            this.f25899b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f25898a[this.f25899b]) >> i11);
        this.f25900c += i;
        return i12;
    }
}
