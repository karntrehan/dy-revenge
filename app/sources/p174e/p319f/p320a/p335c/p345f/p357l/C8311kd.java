package p174e.p319f.p320a.p335c.p345f.p357l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: e.f.a.c.f.l.kd */
public final class C8311kd {

    /* renamed from: a */
    static final Charset f22725a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f22726b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f22727c;

    /* renamed from: d */
    public static final ByteBuffer f22728d;

    /* renamed from: e */
    public static final C8234gc f22729e;

    static {
        byte[] bArr = new byte[0];
        f22727c = bArr;
        f22728d = ByteBuffer.wrap(bArr);
        int i = C8234gc.f22556a;
        C8215fc fcVar = new C8215fc(bArr, 0, 0, false, (C8196ec) null);
        try {
            fcVar.mo21787c(0);
            f22729e = fcVar;
        } catch (C8366nd e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m28697a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m28698b(byte[] bArr) {
        int length = bArr.length;
        int d = m28700d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m28699c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m28700d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static <T> T m28701e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    static <T> T m28702f(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: g */
    static Object m28703g(Object obj, Object obj2) {
        return ((C8274ie) obj).mo21768s().mo21841I((C8274ie) obj2).mo21660o();
    }

    /* renamed from: h */
    public static String m28704h(byte[] bArr) {
        return new String(bArr, f22725a);
    }

    /* renamed from: i */
    static boolean m28705i(C8274ie ieVar) {
        if (!(ieVar instanceof C8364nb)) {
            return false;
        }
        C8364nb nbVar = (C8364nb) ieVar;
        throw null;
    }

    /* renamed from: j */
    public static boolean m28706j(byte[] bArr) {
        return C8584zf.m29353e(bArr);
    }
}
