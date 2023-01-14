package p174e.p319f.p320a.p335c.p345f.p354i;

import java.io.OutputStream;

/* renamed from: e.f.a.c.f.i.z1 */
final class C7512z1 extends OutputStream {

    /* renamed from: f */
    private long f20214f = 0;

    C7512z1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo21017a() {
        return this.f20214f;
    }

    public final void write(int i) {
        this.f20214f++;
    }

    public final void write(byte[] bArr) {
        this.f20214f += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f20214f += (long) i2;
    }
}
