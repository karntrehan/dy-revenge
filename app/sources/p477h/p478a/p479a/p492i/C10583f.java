package p477h.p478a.p479a.p492i;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import p477h.p478a.p479a.p483c.C10497a;

/* renamed from: h.a.a.i.f */
public class C10583f {

    /* renamed from: a */
    private byte[] f28022a = new byte[2];

    /* renamed from: b */
    private byte[] f28023b = new byte[4];

    /* renamed from: c */
    private byte[] f28024c = new byte[8];

    /* renamed from: a */
    private void m35912a(InputStream inputStream, byte[] bArr, int i) {
        if (C10585h.m35942i(inputStream, bArr, 0, i) != i) {
            throw new C10497a("Could not fill buffer");
        }
    }

    /* renamed from: n */
    private void m35913n(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    /* renamed from: b */
    public int mo26243b(InputStream inputStream) {
        m35912a(inputStream, this.f28023b, 4);
        return mo26245d(this.f28023b);
    }

    /* renamed from: c */
    public int mo26244c(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f28023b);
        return mo26245d(this.f28023b);
    }

    /* renamed from: d */
    public int mo26245d(byte[] bArr) {
        return mo26246e(bArr, 0);
    }

    /* renamed from: e */
    public int mo26246e(byte[] bArr, int i) {
        return ((((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* renamed from: f */
    public long mo26247f(InputStream inputStream) {
        byte[] bArr = this.f28024c;
        m35912a(inputStream, bArr, bArr.length);
        return mo26251j(this.f28024c, 0);
    }

    /* renamed from: g */
    public long mo26248g(InputStream inputStream, int i) {
        m35913n(this.f28024c);
        m35912a(inputStream, this.f28024c, i);
        return mo26251j(this.f28024c, 0);
    }

    /* renamed from: h */
    public long mo26249h(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f28024c);
        return mo26251j(this.f28024c, 0);
    }

    /* renamed from: i */
    public long mo26250i(RandomAccessFile randomAccessFile, int i) {
        m35913n(this.f28024c);
        randomAccessFile.readFully(this.f28024c, 0, i);
        return mo26251j(this.f28024c, 0);
    }

    /* renamed from: j */
    public long mo26251j(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            m35913n(this.f28024c);
        }
        System.arraycopy(bArr, i, this.f28024c, 0, bArr.length < 8 ? bArr.length - i : 8);
        byte[] bArr2 = this.f28024c;
        return ((((((((((((((0 | ((long) (bArr2[7] & 255))) << 8) | ((long) (bArr2[6] & 255))) << 8) | ((long) (bArr2[5] & 255))) << 8) | ((long) (bArr2[4] & 255))) << 8) | ((long) (bArr2[3] & 255))) << 8) | ((long) (bArr2[2] & 255))) << 8) | ((long) (bArr2[1] & 255))) << 8) | ((long) (bArr2[0] & 255));
    }

    /* renamed from: k */
    public int mo26252k(InputStream inputStream) {
        byte[] bArr = this.f28022a;
        m35912a(inputStream, bArr, bArr.length);
        return mo26254m(this.f28022a, 0);
    }

    /* renamed from: l */
    public int mo26253l(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f28022a);
        return mo26254m(this.f28022a, 0);
    }

    /* renamed from: m */
    public int mo26254m(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: o */
    public void mo26255o(OutputStream outputStream, int i) {
        mo26256p(this.f28023b, 0, i);
        outputStream.write(this.f28023b);
    }

    /* renamed from: p */
    public void mo26256p(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >>> 24);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }

    /* renamed from: q */
    public void mo26257q(OutputStream outputStream, long j) {
        mo26258r(this.f28024c, 0, j);
        outputStream.write(this.f28024c);
    }

    /* renamed from: r */
    public void mo26258r(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) ((int) (j >>> 56));
        bArr[i + 6] = (byte) ((int) (j >>> 48));
        bArr[i + 5] = (byte) ((int) (j >>> 40));
        bArr[i + 4] = (byte) ((int) (j >>> 32));
        bArr[i + 3] = (byte) ((int) (j >>> 24));
        bArr[i + 2] = (byte) ((int) (j >>> 16));
        bArr[i + 1] = (byte) ((int) (j >>> 8));
        bArr[i] = (byte) ((int) (j & 255));
    }

    /* renamed from: s */
    public void mo26259s(OutputStream outputStream, int i) {
        mo26260t(this.f28022a, 0, i);
        outputStream.write(this.f28022a);
    }

    /* renamed from: t */
    public void mo26260t(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }
}
