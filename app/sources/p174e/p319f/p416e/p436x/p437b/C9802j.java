package p174e.p319f.p416e.p436x.p437b;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p027c.p028a.C1444j;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.x.b.j */
public final class C9802j {

    /* renamed from: a */
    private static final int[] f26259a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: b */
    private static final C9802j[] f26260b = m33473b();

    /* renamed from: c */
    private final int f26261c;

    /* renamed from: d */
    private final int[] f26262d;

    /* renamed from: e */
    private final C9804b[] f26263e;

    /* renamed from: f */
    private final int f26264f;

    /* renamed from: e.f.e.x.b.j$a */
    public static final class C9803a {

        /* renamed from: a */
        private final int f26265a;

        /* renamed from: b */
        private final int f26266b;

        C9803a(int i, int i2) {
            this.f26265a = i;
            this.f26266b = i2;
        }

        /* renamed from: a */
        public int mo24532a() {
            return this.f26265a;
        }

        /* renamed from: b */
        public int mo24533b() {
            return this.f26266b;
        }
    }

    /* renamed from: e.f.e.x.b.j$b */
    public static final class C9804b {

        /* renamed from: a */
        private final int f26267a;

        /* renamed from: b */
        private final C9803a[] f26268b;

        C9804b(int i, C9803a... aVarArr) {
            this.f26267a = i;
            this.f26268b = aVarArr;
        }

        /* renamed from: a */
        public C9803a[] mo24534a() {
            return this.f26268b;
        }

        /* renamed from: b */
        public int mo24535b() {
            return this.f26267a;
        }
    }

    private C9802j(int i, int[] iArr, C9804b... bVarArr) {
        this.f26261c = i;
        this.f26262d = iArr;
        this.f26263e = bVarArr;
        int b = bVarArr[0].mo24535b();
        int i2 = 0;
        for (C9803a aVar : bVarArr[0].mo24534a()) {
            i2 += aVar.mo24532a() * (aVar.mo24533b() + b);
        }
        this.f26264f = i2;
    }

