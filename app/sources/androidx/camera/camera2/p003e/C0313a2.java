package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0542u1;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0481i;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0486n;
import androidx.camera.core.C0709i2;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0793d0;
import androidx.camera.core.impl.C0799e0;
import androidx.camera.core.impl.C0804f0;
import androidx.camera.core.impl.C0808g0;
import androidx.camera.core.impl.C0815h0;
import androidx.camera.core.impl.C0823i2;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.a2 */
class C0313a2 {

    /* renamed from: a */
    private final C0542u1 f1309a;

    /* renamed from: b */
    private final C0486n f1310b;

    /* renamed from: c */
    private final C0823i2 f1311c;

    /* renamed from: d */
    private final Executor f1312d;

    /* renamed from: e */
    private final boolean f1313e;

    /* renamed from: f */
    private int f1314f = 1;

    /* renamed from: androidx.camera.camera2.e.a2$a */
    static class C0314a implements C0319d {

        /* renamed from: a */
        private final C0542u1 f1315a;

        /* renamed from: b */
        private final C0481i f1316b;

        /* renamed from: c */
        private final int f1317c;

        /* renamed from: d */
        private boolean f1318d = false;

        C0314a(C0542u1 u1Var, int i, C0481i iVar) {
            this.f1315a = u1Var;
            this.f1317c = i;
            this.f1316b = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object mo1910e(C1814b.C1815a aVar) {
            this.f1315a.mo2342p().mo2440K(aVar);
            this.f1316b.mo2226b();
            return "AePreCapture";
        }

        /* renamed from: a */
        public C9172b<Boolean> mo1907a(TotalCaptureResult totalCaptureResult) {
            if (!C0313a2.m1530a(this.f1317c, totalCaptureResult)) {
                return C0768f.m3081g(Boolean.FALSE);
            }
            C0949o2.m3688a("Camera2CapturePipeline", "Trigger AE");
            this.f1318d = true;
            return C0766e.m3068a(C1814b.m7736a(new C0580z(this))).mo2918d(C0311a0.f1307a, C0744a.m3044a());
        }

        /* renamed from: b */
        public boolean mo1908b() {
            return this.f1317c == 0;
        }

        /* renamed from: c */
        public void mo1909c() {
            if (this.f1318d) {
                C0949o2.m3688a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f1315a.mo2342p().mo2443b(false, true);
                this.f1316b.mo2225a();
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.a2$b */
    static class C0315b implements C0319d {

        /* renamed from: a */
        private final C0542u1 f1319a;

        /* renamed from: b */
        private boolean f1320b = false;

        C0315b(C0542u1 u1Var) {
            this.f1319a = u1Var;
        }

        /* renamed from: a */
        public C9172b<Boolean> mo1907a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            C9172b<Boolean> g = C0768f.m3081g(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return g;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C0949o2.m3688a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C0949o2.m3688a("Camera2CapturePipeline", "Trigger AF");
                    this.f1320b = true;
                    this.f1319a.mo2342p().mo2441L((C1814b.C1815a<C0830k0>) null, false);
                }
            }
            return g;
        }

        /* renamed from: b */
        public boolean mo1908b() {
            return true;
        }

        /* renamed from: c */
        public void mo1909c() {
            if (this.f1320b) {
                C0949o2.m3688a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f1319a.mo2342p().mo2443b(true, false);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.a2$c */
    static class C0316c {

        /* renamed from: a */
        private static final long f1321a;

        /* renamed from: b */
        private static final long f1322b;

        /* renamed from: c */
        private final int f1323c;

        /* renamed from: d */
        private final Executor f1324d;

        /* renamed from: e */
        private final C0542u1 f1325e;

        /* renamed from: f */
        private final C0481i f1326f;

        /* renamed from: g */
        private final boolean f1327g;

        /* renamed from: h */
        private long f1328h = f1321a;

        /* renamed from: i */
        final List<C0319d> f1329i = new ArrayList();

        /* renamed from: j */
        private final C0319d f1330j = new C0317a();

        /* renamed from: androidx.camera.camera2.e.a2$c$a */
        class C0317a implements C0319d {
            C0317a() {
            }

            /* renamed from: a */
            public C9172b<Boolean> mo1907a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (C0319d a : C0316c.this.f1329i) {
                    arrayList.add(a.mo1907a(totalCaptureResult));
                }
                return C0768f.m3088n(C0768f.m3076b(arrayList), C0340d0.f1396a, C0744a.m3044a());
            }

            /* renamed from: b */
            public boolean mo1908b() {
                for (C0319d b : C0316c.this.f1329i) {
                    if (b.mo1908b()) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: c */
            public void mo1909c() {
                for (C0319d c : C0316c.this.f1329i) {
                    c.mo1909c();
                }
            }
        }

        /* renamed from: androidx.camera.camera2.e.a2$c$b */
        class C0318b extends C0783b0 {

            /* renamed from: a */
            final /* synthetic */ C1814b.C1815a f1332a;

            C0318b(C1814b.C1815a aVar) {
                this.f1332a = aVar;
            }

            /* renamed from: a */
            public void mo1919a() {
                this.f1332a.mo6310f(new C0709i2(3, "Capture request is cancelled because camera is closed", (Throwable) null));
            }

            /* renamed from: b */
            public void mo1920b(C0830k0 k0Var) {
                this.f1332a.mo6308c(null);
            }

            /* renamed from: c */
            public void mo1921c(C0793d0 d0Var) {
                this.f1332a.mo6310f(new C0709i2(2, "Capture request failed with reason " + d0Var.mo2973a(), (Throwable) null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f1321a = timeUnit.toNanos(1);
            f1322b = timeUnit.toNanos(5);
        }

        C0316c(int i, Executor executor, C0542u1 u1Var, boolean z, C0481i iVar) {
            this.f1323c = i;
            this.f1324d = executor;
            this.f1325e = u1Var;
            this.f1327g = z;
            this.f1326f = iVar;
        }

        /* renamed from: b */
        private void m1543b(C0788c1.C0789a aVar) {
            C0304b.C0305a aVar2 = new C0304b.C0305a();
            aVar2.mo1889e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.mo2961e(aVar2.mo1886a());
        }

        /* renamed from: c */
        private void m1544c(C0788c1.C0789a aVar, C0788c1 c1Var) {
            int i = (this.f1323c != 3 || this.f1327g) ? c1Var.mo2955f() == -1 ? 2 : -1 : 4;
            if (i != -1) {
                aVar.mo2969o(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public boolean m1545e(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            C0538t1 t1Var = new C0538t1(totalCaptureResult);
            boolean z = t1Var.mo2299f() == C0804f0.f2391o || t1Var.mo2299f() == C0804f0.f2390f || t1Var.mo2300g() == C0808g0.PASSIVE_FOCUSED || t1Var.mo2300g() == C0808g0.PASSIVE_NOT_FOCUSED || t1Var.mo2300g() == C0808g0.LOCKED_FOCUSED || t1Var.mo2300g() == C0808g0.LOCKED_NOT_FOCUSED;
            boolean z2 = t1Var.mo2298e() == C0799e0.CONVERGED || t1Var.mo2298e() == C0799e0.FLASH_REQUIRED || t1Var.mo2298e() == C0799e0.UNKNOWN;
            boolean z3 = t1Var.mo2301h() == C0815h0.CONVERGED || t1Var.mo2301h() == C0815h0.UNKNOWN;
            C0949o2.m3688a("Camera2CapturePipeline", "checkCaptureResult, AE=" + t1Var.mo2298e() + " AF =" + t1Var.mo2300g() + " AWB=" + t1Var.mo2301h());
            return z && z2 && z3;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ C9172b mo1913h(int i, TotalCaptureResult totalCaptureResult) {
            if (C0313a2.m1530a(i, totalCaptureResult)) {
                m1552q(f1322b);
            }
            return this.f1330j.mo1907a(totalCaptureResult);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ C9172b mo1914j(Boolean bool) {
            return bool.booleanValue() ? m1553s(this.f1328h, new C0346e0(this)) : C0768f.m3081g(null);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ C9172b mo1915l(List list, int i, TotalCaptureResult totalCaptureResult) {
            return mo1918r(list, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void mo1916n() {
            this.f1330j.mo1909c();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ Object mo1917p(C0788c1.C0789a aVar, C1814b.C1815a aVar2) {
            aVar.mo2959c(new C0318b(aVar2));
            return "submitStillCapture";
        }

        /* renamed from: q */
        private void m1552q(long j) {
            this.f1328h = j;
        }

        /* renamed from: s */
        private C9172b<TotalCaptureResult> m1553s(long j, C0320e.C0321a aVar) {
            C0320e eVar = new C0320e(j, aVar);
            this.f1325e.mo2336j(eVar);
            return eVar.mo1923b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1911a(C0319d dVar) {
            this.f1329i.add(dVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C9172b<List<Void>> mo1912d(List<C0788c1> list, int i) {
            C9172b g = C0768f.m3081g(null);
            if (!this.f1329i.isEmpty()) {
                g = C0766e.m3068a(this.f1330j.mo1908b() ? m1553s(0, (C0320e.C0321a) null) : C0768f.m3081g(null)).mo2920f(new C0366h0(this, i), this.f1324d).mo2920f(new C0360g0(this), this.f1324d);
            }
            C0766e f = C0766e.m3068a(g).mo2920f(new C0353f0(this, list, i), this.f1324d);
            f.mo2919e(new C0326b0(this), this.f1324d);
            return f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public C9172b<List<Void>> mo1918r(List<C0788c1> list, int i) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C0788c1 next : list) {
                C0788c1.C0789a k = C0788c1.C0789a.m3120k(next);
                m1544c(k, next);
                if (this.f1326f.mo2227c(i)) {
                    m1543b(k);
                }
                arrayList.add(C1814b.m7736a(new C0332c0(this, k)));
                arrayList2.add(k.mo2964h());
            }
            this.f1325e.mo2327d0(arrayList2);
            return C0768f.m3076b(arrayList);
        }
    }

    /* renamed from: androidx.camera.camera2.e.a2$d */
    interface C0319d {
        /* renamed from: a */
        C9172b<Boolean> mo1907a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo1908b();

        /* renamed from: c */
        void mo1909c();
    }

    /* renamed from: androidx.camera.camera2.e.a2$e */
    static class C0320e implements C0542u1.C0545c {

        /* renamed from: a */
        private C1814b.C1815a<TotalCaptureResult> f1334a;

        /* renamed from: b */
        private final C9172b<TotalCaptureResult> f1335b = C1814b.m7736a(new C0375i0(this));

        /* renamed from: c */
        private final long f1336c;

        /* renamed from: d */
        private final C0321a f1337d;

        /* renamed from: e */
        private volatile Long f1338e = null;

        /* renamed from: androidx.camera.camera2.e.a2$e$a */
        interface C0321a {
            /* renamed from: a */
            boolean mo1925a(TotalCaptureResult totalCaptureResult);
        }

        C0320e(long j, C0321a aVar) {
            this.f1336c = j;
            this.f1337d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Object mo1924d(C1814b.C1815a aVar) {
            this.f1334a = aVar;
            return "waitFor3AResult";
        }

        /* renamed from: a */
        public boolean mo1922a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f1338e == null) {
                this.f1338e = l;
            }
            Long l2 = this.f1338e;
            if (0 == this.f1336c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f1336c) {
                C0321a aVar = this.f1337d;
                if (aVar != null && !aVar.mo1925a(totalCaptureResult)) {
                    return false;
                }
                this.f1334a.mo6308c(totalCaptureResult);
                return true;
            }
            this.f1334a.mo6308c(null);
            C0949o2.m3688a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }

        /* renamed from: b */
        public C9172b<TotalCaptureResult> mo1923b() {
            return this.f1335b;
        }
    }

    /* renamed from: androidx.camera.camera2.e.a2$f */
    static class C0322f implements C0319d {

        /* renamed from: a */
        private final C0542u1 f1339a;

        /* renamed from: b */
        private final int f1340b;

        /* renamed from: c */
        private boolean f1341c = false;

        C0322f(C0542u1 u1Var, int i) {
            this.f1339a = u1Var;
            this.f1340b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object mo1926e(C1814b.C1815a aVar) {
            this.f1339a.mo2350y().m1742d(aVar, true);
            return "TorchOn";
        }

        /* renamed from: a */
        public C9172b<Boolean> mo1907a(TotalCaptureResult totalCaptureResult) {
            if (C0313a2.m1530a(this.f1340b, totalCaptureResult)) {
                if (this.f1339a.mo2309F()) {
                    C0949o2.m3688a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C0949o2.m3688a("Camera2CapturePipeline", "Turn on torch");
                    this.f1341c = true;
                    return C0766e.m3068a(C1814b.m7736a(new C0494k0(this))).mo2918d(C0382j0.f1478a, C0744a.m3044a());
                }
            }
            return C0768f.m3081g(Boolean.FALSE);
        }

        /* renamed from: b */
        public boolean mo1908b() {
            return this.f1340b == 0;
        }

        /* renamed from: c */
        public void mo1909c() {
            if (this.f1341c) {
                this.f1339a.mo2350y().m1742d((C1814b.C1815a<Void>) null, false);
                C0949o2.m3688a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    C0313a2(C0542u1 u1Var, C0402g0 g0Var, C0823i2 i2Var, Executor executor) {
        boolean z = true;
        this.f1309a = u1Var;
        Integer num = (Integer) g0Var.mo2119a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f1313e = (num == null || num.intValue() != 2) ? false : z;
        this.f1312d = executor;
        this.f1311c = i2Var;
        this.f1310b = new C0486n(i2Var);
    }

    /* renamed from: a */
    static boolean m1530a(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
    }

    /* renamed from: b */
    private boolean m1531b(int i) {
        return this.f1310b.mo2231a() || this.f1314f == 3 || i == 1;
    }

    /* renamed from: c */
    public void mo1905c(int i) {
        this.f1314f = i;
    }

    /* renamed from: d */
    public C9172b<List<Void>> mo1906d(List<C0788c1> list, int i, int i2, int i3) {
        C0481i iVar = new C0481i(this.f1311c);
        C0316c cVar = new C0316c(this.f1314f, this.f1312d, this.f1309a, this.f1313e, iVar);
        if (i == 0) {
            cVar.mo1911a(new C0315b(this.f1309a));
        }
        cVar.mo1911a(m1531b(i3) ? new C0322f(this.f1309a, i2) : new C0314a(this.f1309a, i2, iVar));
        return C0768f.m3083i(cVar.mo1912d(list, i2));
    }
}
