package androidx.camera.core.impl.p014a3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.HttpUrl;

/* renamed from: androidx.camera.core.impl.a3.g */
final class C0730g {

    /* renamed from: a */
    static final Charset f2238a = StandardCharsets.US_ASCII;

    /* renamed from: b */
    static final String[] f2239b = {HttpUrl.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: c */
    static final int[] f2240c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: d */
    static final byte[] f2241d = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: e */
    public final int f2242e;

    /* renamed from: f */
    public final int f2243f;

    /* renamed from: g */
    public final long f2244g;

    /* renamed from: h */
    public final byte[] f2245h;

    C0730g(int i, int i2, long j, byte[] bArr) {
        this.f2242e = i;
        this.f2243f = i2;
        this.f2244g = j;
        this.f2245h = bArr;
    }

    C0730g(int i, int i2, byte[] bArr) {
        this(i, i2, -1, bArr);
    }

    /* renamed from: a */
    public static C0730g m3006a(String str) {
        if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
            byte[] bytes = str.getBytes(f2238a);
            return new C0730g(1, bytes.length, bytes);
        }
        return new C0730g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
    }

    /* renamed from: b */
    public static C0730g m3007b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f2240c[12] * dArr.length)]);
        wrap.order(byteOrder);
        for (double putDouble : dArr) {
            wrap.putDouble(putDouble);
        }
        return new C0730g(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C0730g m3008c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f2240c[9] * iArr.length)]);
        wrap.order(byteOrder);
        for (int putInt : iArr) {
            wrap.putInt(putInt);
        }
        return new C0730g(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C0730g m3009d(C0741k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f2240c[10] * kVarArr.length)]);
        wrap.order(byteOrder);
        for (C0741k kVar : kVarArr) {
            wrap.putInt((int) kVar.mo2876b());
            wrap.putInt((int) kVar.mo2875a());
        }
        return new C0730g(10, kVarArr.length, wrap.array());
    }

    /* renamed from: e */
    public static C0730g m3010e(String str) {
        byte[] bytes = (str + 0).getBytes(f2238a);
        return new C0730g(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C0730g m3011f(long j, ByteOrder byteOrder) {
        return m3012g(new long[]{j}, byteOrder);
    }

    /* renamed from: g */
    public static C0730g m3012g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f2240c[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C0730g(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C0730g m3013h(C0741k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f2240c[5] * kVarArr.length)]);
        wrap.order(byteOrder);
        for (C0741k kVar : kVarArr) {
            wrap.putInt((int) kVar.mo2876b());
            wrap.putInt((int) kVar.mo2875a());
        }
        return new C0730g(5, kVarArr.length, wrap.array());
    }

    /* renamed from: i */
    public static C0730g m3014i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f2240c[3] * iArr.length)]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C0730g(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public int mo2848j() {
        return f2240c[this.f2242e] * this.f2243f;
    }

    public String toString() {
        return "(" + f2239b[this.f2242e] + ", data length:" + this.f2245h.length + ")";
    }
}
