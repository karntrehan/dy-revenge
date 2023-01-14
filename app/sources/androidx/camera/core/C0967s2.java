package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0800e1;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0805f1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0813g2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0854o1;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0922z1;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.p009e3.C0648d;
import androidx.camera.core.p009e3.C0656i;
import androidx.camera.core.p009e3.C0660m;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.s2 */
public final class C0967s2 extends C0608a3 {

    /* renamed from: l */
    public static final C0970c f2710l = new C0970c();

    /* renamed from: m */
    private static final Executor f2711m = C0744a.m3047d();

    /* renamed from: n */
    private C0971d f2712n;

    /* renamed from: o */
    private Executor f2713o = f2711m;

    /* renamed from: p */
    private C0820i1 f2714p;

    /* renamed from: q */
    C1011z2 f2715q;

    /* renamed from: r */
    private boolean f2716r = false;

    /* renamed from: s */
    private Size f2717s;

    /* renamed from: androidx.camera.core.s2$a */
    class C0968a extends C0783b0 {

        /* renamed from: a */
        final /* synthetic */ C0854o1 f2718a;

        C0968a(C0854o1 o1Var) {
            this.f2718a = o1Var;
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            super.mo1920b(k0Var);
            if (this.f2718a.mo3081a(new C0648d(k0Var))) {
                C0967s2.this.mo2586u();
            }
        }
    }

    /* renamed from: androidx.camera.core.s2$b */
    public static final class C0969b implements C0908x2.C0909a<C0967s2, C0813g2, C0969b>, C0877s1.C0878a<C0969b> {

        /* renamed from: a */
        private final C0714a2 f2720a;

        public C0969b() {
            this(C0714a2.m2954J());
        }

