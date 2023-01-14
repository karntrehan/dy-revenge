package androidx.camera.camera2.p003e;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0473a;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0474b;
import androidx.camera.camera2.p008f.C0596h;
import androidx.camera.camera2.p008f.C0599k;
import androidx.camera.core.C0606a2;
import androidx.camera.core.C0616b2;
import androidx.camera.core.C0938m1;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0793d0;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0823i2;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0868r0;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.u1 */
public class C0542u1 implements C0868r0 {

    /* renamed from: b */
    final C0544b f1744b;

    /* renamed from: c */
    final Executor f1745c;

    /* renamed from: d */
    private final Object f1746d = new Object();

    /* renamed from: e */
    private final C0402g0 f1747e;

    /* renamed from: f */
    private final C0868r0.C0871c f1748f;

    /* renamed from: g */
    private final C0840m2.C0842b f1749g;

    /* renamed from: h */
    private final C0564w2 f1750h;

    /* renamed from: i */
    private final C0371h3 f1751i;

    /* renamed from: j */
    private final C0364g3 f1752j;

    /* renamed from: k */
    private final C0546u2 f1753k;

    /* renamed from: l */
    private final C0596h f1754l;

    /* renamed from: m */
    private final C0313a2 f1755m;

    /* renamed from: n */
    private int f1756n;

    /* renamed from: o */
    private volatile boolean f1757o;

    /* renamed from: p */
    private volatile int f1758p;

    /* renamed from: q */
    private final C0473a f1759q;

    /* renamed from: r */
    private final C0474b f1760r;

    /* renamed from: s */
    private final AtomicLong f1761s;

    /* renamed from: t */
    private volatile C9172b<Void> f1762t;

    /* renamed from: u */
    private int f1763u;

    /* renamed from: v */
    private long f1764v;

    /* renamed from: w */
    private final C0543a f1765w;

    /* renamed from: androidx.camera.camera2.e.u1$a */
    static final class C0543a extends C0783b0 {

        /* renamed from: a */
        Set<C0783b0> f1766a = new HashSet();

        /* renamed from: b */
        Map<C0783b0, Executor> f1767b = new ArrayMap();

        C0543a() {
        }

