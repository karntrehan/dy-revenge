package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.horcrux.svg.C5012a;
import p174e.p247e.p253d.p258e.C6071a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.o */
class C5049o extends C5023d {

    /* renamed from: E0 */
    private static final float[] f14218E0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: F0 */
    private C5020c0 f14219F0;

    /* renamed from: G0 */
    private C5020c0 f14220G0;

    /* renamed from: H0 */
    private C5020c0 f14221H0;

    /* renamed from: I0 */
    private C5020c0 f14222I0;

    /* renamed from: J0 */
    private ReadableArray f14223J0;

    /* renamed from: K0 */
    private C5012a.C5014b f14224K0;

    /* renamed from: L0 */
    private Matrix f14225L0 = null;

    public C5049o(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        if (this.f14358f0 != null) {
            C5012a aVar = new C5012a(C5012a.C5013a.LINEAR_GRADIENT, new C5020c0[]{this.f14219F0, this.f14220G0, this.f14221H0, this.f14222I0}, this.f14224K0);
            aVar.mo15178e(this.f14223J0);
            Matrix matrix = this.f14225L0;
            if (matrix != null) {
                aVar.mo15179f(matrix);
            }
            C5028f0 svgView = getSvgView();
            if (this.f14224K0 == C5012a.C5014b.USER_SPACE_ON_USE) {
                aVar.mo15181h(svgView.getCanvasBounds());
            }
            svgView.mo15219C(aVar, this.f14358f0);
        }
    }

    @C2991a(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.f14223J0 = readableArray;
        invalidate();
    }

    @C2991a(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f14218E0;
            int c = C5065w.m19149c(readableArray, fArr, this.f14354b0);
            if (c == 6) {
                if (this.f14225L0 == null) {
                    this.f14225L0 = new Matrix();
                }
                this.f14225L0.setValues(fArr);
            } else if (c != -1) {
                C6071a.m22859G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f14225L0 = null;
        }
        invalidate();
    }

    @C2991a(name = "gradientUnits")
    public void setGradientUnits(int i) {
        C5012a.C5014b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = C5012a.C5014b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C5012a.C5014b.OBJECT_BOUNDING_BOX;
        this.f14224K0 = bVar;
        invalidate();
    }

    @C2991a(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.f14219F0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.f14221H0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.f14220G0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.f14222I0 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
