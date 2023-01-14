package p477h.p478a.p479a.p485e.p487b;

import java.io.OutputStream;

/* renamed from: h.a.a.e.b.j */
class C10531j extends OutputStream {

    /* renamed from: f */
    private long f27808f = 0;

    /* renamed from: o */
    private OutputStream f27809o;

    /* renamed from: p */
    private boolean f27810p;

    public C10531j(OutputStream outputStream) {
        this.f27809o = outputStream;
        this.f27810p = false;
    }

    /* renamed from: a */
    public void mo25996a() {
        this.f27810p = true;
    }

    /* renamed from: b */
    public long mo25997b() {
        return this.f27808f;
    }

    public void close() {
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (!this.f27810p) {
            this.f27809o.write(bArr, i, i2);
            this.f27808f += (long) i2;
            return;
        }
        throw new IllegalStateException("ZipEntryOutputStream is closed");
    }
}
