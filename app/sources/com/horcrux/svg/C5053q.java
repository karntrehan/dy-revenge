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
/* renamed from: com.horcrux.svg.q */
class C5053q extends C5042l {

    /* renamed from: Y0 */
    private static final float[] f14250Y0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: Z0 */
    C5020c0 f14251Z0;

    /* renamed from: a1 */
    C5020c0 f14252a1;

    /* renamed from: b1 */
    C5020c0 f14253b1;

    /* renamed from: c1 */
    C5020c0 f14254c1;

    /* renamed from: d1 */
    private C5012a.C5014b f14255d1;

    /* renamed from: e1 */
    private C5012a.C5014b f14256e1;

    /* renamed from: f1 */
    private Matrix f14257f1 = null;

    public C5053q(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        if (this.f14358f0 != null) {
            getSvgView().mo15222F(this, this.f14358f0);
        }
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f14254c1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "maskContentUnits")
    public void setMaskContentUnits(int i) {
        C5012a.C5014b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = C5012a.C5014b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C5012a.C5014b.OBJECT_BOUNDING_BOX;
        this.f14256e1 = bVar;
        invalidate();
    }

    @C2991a(name = "maskTransform")
    public void setMaskTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f14250Y0;
            int c = C5065w.m19149c(readableArray, fArr, this.f14354b0);
            if (c == 6) {
                if (this.f14257f1 == null) {
                    this.f14257f1 = new Matrix();
                }
                this.f14257f1.setValues(fArr);
            } else if (c != -1) {
                C6071a.m22859G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f14257f1 = null;
        }
        invalidate();
    }

    @C2991a(name = "maskUnits")
    public void setMaskUnits(int i) {
        C5012a.C5014b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = C5012a.C5014b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C5012a.C5014b.OBJECT_BOUNDING_BOX;
        this.f14255d1 = bVar;
        invalidate();
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f14253b1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f14251Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f14252a1 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
