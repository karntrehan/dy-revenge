package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.u0 */
class C5062u0 extends C5042l {

    /* renamed from: Y0 */
    C5020c0 f14300Y0 = null;

    /* renamed from: Z0 */
    C5020c0 f14301Z0 = null;

    /* renamed from: a1 */
    private String f14302a1 = null;

    /* renamed from: b1 */
    C5052p0 f14303b1 = C5052p0.spacing;

    /* renamed from: c1 */
    private C5039j0 f14304c1;

    /* renamed from: d1 */
    private ArrayList<C5020c0> f14305d1;

    /* renamed from: e1 */
    private ArrayList<C5020c0> f14306e1;

    /* renamed from: f1 */
    private ArrayList<C5020c0> f14307f1;

    /* renamed from: g1 */
    private ArrayList<C5020c0> f14308g1;

    /* renamed from: h1 */
    private ArrayList<C5020c0> f14309h1;

    /* renamed from: i1 */
    double f14310i1 = Double.NaN;

    public C5062u0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo15260B() {
        this.f14310i1 = Double.NaN;
        super.mo15260B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        mo15300k0(canvas);
        mo15379E(canvas, paint);
        mo15360n0(canvas, paint);
        mo15271i0();
        mo15264c0(canvas, paint, f);
        mo15270h0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = this.f14367o0;
        if (path != null) {
            return path;
        }
        mo15300k0(canvas);
        return mo15360n0(canvas, paint);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Path mo15298f0(Canvas canvas, Paint paint, Region.Op op) {
        return mo15183I(canvas, paint);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo15271i0() {
        mo15299g0().mo15293p(!(this instanceof C5037i0) && !(this instanceof C5034h0), this, this.f14178W0, this.f14305d1, this.f14306e1, this.f14308g1, this.f14309h1, this.f14307f1);
    }

    public void invalidate() {
        if (this.f14367o0 != null) {
            super.invalidate();
            mo15362q0().mo15378C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public C5039j0 mo15358l0() {
        C5039j0 j0Var;
        if (this.f14304c1 == null) {
            ViewParent parent = getParent();
            while (parent != null) {
                if (!(parent instanceof C5062u0) || (j0Var = ((C5062u0) parent).f14304c1) == null) {
                    parent = parent.getParent();
                } else {
                    this.f14304c1 = j0Var;
                    return j0Var;
                }
            }
        }
        if (this.f14304c1 == null) {
            this.f14304c1 = C5039j0.baseline;
        }
        return this.f14304c1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public String mo15359m0() {
        String str;
        if (this.f14302a1 == null) {
            ViewParent parent = getParent();
            while (parent != null) {
                if (!(parent instanceof C5062u0) || (str = ((C5062u0) parent).f14302a1) == null) {
                    parent = parent.getParent();
                } else {
                    this.f14302a1 = str;
                    return str;
                }
            }
        }
        return this.f14302a1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public Path mo15360n0(Canvas canvas, Paint paint) {
        Path path = this.f14367o0;
        if (path != null) {
            return path;
        }
        mo15271i0();
        this.f14367o0 = super.mo15183I(canvas, paint);
        mo15270h0();
        return this.f14367o0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public double mo15262o0(Paint paint) {
        if (!Double.isNaN(this.f14310i1)) {
            return this.f14310i1;
        }
        double d = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5062u0) {
                d += ((C5062u0) childAt).mo15262o0(paint);
            }
        }
        this.f14310i1 = d;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public C5062u0 mo15361p0() {
        ArrayList<C5032h> arrayList = mo15299g0().f14126a;
        ViewParent parent = getParent();
        int size = arrayList.size() - 1;
        C5062u0 u0Var = this;
        ViewParent viewParent = parent;
        while (size >= 0 && (viewParent instanceof C5062u0) && arrayList.get(size).f14082k != C5048n0.start && u0Var.f14305d1 == null) {
            u0Var = (C5062u0) viewParent;
            size--;
            viewParent = u0Var.getParent();
        }
        return u0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public C5062u0 mo15362q0() {
        C5062u0 u0Var = this;
        ViewParent viewParent = getParent();
        while (viewParent instanceof C5062u0) {
            u0Var = (C5062u0) viewParent;
            viewParent = u0Var.getParent();
        }
        return u0Var;
    }

    @C2991a(name = "baselineShift")
    public void setBaselineShift(Dynamic dynamic) {
        this.f14302a1 = C5020c0.m18972c(dynamic);
        invalidate();
    }

    @C2991a(name = "dx")
    public void setDeltaX(Dynamic dynamic) {
        this.f14308g1 = C5020c0.m18970a(dynamic);
        invalidate();
    }

    @C2991a(name = "dy")
    public void setDeltaY(Dynamic dynamic) {
        this.f14309h1 = C5020c0.m18970a(dynamic);
        invalidate();
    }

    @C2991a(name = "inlineSize")
    public void setInlineSize(Dynamic dynamic) {
        this.f14300Y0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "lengthAdjust")
    public void setLengthAdjust(String str) {
        this.f14303b1 = C5052p0.valueOf(str);
        invalidate();
    }

    @C2991a(name = "alignmentBaseline")
    public void setMethod(String str) {
        this.f14304c1 = C5039j0.m19058g(str);
        invalidate();
    }

    @C2991a(name = "x")
    public void setPositionX(Dynamic dynamic) {
        this.f14305d1 = C5020c0.m18970a(dynamic);
        invalidate();
    }

    @C2991a(name = "y")
    public void setPositionY(Dynamic dynamic) {
        this.f14306e1 = C5020c0.m18970a(dynamic);
        invalidate();
    }

    @C2991a(name = "rotate")
    public void setRotate(Dynamic dynamic) {
        this.f14307f1 = C5020c0.m18970a(dynamic);
        invalidate();
    }

    @C2991a(name = "textLength")
    public void setTextLength(Dynamic dynamic) {
        this.f14301Z0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "verticalAlign")
    public void setVerticalAlign(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f14304c1 = C5039j0.m19058g(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f14304c1 = C5039j0.baseline;
            }
            try {
                this.f14302a1 = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
            }
        } else {
            this.f14304c1 = C5039j0.baseline;
            this.f14302a1 = null;
        }
        invalidate();
    }
}
