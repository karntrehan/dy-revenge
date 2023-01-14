package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.s7 */
final class C6994s7 extends C7058w7 {

    /* renamed from: s */
    private final int f18883s;

    C6994s7(byte[] bArr, int i, int i2) {
        super(bArr);
        C7106z7.m27076v(0, i2, bArr.length);
        this.f18883s = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final int mo20153D() {
        return 0;
    }

    /* renamed from: b */
    public final byte mo20154b(int i) {
        int i2 = this.f18883s;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f19036r[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final byte mo20155g(int i) {
        return this.f19036r[i];
    }

    /* renamed from: h */
    public final int mo20156h() {
        return this.f18883s;
    }
}
