package p174e.p247e.p253d.p260g;

import java.io.InputStream;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.d.g.i */
public class C6085i extends InputStream {

    /* renamed from: f */
    final C6082g f16721f;

    /* renamed from: o */
    int f16722o = 0;

    /* renamed from: p */
    int f16723p = 0;

    public C6085i(C6082g gVar) {
        C6062k.m22834b(Boolean.valueOf(!gVar.isClosed()));
        this.f16721f = (C6082g) C6062k.m22839g(gVar);
    }

    public int available() {
        return this.f16721f.size() - this.f16722o;
    }

    public void mark(int i) {
        this.f16723p = this.f16722o;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        C6082g gVar = this.f16721f;
        int i = this.f16722o;
        this.f16722o = i + 1;
        return gVar.mo8160j(i) & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f16721f.mo8161k(this.f16722o, bArr, i, min);
        this.f16722o += min;
        return min;
    }

    public void reset() {
        this.f16722o = this.f16723p;
    }

    public long skip(long j) {
        C6062k.m22834b(Boolean.valueOf(j >= 0));
        int min = Math.min((int) j, available());
        this.f16722o += min;
        return (long) min;
    }
}
