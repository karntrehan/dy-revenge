package p174e.p247e.p293j;

import p174e.p247e.p253d.p257d.C6057i;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p265l.C6115c;
import p174e.p247e.p293j.C6253c;

/* renamed from: e.e.j.a */
public class C6251a implements C6253c.C6254a {

    /* renamed from: a */
    private static final byte[] f17301a;

    /* renamed from: b */
    private static final int f17302b;

    /* renamed from: c */
    private static final byte[] f17303c;

    /* renamed from: d */
    private static final int f17304d;

    /* renamed from: e */
    private static final byte[] f17305e = C6256e.m23719a("GIF87a");

    /* renamed from: f */
    private static final byte[] f17306f = C6256e.m23719a("GIF89a");

    /* renamed from: g */
    private static final byte[] f17307g;

    /* renamed from: h */
    private static final int f17308h;

    /* renamed from: i */
    private static final byte[] f17309i;

    /* renamed from: j */
    private static final int f17310j;

    /* renamed from: k */
    private static final byte[] f17311k = C6256e.m23719a("ftyp");

    /* renamed from: l */
    private static final byte[][] f17312l = {C6256e.m23719a("heic"), C6256e.m23719a("heix"), C6256e.m23719a("hevc"), C6256e.m23719a("hevx"), C6256e.m23719a("mif1"), C6256e.m23719a("msf1")};

    /* renamed from: m */
    private static final byte[] f17313m;

    /* renamed from: n */
    private static final byte[] f17314n = {77, 77, 0, 42};

    /* renamed from: o */
    private static final int f17315o;

    /* renamed from: p */
    final int f17316p = C6057i.m22824a(21, 20, f17302b, f17304d, 6, f17308h, f17310j, 12);

    /* renamed from: q */
    private boolean f17317q = false;

    static {
        byte[] bArr = {-1, -40, -1};
        f17301a = bArr;
        f17302b = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f17303c = bArr2;
        f17304d = bArr2.length;
        byte[] a = C6256e.m23719a("BM");
        f17307g = a;
        f17308h = a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f17309i = bArr3;
        f17310j = bArr3.length;
        byte[] bArr4 = {73, 73, 42, 0};
        f17313m = bArr4;
        f17315o = bArr4.length;
    }

    /* renamed from: c */
    private static C6253c m23698c(byte[] bArr, int i) {
        C6062k.m22834b(Boolean.valueOf(C6115c.m23021h(bArr, 0, i)));
        return C6115c.m23020g(bArr, 0) ? C6252b.f17323f : C6115c.m23019f(bArr, 0) ? C6252b.f17324g : C6115c.m23016c(bArr, 0, i) ? C6115c.m23015b(bArr, 0) ? C6252b.f17327j : C6115c.m23017d(bArr, 0) ? C6252b.f17326i : C6252b.f17325h : C6253c.f17330a;
    }

    /* renamed from: d */
    private static boolean m23699d(byte[] bArr, int i) {
        byte[] bArr2 = f17307g;
        if (i < bArr2.length) {
            return false;
        }
        return C6256e.m23721c(bArr, bArr2);
    }

    /* renamed from: e */
    private static boolean m23700e(byte[] bArr, int i) {
        return i >= f17315o && (C6256e.m23721c(bArr, f17313m) || C6256e.m23721c(bArr, f17314n));
    }

    /* renamed from: f */
    private static boolean m23701f(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        return C6256e.m23721c(bArr, f17305e) || C6256e.m23721c(bArr, f17306f);
    }

    /* renamed from: g */
    private static boolean m23702g(byte[] bArr, int i) {
        if (i < 12 || bArr[3] < 8 || !C6256e.m23720b(bArr, f17311k, 4)) {
            return false;
        }
        for (byte[] b : f17312l) {
            if (C6256e.m23720b(bArr, b, 8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m23703h(byte[] bArr, int i) {
        byte[] bArr2 = f17309i;
        if (i < bArr2.length) {
            return false;
        }
        return C6256e.m23721c(bArr, bArr2);
    }

    /* renamed from: i */
    private static boolean m23704i(byte[] bArr, int i) {
        byte[] bArr2 = f17301a;
        return i >= bArr2.length && C6256e.m23721c(bArr, bArr2);
    }

    /* renamed from: j */
    private static boolean m23705j(byte[] bArr, int i) {
        byte[] bArr2 = f17303c;
        return i >= bArr2.length && C6256e.m23721c(bArr, bArr2);
    }

    /* renamed from: a */
    public int mo18568a() {
        return this.f17316p;
    }

    /* renamed from: b */
    public final C6253c mo18569b(byte[] bArr, int i) {
        C6062k.m22839g(bArr);
        return (this.f17317q || !C6115c.m23021h(bArr, 0, i)) ? m23704i(bArr, i) ? C6252b.f17318a : m23705j(bArr, i) ? C6252b.f17319b : (!this.f17317q || !C6115c.m23021h(bArr, 0, i)) ? m23701f(bArr, i) ? C6252b.f17320c : m23699d(bArr, i) ? C6252b.f17321d : m23703h(bArr, i) ? C6252b.f17322e : m23702g(bArr, i) ? C6252b.f17328k : m23700e(bArr, i) ? C6252b.f17329l : C6253c.f17330a : m23698c(bArr, i) : m23698c(bArr, i);
    }
}
