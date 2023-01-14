package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.p */
class C5051p extends C5042l {

    /* renamed from: Y0 */
    private C5020c0 f14234Y0;

    /* renamed from: Z0 */
    private C5020c0 f14235Z0;

    /* renamed from: a1 */
    private C5020c0 f14236a1;

    /* renamed from: b1 */
    private C5020c0 f14237b1;

    /* renamed from: c1 */
    private String f14238c1;

    /* renamed from: d1 */
    private String f14239d1;

    /* renamed from: e1 */
    private float f14240e1;

    /* renamed from: f1 */
    private float f14241f1;

    /* renamed from: g1 */
    private float f14242g1;

    /* renamed from: h1 */
    private float f14243h1;

    /* renamed from: i1 */
    String f14244i1;

    /* renamed from: j1 */
    int f14245j1;

    /* renamed from: k1 */
    Matrix f14246k1 = new Matrix();

    public C5051p(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        if (this.f14358f0 != null) {
            getSvgView().mo15221E(this, this.f14358f0);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C5070x0) {
                    ((C5070x0) childAt).mo15218R();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo15323l0(Canvas canvas, Paint paint, float f, C5068x xVar, float f2) {
        int Q = mo15385Q(canvas, this.f14338I);
        this.f14246k1.reset();
        C5063v vVar = xVar.f14327i;
        Matrix matrix = this.f14246k1;
        float f3 = this.f14354b0;
        matrix.setTranslate(((float) vVar.f14311a) * f3, ((float) vVar.f14312b) * f3);
        double parseDouble = "auto".equals(this.f14239d1) ? -1.0d : Double.parseDouble(this.f14239d1);
        if (parseDouble == -1.0d) {
            parseDouble = xVar.f14328j;
        }
        this.f14246k1.preRotate(((float) parseDouble) + 180.0f);
        if ("strokeWidth".equals(this.f14238c1)) {
            this.f14246k1.preScale(f2, f2);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (mo15383N(this.f14236a1) / ((double) this.f14354b0)), (float) (mo15381L(this.f14237b1) / ((double) this.f14354b0)));
        if (this.f14244i1 != null) {
            float f4 = this.f14240e1;
            float f5 = this.f14354b0;
            float f6 = this.f14241f1;
            Matrix a = C5067w0.m19150a(new RectF(f4 * f5, f6 * f5, (f4 + this.f14242g1) * f5, (f6 + this.f14243h1) * f5), rectF, this.f14244i1, this.f14245j1);
            float[] fArr = new float[9];
            a.getValues(fArr);
            this.f14246k1.preScale(fArr[0], fArr[4]);
        }
        this.f14246k1.preTranslate((float) (-mo15383N(this.f14234Y0)), (float) (-mo15381L(this.f14235Z0)));
        canvas.concat(this.f14246k1);
        mo15264c0(canvas, paint, f);
        mo15384P(canvas, Q);
    }

    @C2991a(name = "align")
    public void setAlign(String str) {
        this.f14244i1 = str;
        invalidate();
    }

    @C2991a(name = "markerHeight")
    public void setMarkerHeight(Dynamic dynamic) {
        this.f14237b1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "markerUnits")
    public void setMarkerUnits(String str) {
        this.f14238c1 = str;
        invalidate();
    }

    @C2991a(name = "markerWidth")
    public void setMarkerWidth(Dynamic dynamic) {
        this.f14236a1 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.f14245j1 = i;
        invalidate();
    }

    @C2991a(name = "minX")
    public void setMinX(float f) {
        this.f14240e1 = f;
        invalidate();
    }

    @C2991a(name = "minY")
    public void setMinY(float f) {
        this.f14241f1 = f;
        invalidate();
    }

    @C2991a(name = "orient")
    public void setOrient(String str) {
        this.f14239d1 = str;
        invalidate();
    }

    @C2991a(name = "refX")
    public void setRefX(Dynamic dynamic) {
        this.f14234Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "refY")
    public void setRefY(Dynamic dynamic) {
        this.f14235Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "vbHeight")
    public void setVbHeight(float f) {
        this.f14243h1 = f;
        invalidate();
    }

    @C2991a(name = "vbWidth")
    public void setVbWidth(float f) {
        this.f14242g1 = f;
        invalidate();
    }
}
