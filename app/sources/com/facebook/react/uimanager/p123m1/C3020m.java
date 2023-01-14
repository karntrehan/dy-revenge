package com.facebook.react.uimanager.p123m1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.react.uimanager.m1.m */
class C3020m extends Animation implements C3016j {

    /* renamed from: f */
    private final View f8381f;

    /* renamed from: o */
    private float f8382o;

    /* renamed from: p */
    private float f8383p;

    /* renamed from: q */
    private float f8384q;

    /* renamed from: r */
    private float f8385r;

    /* renamed from: s */
    private int f8386s;

    /* renamed from: t */
    private int f8387t;

    /* renamed from: u */
    private int f8388u;

    /* renamed from: v */
    private int f8389v;

    public C3020m(View view, int i, int i2, int i3, int i4) {
        this.f8381f = view;
        m11921d(i, i2, i3, i4);
    }

    /* renamed from: d */
    private void m11921d(int i, int i2, int i3, int i4) {
        this.f8382o = this.f8381f.getX() - this.f8381f.getTranslationX();
        this.f8383p = this.f8381f.getY() - this.f8381f.getTranslationY();
        this.f8386s = this.f8381f.getWidth();
        int height = this.f8381f.getHeight();
        this.f8387t = height;
        this.f8384q = ((float) i) - this.f8382o;
        this.f8385r = ((float) i2) - this.f8383p;
        this.f8388u = i3 - this.f8386s;
        this.f8389v = i4 - height;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f8382o + (this.f8384q * f);
        float f3 = this.f8383p + (this.f8385r * f);
        this.f8381f.layout(Math.round(f2), Math.round(f3), Math.round(f2 + ((float) this.f8386s) + (((float) this.f8388u) * f)), Math.round(f3 + ((float) this.f8387t) + (((float) this.f8389v) * f)));
    }

    /* renamed from: c */
    public void mo9757c(int i, int i2, int i3, int i4) {
        m11921d(i, i2, i3, i4);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
