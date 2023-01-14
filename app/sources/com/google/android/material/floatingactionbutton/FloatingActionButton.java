package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0231j;
import androidx.appcompat.widget.C0254n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.util.C1177h;
import androidx.core.widget.C1198l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C4243b;
import com.google.android.material.internal.C4264b;
import com.google.android.material.internal.C4275i;
import java.util.List;
import p027c.p064i.p072j.C1987s;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;
import p174e.p319f.p320a.p363d.p365b0.C9014a;
import p174e.p319f.p320a.p363d.p366l.C9032h;
import p174e.p319f.p320a.p363d.p366l.C9035k;
import p174e.p319f.p320a.p363d.p376u.C9056a;
import p174e.p319f.p320a.p363d.p381z.C9073b;

@CoordinatorLayout.C1088d(Behavior.class)
public class FloatingActionButton extends C4275i implements C1987s, C1198l, C9056a, C9012n {

    /* renamed from: o */
    private static final int f11943o = C9023j.Widget_Design_FloatingActionButton;

    /* renamed from: A */
    private final Rect f11944A;

    /* renamed from: B */
    private final C0254n f11945B;

    /* renamed from: C */
    private C4243b f11946C;

    /* renamed from: p */
    private ColorStateList f11947p;

    /* renamed from: q */
    private PorterDuff.Mode f11948q;

    /* renamed from: r */
    private ColorStateList f11949r;

    /* renamed from: s */
    private PorterDuff.Mode f11950s;

    /* renamed from: t */
    private ColorStateList f11951t;

    /* renamed from: u */
    private int f11952u;

    /* renamed from: v */
    private int f11953v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f11954w;

    /* renamed from: x */
    private int f11955x;

    /* renamed from: y */
    boolean f11956y;

