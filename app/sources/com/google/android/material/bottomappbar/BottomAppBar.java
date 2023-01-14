package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1164a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027c.p064i.p072j.C1988t;
import p027c.p077k.p078a.C2019a;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8994h;
import p174e.p319f.p320a.p363d.p366l.C9035k;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C1086b {

    /* renamed from: f0 */
    private static final int f11572f0 = C9023j.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: g0 */
    private final int f11573g0;

    /* renamed from: h0 */
    private final C8990g f11574h0;

    /* renamed from: i0 */
    private Animator f11575i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public Animator f11576j0;

    /* renamed from: k0 */
    private int f11577k0;

    /* renamed from: l0 */
    private int f11578l0;

    /* renamed from: m0 */
    private boolean f11579m0;

    /* renamed from: n0 */
    private int f11580n0;

    /* renamed from: o0 */
    private ArrayList<C4160f> f11581o0;

    /* renamed from: p0 */
    private boolean f11582p0;

    /* renamed from: q0 */
    private Behavior f11583q0;

    /* renamed from: r0 */
    private int f11584r0;

    /* renamed from: s0 */
    AnimatorListenerAdapter f11585s0;

    /* renamed from: t0 */
    C9035k<FloatingActionButton> f11586t0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f11587e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f11588f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f11589g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f11590h = new C4153a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C4153a implements View.OnLayoutChangeListener {
            C4153a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f11588f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo13297j(Behavior.this.f11587e);
                int height = Behavior.this.f11587e.height();
                bottomAppBar.mo12691q0(height);
                CoordinatorLayout.C1090f fVar = (CoordinatorLayout.C1090f) view.getLayoutParams();
                if (Behavior.this.f11589g == 0) {
                    int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(C9017d.mtrl_bottomappbar_fab_bottom_margin);
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: M */
        public boolean mo3484l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f11588f = new WeakReference<>(bottomAppBar);
            View T = bottomAppBar.m15679i0();
            if (T != null && !C1988t.m8361S(T)) {
                CoordinatorLayout.C1090f fVar = (CoordinatorLayout.C1090f) T.getLayoutParams();
                fVar.f3041d = 49;
                this.f11589g = fVar.bottomMargin;
                if (T instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) T;
                    floatingActionButton.addOnLayoutChangeListener(this.f11590h);
                    bottomAppBar.m15672a0(floatingActionButton);
                }
                bottomAppBar.m15685p0();
            }
            coordinatorLayout.mo3420I(bottomAppBar, i);
            return super.mo3484l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo3469A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo3469A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C4154a extends AnimatorListenerAdapter {
        C4154a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m15676f0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m15677g0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C4155b extends FloatingActionButton.C4239b {

        /* renamed from: a */
        final /* synthetic */ int f11593a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C4156a extends FloatingActionButton.C4239b {
            C4156a() {
            }

            /* renamed from: b */
            public void mo12706b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m15676f0();
            }
        }

        C4155b(int i) {
            this.f11593a = i;
        }

        /* renamed from: a */
        public void mo12705a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m15680k0(this.f11593a));
            floatingActionButton.mo13309s(new C4156a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C4157c extends AnimatorListenerAdapter {
        C4157c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m15676f0();
            Animator unused = BottomAppBar.this.f11576j0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m15677g0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C4158d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f11597a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f11598b;

        /* renamed from: c */
        final /* synthetic */ int f11599c;

        /* renamed from: d */
        final /* synthetic */ boolean f11600d;

        C4158d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f11598b = actionMenuView;
            this.f11599c = i;
            this.f11600d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f11597a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f11597a) {
                BottomAppBar.this.m15686r0(this.f11598b, this.f11599c, this.f11600d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C4159e extends AnimatorListenerAdapter {
        C4159e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f11585s0.onAnimationStart(animator);
            FloatingActionButton Q = BottomAppBar.this.m15678h0();
            if (Q != null) {
                Q.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    interface C4160f {
        /* renamed from: a */
        void mo12712a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo12713b(BottomAppBar bottomAppBar);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    static class C4161g extends C2019a {
        public static final Parcelable.Creator<C4161g> CREATOR = new C4162a();

        /* renamed from: p */
        int f11603p;

        /* renamed from: q */
        boolean f11604q;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        static class C4162a implements Parcelable.ClassLoaderCreator<C4161g> {
            C4162a() {
            }

            /* renamed from: a */
            public C4161g createFromParcel(Parcel parcel) {
                return new C4161g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C4161g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4161g(parcel, classLoader);
            }

            /* renamed from: c */
            public C4161g[] newArray(int i) {
                return new C4161g[i];
            }
        }

        public C4161g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11603p = parcel.readInt();
            this.f11604q = parcel.readInt() != 0;
        }

        public C4161g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11603p);
            parcel.writeInt(this.f11604q ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m15672a0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo13277e(this.f11585s0);
        floatingActionButton.mo13278f(new C4159e());
        floatingActionButton.mo13279g(this.f11586t0);
    }

    /* renamed from: b0 */
    private void m15673b0() {
        Animator animator = this.f11576j0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f11575i0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: d0 */
    private void m15674d0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m15678h0(), "translationX", new float[]{m15680k0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: e0 */
    private void m15675e0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo12689j0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C4158d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m15676f0() {
        ArrayList<C4160f> arrayList;
        int i = this.f11580n0 - 1;
        this.f11580n0 = i;
        if (i == 0 && (arrayList = this.f11581o0) != null) {
            Iterator<C4160f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo12713b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m15677g0() {
        ArrayList<C4160f> arrayList;
        int i = this.f11580n0;
        this.f11580n0 = i + 1;
        if (i == 0 && (arrayList = this.f11581o0) != null) {
            Iterator<C4160f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo12712a(this);
            }
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f11584r0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m15680k0(this.f11577k0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo12721d();
    }

    private C4163a getTopEdgeTreatment() {
        return (C4163a) this.f11574h0.mo22809B().mo22858p();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public FloatingActionButton m15678h0() {
        View i0 = m15679i0();
        if (i0 instanceof FloatingActionButton) {
            return (FloatingActionButton) i0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m15679i0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo3456s(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m15679i0():android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public float m15680k0(int i) {
        int i2 = 1;
        boolean z = C1988t.m8417y(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f11573g0;
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: l0 */
    private boolean m15681l0() {
        FloatingActionButton h0 = m15678h0();
        return h0 != null && h0.mo13302o();
    }

    /* renamed from: m0 */
    private void m15682m0(int i, boolean z) {
        if (C1988t.m8361S(this)) {
            Animator animator = this.f11576j0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m15681l0()) {
                i = 0;
                z = false;
            }
            m15675e0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f11576j0 = animatorSet;
            animatorSet.addListener(new C4157c());
            this.f11576j0.start();
        }
    }

    /* renamed from: n0 */
    private void m15683n0(int i) {
        if (this.f11577k0 != i && C1988t.m8361S(this)) {
            Animator animator = this.f11575i0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f11578l0 == 1) {
                m15674d0(i, arrayList);
            } else {
                mo12681c0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f11575i0 = animatorSet;
            animatorSet.addListener(new C4154a());
            this.f11575i0.start();
        }
    }

    /* renamed from: o0 */
    private void m15684o0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m15681l0()) {
                m15686r0(actionMenuView, 0, false);
            } else {
                m15686r0(actionMenuView, this.f11577k0, this.f11582p0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m15685p0() {
        getTopEdgeTreatment().mo12729m(getFabTranslationX());
        View i0 = m15679i0();
        this.f11574h0.mo22820U((!this.f11582p0 || !m15681l0()) ? 0.0f : 1.0f);
        if (i0 != null) {
            i0.setTranslationY(getFabTranslationY());
            i0.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m15686r0(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo12689j0(actionMenuView, i, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo12681c0(int i, List<Animator> list) {
        FloatingActionButton h0 = m15678h0();
        if (h0 != null && !h0.mo13301n()) {
            m15677g0();
            h0.mo13299l(new C4155b(i));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f11574h0.mo22810D();
    }

    public Behavior getBehavior() {
        if (this.f11583q0 == null) {
            this.f11583q0 = new Behavior();
        }
        return this.f11583q0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo12721d();
    }

    public int getFabAlignmentMode() {
        return this.f11577k0;
    }

    public int getFabAnimationMode() {
        return this.f11578l0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo12722e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo12723f();
    }

    public boolean getHideOnScroll() {
        return this.f11579m0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public int mo12689j0(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C1988t.m8417y(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0184e) && (((Toolbar.C0184e) childAt.getLayoutParams()).f215a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8994h.m29991f(this, this.f11574h0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m15673b0();
            m15685p0();
        }
        m15684o0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4161g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4161g gVar = (C4161g) parcelable;
        super.onRestoreInstanceState(gVar.mo6726a());
        this.f11577k0 = gVar.f11603p;
        this.f11582p0 = gVar.f11604q;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C4161g gVar = new C4161g(super.onSaveInstanceState());
        gVar.f11603p = this.f11577k0;
        gVar.f11604q = this.f11582p0;
        return gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean mo12691q0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo12724g()) {
            return false;
        }
        getTopEdgeTreatment().mo12728l(f);
        this.f11574h0.invalidateSelf();
        return true;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C1164a.m4551o(this.f11574h0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo12725i(f);
            this.f11574h0.invalidateSelf();
            m15685p0();
        }
    }

    public void setElevation(float f) {
        this.f11574h0.mo22818S(f);
        getBehavior().mo12669G(this, this.f11574h0.mo22808A() - this.f11574h0.mo22843z());
    }

    public void setFabAlignmentMode(int i) {
        m15683n0(i);
        m15682m0(i, this.f11582p0);
        this.f11577k0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f11578l0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo12726j(f);
            this.f11574h0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo12727k(f);
            this.f11574h0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f11579m0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
