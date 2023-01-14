package p477h.p478a.p479a.p485e.p486a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: h.a.a.e.a.j */
class C10517j extends InputStream {

    /* renamed from: f */
    private InputStream f27779f;

    /* renamed from: o */
    private long f27780o = 0;

    /* renamed from: p */
    private byte[] f27781p = new byte[1];

    /* renamed from: q */
    private long f27782q;

    public C10517j(InputStream inputStream, long j) {
        this.f27779f = inputStream;
        this.f27782q = j;
    }

    /* renamed from: b */
    private int m35519b(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 0;
        int i3 = 0;
        while (i < bArr.length && i2 != -1 && i3 < 15) {
            i2 += this.f27779f.read(bArr, i, length);
            if (i2 > 0) {
                i += i2;
                length -= i2;
            }
            i3++;
        }
        return i;
    }

    /* renamed from: a */
    public int mo25948a(byte[] bArr) {
        int read = this.f27779f.read(bArr);
        if (read == bArr.length || (read = m35519b(bArr, read)) == bArr.length) {
            return read;
        }
        throw new IOException("Cannot read fully into byte buffer");
    }

    public void close() {
        this.f27779f.close();
    }

    public int read() {
        if (read(this.f27781p) == -1) {
            return -1;
        }
        return this.f27781p[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        long j = this.f27782q;
        if (j != -1) {
            long j2 = this.f27780o;
            if (j2 >= j) {
                return -1;
            }
            if (((long) i2) > j - j2) {
                i2 = (int) (j - j2);
            }
        }
        int read = this.f27779f.read(bArr, i, i2);
        if (read > 0) {
            this.f27780o += (long) read;
        }
        return read;
    }
}
