package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f12345b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C4346a extends AnimatorListenerAdapter {
        C4346a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f12345b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo13776H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f12345b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo13778J(view, view2, z, z3);
        this.f12345b = J;
        J.addListener(new C4346a());
        this.f12345b.start();
        if (!z2) {
            this.f12345b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo13778J(View view, View view2, boolean z, boolean z2);
}
