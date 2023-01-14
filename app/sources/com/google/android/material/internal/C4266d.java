package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0229i0;
import p027c.p028a.C1444j;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: com.google.android.material.internal.d */
public class C4266d extends C0229i0 {

    /* renamed from: C */
    private Drawable f12097C;

    /* renamed from: D */
    private final Rect f12098D;

    /* renamed from: E */
    private final Rect f12099E;

    /* renamed from: F */
    private int f12100F;

    /* renamed from: G */
    protected boolean f12101G;

    /* renamed from: H */
    boolean f12102H;

    public C4266d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4266d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12098D = new Rect();
        this.f12099E = new Rect();
        this.f12100F = C1444j.f4241I0;
        this.f12101G = true;
        this.f12102H = false;
        TypedArray k = C4273g.m16429k(context, attributeSet, C9024k.f24701g1, i, 0, new int[0]);
        this.f12100F = k.getInt(C9024k.f24713i1, this.f12100F);
        Drawable drawable = k.getDrawable(C9024k.f24707h1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f12101G = k.getBoolean(C9024k.f24719j1, true);
        k.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12097C;
        if (drawable != null) {
            if (this.f12102H) {
                this.f12102H = false;
                Rect rect = this.f12098D;
                Rect rect2 = this.f12099E;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f12101G) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f12100F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f12097C;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12097C;
        if (drawable != null && drawable.isStateful()) {
            this.f12097C.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f12097C;
    }

    public int getForegroundGravity() {
        return this.f12100F;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12097C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12102H = z | this.f12102H;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12102H = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f12097C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f12097C);
            }
            this.f12097C = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f12100F == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f12100F != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f12100F = i;
            if (i == 119 && this.f12097C != null) {
                this.f12097C.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12097C;
    }
}
