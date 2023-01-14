package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.p009e3.p010p.p012f.C0676c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.m2 */
public final class C0840m2 {

    /* renamed from: a */
    private final List<C0820i1> f2468a;

    /* renamed from: b */
    private final List<CameraDevice.StateCallback> f2469b;

    /* renamed from: c */
    private final List<CameraCaptureSession.StateCallback> f2470c;

    /* renamed from: d */
    private final List<C0783b0> f2471d;

    /* renamed from: e */
    private final List<C0843c> f2472e;

    /* renamed from: f */
    private final C0788c1 f2473f;

    /* renamed from: androidx.camera.core.impl.m2$a */
    static class C0841a {

        /* renamed from: a */
        final Set<C0820i1> f2474a = new LinkedHashSet();

        /* renamed from: b */
        final C0788c1.C0789a f2475b = new C0788c1.C0789a();

        /* renamed from: c */
        final List<CameraDevice.StateCallback> f2476c = new ArrayList();

        /* renamed from: d */
        final List<CameraCaptureSession.StateCallback> f2477d = new ArrayList();

        /* renamed from: e */
        final List<C0843c> f2478e = new ArrayList();

        /* renamed from: f */
        final List<C0783b0> f2479f = new ArrayList();

        C0841a() {
        }
    }

    /* renamed from: androidx.camera.core.impl.m2$b */
    public static class C0842b extends C0841a {
        /* renamed from: o */
        public static C0842b m3318o(C0908x2<?> x2Var) {
            C0844d D = x2Var.mo2493D((C0844d) null);
            if (D != null) {
                C0842b bVar = new C0842b();
                D.mo2000a(x2Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + x2Var.mo2506t(x2Var.toString()));
        }

        /* renamed from: a */
        public void mo3036a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback e : collection) {
                mo3040e(e);
            }
        }

        /* renamed from: b */
        public void mo3037b(Collection<C0783b0> collection) {
            this.f2475b.mo2957a(collection);
        }

