package androidx.camera.camera2.p003e;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0542u1;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0480h;
import androidx.camera.core.C0606a2;
import androidx.camera.core.C0616b2;
import androidx.camera.core.C0938m1;
import androidx.camera.core.C0958q2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0793d0;
import androidx.camera.core.impl.C0823i2;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0868r0;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.w2 */
class C0564w2 {

    /* renamed from: a */
    private static final MeteringRectangle[] f1846a = new MeteringRectangle[0];

    /* renamed from: b */
    private final C0542u1 f1847b;

    /* renamed from: c */
    final Executor f1848c;

    /* renamed from: d */
    private final ScheduledExecutorService f1849d;

    /* renamed from: e */
    private volatile boolean f1850e = false;

    /* renamed from: f */
    private volatile Rational f1851f = null;

    /* renamed from: g */
    private final C0480h f1852g;

    /* renamed from: h */
    private boolean f1853h = false;

    /* renamed from: i */
    Integer f1854i = 0;

    /* renamed from: j */
    private ScheduledFuture<?> f1855j;

    /* renamed from: k */
    long f1856k = 0;

    /* renamed from: l */
    boolean f1857l = false;

    /* renamed from: m */
    boolean f1858m = false;

    /* renamed from: n */
    private int f1859n = 1;

    /* renamed from: o */
    private C0542u1.C0545c f1860o = null;

    /* renamed from: p */
    private C0542u1.C0545c f1861p = null;

    /* renamed from: q */
    private MeteringRectangle[] f1862q;

    /* renamed from: r */
    private MeteringRectangle[] f1863r;

    /* renamed from: s */
    private MeteringRectangle[] f1864s;

    /* renamed from: t */
    C1814b.C1815a<C0616b2> f1865t;

    /* renamed from: u */
    C1814b.C1815a<Void> f1866u;

    /* renamed from: androidx.camera.camera2.e.w2$a */
    class C0565a extends C0783b0 {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f1867a;

        C0565a(C1814b.C1815a aVar) {
            this.f1867a = aVar;
        }

        /* renamed from: a */
        public void mo1919a() {
            C1814b.C1815a aVar = this.f1867a;
            if (aVar != null) {
                aVar.mo6310f(new C0938m1.C0939a("Camera is closed"));
            }
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            C1814b.C1815a aVar = this.f1867a;
            if (aVar != null) {
                aVar.mo6308c(k0Var);
            }
        }

