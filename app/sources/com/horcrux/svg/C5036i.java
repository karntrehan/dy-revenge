package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.i */
class C5036i extends C5042l {

    /* renamed from: Y0 */
    C5020c0 f14099Y0;

    /* renamed from: Z0 */
    C5020c0 f14100Z0;

    /* renamed from: a1 */
    C5020c0 f14101a1;

    /* renamed from: b1 */
    C5020c0 f14102b1;

    /* renamed from: c1 */
    Bitmap f14103c1 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: d1 */
    Canvas f14104d1 = new Canvas(this.f14103c1);

    public C5036i(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        canvas.translate((float) mo15383N(this.f14099Y0), (float) mo15381L(this.f14100Z0));
        canvas.clipRect(0.0f, 0.0f, (float) mo15383N(this.f14101a1), (float) mo15381L(this.f14102b1));
        super.mo15193F(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo15264c0(Canvas canvas, Paint paint, float f) {
        mo15271i0();
        C5028f0 svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C5053q)) {
                if (childAt instanceof C5070x0) {
                    C5070x0 x0Var = (C5070x0) childAt;
                    if (!"none".equals(x0Var.f14357e0)) {
                        boolean z = x0Var instanceof C5017b0;
                        if (z) {
                            ((C5017b0) x0Var).mo15198V(this);
                        }
                        int Q = x0Var.mo15385Q(canvas, this.f14338I);
                        x0Var.mo15195O(canvas, paint, this.f14337H * f);
                        RectF clientRect = x0Var.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        x0Var.mo15384P(canvas, Q);
                        if (z) {
                            ((C5017b0) x0Var).mo15200X();
                        }
                        if (!x0Var.mo15217K()) {
                        }
                    }
                } else if (childAt instanceof C5028f0) {
                    C5028f0 f0Var = (C5028f0) childAt;
                    f0Var.mo15224H(canvas);
                    if (!f0Var.mo15231Q()) {
                    }
                } else {
                    childAt.draw(canvas);
                }
                svgView.mo15225J();
            }
        }
        setClientRect(rectF);
        mo15270h0();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f14104d1);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(this.f14104d1, view, j);
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f14102b1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f14101a1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f14099Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f14100Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
