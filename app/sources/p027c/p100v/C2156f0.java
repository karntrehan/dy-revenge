package p027c.p100v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import p027c.p100v.C2214x;

/* renamed from: c.v.f0 */
class C2156f0 {

    /* renamed from: c.v.f0$a */
    private static class C2157a extends AnimatorListenerAdapter implements C2214x.C2220f {

        /* renamed from: a */
        private final View f6331a;

        /* renamed from: b */
        private final View f6332b;

        /* renamed from: c */
        private final int f6333c;

        /* renamed from: d */
        private final int f6334d;

        /* renamed from: e */
        private int[] f6335e;

        /* renamed from: f */
        private float f6336f;

        /* renamed from: g */
        private float f6337g;

        /* renamed from: h */
        private final float f6338h;

        /* renamed from: i */
        private final float f6339i;

        C2157a(View view, View view2, int i, int i2, float f, float f2) {
            this.f6332b = view;
            this.f6331a = view2;
            this.f6333c = i - Math.round(view.getTranslationX());
            this.f6334d = i2 - Math.round(view.getTranslationY());
            this.f6338h = f;
            this.f6339i = f2;
            int i3 = C2192s.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f6335e = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public void mo7208a(C2214x xVar) {
        }

        /* renamed from: b */
        public void mo7238b(C2214x xVar) {
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            this.f6332b.setTranslationX(this.f6338h);
            this.f6332b.setTranslationY(this.f6339i);
            xVar.mo7177Z(this);
        }

        /* renamed from: d */
        public void mo7239d(C2214x xVar) {
        }

        /* renamed from: e */
        public void mo7240e(C2214x xVar) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f6335e == null) {
                this.f6335e = new int[2];
            }
            this.f6335e[0] = Math.round(((float) this.f6333c) + this.f6332b.getTranslationX());
            this.f6335e[1] = Math.round(((float) this.f6334d) + this.f6332b.getTranslationY());
            this.f6331a.setTag(C2192s.transition_position, this.f6335e);
        }

        public void onAnimationPause(Animator animator) {
            this.f6336f = this.f6332b.getTranslationX();
            this.f6337g = this.f6332b.getTranslationY();
            this.f6332b.setTranslationX(this.f6338h);
            this.f6332b.setTranslationY(this.f6339i);
        }

        public void onAnimationResume(Animator animator) {
            this.f6332b.setTranslationX(this.f6336f);
            this.f6332b.setTranslationY(this.f6337g);
        }
    }

    /* renamed from: a */
    static Animator m9164a(View view, C2144d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, C2214x xVar) {
        float f5;
        float f6;
        View view2 = view;
        C2144d0 d0Var2 = d0Var;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) d0Var2.f6291b.getTag(C2192s.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C2157a aVar = new C2157a(view, d0Var2.f6291b, round, round2, translationX, translationY);
        xVar.mo7180c(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C2123a.m9063a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