        /* renamed from: c */
        public void mo1921c(C0793d0 d0Var) {
            C1814b.C1815a aVar = this.f1867a;
            if (aVar != null) {
                aVar.mo6310f(new C0868r0.C0870b(d0Var));
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.w2$b */
    class C0566b extends C0783b0 {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f1869a;

        C0566b(C1814b.C1815a aVar) {
            this.f1869a = aVar;
        }

        /* renamed from: a */
        public void mo1919a() {
            C1814b.C1815a aVar = this.f1869a;
            if (aVar != null) {
                aVar.mo6310f(new C0938m1.C0939a("Camera is closed"));
            }
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            C1814b.C1815a aVar = this.f1869a;
            if (aVar != null) {
                aVar.mo6308c(null);
            }
        }

        /* renamed from: c */
        public void mo1921c(C0793d0 d0Var) {
            C1814b.C1815a aVar = this.f1869a;
            if (aVar != null) {
                aVar.mo6310f(new C0868r0.C0870b(d0Var));
            }
        }
    }

    C0564w2(C0542u1 u1Var, ScheduledExecutorService scheduledExecutorService, Executor executor, C0823i2 i2Var) {
        MeteringRectangle[] meteringRectangleArr = f1846a;
        this.f1862q = meteringRectangleArr;
        this.f1863r = meteringRectangleArr;
        this.f1864s = meteringRectangleArr;
        this.f1865t = null;
        this.f1866u = null;
        this.f1847b = u1Var;
        this.f1848c = executor;
        this.f1849d = scheduledExecutorService;
        this.f1852g = new C0480h(i2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ Object mo2434C(C0606a2 a2Var, C1814b.C1815a aVar) {
        this.f1848c.execute(new C0533s0(this, aVar, a2Var));
        return "startFocusAndMetering";
    }

    /* renamed from: D */
    private static int m2326D(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* renamed from: H */
    private boolean m2327H() {
        return this.f1862q.length > 0;
    }

    /* renamed from: e */
    private void m2328e(boolean z) {
        C1814b.C1815a<C0616b2> aVar = this.f1865t;
        if (aVar != null) {
            aVar.mo6308c(C0616b2.m2560a(z));
            this.f1865t = null;
        }
    }

    /* renamed from: f */
    private void m2329f() {
        C1814b.C1815a<Void> aVar = this.f1866u;
        if (aVar != null) {
            aVar.mo6308c(null);
            this.f1866u = null;
        }
    }

    /* renamed from: g */
    private void m2330g() {
        ScheduledFuture<?> scheduledFuture = this.f1855j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f1855j = null;
        }
    }

    /* renamed from: h */
    private void m2331h(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C0606a2 a2Var) {
        long j;
        this.f1847b.mo2317X(this.f1860o);
        m2330g();
        this.f1862q = meteringRectangleArr;
        this.f1863r = meteringRectangleArr2;
        this.f1864s = meteringRectangleArr3;
        if (m2327H()) {
            this.f1853h = true;
            this.f1857l = false;
            this.f1858m = false;
            j = this.f1847b.mo2333g0();
            mo2441L((C1814b.C1815a<C0830k0>) null, true);
        } else {
            this.f1853h = false;
            this.f1857l = true;
            this.f1858m = false;
            j = this.f1847b.mo2333g0();
        }
        this.f1854i = 0;
        C0541u0 u0Var = new C0541u0(this, m2338p(), j);
        this.f1860o = u0Var;
        this.f1847b.mo2336j(u0Var);
        if (a2Var.mo2554e()) {
            long j2 = this.f1856k + 1;
            this.f1856k = j2;
            this.f1855j = this.f1849d.schedule(new C0528r0(this, j2), a2Var.mo2550a(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: i */
    private void m2332i(String str) {
        this.f1847b.mo2317X(this.f1860o);
        C1814b.C1815a<C0616b2> aVar = this.f1865t;
        if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a(str));
            this.f1865t = null;
        }
    }

    /* renamed from: j */
    private void m2333j(String str) {
        this.f1847b.mo2317X(this.f1861p);
        C1814b.C1815a<Void> aVar = this.f1866u;
        if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a(str));
            this.f1866u = null;
        }
    }

    /* renamed from: l */
    private Rational m2334l() {
        if (this.f1851f != null) {
            return this.f1851f;
        }
        Rect n = this.f1847b.mo2340n();
        return new Rational(n.width(), n.height());
    }

    /* renamed from: m */
    private static PointF m2335m(C0958q2 q2Var, Rational rational, Rational rational2, int i, C0480h hVar) {
        if (q2Var.mo3201b() != null) {
            rational2 = q2Var.mo3201b();
        }
        PointF a = hVar.mo2224a(q2Var, i);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a.y = (((float) ((((double) doubleValue) - 1.0d) / 2.0d)) + a.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                a.x = (((float) ((((double) doubleValue2) - 1.0d) / 2.0d)) + a.x) * (1.0f / doubleValue2);
            }
        }
        return a;
    }

    /* renamed from: n */
    private static MeteringRectangle m2336n(C0958q2 q2Var, PointF pointF, Rect rect) {
        int width = (int) (((float) rect.left) + (pointF.x * ((float) rect.width())));
        int height = (int) (((float) rect.top) + (pointF.y * ((float) rect.height())));
        int a = ((int) (q2Var.mo3200a() * ((float) rect.width()))) / 2;
        int a2 = ((int) (q2Var.mo3200a() * ((float) rect.height()))) / 2;
        Rect rect2 = new Rect(width - a, height - a2, width + a, height + a2);
        rect2.left = m2326D(rect2.left, rect.right, rect.left);
        rect2.right = m2326D(rect2.right, rect.right, rect.left);
        rect2.top = m2326D(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m2326D(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    /* renamed from: o */
    private List<MeteringRectangle> m2337o(List<C0958q2> list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (C0958q2 next : list) {
            if (arrayList.size() == i) {
                break;
            } else if (m2339q(next)) {
                MeteringRectangle n = m2336n(next, m2335m(next, rational2, rational, i2, this.f1852g), rect);
                if (!(n.getWidth() == 0 || n.getHeight() == 0)) {
                    arrayList.add(n);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    private boolean m2338p() {
        return this.f1847b.mo2349w(1) == 1;
    }

    /* renamed from: q */
    private static boolean m2339q(C0958q2 q2Var) {
        return q2Var.mo3202c() >= 0.0f && q2Var.mo3202c() <= 1.0f && q2Var.mo3203d() >= 0.0f && q2Var.mo3203d() <= 1.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ boolean mo2447s(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !C0542u1.m2143E(totalCaptureResult, j)) {
            return false;
        }
        m2329f();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ boolean mo2448u(boolean z, long j, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (m2327H()) {
            if (z && num != null) {
                if (this.f1854i.intValue() == 3) {
                    if (num.intValue() != 4) {
                        if (num.intValue() == 5) {
                            this.f1858m = false;
                            this.f1857l = true;
                        }
                    }
                }
            }
            this.f1858m = true;
            this.f1857l = true;
        }
        if (!this.f1857l || !C0542u1.m2143E(totalCaptureResult, j)) {
            if (!this.f1854i.equals(num) && num != null) {
                this.f1854i = num;
            }
            return false;
        }
        m2328e(this.f1858m);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void mo2449w(long j) {
        if (j == this.f1856k) {
            mo2445d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void mo2450y(long j) {
        this.f1848c.execute(new C0524q0(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo2435E(boolean z) {
        if (z != this.f1850e) {
            this.f1850e = z;
            if (!this.f1850e) {
                mo2445d();
            }
        }
    }

    /* renamed from: F */
    public void mo2436F(Rational rational) {
        this.f1851f = rational;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo2437G(int i) {
        this.f1859n = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C9172b<C0616b2> mo2438I(C0606a2 a2Var) {
        return C1814b.m7736a(new C0548v0(this, a2Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void m2344z(C1814b.C1815a<C0616b2> aVar, C0606a2 a2Var) {
        if (!this.f1850e) {
            aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
            return;
        }
        Rect n = this.f1847b.mo2340n();
        Rational l = m2334l();
        Rational rational = l;
        Rect rect = n;
        List<MeteringRectangle> o = m2337o(a2Var.mo2552c(), this.f1847b.mo2344r(), rational, rect, 1);
        List<MeteringRectangle> o2 = m2337o(a2Var.mo2551b(), this.f1847b.mo2343q(), rational, rect, 2);
        List<MeteringRectangle> o3 = m2337o(a2Var.mo2553d(), this.f1847b.mo2345s(), rational, rect, 4);
        if (!o.isEmpty() || !o2.isEmpty() || !o3.isEmpty()) {
            m2332i("Cancelled by another startFocusAndMetering()");
            m2333j("Cancelled by another startFocusAndMetering()");
            m2330g();
            this.f1865t = aVar;
            MeteringRectangle[] meteringRectangleArr = f1846a;
            m2331h((MeteringRectangle[]) o.toArray(meteringRectangleArr), (MeteringRectangle[]) o2.toArray(meteringRectangleArr), (MeteringRectangle[]) o3.toArray(meteringRectangleArr), a2Var);
            return;
        }
        aVar.mo6310f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo2440K(C1814b.C1815a<Void> aVar) {
        if (this.f1850e) {
            C0788c1.C0789a aVar2 = new C0788c1.C0789a();
            aVar2.mo2969o(this.f1859n);
            aVar2.mo2970p(true);
            C0304b.C0305a aVar3 = new C0304b.C0305a();
            aVar3.mo1889e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            aVar2.mo2961e(aVar3.mo1886a());
            aVar2.mo2959c(new C0566b(aVar));
            this.f1847b.mo2327d0(Collections.singletonList(aVar2.mo2964h()));
        } else if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo2441L(C1814b.C1815a<C0830k0> aVar, boolean z) {
        if (this.f1850e) {
            C0788c1.C0789a aVar2 = new C0788c1.C0789a();
            aVar2.mo2969o(this.f1859n);
            aVar2.mo2970p(true);
            C0304b.C0305a aVar3 = new C0304b.C0305a();
            aVar3.mo1889e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                aVar3.mo1889e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f1847b.mo2348v(1)));
            }
            aVar2.mo2961e(aVar3.mo1886a());
            aVar2.mo2959c(new C0565a(aVar));
            this.f1847b.mo2327d0(Collections.singletonList(aVar2.mo2964h()));
        } else if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2442a(C0304b.C0305a aVar) {
        aVar.mo1889e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f1847b.mo2349w(this.f1853h ? 1 : mo2446k())));
        MeteringRectangle[] meteringRectangleArr = this.f1862q;
        if (meteringRectangleArr.length != 0) {
            aVar.mo1889e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f1863r;
        if (meteringRectangleArr2.length != 0) {
            aVar.mo1889e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f1864s;
        if (meteringRectangleArr3.length != 0) {
            aVar.mo1889e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2443b(boolean z, boolean z2) {
        if (this.f1850e) {
            C0788c1.C0789a aVar = new C0788c1.C0789a();
            aVar.mo2970p(true);
            aVar.mo2969o(this.f1859n);
            C0304b.C0305a aVar2 = new C0304b.C0305a();
            if (z) {
                aVar2.mo1889e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z2) {
                aVar2.mo1889e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.mo2961e(aVar2.mo1886a());
            this.f1847b.mo2327d0(Collections.singletonList(aVar.mo2964h()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2444c(C1814b.C1815a<Void> aVar) {
        m2333j("Cancelled by another cancelFocusAndMetering()");
        m2332i("Cancelled by cancelFocusAndMetering()");
        this.f1866u = aVar;
        m2330g();
        if (m2327H()) {
            mo2443b(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f1846a;
        this.f1862q = meteringRectangleArr;
        this.f1863r = meteringRectangleArr;
        this.f1864s = meteringRectangleArr;
        this.f1853h = false;
        long g0 = this.f1847b.mo2333g0();
        if (this.f1866u != null) {
            C0537t0 t0Var = new C0537t0(this, this.f1847b.mo2349w(mo2446k()), g0);
            this.f1861p = t0Var;
            this.f1847b.mo2336j(t0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2445d() {
        mo2444c((C1814b.C1815a<Void>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2446k() {
        return this.f1859n != 3 ? 4 : 3;
    }
}
