package p174e.p319f.p320a.p363d.p370p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p174e.p319f.p320a.p363d.p370p.C9045d;

/* renamed from: e.f.a.d.p.a */
public final class C9041a {

    /* renamed from: e.f.a.d.p.a$a */
    static class C9042a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C9045d f24855a;

        C9042a(C9045d dVar) {
            this.f24855a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24855a.mo22981b();
        }

        public void onAnimationStart(Animator animator) {
            this.f24855a.mo22980a();
        }
    }

    /* renamed from: a */
    public static Animator m30156a(C9045d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C9045d.C9048c.f24860a, C9045d.C9047b.f24858a, new C9045d.C9050e[]{new C9045d.C9050e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C9045d.C9050e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f24864c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m30157b(C9045d dVar) {
        return new C9042a(dVar);
    }
}
