package p174e.p319f.p416e;

/* renamed from: e.f.e.k */
public final class C9665k extends C9662h {

    /* renamed from: c */
    private final byte[] f25838c;

    /* renamed from: d */
    private final int f25839d;

    /* renamed from: e */
    private final int f25840e;

    /* renamed from: f */
    private final int f25841f;

    /* renamed from: g */
    private final int f25842g;

    public C9665k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f25838c = bArr;
        this.f25839d = i;
        this.f25840e = i2;
        this.f25841f = i3;
        this.f25842g = i4;
        if (z) {
            m32855h(i5, i6);
        }
    }

    /* renamed from: h */
    private void m32855h(int i, int i2) {
        byte[] bArr = this.f25838c;
        int i3 = (this.f25842g * this.f25839d) + this.f25841f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f25839d;
        }
    }

    /* renamed from: b */
    public byte[] mo24208b() {
        int d = mo24213d();
        int a = mo24212a();
        int i = this.f25839d;
        if (d == i && a == this.f25840e) {
            return this.f25838c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f25842g * i) + this.f25841f;
        if (d == i) {
            System.arraycopy(this.f25838c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(this.f25838c, i3, bArr, i4 * d, d);
            i3 += this.f25839d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo24209c(int i, byte[] bArr) {
        if (i < 0 || i >= mo24212a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int d = mo24213d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f25838c, ((i + this.f25842g) * this.f25839d) + this.f25841f, bArr, 0, d);
        return bArr;
    }
}
