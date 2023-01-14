package p477h.p478a.p479a.p485e.p487b;

import java.io.OutputStream;

/* renamed from: h.a.a.e.b.d */
public class C10524d extends OutputStream implements C10528g {

    /* renamed from: f */
    private OutputStream f27798f;

    /* renamed from: o */
    private long f27799o = 0;

    public C10524d(OutputStream outputStream) {
        this.f27798f = outputStream;
    }

    /* renamed from: A */
    public long mo25975A() {
        if (mo25976E()) {
            return ((C10529h) this.f27798f).mo25992o();
        }
        return 0;
    }

    /* renamed from: E */
    public boolean mo25976E() {
        OutputStream outputStream = this.f27798f;
        return (outputStream instanceof C10529h) && ((C10529h) outputStream).mo25987E();
    }

    /* renamed from: a */
    public int mo25977a() {
        if (mo25976E()) {
            return ((C10529h) this.f27798f).mo25977a();
        }
        return 0;
    }

    /* renamed from: b */
    public long mo25978b() {
        OutputStream outputStream = this.f27798f;
        return outputStream instanceof C10529h ? ((C10529h) outputStream).mo25978b() : this.f27799o;
    }

    public void close() {
        this.f27798f.close();
    }

    /* renamed from: h */
    public boolean mo25980h(int i) {
        if (!mo25976E()) {
            return false;
        }
        return ((C10529h) this.f27798f).mo25991h(i);
    }

    /* renamed from: o */
    public long mo25981o() {
        OutputStream outputStream = this.f27798f;
        return outputStream instanceof C10529h ? ((C10529h) outputStream).mo25978b() : this.f27799o;
    }

    /* renamed from: r */
    public long mo25982r() {
        OutputStream outputStream = this.f27798f;
        return outputStream instanceof C10529h ? ((C10529h) outputStream).mo25978b() : this.f27799o;
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f27798f.write(bArr, i, i2);
        this.f27799o += (long) i2;
    }
}
