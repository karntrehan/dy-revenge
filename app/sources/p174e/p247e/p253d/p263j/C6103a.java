package p174e.p247e.p253d.p263j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: e.e.d.j.a */
public class C6103a extends FilterInputStream {

    /* renamed from: f */
    private int f16753f;

    /* renamed from: o */
    private int f16754o;

    public C6103a(InputStream inputStream, int i) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        if (i >= 0) {
            this.f16753f = i;
            this.f16754o = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    public int available() {
        return Math.min(this.in.available(), this.f16753f);
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f16754o = this.f16753f;
        }
    }

    public int read() {
        if (this.f16753f == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f16753f--;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f16753f;
        if (i3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f16753f -= read;
        }
        return read;
    }

    public void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f16754o != -1) {
            this.in.reset();
            this.f16753f = this.f16754o;
        } else {
            throw new IOException("mark not set");
        }
    }

    public long skip(long j) {
        long skip = this.in.skip(Math.min(j, (long) this.f16753f));
        this.f16753f = (int) (((long) this.f16753f) - skip);
        return skip;
    }
}
