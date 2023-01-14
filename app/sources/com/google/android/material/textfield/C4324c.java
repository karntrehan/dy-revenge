package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;

/* renamed from: com.google.android.material.textfield.c */
class C4324c extends C8990g {

    /* renamed from: J */
    private final Paint f12277J;

    /* renamed from: K */
    private final RectF f12278K;

    /* renamed from: L */
    private int f12279L;

    C4324c() {
        this((C8997k) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4324c(C8997k kVar) {
        super(kVar == null ? new C8997k() : kVar);
        this.f12277J = new Paint(1);
        m16610m0();
        this.f12278K = new RectF();
    }

    /* renamed from: g0 */
    private void m16607g0(Canvas canvas) {
        if (!m16611n0(getCallback())) {
            canvas.restoreToCount(this.f12279L);
        }
    }

    /* renamed from: h0 */
    private void m16608h0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m16611n0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m16609j0(canvas);
    }

    /* renamed from: j0 */
    private void m16609j0(Canvas canvas) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        }
        this.f12279L = i;
    }

    /* renamed from: m0 */
    private void m16610m0() {
        this.f12277J.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12277J.setColor(-1);
        this.f12277J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: n0 */
    private boolean m16611n0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        m16608h0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f12278K, this.f12277J);
        m16607g0(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public boolean mo13728f0() {
        return !this.f12278K.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo13729i0() {
        mo13730k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo13730k0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f12278K;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo13731l0(RectF rectF) {
        mo13730k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
