package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p363d.p366l.C9026b;
import p174e.p319f.p320a.p363d.p366l.C9033i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C9033i f12366c = new C9033i(75, 150);

    /* renamed from: d */
    private final C9033i f12367d = new C9033i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C4352a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f12368a;

        /* renamed from: b */
        final /* synthetic */ View f12369b;

        C4352a(boolean z, View view) {
            this.f12368a = z;
            this.f12369b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f12368a) {
                this.f12369b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f12368a) {
                this.f12369b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: K */
    private void m16735K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C9033i iVar = z ? this.f12366c : this.f12367d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo22930a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: D */
    public boolean mo3472D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo3472D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo13778J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m16735K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C9026b.m30121a(animatorSet, arrayList);
        animatorSet.addListener(new C4352a(z, view2));
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo3477e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
