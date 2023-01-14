package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.p113d0.C2707b;
import com.facebook.react.p113d0.C2708c;
import com.facebook.react.p113d0.C2709d;
import com.facebook.react.p126z.C3257a;
import com.facebook.react.uimanager.C2919a0;
import com.facebook.react.uimanager.C2924b1;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C2982h0;
import com.facebook.react.uimanager.C2990j0;
import com.facebook.react.uimanager.C2995k0;
import com.facebook.react.uimanager.C2997l;
import com.facebook.react.uimanager.C3040s;
import com.facebook.react.uimanager.C3052v;
import com.facebook.react.uimanager.C3054w;
import com.facebook.react.uimanager.C3060z;
import com.facebook.react.uimanager.p121k1.C2996a;
import com.facebook.react.views.view.C3240e;
import com.facebook.yoga.C3307g;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

@TargetApi(21)
/* renamed from: com.facebook.react.views.view.g */
public class C3245g extends ViewGroup implements C2709d, C3052v, C2919a0, C2708c, C2982h0, C3060z {

    /* renamed from: f */
    private static final ViewGroup.LayoutParams f9168f = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: o */
    private static final Rect f9169o = new Rect();

    /* renamed from: A */
    private C2924b1 f9170A = null;

    /* renamed from: B */
    private Path f9171B;

    /* renamed from: C */
    private int f9172C;

    /* renamed from: D */
    private float f9173D = 1.0f;

    /* renamed from: E */
    private String f9174E = "visible";

    /* renamed from: p */
    private boolean f9175p = false;

    /* renamed from: q */
    private View[] f9176q = null;

    /* renamed from: r */
    private int f9177r;

    /* renamed from: s */
    private Rect f9178s;

    /* renamed from: t */
    private Rect f9179t;

    /* renamed from: u */
    private String f9180u;

    /* renamed from: v */
    private C3040s f9181v = C3040s.AUTO;

    /* renamed from: w */
    private C3247b f9182w;

    /* renamed from: x */
    private C3240e f9183x;

    /* renamed from: y */
    private C2707b f9184y;

    /* renamed from: z */
    private boolean f9185z = false;

    /* renamed from: com.facebook.react.views.view.g$a */
    class C3246a implements Runnable {
    }

    /* renamed from: com.facebook.react.views.view.g$b */
    private static final class C3247b implements View.OnLayoutChangeListener {

        /* renamed from: f */
        private final C3245g f9186f;

        private C3247b(C3245g gVar) {
            this.f9186f = gVar;
        }

