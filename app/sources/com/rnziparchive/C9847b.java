package com.rnziparchive;

import java.io.InputStream;
import java.io.OutputStream;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.rnziparchive.b */
public class C9847b {

    /* renamed from: com.rnziparchive.b$a */
    public interface C9848a {
        /* renamed from: a */
        void mo24630a(long j);
    }

    /* renamed from: a */
    public static long m33563a(InputStream inputStream, OutputStream outputStream, C9848a aVar) {
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
            long j2 = (long) read;
            j += j2;
            if (aVar != null) {
                aVar.mo24630a(j2);
            }
        }
    }
}
