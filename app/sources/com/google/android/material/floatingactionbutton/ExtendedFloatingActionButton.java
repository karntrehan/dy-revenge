package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4264b;
import java.util.List;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p366l.C9032h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C1086b {

    /* renamed from: E */
    private static final int f11924E = C9023j.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: F */
    static final Property<View, Float> f11925F;

    /* renamed from: G */
    static final Property<View, Float> f11926G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final Rect f11927H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C4257d f11928I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C4257d f11929J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C4257d f11930K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C4257d f11931L;

    /* renamed from: M */
    private final CoordinatorLayout.C1087c<ExtendedFloatingActionButton> f11932M;

    /* renamed from: N */
    private boolean f11933N;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C1087c<T> {

        /* renamed from: a */
        private Rect f11934a;

        /* renamed from: b */
        private C4237d f11935b;

        /* renamed from: c */
        private C4237d f11936c;

        /* renamed from: d */
        private boolean f11937d;

        /* renamed from: e */
        private boolean f11938e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f11937d = false;
            this.f11938e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24639V0);
            this.f11937d = obtainStyledAttributes.getBoolean(C9024k.f24644W0, false);
            this.f11938e = obtainStyledAttributes.getBoolean(C9024k.f24649X0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: G */
        private static boolean m16183G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1090f) {
                return ((CoordinatorLayout.C1090f) layoutParams).mo3507f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: H */
        private void m16184H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect l = extendedFloatingActionButton.f11927H;
            if (l != null && l.centerX() > 0 && l.centerY() > 0) {
                CoordinatorLayout.C1090f fVar = (CoordinatorLayout.C1090f) extendedFloatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? l.right : extendedFloatingActionButton.getLeft() <= fVar.leftMargin ? -l.left : 0;
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = l.bottom;
                } else if (extendedFloatingActionButton.getTop() <= fVar.topMargin) {
                    i = -l.top;
                }
                if (i != 0) {
                    C1988t.m8367Y(extendedFloatingActionButton, i);
                }
                if (i2 != 0) {
                    C1988t.m8366X(extendedFloatingActionButton, i2);
                }
            }
        }

        /* renamed from: K */
        private boolean m16185K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f11937d || this.f11938e) && ((CoordinatorLayout.C1090f) extendedFloatingActionButton.getLayoutParams()).mo3506e() == view.getId();
        }

        /* renamed from: M */
        private boolean m16186M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m16185K(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f11934a == null) {
                this.f11934a = new Rect();
            }
            Rect rect = this.f11934a;
            C4264b.m16395a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo13263L(extendedFloatingActionButton);
                return true;
            }
            mo13259E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: N */
        private boolean m16187N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m16185K(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C1090f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo13263L(extendedFloatingActionButton);
                return true;
            }
            mo13259E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo13259E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f11938e;
            extendedFloatingActionButton.m16181m(z ? extendedFloatingActionButton.f11929J : extendedFloatingActionButton.f11930K, z ? this.f11936c : this.f11935b);
        }

        /* renamed from: F */
        public boolean mo3474b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect l = extendedFloatingActionButton.f11927H;
            rect.set(extendedFloatingActionButton.getLeft() + l.left, extendedFloatingActionButton.getTop() + l.top, extendedFloatingActionButton.getRight() - l.right, extendedFloatingActionButton.getBottom() - l.bottom);
            return true;
        }

        /* renamed from: I */
        public boolean mo3480h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m16186M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m16183G(view)) {
                return false;
            } else {
                m16187N(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: J */
        public boolean mo3484l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> r = coordinatorLayout.mo3453r(extendedFloatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m16183G(view) && m16187N(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m16186M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3420I(extendedFloatingActionButton, i);
            m16184H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public void mo13263L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f11938e;
            extendedFloatingActionButton.m16181m(z ? extendedFloatingActionButton.f11928I : extendedFloatingActionButton.f11931L, z ? this.f11936c : this.f11935b);
        }

        /* renamed from: g */
        public void mo3479g(CoordinatorLayout.C1090f fVar) {
            if (fVar.f3045h == 0) {
                fVar.f3045h = 80;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C4234a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f11939a;

        /* renamed from: b */
        final /* synthetic */ C4257d f11940b;

        /* renamed from: c */
        final /* synthetic */ C4237d f11941c;

        C4234a(C4257d dVar, C4237d dVar2) {
            this.f11940b = dVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f11939a = true;
            this.f11940b.mo13414b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f11940b.mo13413a();
            if (!this.f11939a) {
                this.f11940b.mo13421i(this.f11941c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f11940b.onAnimationStart(animator);
            this.f11939a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C4235b extends Property<View, Float> {
        C4235b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C4236c extends Property<View, Float> {
        C4236c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class C4237d {
    }

    static {
        Class<Float> cls = Float.class;
        f11925F = new C4235b(cls, "width");
        f11926G = new C4236c(cls, "height");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m16181m(C4257d dVar, C4237d dVar2) {
        if (!dVar.mo13417e()) {
            if (!m16182n()) {
                dVar.mo13415c();
                dVar.mo13421i(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet g = dVar.mo13419g();
            g.addListener(new C4234a(dVar, dVar2));
            for (Animator.AnimatorListener addListener : dVar.mo13420h()) {
                g.addListener(addListener);
            }
            g.start();
        }
    }

    /* renamed from: n */
    private boolean m16182n() {
        return C1988t.m8361S(this) && !isInEditMode();
    }

    public CoordinatorLayout.C1087c<ExtendedFloatingActionButton> getBehavior() {
        return this.f11932M;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C1988t.m8339D(this), C1988t.m8337C(this)) * 2) + getIconSize();
    }

    public C9032h getExtendMotionSpec() {
        return this.f11929J.mo13416d();
    }

    public C9032h getHideMotionSpec() {
        return this.f11931L.mo13416d();
    }

    public C9032h getShowMotionSpec() {
        return this.f11930K.mo13416d();
    }

    public C9032h getShrinkMotionSpec() {
        return this.f11928I.mo13416d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11933N && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f11933N = false;
            this.f11928I.mo13415c();
        }
    }

    public void setExtendMotionSpec(C9032h hVar) {
        this.f11929J.mo13418f(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C9032h.m30133c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f11933N != z) {
            C4257d dVar = z ? this.f11929J : this.f11928I;
            if (!dVar.mo13417e()) {
                dVar.mo13415c();
            }
        }
    }

    public void setHideMotionSpec(C9032h hVar) {
        this.f11931L.mo13418f(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C9032h.m30133c(getContext(), i));
    }

    public void setShowMotionSpec(C9032h hVar) {
        this.f11930K.mo13418f(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C9032h.m30133c(getContext(), i));
    }

    public void setShrinkMotionSpec(C9032h hVar) {
        this.f11928I.mo13418f(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C9032h.m30133c(getContext(), i));
    }
}
