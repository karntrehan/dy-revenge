package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p174e.p319f.p320a.p363d.p366l.C9025a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C1087c<V> {

    /* renamed from: a */
    private int f11551a = 0;

    /* renamed from: b */
    private int f11552b = 2;

    /* renamed from: c */
    private int f11553c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f11554d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C4149a extends AnimatorListenerAdapter {
        C4149a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f11554d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private void m15632F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f11554d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C4149a());
    }

    /* renamed from: G */
    public void mo12669G(V v, int i) {
        this.f11553c = i;
        if (this.f11552b == 1) {
            v.setTranslationY((float) (this.f11551a + i));
        }
    }

    /* renamed from: H */
    public void mo12670H(V v) {
        if (this.f11552b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f11554d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f11552b = 1;
            m15632F(v, this.f11551a + this.f11553c, 175, C9025a.f24821c);
        }
    }

    /* renamed from: I */
    public void mo12671I(V v) {
        if (this.f11552b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f11554d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f11552b = 2;
            m15632F(v, 0, 225, C9025a.f24822d);
        }
    }

    /* renamed from: l */
    public boolean mo3484l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f11551a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo3484l(coordinatorLayout, v, i);
    }

    /* renamed from: r */
    public void mo3490r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            mo12670H(v);
        } else if (i2 < 0) {
            mo12671I(v);
        }
    }

    /* renamed from: z */
    public boolean mo3498z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