        private C0969b(C0714a2 a2Var) {
            Class<C0967s2> cls = C0967s2.class;
            this.f2720a = a2Var;
            Class cls2 = (Class) a2Var.mo2497d(C0656i.f2116t, null);
            if (cls2 == null || cls2.equals(cls)) {
                mo3234m(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        /* renamed from: f */
        static C0969b m3767f(C0809g1 g1Var) {
            return new C0969b(C0714a2.m2955K(g1Var));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f2720a;
        }

        /* renamed from: e */
        public C0967s2 mo3227e() {
            if (mo1887b().mo2497d(C0877s1.f2545f, null) == null || mo1887b().mo2497d(C0877s1.f2547h, null) == null) {
                return new C0967s2(mo2603c());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: g */
        public C0813g2 mo2603c() {
            return new C0813g2(C0802e2.m3155H(this.f2720a));
        }

        /* renamed from: h */
        public C0969b mo3229h(C0795d1 d1Var) {
            mo1887b().mo2814q(C0813g2.f2413x, d1Var);
            return this;
        }

        /* renamed from: i */
        public C0969b mo3230i(C0854o1 o1Var) {
            mo1887b().mo2814q(C0813g2.f2412w, o1Var);
            return this;
        }

        /* renamed from: j */
        public C0969b mo3231j(List<Pair<Integer, Size[]>> list) {
            mo1887b().mo2814q(C0877s1.f2550k, list);
            return this;
        }

        /* renamed from: k */
        public C0969b mo3232k(int i) {
            mo1887b().mo2814q(C0908x2.f2605p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C0969b mo3233l(int i) {
            mo1887b().mo2814q(C0877s1.f2545f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C0969b mo3234m(Class<C0967s2> cls) {
            mo1887b().mo2814q(C0656i.f2116t, cls);
            if (mo1887b().mo2497d(C0656i.f2115s, null) == null) {
                mo3235n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: n */
        public C0969b mo3235n(String str) {
            mo1887b().mo2814q(C0656i.f2115s, str);
            return this;
        }

        /* renamed from: o */
        public C0969b mo2602a(Size size) {
            mo1887b().mo2814q(C0877s1.f2547h, size);
            return this;
        }

        /* renamed from: p */
        public C0969b mo2604d(int i) {
            mo1887b().mo2814q(C0877s1.f2546g, Integer.valueOf(i));
            return this;
        }

        /* renamed from: q */
        public C0969b mo3238q(C0608a3.C0610b bVar) {
            mo1887b().mo2814q(C0660m.f2118v, bVar);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.s2$c */
    public static final class C0970c {

        /* renamed from: a */
        private static final C0813g2 f2721a = new C0969b().mo3232k(2).mo3233l(0).mo2603c();

        /* renamed from: a */
        public C0813g2 mo3239a() {
            return f2721a;
        }
    }

    /* renamed from: androidx.camera.core.s2$d */
    public interface C0971d {
        /* renamed from: a */
        void mo2686a(C1011z2 z2Var);
    }

    C0967s2(C0813g2 g2Var) {
        super(g2Var);
    }

    /* renamed from: L */
    private Rect m3748L(Size size) {
        if (mo2579n() != null) {
            return mo2579n();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void mo3222O(String str, C0813g2 g2Var, Size size, C0840m2 m2Var, C0840m2.C0845e eVar) {
        if (mo2580o(str)) {
            mo2565I(mo3220K(str, g2Var, size).mo3048m());
            mo2584s();
        }
    }

    /* renamed from: Q */
    private boolean m3751Q() {
        C1011z2 z2Var = this.f2715q;
        C0971d dVar = this.f2712n;
        if (dVar == null || z2Var == null) {
            return false;
        }
        this.f2713o.execute(new C0925j0(dVar, z2Var));
        return true;
    }

    /* renamed from: R */
    private void m3752R() {
        C0899w0 c = mo2568c();
        C0971d dVar = this.f2712n;
        Rect L = m3748L(this.f2717s);
        C1011z2 z2Var = this.f2715q;
        if (c != null && dVar != null && L != null) {
            z2Var.mo3300q(C1011z2.C1018g.m3947d(L, mo2575j(c), mo3221M()));
        }
    }

    /* renamed from: V */
    private void m3753V(String str, C0813g2 g2Var, Size size) {
        mo2565I(mo3220K(str, g2Var, size).mo3048m());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.camera.core.impl.x2$a<?, ?, ?>, androidx.camera.core.impl.x2$a, androidx.camera.core.z1] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0908x2<?> mo2558A(androidx.camera.core.impl.C0888u0 r3, androidx.camera.core.impl.C0908x2.C0909a<?, ?, ?> r4) {
        /*
            r2 = this;
            androidx.camera.core.impl.z1 r3 = r4.mo1887b()
            androidx.camera.core.impl.g1$a<androidx.camera.core.impl.d1> r0 = androidx.camera.core.impl.C0813g2.f2413x
            r1 = 0
            java.lang.Object r3 = r3.mo2497d(r0, r1)
            if (r3 == 0) goto L_0x0016
            androidx.camera.core.impl.z1 r3 = r4.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r0 = androidx.camera.core.impl.C0863q1.f2513e
            r1 = 35
            goto L_0x001e
        L_0x0016:
            androidx.camera.core.impl.z1 r3 = r4.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r0 = androidx.camera.core.impl.C0863q1.f2513e
            r1 = 34
        L_0x001e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo2814q(r0, r1)
            androidx.camera.core.impl.x2 r3 = r4.mo2603c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0967s2.mo2558A(androidx.camera.core.impl.u0, androidx.camera.core.impl.x2$a):androidx.camera.core.impl.x2");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Size mo2561D(Size size) {
        this.f2717s = size;
        m3753V(mo2570e(), (C0813g2) mo2571f(), this.f2717s);
        return size;
    }

    /* renamed from: H */
    public void mo2564H(Rect rect) {
        super.mo2564H(rect);
        m3752R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C0840m2.C0842b mo3220K(String str, C0813g2 g2Var, Size size) {
        C0813g2 g2Var2 = g2Var;
        Size size2 = size;
        C0743m.m3042a();
        C0840m2.C0842b o = C0840m2.C0842b.m3318o(g2Var);
        C0795d1 G = g2Var2.mo2990G((C0795d1) null);
        C0820i1 i1Var = this.f2714p;
        if (i1Var != null) {
            i1Var.mo3001a();
        }
        C1011z2 z2Var = new C1011z2(size2, mo2568c(), G != null);
        this.f2715q = z2Var;
        if (m3751Q()) {
            m3752R();
        } else {
            this.f2716r = true;
        }
        if (G != null) {
            C0800e1.C0801a aVar = new C0800e1.C0801a();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar.hashCode());
            C0985u2 u2Var = r5;
            C0985u2 u2Var2 = new C0985u2(size.getWidth(), size.getHeight(), g2Var.mo2500j(), new Handler(handlerThread.getLooper()), aVar, G, z2Var.mo3294c(), num);
            o.mo3039d(u2Var.mo3256p());
            u2Var.mo3007g().mo2919e(new C0603a(handlerThread), C0744a.m3044a());
            this.f2714p = u2Var;
            o.mo3047l(num, Integer.valueOf(aVar.mo2980a()));
        } else {
            C0854o1 H = g2Var2.mo2991H((C0854o1) null);
            if (H != null) {
                o.mo3039d(new C0968a(H));
            }
            this.f2714p = z2Var.mo3294c();
        }
        o.mo3046k(this.f2714p);
        o.mo3041f(new C0707i0(this, str, g2Var2, size2));
        return o;
    }

    /* renamed from: M */
    public int mo3221M() {
        return mo2577l();
    }

    /* renamed from: S */
    public void mo3223S(C0971d dVar) {
        mo3224T(f2711m, dVar);
    }

    /* renamed from: T */
    public void mo3224T(Executor executor, C0971d dVar) {
        C0743m.m3042a();
        if (dVar == null) {
            this.f2712n = null;
            mo2583r();
            return;
        }
        this.f2712n = dVar;
        this.f2713o = executor;
        mo2582q();
        if (this.f2716r) {
            if (m3751Q()) {
                m3752R();
                this.f2716r = false;
            }
        } else if (mo2567b() != null) {
            m3753V(mo2570e(), (C0813g2) mo2571f(), mo2567b());
            mo2584s();
        }
    }

    /* renamed from: U */
    public void mo3225U(int i) {
        if (mo2563G(i)) {
            m3752R();
        }
    }

    /* renamed from: g */
    public C0908x2<?> mo2572g(boolean z, C0915y2 y2Var) {
        C0809g1 a = y2Var.mo2009a(C0915y2.C0917b.PREVIEW);
        if (z) {
            a = C0805f1.m3166b(a, f2710l.mo3239a());
        }
        if (a == null) {
            return null;
        }
        return mo2578m(a).mo2603c();
    }

    /* renamed from: m */
    public C0908x2.C0909a<?, ?, ?> mo2578m(C0809g1 g1Var) {
        return C0969b.m3767f(g1Var);
    }

    public String toString() {
        return "Preview:" + mo2574i();
    }

    /* renamed from: z */
    public void mo2591z() {
        C0820i1 i1Var = this.f2714p;
        if (i1Var != null) {
            i1Var.mo3001a();
        }
        this.f2715q = null;
    }
}
