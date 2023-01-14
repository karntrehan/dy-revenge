package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: com.facebook.react.views.text.b0 */
public class C3166b0 extends ReplacementSpan implements C3189m {

    /* renamed from: f */
    private int f8855f;

    /* renamed from: o */
    private int f8856o;

    /* renamed from: p */
    private int f8857p;

    public C3166b0(int i, int i2, int i3) {
        this.f8855f = i;
        this.f8856o = i2;
        this.f8857p = i3;
    }

    /* renamed from: a */
    public int mo10319a() {
        return this.f8857p;
    }

    /* renamed from: b */
    public int mo10320b() {
        return this.f8855f;
    }

    /* renamed from: c */
    public int mo10321c() {
        return this.f8856o;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.f8857p;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.f8856o;
    }
}
