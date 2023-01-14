package com.google.android.material.bottomappbar;

import p174e.p319f.p320a.p363d.p364a0.C8989f;
import p174e.p319f.p320a.p363d.p364a0.C9004m;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C4163a extends C8989f implements Cloneable {

    /* renamed from: f */
    private float f11605f;

    /* renamed from: o */
    private float f11606o;

    /* renamed from: p */
    private float f11607p;

    /* renamed from: q */
    private float f11608q;

    /* renamed from: r */
    private float f11609r;

    /* renamed from: c */
    public void mo12720c(float f, float f2, float f3, C9004m mVar) {
        float f4 = f;
        C9004m mVar2 = mVar;
        float f5 = this.f11607p;
        if (f5 == 0.0f) {
            mVar2.mo22894l(f4, 0.0f);
            return;
        }
        float f6 = ((this.f11606o * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f11605f;
        float f8 = f2 + this.f11609r;
        float f9 = (this.f11608q * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar2.mo22894l(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar2.mo22894l(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        mVar.mo22887a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.mo22887a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.mo22887a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        mVar2.mo22894l(f4, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo12721d() {
        return this.f11608q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo12722e() {
        return this.f11606o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo12723f() {
        return this.f11605f;
    }

    /* renamed from: g */
    public float mo12724g() {
        return this.f11607p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo12725i(float f) {
        this.f11608q = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo12726j(float f) {
        this.f11606o = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo12727k(float f) {
        this.f11605f = f;
    }

    /* renamed from: l */
    public void mo12728l(float f) {
        this.f11607p = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo12729m(float f) {
        this.f11609r = f;
    }
}