        /* synthetic */ C3247b(C3245g gVar, C3246a aVar) {
            this(gVar);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f9186f.getRemoveClippedSubviews()) {
                this.f9186f.m12708A(view);
            }
        }
    }

    public C3245g(Context context) {
        super(context);
        setClipChildren(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m12708A(View view) {
        if (this.f9175p && getParent() != null) {
            C6409a.m24521c(this.f9178s);
            C6409a.m24521c(this.f9176q);
            Rect rect = f9169o;
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (this.f9178s.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < this.f9177r; i2++) {
                    View[] viewArr = this.f9176q;
                    if (viewArr[i2] == view) {
                        m12717z(this.f9178s, i2, i);
                        return;
                    }
                    if (viewArr[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    private C2924b1 getDrawingOrderHelper() {
        if (this.f9170A == null) {
            this.f9170A = new C2924b1(this);
        }
        return this.f9170A;
    }

    private C3240e getOrCreateReactViewBackground() {
        if (this.f9183x == null) {
            this.f9183x = new C3240e(getContext());
            Drawable background = getBackground();
            m12715x((Drawable) null);
            if (background == null) {
                m12715x(this.f9183x);
            } else {
                m12715x(new LayerDrawable(new Drawable[]{this.f9183x, background}));
            }
            boolean g = C2822a.m11246d().mo9192g(getContext());
            this.f9172C = g ? 1 : 0;
            this.f9183x.mo10621A(g);
        }
        return this.f9183x;
    }

    /* renamed from: j */
    private void m12710j(View view, int i) {
        View[] viewArr = (View[]) C6409a.m24521c(this.f9176q);
        int i2 = this.f9177r;
        int length = viewArr.length;
        if (i == i2) {
            if (length == i2) {
                View[] viewArr2 = new View[(length + 12)];
                this.f9176q = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.f9176q;
            }
            int i3 = this.f9177r;
            this.f9177r = i3 + 1;
            viewArr[i3] = view;
        } else if (i < i2) {
            if (length == i2) {
                View[] viewArr3 = new View[(length + 12)];
                this.f9176q = viewArr3;
                System.arraycopy(viewArr, 0, viewArr3, 0, i);
                System.arraycopy(viewArr, i, this.f9176q, i + 1, i2 - i);
                viewArr = this.f9176q;
            } else {
                System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
            }
            viewArr[i] = view;
            this.f9177r++;
        } else {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        }
    }

    /* renamed from: m */
    private boolean m12711m() {
        return getId() != -1 && C2996a.m11878a(getId()) == 2;
    }

    /* renamed from: n */
    private void m12712n(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        Canvas canvas2 = canvas;
        String str = this.f9180u;
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1217487446:
                    if (str.equals("hidden")) {
                        c = 0;
                        break;
                    }
                    break;
                case -907680051:
                    if (str.equals("scroll")) {
                        c = 1;
                        break;
                    }
                    break;
                case 466743410:
                    if (str.equals("visible")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    float width = (float) getWidth();
                    float height = (float) getHeight();
                    C3240e eVar = this.f9183x;
                    if (eVar != null) {
                        RectF k = eVar.mo10630k();
                        float f7 = k.top;
                        if (f7 > 0.0f || k.left > 0.0f || k.bottom > 0.0f || k.right > 0.0f) {
                            f3 = k.left + 0.0f;
                            f = f7 + 0.0f;
                            width -= k.right;
                            height -= k.bottom;
                        } else {
                            f = 0.0f;
                            f3 = 0.0f;
                        }
                        float m = this.f9183x.mo10631m();
                        float h = this.f9183x.mo10627h(m, C3240e.C3242b.TOP_LEFT);
                        float h2 = this.f9183x.mo10627h(m, C3240e.C3242b.TOP_RIGHT);
                        float h3 = this.f9183x.mo10627h(m, C3240e.C3242b.BOTTOM_LEFT);
                        float h4 = this.f9183x.mo10627h(m, C3240e.C3242b.BOTTOM_RIGHT);
                        boolean z2 = this.f9172C == 1;
                        float g = this.f9183x.mo10623g(C3240e.C3242b.TOP_START);
                        float g2 = this.f9183x.mo10623g(C3240e.C3242b.TOP_END);
                        float g3 = this.f9183x.mo10623g(C3240e.C3242b.BOTTOM_START);
                        float f8 = h4;
                        float g4 = this.f9183x.mo10623g(C3240e.C3242b.BOTTOM_END);
                        float f9 = h;
                        if (C2822a.m11246d().mo9190b(getContext())) {
                            f4 = C3307g.m12971a(g) ? f9 : g;
                            if (!C3307g.m12971a(g2)) {
                                h2 = g2;
                            }
                            if (!C3307g.m12971a(g3)) {
                                h3 = g3;
                            }
                            if (C3307g.m12971a(g4)) {
                                g4 = f8;
                            }
                            f6 = z2 ? h2 : f4;
                            if (!z2) {
                                f4 = h2;
                            }
                            f5 = z2 ? g4 : h3;
                            if (z2) {
                                g4 = h3;
                            }
                        } else {
                            float f10 = z2 ? g2 : g;
                            if (!z2) {
                                g = g2;
                            }
                            float f11 = z2 ? g4 : g3;
                            if (!z2) {
                                g3 = g4;
                            }
                            if (C3307g.m12971a(f10)) {
                                f10 = f9;
                            }
                            if (!C3307g.m12971a(g)) {
                                h2 = g;
                            }
                            if (!C3307g.m12971a(f11)) {
                                h3 = f11;
                            }
                            if (!C3307g.m12971a(g3)) {
                                g4 = g3;
                                f6 = f10;
                                f4 = h2;
                                f5 = h3;
                            } else {
                                f6 = f10;
                                f4 = h2;
                                f5 = h3;
                                g4 = f8;
                            }
                        }
                        if (f6 > 0.0f || f4 > 0.0f || g4 > 0.0f || f5 > 0.0f) {
                            if (this.f9171B == null) {
                                this.f9171B = new Path();
                            }
                            this.f9171B.rewind();
                            this.f9171B.addRoundRect(new RectF(f3, f, width, height), new float[]{Math.max(f6 - k.left, 0.0f), Math.max(f6 - k.top, 0.0f), Math.max(f4 - k.right, 0.0f), Math.max(f4 - k.top, 0.0f), Math.max(g4 - k.right, 0.0f), Math.max(g4 - k.bottom, 0.0f), Math.max(f5 - k.left, 0.0f), Math.max(f5 - k.bottom, 0.0f)}, Path.Direction.CW);
                            canvas2.clipPath(this.f9171B);
                            f2 = f3;
                            z = true;
                        } else {
                            f2 = f3;
                            z = false;
                        }
                    } else {
                        z = false;
                        f2 = 0.0f;
                        f = 0.0f;
                    }
                    if (!z) {
                        canvas2.clipRect(new RectF(f2, f, width, height));
                        return;
                    }
                    return;
                case 2:
                    Path path = this.f9171B;
                    if (path != null) {
                        path.rewind();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: p */
    private int m12713p(View view) {
        int i = this.f9177r;
        View[] viewArr = (View[]) C6409a.m24521c(this.f9176q);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    private void m12714r(int i) {
        View[] viewArr = (View[]) C6409a.m24521c(this.f9176q);
        int i2 = this.f9177r;
        if (i == i2 - 1) {
            int i3 = i2 - 1;
            this.f9177r = i3;
            viewArr[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            int i4 = this.f9177r - 1;
            this.f9177r = i4;
            viewArr[i4] = null;
        }
    }

    /* renamed from: x */
    private void m12715x(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* renamed from: y */
    private void m12716y(Rect rect) {
        C6409a.m24521c(this.f9176q);
        int i = 0;
        for (int i2 = 0; i2 < this.f9177r; i2++) {
            m12717z(rect, i2, i);
            if (this.f9176q[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r7 != false) goto L_0x0062;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12717z(android.graphics.Rect r7, int r8, int r9) {
        /*
            r6 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            android.view.View[] r0 = r6.f9176q
            java.lang.Object r0 = p174e.p247e.p315l.p316a.C6409a.m24521c(r0)
            android.view.View[] r0 = (android.view.View[]) r0
            r0 = r0[r8]
            android.graphics.Rect r1 = f9169o
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            r1.set(r2, r3, r4, r5)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            boolean r7 = r7.intersects(r2, r3, r4, r1)
            android.view.animation.Animation r1 = r0.getAnimation()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.hasEnded()
            if (r1 != 0) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r7 != 0) goto L_0x004e
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L_0x004e
            if (r1 != 0) goto L_0x004e
            int r8 = r8 - r9
            super.removeViewsInLayout(r8, r3)
            goto L_0x0062
        L_0x004e:
            if (r7 == 0) goto L_0x0060
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0060
            int r8 = r8 - r9
            android.view.ViewGroup$LayoutParams r7 = f9168f
            super.addViewInLayout(r0, r8, r7, r3)
            r6.invalidate()
            goto L_0x0062
        L_0x0060:
            if (r7 == 0) goto L_0x0063
        L_0x0062:
            r2 = 1
        L_0x0063:
            if (r2 == 0) goto L_0x0074
            boolean r7 = r0 instanceof com.facebook.react.uimanager.C3052v
            if (r7 == 0) goto L_0x0074
            com.facebook.react.uimanager.v r0 = (com.facebook.react.uimanager.C3052v) r0
            boolean r7 = r0.getRemoveClippedSubviews()
            if (r7 == 0) goto L_0x0074
            r0.mo9866b()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C3245g.m12717z(android.graphics.Rect, int, int):void");
    }

    /* renamed from: a */
    public int mo9685a(int i) {
        UiThreadUtil.assertOnUiThread();
        return (m12711m() || !getDrawingOrderHelper().mo9489d()) ? i : getDrawingOrderHelper().mo9486a(getChildCount(), i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!m12711m()) {
            getDrawingOrderHelper().mo9487b(view);
            z = getDrawingOrderHelper().mo9489d();
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo9866b() {
        if (this.f9175p) {
            C6409a.m24521c(this.f9178s);
            C6409a.m24521c(this.f9176q);
            C3054w.m12097a(this, this.f9178s);
            m12716y(this.f9178s);
        }
    }

    /* renamed from: d */
    public void mo9686d() {
        if (!m12711m()) {
            getDrawingOrderHelper().mo9490e();
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().mo9489d());
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            m12712n(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e) {
            C2990j0 a = C2995k0.m11876a(this);
            if (a != null) {
                a.mo9713e(e);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new C2981h("StackOverflowException", this, e));
            } else {
                throw e;
            }
        }
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e) {
            C6071a.m22876j("ReactNative", "NullPointerException when executing dispatchProvideStructure", e);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z) {
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view.getElevation() > 0.0f && C3257a.f9230k;
        if (z) {
            C3236a.m12658a(canvas, true);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            C3236a.m12658a(canvas, false);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.f9177r;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((C3240e) getBackground()).mo10629j();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        return !m12711m() ? getDrawingOrderHelper().mo9486a(i, i2) : i2;
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public Rect getHitSlopRect() {
        return this.f9179t;
    }

    public String getOverflow() {
        return this.f9180u;
    }

    public C3040s getPointerEvents() {
        return this.f9181v;
    }

    public boolean getRemoveClippedSubviews() {
        return this.f9175p;
    }

    /* renamed from: h */
    public void mo9868h(Rect rect) {
        rect.set(this.f9178s);
    }

    public boolean hasOverlappingRendering() {
        return this.f9185z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10660k(View view, int i) {
        mo10661l(view, i, f9168f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo10661l(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C6409a.m24519a(this.f9175p);
        C6409a.m24521c(this.f9178s);
        C6409a.m24521c(this.f9176q);
        m12710j(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f9176q[i3].getParent() == null) {
                i2++;
            }
        }
        m12717z(this.f9178s, i, i2);
        view.addOnLayoutChangeListener(this.f9182w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public View mo10662o(int i) {
        return ((View[]) C6409a.m24521c(this.f9176q))[i];
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9175p) {
            mo9866b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3040s sVar;
        C2707b bVar = this.f9184y;
        if ((bVar != null && bVar.mo8855a(this, motionEvent)) || (sVar = this.f9181v) == C3040s.NONE || sVar == C3040s.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C2997l.m11880a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void onRtlPropertiesChanged(int i) {
        C3240e eVar = this.f9183x;
        if (eVar != null) {
            eVar.mo10621A(this.f9172C);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f9175p) {
            mo9866b();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C3040s sVar = this.f9181v;
        return (sVar == C3040s.NONE || sVar == C3040s.BOX_NONE) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo10666q() {
        C6409a.m24519a(this.f9175p);
        C6409a.m24521c(this.f9176q);
        for (int i = 0; i < this.f9177r; i++) {
            this.f9176q[i].removeOnLayoutChangeListener(this.f9182w);
        }
        removeAllViewsInLayout();
        this.f9177r = 0;
    }

    public void removeView(View view) {
        boolean z;
        UiThreadUtil.assertOnUiThread();
        if (!m12711m()) {
            getDrawingOrderHelper().mo9488c(view);
            z = getDrawingOrderHelper().mo9489d();
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        boolean z;
        UiThreadUtil.assertOnUiThread();
        if (!m12711m()) {
            getDrawingOrderHelper().mo9488c(getChildAt(i));
            z = getDrawingOrderHelper().mo9489d();
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
        super.removeViewAt(i);
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo10670s(View view) {
        UiThreadUtil.assertOnUiThread();
        C6409a.m24519a(this.f9175p);
        C6409a.m24521c(this.f9178s);
        C6409a.m24521c(this.f9176q);
        view.removeOnLayoutChangeListener(this.f9182w);
        int p = m12713p(view);
        if (this.f9176q[p].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < p; i2++) {
                if (this.f9176q[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(p - i, 1);
        }
        m12714r(p);
    }

    public void setBackfaceVisibility(String str) {
        this.f9174E = str;
        mo10682t();
    }

    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.f9183x != null) {
            getOrCreateReactViewBackground().mo10642x(i);
        }
    }

    public void setBorderRadius(float f) {
        getOrCreateReactViewBackground().mo10643y(f);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().mo10640v(str);
    }

    public void setHitSlopRect(Rect rect) {
        this.f9179t = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.f9185z = z;
    }

    public void setOnInterceptTouchEventListener(C2707b bVar) {
        this.f9184y = bVar;
    }

    public void setOpacityIfPossible(float f) {
        this.f9173D = f;
        mo10682t();
    }

    public void setOverflow(String str) {
        this.f9180u = str;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setPointerEvents(C3040s sVar) {
        this.f9181v = sVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.f9175p) {
            this.f9175p = z;
            if (z) {
                Rect rect = new Rect();
                this.f9178s = rect;
                C3054w.m12097a(this, rect);
                int childCount = getChildCount();
                this.f9177r = childCount;
                this.f9176q = new View[Math.max(12, childCount)];
                this.f9182w = new C3247b(this, (C3246a) null);
                for (int i = 0; i < this.f9177r; i++) {
                    View childAt = getChildAt(i);
                    this.f9176q[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.f9182w);
                }
                mo9866b();
                return;
            }
            C6409a.m24521c(this.f9178s);
            C6409a.m24521c(this.f9176q);
            C6409a.m24521c(this.f9182w);
            for (int i2 = 0; i2 < this.f9177r; i2++) {
                this.f9176q[i2].removeOnLayoutChangeListener(this.f9182w);
            }
            getDrawingRect(this.f9178s);
            m12716y(this.f9178s);
            this.f9176q = null;
            this.f9178s = null;
            this.f9177r = 0;
            this.f9182w = null;
        }
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        m12715x((Drawable) null);
        if (this.f9183x != null && drawable != null) {
            m12715x(new LayerDrawable(new Drawable[]{this.f9183x, drawable}));
        } else if (drawable != null) {
            m12715x(drawable);
        }
    }

    /* renamed from: t */
    public void mo10682t() {
        float f;
        if (!this.f9174E.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (!(rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f)) {
                f = 0.0f;
                setAlpha(f);
            }
        }
        f = this.f9173D;
        setAlpha(f);
    }

    /* renamed from: u */
    public void mo10683u(int i, float f, float f2) {
        getOrCreateReactViewBackground().mo10639t(i, f, f2);
    }

    /* renamed from: v */
    public void mo10684v(float f, int i) {
        getOrCreateReactViewBackground().mo10644z(f, i);
    }

    /* renamed from: w */
    public void mo10685w(int i, float f) {
        getOrCreateReactViewBackground().mo10641w(i, f);
    }
}
