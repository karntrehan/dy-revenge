package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.ArrayList;
import p027c.p064i.C1824a;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1978j;
import p027c.p064i.p072j.C1979k;
import p027c.p064i.p072j.C1981m;
import p027c.p064i.p072j.C1983o;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p064i.p072j.p073g0.C1964e;

public class NestedScrollView extends FrameLayout implements C1981m, C1978j {

    /* renamed from: f */
    private static final C1180a f3267f = new C1180a();

    /* renamed from: o */
    private static final int[] f3268o = {16843130};

    /* renamed from: A */
    private boolean f3269A;

    /* renamed from: B */
    private boolean f3270B;

    /* renamed from: C */
    private int f3271C;

    /* renamed from: D */
    private int f3272D;

    /* renamed from: E */
    private int f3273E;

    /* renamed from: F */
    private int f3274F;

    /* renamed from: G */
    private final int[] f3275G;

    /* renamed from: H */
    private final int[] f3276H;

    /* renamed from: I */
    private int f3277I;

    /* renamed from: J */
    private int f3278J;

    /* renamed from: K */
    private C1182c f3279K;

    /* renamed from: L */
    private final C1983o f3280L;

    /* renamed from: M */
    private final C1979k f3281M;

    /* renamed from: N */
    private float f3282N;

    /* renamed from: O */
    private C1181b f3283O;

    /* renamed from: p */
    private long f3284p;

    /* renamed from: q */
    private final Rect f3285q;

    /* renamed from: r */
    private OverScroller f3286r;

    /* renamed from: s */
    private EdgeEffect f3287s;

    /* renamed from: t */
    private EdgeEffect f3288t;

    /* renamed from: u */
    private int f3289u;

    /* renamed from: v */
    private boolean f3290v;

    /* renamed from: w */
    private boolean f3291w;

    /* renamed from: x */
    private View f3292x;

    /* renamed from: y */
    private boolean f3293y;