        /* renamed from: c */
        public void mo3038c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback j : list) {
                mo3045j(j);
            }
        }

        /* renamed from: d */
        public void mo3039d(C0783b0 b0Var) {
            this.f2475b.mo2959c(b0Var);
            if (!this.f2479f.contains(b0Var)) {
                this.f2479f.add(b0Var);
            }
        }

        /* renamed from: e */
        public void mo3040e(CameraDevice.StateCallback stateCallback) {
            if (!this.f2476c.contains(stateCallback)) {
                this.f2476c.add(stateCallback);
            }
        }

        /* renamed from: f */
        public void mo3041f(C0843c cVar) {
            this.f2478e.add(cVar);
        }

        /* renamed from: g */
        public void mo3042g(C0809g1 g1Var) {
            this.f2475b.mo2961e(g1Var);
        }

        /* renamed from: h */
        public void mo3043h(C0820i1 i1Var) {
            this.f2474a.add(i1Var);
        }

        /* renamed from: i */
        public void mo3044i(C0783b0 b0Var) {
            this.f2475b.mo2959c(b0Var);
        }

        /* renamed from: j */
        public void mo3045j(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f2477d.contains(stateCallback)) {
                this.f2477d.add(stateCallback);
            }
        }

        /* renamed from: k */
        public void mo3046k(C0820i1 i1Var) {
            this.f2474a.add(i1Var);
            this.f2475b.mo2962f(i1Var);
        }

        /* renamed from: l */
        public void mo3047l(String str, Object obj) {
            this.f2475b.mo2963g(str, obj);
        }

        /* renamed from: m */
        public C0840m2 mo3048m() {
            return new C0840m2(new ArrayList(this.f2474a), this.f2476c, this.f2477d, this.f2479f, this.f2478e, this.f2475b.mo2964h());
        }

        /* renamed from: n */
        public void mo3049n() {
            this.f2474a.clear();
            this.f2475b.mo2965i();
        }

        /* renamed from: p */
        public List<C0783b0> mo3050p() {
            return Collections.unmodifiableList(this.f2479f);
        }

        /* renamed from: q */
        public void mo3051q(C0809g1 g1Var) {
            this.f2475b.mo2968n(g1Var);
        }

        /* renamed from: r */
        public void mo3052r(int i) {
            this.f2475b.mo2969o(i);
        }
    }

    /* renamed from: androidx.camera.core.impl.m2$c */
    public interface C0843c {
        /* renamed from: a */
        void mo2601a(C0840m2 m2Var, C0845e eVar);
    }

    /* renamed from: androidx.camera.core.impl.m2$d */
    public interface C0844d {
        /* renamed from: a */
        void mo2000a(C0908x2<?> x2Var, C0842b bVar);
    }

    /* renamed from: androidx.camera.core.impl.m2$e */
    public enum C0845e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: androidx.camera.core.impl.m2$f */
    public static final class C0846f extends C0841a {

        /* renamed from: g */
        private static final List<Integer> f2483g = Arrays.asList(new Integer[]{1, 3});

        /* renamed from: h */
        private final C0676c f2484h = new C0676c();

        /* renamed from: i */
        private boolean f2485i = true;

        /* renamed from: j */
        private boolean f2486j = false;

        /* renamed from: e */
        private int m3338e(int i, int i2) {
            List<Integer> list = f2483g;
            return list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2)) ? i : i2;
        }

        /* renamed from: a */
        public void mo3053a(C0840m2 m2Var) {
            C0788c1 f = m2Var.mo3031f();
            if (f.mo2955f() != -1) {
                this.f2486j = true;
                this.f2475b.mo2969o(m3338e(f.mo2955f(), this.f2475b.mo2967m()));
            }
            this.f2475b.mo2958b(m2Var.mo3031f().mo2954e());
            this.f2476c.addAll(m2Var.mo3027b());
            this.f2477d.addAll(m2Var.mo3032g());
            this.f2475b.mo2957a(m2Var.mo3030e());
            this.f2479f.addAll(m2Var.mo3033h());
            this.f2478e.addAll(m2Var.mo3028c());
            this.f2474a.addAll(m2Var.mo3034i());
            this.f2475b.mo2966l().addAll(f.mo2953d());
            if (!this.f2474a.containsAll(this.f2475b.mo2966l())) {
                C0949o2.m3688a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f2485i = false;
            }
            this.f2475b.mo2961e(f.mo2952c());
        }

        /* renamed from: b */
        public C0840m2 mo3054b() {
            if (this.f2485i) {
                ArrayList arrayList = new ArrayList(this.f2474a);
                this.f2484h.mo2720d(arrayList);
                return new C0840m2(arrayList, this.f2476c, this.f2477d, this.f2479f, this.f2478e, this.f2475b.mo2964h());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        /* renamed from: c */
        public void mo3055c() {
            this.f2474a.clear();
            this.f2475b.mo2965i();
        }

        /* renamed from: d */
        public boolean mo3056d() {
            return this.f2486j && this.f2485i;
        }
    }

    C0840m2(List<C0820i1> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<C0783b0> list4, List<C0843c> list5, C0788c1 c1Var) {
        this.f2468a = list;
        this.f2469b = Collections.unmodifiableList(list2);
        this.f2470c = Collections.unmodifiableList(list3);
        this.f2471d = Collections.unmodifiableList(list4);
        this.f2472e = Collections.unmodifiableList(list5);
        this.f2473f = c1Var;
    }

    /* renamed from: a */
    public static C0840m2 m3308a() {
        return new C0840m2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C0788c1.C0789a().mo2964h());
    }

    /* renamed from: b */
    public List<CameraDevice.StateCallback> mo3027b() {
        return this.f2469b;
    }

    /* renamed from: c */
    public List<C0843c> mo3028c() {
        return this.f2472e;
    }

    /* renamed from: d */
    public C0809g1 mo3029d() {
        return this.f2473f.mo2952c();
    }

    /* renamed from: e */
    public List<C0783b0> mo3030e() {
        return this.f2473f.mo2951b();
    }

    /* renamed from: f */
    public C0788c1 mo3031f() {
        return this.f2473f;
    }

    /* renamed from: g */
    public List<CameraCaptureSession.StateCallback> mo3032g() {
        return this.f2470c;
    }

    /* renamed from: h */
    public List<C0783b0> mo3033h() {
        return this.f2471d;
    }

    /* renamed from: i */
    public List<C0820i1> mo3034i() {
        return Collections.unmodifiableList(this.f2468a);
    }

    /* renamed from: j */
    public int mo3035j() {
        return this.f2473f.mo2955f();
    }
}
