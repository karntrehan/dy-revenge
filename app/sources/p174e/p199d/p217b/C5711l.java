package p174e.p199d.p217b;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: e.d.b.l */
public class C5711l extends C5710k {

    /* renamed from: b */
    private final InputStream f16165b;

    /* renamed from: c */
    private final int f16166c;

    /* renamed from: d */
    private final ArrayList<byte[]> f16167d;

    /* renamed from: e */
    private boolean f16168e;

    /* renamed from: f */
    private long f16169f;

    public C5711l(InputStream inputStream) {
        this(inputStream, 2048, -1);
    }

    public C5711l(InputStream inputStream, int i, long j) {
        this.f16167d = new ArrayList<>();
        Objects.requireNonNull(inputStream);
        if (i > 0) {
            this.f16166c = i;
            this.f16165b = inputStream;
            this.f16169f = j;
            return;
        }
        throw new IllegalArgumentException("chunkLength must be greater than zero");
    }

    /* renamed from: b */
    public byte mo17017b(int i) {
        int i2 = this.f16166c;
        int i3 = i / i2;
        return this.f16167d.get(i3)[i % i2];
    }

    /* renamed from: c */
    public byte[] mo17018c(int i, int i2) {
        mo17020x(i, i2);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i2 != 0) {
            int i4 = this.f16166c;
            int i5 = i / i4;
            int i6 = i % i4;
            int min = Math.min(i2, i4 - i6);
            System.arraycopy(this.f16167d.get(i5), i6, bArr, i3, min);
            i2 -= min;
            i += min;
            i3 += min;
        }
        return bArr;
    }

    /* renamed from: k */
    public long mo17019k() {
        long j = this.f16169f;
        if (j != -1) {
            return j;
        }
        mo17059y(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, 1);
        return this.f16169f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo17020x(int i, int i2) {
        if (i < 0) {
            throw new C5699a(String.format("Attempt to read from buffer using a negative index (%d)", new Object[]{Integer.valueOf(i)}));
        } else if (i2 < 0) {
            throw new C5699a("Number of requested bytes must be zero or greater");
        } else if ((((long) i) + ((long) i2)) - 1 > 2147483647L) {
            throw new C5699a(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (!mo17059y(i, i2)) {
            throw new C5699a(i, i2, this.f16169f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo17059y(int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0) {
            return false;
        }
        long j = (((long) i) + ((long) i2)) - 1;
        if (j > 2147483647L) {
            return false;
        }
        int i4 = (int) j;
        if (this.f16168e) {
            return ((long) i4) < this.f16169f;
        }
        int i5 = i4 / this.f16166c;
        while (i5 >= this.f16167d.size()) {
            byte[] bArr = new byte[this.f16166c];
            int i6 = 0;
            while (!this.f16168e && i6 != (i3 = this.f16166c)) {
                int read = this.f16165b.read(bArr, i6, i3 - i6);
                if (read == -1) {
                    this.f16168e = true;
                    int size = (this.f16167d.size() * this.f16166c) + i6;
                    long j2 = this.f16169f;
                    if (j2 == -1) {
                        this.f16169f = (long) size;
                    } else {
                        int i7 = (j2 > ((long) size) ? 1 : (j2 == ((long) size) ? 0 : -1));
                    }
                    if (((long) i4) >= this.f16169f) {
                        this.f16167d.add(bArr);
                        return false;
                    }
                } else {
                    i6 += read;
                }
            }
            this.f16167d.add(bArr);
        }
        return true;
    }
}
