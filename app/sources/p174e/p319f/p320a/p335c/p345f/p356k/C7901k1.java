package p174e.p319f.p320a.p335c.p345f.p356k;

import java.io.OutputStream;

/* renamed from: e.f.a.c.f.k.k1 */
final class C7901k1 extends OutputStream {

    /* renamed from: f */
    private long f21529f = 0;

    C7901k1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo21431a() {
        return this.f21529f;
    }

    public final void write(int i) {
        this.f21529f++;
    }

    public final void write(byte[] bArr) {
        this.f21529f += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f21529f += (long) i2;
    }
}
