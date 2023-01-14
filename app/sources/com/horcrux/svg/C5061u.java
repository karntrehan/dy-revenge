package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.horcrux.svg.C5012a;
import p174e.p247e.p253d.p258e.C6071a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.u */
class C5061u extends C5042l {

    /* renamed from: Y0 */
    private static final float[] f14286Y0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: Z0 */
    private C5020c0 f14287Z0;

    /* renamed from: a1 */
    private C5020c0 f14288a1;

    /* renamed from: b1 */
    private C5020c0 f14289b1;

    /* renamed from: c1 */
    private C5020c0 f14290c1;

    /* renamed from: d1 */
    private C5012a.C5014b f14291d1;

    /* renamed from: e1 */
    private C5012a.C5014b f14292e1;

    /* renamed from: f1 */
    private float f14293f1;

    /* renamed from: g1 */
    private float f14294g1;

    /* renamed from: h1 */
    private float f14295h1;

    /* renamed from: i1 */
    private float f14296i1;

    /* renamed from: j1 */
    String f14297j1;

    /* renamed from: k1 */
    int f14298k1;

    /* renamed from: l1 */
    private Matrix f14299l1 = null;

    public C5061u(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        if (this.f14358f0 != null) {
            C5012a aVar = new C5012a(C5012a.C5013a.PATTERN, new C5020c0[]{this.f14287Z0, this.f14288a1, this.f14289b1, this.f14290c1}, this.f14291d1);
            aVar.mo15177d(this.f14292e1);
            aVar.mo15180g(this);
            Matrix matrix = this.f14299l1;
            if (matrix != null) {
                aVar.mo15179f(matrix);
            }
            C5028f0 svgView = getSvgView();
            C5012a.C5014b bVar = this.f14291d1;
            C5012a.C5014b bVar2 = C5012a.C5014b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f14292e1 == bVar2) {
                aVar.mo15181h(svgView.getCanvasBounds());
            }
            svgView.mo15219C(aVar, this.f14358f0);
        }
    }

    /* access modifiers changed from: package-private */
    public RectF getViewBox() {
        float f = this.f14293f1;
        float f2 = this.f14354b0;
        float f3 = this.f14294g1;
        return new RectF(f * f2, f3 * f2, (f + this.f14295h1) * f2, (f3 + this.f14296i1) * f2);
    }

    @C2991a(name = "align")
    public void setAlign(String str) {
        this.f14297j1 = str;
        invalidate();
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f14290c1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.f14298k1 = i;
        invalidate();
    }

    @C2991a(name = "minX")
    public void setMinX(float f) {
        this.f14293f1 = f;
        invalidate();
    }

    @C2991a(name = "minY")
    public void setMinY(float f) {
        this.f14294g1 = f;
        invalidate();
    }

    @C2991a(name = "patternContentUnits")
    public void setPatternContentUnits(int i) {
        C5012a.C5014b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = C5012a.C5014b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C5012a.C5014b.OBJECT_BOUNDING_BOX;
        this.f14292e1 = bVar;
        invalidate();
    }

    @C2991a(name = "patternTransform")
    public void setPatternTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f14286Y0;
            int c = C5065w.m19149c(readableArray, fArr, this.f14354b0);
            if (c == 6) {
                if (this.f14299l1 == null) {
                    this.f14299l1 = new Matrix();
                }
                this.f14299l1.setValues(fArr);
            } else if (c != -1) {
                C6071a.m22859G("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f14299l1 = null;
        }
        invalidate();
    }

    @C2991a(name = "patternUnits")
    public void setPatternUnits(int i) {
        C5012a.C5014b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = C5012a.C5014b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = C5012a.C5014b.OBJECT_BOUNDING_BOX;
        this.f14291d1 = bVar;
        invalidate();
    }

    @C2991a(name = "vbHeight")
    public void setVbHeight(float f) {
        this.f14296i1 = f;
        invalidate();
    }

    @C2991a(name = "vbWidth")
    public void setVbWidth(float f) {
        this.f14295h1 = f;
        invalidate();
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f14289b1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f14287Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f14288a1 = C5020c0.m18971b(dynamic);
        invalidate();
    }
}
