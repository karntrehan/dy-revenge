package androidx.camera.core.impl;

import androidx.camera.core.impl.C0809g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.c1 */
public final class C0788c1 {

    /* renamed from: a */
    public static final C0809g1.C0810a<Integer> f2357a = C0809g1.C0810a.m3180a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: b */
    public static final C0809g1.C0810a<Integer> f2358b = C0809g1.C0810a.m3180a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: c */
    final List<C0820i1> f2359c;

    /* renamed from: d */
    final C0809g1 f2360d;

    /* renamed from: e */
    final int f2361e;

    /* renamed from: f */
    final List<C0783b0> f2362f;

    /* renamed from: g */
    private final boolean f2363g;

    /* renamed from: h */
    private final C0891u2 f2364h;

    /* renamed from: androidx.camera.core.impl.c1$a */
    public static final class C0789a {

        /* renamed from: a */
        private final Set<C0820i1> f2365a;

        /* renamed from: b */
        private C0922z1 f2366b;

        /* renamed from: c */
        private int f2367c;

        /* renamed from: d */
        private List<C0783b0> f2368d;

        /* renamed from: e */
        private boolean f2369e;

        /* renamed from: f */
        private C0791c2 f2370f;

        public C0789a() {
            this.f2365a = new HashSet();
            this.f2366b = C0714a2.m2954J();
            this.f2367c = -1;
            this.f2368d = new ArrayList();
            this.f2369e = false;
            this.f2370f = C0791c2.m3136f();
        }

        private C0789a(C0788c1 c1Var) {
            HashSet hashSet = new HashSet();
            this.f2365a = hashSet;
            this.f2366b = C0714a2.m2954J();
            this.f2367c = -1;
            this.f2368d = new ArrayList();
            this.f2369e = false;
            this.f2370f = C0791c2.m3136f();
            hashSet.addAll(c1Var.f2359c);
            this.f2366b = C0714a2.m2955K(c1Var.f2360d);
            this.f2367c = c1Var.f2361e;
            this.f2368d.addAll(c1Var.mo2951b());
            this.f2369e = c1Var.mo2956g();
            this.f2370f = C0791c2.m3137g(c1Var.mo2954e());
        }

        /* renamed from: j */
        public static C0789a m3119j(C0908x2<?> x2Var) {
            C0790b o = x2Var.mo2504o((C0790b) null);
            if (o != null) {
                C0789a aVar = new C0789a();
                o.mo2471a(x2Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + x2Var.mo2506t(x2Var.toString()));
        }

        /* renamed from: k */
        public static C0789a m3120k(C0788c1 c1Var) {
            return new C0789a(c1Var);
        }

        /* renamed from: a */
        public void mo2957a(Collection<C0783b0> collection) {
            for (C0783b0 c : collection) {
                mo2959c(c);
            }
        }

        /* renamed from: b */
        public void mo2958b(C0891u2 u2Var) {
            this.f2370f.mo2971e(u2Var);
        }

        /* renamed from: c */
        public void mo2959c(C0783b0 b0Var) {
            if (!this.f2368d.contains(b0Var)) {
                this.f2368d.add(b0Var);
            }
        }

        /* renamed from: d */
        public <T> void mo2960d(C0809g1.C0810a<T> aVar, T t) {
            this.f2366b.mo2814q(aVar, t);
        }

        /* renamed from: e */
        public void mo2961e(C0809g1 g1Var) {
            for (C0809g1.C0810a next : g1Var.mo2496c()) {
                Object d = this.f2366b.mo2497d(next, null);
                Object a = g1Var.mo2494a(next);
                if (d instanceof C0914y1) {
                    ((C0914y1) d).mo3169a(((C0914y1) a).mo3170c());
                } else {
                    if (a instanceof C0914y1) {
                        a = ((C0914y1) a).clone();
                    }
                    this.f2366b.mo2813l(next, g1Var.mo2498e(next), a);
                }
            }
        }

        /* renamed from: f */
        public void mo2962f(C0820i1 i1Var) {
            this.f2365a.add(i1Var);
        }

        /* renamed from: g */
        public void mo2963g(String str, Object obj) {
            this.f2370f.mo2972h(str, obj);
        }

        /* renamed from: h */
        public C0788c1 mo2964h() {
            return new C0788c1(new ArrayList(this.f2365a), C0802e2.m3155H(this.f2366b), this.f2367c, this.f2368d, this.f2369e, C0891u2.m3515b(this.f2370f));
        }

        /* renamed from: i */
        public void mo2965i() {
            this.f2365a.clear();
        }

        /* renamed from: l */
        public Set<C0820i1> mo2966l() {
            return this.f2365a;
        }

        /* renamed from: m */
        public int mo2967m() {
            return this.f2367c;
        }

        /* renamed from: n */
        public void mo2968n(C0809g1 g1Var) {
            this.f2366b = C0714a2.m2955K(g1Var);
        }

        /* renamed from: o */
        public void mo2969o(int i) {
            this.f2367c = i;
        }

        /* renamed from: p */
        public void mo2970p(boolean z) {
            this.f2369e = z;
        }
    }

    /* renamed from: androidx.camera.core.impl.c1$b */
    public interface C0790b {
        /* renamed from: a */
        void mo2471a(C0908x2<?> x2Var, C0789a aVar);
    }

    C0788c1(List<C0820i1> list, C0809g1 g1Var, int i, List<C0783b0> list2, boolean z, C0891u2 u2Var) {
        this.f2359c = list;
        this.f2360d = g1Var;
        this.f2361e = i;
        this.f2362f = Collections.unmodifiableList(list2);
        this.f2363g = z;
        this.f2364h = u2Var;
    }

    /* renamed from: a */
    public static C0788c1 m3112a() {
        return new C0789a().mo2964h();
    }

    /* renamed from: b */
    public List<C0783b0> mo2951b() {
        return this.f2362f;
    }

    /* renamed from: c */
    public C0809g1 mo2952c() {
        return this.f2360d;
    }

    /* renamed from: d */
    public List<C0820i1> mo2953d() {
        return Collections.unmodifiableList(this.f2359c);
    }

    /* renamed from: e */
    public C0891u2 mo2954e() {
        return this.f2364h;
    }

    /* renamed from: f */
    public int mo2955f() {
        return this.f2361e;
    }

    /* renamed from: g */
    public boolean mo2956g() {
        return this.f2363g;
    }
}
