package p477h.p478a.p479a.p485e.p487b;

import java.io.OutputStream;

/* renamed from: h.a.a.e.b.c */
abstract class C10523c extends OutputStream {

    /* renamed from: f */
    private C10522b f27797f;

    public C10523c(C10522b bVar) {
        this.f27797f = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25969a() {
        this.f27797f.mo25960a();
    }

    /* renamed from: b */
    public long mo25970b() {
        return this.f27797f.mo25967h();
    }

    public void close() {
        this.f27797f.close();
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f27797f.write(bArr, i, i2);
    }
}
