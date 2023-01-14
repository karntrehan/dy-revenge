package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p027c.p028a.C1435a;
import p027c.p028a.C1440f;
import p027c.p028a.C1441g;
import p027c.p028a.C1444j;
import p027c.p028a.p035o.C1466b;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2008y;

public class ActionBarContextView extends C0189a {

    /* renamed from: A */
    private TextView f647A;

    /* renamed from: B */
    private TextView f648B;

    /* renamed from: C */
    private int f649C;

    /* renamed from: D */
    private int f650D;

    /* renamed from: E */
    private boolean f651E;

    /* renamed from: F */
    private int f652F;

    /* renamed from: v */
    private CharSequence f653v;

    /* renamed from: w */
    private CharSequence f654w;

    /* renamed from: x */
    private View f655x;

    /* renamed from: y */
    private View f656y;

    /* renamed from: z */
    private LinearLayout f657z;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0150a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1466b f658f;

        C0150a(C1466b bVar) {
            this.f658f = bVar;
        }

        public void onClick(View view) {
            this.f658f.mo411c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0292x0 v = C0292x0.m1407v(context, attributeSet, C1444j.f4449y, i, 0);
        C1988t.m8400p0(this, v.mo1790g(C1444j.f4454z));
        this.f649C = v.mo1797n(C1444j.f4215D, 0);
        this.f650D = v.mo1797n(C1444j.f4210C, 0);
        this.f863r = v.mo1796m(C1444j.f4205B, 0);
        this.f652F = v.mo1797n(C1444j.f4200A, C1441g.abc_action_mode_close_item_material);
        v.mo1803w();
    }

    /* renamed from: i */
    private void m782i() {
        if (this.f657z == null) {
            LayoutInflater.from(getContext()).inflate(C1441g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f657z = linearLayout;
            this.f647A = (TextView) linearLayout.findViewById(C1440f.action_bar_title);
            this.f648B = (TextView) this.f657z.findViewById(C1440f.action_bar_subtitle);
            if (this.f649C != 0) {
                this.f647A.setTextAppearance(getContext(), this.f649C);
            }
            if (this.f650D != 0) {
                this.f648B.setTextAppearance(getContext(), this.f650D);
            }
        }
        this.f647A.setText(this.f653v);
        this.f648B.setText(this.f654w);
        boolean z = !TextUtils.isEmpty(this.f653v);
        boolean z2 = !TextUtils.isEmpty(this.f654w);
        int i = 0;
        this.f648B.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f657z;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f657z.getParent() == null) {
            addView(this.f657z);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C2008y mo874f(int i, long j) {
        return super.mo874f(i, j);
    }

    /* renamed from: g */
    public void mo875g() {
        if (this.f655x == null) {
            mo884k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f654w;
    }

    public CharSequence getTitle() {
        return this.f653v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo882h(p027c.p028a.p035o.C1466b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f655x
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f652F
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f655x = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f655x
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f655x
            int r1 = p027c.p028a.C1440f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo413e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0124g) r4
            androidx.appcompat.widget.c r0 = r3.f862q
            if (r0 == 0) goto L_0x003f
            r0.mo1269y()
        L_0x003f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f862q = r0
            r1 = 1
            r0.mo1267J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f862q
            android.content.Context r2 = r3.f860o
            r4.mo620c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f862q
            androidx.appcompat.view.menu.n r4 = r4.mo535o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f861p = r4
            r1 = 0
            p027c.p064i.p072j.C1988t.m8400p0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f861p
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo882h(c.a.o.b):void");
    }

    /* renamed from: j */
    public boolean mo883j() {
        return this.f651E;
    }

    /* renamed from: k */
    public void mo884k() {
        removeAllViews();
        this.f656y = null;
        this.f861p = null;
    }

    /* renamed from: l */
    public boolean mo885l() {
        C0201c cVar = this.f862q;
        if (cVar != null) {
            return cVar.mo1268K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0201c cVar = this.f862q;
        if (cVar != null) {
            cVar.mo1259B();
            this.f862q.mo1260C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f653v);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0213d1.m1104b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f655x;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f655x.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0189a.m969d(paddingRight, i5, b);
            paddingRight = C0189a.m969d(d + mo1222e(this.f655x, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f657z;
        if (!(linearLayout == null || this.f656y != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1222e(this.f657z, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f656y;
        if (view2 != null) {
            mo1222e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f861p;
        if (actionMenuView != null) {
            mo1222e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f863r;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            View view = this.f655x;
            if (view != null) {
                int c = mo1221c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f655x.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f861p;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1221c(this.f861p, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f657z;
            if (linearLayout != null && this.f656y == null) {
                if (this.f651E) {
                    this.f657z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f657z.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f657z.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1221c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f656y;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = RecyclerView.UNDEFINED_DURATION;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f656y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f863r <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f863r = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f656y;
        if (view2 != null) {
            removeView(view2);
        }
        this.f656y = view;
        if (!(view == null || (linearLayout = this.f657z) == null)) {
            removeView(linearLayout);
            this.f657z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f654w = charSequence;
        m782i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f653v = charSequence;
        m782i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f651E) {
            requestLayout();
        }
        this.f651E = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
