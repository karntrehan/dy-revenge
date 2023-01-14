package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.yb */
final class C8562yb extends C8139bc {

    /* renamed from: s */
    private final int f23333s;

    C8562yb(byte[] bArr, int i, int i2) {
        super(bArr);
        C8177dc.m28421v(0, i2, bArr.length);
        this.f23333s = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final int mo21688D() {
        return 0;
    }

    /* renamed from: b */
    public final byte mo21689b(int i) {
        int i2 = this.f23333s;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f22125r[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final byte mo21691g(int i) {
        return this.f22125r[i];
    }

    /* renamed from: h */
    public final int mo21692h() {
        return this.f23333s;
    }
}
