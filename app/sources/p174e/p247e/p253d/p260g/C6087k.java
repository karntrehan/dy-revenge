package p174e.p247e.p253d.p260g;

import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.d.g.k */
public class C6087k {

    /* renamed from: a */
    private final int f16724a;

    /* renamed from: b */
    private final C6076a f16725b;

    public C6087k(C6076a aVar) {
        this(aVar, Http2.INITIAL_MAX_FRAME_SIZE);
    }

    public C6087k(C6076a aVar, int i) {
        C6062k.m22834b(Boolean.valueOf(i > 0));
        this.f16724a = i;
        this.f16725b = aVar;
    }

    /* renamed from: a */
    public long mo18076a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f16725b.get(this.f16724a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f16724a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f16725b.mo8068a(bArr);
            }
        }
    }
}