    /* renamed from: z */
    private VelocityTracker f3294z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C1180a extends C1904a {
        C1180a() {
        }

        /* renamed from: f */
        public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3775f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1964e.m8285a(accessibilityEvent, nestedScrollView.getScrollX());
            C1964e.m8286b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            int scrollRange;
            super.mo3776g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo6578a0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo6615v0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo6579b(C1955c.C1956a.f5716n);
                    cVar.mo6579b(C1955c.C1956a.f5727y);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo6579b(C1955c.C1956a.f5715m);
                    cVar.mo6579b(C1955c.C1956a.f5690A);
                }
            }
        }

        /* renamed from: j */
        public boolean mo3777j(View view, int i, Bundle bundle) {
            if (super.mo3777j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo3714O(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo3714O(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C1181b {
        /* renamed from: a */
        void mo165a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C1182c extends View.BaseSavedState {
        public static final Parcelable.Creator<C1182c> CREATOR = new C1183a();

        /* renamed from: f */
        public int f3295f;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        class C1183a implements Parcelable.Creator<C1182c> {
            C1183a() {
            }

            /* renamed from: a */
            public C1182c createFromParcel(Parcel parcel) {
                return new C1182c(parcel);
            }

            /* renamed from: b */
            public C1182c[] newArray(int i) {
                return new C1182c[i];
            }
        }

        C1182c(Parcel parcel) {
            super(parcel);
            this.f3295f = parcel.readInt();
        }

        C1182c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3295f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3295f);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1824a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3285q = new Rect();
        this.f3290v = true;
        this.f3291w = false;
        this.f3292x = null;
        this.f3293y = false;
        this.f3270B = true;
        this.f3274F = -1;
        this.f3275G = new int[2];
        this.f3276H = new int[2];
        m4612x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3268o, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3280L = new C1983o(this);
        this.f3281M = new C1979k(this);
        setNestedScrollingEnabled(true);
        C1988t.m8394m0(this, f3267f);
    }

    /* renamed from: A */
    private static boolean m4593A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m4593A((View) parent, view2);
    }

    /* renamed from: B */
    private boolean m4594B(View view, int i, int i2) {
        view.getDrawingRect(this.f3285q);
        offsetDescendantRectToMyCoords(view, this.f3285q);
        return this.f3285q.bottom + i >= getScrollY() && this.f3285q.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m4595C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3281M.mo6646e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: D */
    private void m4596D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3274F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3289u = (int) motionEvent.getY(i);
            this.f3274F = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3294z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m4597G() {
        VelocityTracker velocityTracker = this.f3294z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3294z = null;
        }
    }

    /* renamed from: H */
    private void m4598H(boolean z) {
        if (z) {
            mo3715P(2, 1);
        } else {
            mo3716Q(1);
        }
        this.f3278J = getScrollY();
        C1988t.m8376d0(this);
    }

    /* renamed from: I */
    private boolean m4599I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View r = m4609r(z2, i2, i3);
        if (r == null) {
            r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m4606i(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m4600J(View view) {
        view.getDrawingRect(this.f3285q);
        offsetDescendantRectToMyCoords(view, this.f3285q);
        int f = mo3735f(this.f3285q);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    /* renamed from: K */
    private boolean m4601K(Rect rect, boolean z) {
        int f = mo3735f(rect);
        boolean z2 = f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                mo3712L(0, f);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m4602M(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3284p > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3286r;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m4598H(z);
            } else {
                if (!this.f3286r.isFinished()) {
                    m4603b();
                }
                scrollBy(i, i2);
            }
            this.f3284p = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    private void m4603b() {
        this.f3286r.abortAnimation();
        mo3716Q(1);
    }

    /* renamed from: d */
    private boolean m4604d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: e */
    private static int m4605e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3282N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3282N = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3282N;
    }

    /* renamed from: i */
    private void m4606i(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3270B) {
            mo3712L(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: j */
    private void m4607j() {
        this.f3293y = false;
        m4597G();
        mo3716Q(0);
        EdgeEffect edgeEffect = this.f3287s;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f3288t.onRelease();
        }
    }

    /* renamed from: p */
    private void m4608p() {
        if (getOverScrollMode() == 2) {
            this.f3287s = null;
            this.f3288t = null;
        } else if (this.f3287s == null) {
            Context context = getContext();
            this.f3287s = new EdgeEffect(context);
            this.f3288t = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m4609r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m4610v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: w */
    private void m4611w() {
        VelocityTracker velocityTracker = this.f3294z;
        if (velocityTracker == null) {
            this.f3294z = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m4612x() {
        this.f3286r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3271C = viewConfiguration.getScaledTouchSlop();
        this.f3272D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3273E = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m4613y() {
        if (this.f3294z == null) {
            this.f3294z = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m4614z(View view) {
        return !m4594B(view, 0, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3710E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo3774u(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f3286r
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3710E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean mo3711F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3285q.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3285q;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3285q.top = getScrollY() - height;
            Rect rect2 = this.f3285q;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3285q;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m4599I(i, i2, i3);
    }

    /* renamed from: L */
    public final void mo3712L(int i, int i2) {
        m4602M(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3713N(int i, int i2, int i3, boolean z) {
        m4602M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3714O(int i, int i2, boolean z) {
        mo3713N(i, i2, 250, z);
    }

    /* renamed from: P */
    public boolean mo3715P(int i, int i2) {
        return this.f3281M.mo6654q(i, i2);
    }

    /* renamed from: Q */
    public void mo3716Q(int i) {
        this.f3281M.mo6656s(i);
    }

    /* renamed from: a */
    public void mo900a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m4595C(i4, i5, iArr);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: c */
    public boolean mo3721c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m4594B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m4606i(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3285q);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3285q);
            m4606i(mo3735f(this.f3285q));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m4614z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f3286r.isFinished()) {
            this.f3286r.computeScrollOffset();
            int currY = this.f3286r.getCurrY();
            int i = currY - this.f3278J;
            this.f3278J = currY;
            int[] iArr = this.f3276H;
            boolean z = false;
            iArr[1] = 0;
            mo3736g(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f3276H[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo3710E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f3276H;
                iArr2[1] = 0;
                mo3742h(0, scrollY2, 0, i3, this.f3275G, 1, iArr2);
                i2 = i3 - this.f3276H[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m4608p();
                    if (i2 < 0) {
                        if (this.f3287s.isFinished()) {
                            edgeEffect = this.f3287s;
                        }
                    } else if (this.f3288t.isFinished()) {
                        edgeEffect = this.f3288t;
                    }
                    edgeEffect.onAbsorb((int) this.f3286r.getCurrVelocity());
                }
                m4603b();
            }
            if (!this.f3286r.isFinished()) {
                C1988t.m8376d0(this);
            } else {
                mo3716Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3759q(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3281M.mo6642a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3281M.mo6643b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3736g(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3281M.mo6647f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f3287s != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f3287s.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f3287s.setSize(width, height);
                if (this.f3287s.draw(canvas)) {
                    C1988t.m8376d0(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f3288t.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f3288t.setSize(width2, height2);
                if (this.f3288t.draw(canvas)) {
                    C1988t.m8376d0(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo3735f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: g */
    public boolean mo3736g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3281M.mo6645d(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f3280L.mo6657a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo3742h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3281M.mo6646e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean hasNestedScrollingParent() {
        return mo3774u(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3281M.mo6651m();
    }

    /* renamed from: k */
    public void mo919k(View view, int i, int i2, int i3, int i4, int i5) {
        m4595C(i4, i5, (int[]) null);
    }

    /* renamed from: l */
    public boolean mo920l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: m */
    public void mo921m(View view, View view2, int i, int i2) {
        this.f3280L.mo6659c(view, view2, i, i2);
        mo3715P(2, i2);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo922n(View view, int i) {
        this.f3280L.mo6661e(view, i);
        mo3716Q(i);
    }

    /* renamed from: o */
    public void mo923o(View view, int i, int i2, int[] iArr, int i3) {
        mo3736g(i, i2, iArr, (int[]) null, i3);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3291w = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3293y) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f3293y) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3274F;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3289u) > this.f3271C && (2 & getNestedScrollAxes()) == 0) {
                                this.f3293y = true;
                                this.f3289u = y;
                                m4613y();
                                this.f3294z.addMovement(motionEvent);
                                this.f3277I = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m4596D(motionEvent);
                    }
                }
            }
            this.f3293y = false;
            this.f3274F = -1;
            m4597G();
            if (this.f3286r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C1988t.m8376d0(this);
            }
            mo3716Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m4610v((int) motionEvent.getX(), y2)) {
                this.f3293y = false;
                m4597G();
            } else {
                this.f3289u = y2;
                this.f3274F = motionEvent.getPointerId(0);
                m4611w();
                this.f3294z.addMovement(motionEvent);
                this.f3286r.computeScrollOffset();
                this.f3293y = !this.f3286r.isFinished();
                mo3715P(2, 0);
            }
        }
        return this.f3293y;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3290v = false;
        View view = this.f3292x;
        if (view != null && m4593A(view, this)) {
            m4600J(this.f3292x);
        }
        this.f3292x = null;
        if (!this.f3291w) {
            if (this.f3279K != null) {
                scrollTo(getScrollX(), this.f3279K.f3295f);
                this.f3279K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = m4605e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3291w = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3269A && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3764s((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo923o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m4595C(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo921m(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m4614z(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1182c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1182c cVar = (C1182c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f3279K = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1182c cVar = new C1182c(super.onSaveInstanceState());
        cVar.f3295f = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C1181b bVar = this.f3283O;
        if (bVar != null) {
            bVar.mo165a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m4594B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3285q);
            offsetDescendantRectToMyCoords(findFocus, this.f3285q);
            m4606i(mo3735f(this.f3285q));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo920l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo922n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f3286r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0210, code lost:
        if (r10.f3286r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m4613y()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f3277I = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f3277I
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0214
            r3 = -1
            if (r0 == r14) goto L_0x01cf
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x024a
        L_0x002f:
            r23.m4596D(r24)
            int r0 = r10.f3274F
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f3289u = r0
            goto L_0x024a
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f3289u = r1
            int r0 = r11.getPointerId(r0)
            r10.f3274F = r0
            goto L_0x024a
        L_0x0054:
            boolean r0 = r10.f3293y
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f3286r
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            p027c.p064i.p072j.C1988t.m8376d0(r23)
        L_0x007b:
            r10.f3274F = r3
            r23.m4607j()
            goto L_0x024a
        L_0x0082:
            int r0 = r10.f3274F
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f3274F
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x024a
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f3289u
            int r0 = r0 - r6
            boolean r1 = r10.f3293y
            if (r1 != 0) goto L_0x00cf
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f3271C
            if (r1 <= r2) goto L_0x00cf
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00c6
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00c6:
            r10.f3293y = r14
            int r1 = r10.f3271C
            if (r0 <= 0) goto L_0x00ce
            int r0 = r0 - r1
            goto L_0x00cf
        L_0x00ce:
            int r0 = r0 + r1
        L_0x00cf:
            r7 = r0
            boolean r0 = r10.f3293y
            if (r0 == 0) goto L_0x024a
            r1 = 0
            int[] r3 = r10.f3276H
            int[] r4 = r10.f3275G
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo3736g(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f1
            int[] r0 = r10.f3276H
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f3277I
            int[] r1 = r10.f3275G
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f3277I = r0
        L_0x00f1:
            r16 = r7
            int[] r0 = r10.f3275G
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f3289u = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0110
            if (r0 != r14) goto L_0x010d
            if (r9 <= 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            r18 = 0
            goto L_0x0112
        L_0x0110:
            r18 = 1
        L_0x0112:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo3710E(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0137
            boolean r0 = r10.mo3774u(r12)
            if (r0 != 0) goto L_0x0137
            android.view.VelocityTracker r0 = r10.f3294z
            r0.clear()
        L_0x0137:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f3276H
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f3275G
            r6 = 0
            r0 = r23
            r0.mo3742h(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f3289u
            int[] r1 = r10.f3275G
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f3289u = r0
            int r0 = r10.f3277I
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f3277I = r0
            if (r18 == 0) goto L_0x024a
            int[] r0 = r10.f3276H
            r0 = r0[r14]
            int r0 = r16 - r0
            r23.m4608p()
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0190
            android.widget.EdgeEffect r1 = r10.f3287s
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C1189d.m4681a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f3288t
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f3288t
        L_0x018c:
            r0.onRelease()
            goto L_0x01b8
        L_0x0190:
            r2 = r22
            if (r1 <= r2) goto L_0x01b8
            android.widget.EdgeEffect r1 = r10.f3288t
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C1189d.m4681a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f3287s
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f3287s
            goto L_0x018c
        L_0x01b8:
            android.widget.EdgeEffect r0 = r10.f3287s
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01ca
            android.widget.EdgeEffect r0 = r10.f3288t
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024a
        L_0x01ca:
            p027c.p064i.p072j.C1988t.m8376d0(r23)
            goto L_0x024a
        L_0x01cf:
            android.view.VelocityTracker r0 = r10.f3294z
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f3273E
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f3274F
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f3272D
            if (r1 < r4) goto L_0x01f8
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo3764s(r0)
            goto L_0x007b
        L_0x01f8:
            android.widget.OverScroller r15 = r10.f3286r
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0214:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x021b
            return r12
        L_0x021b:
            android.widget.OverScroller r0 = r10.f3286r
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r14
            r10.f3293y = r0
            if (r0 == 0) goto L_0x022f
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x022f
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x022f:
            android.widget.OverScroller r0 = r10.f3286r
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
            r23.m4603b()
        L_0x023a:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f3289u = r0
            int r0 = r11.getPointerId(r12)
            r10.f3274F = r0
            r10.mo3715P(r1, r12)
        L_0x024a:
            android.view.VelocityTracker r0 = r10.f3294z
            if (r0 == 0) goto L_0x0251
            r0.addMovement(r13)
        L_0x0251:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean mo3759q(KeyEvent keyEvent) {
        this.f3285q.setEmpty();
        int i = 130;
        if (!m4604d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo3721c(33) : mo3773t(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo3721c(130) : mo3773t(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo3711F(i);
            return false;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3290v) {
            m4600J(view2);
        } else {
            this.f3292x = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m4601K(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m4597G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f3290v = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void mo3764s(int i) {
        if (getChildCount() > 0) {
            this.f3286r.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, 0, 0);
            m4598H(true);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = m4605e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = m4605e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e != getScrollX() || e2 != getScrollY()) {
                super.scrollTo(e, e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3269A) {
            this.f3269A = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3281M.mo6652n(z);
    }

    public void setOnScrollChangeListener(C1181b bVar) {
        this.f3283O = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3270B = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo3715P(i, 0);
    }

    public void stopNestedScroll() {
        mo3716Q(0);
    }

    /* renamed from: t */
    public boolean mo3773t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3285q;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3285q.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3285q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3285q;
        return m4599I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean mo3774u(int i) {
        return this.f3281M.mo6650l(i);
    }
}
