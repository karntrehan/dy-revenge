package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.p003e.C0329b3;
import androidx.camera.camera2.p003e.C0349e3;
import androidx.camera.camera2.p003e.p004j3.C0388b0;
import androidx.camera.camera2.p003e.p004j3.C0405h0;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0435b;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0826j1;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.c3 */
class C0336c3 extends C0329b3.C0330a implements C0329b3, C0349e3.C0351b {

    /* renamed from: a */
    final Object f1378a = new Object();

    /* renamed from: b */
    final C0530r2 f1379b;

    /* renamed from: c */
    final Handler f1380c;

    /* renamed from: d */
    final Executor f1381d;

    /* renamed from: e */
    private final ScheduledExecutorService f1382e;

    /* renamed from: f */
    C0329b3.C0330a f1383f;

    /* renamed from: g */
    C0388b0 f1384g;

    /* renamed from: h */
    C9172b<Void> f1385h;

    /* renamed from: i */
    C1814b.C1815a<Void> f1386i;

    /* renamed from: j */
    private C9172b<List<Surface>> f1387j;

    /* renamed from: k */
    private List<C0820i1> f1388k = null;

    /* renamed from: l */
    private boolean f1389l = false;

    /* renamed from: m */
    private boolean f1390m = false;

    /* renamed from: n */
    private boolean f1391n = false;

