package p174e.p199d.p217b;

import java.io.EOFException;
import java.util.Objects;

/* renamed from: e.d.b.n */
public class C5713n extends C5714o {

    /* renamed from: b */
    private final byte[] f16172b;

    /* renamed from: c */
    private int f16173c;

    public C5713n(byte[] bArr) {
        this(bArr, 0);
    }

    public C5713n(byte[] bArr, int i) {
        Objects.requireNonNull(bArr);
        this.f16172b = bArr;
        this.f16173c = i;
    }

    /* renamed from: a */
    public int mo17079a() {
        return this.f16172b.length - this.f16173c;
    }

    /* renamed from: b */
    public byte mo17080b() {
        int i = this.f16173c;
        byte[] bArr = this.f16172b;
        if (i < bArr.length) {
            this.f16173c = i + 1;
            return bArr[i];
        }
        throw new EOFException("End of data reached.");
    }

    /* renamed from: c */
    public void mo17081c(byte[] bArr, int i, int i2) {
        int i3 = this.f16173c;
        int i4 = i3 + i2;
        byte[] bArr2 = this.f16172b;
        if (i4 <= bArr2.length) {
            System.arraycopy(bArr2, i3, bArr, i, i2);
            this.f16173c += i2;
            return;
        }
        throw new EOFException("End of data reached.");
    }

    /* renamed from: d */
    public byte[] mo17082d(int i) {
        int i2 = this.f16173c;
        int i3 = i2 + i;
        byte[] bArr = this.f16172b;
        if (i3 <= bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, i2, bArr2, 0, i);
            this.f16173c += i;
            return bArr2;
        }
        throw new EOFException("End of data reached.");
    }

    /* renamed from: l */
    public long mo17083l() {
        return (long) this.f16173c;
    }

    /* renamed from: t */
    public void mo17084t(long j) {
        if (j >= 0) {
            int i = this.f16173c;
            if (((long) i) + j <= ((long) this.f16172b.length)) {
                this.f16173c = (int) (((long) i) + j);
                return;
            }
            throw new EOFException("End of data reached.");
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    /* renamed from: u */
    public boolean mo17085u(long j) {
        if (j >= 0) {
            int i = (int) (((long) this.f16173c) + j);
            this.f16173c = i;
            byte[] bArr = this.f16172b;
            if (i <= bArr.length) {
                return true;
            }
            this.f16173c = bArr.length;
            return false;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }
}
