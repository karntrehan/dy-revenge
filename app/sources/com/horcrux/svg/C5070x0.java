package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C2926c;
import com.facebook.react.uimanager.C3035q;
import com.facebook.react.uimanager.C3040s;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.view.C3245g;
import com.horcrux.svg.C5020c0;
import java.util.ArrayList;
import p174e.p247e.p253d.p258e.C6071a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.x0 */
public abstract class C5070x0 extends C3245g {

    /* renamed from: F */
    private static final float[] f14331F = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: A0 */
    Region f14332A0;

    /* renamed from: B0 */
    Region f14333B0;

    /* renamed from: C0 */
    ArrayList<C5055r> f14334C0;

    /* renamed from: D0 */
    C3040s f14335D0;

    /* renamed from: G */
    final ReactContext f14336G;

    /* renamed from: H */
    float f14337H = 1.0f;

    /* renamed from: I */
    Matrix f14338I = new Matrix();

    /* renamed from: J */
    Matrix f14339J = new Matrix();

    /* renamed from: K */
    Matrix f14340K = new Matrix();

    /* renamed from: L */
    Matrix f14341L = new Matrix();

    /* renamed from: M */
    Matrix f14342M = new Matrix();

    /* renamed from: N */
    final Matrix f14343N = new Matrix();

    /* renamed from: O */
    boolean f14344O = true;

    /* renamed from: P */
    boolean f14345P = true;

    /* renamed from: Q */
    boolean f14346Q = true;

    /* renamed from: R */
    private RectF f14347R;

    /* renamed from: S */
    int f14348S;

    /* renamed from: T */
    private String f14349T;

    /* renamed from: U */
    String f14350U;

    /* renamed from: V */
    String f14351V;

    /* renamed from: W */
    String f14352W;

    /* renamed from: a0 */
    String f14353a0;

    /* renamed from: b0 */
    final float f14354b0;

    /* renamed from: c0 */
    private boolean f14355c0;

    /* renamed from: d0 */
    private boolean f14356d0;

    /* renamed from: e0 */
    String f14357e0;

    /* renamed from: f0 */
    String f14358f0;

    /* renamed from: g0 */
    private C5028f0 f14359g0;

    /* renamed from: h0 */
    private Path f14360h0;

    /* renamed from: i0 */
    private C5042l f14361i0;

    /* renamed from: j0 */
    private double f14362j0 = -1.0d;

    /* renamed from: k0 */
    private double f14363k0 = -1.0d;

    /* renamed from: l0 */
    private float f14364l0 = -1.0f;

    /* renamed from: m0 */
    private float f14365m0 = -1.0f;

    /* renamed from: n0 */
    private C5038j f14366n0;

    /* renamed from: o0 */
    Path f14367o0;

    /* renamed from: p0 */
    Path f14368p0;

    /* renamed from: q0 */
    Path f14369q0;

    /* renamed from: r0 */
    Path f14370r0;

    /* renamed from: s0 */
    Path f14371s0;

    /* renamed from: t0 */
    RectF f14372t0;

    /* renamed from: u0 */
    RectF f14373u0;

    /* renamed from: v0 */
    RectF f14374v0;

    /* renamed from: w0 */
    RectF f14375w0;

    /* renamed from: x0 */
    RectF f14376x0;

    /* renamed from: y0 */
    Region f14377y0;

    /* renamed from: z0 */
    Region f14378z0;

