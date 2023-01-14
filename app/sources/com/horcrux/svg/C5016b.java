package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.b */
class C5016b extends C5017b0 {

    /* renamed from: W0 */
    private C5020c0 f13993W0;

    /* renamed from: X0 */
    private C5020c0 f13994X0;

    /* renamed from: Y0 */
    private C5020c0 f13995Y0;

    public C5016b(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addCircle((float) mo15383N(this.f13993W0), (float) mo15381L(this.f13994X0), (float) mo15382M(this.f13995Y0), Path.Direction.CW);
        return path;
    }

    @C2991a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f13993W0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f13994X0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "r")
    public void setR(Dynamic dynamic) {
        this.f13995Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
