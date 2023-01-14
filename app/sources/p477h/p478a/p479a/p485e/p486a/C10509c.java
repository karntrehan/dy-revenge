package p477h.p478a.p479a.p485e.p486a;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: h.a.a.e.a.c */
abstract class C10509c extends InputStream {

    /* renamed from: f */
    private C10508b f27762f;

    /* renamed from: o */
    protected byte[] f27763o = new byte[1];

    public C10509c(C10508b bVar) {
        this.f27762f = bVar;
    }

    /* renamed from: a */
    public void mo25923a(InputStream inputStream) {
        this.f27762f.mo25912b(inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo25924b() {
        return this.f27762f.mo25921o();
    }

    public void close() {
        this.f27762f.close();
    }

    /* renamed from: h */
    public void mo25926h(PushbackInputStream pushbackInputStream) {
    }

    public int read() {
        if (read(this.f27763o) == -1) {
            return -1;
        }
        return this.f27763o[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.f27762f.read(bArr, i, i2);
    }
}
