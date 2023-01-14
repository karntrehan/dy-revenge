package p174e.p247e.p253d.p265l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: e.e.d.l.c */
public class C6115c {

    /* renamed from: a */
    public static final boolean f16765a;

    /* renamed from: b */
    public static final boolean f16766b;

    /* renamed from: c */
    public static final boolean f16767c = m23018e();

    /* renamed from: d */
    public static C6113b f16768d = null;

    /* renamed from: e */
    private static boolean f16769e = false;

    /* renamed from: f */
    private static final byte[] f16770f = m23014a("RIFF");

    /* renamed from: g */
    private static final byte[] f16771g = m23014a("WEBP");

    /* renamed from: h */
    private static final byte[] f16772h = m23014a("VP8 ");

    /* renamed from: i */
    private static final byte[] f16773i = m23014a("VP8L");

    /* renamed from: j */
    private static final byte[] f16774j = m23014a("VP8X");

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f16765a = i <= 17;
        if (i < 14) {
            z = false;
        }
        f16766b = z;
    }

    /* renamed from: a */
    private static byte[] m23014a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m23015b(byte[] bArr, int i) {
        return m23023j(bArr, i + 12, f16774j) && ((bArr[i + 20] & 2) == 2);
    }

    /* renamed from: c */
    public static boolean m23016c(byte[] bArr, int i, int i2) {
        return i2 >= 21 && m23023j(bArr, i + 12, f16774j);
    }

    /* renamed from: d */
    public static boolean m23017d(byte[] bArr, int i) {
        return m23023j(bArr, i + 12, f16774j) && ((bArr[i + 20] & 16) == 16);
    }

    /* renamed from: e */
    private static boolean m23018e() {
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m23019f(byte[] bArr, int i) {
        return m23023j(bArr, i + 12, f16773i);
    }

    /* renamed from: g */
    public static boolean m23020g(byte[] bArr, int i) {
        return m23023j(bArr, i + 12, f16772h);
    }

    /* renamed from: h */
    public static boolean m23021h(byte[] bArr, int i, int i2) {
        return i2 >= 20 && m23023j(bArr, i, f16770f) && m23023j(bArr, i + 8, f16771g);
    }

    /* renamed from: i */
    public static C6113b m23022i() {
        if (f16769e) {
            return f16768d;
        }
        C6113b bVar = null;
        try {
            bVar = (C6113b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f16769e = true;
        return bVar;
    }

    /* renamed from: j */
    private static boolean m23023j(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
