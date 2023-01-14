package p174e.p247e.p253d.p263j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: e.e.d.j.b */
public class C6104b extends FilterInputStream {

    /* renamed from: f */
    private final byte[] f16755f;

    /* renamed from: o */
    private int f16756o;

    /* renamed from: p */
    private int f16757p;

    public C6104b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(bArr);
        this.f16755f = bArr;
    }

    /* renamed from: a */
    private int m22987a() {
        int i = this.f16756o;
        byte[] bArr = this.f16755f;
        if (i >= bArr.length) {
            return -1;
        }
        this.f16756o = i + 1;
        return bArr[i] & 255;
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f16757p = this.f16756o;
        }
    }

    public int read() {
        int read = this.in.read();
        return read != -1 ? read : m22987a();
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = m22987a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    public void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f16756o = this.f16757p;
            return;
        }
        throw new IOException("mark is not supported");
    }
}
