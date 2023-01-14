package p174e.p247e.p253d.p257d;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: e.e.d.d.c */
public class C6051c extends FilterOutputStream {

    /* renamed from: f */
    private long f16695f = 0;

    public C6051c(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public long mo18038a() {
        return this.f16695f;
    }

    public void close() {
        this.out.close();
    }

    public void write(int i) {
        this.out.write(i);
        this.f16695f++;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f16695f += (long) i2;
    }
}
