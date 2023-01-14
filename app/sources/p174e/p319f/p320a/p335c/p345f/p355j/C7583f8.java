package p174e.p319f.p320a.p335c.p345f.p355j;

import java.io.OutputStream;

/* renamed from: e.f.a.c.f.j.f8 */
final class C7583f8 extends OutputStream {

    /* renamed from: f */
    private long f20438f = 0;

    C7583f8() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo21084a() {
        return this.f20438f;
    }

    public final void write(int i) {
        this.f20438f++;
    }

    public final void write(byte[] bArr) {
        this.f20438f += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f20438f += (long) i2;
    }
}
