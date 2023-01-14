package p174e.p199d.p200a.p209n;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: e.d.a.n.d */
public class C5679d {

    /* renamed from: a */
    private static final Set<String> f16089a = new HashSet(Arrays.asList(new String[]{"IDAT", "sPLT", "iTXt", "tEXt", "zTXt"}));

    /* renamed from: b */
    public static final C5679d f16090b;

    /* renamed from: c */
    public static final C5679d f16091c;

    /* renamed from: d */
    public static final C5679d f16092d;

    /* renamed from: e */
    public static final C5679d f16093e;

    /* renamed from: f */
    public static final C5679d f16094f;

    /* renamed from: g */
    public static final C5679d f16095g;

    /* renamed from: h */
    public static final C5679d f16096h;

    /* renamed from: i */
    public static final C5679d f16097i;

    /* renamed from: j */
    public static final C5679d f16098j;

    /* renamed from: k */
    public static final C5679d f16099k;

    /* renamed from: l */
    public static final C5679d f16100l;

    /* renamed from: m */
    public static final C5679d f16101m;

    /* renamed from: n */
    public static final C5679d f16102n;

    /* renamed from: o */
    public static final C5679d f16103o;

    /* renamed from: p */
    public static final C5679d f16104p;

    /* renamed from: q */
    public static final C5679d f16105q;

    /* renamed from: r */
    public static final C5679d f16106r;

    /* renamed from: s */
    public static final C5679d f16107s;

    /* renamed from: t */
    private final byte[] f16108t;

    /* renamed from: u */
    private final boolean f16109u;

    static {
        try {
            f16090b = new C5679d("IHDR");
            f16091c = new C5679d("PLTE");
            f16092d = new C5679d("IDAT", true);
            f16093e = new C5679d("IEND");
            f16094f = new C5679d("cHRM");
            f16095g = new C5679d("gAMA");
            f16096h = new C5679d("iCCP");
            f16097i = new C5679d("sBIT");
            f16098j = new C5679d("sRGB");
            f16099k = new C5679d("bKGD");
            f16100l = new C5679d("hIST");
            f16101m = new C5679d("tRNS");
            f16102n = new C5679d("pHYs");
            f16103o = new C5679d("sPLT", true);
            f16104p = new C5679d("tIME");
            f16105q = new C5679d("iTXt", true);
            f16106r = new C5679d("tEXt", true);
            f16107s = new C5679d("zTXt", true);
        } catch (C5683h e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C5679d(String str) {
        this(str, false);
    }

    public C5679d(String str, boolean z) {
        this.f16109u = z;
        try {
            byte[] bytes = str.getBytes("ASCII");
            m21132d(bytes);
            this.f16108t = bytes;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException("Unable to convert string code to bytes.");
        }
    }

    public C5679d(byte[] bArr) {
        m21132d(bArr);
        this.f16108t = bArr;
        this.f16109u = f16089a.contains(mo16961b());
    }

    /* renamed from: c */
    private static boolean m21131c(byte b) {
        return (b >= 65 && b <= 90) || (b >= 97 && b <= 122);
    }

    /* renamed from: d */
    private static void m21132d(byte[] bArr) {
        if (bArr.length == 4) {
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                if (m21131c(bArr[i])) {
                    i++;
                } else {
                    throw new C5683h("PNG chunk type identifier may only contain alphabet characters");
                }
            }
            return;
        }
        throw new C5683h("PNG chunk type identifier must be four bytes in length");
    }

    /* renamed from: a */
    public boolean mo16960a() {
        return this.f16109u;
    }

    /* renamed from: b */
    public String mo16961b() {
        try {
            return new String(this.f16108t, "ASCII");
        } catch (UnsupportedEncodingException unused) {
            return "Invalid object instance";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5679d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16108t, ((C5679d) obj).f16108t);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16108t);
    }

    public String toString() {
        return mo16961b();
    }
}
