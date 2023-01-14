package p174e.p199d.p217b;

import java.util.Objects;

/* renamed from: e.d.b.b */
public class C5700b extends C5710k {

    /* renamed from: b */
    private final byte[] f16145b;

    /* renamed from: c */
    private final int f16146c;

    public C5700b(byte[] bArr) {
        this(bArr, 0);
    }

    public C5700b(byte[] bArr, int i) {
        Objects.requireNonNull(bArr);
        if (i >= 0) {
            this.f16145b = bArr;
            this.f16146c = i;
            return;
        }
        throw new IllegalArgumentException("Must be zero or greater");
    }

    /* renamed from: b */
    public byte mo17017b(int i) {
        mo17020x(i, 1);
        return this.f16145b[i + this.f16146c];
    }

    /* renamed from: c */
    public byte[] mo17018c(int i, int i2) {
        mo17020x(i, i2);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f16145b, i + this.f16146c, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: k */
    public long mo17019k() {
        return (long) (this.f16145b.length - this.f16146c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo17020x(int i, int i2) {
        if (!mo17021y(i, i2)) {
            throw new C5699a(mo17022z(i), i2, (long) this.f16145b.length);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo17021y(int i, int i2) {
        return i2 >= 0 && i >= 0 && (((long) i) + ((long) i2)) - 1 < mo17019k();
    }

    /* renamed from: z */
    public int mo17022z(int i) {
        return i + this.f16146c;
    }
}
