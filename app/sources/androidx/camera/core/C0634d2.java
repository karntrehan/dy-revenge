package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0805f1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0839m1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0894v1;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0922z1;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.p009e3.C0656i;
import androidx.camera.core.p009e3.C0658k;
import androidx.camera.core.p009e3.p010p.p011e.C0671d;
import androidx.core.util.C1177h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.d2 */
public final class C0634d2 extends C0608a3 {

    /* renamed from: l */
    public static final C0638d f2058l = new C0638d();

    /* renamed from: m */
    private static final Boolean f2059m = null;

    /* renamed from: n */
    final C0644e2 f2060n;

    /* renamed from: o */
    private final Object f2061o = new Object();

    /* renamed from: p */
    private C0635a f2062p;

    /* renamed from: q */
    private C0820i1 f2063q;

    /* renamed from: androidx.camera.core.d2$a */
    public interface C0635a {
        /* renamed from: a */
        void mo2657a(ImageProxy imageProxy);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.d2$b */
    public @interface C0636b {
    }

    /* renamed from: androidx.camera.core.d2$c */
    public static final class C0637c implements C0877s1.C0878a<C0637c>, C0908x2.C0909a<C0634d2, C0839m1, C0637c> {

        /* renamed from: a */
        private final C0714a2 f2064a;

        public C0637c() {
            this(C0714a2.m2954J());
        }

