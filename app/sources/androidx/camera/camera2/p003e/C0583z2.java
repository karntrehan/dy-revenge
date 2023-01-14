package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p008f.C0599k;
import androidx.camera.core.C0634d2;
import androidx.camera.core.C0693h2;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0967s2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0806f2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0826j1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.core.impl.C0855o2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.z2 */
final class C0583z2 implements C0526q2 {

    /* renamed from: a */
    private static List<C0820i1> f1906a = new ArrayList();

    /* renamed from: b */
    private static int f1907b = 0;

    /* renamed from: c */
    private final C0850n2 f1908c;

    /* renamed from: d */
    private final C0569x1 f1909d;

    /* renamed from: e */
    final Executor f1910e;

    /* renamed from: f */
    private final ScheduledExecutorService f1911f;

    /* renamed from: g */
    private final C0517p2 f1912g = new C0517p2();

    /* renamed from: h */
    private List<C0820i1> f1913h = new ArrayList();

    /* renamed from: i */
    private C0840m2 f1914i;

    /* renamed from: j */
    private C0342d2 f1915j;

    /* renamed from: k */
    private C0840m2 f1916k;

    /* renamed from: l */
    private boolean f1917l = false;

    /* renamed from: m */
    private C0587d f1918m;

    /* renamed from: n */
    private volatile C0788c1 f1919n = null;

    /* renamed from: o */
    volatile boolean f1920o = false;

    /* renamed from: p */
    private final C0588e f1921p;

    /* renamed from: q */
    private C0599k f1922q = new C0599k.C0600a().mo2535a();

    /* renamed from: r */
    private C0599k f1923r = new C0599k.C0600a().mo2535a();

    /* renamed from: s */
    private int f1924s = 0;

    /* renamed from: androidx.camera.camera2.e.z2$a */
    class C0584a implements C0765d<Void> {
        C0584a() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C0949o2.m3691d("ProcessingCaptureSession", "open session failed ", th);
            C0583z2.this.close();
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.e.z2$b */
    class C0585b implements C0850n2.C0851a {

        /* renamed from: a */
        final /* synthetic */ C0788c1 f1926a;

        C0585b(C0788c1 c1Var) {
            this.f1926a = c1Var;
        }
    }

    /* renamed from: androidx.camera.camera2.e.z2$c */
    static /* synthetic */ class C0586c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1928a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.e.z2$d[] r0 = androidx.camera.camera2.p003e.C0583z2.C0587d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1928a = r0
                androidx.camera.camera2.e.z2$d r1 = androidx.camera.camera2.p003e.C0583z2.C0587d.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1928a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.e.z2$d r1 = androidx.camera.camera2.p003e.C0583z2.C0587d.SESSION_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1928a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.e.z2$d r1 = androidx.camera.camera2.p003e.C0583z2.C0587d.ON_CAPTURE_SESSION_STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1928a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.e.z2$d r1 = androidx.camera.camera2.p003e.C0583z2.C0587d.ON_CAPTURE_SESSION_ENDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1928a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.e.z2$d r1 = androidx.camera.camera2.p003e.C0583z2.C0587d.CLOSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0583z2.C0586c.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.e.z2$d */
    private enum C0587d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    /* renamed from: androidx.camera.camera2.e.z2$e */
    private static class C0588e implements C0850n2.C0851a {

        /* renamed from: a */
        private List<C0783b0> f1935a = Collections.emptyList();

        /* renamed from: b */
        private final Executor f1936b;

        C0588e(Executor executor) {
            this.f1936b = executor;
        }

        /* renamed from: a */
        public void mo2515a(List<C0783b0> list) {
            this.f1935a = list;
        }
    }

    C0583z2(C0850n2 n2Var, C0569x1 x1Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f1908c = n2Var;
        this.f1909d = x1Var;
        this.f1910e = executor;
        this.f1911f = scheduledExecutorService;
        this.f1918m = C0587d.UNINITIALIZED;
        this.f1921p = new C0588e(executor);
        int i = f1907b;
        f1907b = i + 1;
        this.f1924s = i;
        C0949o2.m3688a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f1924s + ")");
    }

    /* renamed from: h */
    private static void m2421h(List<C0788c1> list) {
        for (C0788c1 b : list) {
            for (C0783b0 a : b.mo2951b()) {
                a.mo1919a();
            }
        }
    }

