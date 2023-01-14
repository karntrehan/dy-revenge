package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.n */
class C5047n extends C5017b0 {

    /* renamed from: W0 */
    private C5020c0 f14210W0;

    /* renamed from: X0 */
    private C5020c0 f14211X0;

    /* renamed from: Y0 */
    private C5020c0 f14212Y0;

    /* renamed from: Z0 */
    private C5020c0 f14213Z0;

    public C5047n(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = new Path();
        double N = mo15383N(this.f14210W0);
        double L = mo15381L(this.f14211X0);
        double N2 = mo15383N(this.f14212Y0);
        double L2 = mo15381L(this.f14213Z0);
        path.moveTo((float) N, (float) L);
        path.lineTo((float) N2, (float) L2);
        return path;
    }

    @C2991a(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.f14210W0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.f14212Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.f14211X0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.f14213Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
