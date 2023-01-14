package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0139m;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p027c.p028a.C1435a;
import p027c.p028a.C1440f;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1980l;
import p027c.p064i.p072j.C1981m;
import p027c.p064i.p072j.C1982n;
import p027c.p064i.p072j.C1983o;
import p027c.p064i.p072j.C1988t;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0209c0, C1982n, C1980l, C1981m {

    /* renamed from: f */
    static final int[] f660f = {C1435a.actionBarSize, 16842841};

    /* renamed from: A */
    private int f661A;

    /* renamed from: B */
    private final Rect f662B = new Rect();

    /* renamed from: C */
    private final Rect f663C = new Rect();

    /* renamed from: D */
    private final Rect f664D = new Rect();

    /* renamed from: E */
    private final Rect f665E = new Rect();

    /* renamed from: F */
    private final Rect f666F = new Rect();

    /* renamed from: G */
    private final Rect f667G = new Rect();

    /* renamed from: H */
    private final Rect f668H = new Rect();

    /* renamed from: I */
    private C1929e0 f669I;

    /* renamed from: J */
    private C1929e0 f670J;

    /* renamed from: K */
    private C1929e0 f671K;

    /* renamed from: L */
    private C1929e0 f672L;

    /* renamed from: M */
    private C0154d f673M;

    /* renamed from: N */
    private OverScroller f674N;

    /* renamed from: O */
    ViewPropertyAnimator f675O;

    /* renamed from: P */
    final AnimatorListenerAdapter f676P;

    /* renamed from: Q */
    private final Runnable f677Q;

    /* renamed from: R */
    private final Runnable f678R;

    /* renamed from: S */
    private final C1983o f679S;

    /* renamed from: o */
    private int f680o;

    /* renamed from: p */
    private int f681p = 0;

    /* renamed from: q */
    private ContentFrameLayout f682q;

    /* renamed from: r */
    ActionBarContainer f683r;

    /* renamed from: s */
    private C0212d0 f684s;

    /* renamed from: t */
    private Drawable f685t;

    /* renamed from: u */
    private boolean f686u;

    /* renamed from: v */
    private boolean f687v;

    /* renamed from: w */
    private boolean f688w;

    /* renamed from: x */
    private boolean f689x;

    /* renamed from: y */
    boolean f690y;

    /* renamed from: z */
    private int f691z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0151a extends AnimatorListenerAdapter {
        C0151a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f675O = null;
            actionBarOverlayLayout.f690y = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f675O = null;
            actionBarOverlayLayout.f690y = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0152b implements Runnable {
        C0152b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo953u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f675O = actionBarOverlayLayout.f683r.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f676P);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0153c implements Runnable {
        C0153c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo953u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f675O = actionBarOverlayLayout.f683r.animate().translationY((float) (-ActionBarOverlayLayout.this.f683r.getHeight())).setListener(ActionBarOverlayLayout.this.f676P);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0154d {
        /* renamed from: a */
        void mo403a();

        /* renamed from: b */
        void mo404b();

        /* renamed from: c */
        void mo405c(boolean z);

        /* renamed from: d */
        void mo406d();

        /* renamed from: e */
        void mo407e();

        /* renamed from: f */
        void mo408f(int i);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0155e extends ViewGroup.MarginLayoutParams {
        public C0155e(int i, int i2) {
            super(i, i2);
        }

        public C0155e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0155e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1929e0 e0Var = C1929e0.f5639a;
        this.f669I = e0Var;
        this.f670J = e0Var;
        this.f671K = e0Var;
        this.f672L = e0Var;
        this.f676P = new C0151a();
        this.f677Q = new C0152b();
        this.f678R = new C0153c();
        m794v(context);
        this.f679S = new C1983o(this);
    }

    /* renamed from: A */
    private void m789A() {
        mo953u();
        this.f677Q.run();
    }

    /* renamed from: B */
    private boolean m790B(float f) {
        this.f674N.fling(0, 0, 0, (int) f, 0, 0, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        return this.f674N.getFinalY() > this.f683r.getHeight();
    }

    /* renamed from: p */
    private void m791p() {
        mo953u();
        this.f678R.run();
    }

    /* renamed from: q */
    private boolean m792q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0155e eVar = (C0155e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private C0212d0 m793t(View view) {
        if (view instanceof C0212d0) {
            return (C0212d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m794v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f660f);
        boolean z = false;
        this.f680o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f685t = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f686u = z;
        this.f674N = new OverScroller(context);
    }

    /* renamed from: x */
    private void m795x() {
        mo953u();
        postDelayed(this.f678R, 600);
    }

    /* renamed from: y */
    private void m796y() {
        mo953u();
        postDelayed(this.f677Q, 600);
    }

    /* renamed from: a */
    public void mo900a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo919k(view, i, i2, i3, i4, i5);
    }

    /* renamed from: b */
    public void mo901b(Menu menu, C0139m.C0140a aVar) {
        mo955z();
        this.f684s.mo1287b(menu, aVar);
    }

    /* renamed from: c */
    public boolean mo902c() {
        mo955z();
        return this.f684s.mo1288c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0155e;
    }

    /* renamed from: d */
    public void mo904d() {
        mo955z();
        this.f684s.mo1290d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f685t != null && !this.f686u) {
            int bottom = this.f683r.getVisibility() == 0 ? (int) (((float) this.f683r.getBottom()) + this.f683r.getTranslationY() + 0.5f) : 0;
            this.f685t.setBounds(0, bottom, getWidth(), this.f685t.getIntrinsicHeight() + bottom);
            this.f685t.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo906e() {
        mo955z();
        return this.f684s.mo1291e();
    }

    /* renamed from: f */
    public boolean mo907f() {
        mo955z();
        return this.f684s.mo1292f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo955z();
        boolean q = m792q(this.f683r, rect, true, true, false, true);
        this.f665E.set(rect);
        C0213d1.m1103a(this, this.f665E, this.f662B);
        if (!this.f666F.equals(this.f665E)) {
            this.f666F.set(this.f665E);
            q = true;
        }
        if (!this.f663C.equals(this.f662B)) {
            this.f663C.set(this.f662B);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo909g() {
        mo955z();
        return this.f684s.mo1293g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0155e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f683r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f679S.mo6657a();
    }

    public CharSequence getTitle() {
        mo955z();
        return this.f684s.getTitle();
    }

    /* renamed from: h */
    public boolean mo916h() {
        mo955z();
        return this.f684s.mo1295h();
    }

    /* renamed from: i */
    public void mo917i(int i) {
        mo955z();
        if (i == 2) {
            this.f684s.mo1314u();
        } else if (i == 5) {
            this.f684s.mo1315v();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: j */
    public void mo918j() {
        mo955z();
        this.f684s.mo1296i();
    }

    /* renamed from: k */
    public void mo919k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public boolean mo920l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: m */
    public void mo921m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo922n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo923o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo955z();
        C1929e0 u = C1929e0.m8057u(windowInsets);
        boolean q = m792q(this.f683r, new Rect(u.mo6490i(), u.mo6492k(), u.mo6491j(), u.mo6488h()), true, true, false, true);
        C1988t.m8379f(this, u, this.f662B);
        Rect rect = this.f662B;
        C1929e0 l = u.mo6493l(rect.left, rect.top, rect.right, rect.bottom);
        this.f669I = l;
        boolean z = true;
        if (!this.f670J.equals(l)) {
            this.f670J = this.f669I;
            q = true;
        }
        if (!this.f663C.equals(this.f662B)) {
            this.f663C.set(this.f662B);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return u.mo6480a().mo6482c().mo6481b().mo6500t();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m794v(getContext());
        C1988t.m8388j0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo953u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0155e eVar = (C0155e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0105 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.mo955z()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f683r
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f683r
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0155e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f683r
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r7 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f683r
            int r1 = r1.getMeasuredHeight()
            int r3 = r0.topMargin
            int r1 = r1 + r3
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f683r
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r2, r0)
            int r0 = p027c.p064i.p072j.C1988t.m8351J(r12)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x005f
            int r1 = r12.f680o
            boolean r3 = r12.f688w
            if (r3 == 0) goto L_0x0071
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f683r
            android.view.View r3 = r3.getTabContainer()
            if (r3 == 0) goto L_0x0071
            int r3 = r12.f680o
            int r1 = r1 + r3
            goto L_0x0071
        L_0x005f:
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f683r
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x0070
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f683r
            int r1 = r1.getMeasuredHeight()
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            android.graphics.Rect r3 = r12.f664D
            android.graphics.Rect r4 = r12.f662B
            r3.set(r4)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x0083
            c.i.j.e0 r3 = r12.f669I
            r12.f671K = r3
            goto L_0x008a
        L_0x0083:
            android.graphics.Rect r3 = r12.f667G
            android.graphics.Rect r4 = r12.f665E
            r3.set(r4)
        L_0x008a:
            boolean r3 = r12.f687v
            if (r3 != 0) goto L_0x00a5
            if (r0 != 0) goto L_0x00a5
            android.graphics.Rect r0 = r12.f664D
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r3 = r0.bottom
            int r3 = r3 + r2
            r0.bottom = r3
            if (r10 < r11) goto L_0x00e3
            c.i.j.e0 r0 = r12.f671K
            c.i.j.e0 r0 = r0.mo6493l(r2, r1, r2, r2)
            goto L_0x00d4
        L_0x00a5:
            if (r10 < r11) goto L_0x00d7
            c.i.j.e0 r0 = r12.f671K
            int r0 = r0.mo6490i()
            c.i.j.e0 r3 = r12.f671K
            int r3 = r3.mo6492k()
            int r3 = r3 + r1
            c.i.j.e0 r1 = r12.f671K
            int r1 = r1.mo6491j()
            c.i.j.e0 r4 = r12.f671K
            int r4 = r4.mo6488h()
            int r4 = r4 + r2
            c.i.d.b r0 = p027c.p064i.p065d.C1828b.m7761b(r0, r3, r1, r4)
            c.i.j.e0$b r1 = new c.i.j.e0$b
            c.i.j.e0 r2 = r12.f671K
            r1.<init>(r2)
            c.i.j.e0$b r0 = r1.mo6504d(r0)
            c.i.j.e0 r0 = r0.mo6501a()
        L_0x00d4:
            r12.f671K = r0
            goto L_0x00e3
        L_0x00d7:
            android.graphics.Rect r0 = r12.f667G
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r1 = r0.bottom
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x00e3:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f682q
            android.graphics.Rect r2 = r12.f664D
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r0 = r12
            r0.m792q(r1, r2, r3, r4, r5, r6)
            if (r10 < r11) goto L_0x0105
            c.i.j.e0 r0 = r12.f672L
            c.i.j.e0 r1 = r12.f671K
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0105
            c.i.j.e0 r0 = r12.f671K
            r12.f672L = r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f682q
            p027c.p064i.p072j.C1988t.m8381g(r1, r0)
            goto L_0x011f
        L_0x0105:
            if (r10 >= r11) goto L_0x011f
            android.graphics.Rect r0 = r12.f668H
            android.graphics.Rect r1 = r12.f667G
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011f
            android.graphics.Rect r0 = r12.f668H
            android.graphics.Rect r1 = r12.f667G
            r0.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f682q
            android.graphics.Rect r1 = r12.f667G
            r0.mo999a(r1)
        L_0x011f:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f682q
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f682q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0155e) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f682q
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f682q
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r8, r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f682q
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r12.getPaddingTop()
            int r4 = r12.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r2 = r2 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r14, r2)
            r12.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f689x || !z) {
            return false;
        }
        if (m790B(f2)) {
            m791p();
        } else {
            m789A();
        }
        this.f690y = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f691z + i2;
        this.f691z = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f679S.mo6658b(view, view2, i);
        this.f691z = getActionBarHideOffset();
        mo953u();
        C0154d dVar = this.f673M;
        if (dVar != null) {
            dVar.mo407e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f683r.getVisibility() != 0) {
            return false;
        }
        return this.f689x;
    }

    public void onStopNestedScroll(View view) {
        if (this.f689x && !this.f690y) {
            if (this.f691z <= this.f683r.getHeight()) {
                m796y();
            } else {
                m795x();
            }
        }
        C0154d dVar = this.f673M;
        if (dVar != null) {
            dVar.mo404b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo955z();
        int i2 = this.f661A ^ i;
        this.f661A = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0154d dVar = this.f673M;
        if (dVar != null) {
            dVar.mo405c(!z);
            if (z2 || !z) {
                this.f673M.mo403a();
            } else {
                this.f673M.mo406d();
            }
        }
        if ((i2 & 256) != 0 && this.f673M != null) {
            C1988t.m8388j0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f681p = i;
        C0154d dVar = this.f673M;
        if (dVar != null) {
            dVar.mo408f(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0155e generateDefaultLayoutParams() {
        return new C0155e(-1, -1);
    }

    /* renamed from: s */
    public C0155e generateLayoutParams(AttributeSet attributeSet) {
        return new C0155e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo953u();
        this.f683r.setTranslationY((float) (-Math.max(0, Math.min(i, this.f683r.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0154d dVar) {
        this.f673M = dVar;
        if (getWindowToken() != null) {
            this.f673M.mo408f(this.f681p);
            int i = this.f661A;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1988t.m8388j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f688w = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f689x) {
            this.f689x = z;
            if (!z) {
                mo953u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo955z();
        this.f684s.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo955z();
        this.f684s.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo955z();
        this.f684s.mo1301n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f687v = z;
        this.f686u = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo955z();
        this.f684s.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo955z();
        this.f684s.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo953u() {
        removeCallbacks(this.f677Q);
        removeCallbacks(this.f678R);
        ViewPropertyAnimator viewPropertyAnimator = this.f675O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo954w() {
        return this.f687v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo955z() {
        if (this.f682q == null) {
            this.f682q = (ContentFrameLayout) findViewById(C1440f.action_bar_activity_content);
            this.f683r = (ActionBarContainer) findViewById(C1440f.action_bar_container);
            this.f684s = m793t(findViewById(C1440f.action_bar));
        }
    }
}