        private C0637c(C0714a2 a2Var) {
            Class<C0634d2> cls = C0634d2.class;
            this.f2064a = a2Var;
            Class cls2 = (Class) a2Var.mo2497d(C0656i.f2116t, null);
            if (cls2 == null || cls2.equals(cls)) {
                mo2665m(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        /* renamed from: f */
        static C0637c m2671f(C0809g1 g1Var) {
            return new C0637c(C0714a2.m2955K(g1Var));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f2064a;
        }

        /* renamed from: e */
        public C0634d2 mo2658e() {
            if (mo1887b().mo2497d(C0877s1.f2545f, null) == null || mo1887b().mo2497d(C0877s1.f2547h, null) == null) {
                return new C0634d2(mo2603c());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: g */
        public C0839m1 mo2603c() {
            return new C0839m1(C0802e2.m3155H(this.f2064a));
        }

        /* renamed from: h */
        public C0637c mo2660h(Executor executor) {
            mo1887b().mo2814q(C0658k.f2117u, executor);
            return this;
        }

        /* renamed from: i */
        public C0637c mo2661i(int i) {
            mo1887b().mo2814q(C0839m1.f2463w, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C0637c mo2662j(Size size) {
            mo1887b().mo2814q(C0877s1.f2548i, size);
            return this;
        }

        /* renamed from: k */
        public C0637c mo2663k(int i) {
            mo1887b().mo2814q(C0908x2.f2605p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C0637c mo2664l(int i) {
            mo1887b().mo2814q(C0877s1.f2545f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C0637c mo2665m(Class<C0634d2> cls) {
            mo1887b().mo2814q(C0656i.f2116t, cls);
            if (mo1887b().mo2497d(C0656i.f2115s, null) == null) {
                mo2666n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: n */
        public C0637c mo2666n(String str) {
            mo1887b().mo2814q(C0656i.f2115s, str);
            return this;
        }

        /* renamed from: o */
        public C0637c mo2602a(Size size) {
            mo1887b().mo2814q(C0877s1.f2547h, size);
            return this;
        }

        /* renamed from: p */
        public C0637c mo2604d(int i) {
            mo1887b().mo2814q(C0877s1.f2546g, Integer.valueOf(i));
            return this;
        }
    }

    /* renamed from: androidx.camera.core.d2$d */
    public static final class C0638d {

        /* renamed from: a */
        private static final Size f2065a;

        /* renamed from: b */
        private static final C0839m1 f2066b;

        static {
            Size size = new Size(640, 480);
            f2065a = size;
            f2066b = new C0637c().mo2662j(size).mo2663k(1).mo2664l(0).mo2603c();
        }

        /* renamed from: a */
        public C0839m1 mo2669a() {
            return f2066b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.d2$e */
    public @interface C0639e {
    }

    C0634d2(C0839m1 m1Var) {
        super(m1Var);
        if (((C0839m1) mo2571f()).mo3021G(0) == 1) {
            this.f2060n = new C0682f2();
        } else {
            this.f2060n = new C0687g2(m1Var.mo2707A(C0744a.m3045b()));
        }
        this.f2060n.mo2680u(mo2651P());
        this.f2060n.mo2681v(mo2652R());
    }

    /* renamed from: Q */
    private boolean m2647Q(C0899w0 w0Var) {
        return mo2652R() && mo2575j(w0Var) % 180 != 0;
    }

    /* renamed from: S */
    static /* synthetic */ void m2648S(C0991v2 v2Var, C0991v2 v2Var2) {
        v2Var.mo3270n();
        if (v2Var2 != null) {
            v2Var2.mo3270n();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void mo2653U(String str, C0839m1 m1Var, Size size, C0840m2 m2Var, C0840m2.C0845e eVar) {
        mo2646K();
        this.f2060n.mo2673e();
        if (mo2580o(str)) {
            mo2565I(mo2647L(str, m1Var, size).mo3048m());
            mo2584s();
        }
    }

    /* renamed from: Y */
    private void m2651Y() {
        C0899w0 c = mo2568c();
        if (c != null) {
            this.f2060n.mo2683x(mo2575j(c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C0908x2<?> mo2558A(C0888u0 u0Var, C0908x2.C0909a<?, ?, ?> aVar) {
        Boolean O = mo2650O();
        boolean a = u0Var.mo2459g().mo3014a(C0671d.class);
        C0644e2 e2Var = this.f2060n;
        if (O != null) {
            a = O.booleanValue();
        }
        e2Var.mo2679t(a);
        return super.mo2558A(u0Var, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Size mo2561D(Size size) {
        mo2565I(mo2647L(mo2570e(), (C0839m1) mo2571f(), size).mo3048m());
        return size;
    }

    /* renamed from: F */
    public void mo2562F(Matrix matrix) {
        this.f2060n.mo2684y(matrix);
    }

    /* renamed from: H */
    public void mo2564H(Rect rect) {
        super.mo2564H(rect);
        this.f2060n.mo2685z(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo2646K() {
        C0743m.m3042a();
        C0820i1 i1Var = this.f2063q;
        if (i1Var != null) {
            i1Var.mo3001a();
            this.f2063q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C0840m2.C0842b mo2647L(String str, C0839m1 m1Var, Size size) {
        C0743m.m3042a();
        Executor executor = (Executor) C1177h.m4583e(m1Var.mo2707A(C0744a.m3045b()));
        boolean z = true;
        int N = mo2648M() == 1 ? mo2649N() : 4;
        C0991v2 v2Var = m1Var.mo3023I() != null ? new C0991v2(m1Var.mo3023I().mo3186a(size.getWidth(), size.getHeight(), mo2573h(), N, 0)) : new C0991v2(C0935l2.m3670a(size.getWidth(), size.getHeight(), mo2573h(), N));
        boolean Q = mo2568c() != null ? m2647Q(mo2568c()) : false;
        int height = Q ? size.getHeight() : size.getWidth();
        int width = Q ? size.getWidth() : size.getHeight();
        int i = mo2651P() == 2 ? 1 : 35;
        boolean z2 = mo2573h() == 35 && mo2651P() == 2;
        if (mo2573h() != 35 || ((mo2568c() == null || mo2575j(mo2568c()) == 0) && !Boolean.TRUE.equals(mo2650O()))) {
            z = false;
        }
        C0991v2 v2Var2 = (z2 || z) ? new C0991v2(C0935l2.m3670a(height, width, i, v2Var.mo2639f())) : null;
        if (v2Var2 != null) {
            this.f2060n.mo2682w(v2Var2);
        }
        m2651Y();
        v2Var.mo2643j(this.f2060n, executor);
        C0840m2.C0842b o = C0840m2.C0842b.m3318o(m1Var);
        C0820i1 i1Var = this.f2063q;
        if (i1Var != null) {
            i1Var.mo3001a();
        }
        C0894v1 v1Var = new C0894v1(v2Var.mo2634b(), size, mo2573h());
        this.f2063q = v1Var;
        v1Var.mo3007g().mo2919e(new C0932l(v2Var, v2Var2), C0744a.m3047d());
        o.mo3046k(this.f2063q);
        o.mo3041f(new C0928k(this, str, m1Var, size));
        return o;
    }

    /* renamed from: M */
    public int mo2648M() {
        return ((C0839m1) mo2571f()).mo3021G(0);
    }

    /* renamed from: N */
    public int mo2649N() {
        return ((C0839m1) mo2571f()).mo3022H(6);
    }

    /* renamed from: O */
    public Boolean mo2650O() {
        return ((C0839m1) mo2571f()).mo3024J(f2059m);
    }

    /* renamed from: P */
    public int mo2651P() {
        return ((C0839m1) mo2571f()).mo3025K(1);
    }

    /* renamed from: R */
    public boolean mo2652R() {
        return ((C0839m1) mo2571f()).mo3026L(Boolean.FALSE).booleanValue();
    }

    /* renamed from: W */
    public void mo2654W(Executor executor, C0635a aVar) {
        synchronized (this.f2061o) {
            this.f2060n.mo2678s(executor, new C0924j(aVar));
            if (this.f2062p == null) {
                mo2582q();
            }
            this.f2062p = aVar;
        }
    }

    /* renamed from: X */
    public void mo2655X(int i) {
        if (mo2563G(i)) {
            m2651Y();
        }
    }

    /* renamed from: g */
    public C0908x2<?> mo2572g(boolean z, C0915y2 y2Var) {
        C0809g1 a = y2Var.mo2009a(C0915y2.C0917b.IMAGE_ANALYSIS);
        if (z) {
            a = C0805f1.m3166b(a, f2058l.mo2669a());
        }
        if (a == null) {
            return null;
        }
        return mo2578m(a).mo2603c();
    }

    /* renamed from: m */
    public C0908x2.C0909a<?, ?, ?> mo2578m(C0809g1 g1Var) {
        return C0637c.m2671f(g1Var);
    }

    public String toString() {
        return "ImageAnalysis:" + mo2574i();
    }

    /* renamed from: w */
    public void mo2588w() {
        this.f2060n.mo2672d();
    }

    /* renamed from: z */
    public void mo2591z() {
        mo2646K();
        this.f2060n.mo2674h();
    }
}
