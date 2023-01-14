package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.OutputStream;

/* renamed from: e.f.a.c.f.m.p1 */
final class C8783p1 extends OutputStream {

    /* renamed from: f */
    private long f23988f = 0;

    C8783p1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo22595a() {
        return this.f23988f;
    }

    public final void write(int i) {
        this.f23988f++;
    }

    public final void write(byte[] bArr) {
        this.f23988f += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f23988f += (long) i2;
    }
}
