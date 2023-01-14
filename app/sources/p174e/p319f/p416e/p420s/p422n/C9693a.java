package p174e.p319f.p416e.p420s.p422n;

/* renamed from: e.f.e.s.n.a */
public final class C9693a {

    /* renamed from: a */
    public static final C9693a f25968a = new C9693a(4201, 4096, 1);

    /* renamed from: b */
    public static final C9693a f25969b = new C9693a(1033, 1024, 1);

    /* renamed from: c */
    public static final C9693a f25970c;

    /* renamed from: d */
    public static final C9693a f25971d = new C9693a(19, 16, 1);

    /* renamed from: e */
    public static final C9693a f25972e = new C9693a(285, 256, 0);

    /* renamed from: f */
    public static final C9693a f25973f;

    /* renamed from: g */
    public static final C9693a f25974g;

    /* renamed from: h */
    public static final C9693a f25975h;

    /* renamed from: i */
    private final int[] f25976i;

    /* renamed from: j */
    private final int[] f25977j;

    /* renamed from: k */
    private final C9694b f25978k;

    /* renamed from: l */
    private final C9694b f25979l;

    /* renamed from: m */
    private final int f25980m;

    /* renamed from: n */
    private final int f25981n;

    /* renamed from: o */
    private final int f25982o;

    static {
        C9693a aVar = new C9693a(67, 64, 1);
        f25970c = aVar;
        C9693a aVar2 = new C9693a(301, 256, 1);
        f25973f = aVar2;
        f25974g = aVar2;
        f25975h = aVar;
    }

    public C9693a(int i, int i2, int i3) {
        this.f25981n = i;
        this.f25980m = i2;
        this.f25982o = i3;
        this.f25976i = new int[i2];
        this.f25977j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f25976i[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f25977j[this.f25976i[i6]] = i6;
        }
        this.f25978k = new C9694b(this, new int[]{0});
        this.f25979l = new C9694b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m32988a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9694b mo24303b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f25978k;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C9694b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24304c(int i) {
        return this.f25976i[i];
    }

    /* renamed from: d */
    public int mo24305d() {
        return this.f25982o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C9694b mo24306e() {
        return this.f25979l;
    }

    /* renamed from: f */
    public int mo24307f() {
        return this.f25980m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9694b mo24308g() {
        return this.f25978k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo24309h(int i) {
        if (i != 0) {
            return this.f25976i[(this.f25980m - this.f25977j[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo24310i(int i) {
        if (i != 0) {
            return this.f25977j[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo24311j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f25976i;
        int[] iArr2 = this.f25977j;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f25980m - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f25981n) + ',' + this.f25980m + ')';
    }
}
