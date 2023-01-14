package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.facebook.react.views.text.c */
public class C3167c extends MetricAffectingSpan implements C3189m {

    /* renamed from: f */
    private final AssetManager f8858f;

    /* renamed from: o */
    private final int f8859o;

    /* renamed from: p */
    private final int f8860p;

    /* renamed from: q */
    private final String f8861q;

    /* renamed from: r */
    private final String f8862r;

    public C3167c(int i, int i2, String str, String str2, AssetManager assetManager) {
        this.f8859o = i;
        this.f8860p = i2;
        this.f8861q = str;
        this.f8862r = str2;
        this.f8858f = assetManager;
    }

    /* renamed from: a */
    private static void m12433a(Paint paint, int i, int i2, String str, String str2, AssetManager assetManager) {
        Typeface a = C3200u.m12520a(paint.getTypeface(), i, i2, str2, assetManager);
        paint.setFontFeatureSettings(str);
        paint.setTypeface(a);
        paint.setSubpixelText(true);
    }

    public void updateDrawState(TextPaint textPaint) {
        m12433a(textPaint, this.f8859o, this.f8860p, this.f8861q, this.f8862r, this.f8858f);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m12433a(textPaint, this.f8859o, this.f8860p, this.f8861q, this.f8862r, this.f8858f);
    }
}
