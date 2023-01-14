package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: com.facebook.react.views.text.x */
public class C3203x extends CharacterStyle implements C3189m {

    /* renamed from: f */
    private final float f8979f;

    /* renamed from: o */
    private final float f8980o;

    /* renamed from: p */
    private final float f8981p;

    /* renamed from: q */
    private final int f8982q;

    public C3203x(float f, float f2, float f3, int i) {
        this.f8979f = f;
        this.f8980o = f2;
        this.f8981p = f3;
        this.f8982q = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f8981p, this.f8979f, this.f8980o, this.f8982q);
    }
}
