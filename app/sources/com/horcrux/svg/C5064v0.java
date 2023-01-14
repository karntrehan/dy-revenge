package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;
import p174e.p247e.p253d.p258e.C6071a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.v0 */
class C5064v0 extends C5017b0 {

    /* renamed from: W0 */
    private String f14313W0;

    /* renamed from: X0 */
    private C5020c0 f14314X0;

    /* renamed from: Y0 */
    private C5020c0 f14315Y0;

    /* renamed from: Z0 */
    private C5020c0 f14316Z0;

    /* renamed from: a1 */
    private C5020c0 f14317a1;

    public C5064v0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        C5070x0 O = getSvgView().mo15230O(this.f14313W0);
        if (O == null) {
            C6071a.m22859G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f14313W0 + " is not defined.");
            return;
        }
        O.mo15260B();
        canvas.translate((float) mo15383N(this.f14314X0), (float) mo15381L(this.f14315Y0));
        boolean z = O instanceof C5017b0;
        if (z) {
            ((C5017b0) O).mo15198V(this);
        }
        int Q = O.mo15385Q(canvas, this.f14338I);
        mo15379E(canvas, paint);
        if (O instanceof C5031g0) {
            ((C5031g0) O).mo15253l0(canvas, paint, f, (float) mo15383N(this.f14316Z0), (float) mo15381L(this.f14317a1));
        } else {
            O.mo15193F(canvas, paint, f * this.f14337H);
        }
        setClientRect(O.getClientRect());
        O.mo15384P(canvas, Q);
        if (z) {
            ((C5017b0) O).mo15200X();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        C5070x0 O = getSvgView().mo15230O(this.f14313W0);
        if (O == null) {
            C6071a.m22859G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f14313W0 + " is not defined.");
            return null;
        }
        Path I = O.mo15183I(canvas, paint);
        Path path = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) mo15383N(this.f14314X0), (float) mo15381L(this.f14315Y0));
        I.transform(matrix, path);
        return path;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo15194J(float[] fArr) {
        if (this.f14344O && this.f14346Q) {
            float[] fArr2 = new float[2];
            this.f14342M.mapPoints(fArr2, fArr);
            this.f14343N.mapPoints(fArr2);
            C5070x0 O = getSvgView().mo15230O(this.f14313W0);
            if (O == null) {
                C6071a.m22859G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f14313W0 + " is not defined.");
                return -1;
            }
            int J = O.mo15194J(fArr2);
            if (J != -1) {
                return (O.mo15217K() || J != O.getId()) ? J : getId();
            }
        }
        return -1;
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f14317a1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "href")
    public void setHref(String str) {
        this.f14313W0 = str;
        invalidate();
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f14316Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f14314X0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f14315Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
