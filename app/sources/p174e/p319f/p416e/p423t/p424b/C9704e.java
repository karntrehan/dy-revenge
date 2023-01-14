package p174e.p319f.p416e.p423t.p424b;

import p027c.p028a.C1444j;
import p174e.p319f.p416e.C9660f;

/* renamed from: e.f.e.t.b.e */
public final class C9704e {

    /* renamed from: a */
    private static final C9704e[] f26008a = m33038a();

    /* renamed from: b */
    private final int f26009b;

    /* renamed from: c */
    private final int f26010c;

    /* renamed from: d */
    private final int f26011d;

    /* renamed from: e */
    private final int f26012e;

    /* renamed from: f */
    private final int f26013f;

    /* renamed from: g */
    private final C9707c f26014g;

    /* renamed from: h */
    private final int f26015h;

    /* renamed from: e.f.e.t.b.e$b */
    static final class C9706b {

        /* renamed from: a */
        private final int f26016a;

        /* renamed from: b */
        private final int f26017b;

        private C9706b(int i, int i2) {
            this.f26016a = i;
            this.f26017b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo24336a() {
            return this.f26016a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo24337b() {
            return this.f26017b;
        }
    }

    /* renamed from: e.f.e.t.b.e$c */
    static final class C9707c {

        /* renamed from: a */
        private final int f26018a;

        /* renamed from: b */
        private final C9706b[] f26019b;

        private C9707c(int i, C9706b bVar) {
            this.f26018a = i;
            this.f26019b = new C9706b[]{bVar};
        }

        private C9707c(int i, C9706b bVar, C9706b bVar2) {
            this.f26018a = i;
            this.f26019b = new C9706b[]{bVar, bVar2};
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9706b[] mo24338a() {
            return this.f26019b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo24339b() {
            return this.f26018a;
        }
    }

    private C9704e(int i, int i2, int i3, int i4, int i5, C9707c cVar) {
        this.f26009b = i;
        this.f26010c = i2;
        this.f26011d = i3;
        this.f26012e = i4;
        this.f26013f = i5;
        this.f26014g = cVar;
        int b = cVar.mo24339b();
        int i6 = 0;
        for (C9706b bVar : cVar.mo24338a()) {
            i6 += bVar.mo24336a() * (bVar.mo24337b() + b);
        }
        this.f26015h = i6;
    }

    /* renamed from: a */
    private static C9704e[] m33038a() {
        return new C9704e[]{new C9704e(1, 10, 10, 8, 8, new C9707c(5, new C9706b(1, 3))), new C9704e(2, 12, 12, 10, 10, new C9707c(7, new C9706b(1, 5))), new C9704e(3, 14, 14, 12, 12, new C9707c(10, new C9706b(1, 8))), new C9704e(4, 16, 16, 14, 14, new C9707c(12, new C9706b(1, 12))), new C9704e(5, 18, 18, 16, 16, new C9707c(14, new C9706b(1, 18))), new C9704e(6, 20, 20, 18, 18, new C9707c(18, new C9706b(1, 22))), new C9704e(7, 22, 22, 20, 20, new C9707c(20, new C9706b(1, 30))), new C9704e(8, 24, 24, 22, 22, new C9707c(24, new C9706b(1, 36))), new C9704e(9, 26, 26, 24, 24, new C9707c(28, new C9706b(1, 44))), new C9704e(10, 32, 32, 14, 14, new C9707c(36, new C9706b(1, 62))), new C9704e(11, 36, 36, 16, 16, new C9707c(42, new C9706b(1, 86))), new C9704e(12, 40, 40, 18, 18, new C9707c(48, new C9706b(1, C1444j.f4216D0))), new C9704e(13, 44, 44, 20, 20, new C9707c(56, new C9706b(1, 144))), new C9704e(14, 48, 48, 22, 22, new C9707c(68, new C9706b(1, 174))), new C9704e(15, 52, 52, 24, 24, new C9707c(42, new C9706b(2, 102))), new C9704e(16, 64, 64, 14, 14, new C9707c(56, new C9706b(2, 140))), new C9704e(17, 72, 72, 16, 16, new C9707c(36, new C9706b(4, 92))), new C9704e(18, 80, 80, 18, 18, new C9707c(48, new C9706b(4, C1444j.f4216D0))), new C9704e(19, 88, 88, 20, 20, new C9707c(56, new C9706b(4, 144))), new C9704e(20, 96, 96, 22, 22, new C9707c(68, new C9706b(4, 174))), new C9704e(21, 104, 104, 24, 24, new C9707c(56, new C9706b(6, 136))), new C9704e(22, C1444j.f4246J0, C1444j.f4246J0, 18, 18, new C9707c(68, new C9706b(6, 175))), new C9704e(23, 132, 132, 20, 20, new C9707c(62, new C9706b(8, 163))), new C9704e(24, 144, 144, 22, 22, new C9707c(62, new C9706b(8, 156), new C9706b(2, 155))), new C9704e(25, 8, 18, 6, 16, new C9707c(7, new C9706b(1, 5))), new C9704e(26, 8, 32, 6, 14, new C9707c(11, new C9706b(1, 10))), new C9704e(27, 12, 26, 10, 24, new C9707c(14, new C9706b(1, 16))), new C9704e(28, 12, 36, 10, 16, new C9707c(18, new C9706b(1, 22))), new C9704e(29, 16, 36, 14, 16, new C9707c(24, new C9706b(1, 32))), new C9704e(30, 16, 48, 14, 22, new C9707c(28, new C9706b(1, 49)))};
    }

    /* renamed from: h */
    public static C9704e m33039h(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C9704e eVar : f26008a) {
                if (eVar.f26010c == i && eVar.f26011d == i2) {
                    return eVar;
                }
            }
            throw C9660f.m32836a();
        }
        throw C9660f.m32836a();
    }

    /* renamed from: b */
    public int mo24328b() {
        return this.f26013f;
    }

    /* renamed from: c */
    public int mo24329c() {
        return this.f26012e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9707c mo24330d() {
        return this.f26014g;
    }

    /* renamed from: e */
    public int mo24331e() {
        return this.f26011d;
    }

    /* renamed from: f */
    public int mo24332f() {
        return this.f26010c;
    }

    /* renamed from: g */
    public int mo24333g() {
        return this.f26015h;
    }

    /* renamed from: i */
    public int mo24334i() {
        return this.f26009b;
    }

    public String toString() {
        return String.valueOf(this.f26009b);
    }
}
