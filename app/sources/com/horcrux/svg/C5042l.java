package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.Objects;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.l */
class C5042l extends C5017b0 {

    /* renamed from: W0 */
    ReadableMap f14178W0;

    /* renamed from: X0 */
    private C5038j f14179X0;

    public C5042l(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: j0 */
    private static <T> T m19062j0(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        mo15300k0(canvas);
        mo15379E(canvas, paint);
        mo15264c0(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = this.f14367o0;
        if (path != null) {
            return path;
        }
        this.f14367o0 = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C5053q) && (childAt instanceof C5070x0)) {
                C5070x0 x0Var = (C5070x0) childAt;
                this.f14367o0.addPath(x0Var.mo15183I(canvas, paint), x0Var.f14339J);
            }
        }
        return this.f14367o0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo15194J(float[] fArr) {
        int c;
        C5070x0 x0Var;
        int J;
        if (this.f14344O && this.f14346Q) {
            float[] fArr2 = new float[2];
            this.f14342M.mapPoints(fArr2, fArr);
            this.f14343N.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.f14371s0 != clipPath) {
                    this.f14371s0 = clipPath;
                    RectF rectF = new RectF();
                    this.f14376x0 = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.f14333B0 = mo15196S(clipPath, this.f14376x0);
                }
                if (!this.f14333B0.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof C5070x0) {
                    if (!(childAt instanceof C5053q) && (J = x0Var.mo15194J(fArr2)) != -1) {
                        return ((x0Var = (C5070x0) childAt).mo15217K() || J != childAt.getId()) ? J : getId();
                    }
                } else if ((childAt instanceof C5028f0) && (c = ((C5028f0) childAt).mo9869c(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return c;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        if (this.f14358f0 != null) {
            getSvgView().mo15223G(this, this.f14358f0);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5070x0) {
                ((C5070x0) childAt).mo15218R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo15200X() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5017b0) {
                ((C5017b0) childAt).mo15200X();
            }
        }
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
                }
                svgView.mo15225J();
            }
        }
        setClientRect(rectF);
        mo15270h0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo15296d0(Canvas canvas, Paint paint, float f) {
        super.mo15193F(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public C5038j mo15297e0() {
        return this.f14179X0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Path mo15298f0(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            Path.Op valueOf = Path.Op.valueOf(op.name());
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof C5053q) && (childAt instanceof C5070x0)) {
                    C5070x0 x0Var = (C5070x0) childAt;
                    Matrix matrix = x0Var.f14339J;
                    Path f0 = x0Var instanceof C5042l ? ((C5042l) x0Var).mo15298f0(canvas, paint, op) : x0Var.mo15183I(canvas, paint);
                    f0.transform(matrix);
                    path.op(f0, valueOf);
                }
                i++;
            }
        } else {
            Region region = new Region(canvas.getClipBounds());
            Region region2 = new Region();
            while (i < getChildCount()) {
                View childAt2 = getChildAt(i);
                if (!(childAt2 instanceof C5053q) && (childAt2 instanceof C5070x0)) {
                    C5070x0 x0Var2 = (C5070x0) childAt2;
                    Matrix matrix2 = x0Var2.f14339J;
                    Path f02 = x0Var2 instanceof C5042l ? ((C5042l) x0Var2).mo15298f0(canvas, paint, op) : x0Var2.mo15183I(canvas, paint);
                    if (matrix2 != null) {
                        f02.transform(matrix2);
                    }
                    Region region3 = new Region();
                    region3.setPath(f02, region);
                    region2.op(region3, op);
                }
                i++;
            }
            path.addPath(region2.getBoundaryPath());
        }
        return path;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public C5038j mo15299g0() {
        return ((C5042l) m19062j0(getTextRoot())).mo15297e0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo15270h0() {
        mo15299g0().mo15291n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo15271i0() {
        mo15299g0().mo15292o(this, this.f14178W0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo15300k0(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.f14339J;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.f14340K;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f14179X0 = new C5038j(this.f14354b0, rectF.width(), rectF.height());
    }

    @C2991a(name = "font")
    public void setFont(ReadableMap readableMap) {
        this.f14178W0 = readableMap;
        invalidate();
    }
}