    /* renamed from: z */
    final Rect f11957z;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C1087c<T> {

        /* renamed from: a */
        private Rect f11958a;

        /* renamed from: b */
        private C4239b f11959b;

        /* renamed from: c */
        private boolean f11960c;

        public BaseBehavior() {
            this.f11960c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24659Z0);
            this.f11960c = obtainStyledAttributes.getBoolean(C9024k.f24665a1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        private static boolean m16221F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1090f) {
                return ((CoordinatorLayout.C1090f) layoutParams).mo3507f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m16222G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f11957z;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C1090f fVar = (CoordinatorLayout.C1090f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C1988t.m8367Y(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C1988t.m8366X(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: J */
        private boolean m16223J(View view, FloatingActionButton floatingActionButton) {
            return this.f11960c && ((CoordinatorLayout.C1090f) floatingActionButton.getLayoutParams()).mo3506e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m16224K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m16223J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f11958a == null) {
                this.f11958a = new Rect();
            }
            Rect rect = this.f11958a;
            C4264b.m16395a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo13300m(this.f11959b, false);
                return true;
            }
            floatingActionButton.mo13342t(this.f11959b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m16225L(View view, FloatingActionButton floatingActionButton) {
            if (!m16223J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C1090f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo13300m(this.f11959b, false);
                return true;
            }
            floatingActionButton.mo13342t(this.f11959b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo3474b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f11957z;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo3480h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m16224K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m16221F(view)) {
                return false;
            } else {
                m16225L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo3484l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> r = coordinatorLayout.mo3453r(floatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m16221F(view) && m16225L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m16224K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3420I(floatingActionButton, i);
            m16222G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: g */
        public void mo3479g(CoordinatorLayout.C1090f fVar) {
            if (fVar.f3045h == 0) {
                fVar.f3045h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo13343E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo3474b(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo13344H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo3480h(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo13345I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo3484l(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo3479g(CoordinatorLayout.C1090f fVar) {
            super.mo3479g(fVar);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C4238a implements C4243b.C4253j {

        /* renamed from: a */
        final /* synthetic */ C4239b f11961a;

        C4238a(C4239b bVar) {
            this.f11961a = bVar;
        }

        /* renamed from: a */
        public void mo13346a() {
            this.f11961a.mo12706b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo13347b() {
            this.f11961a.mo12705a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C4239b {
        /* renamed from: a */
        public void mo12705a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo12706b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C4240c implements C9073b {
        C4240c() {
        }

        /* renamed from: a */
        public void mo13348a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f11957z.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f11954w, i2 + FloatingActionButton.this.f11954w, i3 + FloatingActionButton.this.f11954w, i4 + FloatingActionButton.this.f11954w);
        }

        /* renamed from: b */
        public boolean mo13349b() {
            return FloatingActionButton.this.f11956y;
        }

        /* renamed from: c */
        public void mo13350c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C4241d<T extends FloatingActionButton> implements C4243b.C4252i {

        /* renamed from: a */
        private final C9035k<T> f11964a;

        C4241d(C9035k<T> kVar) {
            this.f11964a = kVar;
        }

        /* renamed from: a */
        public void mo13351a() {
            this.f11964a.mo22940b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo13352b() {
            this.f11964a.mo22939a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4241d) && ((C4241d) obj).f11964a.equals(this.f11964a);
        }

        public int hashCode() {
            return this.f11964a.hashCode();
        }
    }

    private C4243b getImpl() {
        if (this.f11946C == null) {
            this.f11946C = m16203h();
        }
        return this.f11946C;
    }

    /* renamed from: h */
    private C4243b m16203h() {
        return Build.VERSION.SDK_INT >= 21 ? new C4256c(this, new C4240c()) : new C4243b(this, new C4240c());
    }

    /* renamed from: k */
    private int m16204k(int i) {
        int i2 = this.f11953v;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m16204k(1) : m16204k(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C9017d.design_fab_size_normal : C9017d.design_fab_size_mini);
    }

    /* renamed from: p */
    private void m16205p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f11957z;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m16206q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f11949r;
            if (colorStateList == null) {
                C1164a.m4539c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f11950s;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0231j.m1179e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m16207r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C4243b.C4253j m16208u(C4239b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C4238a(bVar);
    }

    /* renamed from: a */
    public boolean mo13275a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo13357C(getDrawableState());
    }

    /* renamed from: e */
    public void mo13277e(Animator.AnimatorListener animatorListener) {
        getImpl().mo13383d(animatorListener);
    }

    /* renamed from: f */
    public void mo13278f(Animator.AnimatorListener animatorListener) {
        getImpl().mo13384e(animatorListener);
    }

    /* renamed from: g */
    public void mo13279g(C9035k<? extends FloatingActionButton> kVar) {
        getImpl().mo13385f(new C4241d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f11947p;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f11948q;
    }

    public float getCompatElevation() {
        return getImpl().mo13387m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo13390p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo13392s();
    }

    public Drawable getContentBackground() {
        return getImpl().mo13386j();
    }

    public int getCustomSize() {
        return this.f11953v;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C9032h getHideMotionSpec() {
        return getImpl().mo13389o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f11951t;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f11951t;
    }

    public C8997k getShapeAppearanceModel() {
        return (C8997k) C1177h.m4583e(getImpl().mo13393t());
    }

    public C9032h getShowMotionSpec() {
        return getImpl().mo13394u();
    }

    public int getSize() {
        return this.f11952u;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m16204k(this.f11952u);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f11949r;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f11950s;
    }

    public boolean getUseCompatPadding() {
        return this.f11956y;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo13296i(Rect rect) {
        if (!C1988t.m8361S(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m16205p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo13297j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m16205p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo13398y();
    }

    /* renamed from: l */
    public void mo13299l(C4239b bVar) {
        mo13300m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo13300m(C4239b bVar, boolean z) {
        getImpl().mo13395v(m16208u(bVar), z);
    }

    /* renamed from: n */
    public boolean mo13301n() {
        return getImpl().mo13396w();
    }

    /* renamed from: o */
    public boolean mo13302o() {
        return getImpl().mo13397x();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo13399z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo13356B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f11954w = (sizeDimension - this.f11955x) / 2;
        getImpl().mo13381b0();
        int min = Math.min(m16207r(sizeDimension, i), m16207r(sizeDimension, i2));
        Rect rect = this.f11957z;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9014a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9014a aVar = (C9014a) parcelable;
        super.onRestoreInstanceState(aVar.mo6726a());
        Bundle bundle = (Bundle) C1177h.m4583e(aVar.f24531p.get("expandableWidgetHelper"));
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C9014a(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo13296i(this.f11944A) || this.f11944A.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo13309s(C4239b bVar) {
        mo13342t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f11947p != colorStateList) {
            this.f11947p = colorStateList;
            getImpl().mo13364J(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f11948q != mode) {
            this.f11948q = mode;
            getImpl().mo13365K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo13366L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo13369O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo13371Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f11953v) {
            this.f11953v = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo13382c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo13388n()) {
            getImpl().mo13367M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C9032h hVar) {
        getImpl().mo13368N(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C9032h.m30133c(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo13380a0();
            if (this.f11949r != null) {
                m16206q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f11945B.mo1530g(i);
        m16206q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f11951t != colorStateList) {
            this.f11951t = colorStateList;
            getImpl().mo13372R(this.f11951t);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo13361G();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo13361G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo13373S(z);
    }

    public void setShapeAppearanceModel(C8997k kVar) {
        getImpl().mo13374T(kVar);
    }

    public void setShowMotionSpec(C9032h hVar) {
        getImpl().mo13375U(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C9032h.m30133c(getContext(), i));
    }

    public void setSize(int i) {
        this.f11953v = 0;
        if (i != this.f11952u) {
            this.f11952u = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f11949r != colorStateList) {
            this.f11949r = colorStateList;
            m16206q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f11950s != mode) {
            this.f11950s = mode;
            m16206q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo13362H();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo13362H();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo13362H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f11956y != z) {
            this.f11956y = z;
            getImpl().mo13355A();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo13342t(C4239b bVar, boolean z) {
        getImpl().mo13378Y(m16208u(bVar), z);
    }
}
