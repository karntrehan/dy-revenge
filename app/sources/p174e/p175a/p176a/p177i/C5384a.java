package p174e.p175a.p176a.p177i;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import okhttp3.internal.http2.Http2;

/* renamed from: e.a.a.i.a */
public class C5384a {

    /* renamed from: a */
    private byte[] f15032a;

    /* renamed from: b */
    private int f15033b;

    /* renamed from: c */
    private String f15034c;

    public C5384a(int i) {
        this.f15034c = null;
        this.f15032a = new byte[i];
        this.f15033b = 0;
    }

    public C5384a(InputStream inputStream) {
        this.f15034c = null;
        this.f15033b = 0;
        this.f15032a = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        while (true) {
            int read = inputStream.read(this.f15032a, this.f15033b, Http2.INITIAL_MAX_FRAME_SIZE);
            if (read > 0) {
                int i = this.f15033b + read;
                this.f15033b = i;
                if (read == 16384) {
                    m19904e(i + Http2.INITIAL_MAX_FRAME_SIZE);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public C5384a(byte[] bArr) {
        this.f15034c = null;
        this.f15032a = bArr;
        this.f15033b = bArr.length;
    }

    public C5384a(byte[] bArr, int i, int i2) {
        this.f15034c = null;
        if (i2 <= bArr.length - i) {
            byte[] bArr2 = new byte[i2];
            this.f15032a = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.f15033b = i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
    }

    /* renamed from: e */
    private void m19904e(int i) {
        byte[] bArr = this.f15032a;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            this.f15032a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    /* renamed from: a */
    public void mo16214a(byte b) {
        m19904e(this.f15033b + 1);
        byte[] bArr = this.f15032a;
        int i = this.f15033b;
        this.f15033b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: b */
    public void mo16215b(byte[] bArr) {
        mo16216c(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public void mo16216c(byte[] bArr, int i, int i2) {
        m19904e(this.f15033b + i2);
        System.arraycopy(bArr, i, this.f15032a, this.f15033b, i2);
        this.f15033b += i2;
    }

    /* renamed from: d */
    public int mo16217d(int i) {
        if (i < this.f15033b) {
            return this.f15032a[i] & 255;
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    /* renamed from: f */
    public InputStream mo16218f() {
        return new ByteArrayInputStream(this.f15032a, 0, this.f15033b);
    }

    /* renamed from: g */
    public String mo16219g() {
        String str;
        if (this.f15034c == null) {
            int i = this.f15033b;
            if (i >= 2) {
                byte[] bArr = this.f15032a;
                if (bArr[0] == 0) {
                    if (i < 4 || bArr[1] != 0) {
                        str = "UTF-16BE";
                        this.f15034c = str;
                    } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                        str = "UTF-32BE";
                        this.f15034c = str;
                    }
                } else if ((bArr[0] & 255) < 128) {
                    if (bArr[1] == 0) {
                        str = (i < 4 || bArr[2] != 0) ? "UTF-16LE" : "UTF-32LE";
                        this.f15034c = str;
                    }
                } else if ((bArr[0] & 255) != 239) {
                    if ((bArr[0] & 255) == 254 || i < 4 || bArr[2] != 0) {
                        this.f15034c = "UTF-16";
                    }
                }
                this.f15034c = "UTF-32";
            }
            this.f15034c = "UTF-8";
        }
        return this.f15034c;
    }

    /* renamed from: h */
    public int mo16220h() {
        return this.f15033b;
    }
}