    /* renamed from: i */
    private static List<C0855o2> m2422i(List<C0820i1> list) {
        ArrayList arrayList = new ArrayList();
        for (C0820i1 next : list) {
            C1177h.m4580b(next instanceof C0855o2, "Surface must be SessionProcessorSurface");
            arrayList.add((C0855o2) next);
        }
        return arrayList;
    }

    /* renamed from: j */
    private boolean m2423j(List<C0788c1> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (C0788c1 f : list) {
            if (f.mo2955f() != 2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo2510l() {
        C0826j1.m3239a(this.f1913h);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ C9172b mo2511o(C0840m2 m2Var, CameraDevice cameraDevice, C0349e3 e3Var, List list) {
        C0949o2.m3688a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f1924s + ")");
        if (this.f1918m == C0587d.CLOSED) {
            return C0768f.m3079e(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        C0806f2 f2Var = null;
        if (list.contains((Object) null)) {
            return C0768f.m3079e(new C0820i1.C0821a("Surface closed", m2Var.mo3034i().get(list.indexOf((Object) null))));
        }
        try {
            C0826j1.m3240b(this.f1913h);
            C0806f2 f2Var2 = null;
            C0806f2 f2Var3 = null;
            for (int i = 0; i < m2Var.mo3034i().size(); i++) {
                C0820i1 i1Var = m2Var.mo3034i().get(i);
                if (Objects.equals(i1Var.mo3003c(), C0967s2.class)) {
                    f2Var = C0806f2.m3167a(i1Var.mo3006f().get(), new Size(i1Var.mo3004d().getWidth(), i1Var.mo3004d().getHeight()), i1Var.mo3005e());
                } else if (Objects.equals(i1Var.mo3003c(), C0693h2.class)) {
                    f2Var2 = C0806f2.m3167a(i1Var.mo3006f().get(), new Size(i1Var.mo3004d().getWidth(), i1Var.mo3004d().getHeight()), i1Var.mo3005e());
                } else if (Objects.equals(i1Var.mo3003c(), C0634d2.class)) {
                    f2Var3 = C0806f2.m3167a(i1Var.mo3006f().get(), new Size(i1Var.mo3004d().getWidth(), i1Var.mo3004d().getHeight()), i1Var.mo3005e());
                }
            }
            this.f1918m = C0587d.SESSION_INITIALIZED;
            C0949o2.m3698k("ProcessingCaptureSession", "== initSession (id=" + this.f1924s + ")");
            C0840m2 b = this.f1908c.mo3074b(this.f1909d, f2Var, f2Var2, f2Var3);
            this.f1916k = b;
            b.mo3034i().get(0).mo3007g().mo2919e(new C0581z0(this), C0744a.m3044a());
            for (C0820i1 next : this.f1916k.mo3034i()) {
                f1906a.add(next);
                next.mo3007g().mo2919e(new C0312a1(next), this.f1910e);
            }
            C0840m2.C0846f fVar = new C0840m2.C0846f();
            fVar.mo3053a(m2Var);
            fVar.mo3055c();
            fVar.mo3053a(this.f1916k);
            C1177h.m4580b(fVar.mo3056d(), "Cannot transform the SessionConfig");
            C9172b<Void> g = this.f1912g.mo2253g(fVar.mo3054b(), (CameraDevice) C1177h.m4583e(cameraDevice), e3Var);
            C0768f.m3075a(g, new C0584a(), this.f1910e);
            return g;
        } catch (C0820i1.C0821a e) {
            return C0768f.m3079e(e);
        }
    }

    /* renamed from: p */
    private /* synthetic */ Void m2427p(Void voidR) {
        mo2513r(this.f1912g);
        return null;
    }

    /* renamed from: s */
    private void m2428s(C0599k kVar, C0599k kVar2) {
        C0304b.C0305a aVar = new C0304b.C0305a();
        aVar.mo1888d(kVar);
        aVar.mo1888d(kVar2);
        this.f1908c.mo3075c(aVar.mo1886a());
    }

    /* renamed from: a */
    public void mo2246a() {
        C0949o2.m3688a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f1924s + ")");
        if (this.f1919n != null) {
            for (C0783b0 a : this.f1919n.mo2951b()) {
                a.mo1919a();
            }
            this.f1919n = null;
        }
    }

    /* renamed from: b */
    public C9172b<Void> mo2247b(boolean z) {
        C1177h.m4586h(this.f1918m == C0587d.CLOSED, "release() can only be called in CLOSED state");
        C0949o2.m3688a("ProcessingCaptureSession", "release (id=" + this.f1924s + ")");
        return this.f1912g.mo2247b(z);
    }

    /* renamed from: c */
    public List<C0788c1> mo2248c() {
        if (this.f1919n == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(new C0788c1[]{this.f1919n});
    }

    public void close() {
        C0949o2.m3688a("ProcessingCaptureSession", "close (id=" + this.f1924s + ") state=" + this.f1918m);
        int i = C0586c.f1928a[this.f1918m.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.f1908c.mo3077e();
                C0342d2 d2Var = this.f1915j;
                if (d2Var != null) {
                    d2Var.mo1990a();
                }
                this.f1918m = C0587d.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
                this.f1918m = C0587d.CLOSED;
                this.f1912g.close();
            }
        }
        this.f1908c.mo3078f();
        this.f1918m = C0587d.CLOSED;
        this.f1912g.close();
    }

    /* renamed from: d */
    public void mo2250d(List<C0788c1> list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || !m2423j(list)) {
                m2421h(list);
            } else if (this.f1919n != null || this.f1920o) {
                m2421h(list);
            } else {
                C0788c1 c1Var = list.get(0);
                C0949o2.m3688a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f1924s + ") + state =" + this.f1918m);
                int i = C0586c.f1928a[this.f1918m.ordinal()];
                if (i == 1 || i == 2) {
                    this.f1919n = c1Var;
                } else if (i == 3) {
                    this.f1920o = true;
                    C0599k a = C0599k.C0600a.m2485d(c1Var.mo2952c()).mo2535a();
                    this.f1923r = a;
                    m2428s(this.f1922q, a);
                    this.f1908c.mo3076d(new C0585b(c1Var));
                } else if (i == 4 || i == 5) {
                    C0949o2.m3688a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f1918m);
                    m2421h(list);
                }
            }
        }
    }