        /* renamed from: a */
        public void mo1919a() {
            for (C0783b0 next : this.f1766a) {
                try {
                    this.f1767b.get(next).execute(new C0352f(next));
                } catch (RejectedExecutionException e) {
                    C0949o2.m3691d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            for (C0783b0 next : this.f1766a) {
                try {
                    this.f1767b.get(next).execute(new C0345e(next, k0Var));
                } catch (RejectedExecutionException e) {
                    C0949o2.m3691d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        /* renamed from: c */
        public void mo1921c(C0793d0 d0Var) {
            for (C0783b0 next : this.f1766a) {
                try {
                    this.f1767b.get(next).execute(new C0359g(next, d0Var));
                } catch (RejectedExecutionException e) {
                    C0949o2.m3691d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2352d(Executor executor, C0783b0 b0Var) {
            this.f1766a.add(b0Var);
            this.f1767b.put(b0Var, executor);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo2353h(C0783b0 b0Var) {
            this.f1766a.remove(b0Var);
            this.f1767b.remove(b0Var);
        }
    }

    /* renamed from: androidx.camera.camera2.e.u1$b */
    static final class C0544b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<C0545c> f1768a = new HashSet();

        /* renamed from: b */
        private final Executor f1769b;

        C0544b(Executor executor) {
            this.f1769b = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo2355c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (C0545c next : this.f1768a) {
                if (next.mo1922a(totalCaptureResult)) {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f1768a.removeAll(hashSet);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2354a(C0545c cVar) {
            this.f1768a.add(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2356d(C0545c cVar) {
            this.f1768a.remove(cVar);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1769b.execute(new C0365h(this, totalCaptureResult));
        }
    }

    /* renamed from: androidx.camera.camera2.e.u1$c */
    public interface C0545c {
        /* renamed from: a */
        boolean mo1922a(TotalCaptureResult totalCaptureResult);
    }

    C0542u1(C0402g0 g0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, C0868r0.C0871c cVar, C0823i2 i2Var) {
        C0840m2.C0842b bVar = new C0840m2.C0842b();
        this.f1749g = bVar;
        this.f1756n = 0;
        this.f1757o = false;
        this.f1758p = 2;
        this.f1760r = new C0474b();
        this.f1761s = new AtomicLong(0);
        this.f1762t = C0768f.m3081g(null);
        this.f1763u = 1;
        this.f1764v = 0;
        C0543a aVar = new C0543a();
        this.f1765w = aVar;
        this.f1747e = g0Var;
        this.f1748f = cVar;
        this.f1745c = executor;
        C0544b bVar2 = new C0544b(executor);
        this.f1744b = bVar2;
        bVar.mo3052r(this.f1763u);
        bVar.mo3044i(C0509n2.m2046d(bVar2));
        bVar.mo3044i(aVar);
        this.f1753k = new C0546u2(this, g0Var, executor);
        this.f1750h = new C0564w2(this, scheduledExecutorService, executor, i2Var);
        this.f1751i = new C0371h3(this, g0Var, executor);
        this.f1752j = new C0364g3(this, g0Var, executor);
        this.f1759q = new C0473a(i2Var);
        this.f1754l = new C0596h(this, executor);
        this.f1755m = new C0313a2(this, g0Var, i2Var, executor);
        executor.execute(new C0374i(this));
    }

    /* renamed from: C */
    private boolean m2141C() {
        return mo2351z() > 0;
    }

    /* renamed from: D */
    private boolean m2142D(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = (java.lang.Long) ((androidx.camera.core.impl.C0891u2) r4).mo3114c("CameraControlSessionUpdateId");
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m2143E(android.hardware.camera2.TotalCaptureResult r4, long r5) {
        /*
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof androidx.camera.core.impl.C0891u2
            if (r0 == 0) goto L_0x002b
            androidx.camera.core.impl.u2 r4 = (androidx.camera.core.impl.C0891u2) r4
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.mo3114c(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x0021
            return r1
        L_0x0021:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            r4 = 1
            return r4
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0542u1.m2143E(android.hardware.camera2.TotalCaptureResult, long):boolean");
    }

    /* renamed from: G */
    static /* synthetic */ void m2144G() {
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void mo2310I(Executor executor, C0783b0 b0Var) {
        this.f1765w.mo2352d(executor, b0Var);
    }

    /* renamed from: J */
    static /* synthetic */ void m2146J() {
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void mo2311L() {
        mo2336j(this.f1754l.mo2523f());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void mo2312N(C0783b0 b0Var) {
        this.f1765w.mo2353h(b0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ C9172b mo2313P(List list, int i, int i2, int i3, Void voidR) {
        return this.f1755m.mo1906d(list, i, i2, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void mo2314R(C1814b.C1815a aVar) {
        C0768f.m3084j(m2154h0(mo2333g0()), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ Object mo2315T(C1814b.C1815a aVar) {
        this.f1745c.execute(new C0310a(this, aVar));
        return "updateSessionConfigAsync";
    }

    /* renamed from: U */
    static /* synthetic */ boolean m2152U(long j, C1814b.C1815a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m2143E(totalCaptureResult, j)) {
            return false;
        }
        aVar.mo6308c(null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ Object mo2316W(long j, C1814b.C1815a aVar) {
        mo2336j(new C0339d(j, aVar));
        return "waitForSessionUpdateId:" + j;
    }

    /* renamed from: h0 */
    private C9172b<Void> m2154h0(long j) {
        return C1814b.m7736a(new C0498l(this, j));
    }

    /* renamed from: x */
    private int m2155x(int i) {
        int[] iArr = (int[]) this.f1747e.mo2119a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m2142D(i, iArr) ? i : m2142D(1, iArr) ? 1 : 0;
    }

    /* renamed from: A */
    public C0371h3 mo2307A() {
        return this.f1751i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo2308B() {
        synchronized (this.f1746d) {
            this.f1756n++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo2309F() {
        return this.f1757o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo2317X(C0545c cVar) {
        this.f1744b.mo2356d(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo2318Y(C0783b0 b0Var) {
        this.f1745c.execute(new C0325b(this, b0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo2319Z() {
        mo2325c0(1);
    }

    /* renamed from: a */
    public C9172b<List<Void>> mo2320a(List<C0788c1> list, int i, int i2) {
        if (!m2141C()) {
            C0949o2.m3698k("Camera2CameraControlImp", "Camera is not active.");
            return C0768f.m3079e(new C0938m1.C0939a("Camera is not active."));
        }
        return C0766e.m3068a(this.f1762t).mo2920f(new C0493k(this, list, i, mo2341o(), i2), this.f1745c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo2321a0(boolean z) {
        this.f1750h.mo2435E(z);
        this.f1751i.mo2049k(z);
        this.f1752j.mo2028j(z);
        this.f1753k.mo2358b(z);
        this.f1754l.mo2530s(z);
    }

    /* renamed from: b */
    public void mo2322b(C0809g1 g1Var) {
        this.f1754l.mo2520a(C0599k.C0600a.m2485d(g1Var).mo2535a()).mo2919e(C0506n.f1644f, C0744a.m3044a());
    }

    /* renamed from: b0 */
    public void mo2323b0(Rational rational) {
        this.f1750h.mo2436F(rational);
    }

    /* renamed from: c */
    public C9172b<Void> mo2324c(float f) {
        return !m2141C() ? C0768f.m3079e(new C0938m1.C0939a("Camera is not active.")) : C0768f.m3083i(this.f1751i.mo2050l(f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo2325c0(int i) {
        this.f1763u = i;
        this.f1750h.mo2437G(i);
        this.f1755m.mo1905c(this.f1763u);
    }

    /* renamed from: d */
    public Rect mo2326d() {
        return (Rect) C1177h.m4583e((Rect) this.f1747e.mo2119a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo2327d0(List<C0788c1> list) {
        this.f1748f.mo2416b(list);
    }

    /* renamed from: e */
    public void mo2328e(int i) {
        if (!m2141C()) {
            C0949o2.m3698k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f1758p = i;
        this.f1762t = mo2331f0();
    }

    /* renamed from: e0 */
    public void mo2329e0() {
        this.f1745c.execute(new C0515p0(this));
    }

    /* renamed from: f */
    public C9172b<Void> mo2330f(boolean z) {
        return !m2141C() ? C0768f.m3079e(new C0938m1.C0939a("Camera is not active.")) : C0768f.m3083i(this.f1752j.mo2022a(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public C9172b<Void> mo2331f0() {
        return C0768f.m3083i(C1814b.m7736a(new C0331c(this)));
    }

    /* renamed from: g */
    public C0809g1 mo2332g() {
        return this.f1754l.mo2522e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public long mo2333g0() {
        this.f1764v = this.f1761s.getAndIncrement();
        this.f1748f.mo2415a();
        return this.f1764v;
    }

    /* renamed from: h */
    public void mo2334h() {
        this.f1754l.mo2521c().mo2919e(C0502m.f1637f, C0744a.m3044a());
    }

    /* renamed from: i */
    public C9172b<C0616b2> mo2335i(C0606a2 a2Var) {
        return !m2141C() ? C0768f.m3079e(new C0938m1.C0939a("Camera is not active.")) : C0768f.m3083i(this.f1750h.mo2438I(a2Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2336j(C0545c cVar) {
        this.f1744b.mo2354a(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2337k(Executor executor, C0783b0 b0Var) {
        this.f1745c.execute(new C0381j(this, executor, b0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2338l() {
        synchronized (this.f1746d) {
            int i = this.f1756n;
            if (i != 0) {
                this.f1756n = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2339m(boolean z) {
        this.f1757o = z;
        if (!z) {
            C0788c1.C0789a aVar = new C0788c1.C0789a();
            aVar.mo2969o(this.f1763u);
            aVar.mo2970p(true);
            C0304b.C0305a aVar2 = new C0304b.C0305a();
            aVar2.mo1889e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(mo2348v(1)));
            aVar2.mo1889e(CaptureRequest.FLASH_MODE, 0);
            aVar.mo2961e(aVar2.mo1886a());
            mo2327d0(Collections.singletonList(aVar.mo2964h()));
        }
        mo2333g0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Rect mo2340n() {
        return this.f1751i.mo2045c();
    }

    /* renamed from: o */
    public int mo2341o() {
        return this.f1758p;
    }

    /* renamed from: p */
    public C0564w2 mo2342p() {
        return this.f1750h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo2343q() {
        Integer num = (Integer) this.f1747e.mo2119a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo2344r() {
        Integer num = (Integer) this.f1747e.mo2119a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo2345s() {
        Integer num = (Integer) this.f1747e.mo2119a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: t */
    public C0840m2 mo2346t() {
        this.f1749g.mo3052r(this.f1763u);
        this.f1749g.mo3051q(mo2347u());
        Object J = this.f1754l.mo2522e().mo1880J((Object) null);
        if (J != null && (J instanceof Integer)) {
            this.f1749g.mo3047l("Camera2CameraControl", J);
        }
        this.f1749g.mo3047l("CameraControlSessionUpdateId", Long.valueOf(this.f1764v));
        return this.f1749g.mo3048m();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070 A[LOOP:0: B:10:0x006a->B:12:0x0070, LOOP_END] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0809g1 mo2347u() {
        /*
            r7 = this;
            androidx.camera.camera2.d.b$a r0 = new androidx.camera.camera2.d.b$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.mo1889e(r1, r3)
            androidx.camera.camera2.e.w2 r1 = r7.f1750h
            r1.mo2442a(r0)
            androidx.camera.camera2.e.j3.t0.a r1 = r7.f1759q
            r1.mo2216a(r0)
            androidx.camera.camera2.e.h3 r1 = r7.f1751i
            r1.mo2044a(r0)
            boolean r1 = r7.f1757o
            r3 = 2
            if (r1 == 0) goto L_0x002d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.mo1889e(r1, r3)
            goto L_0x0033
        L_0x002d:
            int r1 = r7.f1758p
            if (r1 == 0) goto L_0x0037
            if (r1 == r2) goto L_0x0035
        L_0x0033:
            r1 = 1
            goto L_0x003d
        L_0x0035:
            r1 = 3
            goto L_0x003d
        L_0x0037:
            androidx.camera.camera2.e.j3.t0.b r1 = r7.f1760r
            int r1 = r1.mo2217a(r3)
        L_0x003d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.mo2348v(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.mo1889e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.m2155x(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo1889e(r1, r2)
            androidx.camera.camera2.e.u2 r1 = r7.f1753k
            r1.mo2359c(r0)
            androidx.camera.camera2.f.h r1 = r7.f1754l
            androidx.camera.camera2.d.b r1 = r1.mo2522e()
            java.util.Set r2 = r1.mo2496c()
            java.util.Iterator r2 = r2.iterator()
        L_0x006a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.g1$a r3 = (androidx.camera.core.impl.C0809g1.C0810a) r3
            androidx.camera.core.impl.z1 r4 = r0.mo1887b()
            androidx.camera.core.impl.g1$c r5 = androidx.camera.core.impl.C0809g1.C0812c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.mo2494a(r3)
            r4.mo2813l(r3, r5, r6)
            goto L_0x006a
        L_0x0084:
            androidx.camera.camera2.d.b r0 = r0.mo1886a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0542u1.mo2347u():androidx.camera.core.impl.g1");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo2348v(int i) {
        int[] iArr = (int[]) this.f1747e.mo2119a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m2142D(i, iArr) ? i : m2142D(1, iArr) ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public int mo2349w(int i) {
        int[] iArr = (int[]) this.f1747e.mo2119a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m2142D(i, iArr)) {
            return i;
        }
        if (m2142D(4, iArr)) {
            return 4;
        }
        return m2142D(1, iArr) ? 1 : 0;
    }

    /* renamed from: y */
    public C0364g3 mo2350y() {
        return this.f1752j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo2351z() {
        int i;
        synchronized (this.f1746d) {
            i = this.f1756n;
        }
        return i;
    }
}
