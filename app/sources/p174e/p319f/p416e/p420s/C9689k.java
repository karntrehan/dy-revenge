package p174e.p319f.p416e.p420s;

/* renamed from: e.f.e.s.k */
public final class C9689k {

    /* renamed from: a */
    private final float f25950a;

    /* renamed from: b */
    private final float f25951b;

    /* renamed from: c */
    private final float f25952c;

    /* renamed from: d */
    private final float f25953d;

    /* renamed from: e */
    private final float f25954e;

    /* renamed from: f */
    private final float f25955f;

    /* renamed from: g */
    private final float f25956g;

    /* renamed from: h */
    private final float f25957h;

    /* renamed from: i */
    private final float f25958i;

    private C9689k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f25950a = f;
        this.f25951b = f4;
        this.f25952c = f7;
        this.f25953d = f2;
        this.f25954e = f5;
        this.f25955f = f8;
        this.f25956g = f3;
        this.f25957h = f6;
        this.f25958i = f9;
    }

    /* renamed from: b */
    public static C9689k m32973b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m32975d(f9, f10, f11, f12, f13, f14, f15, f16).mo24300e(m32974c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C9689k m32974c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m32975d(f, f2, f3, f4, f5, f6, f7, f8).mo24299a();
    }

    /* renamed from: d */
    public static C9689k m32975d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C9689k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C9689k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9689k mo24299a() {
        float f = this.f25954e;
        float f2 = this.f25958i;
        float f3 = this.f25955f;
        float f4 = this.f25957h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f25956g;
        float f7 = this.f25953d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f25952c;
        float f11 = this.f25951b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f25950a;
        return new C9689k(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C9689k mo24300e(C9689k kVar) {
        C9689k kVar2 = kVar;
        float f = this.f25950a;
        float f2 = kVar2.f25950a;
        float f3 = this.f25953d;
        float f4 = kVar2.f25951b;
        float f5 = this.f25956g;
        float f6 = kVar2.f25952c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = kVar2.f25953d;
        float f9 = kVar2.f25954e;
        float f10 = kVar2.f25955f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = kVar2.f25956g;
        float f13 = kVar2.f25957h;
        float f14 = kVar2.f25958i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f25951b;
        float f17 = f15;
        float f18 = this.f25954e;
        float f19 = f11;
        float f20 = this.f25957h;
        float f21 = (f16 * f2) + (f18 * f4) + (f20 * f6);
        float f22 = (f20 * f14) + (f16 * f12) + (f18 * f13);
        float f23 = this.f25952c;
        float f24 = this.f25955f;
        float f25 = (f2 * f23) + (f4 * f24);
        float f26 = this.f25958i;
        float f27 = (f23 * f12) + (f24 * f13) + (f26 * f14);
        return new C9689k(f7, f19, f17, f21, (f16 * f8) + (f18 * f9) + (f20 * f10), f22, (f6 * f26) + f25, (f8 * f23) + (f9 * f24) + (f10 * f26), f27);
    }

    /* renamed from: f */
    public void mo24301f(float[] fArr) {
        float[] fArr2 = fArr;
        int length = fArr2.length;
        float f = this.f25950a;
        float f2 = this.f25951b;
        float f3 = this.f25952c;
        float f4 = this.f25953d;
        float f5 = this.f25954e;
        float f6 = this.f25955f;
        float f7 = this.f25956g;
        float f8 = this.f25957h;
        float f9 = this.f25958i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
