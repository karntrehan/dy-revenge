package p174e.p319f.p320a.p335c.p345f.p352g;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: e.f.a.c.f.g.h9 */
public final class C6820h9 {

    /* renamed from: a */
    static final Charset f18519a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f18520b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f18521c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f18522d;

    /* renamed from: e */
    public static final ByteBuffer f18523e;

    /* renamed from: f */
    public static final C6752d8 f18524f;

    static {
        byte[] bArr = new byte[0];
        f18522d = bArr;
        f18523e = ByteBuffer.wrap(bArr);
        int i = C6752d8.f18436a;
        C6718b8 b8Var = new C6718b8(bArr, 0, 0, false, (C6701a8) null);
        try {
            b8Var.mo19564c(0);
            f18524f = b8Var;
        } catch (C6852j9 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m25832a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m25833b(byte[] bArr) {
        int length = bArr.length;
        int d = m25835d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m25834c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m25835d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m25836e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m25837f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    static Object m25838g(Object obj, Object obj2) {
        return ((C6805ga) obj).mo19519f().mo19768i0((C6805ga) obj2).mo19766e0();
    }

    /* renamed from: h */
    public static String m25839h(byte[] bArr) {
        return new String(bArr, f18520b);
    }

    /* renamed from: i */
    public static boolean m25840i(byte[] bArr) {
        return C7110zb.m27093e(bArr);
    }
}
