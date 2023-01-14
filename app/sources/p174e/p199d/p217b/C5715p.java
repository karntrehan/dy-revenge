package p174e.p199d.p217b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: e.d.b.p */
public class C5715p extends C5714o {

    /* renamed from: b */
    private final InputStream f16175b;

    /* renamed from: c */
    private long f16176c = 0;

    public C5715p(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        this.f16175b = inputStream;
    }

    /* renamed from: v */
    private long m21291v(long j) {
        long j2 = 0;
        while (j2 != j) {
            long skip = this.f16175b.skip(j - j2);
            j2 += skip;
            if (skip == 0) {
                break;
            }
        }
        this.f16176c += j2;
        return j2;
    }

    /* renamed from: a */
    public int mo17079a() {
        try {
            return this.f16175b.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public byte mo17080b() {
        int read = this.f16175b.read();
        if (read != -1) {
            this.f16176c++;
            return (byte) read;
        }
        throw new EOFException("End of data reached.");
    }

    /* renamed from: c */
    public void mo17081c(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 != i2) {
            int read = this.f16175b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else {
                throw new EOFException("End of data reached.");
            }
        }
        this.f16176c += (long) i3;
    }

    /* renamed from: d */
    public byte[] mo17082d(int i) {
        byte[] bArr = new byte[i];
        mo17081c(bArr, 0, i);
        return bArr;
    }

    /* renamed from: l */
    public long mo17083l() {
        return this.f16176c;
    }

    /* renamed from: t */
    public void mo17084t(long j) {
        if (j >= 0) {
            long v = m21291v(j);
            if (v != j) {
                throw new EOFException(String.format("Unable to skip. Requested %d bytes but skipped %d.", new Object[]{Long.valueOf(j), Long.valueOf(v)}));
            }
            return;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    /* renamed from: u */
    public boolean mo17085u(long j) {
        if (j >= 0) {
            return m21291v(j) == j;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }
}
