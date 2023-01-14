package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.i0 */
public class C0229i0 extends ViewGroup {

    /* renamed from: A */
    private int f991A;

    /* renamed from: B */
    private int f992B;

    /* renamed from: f */
    private boolean f993f;

    /* renamed from: o */
    private int f994o;

    /* renamed from: p */
    private int f995p;

    /* renamed from: q */
    private int f996q;

    /* renamed from: r */
    private int f997r;

    /* renamed from: s */
    private int f998s;

    /* renamed from: t */
    private float f999t;

    /* renamed from: u */
    private boolean f1000u;

    /* renamed from: v */
    private int[] f1001v;

    /* renamed from: w */
    private int[] f1002w;

    /* renamed from: x */
    private Drawable f1003x;

    /* renamed from: y */
    private int f1004y;

    /* renamed from: z */
    private int f1005z;

    /* renamed from: androidx.appcompat.widget.i0$a */
    public static class C0230a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f1006a;

        /* renamed from: b */
        public int f1007b;

        public C0230a(int i, int i2) {
            super(i, i2);
            this.f1007b = -1;
            this.f1006a = 0.0f;
        }

        public C0230a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1007b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4386l1);
            this.f1006a = obtainStyledAttributes.getFloat(C1444j.f4396n1, 0.0f);
            this.f1007b = obtainStyledAttributes.getInt(C1444j.f4391m1, -1);
            obtainStyledAttributes.recycle();
        }

        public C0230a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1007b = -1;
        }
    }

    public C0229i0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0229i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0229i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f993f = true;
        this.f994o = -1;
        this.f995p = 0;
        this.f997r = 8388659;
        int[] iArr = C1444j.f4336b1;
        C0292x0 v = C0292x0.m1407v(context, attributeSet, iArr, i, 0);
        C1988t.m8390k0(this, context, iArr, attributeSet, v.mo1801r(), i, 0);
        int k = v.mo1794k(C1444j.f4346d1, -1);
        if (k >= 0) {
            setOrientation(k);
        }
        int k2 = v.mo1794k(C1444j.f4341c1, -1);
        if (k2 >= 0) {
            setGravity(k2);
        }
        boolean a = v.mo1784a(C1444j.f4351e1, true);
        if (!a) {
            setBaselineAligned(a);
        }
        this.f999t = v.mo1792i(C1444j.f4361g1, -1.0f);
        this.f994o = v.mo1794k(C1444j.f4356f1, -1);
        this.f1000u = v.mo1784a(C1444j.f4376j1, false);
        setDividerDrawable(v.mo1790g(C1444j.f4366h1));
        this.f991A = v.mo1794k(C1444j.f4381k1, 0);
        this.f992B = v.mo1789f(C1444j.f4371i1, 0);
        v.mo1803w();
    }

    /* renamed from: A */
    private void m1156A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: k */
    private void m1157k(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View s = mo1422s(i3);
            if (s.getVisibility() != 8) {
                C0230a aVar = (C0230a) s.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = s.getMeasuredWidth();
                    measureChildWithMargins(s, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    private void m1158l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View s = mo1422s(i3);
            if (s.getVisibility() != 8) {
                C0230a aVar = (C0230a) s.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = s.getMeasuredHeight();
                    measureChildWithMargins(s, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0230a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1402g(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean b = C0213d1.m1104b(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View s = mo1422s(i4);
            if (!(s == null || s.getVisibility() == 8 || !mo1435t(i4))) {
                C0230a aVar = (C0230a) s.getLayoutParams();
                mo1415j(canvas, b ? s.getRight() + aVar.rightMargin : (s.getLeft() - aVar.leftMargin) - this.f1004y);
            }
        }
        if (mo1435t(virtualChildCount)) {
            View s2 = mo1422s(virtualChildCount - 1);
            if (s2 != null) {
                C0230a aVar2 = (C0230a) s2.getLayoutParams();
                if (b) {
                    i3 = s2.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = s2.getRight() + aVar2.rightMargin;
                    mo1415j(canvas, i);
                }
            } else if (b) {
                i = getPaddingLeft();
                mo1415j(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f1004y;
            mo1415j(canvas, i);
        }
    }

    public int getBaseline() {
        int i;
        if (this.f994o < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f994o;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f995p;
                if (this.f996q == 1 && (i = this.f997r & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f998s) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f998s;
                    }
                }
                return i3 + ((C0230a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f994o == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f994o;
    }

    public Drawable getDividerDrawable() {
        return this.f1003x;
    }

    public int getDividerPadding() {
        return this.f992B;
    }

    public int getDividerWidth() {
        return this.f1004y;
    }

    public int getGravity() {
        return this.f997r;
    }

    public int getOrientation() {
        return this.f996q;
    }

    public int getShowDividers() {
        return this.f991A;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f999t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1413h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View s = mo1422s(i);
            if (!(s == null || s.getVisibility() == 8 || !mo1435t(i))) {
                mo1414i(canvas, (s.getTop() - ((C0230a) s.getLayoutParams()).topMargin) - this.f1005z);
            }
        }
        if (mo1435t(virtualChildCount)) {
            View s2 = mo1422s(virtualChildCount - 1);
            mo1414i(canvas, s2 == null ? (getHeight() - getPaddingBottom()) - this.f1005z : s2.getBottom() + ((C0230a) s2.getLayoutParams()).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1414i(Canvas canvas, int i) {
        this.f1003x.setBounds(getPaddingLeft() + this.f992B, i, (getWidth() - getPaddingRight()) - this.f992B, this.f1005z + i);
        this.f1003x.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1415j(Canvas canvas, int i) {
        this.f1003x.setBounds(i, getPaddingTop() + this.f992B, this.f1004y + i, (getHeight() - getPaddingBottom()) - this.f992B);
        this.f1003x.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0230a generateDefaultLayoutParams() {
        int i = this.f996q;
        if (i == 0) {
            return new C0230a(-2, -2);
        }
        if (i == 1) {
            return new C0230a(-1, -2);
        }
        return null;
    }

    /* renamed from: n */
    public C0230a generateLayoutParams(AttributeSet attributeSet) {
        return new C0230a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0230a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0230a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1003x != null) {
            if (this.f996q == 1) {
                mo1413h(canvas);
            } else {
                mo1402g(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f996q == 1) {
            mo1437v(i, i2, i3, i4);
        } else {
            mo1436u(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f996q == 1) {
            mo1441z(i, i2);
        } else {
            mo1439x(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo1419p(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo1420q(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo1421r(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public View mo1422s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f993f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f994o = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1003x) {
            this.f1003x = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1004y = drawable.getIntrinsicWidth();
                this.f1005z = drawable.getIntrinsicHeight();
            } else {
                this.f1004y = 0;
                this.f1005z = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f992B = i;
    }

    public void setGravity(int i) {
        if (this.f997r != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f997r = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f997r;
        if ((8388615 & i3) != i2) {
            this.f997r = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1000u = z;
    }

    public void setOrientation(int i) {
        if (this.f996q != i) {
            this.f996q = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f991A) {
            requestLayout();
        }
        this.f991A = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f997r;
        if ((i3 & 112) != i2) {
            this.f997r = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f999t = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo1435t(int i) {
        if (i == 0) {
            return (this.f991A & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f991A & 4) != 0;
        }
        if ((this.f991A & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1436u(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0213d1.m1104b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f997r
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f993f
            int[] r13 = r6.f1001v
            int[] r14 = r6.f1002w
            int r1 = p027c.p064i.p072j.C1988t.m8417y(r24)
            int r1 = p027c.p064i.p072j.C1915d.m8012b(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f998s
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f998s
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x013f
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo1422s(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo1440y(r2)
            int r1 = r1 + r0
            goto L_0x0129
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0127
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.i0$a r4 = (androidx.appcompat.widget.C0229i0.C0230a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r10 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r10 = -1
        L_0x00a3:
            int r3 = r4.f1007b
            if (r3 >= 0) goto L_0x00a8
            r3 = r11
        L_0x00a8:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00e3
            r11 = 48
            if (r3 == r11) goto L_0x00d1
            r11 = 80
            if (r3 == r11) goto L_0x00bb
            r3 = r7
            r11 = -1
            goto L_0x00e0
        L_0x00bb:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00e0
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00e0
        L_0x00d1:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00e0
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00f1
        L_0x00e0:
            r21 = 1
            goto L_0x00f1
        L_0x00e3:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f1:
            boolean r10 = r6.mo1435t(r2)
            if (r10 == 0) goto L_0x00fa
            int r10 = r6.f1004y
            int r1 = r1 + r10
        L_0x00fa:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo1420q(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m1156A(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo1421r(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo1419p(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0133
        L_0x0127:
            r18 = r3
        L_0x0129:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0133:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0229i0.mo1436u(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1437v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f997r
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f998s
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f998s
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c6
            android.view.View r13 = r6.mo1422s(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.mo1440y(r12)
            int r0 = r0 + r1
            goto L_0x00c3
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.i0$a r5 = (androidx.appcompat.widget.C0229i0.C0230a) r5
            int r1 = r5.f1007b
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = p027c.p064i.p072j.C1988t.m8417y(r17)
            int r1 = p027c.p064i.p072j.C1915d.m8012b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008b
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0096
        L_0x0088:
            int r1 = r8 - r4
            goto L_0x0093
        L_0x008b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L_0x0093:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L_0x0096:
            r2 = r1
            boolean r1 = r6.mo1435t(r12)
            if (r1 == 0) goto L_0x00a0
            int r1 = r6.f1005z
            int r0 = r0 + r1
        L_0x00a0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.mo1420q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1156A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.mo1421r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.mo1419p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        L_0x00c3:
            r1 = 1
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0229i0.mo1437v(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1438w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a1, code lost:
        if (r8 > 0) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ac, code lost:
        if (r8 < 0) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ae, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03af, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r0 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ce  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1439x(int r38, int r39) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = 0
            r7.f998s = r10
            int r11 = r37.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r38)
            int r13 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r7.f1001v
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f1002w
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f1001v = r0
            int[] r0 = new int[r14]
            r7.f1002w = r0
        L_0x0026:
            int[] r15 = r7.f1001v
            int[] r6 = r7.f1002w
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f993f
            boolean r3 = r7.f1000u
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x0061:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01f7
            android.view.View r6 = r7.mo1422s(r1)
            if (r6 != 0) goto L_0x007f
            int r5 = r7.f998s
            int r6 = r7.mo1440y(r1)
            int r5 = r5 + r6
            r7.f998s = r5
        L_0x0076:
            r2 = r1
            r32 = r3
            r36 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e6
        L_0x007f:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008b
            int r5 = r7.mo1419p(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x008b:
            boolean r5 = r7.mo1435t(r1)
            if (r5 == 0) goto L_0x0098
            int r5 = r7.f998s
            int r10 = r7.f1004y
            int r5 = r5 + r10
            r7.f998s = r5
        L_0x0098:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.i0$a r10 = (androidx.appcompat.widget.C0229i0.C0230a) r10
            float r5 = r10.f1006a
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00e8
            int r0 = r10.width
            if (r0 != 0) goto L_0x00e8
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e8
            int r0 = r7.f998s
            if (r19 == 0) goto L_0x00b8
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c2
        L_0x00b8:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c2:
            r7.f998s = r0
            if (r4 == 0) goto L_0x00d9
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0160
        L_0x00d9:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r30 = -2
            goto L_0x0162
        L_0x00e8:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f5
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00f8
        L_0x00f5:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f8:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0101
            int r0 = r7.f998s
            r29 = r0
            goto L_0x0103
        L_0x0101:
            r29 = 0
        L_0x0103:
            r33 = 0
            r0 = r37
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r38
            r36 = r4
            r4 = r29
            r9 = -1
            r29 = -2
            r5 = r39
            r29 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            r6 = r33
            r0.mo1438w(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x012c
            r10.width = r0
        L_0x012c:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x0143
            int r1 = r7.f998s
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.mo1421r(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x0158
        L_0x0143:
            r3 = r29
            int r1 = r7.f998s
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo1421r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0158:
            r7.f998s = r1
            if (r32 == 0) goto L_0x0160
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0160:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0162:
            if (r13 == r1) goto L_0x016d
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x016d
            r0 = 1
            r27 = 1
            goto L_0x016e
        L_0x016d:
            r0 = 0
        L_0x016e:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01ab
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01ab
            int r6 = r10.f1007b
            if (r6 >= 0) goto L_0x0191
            int r6 = r7.f997r
        L_0x0191:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01ab:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01bb
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01bb
            r26 = 1
            goto L_0x01bd
        L_0x01bb:
            r26 = 0
        L_0x01bd:
            float r5 = r10.f1006a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ce
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            r2 = r4
        L_0x01c7:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01dc
        L_0x01ce:
            r10 = r23
            if (r0 == 0) goto L_0x01d3
            goto L_0x01d4
        L_0x01d3:
            r2 = r4
        L_0x01d4:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L_0x01dc:
            r10 = r34
            int r0 = r7.mo1419p(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L_0x01e6:
            int r2 = r2 + 1
            r9 = r39
            r1 = r2
            r6 = r28
            r3 = r32
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x01f7:
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.f998s
            if (r3 <= 0) goto L_0x021a
            boolean r3 = r7.mo1435t(r11)
            if (r3 == 0) goto L_0x021a
            int r3 = r7.f998s
            int r1 = r7.f1004y
            int r3 = r3 + r1
            r7.f998s = r3
        L_0x021a:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x0231
            r1 = 0
            r5 = r15[r1]
            if (r5 != r3) goto L_0x0231
            r1 = r15[r17]
            if (r1 != r3) goto L_0x0231
            r1 = r15[r16]
            if (r1 == r3) goto L_0x022d
            goto L_0x0231
        L_0x022d:
            r1 = r2
            r23 = r6
            goto L_0x0262
        L_0x0231:
            r1 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x0262:
            if (r32 == 0) goto L_0x02c3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x026a
            if (r12 != 0) goto L_0x02c3
        L_0x026a:
            r2 = 0
            r7.f998s = r2
            r2 = 0
        L_0x026e:
            if (r2 >= r11) goto L_0x02c3
            android.view.View r3 = r7.mo1422s(r2)
            if (r3 != 0) goto L_0x0280
            int r3 = r7.f998s
            int r5 = r7.mo1440y(r2)
            int r3 = r3 + r5
            r7.f998s = r3
            goto L_0x028d
        L_0x0280:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0290
            int r3 = r7.mo1419p(r3, r2)
            int r2 = r2 + r3
        L_0x028d:
            r22 = r1
            goto L_0x02be
        L_0x0290:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.i0$a r5 = (androidx.appcompat.widget.C0229i0.C0230a) r5
            int r6 = r7.f998s
            if (r19 == 0) goto L_0x02a9
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.mo1421r(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.f998s = r6
            goto L_0x028d
        L_0x02a9:
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo1421r(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f998s = r1
        L_0x02be:
            int r2 = r2 + 1
            r1 = r22
            goto L_0x026e
        L_0x02c3:
            r22 = r1
            int r1 = r7.f998s
            int r2 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f998s = r1
            int r2 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.f998s
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x0334
            if (r2 == 0) goto L_0x02f0
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f0
            goto L_0x0334
        L_0x02f0:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x032c
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x032c
            r10 = 0
        L_0x02fb:
            if (r10 >= r11) goto L_0x032c
            android.view.View r2 = r7.mo1422s(r10)
            if (r2 == 0) goto L_0x0329
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x030c
            goto L_0x0329
        L_0x030c:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.i0$a r4 = (androidx.appcompat.widget.C0229i0.C0230a) r4
            float r4 = r4.f1006a
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0329
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x0329:
            int r10 = r10 + 1
            goto L_0x02fb
        L_0x032c:
            r2 = r39
            r25 = r11
            r3 = r22
            goto L_0x04c3
        L_0x0334:
            float r5 = r7.f999t
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x033b
            r0 = r5
        L_0x033b:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.f998s = r6
            r6 = r4
            r9 = r23
            r4 = -1
            r10 = 0
        L_0x0354:
            if (r10 >= r11) goto L_0x046a
            android.view.View r14 = r7.mo1422s(r10)
            if (r14 == 0) goto L_0x045b
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x0366
            goto L_0x045b
        L_0x0366:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.i0$a r5 = (androidx.appcompat.widget.C0229i0.C0230a) r5
            float r3 = r5.f1006a
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03c6
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r37.getPaddingTop()
            int r23 = r37.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r39
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03a4
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03a1
            goto L_0x03a6
        L_0x03a1:
            if (r8 <= 0) goto L_0x03ae
            goto L_0x03af
        L_0x03a4:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03a6:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L_0x03af
        L_0x03ae:
            r8 = 0
        L_0x03af:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03cc
        L_0x03c6:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r39
        L_0x03cc:
            int r8 = r7.f998s
            if (r19 == 0) goto L_0x03e9
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo1421r(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f998s = r8
            r23 = r0
            goto L_0x0401
        L_0x03e9:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.mo1421r(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.f998s = r0
        L_0x0401:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x040c
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x040c
            r0 = 1
            goto L_0x040d
        L_0x040c:
            r0 = 0
        L_0x040d:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x041e
            goto L_0x041f
        L_0x041e:
            r8 = r11
        L_0x041f:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x042c
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x042d
            r6 = 1
            goto L_0x042e
        L_0x042c:
            r8 = -1
        L_0x042d:
            r6 = 0
        L_0x042e:
            if (r36 == 0) goto L_0x0455
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x0455
            int r5 = r5.f1007b
            if (r5 >= 0) goto L_0x043c
            int r5 = r7.f997r
        L_0x043c:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x0455:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L_0x0460
        L_0x045b:
            r3 = r2
            r25 = r11
            r2 = r39
        L_0x0460:
            int r10 = r10 + 1
            r8 = r38
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x0354
        L_0x046a:
            r2 = r39
            r25 = r11
            int r0 = r7.f998s
            int r3 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.f998s = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x0491
            r0 = 0
            r5 = r15[r0]
            if (r5 != r3) goto L_0x0491
            r0 = r15[r17]
            if (r0 != r3) goto L_0x0491
            r0 = r15[r16]
            if (r0 == r3) goto L_0x048f
            goto L_0x0491
        L_0x048f:
            r0 = r4
            goto L_0x04bf
        L_0x0491:
            r0 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r8 = r15[r18]
            r10 = r15[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r0 = java.lang.Math.max(r0, r5)
            r5 = r28[r16]
            r3 = r28[r3]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04bf:
            r3 = r0
            r0 = r6
            r23 = r9
        L_0x04c3:
            if (r26 != 0) goto L_0x04ca
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04ca
            goto L_0x04cb
        L_0x04ca:
            r0 = r3
        L_0x04cb:
            int r3 = r37.getPaddingTop()
            int r4 = r37.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x04f4
            r0 = r38
            r1 = r25
            r7.m1157k(r1, r0)
        L_0x04f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0229i0.mo1439x(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo1440y(int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ce, code lost:
        if (r15 > 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d9, code lost:
        if (r15 < 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02db, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02dc, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r0 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0326  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1441z(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f998s = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f994o
            boolean r15 = r7.f1000u
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0197
            android.view.View r4 = r7.mo1422s(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f998s
            int r10 = r7.mo1440y(r6)
            int r4 = r4 + r10
            r7.f998s = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L_0x018b
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005e
            int r1 = r7.mo1419p(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L_0x018b
        L_0x005e:
            boolean r1 = r7.mo1435t(r6)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.f998s
            int r10 = r7.f1005z
            int r1 = r1 + r10
            r7.f998s = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.i0$a r10 = (androidx.appcompat.widget.C0229i0.C0230a) r10
            float r1 = r10.f1006a
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a5
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a5
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            int r0 = r7.f998s
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f998s = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r8 = r24
            r29 = r26
            r18 = 1
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L_0x0113
        L_0x00a5:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b4
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b4
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b6
        L_0x00b4:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b6:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            int r0 = r7.f998s
            r23 = r0
            goto L_0x00c3
        L_0x00c1:
            r23 = 0
        L_0x00c3:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = 1073741824(0x40000000, float:2.0)
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.mo1438w(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f0
            r10.height = r0
        L_0x00f0:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.f998s
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.mo1421r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f998s = r1
            if (r15 == 0) goto L_0x0112
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0113
        L_0x0112:
            r0 = r9
        L_0x0113:
            if (r14 < 0) goto L_0x011d
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011d
            int r1 = r7.f998s
            r7.f995p = r1
        L_0x011d:
            if (r11 >= r14) goto L_0x012e
            float r1 = r10.f1006a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0126
            goto L_0x012e
        L_0x0126:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x012e:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013b
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013b
            r1 = 1
            r20 = 1
            goto L_0x013c
        L_0x013b:
            r1 = 0
        L_0x013c:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x015e
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x015e
            r19 = 1
            goto L_0x0160
        L_0x015e:
            r19 = 0
        L_0x0160:
            float r8 = r10.f1006a
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0171
            if (r1 == 0) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r2 = r4
        L_0x016a:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L_0x017c
        L_0x0171:
            if (r1 == 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r2 = r4
        L_0x0175:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L_0x017c:
            int r2 = r7.mo1419p(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x018b:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L_0x002a
        L_0x0197:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.f998s
            if (r2 <= 0) goto L_0x01b5
            r2 = r26
            boolean r3 = r7.mo1435t(r2)
            if (r3 == 0) goto L_0x01b7
            int r3 = r7.f998s
            int r4 = r7.f1005z
            int r3 = r3 + r4
            r7.f998s = r3
            goto L_0x01b7
        L_0x01b5:
            r2 = r26
        L_0x01b7:
            r3 = r24
            if (r15 == 0) goto L_0x0205
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c1
            if (r3 != 0) goto L_0x0205
        L_0x01c1:
            r4 = 0
            r7.f998s = r4
            r4 = 0
        L_0x01c5:
            if (r4 >= r2) goto L_0x0205
            android.view.View r6 = r7.mo1422s(r4)
            if (r6 != 0) goto L_0x01d7
            int r6 = r7.f998s
            int r11 = r7.mo1440y(r4)
            int r6 = r6 + r11
        L_0x01d4:
            r7.f998s = r6
            goto L_0x0200
        L_0x01d7:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e3
            int r6 = r7.mo1419p(r6, r4)
            int r4 = r4 + r6
            goto L_0x0200
        L_0x01e3:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.i0$a r11 = (androidx.appcompat.widget.C0229i0.C0230a) r11
            int r14 = r7.f998s
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo1421r(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01d4
        L_0x0200:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c5
        L_0x0205:
            int r4 = r7.f998s
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f998s = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f998s
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0274
            if (r9 == 0) goto L_0x0233
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0233
            goto L_0x0274
        L_0x0233:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x026f
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x026f
            r1 = 0
        L_0x023e:
            if (r1 >= r2) goto L_0x026f
            android.view.View r3 = r7.mo1422s(r1)
            if (r3 == 0) goto L_0x026c
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x024f
            goto L_0x026c
        L_0x024f:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.i0$a r9 = (androidx.appcompat.widget.C0229i0.C0230a) r9
            float r9 = r9.f1006a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026c
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x026c:
            int r1 = r1 + 1
            goto L_0x023e
        L_0x026f:
            r11 = r34
            r1 = r8
            goto L_0x035e
        L_0x0274:
            float r10 = r7.f999t
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x027b
            r0 = r10
        L_0x027b:
            r10 = 0
            r7.f998s = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = 0
        L_0x0282:
            if (r8 >= r2) goto L_0x034d
            android.view.View r13 = r7.mo1422s(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0296
            r21 = r11
            r11 = r34
            goto L_0x0346
        L_0x0296:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.i0$a r14 = (androidx.appcompat.widget.C0229i0.C0230a) r14
            float r10 = r14.f1006a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02f0
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02d1
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02ce
            goto L_0x02d3
        L_0x02ce:
            if (r15 <= 0) goto L_0x02db
            goto L_0x02dc
        L_0x02d1:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02d3:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02dc
        L_0x02db:
            r15 = 0
        L_0x02dc:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x02f5
        L_0x02f0:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x02f5:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0312
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0315
            r0 = 1
            goto L_0x0316
        L_0x0312:
            r23 = r1
            r1 = -1
        L_0x0315:
            r0 = 0
        L_0x0316:
            if (r0 == 0) goto L_0x0319
            goto L_0x031a
        L_0x0319:
            r10 = r15
        L_0x031a:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x0326
            int r9 = r14.width
            if (r9 != r1) goto L_0x0326
            r9 = 1
            goto L_0x0327
        L_0x0326:
            r9 = 0
        L_0x0327:
            int r10 = r7.f998s
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo1421r(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f998s = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x0346:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0282
        L_0x034d:
            r11 = r34
            int r0 = r7.f998s
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.f998s = r0
            r0 = r9
        L_0x035e:
            if (r19 != 0) goto L_0x0365
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0365
            goto L_0x0366
        L_0x0365:
            r0 = r5
        L_0x0366:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0384
            r7.m1158l(r2, r6)
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0229i0.mo1441z(int, int):void");
    }
}