    /* renamed from: b */
    private static C9802j[] m33473b() {
        return new C9802j[]{new C9802j(1, new int[0], new C9804b(7, new C9803a(1, 19)), new C9804b(10, new C9803a(1, 16)), new C9804b(13, new C9803a(1, 13)), new C9804b(17, new C9803a(1, 9))), new C9802j(2, new int[]{6, 18}, new C9804b(10, new C9803a(1, 34)), new C9804b(16, new C9803a(1, 28)), new C9804b(22, new C9803a(1, 22)), new C9804b(28, new C9803a(1, 16))), new C9802j(3, new int[]{6, 22}, new C9804b(15, new C9803a(1, 55)), new C9804b(26, new C9803a(1, 44)), new C9804b(18, new C9803a(2, 17)), new C9804b(22, new C9803a(2, 13))), new C9802j(4, new int[]{6, 26}, new C9804b(20, new C9803a(1, 80)), new C9804b(18, new C9803a(2, 32)), new C9804b(26, new C9803a(2, 24)), new C9804b(16, new C9803a(4, 9))), new C9802j(5, new int[]{6, 30}, new C9804b(26, new C9803a(1, 108)), new C9804b(24, new C9803a(2, 43)), new C9804b(18, new C9803a(2, 15), new C9803a(2, 16)), new C9804b(22, new C9803a(2, 11), new C9803a(2, 12))), new C9802j(6, new int[]{6, 34}, new C9804b(18, new C9803a(2, 68)), new C9804b(16, new C9803a(4, 27)), new C9804b(24, new C9803a(4, 19)), new C9804b(28, new C9803a(4, 15))), new C9802j(7, new int[]{6, 22, 38}, new C9804b(20, new C9803a(2, 78)), new C9804b(18, new C9803a(4, 31)), new C9804b(18, new C9803a(2, 14), new C9803a(4, 15)), new C9804b(26, new C9803a(4, 13), new C9803a(1, 14))), new C9802j(8, new int[]{6, 24, 42}, new C9804b(24, new C9803a(2, 97)), new C9804b(22, new C9803a(2, 38), new C9803a(2, 39)), new C9804b(22, new C9803a(4, 18), new C9803a(2, 19)), new C9804b(26, new C9803a(4, 14), new C9803a(2, 15))), new C9802j(9, new int[]{6, 26, 46}, new C9804b(30, new C9803a(2, C1444j.f4226F0)), new C9804b(22, new C9803a(3, 36), new C9803a(2, 37)), new C9804b(20, new C9803a(4, 16), new C9803a(4, 17)), new C9804b(24, new C9803a(4, 12), new C9803a(4, 13))), new C9802j(10, new int[]{6, 28, 50}, new C9804b(18, new C9803a(2, 68), new C9803a(2, 69)), new C9804b(26, new C9803a(4, 43), new C9803a(1, 44)), new C9804b(24, new C9803a(6, 19), new C9803a(2, 20)), new C9804b(28, new C9803a(6, 15), new C9803a(2, 16))), new C9802j(11, new int[]{6, 30, 54}, new C9804b(20, new C9803a(4, 81)), new C9804b(30, new C9803a(1, 50), new C9803a(4, 51)), new C9804b(28, new C9803a(4, 22), new C9803a(4, 23)), new C9804b(24, new C9803a(3, 12), new C9803a(8, 13))), new C9802j(12, new int[]{6, 32, 58}, new C9804b(24, new C9803a(2, 92), new C9803a(2, 93)), new C9804b(22, new C9803a(6, 36), new C9803a(2, 37)), new C9804b(26, new C9803a(4, 20), new C9803a(6, 21)), new C9804b(28, new C9803a(7, 14), new C9803a(4, 15))), new C9802j(13, new int[]{6, 34, 62}, new C9804b(26, new C9803a(4, 107)), new C9804b(22, new C9803a(8, 37), new C9803a(1, 38)), new C9804b(24, new C9803a(8, 20), new C9803a(4, 21)), new C9804b(22, new C9803a(12, 11), new C9803a(4, 12))), new C9802j(14, new int[]{6, 26, 46, 66}, new C9804b(30, new C9803a(3, C1444j.f4221E0), new C9803a(1, C1444j.f4226F0)), new C9804b(24, new C9803a(4, 40), new C9803a(5, 41)), new C9804b(20, new C9803a(11, 16), new C9803a(5, 17)), new C9804b(24, new C9803a(11, 12), new C9803a(5, 13))), new C9802j(15, new int[]{6, 26, 48, 70}, new C9804b(22, new C9803a(5, 87), new C9803a(1, 88)), new C9804b(24, new C9803a(5, 41), new C9803a(5, 42)), new C9804b(30, new C9803a(5, 24), new C9803a(7, 25)), new C9804b(24, new C9803a(11, 12), new C9803a(7, 13))), new C9802j(16, new int[]{6, 26, 50, 74}, new C9804b(24, new C9803a(5, 98), new C9803a(1, 99)), new C9804b(28, new C9803a(7, 45), new C9803a(3, 46)), new C9804b(24, new C9803a(15, 19), new C9803a(2, 20)), new C9804b(30, new C9803a(3, 15), new C9803a(13, 16))), new C9802j(17, new int[]{6, 30, 54, 78}, new C9804b(28, new C9803a(1, 107), new C9803a(5, 108)), new C9804b(28, new C9803a(10, 46), new C9803a(1, 47)), new C9804b(28, new C9803a(1, 22), new C9803a(15, 23)), new C9804b(28, new C9803a(2, 14), new C9803a(17, 15))), new C9802j(18, new int[]{6, 30, 56, 82}, new C9804b(30, new C9803a(5, C1444j.f4246J0), new C9803a(1, C1444j.f4251K0)), new C9804b(26, new C9803a(9, 43), new C9803a(4, 44)), new C9804b(28, new C9803a(17, 22), new C9803a(1, 23)), new C9804b(28, new C9803a(2, 14), new C9803a(19, 15))), new C9802j(19, new int[]{6, 30, 58, 86}, new C9804b(28, new C9803a(3, 113), new C9803a(4, C1444j.f4216D0)), new C9804b(26, new C9803a(3, 44), new C9803a(11, 45)), new C9804b(26, new C9803a(17, 21), new C9803a(4, 22)), new C9804b(26, new C9803a(9, 13), new C9803a(16, 14))), new C9802j(20, new int[]{6, 34, 62, 90}, new C9804b(28, new C9803a(3, 107), new C9803a(5, 108)), new C9804b(26, new C9803a(3, 41), new C9803a(13, 42)), new C9804b(30, new C9803a(15, 24), new C9803a(5, 25)), new C9804b(28, new C9803a(15, 15), new C9803a(10, 16))), new C9802j(21, new int[]{6, 28, 50, 72, 94}, new C9804b(28, new C9803a(4, C1444j.f4226F0), new C9803a(4, C1444j.f4231G0)), new C9804b(26, new C9803a(17, 42)), new C9804b(28, new C9803a(17, 22), new C9803a(6, 23)), new C9804b(30, new C9803a(19, 16), new C9803a(6, 17))), new C9802j(22, new int[]{6, 26, 50, 74, 98}, new C9804b(28, new C9803a(2, 111), new C9803a(7, 112)), new C9804b(28, new C9803a(17, 46)), new C9804b(30, new C9803a(7, 24), new C9803a(16, 25)), new C9804b(24, new C9803a(34, 13))), new C9802j(23, new int[]{6, 30, 54, 78, 102}, new C9804b(30, new C9803a(4, C1444j.f4251K0), new C9803a(5, C1444j.f4256L0)), new C9804b(28, new C9803a(4, 47), new C9803a(14, 48)), new C9804b(30, new C9803a(11, 24), new C9803a(14, 25)), new C9804b(30, new C9803a(16, 15), new C9803a(14, 16))), new C9802j(24, new int[]{6, 28, 54, 80, 106}, new C9804b(30, new C9803a(6, C1444j.f4231G0), new C9803a(4, C1444j.f4236H0)), new C9804b(28, new C9803a(6, 45), new C9803a(14, 46)), new C9804b(30, new C9803a(11, 24), new C9803a(16, 25)), new C9804b(30, new C9803a(30, 16), new C9803a(2, 17))), new C9802j(25, new int[]{6, 32, 58, 84, 110}, new C9804b(26, new C9803a(8, 106), new C9803a(4, 107)), new C9804b(28, new C9803a(8, 47), new C9803a(13, 48)), new C9804b(30, new C9803a(7, 24), new C9803a(22, 25)), new C9804b(30, new C9803a(22, 15), new C9803a(13, 16))), new C9802j(26, new int[]{6, 30, 58, 86, C1444j.f4216D0}, new C9804b(28, new C9803a(10, C1444j.f4216D0), new C9803a(2, C1444j.f4221E0)), new C9804b(28, new C9803a(19, 46), new C9803a(4, 47)), new C9804b(28, new C9803a(28, 22), new C9803a(6, 23)), new C9804b(30, new C9803a(33, 16), new C9803a(4, 17))), new C9802j(27, new int[]{6, 34, 62, 90, C1444j.f4236H0}, new C9804b(30, new C9803a(8, C1444j.f4256L0), new C9803a(4, C1444j.f4261M0)), new C9804b(28, new C9803a(22, 45), new C9803a(3, 46)), new C9804b(30, new C9803a(8, 23), new C9803a(26, 24)), new C9804b(30, new C9803a(12, 15), new C9803a(28, 16))), new C9802j(28, new int[]{6, 26, 50, 74, 98, C1444j.f4256L0}, new C9804b(30, new C9803a(3, C1444j.f4231G0), new C9803a(10, C1444j.f4236H0)), new C9804b(28, new C9803a(3, 45), new C9803a(23, 46)), new C9804b(30, new C9803a(4, 24), new C9803a(31, 25)), new C9804b(30, new C9803a(11, 15), new C9803a(31, 16))), new C9802j(29, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT}, new C9804b(30, new C9803a(7, C1444j.f4226F0), new C9803a(7, C1444j.f4231G0)), new C9804b(28, new C9803a(21, 45), new C9803a(7, 46)), new C9804b(30, new C9803a(1, 23), new C9803a(37, 24)), new C9804b(30, new C9803a(19, 15), new C9803a(26, 16))), new C9802j(30, new int[]{6, 26, 52, 78, 104, 130}, new C9804b(30, new C9803a(5, C1444j.f4221E0), new C9803a(10, C1444j.f4226F0)), new C9804b(28, new C9803a(19, 47), new C9803a(10, 48)), new C9804b(30, new C9803a(15, 24), new C9803a(25, 25)), new C9804b(30, new C9803a(23, 15), new C9803a(25, 16))), new C9802j(31, new int[]{6, 30, 56, 82, 108, 134}, new C9804b(30, new C9803a(13, C1444j.f4221E0), new C9803a(3, C1444j.f4226F0)), new C9804b(28, new C9803a(2, 46), new C9803a(29, 47)), new C9804b(30, new C9803a(42, 24), new C9803a(1, 25)), new C9804b(30, new C9803a(23, 15), new C9803a(28, 16))), new C9802j(32, new int[]{6, 34, 60, 86, 112, 138}, new C9804b(30, new C9803a(17, C1444j.f4221E0)), new C9804b(28, new C9803a(10, 46), new C9803a(23, 47)), new C9804b(30, new C9803a(10, 24), new C9803a(35, 25)), new C9804b(30, new C9803a(19, 15), new C9803a(35, 16))), new C9802j(33, new int[]{6, 30, 58, 86, C1444j.f4216D0, 142}, new C9804b(30, new C9803a(17, C1444j.f4221E0), new C9803a(1, C1444j.f4226F0)), new C9804b(28, new C9803a(14, 46), new C9803a(21, 47)), new C9804b(30, new C9803a(29, 24), new C9803a(19, 25)), new C9804b(30, new C9803a(11, 15), new C9803a(46, 16))), new C9802j(34, new int[]{6, 34, 62, 90, C1444j.f4236H0, 146}, new C9804b(30, new C9803a(13, C1444j.f4221E0), new C9803a(6, C1444j.f4226F0)), new C9804b(28, new C9803a(14, 46), new C9803a(23, 47)), new C9804b(30, new C9803a(44, 24), new C9803a(7, 25)), new C9804b(30, new C9803a(59, 16), new C9803a(1, 17))), new C9802j(35, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new C9804b(30, new C9803a(12, C1444j.f4251K0), new C9803a(7, C1444j.f4256L0)), new C9804b(28, new C9803a(12, 47), new C9803a(26, 48)), new C9804b(30, new C9803a(39, 24), new C9803a(14, 25)), new C9804b(30, new C9803a(22, 15), new C9803a(41, 16))), new C9802j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C9804b(30, new C9803a(6, C1444j.f4251K0), new C9803a(14, C1444j.f4256L0)), new C9804b(28, new C9803a(6, 47), new C9803a(34, 48)), new C9804b(30, new C9803a(46, 24), new C9803a(10, 25)), new C9804b(30, new C9803a(2, 15), new C9803a(64, 16))), new C9802j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C9804b(30, new C9803a(17, C1444j.f4256L0), new C9803a(4, C1444j.f4261M0)), new C9804b(28, new C9803a(29, 46), new C9803a(14, 47)), new C9804b(30, new C9803a(49, 24), new C9803a(10, 25)), new C9804b(30, new C9803a(24, 15), new C9803a(46, 16))), new C9802j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C9804b(30, new C9803a(4, C1444j.f4256L0), new C9803a(18, C1444j.f4261M0)), new C9804b(28, new C9803a(13, 46), new C9803a(32, 47)), new C9804b(30, new C9803a(48, 24), new C9803a(14, 25)), new C9804b(30, new C9803a(42, 15), new C9803a(32, 16))), new C9802j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C9804b(30, new C9803a(20, C1444j.f4231G0), new C9803a(4, C1444j.f4236H0)), new C9804b(28, new C9803a(40, 47), new C9803a(7, 48)), new C9804b(30, new C9803a(43, 24), new C9803a(22, 25)), new C9804b(30, new C9803a(10, 15), new C9803a(67, 16))), new C9802j(40, new int[]{6, 30, 58, 86, C1444j.f4216D0, 142, 170}, new C9804b(30, new C9803a(19, C1444j.f4236H0), new C9803a(6, C1444j.f4241I0)), new C9804b(28, new C9803a(18, 47), new C9803a(31, 48)), new C9804b(30, new C9803a(34, 24), new C9803a(34, 25)), new C9804b(30, new C9803a(20, 15), new C9803a(61, 16)))};
    }

    /* renamed from: c */
    static C9802j m33474c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        while (true) {
            int[] iArr = f26259a;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m33476i(i2 + 7);
                }
                int e = C9799g.m33467e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m33476i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C9802j m33475g(int i) {
        if (i % 4 == 1) {
            try {
                return m33476i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C9660f.m32836a();
            }
        } else {
            throw C9660f.m32836a();
        }
    }

    /* renamed from: i */
    public static C9802j m33476i(int i) {
        if (i > 0 && i <= 40) {
            return f26260b[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9680b mo24525a() {
        int e = mo24527e();
        C9680b bVar = new C9680b(e);
        bVar.mo24274q(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo24274q(i, 0, 8, 9);
        bVar.mo24274q(0, i, 9, 8);
        int length = this.f26262d.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f26262d[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo24274q(this.f26262d[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo24274q(6, 9, 1, i5);
        bVar.mo24274q(9, 6, i5, 1);
        if (this.f26261c > 6) {
            int i6 = e - 11;
            bVar.mo24274q(i6, 0, 3, 6);
            bVar.mo24274q(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo24526d() {
        return this.f26262d;
    }

    /* renamed from: e */
    public int mo24527e() {
        return (this.f26261c * 4) + 17;
    }

    /* renamed from: f */
    public C9804b mo24528f(C9798f fVar) {
        return this.f26263e[fVar.ordinal()];
    }

    /* renamed from: h */
    public int mo24529h() {
        return this.f26264f;
    }

    /* renamed from: j */
    public int mo24530j() {
        return this.f26261c;
    }

    public String toString() {
        return String.valueOf(this.f26261c);
    }
}
