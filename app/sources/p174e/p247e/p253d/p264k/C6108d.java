package p174e.p247e.p253d.p264k;

import java.io.InputStream;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.d.k.d */
public class C6108d {
    /* renamed from: a */
    public static long m22993a(InputStream inputStream, long j) {
        C6062k.m22839g(inputStream);
        C6062k.m22834b(Boolean.valueOf(j >= 0));
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
