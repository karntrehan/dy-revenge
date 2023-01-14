package p174e.p247e.p293j;

import java.io.UnsupportedEncodingException;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.j.e */
public class C6256e {
    /* renamed from: a */
    public static byte[] m23719a(String str) {
        C6062k.m22839g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m23720b(byte[] bArr, byte[] bArr2, int i) {
        C6062k.m22839g(bArr);
        C6062k.m22839g(bArr2);
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m23721c(byte[] bArr, byte[] bArr2) {
        return m23720b(bArr, bArr2, 0);
    }
}
