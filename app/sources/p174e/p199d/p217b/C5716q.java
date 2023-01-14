package p174e.p199d.p217b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: e.d.b.q */
public final class C5716q {
    /* renamed from: a */
    public static byte[] m21299a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
