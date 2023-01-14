package p174e.p319f.p320a.p335c.p345f.p348c;

import android.util.Base64;
import java.util.Random;

/* renamed from: e.f.a.c.f.c.c */
public final class C6666c {

    /* renamed from: a */
    private static final Random f18326a = new Random();

    /* renamed from: a */
    public static String m25312a() {
        byte[] bArr = new byte[16];
        f18326a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
