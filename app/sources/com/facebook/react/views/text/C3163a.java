package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

@TargetApi(21)
/* renamed from: com.facebook.react.views.text.a */
public class C3163a extends MetricAffectingSpan implements C3189m {

    /* renamed from: f */
    private final float f8853f;

    public C3163a(float f) {
        this.f8853f = f;
    }

    /* renamed from: a */
    private void m12421a(TextPaint textPaint) {
        if (!Float.isNaN(this.f8853f)) {
            textPaint.setLetterSpacing(this.f8853f);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        m12421a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m12421a(textPaint);
    }
}