    /* renamed from: com.horcrux.svg.x0$a */
    static /* synthetic */ class C5071a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.horcrux.svg.c0$b[] r0 = com.horcrux.svg.C5020c0.C5022b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14379a = r0
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.EMS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14379a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.EXS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14379a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.CM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14379a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.MM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14379a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14379a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.PT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14379a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.PC     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5070x0.C5071a.<clinit>():void");
        }
    }

    C5070x0(ReactContext reactContext) {
        super(reactContext);
        this.f14336G = reactContext;
        this.f14354b0 = C2926c.m11504c().density;
    }

    /* renamed from: D */
    private void m19162D() {
        C5070x0 x0Var = this;
        while (true) {
            ViewParent parent = x0Var.getParent();
            if (parent instanceof C5070x0) {
                x0Var = (C5070x0) parent;
                if (x0Var.f14367o0 != null) {
                    x0Var.mo15260B();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: G */
    private double m19163G(C5020c0 c0Var) {
        double d;
        switch (C5071a.f14379a[c0Var.f14016b.ordinal()]) {
            case 1:
                d = getFontSizeFromContext();
                break;
            case 2:
                d = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                d = 35.43307d;
                break;
            case 4:
                d = 3.543307d;
                break;
            case 5:
                d = 90.0d;
                break;
            case 6:
                d = 1.25d;
                break;
            case 7:
                d = 15.0d;
                break;
            default:
                d = 1.0d;
                break;
        }
        return c0Var.f14015a * d * ((double) this.f14354b0);
    }

    private double getCanvasDiagonal() {
        double d = this.f14363k0;
        if (d != -1.0d) {
            return d;
        }
        double sqrt = Math.sqrt(Math.pow((double) getCanvasWidth(), 2.0d) + Math.pow((double) getCanvasHeight(), 2.0d)) * 0.7071067811865476d;
        this.f14363k0 = sqrt;
        return sqrt;
    }

    private float getCanvasHeight() {
        float f = this.f14364l0;
        if (f != -1.0f) {
            return f;
        }
        C5042l textRoot = getTextRoot();
        this.f14364l0 = textRoot == null ? (float) getSvgView().getCanvasBounds().height() : textRoot.mo15297e0().mo15284d();
        return this.f14364l0;
    }

    private float getCanvasWidth() {
        float f = this.f14365m0;
        if (f != -1.0f) {
            return f;
        }
        C5042l textRoot = getTextRoot();
        this.f14365m0 = textRoot == null ? (float) getSvgView().getCanvasBounds().width() : textRoot.mo15297e0().mo15285g();
        return this.f14365m0;
    }

    private double getFontSizeFromContext() {
        double d = this.f14362j0;
        if (d != -1.0d) {
            return d;
        }
        C5042l textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.f14366n0 == null) {
            this.f14366n0 = textRoot.mo15297e0();
        }
        double c = this.f14366n0.mo15283c();
        this.f14362j0 = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo15260B() {
        this.f14363k0 = -1.0d;
        this.f14364l0 = -1.0f;
        this.f14365m0 = -1.0f;
        this.f14362j0 = -1.0d;
        this.f14332A0 = null;
        this.f14378z0 = null;
        this.f14377y0 = null;
        this.f14367o0 = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo15378C() {
        mo15260B();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5070x0) {
                ((C5070x0) childAt).mo15378C();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo15379E(Canvas canvas, Paint paint) {
        Path H = mo15380H(canvas, paint);
        if (H != null) {
            canvas.clipPath(H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo15193F(Canvas canvas, Paint paint, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public Path mo15380H(Canvas canvas, Paint paint) {
        if (this.f14349T != null) {
            C5019c cVar = (C5019c) getSvgView().mo15227L(this.f14349T);
            if (cVar != null) {
                Path I = this.f14348S == 0 ? cVar.mo15183I(canvas, paint) : cVar.mo15298f0(canvas, paint, Region.Op.UNION);
                I.transform(cVar.f14339J);
                I.transform(cVar.f14340K);
                int i = this.f14348S;
                if (i == 0) {
                    I.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    C6071a.m22859G("ReactNative", "RNSVG: clipRule: " + this.f14348S + " unrecognized");
                }
                this.f14360h0 = I;
            } else {
                C6071a.m22859G("ReactNative", "RNSVG: Undefined clipPath: " + this.f14349T);
            }
        }
        return getClipPath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract Path mo15183I(Canvas canvas, Paint paint);

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract int mo15194J(float[] fArr);

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo15217K() {
        return this.f14355c0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public double mo15381L(C5020c0 c0Var) {
        double d;
        float canvasHeight;
        C5020c0.C5022b bVar = c0Var.f14016b;
        if (bVar == C5020c0.C5022b.NUMBER) {
            d = c0Var.f14015a;
            canvasHeight = this.f14354b0;
        } else if (bVar != C5020c0.C5022b.PERCENTAGE) {
            return m19163G(c0Var);
        } else {
            d = c0Var.f14015a / 100.0d;
            canvasHeight = getCanvasHeight();
        }
        return d * ((double) canvasHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public double mo15382M(C5020c0 c0Var) {
        double d;
        double canvasDiagonal;
        C5020c0.C5022b bVar = c0Var.f14016b;
        if (bVar == C5020c0.C5022b.NUMBER) {
            d = c0Var.f14015a;
            canvasDiagonal = (double) this.f14354b0;
        } else if (bVar != C5020c0.C5022b.PERCENTAGE) {
            return m19163G(c0Var);
        } else {
            d = c0Var.f14015a / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        }
        return d * canvasDiagonal;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public double mo15383N(C5020c0 c0Var) {
        double d;
        float canvasWidth;
        C5020c0.C5022b bVar = c0Var.f14016b;
        if (bVar == C5020c0.C5022b.NUMBER) {
            d = c0Var.f14015a;
            canvasWidth = this.f14354b0;
        } else if (bVar != C5020c0.C5022b.PERCENTAGE) {
            return m19163G(c0Var);
        } else {
            d = c0Var.f14015a / 100.0d;
            canvasWidth = getCanvasWidth();
        }
        return d * ((double) canvasWidth);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo15195O(Canvas canvas, Paint paint, float f) {
        mo15193F(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo15384P(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public int mo15385Q(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.f14338I.setConcat(this.f14339J, this.f14340K);
        canvas.concat(this.f14338I);
        this.f14338I.preConcat(matrix);
        this.f14345P = this.f14338I.invert(this.f14341L);
        return save;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        if (this.f14358f0 != null) {
            getSvgView().mo15223G(this, this.f14358f0);
        }
    }

    /* access modifiers changed from: package-private */
    public RectF getClientRect() {
        return this.f14347R;
    }

    /* access modifiers changed from: package-private */
    public Path getClipPath() {
        return this.f14360h0;
    }

    /* access modifiers changed from: package-private */
    public C5042l getParentTextRoot() {
        ViewParent parent = getParent();
        if (!(parent instanceof C5070x0)) {
            return null;
        }
        return ((C5070x0) parent).getTextRoot();
    }

    /* access modifiers changed from: package-private */
    public C5028f0 getSvgView() {
        C5028f0 svgView;
        C5028f0 f0Var = this.f14359g0;
        if (f0Var != null) {
            return f0Var;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof C5028f0) {
            svgView = (C5028f0) parent;
        } else if (parent instanceof C5070x0) {
            svgView = ((C5070x0) parent).getSvgView();
        } else {
            C6071a.m22875i("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
            return this.f14359g0;
        }
        this.f14359g0 = svgView;
        return this.f14359g0;
    }

    /* access modifiers changed from: package-private */
    public C5042l getTextRoot() {
        if (this.f14361i0 == null) {
            C5070x0 x0Var = this;
            while (true) {
                if (x0Var == null) {
                    break;
                }
                if (x0Var instanceof C5042l) {
                    C5042l lVar = (C5042l) x0Var;
                    if (lVar.mo15297e0() != null) {
                        this.f14361i0 = lVar;
                        break;
                    }
                }
                ViewParent parent = x0Var.getParent();
                x0Var = !(parent instanceof C5070x0) ? null : (C5070x0) parent;
            }
        }
        return this.f14361i0;
    }

    public void invalidate() {
        if (!(this instanceof C5017b0) || this.f14367o0 != null) {
            mo15260B();
            m19162D();
            super.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.f14347R;
        if (rectF != null) {
            if (!(this instanceof C5042l)) {
                setLeft((int) Math.floor((double) rectF.left));
                setTop((int) Math.floor((double) this.f14347R.top));
                setRight((int) Math.ceil((double) this.f14347R.right));
                setBottom((int) Math.ceil((double) this.f14347R.bottom));
            }
            setMeasuredDimension((int) Math.ceil((double) this.f14347R.width()), (int) Math.ceil((double) this.f14347R.height()));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        RectF rectF = this.f14347R;
        int ceil = rectF != null ? (int) Math.ceil((double) rectF.width()) : ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i);
        RectF rectF2 = this.f14347R;
        setMeasuredDimension(ceil, rectF2 != null ? (int) Math.ceil((double) rectF2.height()) : ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.f14347R;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.f14347R = rectF;
            if (rectF != null) {
                int ceil = (int) Math.ceil((double) rectF.width());
                int ceil2 = (int) Math.ceil((double) this.f14347R.height());
                int floor = (int) Math.floor((double) this.f14347R.left);
                int floor2 = (int) Math.floor((double) this.f14347R.top);
                int ceil3 = (int) Math.ceil((double) this.f14347R.right);
                int ceil4 = (int) Math.ceil((double) this.f14347R.bottom);
                setMeasuredDimension(ceil, ceil2);
                if (!(this instanceof C5042l)) {
                    setLeft(floor);
                    setTop(floor2);
                    setRight(ceil3);
                    setBottom(ceil4);
                }
                if (this.f14356d0) {
                    ((UIManagerModule) this.f14336G.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C3035q.m11995v(getId(), floor, floor2, ceil, ceil2));
                }
            }
        }
    }

    @C2991a(name = "clipPath")
    public void setClipPath(String str) {
        this.f14360h0 = null;
        this.f14349T = str;
        invalidate();
    }

    @C2991a(defaultInt = 1, name = "clipRule")
    public void setClipRule(int i) {
        this.f14348S = i;
        invalidate();
    }

    @C2991a(name = "display")
    public void setDisplay(String str) {
        this.f14357e0 = str;
        invalidate();
    }

    @C2991a(name = "markerEnd")
    public void setMarkerEnd(String str) {
        this.f14353a0 = str;
        invalidate();
    }

    @C2991a(name = "markerMid")
    public void setMarkerMid(String str) {
        this.f14352W = str;
        invalidate();
    }

    @C2991a(name = "markerStart")
    public void setMarkerStart(String str) {
        this.f14351V = str;
        invalidate();
    }

    @C2991a(name = "mask")
    public void setMask(String str) {
        this.f14350U = str;
        invalidate();
    }

    @C2991a(name = "matrix")
    public void setMatrix(Dynamic dynamic) {
        boolean z;
        ReadableType type = dynamic.getType();
        if (dynamic.isNull() || !type.equals(ReadableType.Array)) {
            this.f14339J.reset();
            this.f14342M.reset();
            z = true;
        } else {
            ReadableArray asArray = dynamic.asArray();
            float[] fArr = f14331F;
            int c = C5065w.m19149c(asArray, fArr, this.f14354b0);
            if (c == 6) {
                if (this.f14339J == null) {
                    this.f14339J = new Matrix();
                    this.f14342M = new Matrix();
                }
                this.f14339J.setValues(fArr);
                z = this.f14339J.invert(this.f14342M);
            } else {
                if (c != -1) {
                    C6071a.m22859G("ReactNative", "RNSVG: Transform matrices must be of size 6");
                }
                super.invalidate();
                m19162D();
            }
        }
        this.f14344O = z;
        super.invalidate();
        m19162D();
    }

    @C2991a(name = "name")
    public void setName(String str) {
        this.f14358f0 = str;
        invalidate();
    }

    @C2991a(name = "onLayout")
    public void setOnLayout(boolean z) {
        this.f14356d0 = z;
        invalidate();
    }

    @C2991a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.f14337H = f;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setPointerEvents(C3040s sVar) {
        this.f14335D0 = sVar;
    }

    @C2991a(name = "responsible")
    public void setResponsible(boolean z) {
        this.f14355c0 = z;
        invalidate();
    }
}
