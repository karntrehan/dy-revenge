package p027c.p064i.p072j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p027c.p064i.C1825b;
import p027c.p064i.p065d.C1828b;
import p027c.p064i.p072j.C1929e0;

/* renamed from: c.i.j.d0 */
public final class C1916d0 {

    /* renamed from: a */
    private C1926e f5605a;

    /* renamed from: c.i.j.d0$a */
    public static final class C1917a {

        /* renamed from: a */
        private final C1828b f5606a;

        /* renamed from: b */
        private final C1828b f5607b;

        private C1917a(WindowInsetsAnimation.Bounds bounds) {
            this.f5606a = C1924d.m8040f(bounds);
            this.f5607b = C1924d.m8039e(bounds);
        }

        public C1917a(C1828b bVar, C1828b bVar2) {
            this.f5606a = bVar;
            this.f5607b = bVar2;
        }

        /* renamed from: d */
        public static C1917a m8018d(WindowInsetsAnimation.Bounds bounds) {
            return new C1917a(bounds);
        }

        /* renamed from: a */
        public C1828b mo6460a() {
            return this.f5606a;
        }

        /* renamed from: b */
        public C1828b mo6461b() {
            return this.f5607b;
        }

        /* renamed from: c */
        public WindowInsetsAnimation.Bounds mo6462c() {
            return C1924d.m8038d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f5606a + " upper=" + this.f5607b + "}";
        }
    }

    /* renamed from: c.i.j.d0$b */
    public static abstract class C1918b {

        /* renamed from: a */
        WindowInsets f5608a;

        /* renamed from: b */
        private final int f5609b;

        public C1918b(int i) {
            this.f5609b = i;
        }

        /* renamed from: a */
        public final int mo6464a() {
            return this.f5609b;
        }

        /* renamed from: b */
        public abstract void mo6465b(C1916d0 d0Var);

        /* renamed from: c */
        public void mo6466c(C1916d0 d0Var) {
        }

        /* renamed from: d */
        public abstract C1929e0 mo6467d(C1929e0 e0Var, List<C1916d0> list);

        /* renamed from: e */
        public C1917a mo6468e(C1916d0 d0Var, C1917a aVar) {
            return aVar;
        }
    }

    /* renamed from: c.i.j.d0$c */
    private static class C1919c extends C1926e {

        /* renamed from: c.i.j.d0$c$a */
        private static class C1920a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            final C1918b f5610a;

            /* renamed from: b */
            private C1929e0 f5611b;

            /* renamed from: c.i.j.d0$c$a$a */
            class C1921a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                final /* synthetic */ C1916d0 f5612a;

                /* renamed from: b */
                final /* synthetic */ C1929e0 f5613b;

                /* renamed from: c */
                final /* synthetic */ C1929e0 f5614c;

                /* renamed from: d */
                final /* synthetic */ int f5615d;

                /* renamed from: e */
                final /* synthetic */ View f5616e;

                C1921a(C1916d0 d0Var, C1929e0 e0Var, C1929e0 e0Var2, int i, View view) {
                    this.f5612a = d0Var;
                    this.f5613b = e0Var;
                    this.f5614c = e0Var2;
                    this.f5615d = i;
                    this.f5616e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f5612a.mo6459d(valueAnimator.getAnimatedFraction());
                    C1919c.m8032i(this.f5616e, C1919c.m8036m(this.f5613b, this.f5614c, this.f5612a.mo6458b(), this.f5615d), Collections.singletonList(this.f5612a));
                }
            }

            /* renamed from: c.i.j.d0$c$a$b */
            class C1922b extends AnimatorListenerAdapter {

                /* renamed from: a */
                final /* synthetic */ C1916d0 f5618a;

                /* renamed from: b */
                final /* synthetic */ View f5619b;

                C1922b(C1916d0 d0Var, View view) {
                    this.f5618a = d0Var;
                    this.f5619b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f5618a.mo6459d(1.0f);
                    C1919c.m8030g(this.f5619b, this.f5618a);
                }
            }

            /* renamed from: c.i.j.d0$c$a$c */
            class C1923c implements Runnable {

                /* renamed from: f */
                final /* synthetic */ View f5621f;

                /* renamed from: o */
                final /* synthetic */ C1916d0 f5622o;

                /* renamed from: p */
                final /* synthetic */ C1917a f5623p;

                /* renamed from: q */
                final /* synthetic */ ValueAnimator f5624q;

                C1923c(View view, C1916d0 d0Var, C1917a aVar, ValueAnimator valueAnimator) {
                    this.f5621f = view;
                    this.f5622o = d0Var;
                    this.f5623p = aVar;
                    this.f5624q = valueAnimator;
                }

                public void run() {
                    C1919c.m8033j(this.f5621f, this.f5622o, this.f5623p);
                    this.f5624q.start();
                }
            }

