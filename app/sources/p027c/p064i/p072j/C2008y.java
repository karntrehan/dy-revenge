package p027c.p064i.p072j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: c.i.j.y */
public final class C2008y {

    /* renamed from: a */
    private WeakReference<View> f5780a;

    /* renamed from: b */
    Runnable f5781b = null;

    /* renamed from: c */
    Runnable f5782c = null;

    /* renamed from: d */
    int f5783d = -1;

    /* renamed from: c.i.j.y$a */
    class C2009a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C2012z f5784a;

        /* renamed from: b */
        final /* synthetic */ View f5785b;

        C2009a(C2012z zVar, View view) {
            this.f5784a = zVar;
            this.f5785b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5784a.mo1224a(this.f5785b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f5784a.mo324b(this.f5785b);
        }

        public void onAnimationStart(Animator animator) {
            this.f5784a.mo325c(this.f5785b);
        }
    }

    /* renamed from: c.i.j.y$b */
    class C2010b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1910b0 f5787a;

        /* renamed from: b */
        final /* synthetic */ View f5788b;

        C2010b(C1910b0 b0Var, View view) {
            this.f5787a = b0Var;
            this.f5788b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5787a.mo410a(this.f5788b);
        }
    }

    /* renamed from: c.i.j.y$c */
    static class C2011c implements C2012z {

        /* renamed from: a */
        C2008y f5790a;

        /* renamed from: b */
        boolean f5791b;

        C2011c(C2008y yVar) {
            this.f5790a = yVar;
        }

        /* renamed from: a */
        public void mo1224a(View view) {
            Object tag = view.getTag(2113929216);
            C2012z zVar = tag instanceof C2012z ? (C2012z) tag : null;
            if (zVar != null) {
                zVar.mo1224a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: c.i.j.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo324b(android.view.View r4) {
            /*
                r3 = this;
                c.i.j.y r0 = r3.f5790a
                int r0 = r0.f5783d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                c.i.j.y r0 = r3.f5790a
                r0.f5783d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f5791b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                c.i.j.y r0 = r3.f5790a
                java.lang.Runnable r1 = r0.f5782c
                if (r1 == 0) goto L_0x0024
                r0.f5782c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p027c.p064i.p072j.C2012z
                if (r1 == 0) goto L_0x0031
                r2 = r0
                c.i.j.z r2 = (p027c.p064i.p072j.C2012z) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo324b(r4)
            L_0x0036:
                r4 = 1
                r3.f5791b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p072j.C2008y.C2011c.mo324b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: c.i.j.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo325c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f5791b = r0
                c.i.j.y r0 = r3.f5790a
                int r0 = r0.f5783d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                c.i.j.y r0 = r3.f5790a
                java.lang.Runnable r2 = r0.f5781b
                if (r2 == 0) goto L_0x001a
                r0.f5781b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p027c.p064i.p072j.C2012z
                if (r2 == 0) goto L_0x0027
                r1 = r0
                c.i.j.z r1 = (p027c.p064i.p072j.C2012z) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo325c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p072j.C2008y.C2011c.mo325c(android.view.View):void");
        }
    }

    C2008y(View view) {
        this.f5780a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m8486g(View view, C2012z zVar) {
        if (zVar != null) {
            view.animate().setListener(new C2009a(zVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C2008y mo6696a(float f) {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo6697b() {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long mo6698c() {
        View view = (View) this.f5780a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public C2008y mo6699d(long j) {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C2008y mo6700e(Interpolator interpolator) {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C2008y mo6701f(C2012z zVar) {
        View view = (View) this.f5780a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, zVar);
                zVar = new C2011c(this);
            }
            m8486g(view, zVar);
        }
        return this;
    }

    /* renamed from: h */
    public C2008y mo6702h(long j) {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C2008y mo6703i(C1910b0 b0Var) {
        View view = (View) this.f5780a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C2010b bVar = null;
            if (b0Var != null) {
                bVar = new C2010b(b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: j */
    public void mo6704j() {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C2008y mo6705k(float f) {
        View view = (View) this.f5780a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
