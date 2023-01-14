package com.swmansion.reanimated.p441k;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p027c.p100v.C2144d0;
import p027c.p100v.C2199v0;
import p027c.p100v.C2214x;
import p027c.p100v.C2222y;

/* renamed from: com.swmansion.reanimated.k.b */
public class C9933b extends C2199v0 {

    /* renamed from: com.swmansion.reanimated.k.b$a */
    class C9934a extends C2222y {

        /* renamed from: a */
        final /* synthetic */ View f26582a;

        /* renamed from: b */
        final /* synthetic */ float f26583b;

        /* renamed from: c */
        final /* synthetic */ float f26584c;

        C9934a(View view, float f, float f2) {
            this.f26582a = view;
            this.f26583b = f;
            this.f26584c = f2;
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            this.f26582a.setScaleX(this.f26583b);
            this.f26582a.setScaleY(this.f26584c);
            xVar.mo7177Z(this);
        }
    }

    /* renamed from: v0 */
    private Animator m33836v0(View view, float f, float f2, C2144d0 d0Var) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float f3 = scaleX * f;
        float f4 = scaleX * f2;
        float f5 = f * scaleY;
        float f6 = f2 * scaleY;
        if (d0Var != null) {
            Float f7 = (Float) d0Var.f6290a.get("scale:scaleX");
            Float f8 = (Float) d0Var.f6290a.get("scale:scaleY");
            if (!(f7 == null || f7.floatValue() == scaleX)) {
                f3 = f7.floatValue();
            }
            if (!(f8 == null || f8.floatValue() == scaleY)) {
                f5 = f8.floatValue();
            }
        }
        view.setScaleX(f3);
        view.setScaleY(f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{f3, f4}), ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{f5, f6})});
        mo7180c(new C9934a(view, scaleX, scaleY));
        return animatorSet;
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        super.mo7191l(d0Var);
        d0Var.f6290a.put("scale:scaleX", Float.valueOf(d0Var.f6291b.getScaleX()));
        d0Var.f6290a.put("scale:scaleY", Float.valueOf(d0Var.f6291b.getScaleY()));
    }

    /* renamed from: q0 */
    public Animator mo7264q0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2) {
        return m33836v0(view, 0.0f, 1.0f, d0Var);
    }

    /* renamed from: s0 */
    public Animator mo7265s0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2) {
        return m33836v0(view, 1.0f, 0.0f, d0Var);
    }
}