    /* renamed from: androidx.camera.camera2.e.c3$a */
    class C0337a implements C0765d<Void> {
        C0337a() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C0336c3.this.mo1944d();
            C0336c3 c3Var = C0336c3.this;
            c3Var.f1379b.mo2282j(c3Var);
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.e.c3$b */
    class C0338b extends CameraCaptureSession.StateCallback {
        C0338b() {
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C0336c3.this.mo1976v(cameraCaptureSession);
            C0336c3 c3Var = C0336c3.this;
            c3Var.mo1952n(c3Var);
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C0336c3.this.mo1976v(cameraCaptureSession);
            C0336c3 c3Var = C0336c3.this;
            c3Var.mo1953o(c3Var);
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C0336c3.this.mo1976v(cameraCaptureSession);
            C0336c3 c3Var = C0336c3.this;
            c3Var.mo1954p(c3Var);
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C1814b.C1815a<Void> aVar;
            try {
                C0336c3.this.mo1976v(cameraCaptureSession);
                C0336c3 c3Var = C0336c3.this;
                c3Var.mo1955q(c3Var);
                synchronized (C0336c3.this.f1378a) {
                    C1177h.m4584f(C0336c3.this.f1386i, "OpenCaptureSession completer should not null");
                    C0336c3 c3Var2 = C0336c3.this;
                    aVar = c3Var2.f1386i;
                    c3Var2.f1386i = null;
                }
                aVar.mo6310f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (C0336c3.this.f1378a) {
                    C1177h.m4584f(C0336c3.this.f1386i, "OpenCaptureSession completer should not null");
                    C0336c3 c3Var3 = C0336c3.this;
                    C1814b.C1815a<Void> aVar2 = c3Var3.f1386i;
                    c3Var3.f1386i = null;
                    aVar2.mo6310f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C1814b.C1815a<Void> aVar;
            try {
                C0336c3.this.mo1976v(cameraCaptureSession);
                C0336c3 c3Var = C0336c3.this;
                c3Var.mo1956r(c3Var);
                synchronized (C0336c3.this.f1378a) {
                    C1177h.m4584f(C0336c3.this.f1386i, "OpenCaptureSession completer should not null");
                    C0336c3 c3Var2 = C0336c3.this;
                    aVar = c3Var2.f1386i;
                    c3Var2.f1386i = null;
                }
                aVar.mo6308c(null);
            } catch (Throwable th) {
                synchronized (C0336c3.this.f1378a) {
                    C1177h.m4584f(C0336c3.this.f1386i, "OpenCaptureSession completer should not null");
                    C0336c3 c3Var3 = C0336c3.this;
                    C1814b.C1815a<Void> aVar2 = c3Var3.f1386i;
                    c3Var3.f1386i = null;
                    aVar2.mo6308c(null);
                    throw th;
                }
            }
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C0336c3.this.mo1976v(cameraCaptureSession);
            C0336c3 c3Var = C0336c3.this;
            c3Var.mo1957s(c3Var);
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C0336c3.this.mo1976v(cameraCaptureSession);
            C0336c3 c3Var = C0336c3.this;
            c3Var.mo1959u(c3Var, surface);
        }
    }

    C0336c3(C0530r2 r2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f1379b = r2Var;
        this.f1380c = handler;
        this.f1381d = executor;
        this.f1382e = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void mo1966B(C0329b3 b3Var) {
        this.f1379b.mo2280h(this);
        mo1958t(b3Var);
        this.f1383f.mo1954p(b3Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo1967D(C0329b3 b3Var) {
        this.f1383f.mo1958t(b3Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ Object mo1968F(List list, C0405h0 h0Var, C0444g gVar, C1814b.C1815a aVar) {
        String str;
        synchronized (this.f1378a) {
            mo1977w(list);
            C1177h.m4586h(this.f1386i == null, "The openCaptureSessionCompleter can only set once!");
            this.f1386i = aVar;
            h0Var.mo2123a(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ C9172b mo1969H(List list, List list2) {
        C0949o2.m3688a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        return list2.contains((Object) null) ? C0768f.m3079e(new C0820i1.C0821a("Surface closed", (C0820i1) list.get(list2.indexOf((Object) null)))) : list2.isEmpty() ? C0768f.m3079e(new IllegalArgumentException("Unable to open capture session without surfaces")) : C0768f.m3081g(list2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void mo1979z() {
        mo1958t(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1970I() {
        synchronized (this.f1378a) {
            List<C0820i1> list = this.f1388k;
            if (list != null) {
                C0826j1.m3239a(list);
                this.f1388k = null;
            }
        }
    }

    /* renamed from: a */
    public Executor mo1971a() {
        return this.f1381d;
    }

    /* renamed from: b */
    public C9172b<Void> mo1972b(CameraDevice cameraDevice, C0444g gVar, List<C0820i1> list) {
        synchronized (this.f1378a) {
            if (this.f1390m) {
                C9172b<Void> e = C0768f.m3079e(new CancellationException("Opener is disabled"));
                return e;
            }
            this.f1379b.mo2284l(this);
            C9172b<Void> a = C1814b.m7736a(new C0341d1(this, list, C0405h0.m1847b(cameraDevice, this.f1380c), gVar));
            this.f1385h = a;
            C0768f.m3075a(a, new C0337a(), C0744a.m3044a());
            C9172b<Void> i = C0768f.m3083i(this.f1385h);
            return i;
        }
    }

    /* renamed from: c */
    public C0329b3.C0330a mo1942c() {
        return this;
    }

    public void close() {
        C1177h.m4584f(this.f1384g, "Need to call openCaptureSession before using this API.");
        this.f1379b.mo2281i(this);
        this.f1384g.mo2079c().close();
        mo1971a().execute(new C0361g1(this));
    }

    /* renamed from: d */
    public void mo1944d() {
        mo1970I();
    }

    /* renamed from: e */
    public int mo1945e(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C1177h.m4584f(this.f1384g, "Need to call openCaptureSession before using this API.");
        return this.f1384g.mo2077a(list, mo1971a(), captureCallback);
    }

    /* renamed from: f */
    public C0388b0 mo1946f() {
        C1177h.m4583e(this.f1384g);
        return this.f1384g;
    }

    /* renamed from: g */
    public void mo1947g() {
        C1177h.m4584f(this.f1384g, "Need to call openCaptureSession before using this API.");
        this.f1384g.mo2079c().abortCaptures();
    }

    /* renamed from: h */
    public CameraDevice mo1948h() {
        C1177h.m4583e(this.f1384g);
        return this.f1384g.mo2079c().getDevice();
    }

    /* renamed from: i */
    public int mo1949i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C1177h.m4584f(this.f1384g, "Need to call openCaptureSession before using this API.");
        return this.f1384g.mo2078b(captureRequest, mo1971a(), captureCallback);
    }

    /* renamed from: j */
    public C0444g mo1973j(int i, List<C0435b> list, C0329b3.C0330a aVar) {
        this.f1383f = aVar;
        return new C0444g(i, list, mo1971a(), new C0338b());
    }

    /* renamed from: k */
    public void mo1950k() {
        C1177h.m4584f(this.f1384g, "Need to call openCaptureSession before using this API.");
        this.f1384g.mo2079c().stopRepeating();
    }

    /* renamed from: l */
    public C9172b<List<Surface>> mo1974l(List<C0820i1> list, long j) {
        synchronized (this.f1378a) {
            if (this.f1390m) {
                C9172b<List<Surface>> e = C0768f.m3079e(new CancellationException("Opener is disabled"));
                return e;
            }
            C0766e<T> f = C0766e.m3068a(C0826j1.m3245g(list, false, j, mo1971a(), this.f1382e)).mo2920f(new C0354f1(this, list), mo1971a());
            this.f1387j = f;
            C9172b<List<Surface>> i = C0768f.m3083i(f);
            return i;
        }
    }

    /* renamed from: m */
    public C9172b<Void> mo1951m(String str) {
        return C0768f.m3081g(null);
    }

    /* renamed from: n */
    public void mo1952n(C0329b3 b3Var) {
        this.f1383f.mo1952n(b3Var);
    }

    /* renamed from: o */
    public void mo1953o(C0329b3 b3Var) {
        this.f1383f.mo1953o(b3Var);
    }

    /* renamed from: p */
    public void mo1954p(C0329b3 b3Var) {
        C9172b<Void> bVar;
        synchronized (this.f1378a) {
            if (!this.f1389l) {
                this.f1389l = true;
                C1177h.m4584f(this.f1385h, "Need to call openCaptureSession before using this API.");
                bVar = this.f1385h;
            } else {
                bVar = null;
            }
        }
        mo1944d();
        if (bVar != null) {
            bVar.mo2919e(new C0347e1(this, b3Var), C0744a.m3044a());
        }
    }

    /* renamed from: q */
    public void mo1955q(C0329b3 b3Var) {
        mo1944d();
        this.f1379b.mo2282j(this);
        this.f1383f.mo1955q(b3Var);
    }

    /* renamed from: r */
    public void mo1956r(C0329b3 b3Var) {
        this.f1379b.mo2283k(this);
        this.f1383f.mo1956r(b3Var);
    }

    /* renamed from: s */
    public void mo1957s(C0329b3 b3Var) {
        this.f1383f.mo1957s(b3Var);
    }

    public boolean stop() {
        boolean z;
        C9172b<List<Surface>> bVar = null;
        try {
            synchronized (this.f1378a) {
                if (!this.f1390m) {
                    C9172b<List<Surface>> bVar2 = this.f1387j;
                    if (bVar2 != null) {
                        bVar = bVar2;
                    }
                    this.f1390m = true;
                }
                z = !mo1978x();
            }
            if (bVar != null) {
                bVar.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (bVar != null) {
                bVar.cancel(true);
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1958t(C0329b3 b3Var) {
        C9172b<Void> bVar;
        synchronized (this.f1378a) {
            if (!this.f1391n) {
                this.f1391n = true;
                C1177h.m4584f(this.f1385h, "Need to call openCaptureSession before using this API.");
                bVar = this.f1385h;
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            bVar.mo2919e(new C0333c1(this, b3Var), C0744a.m3044a());
        }
    }

    /* renamed from: u */
    public void mo1959u(C0329b3 b3Var, Surface surface) {
        this.f1383f.mo1959u(b3Var, surface);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1976v(CameraCaptureSession cameraCaptureSession) {
        if (this.f1384g == null) {
            this.f1384g = C0388b0.m1794d(cameraCaptureSession, this.f1380c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1977w(List<C0820i1> list) {
        synchronized (this.f1378a) {
            mo1970I();
            C0826j1.m3240b(list);
            this.f1388k = list;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo1978x() {
        boolean z;
        synchronized (this.f1378a) {
            z = this.f1385h != null;
        }
        return z;
    }
}
