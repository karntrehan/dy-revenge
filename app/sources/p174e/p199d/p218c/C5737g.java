package p174e.p199d.p218c;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: e.d.c.g */
public final class C5737g {

    /* renamed from: a */
    private final byte[] f16211a;

    /* renamed from: b */
    private final Charset f16212b;

    public C5737g(byte[] bArr, Charset charset) {
        this.f16211a = bArr;
        this.f16212b = charset;
    }

    /* renamed from: a */
    public byte[] mo17179a() {
        return this.f16211a;
    }

    /* renamed from: b */
    public String mo17180b(Charset charset) {
        if (charset != null) {
            try {
                return new String(this.f16211a, charset.name());
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(this.f16211a);
    }

    public String toString() {
        return mo17180b(this.f16212b);
    }
}
