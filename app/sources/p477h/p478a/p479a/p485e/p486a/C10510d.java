package p477h.p478a.p479a.p485e.p486a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: h.a.a.e.a.d */
public class C10510d extends C10509c {

    /* renamed from: p */
    private Inflater f27764p = new Inflater(true);

    /* renamed from: q */
    private byte[] f27765q = new byte[4096];

    /* renamed from: r */
    private byte[] f27766r = new byte[1];

    /* renamed from: s */
    private int f27767s;

    public C10510d(C10508b bVar) {
        super(bVar);
    }

    /* renamed from: o */
    private void m35506o() {
        byte[] bArr = this.f27765q;
        int read = super.read(bArr, 0, bArr.length);
        this.f27767s = read;
        if (read != -1) {
            this.f27764p.setInput(this.f27765q, 0, read);
            return;
        }
        throw new EOFException("Unexpected end of input stream");
    }

    /* renamed from: a */
    public void mo25923a(InputStream inputStream) {
        Inflater inflater = this.f27764p;
        if (inflater != null) {
            inflater.end();
            this.f27764p = null;
        }
        super.mo25923a(inputStream);
    }

    public void close() {
        Inflater inflater = this.f27764p;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    /* renamed from: h */
    public void mo25926h(PushbackInputStream pushbackInputStream) {
        int remaining = this.f27764p.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(mo25924b(), this.f27767s - remaining, remaining);
        }
    }

    public int read() {
        if (read(this.f27766r) == -1) {
            return -1;
        }
        return this.f27766r[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        while (true) {
            try {
                int inflate = this.f27764p.inflate(bArr, i, i2);
                if (inflate != 0) {
                    return inflate;
                }
                if (this.f27764p.finished()) {
                    return -1;
                }
                if (this.f27764p.needsDictionary()) {
                    return -1;
                }
                if (this.f27764p.needsInput()) {
                    m35506o();
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }
}
