package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2926c;
import com.facebook.react.uimanager.C3056x;
import com.facebook.react.uimanager.C3058y;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.view.C3245g;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.f0 */
public class C5028f0 extends C3245g implements C3056x, C3058y {

    /* renamed from: F */
    private Bitmap f14039F;

    /* renamed from: G */
    private Runnable f14040G = null;

    /* renamed from: H */
    private boolean f14041H = false;

    /* renamed from: I */
    private final Map<String, C5070x0> f14042I = new HashMap();

    /* renamed from: J */
    private final Map<String, C5070x0> f14043J = new HashMap();

    /* renamed from: K */
    private final Map<String, C5070x0> f14044K = new HashMap();

    /* renamed from: L */
    private final Map<String, C5070x0> f14045L = new HashMap();

    /* renamed from: M */
    private final Map<String, C5012a> f14046M = new HashMap();

    /* renamed from: N */
    private Canvas f14047N;

    /* renamed from: O */
    private final float f14048O = C2926c.m11504c().density;

    /* renamed from: P */
    private float f14049P;

    /* renamed from: Q */
    private float f14050Q;

    /* renamed from: R */
    private float f14051R;

    /* renamed from: S */
    private float f14052S;

    /* renamed from: T */
    private C5020c0 f14053T;

    /* renamed from: U */
    private C5020c0 f14054U;

    /* renamed from: V */
    private String f14055V;

    /* renamed from: W */
    private int f14056W;

    /* renamed from: a0 */
    final Matrix f14057a0 = new Matrix();

    /* renamed from: b0 */
    private boolean f14058b0 = true;

    /* renamed from: c0 */
    private boolean f14059c0 = false;

    /* renamed from: d0 */
    int f14060d0 = 0;

