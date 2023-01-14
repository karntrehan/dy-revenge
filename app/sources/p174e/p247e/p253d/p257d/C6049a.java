package p174e.p247e.p253d.p257d;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: e.e.d.d.a */
public final class C6049a {
    /* renamed from: a */
    public static long m22814a(InputStream inputStream, OutputStream outputStream) {
        C6062k.m22839g(inputStream);
        C6062k.m22839g(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static int m22815b(InputStream inputStream, byte[] bArr, int i, int i2) {
        C6062k.m22839g(inputStream);
        C6062k.m22839g(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