            C1920a(View view, C1918b bVar) {
                this.f5610a = bVar;
                C1929e0 F = C1988t.m8343F(view);
                this.f5611b = F != null ? new C1929e0.C1931b(F).mo6501a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f5611b = C1929e0.m8058v(windowInsets2, view2);
                } else {
                    C1929e0 v = C1929e0.m8058v(windowInsets2, view2);
                    if (this.f5611b == null) {
                        this.f5611b = C1988t.m8343F(view);
                    }
                    if (this.f5611b != null) {
                        C1918b l = C1919c.m8035l(view);
                        if (l != null && Objects.equals(l.f5608a, windowInsets2)) {
                            return C1919c.m8034k(view, windowInsets);
                        }
                        int d = C1919c.m8027d(v, this.f5611b);
                        if (d == 0) {
                            return C1919c.m8034k(view, windowInsets);
                        }
                        C1929e0 e0Var = this.f5611b;
                        C1916d0 d0Var = new C1916d0(d, new DecelerateInterpolator(), 160);
                        d0Var.mo6459d(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(d0Var.mo6457a());
                        C1917a e = C1919c.m8028e(v, e0Var, d);
                        C1919c.m8031h(view2, d0Var, windowInsets2, false);
                        duration.addUpdateListener(new C1921a(d0Var, v, e0Var, d, view));
                        duration.addListener(new C1922b(d0Var, view2));
                        C1986r.m8331a(view2, new C1923c(view, d0Var, e, duration));
                    }
                    this.f5611b = v;
                }
                return C1919c.m8034k(view, windowInsets);
            }
        }

        C1919c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: d */
        static int m8027d(C1929e0 e0Var, C1929e0 e0Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!e0Var.mo6486f(i2).equals(e0Var2.mo6486f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        /* renamed from: e */
        static C1917a m8028e(C1929e0 e0Var, C1929e0 e0Var2, int i) {
            C1828b f = e0Var.mo6486f(i);
            C1828b f2 = e0Var2.mo6486f(i);
            return new C1917a(C1828b.m7761b(Math.min(f.f5455b, f2.f5455b), Math.min(f.f5456c, f2.f5456c), Math.min(f.f5457d, f2.f5457d), Math.min(f.f5458e, f2.f5458e)), C1828b.m7761b(Math.max(f.f5455b, f2.f5455b), Math.max(f.f5456c, f2.f5456c), Math.max(f.f5457d, f2.f5457d), Math.max(f.f5458e, f2.f5458e)));
        }

        /* renamed from: f */
        private static View.OnApplyWindowInsetsListener m8029f(View view, C1918b bVar) {
            return new C1920a(view, bVar);
        }

        /* renamed from: g */
        static void m8030g(View view, C1916d0 d0Var) {
            C1918b l = m8035l(view);
            if (l != null) {
                l.mo6465b(d0Var);
                if (l.mo6464a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m8030g(viewGroup.getChildAt(i), d0Var);
                }
            }
        }

        /* renamed from: h */
        static void m8031h(View view, C1916d0 d0Var, WindowInsets windowInsets, boolean z) {
            C1918b l = m8035l(view);
            if (l != null) {
                l.f5608a = windowInsets;
                if (!z) {
                    l.mo6466c(d0Var);
                    z = l.mo6464a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m8031h(viewGroup.getChildAt(i), d0Var, windowInsets, z);
                }
            }
        }

        /* renamed from: i */
        static void m8032i(View view, C1929e0 e0Var, List<C1916d0> list) {
            C1918b l = m8035l(view);
            if (l != null) {
                e0Var = l.mo6467d(e0Var, list);
                if (l.mo6464a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m8032i(viewGroup.getChildAt(i), e0Var, list);
                }
            }
        }

        /* renamed from: j */
        static void m8033j(View view, C1916d0 d0Var, C1917a aVar) {
            C1918b l = m8035l(view);
            if (l != null) {
                l.mo6468e(d0Var, aVar);
                if (l.mo6464a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m8033j(viewGroup.getChildAt(i), d0Var, aVar);
                }
            }
        }

        /* renamed from: k */
        static WindowInsets m8034k(View view, WindowInsets windowInsets) {
            return view.getTag(C1825b.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: l */
        static C1918b m8035l(View view) {
            Object tag = view.getTag(C1825b.tag_window_insets_animation_callback);
            if (tag instanceof C1920a) {
                return ((C1920a) tag).f5610a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: m */
        static C1929e0 m8036m(C1929e0 e0Var, C1929e0 e0Var2, float f, int i) {
            C1828b bVar;
            C1929e0.C1931b bVar2 = new C1929e0.C1931b(e0Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar = e0Var.mo6486f(i2);
                } else {
                    C1828b f2 = e0Var.mo6486f(i2);
                    C1828b f3 = e0Var2.mo6486f(i2);
                    float f4 = 1.0f - f;
                    bVar = C1929e0.m8056m(f2, (int) (((double) (((float) (f2.f5455b - f3.f5455b)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f5456c - f3.f5456c)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f5457d - f3.f5457d)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f5458e - f3.f5458e)) * f4)) + 0.5d));
                }
                bVar2.mo6502b(i2, bVar);
            }
            return bVar2.mo6501a();
        }

        /* renamed from: n */
        static void m8037n(View view, C1918b bVar) {
            Object tag = view.getTag(C1825b.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(C1825b.tag_window_insets_animation_callback, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener f = m8029f(view, bVar);
            view.setTag(C1825b.tag_window_insets_animation_callback, f);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(f);
            }
        }
    }

    /* renamed from: c.i.j.d0$d */
    private static class C1924d extends C1926e {

        /* renamed from: e */
        private final WindowInsetsAnimation f5626e;

        /* renamed from: c.i.j.d0$d$a */
        private static class C1925a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            private final C1918b f5627a;

            /* renamed from: b */
            private List<C1916d0> f5628b;

            /* renamed from: c */
            private ArrayList<C1916d0> f5629c;

            /* renamed from: d */
            private final HashMap<WindowInsetsAnimation, C1916d0> f5630d = new HashMap<>();

            C1925a(C1918b bVar) {
                super(bVar.mo6464a());
                this.f5627a = bVar;
            }

            /* renamed from: a */
            private C1916d0 m8045a(WindowInsetsAnimation windowInsetsAnimation) {
                C1916d0 d0Var = this.f5630d.get(windowInsetsAnimation);
                if (d0Var != null) {
                    return d0Var;
                }
                C1916d0 e = C1916d0.m8014e(windowInsetsAnimation);
                this.f5630d.put(windowInsetsAnimation, e);
                return e;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f5627a.mo6465b(m8045a(windowInsetsAnimation));
                this.f5630d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f5627a.mo6466c(m8045a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C1916d0> arrayList = this.f5629c;
                if (arrayList == null) {
                    ArrayList<C1916d0> arrayList2 = new ArrayList<>(list.size());
                    this.f5629c = arrayList2;
                    this.f5628b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    C1916d0 a = m8045a(windowInsetsAnimation);
                    a.mo6459d(windowInsetsAnimation.getFraction());
                    this.f5629c.add(a);
                }
                return this.f5627a.mo6467d(C1929e0.m8057u(windowInsets), this.f5628b).mo6500t();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f5627a.mo6468e(m8045a(windowInsetsAnimation), C1917a.m8018d(bounds)).mo6462c();
            }
        }

        C1924d(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }

        C1924d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f5626e = windowInsetsAnimation;
        }

        /* renamed from: d */
        public static WindowInsetsAnimation.Bounds m8038d(C1917a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.mo6460a().mo6322e(), aVar.mo6461b().mo6322e());
        }

        /* renamed from: e */
        public static C1828b m8039e(WindowInsetsAnimation.Bounds bounds) {
            return C1828b.m7763d(bounds.getUpperBound());
        }

        /* renamed from: f */
        public static C1828b m8040f(WindowInsetsAnimation.Bounds bounds) {
            return C1828b.m7763d(bounds.getLowerBound());
        }

        /* renamed from: g */
        public static void m8041g(View view, C1918b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new C1925a(bVar) : null);
        }

        /* renamed from: a */
        public long mo6473a() {
            return this.f5626e.getDurationMillis();
        }

        /* renamed from: b */
        public float mo6474b() {
            return this.f5626e.getInterpolatedFraction();
        }

        /* renamed from: c */
        public void mo6475c(float f) {
            this.f5626e.setFraction(f);
        }
    }

    /* renamed from: c.i.j.d0$e */
    private static class C1926e {

        /* renamed from: a */
        private final int f5631a;

        /* renamed from: b */
        private float f5632b;

        /* renamed from: c */
        private final Interpolator f5633c;

        /* renamed from: d */
        private final long f5634d;

        C1926e(int i, Interpolator interpolator, long j) {
            this.f5631a = i;
            this.f5633c = interpolator;
            this.f5634d = j;
        }

        /* renamed from: a */
        public long mo6473a() {
            return this.f5634d;
        }

        /* renamed from: b */
        public float mo6474b() {
            Interpolator interpolator = this.f5633c;
            return interpolator != null ? interpolator.getInterpolation(this.f5632b) : this.f5632b;
        }

        /* renamed from: c */
        public void mo6475c(float f) {
            this.f5632b = f;
        }
    }

    public C1916d0(int i, Interpolator interpolator, long j) {
        C1926e cVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            cVar = new C1924d(i, interpolator, j);
        } else if (i2 >= 21) {
            cVar = new C1919c(i, interpolator, j);
        } else {
            this.f5605a = new C1926e(0, interpolator, j);
            return;
        }
        this.f5605a = cVar;
    }

    private C1916d0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5605a = new C1924d(windowInsetsAnimation);
        }
    }

    /* renamed from: c */
    static void m8013c(View view, C1918b bVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C1924d.m8041g(view, bVar);
        } else if (i >= 21) {
            C1919c.m8037n(view, bVar);
        }
    }

    /* renamed from: e */
    static C1916d0 m8014e(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1916d0(windowInsetsAnimation);
    }

    /* renamed from: a */
    public long mo6457a() {
        return this.f5605a.mo6473a();
    }

    /* renamed from: b */
    public float mo6458b() {
        return this.f5605a.mo6474b();
    }

    /* renamed from: d */
    public void mo6459d(float f) {
        this.f5605a.mo6475c(f);
    }
}