    /* renamed from: com.horcrux.svg.f0$a */
    static /* synthetic */ class C5029a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14061a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14061a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5028f0.C5029a.<clinit>():void");
        }
    }

    public C5028f0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: B */
    private void m18983B() {
        if (this.f14059c0) {
            this.f14059c0 = false;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C5070x0) {
                    ((C5070x0) childAt).mo15378C();
                }
            }
        }
    }

    /* renamed from: I */
    private Bitmap m18984I() {
        boolean z = true;
        this.f14059c0 = true;
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (!Float.isNaN(width) && !Float.isNaN(height) && width >= 1.0f && height >= 1.0f && Math.log10((double) width) + Math.log10((double) height) <= 42.0d) {
            z = false;
        }
        if (z) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        mo15224H(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: P */
    private int m18985P(float f, float f2) {
        if (!this.f14041H || !this.f14058b0) {
            return getId();
        }
        float[] fArr = {f, f2};
        this.f14057a0.mapPoints(fArr);
        int i = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof C5070x0) {
                i = ((C5070x0) childAt).mo15194J(fArr);
            } else if (childAt instanceof C5028f0) {
                i = ((C5028f0) childAt).m18985P(f, f2);
            }
            if (i != -1) {
                break;
            }
        }
        return i == -1 ? getId() : i;
    }

    private RectF getViewBox() {
        float f = this.f14049P;
        float f2 = this.f14048O;
        float f3 = this.f14050Q;
        return new RectF(f * f2, f3 * f2, (f + this.f14051R) * f2, (f3 + this.f14052S) * f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo15219C(C5012a aVar, String str) {
        this.f14046M.put(str, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo15220D(C5070x0 x0Var, String str) {
        this.f14042I.put(str, x0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo15221E(C5070x0 x0Var, String str) {
        this.f14044K.put(str, x0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15222F(C5070x0 x0Var, String str) {
        this.f14045L.put(str, x0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo15223G(C5070x0 x0Var, String str) {
        this.f14043J.put(str, x0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public synchronized void mo15224H(Canvas canvas) {
        this.f14059c0 = true;
        this.f14047N = canvas;
        Matrix matrix = new Matrix();
        if (this.f14055V != null) {
            RectF viewBox = getViewBox();
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            boolean z = getParent() instanceof C5070x0;
            if (z) {
                width = (float) C5065w.m19147a(this.f14053T, (double) width, 0.0d, (double) this.f14048O, 12.0d);
                height = (float) C5065w.m19147a(this.f14054U, (double) height, 0.0d, (double) this.f14048O, 12.0d);
            }
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            if (z) {
                canvas.clipRect(rectF);
            }
            matrix = C5067w0.m19150a(viewBox, rectF, this.f14055V, this.f14056W);
            this.f14058b0 = matrix.invert(this.f14057a0);
            canvas.concat(matrix);
        }
        Paint paint = new Paint();
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5070x0) {
                ((C5070x0) childAt).mo15218R();
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            if (childAt2 instanceof C5070x0) {
                C5070x0 x0Var = (C5070x0) childAt2;
                int Q = x0Var.mo15385Q(canvas, matrix);
                x0Var.mo15195O(canvas, paint, 1.0f);
                x0Var.mo15384P(canvas, Q);
                if (x0Var.mo15217K() && !this.f14041H) {
                    this.f14041H = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo15225J() {
        if (!this.f14041H) {
            this.f14041H = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C5012a mo15226K(String str) {
        return this.f14046M.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C5070x0 mo15227L(String str) {
        return this.f14042I.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C5070x0 mo15228M(String str) {
        return this.f14044K.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public C5070x0 mo15229N(String str) {
        return this.f14045L.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C5070x0 mo15230O(String str) {
        return this.f14043J.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo15231Q() {
        return this.f14041H;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo15232R() {
        return !this.f14059c0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public String mo15233S() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        m18983B();
        mo15224H(new Canvas(createBitmap));
        m18983B();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public String mo15234T(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        m18983B();
        mo15224H(new Canvas(createBitmap));
        m18983B();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* renamed from: c */
    public int mo9869c(float f, float f2) {
        return m18985P(f, f2);
    }

    /* renamed from: f */
    public boolean mo9871f(float f, float f2) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Rect getCanvasBounds() {
        return this.f14047N.getClipBounds();
    }

    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (!(parent instanceof C5070x0)) {
            Bitmap bitmap = this.f14039F;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f14039F = null;
        } else if (this.f14059c0) {
            this.f14059c0 = false;
            ((C5070x0) parent).getSvgView().invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!(getParent() instanceof C5070x0)) {
            super.onDraw(canvas);
            if (this.f14039F == null) {
                this.f14039F = m18984I();
            }
            Bitmap bitmap = this.f14039F;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                Runnable runnable = this.f14040G;
                if (runnable != null) {
                    runnable.run();
                    this.f14040G = null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidate();
    }

    @C2991a(name = "align")
    public void setAlign(String str) {
        this.f14055V = str;
        invalidate();
        m18983B();
    }

    @C2991a(name = "bbHeight")
    public void setBbHeight(Dynamic dynamic) {
        this.f14054U = C5020c0.m18971b(dynamic);
        invalidate();
        m18983B();
    }

    @C2991a(name = "bbWidth")
    public void setBbWidth(Dynamic dynamic) {
        this.f14053T = C5020c0.m18971b(dynamic);
        invalidate();
        m18983B();
    }

    public void setId(int i) {
        super.setId(i);
        SvgViewManager.setSvgView(i, this);
    }

    @C2991a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.f14056W = i;
        invalidate();
        m18983B();
    }

    @C2991a(name = "minX")
    public void setMinX(float f) {
        this.f14049P = f;
        invalidate();
        m18983B();
    }

    @C2991a(name = "minY")
    public void setMinY(float f) {
        this.f14050Q = f;
        invalidate();
        m18983B();
    }

    @C2991a(name = "tintColor")
    public void setTintColor(Dynamic dynamic) {
        int i = C5029a.f14061a[dynamic.getType().ordinal()];
        this.f14060d0 = i != 1 ? i != 2 ? 0 : dynamic.asInt() : ColorPropConverter.getColor(dynamic.asMap(), getContext()).intValue();
        invalidate();
        m18983B();
    }

    /* access modifiers changed from: package-private */
    public void setToDataUrlTask(Runnable runnable) {
        this.f14040G = runnable;
    }

    @C2991a(name = "vbHeight")
    public void setVbHeight(float f) {
        this.f14052S = f;
        invalidate();
        m18983B();
    }

    @C2991a(name = "vbWidth")
    public void setVbWidth(float f) {
        this.f14051R = f;
        invalidate();
        m18983B();
    }
}
