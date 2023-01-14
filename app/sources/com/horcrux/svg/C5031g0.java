package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.g0 */
class C5031g0 extends C5042l {

    /* renamed from: Y0 */
    private float f14066Y0;

    /* renamed from: Z0 */
    private float f14067Z0;

    /* renamed from: a1 */
    private float f14068a1;

    /* renamed from: b1 */
    private float f14069b1;

    /* renamed from: c1 */
    private String f14070c1;

    /* renamed from: d1 */
    private int f14071d1;

    public C5031g0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        mo15218R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo15253l0(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.f14070c1 != null) {
            float f4 = this.f14066Y0;
            float f5 = this.f14354b0;
            float f6 = this.f14067Z0;
            canvas.concat(C5067w0.m19150a(new RectF(f4 * f5, f6 * f5, (f4 + this.f14068a1) * f5, (f6 + this.f14069b1) * f5), new RectF(0.0f, 0.0f, f2, f3), this.f14070c1, this.f14071d1));
            super.mo15193F(canvas, paint, f);
        }
    }

    @C2991a(name = "align")
    public void setAlign(String str) {
        this.f14070c1 = str;
        invalidate();
    }

    @C2991a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.f14071d1 = i;
        invalidate();
    }

    @C2991a(name = "minX")
    public void setMinX(float f) {
        this.f14066Y0 = f;
        invalidate();
    }

    @C2991a(name = "minY")
    public void setMinY(float f) {
        this.f14067Z0 = f;
        invalidate();
    }

    @C2991a(name = "vbHeight")
    public void setVbHeight(float f) {
        this.f14069b1 = f;
        invalidate();
    }

    @C2991a(name = "vbWidth")
    public void setVbWidth(float f) {
        this.f14068a1 = f;
        invalidate();
    }
}
