package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C1254t;
import p027c.p064i.p069g.C1849b;
import p027c.p064i.p072j.C1986r;
import p027c.p086o.C2060a;
import p027c.p086o.C2061b;

/* renamed from: androidx.fragment.app.d */
class C1216d {

    /* renamed from: androidx.fragment.app.d$a */
    static class C1217a implements C1849b.C1850a {

        /* renamed from: a */
        final /* synthetic */ Fragment f3468a;

        C1217a(Fragment fragment) {
            this.f3468a = fragment;
        }

        /* renamed from: a */
        public void mo4026a() {
            if (this.f3468a.mo3918o() != null) {
                View o = this.f3468a.mo3918o();
                this.f3468a.mo3911l1((View) null);
                o.clearAnimation();
            }
            this.f3468a.mo3914m1((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    static class C1218b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3469a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3470b;

        /* renamed from: c */
        final /* synthetic */ C1254t.C1261g f3471c;

        /* renamed from: d */
        final /* synthetic */ C1849b f3472d;

        /* renamed from: androidx.fragment.app.d$b$a */
        class C1219a implements Runnable {
            C1219a() {
            }

            public void run() {
                if (C1218b.this.f3470b.mo3918o() != null) {
                    C1218b.this.f3470b.mo3911l1((View) null);
                    C1218b bVar = C1218b.this;
                    bVar.f3471c.mo4169a(bVar.f3470b, bVar.f3472d);
                }
            }
        }

        C1218b(ViewGroup viewGroup, Fragment fragment, C1254t.C1261g gVar, C1849b bVar) {
            this.f3469a = viewGroup;
            this.f3470b = fragment;
            this.f3471c = gVar;
            this.f3472d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3469a.post(new C1219a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    static class C1220c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3474a;

        /* renamed from: b */
        final /* synthetic */ View f3475b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3476c;

        /* renamed from: d */
        final /* synthetic */ C1254t.C1261g f3477d;

        /* renamed from: e */
        final /* synthetic */ C1849b f3478e;

        C1220c(ViewGroup viewGroup, View view, Fragment fragment, C1254t.C1261g gVar, C1849b bVar) {
            this.f3474a = viewGroup;
            this.f3475b = view;
            this.f3476c = fragment;
            this.f3477d = gVar;
            this.f3478e = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3474a.endViewTransition(this.f3475b);
            Animator p = this.f3476c.mo3923p();
            this.f3476c.mo3914m1((Animator) null);
            if (p != null && this.f3474a.indexOfChild(this.f3475b) < 0) {
                this.f3477d.mo4169a(this.f3476c, this.f3478e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    static class C1221d {

        /* renamed from: a */
        public final Animation f3479a;

        /* renamed from: b */
        public final Animator f3480b;

        C1221d(Animator animator) {
            this.f3479a = null;
            this.f3480b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C1221d(Animation animation) {
            this.f3479a = animation;
            this.f3480b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    private static class C1222e extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f3481f;

        /* renamed from: o */
        private final View f3482o;

        /* renamed from: p */
        private boolean f3483p;

        /* renamed from: q */
        private boolean f3484q;

        /* renamed from: r */
        private boolean f3485r = true;

        C1222e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3481f = viewGroup;
            this.f3482o = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3485r = true;
            if (this.f3483p) {
                return !this.f3484q;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3483p = true;
                C1986r.m8331a(this.f3481f, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3485r = true;
            if (this.f3483p) {
                return !this.f3484q;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3483p = true;
                C1986r.m8331a(this.f3481f, this);
            }
            return true;
        }

        public void run() {
            if (this.f3483p || !this.f3485r) {
                this.f3481f.endViewTransition(this.f3482o);
                this.f3484q = true;
                return;
            }
            this.f3485r = false;
            this.f3481f.post(this);
        }
    }

    /* renamed from: a */
    static void m4920a(Fragment fragment, C1221d dVar, C1254t.C1261g gVar) {
        View view = fragment.f3377U;
        ViewGroup viewGroup = fragment.f3376T;
        viewGroup.startViewTransition(view);
        C1849b bVar = new C1849b();
        bVar.mo6351c(new C1217a(fragment));
        gVar.mo4170b(fragment, bVar);
        if (dVar.f3479a != null) {
            C1222e eVar = new C1222e(dVar.f3479a, viewGroup, view);
            fragment.mo3911l1(fragment.f3377U);
            eVar.setAnimationListener(new C1218b(viewGroup, fragment, gVar, bVar));
            fragment.f3377U.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3480b;
        fragment.mo3914m1(animator);
        animator.addListener(new C1220c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.f3377U);
        animator.start();
    }

    /* renamed from: b */
    static C1221d m4921b(Context context, C1223e eVar, Fragment fragment, boolean z) {
        int c;
        int B = fragment.mo3840B();
        int A = fragment.mo3838A();
        boolean z2 = false;
        fragment.mo3926q1(0);
        View c2 = eVar.mo3955c(fragment.f3367K);
        if (c2 != null) {
            int i = C2061b.visible_removing_fragment_view_tag;
            if (c2.getTag(i) != null) {
                c2.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup = fragment.f3376T;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation i0 = fragment.mo3902i0(B, z, A);
        if (i0 != null) {
            return new C1221d(i0);
        }
        Animator j0 = fragment.mo3904j0(B, z, A);
        if (j0 != null) {
            return new C1221d(j0);
        }
        if (A != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(A));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, A);
                    if (loadAnimation != null) {
                        return new C1221d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, A);
                    if (loadAnimator != null) {
                        return new C1221d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, A);
                        if (loadAnimation2 != null) {
                            return new C1221d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (B != 0 && (c = m4922c(B, z)) >= 0) {
            return new C1221d(AnimationUtils.loadAnimation(context, c));
        }
        return null;
    }

    /* renamed from: c */
    private static int m4922c(int i, boolean z) {
        if (i == 4097) {
            return z ? C2060a.fragment_open_enter : C2060a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C2060a.fragment_fade_enter : C2060a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C2060a.fragment_close_enter : C2060a.fragment_close_exit;
    }
}
