package p174e.p199d.p200a.p212q;

import java.io.IOException;
import java.io.InputStream;
import p174e.p199d.p200a.p206k.C5666a;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.a.q.a */
public class C5688a {
    /* renamed from: a */
    public static C5732e m21157a(InputStream inputStream) {
        if (inputStream.markSupported()) {
            inputStream.mark(512);
            byte[] bArr = new byte[512];
            int read = inputStream.read(bArr);
            if (read != -1) {
                inputStream.reset();
                int i = 0;
                while (true) {
                    if (i >= read - 2) {
                        break;
                    } else if (bArr[i] == -1 && bArr[i + 1] == -40 && bArr[i + 2] == -1) {
                        long j = (long) i;
                        if (inputStream.skip(j) != j) {
                            throw new IOException("Skipping stream bytes failed");
                        }
                    } else {
                        i++;
                    }
                }
                return C5666a.m21099c(inputStream);
            }
            throw new IOException("Stream is empty");
        }
        throw new IOException("Stream must support mark/reset");
    }
}
