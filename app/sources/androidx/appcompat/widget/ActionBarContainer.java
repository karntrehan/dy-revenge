package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p027c.p028a.C1440f;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f637f;

    /* renamed from: o */
    private View f638o;

    /* renamed from: p */
    private View f639p;

    /* renamed from: q */
    private View f640q;

    /* renamed from: r */
    Drawable f641r;

    /* renamed from: s */
    Drawable f642s;

    /* renamed from: t */
    Drawable f643t;

    /* renamed from: u */
    boolean f644u;

    /* renamed from: v */
    boolean f645v;

    /* renamed from: w */
    private int f646w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1988t.m8400p0(this, new C0198b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4329a);
        this.f641r = obtainStyledAttributes.getDrawable(C1444j.f4334b);
        this.f642s = obtainStyledAttributes.getDrawable(C1444j.f4344d);
        this.f646w = obtainStyledAttributes.getDimensionPixelSize(C1444j.f4374j, -1);
        boolean z = true;
        if (getId() == C1440f.split_action_bar) {
            this.f644u = true;
            this.f643t = obtainStyledAttributes.getDrawable(C1444j.f4339c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f644u ? !(this.f641r == null && this.f642s == null) : this.f643t != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m780a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m781b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f641r;
        if (drawable != null && drawable.isStateful()) {
            this.f641r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f642s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f642s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f643t;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f643t.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f638o;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f641r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f642s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f643t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f639p = findViewById(C1440f.action_bar);
        this.f640q = findViewById(C1440f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f637f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f638o;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f644u) {
            Drawable drawable3 = this.f643t;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f641r != null) {
                if (this.f639p.getVisibility() == 0) {
                    drawable2 = this.f641r;
                    left = this.f639p.getLeft();
                    top = this.f639p.getTop();
                    right = this.f639p.getRight();
                    view = this.f639p;
                } else {
                    View view3 = this.f640q;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f641r.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f641r;
                        left = this.f640q.getLeft();
                        top = this.f640q.getTop();
                        right = this.f640q.getRight();
                        view = this.f640q;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f645v = z4;
            if (!z4 || (drawable = this.f642s) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f639p
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f646w
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f639p
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f638o
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f639p
            boolean r0 = r3.m781b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f639p
        L_0x0042:
            int r0 = r3.m780a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f640q
            boolean r0 = r3.m781b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f640q
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f638o
            int r1 = r3.m780a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f641r;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f641r);
        }
        this.f641r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f639p;
            if (view != null) {
                this.f641r.setBounds(view.getLeft(), this.f639p.getTop(), this.f639p.getRight(), this.f639p.getBottom());
            }
        }
        boolean z = true;
        if (!this.f644u ? !(this.f641r == null && this.f642s == null) : this.f643t != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f643t;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f643t);
        }
        this.f643t = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f644u && (drawable2 = this.f643t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f644u ? this.f641r == null && this.f642s == null : this.f643t == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f642s;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f642s);
        }
        this.f642s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f645v && (drawable2 = this.f642s) != null) {
                drawable2.setBounds(this.f638o.getLeft(), this.f638o.getTop(), this.f638o.getRight(), this.f638o.getBottom());
            }
        }
        boolean z = true;
        if (!this.f644u ? !(this.f641r == null && this.f642s == null) : this.f643t != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0259p0 p0Var) {
        View view = this.f638o;
        if (view != null) {
            removeView(view);
        }
        this.f638o = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f637f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f641r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f642s;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f643t;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f641r && !this.f644u) || (drawable == this.f642s && this.f645v) || ((drawable == this.f643t && this.f644u) || super.verifyDrawable(drawable));
    }
}