    /* renamed from: e */
    public C0840m2 mo2251e() {
        return this.f1914i;
    }

    /* renamed from: f */
    public void mo2252f(C0840m2 m2Var) {
        C0949o2.m3688a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f1924s + ")");
        this.f1914i = m2Var;
        if (m2Var != null) {
            this.f1921p.mo2515a(m2Var.mo3030e());
            if (this.f1918m == C0587d.ON_CAPTURE_SESSION_STARTED) {
                C0599k a = C0599k.C0600a.m2485d(m2Var.mo3029d()).mo2535a();
                this.f1922q = a;
                m2428s(a, this.f1923r);
                if (!this.f1917l) {
                    this.f1908c.mo3079g(this.f1921p);
                    this.f1917l = true;
                }
            }
        }
    }

    /* renamed from: g */
    public C9172b<Void> mo2253g(C0840m2 m2Var, CameraDevice cameraDevice, C0349e3 e3Var) {
        boolean z = this.f1918m == C0587d.UNINITIALIZED;
        C1177h.m4580b(z, "Invalid state state:" + this.f1918m);
        C1177h.m4580b(m2Var.mo3034i().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C0949o2.m3688a("ProcessingCaptureSession", "open (id=" + this.f1924s + ")");
        List<C0820i1> i = m2Var.mo3034i();
        this.f1913h = i;
        return C0766e.m3068a(C0826j1.m3245g(i, false, 5000, this.f1910e, this.f1911f)).mo2920f(new C0573y0(this, m2Var, cameraDevice, e3Var), this.f1910e).mo2918d(new C0327b1(this), this.f1910e);
    }

    /* renamed from: q */
    public /* synthetic */ Void mo2512q(Void voidR) {
        m2427p(voidR);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2513r(C0517p2 p2Var) {
        boolean z = this.f1918m == C0587d.SESSION_INITIALIZED;
        C1177h.m4580b(z, "Invalid state state:" + this.f1918m);
        C0342d2 d2Var = new C0342d2(p2Var, m2422i(this.f1916k.mo3034i()));
        this.f1915j = d2Var;
        this.f1908c.mo3073a(d2Var);
        this.f1918m = C0587d.ON_CAPTURE_SESSION_STARTED;
        C0840m2 m2Var = this.f1914i;
        if (m2Var != null) {
            mo2252f(m2Var);
        }
        if (this.f1919n != null) {
            List asList = Arrays.asList(new C0788c1[]{this.f1919n});
            this.f1919n = null;
            mo2250d(asList);
        }
    }
}
