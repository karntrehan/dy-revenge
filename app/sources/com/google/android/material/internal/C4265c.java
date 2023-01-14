package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p027c.p064i.p072j.C1952g;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: com.google.android.material.internal.c */
public class C4265c extends ViewGroup {

    /* renamed from: f */
    private int f12094f;

    /* renamed from: o */
    private int f12095o;

    /* renamed from: p */
    private boolean f12096p;

    public C4265c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4265c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12096p = false;
        m16399c(context, attributeSet);
    }

    /* renamed from: a */
    private static int m16398a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: c */
    private void m16399c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9024k.f24671b1, 0, 0);
        this.f12094f = obtainStyledAttributes.getDimensionPixelSize(C9024k.f24683d1, 0);
        this.f12095o = obtainStyledAttributes.getDimensionPixelSize(C9024k.f24677c1, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public boolean mo12982b() {
        return this.f12096p;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f12095o;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f12094f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (C1988t.m8417y(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i5 = C1952g.m8184b(marginLayoutParams);
                        i6 = C1952g.m8183a(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f12096p && measuredWidth > i7) {
                        i9 = this.f12094f + paddingTop;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        i11 = i7 - measuredWidth2;
                        measuredWidth2 = (i7 - i8) - i5;
                    }
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f12095o;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo12982b()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f12094f + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f12095o;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m16398a(size, mode, i8 + getPaddingRight()), m16398a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f12095o = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f12094f = i;
    }

    public void setSingleLine(boolean z) {
        this.f12096p = z;
    }
}
