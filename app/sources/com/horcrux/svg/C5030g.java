package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.g */
class C5030g extends C5017b0 {

    /* renamed from: W0 */
    private C5020c0 f14062W0;

    /* renamed from: X0 */
    private C5020c0 f14063X0;

    /* renamed from: Y0 */
    private C5020c0 f14064Y0;

    /* renamed from: Z0 */
    private C5020c0 f14065Z0;

    public C5030g(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = new Path();
        double N = mo15383N(this.f14062W0);
        double L = mo15381L(this.f14063X0);
        double N2 = mo15383N(this.f14064Y0);
        double L2 = mo15381L(this.f14065Z0);
        path.addOval(new RectF((float) (N - N2), (float) (L - L2), (float) (N + N2), (float) (L + L2)), Path.Direction.CW);
        return path;
    }

    @C2991a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f14062W0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f14063X0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f14064Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f14065Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
