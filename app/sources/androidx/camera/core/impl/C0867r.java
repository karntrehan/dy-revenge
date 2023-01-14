package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.r */
final class C0867r extends C0711a0 {

    /* renamed from: b */
    private final int f2528b;

    /* renamed from: c */
    private final int f2529c;

    /* renamed from: d */
    private final int f2530d;

    /* renamed from: e */
    private final int f2531e;

    /* renamed from: f */
    private final int f2532f;

    /* renamed from: g */
    private final int f2533g;

    /* renamed from: h */
    private final int f2534h;

    /* renamed from: i */
    private final int f2535i;

    /* renamed from: j */
    private final int f2536j;

    /* renamed from: k */
    private final int f2537k;

    /* renamed from: l */
    private final int f2538l;

    /* renamed from: m */
    private final int f2539m;

    C0867r(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f2528b = i;
        this.f2529c = i2;
        this.f2530d = i3;
        this.f2531e = i4;
        this.f2532f = i5;
        this.f2533g = i6;
        this.f2534h = i7;
        this.f2535i = i8;
        this.f2536j = i9;
        this.f2537k = i10;
        this.f2538l = i11;
        this.f2539m = i12;
    }

    /* renamed from: b */
    public int mo2797b() {
        return this.f2537k;
    }

    /* renamed from: c */
    public int mo2798c() {
        return this.f2539m;
    }

    /* renamed from: d */
    public int mo2799d() {
        return this.f2536j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0711a0)) {
            return false;
        }
        C0711a0 a0Var = (C0711a0) obj;
        return this.f2528b == a0Var.mo2802g() && this.f2529c == a0Var.mo2804i() && this.f2530d == a0Var.mo2803h() && this.f2531e == a0Var.mo2807l() && this.f2532f == a0Var.mo2806k() && this.f2533g == a0Var.mo2810o() && this.f2534h == a0Var.mo2811p() && this.f2535i == a0Var.mo2809n() && this.f2536j == a0Var.mo2799d() && this.f2537k == a0Var.mo2797b() && this.f2538l == a0Var.mo2801f() && this.f2539m == a0Var.mo2798c();
    }

    /* renamed from: f */
    public int mo2801f() {
        return this.f2538l;
    }

    /* renamed from: g */
    public int mo2802g() {
        return this.f2528b;
    }

    /* renamed from: h */
    public int mo2803h() {
        return this.f2530d;
    }

    public int hashCode() {
        return ((((((((((((((((((((((this.f2528b ^ 1000003) * 1000003) ^ this.f2529c) * 1000003) ^ this.f2530d) * 1000003) ^ this.f2531e) * 1000003) ^ this.f2532f) * 1000003) ^ this.f2533g) * 1000003) ^ this.f2534h) * 1000003) ^ this.f2535i) * 1000003) ^ this.f2536j) * 1000003) ^ this.f2537k) * 1000003) ^ this.f2538l) * 1000003) ^ this.f2539m;
    }

    /* renamed from: i */
    public int mo2804i() {
        return this.f2529c;
    }

    /* renamed from: k */
    public int mo2806k() {
        return this.f2532f;
    }

    /* renamed from: l */
    public int mo2807l() {
        return this.f2531e;
    }

    /* renamed from: n */
    public int mo2809n() {
        return this.f2535i;
    }

    /* renamed from: o */
    public int mo2810o() {
        return this.f2533g;
    }

    /* renamed from: p */
    public int mo2811p() {
        return this.f2534h;
    }

    public String toString() {
        return "CamcorderProfileProxy{duration=" + this.f2528b + ", quality=" + this.f2529c + ", fileFormat=" + this.f2530d + ", videoCodec=" + this.f2531e + ", videoBitRate=" + this.f2532f + ", videoFrameRate=" + this.f2533g + ", videoFrameWidth=" + this.f2534h + ", videoFrameHeight=" + this.f2535i + ", audioCodec=" + this.f2536j + ", audioBitRate=" + this.f2537k + ", audioSampleRate=" + this.f2538l + ", audioChannels=" + this.f2539m + "}";
    }
}
