package p174e.p199d.p218c.p237v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.v.b */
public class C5875b extends C5722b {

    /* renamed from: f */
    protected static final byte[] f16342f = {0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: g */
    protected static final byte[] f16343g = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    /* renamed from: h */
    protected static final byte[] f16344h = {0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};

    /* renamed from: i */
    protected static final byte[] f16345i = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    /* renamed from: j */
    protected static final byte[] f16346j = {0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125};

    /* renamed from: k */
    protected static final byte[] f16347k = {1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, 51, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6};

    /* renamed from: l */
    protected static final byte[] f16348l = {0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119};

    /* renamed from: m */
    protected static final byte[] f16349m = {0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6};

    /* renamed from: n */
    protected static final HashMap<Integer, String> f16350n;

    /* renamed from: o */
    protected final List<C5876a> f16351o = new ArrayList(4);

    /* renamed from: e.d.c.v.b$a */
    public static class C5876a {

        /* renamed from: a */
        private final int f16352a;

        /* renamed from: b */
        private final C5877a f16353b;

        /* renamed from: c */
        private final int f16354c;

        /* renamed from: d */
        private final byte[] f16355d;

        /* renamed from: e */
        private final byte[] f16356e;

        /* renamed from: e.d.c.v.b$a$a */
        public enum C5877a {
            DC,
            AC,
            UNKNOWN;

            /* renamed from: e */
            public static C5877a m22332e(int i) {
                return i != 0 ? i != 1 ? UNKNOWN : AC : DC;
            }
        }

        public C5876a(C5877a aVar, int i, byte[] bArr, byte[] bArr2) {
            if (bArr == null) {
                throw new IllegalArgumentException("lengthBytes cannot be null.");
            } else if (bArr2 != null) {
                this.f16353b = aVar;
                this.f16354c = i;
                this.f16355d = bArr;
                this.f16356e = bArr2;
                this.f16352a = bArr2.length + 17;
            } else {
                throw new IllegalArgumentException("valueBytes cannot be null.");
            }
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16350n = hashMap;
        hashMap.put(1, "Number of Tables");
    }

    public C5875b() {
        mo17120E(new C5874a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public List<C5876a> mo17807V() {
        return this.f16351o;
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Huffman";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16350n;
    }
}
