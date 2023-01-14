package p477h.p478a.p479a.p485e.p487b;

import java.util.zip.Deflater;
import p477h.p478a.p479a.p488f.p489r.C10554c;

/* renamed from: h.a.a.e.b.e */
class C10525e extends C10523c {

    /* renamed from: o */
    private byte[] f27800o = new byte[4096];

    /* renamed from: p */
    protected Deflater f27801p;

    public C10525e(C10522b bVar, C10554c cVar) {
        super(bVar);
        this.f27801p = new Deflater(cVar.mo26197e(), true);
    }

    /* renamed from: h */
    private void m35558h() {
        Deflater deflater = this.f27801p;
        byte[] bArr = this.f27800o;
        int deflate = deflater.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            super.write(this.f27800o, 0, deflate);
        }
    }

    /* renamed from: a */
    public void mo25969a() {
        if (!this.f27801p.finished()) {
            this.f27801p.finish();
            while (!this.f27801p.finished()) {
                m35558h();
            }
        }
        this.f27801p.end();
        super.mo25969a();
    }

    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f27801p.setInput(bArr, i, i2);
        while (!this.f27801p.needsInput()) {
            m35558h();
        }
    }
}
