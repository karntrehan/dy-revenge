package androidx.camera.camera2.p003e;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.p003e.C0349e3;
import androidx.camera.camera2.p003e.p004j3.C0386a0;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.camera.camera2.p003e.p004j3.C0488v;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0938m1;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0967s2;
import androidx.camera.core.C0974t1;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0848n0;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.core.impl.C0861q0;
import androidx.camera.core.impl.C0868r0;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0893v0;
import androidx.camera.core.impl.C0894v1;
import androidx.camera.core.impl.C0895v2;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0905x1;
import androidx.camera.core.impl.C0911y0;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.w1 */
final class C0553w1 implements C0899w0 {

    /* renamed from: A */
    final AtomicInteger f1791A;

    /* renamed from: B */
    C1814b.C1815a<Void> f1792B;

    /* renamed from: C */
    final Map<C0526q2, C9172b<Void>> f1793C;

    /* renamed from: D */
    private final C0557d f1794D;

    /* renamed from: E */
    private final C0911y0 f1795E;

    /* renamed from: F */
    final Set<C0517p2> f1796F;

    /* renamed from: G */
    private C0577y2 f1797G;

    /* renamed from: H */
    private final C0530r2 f1798H;

    /* renamed from: I */
    private final C0349e3.C0350a f1799I;

    /* renamed from: J */
    private final Set<String> f1800J;

    /* renamed from: K */
    private C0848n0 f1801K;

    /* renamed from: L */
    final Object f1802L;

    /* renamed from: M */
    private C0850n2 f1803M;

    /* renamed from: N */
    boolean f1804N;

    /* renamed from: f */
    private final C0895v2 f1805f;

    /* renamed from: o */
    private final C0418m0 f1806o;

    /* renamed from: p */
    private final Executor f1807p;

    /* renamed from: q */
    private final ScheduledExecutorService f1808q;

    /* renamed from: r */
    volatile C0559f f1809r = C0559f.INITIALIZED;

    /* renamed from: s */
    private final C0905x1<C0899w0.C0900a> f1810s;

    /* renamed from: t */
    private final C0496k2 f1811t;

    /* renamed from: u */
    private final C0542u1 f1812u;

    /* renamed from: v */
    private final C0560g f1813v;

    /* renamed from: w */
    final C0569x1 f1814w;

    /* renamed from: x */
    CameraDevice f1815x;

    /* renamed from: y */
    int f1816y;

    /* renamed from: z */
    C0526q2 f1817z;

    /* renamed from: androidx.camera.camera2.e.w1$a */
    class C0554a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ C0526q2 f1818a;

        C0554a(C0526q2 q2Var) {
            this.f1818a = q2Var;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            CameraDevice cameraDevice;
            C0553w1.this.f1793C.remove(this.f1818a);
            int i = C0556c.f1821a[C0553w1.this.f1809r.ordinal()];
            if (i != 3) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                } else if (C0553w1.this.f1816y == 0) {
                    return;
                }
            }
            if (C0553w1.this.mo2370B() && (cameraDevice = C0553w1.this.f1815x) != null) {
                C0488v.m2030a(cameraDevice);
                C0553w1.this.f1815x = null;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.w1$b */
    class C0555b implements C0765d<Void> {
        C0555b() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            if (th instanceof C0820i1.C0821a) {
                C0840m2 w = C0553w1.this.mo2407w(((C0820i1.C0821a) th).mo3013a());
                if (w != null) {
                    C0553w1.this.mo2381a0(w);
                }
            } else if (th instanceof CancellationException) {
                C0553w1.this.mo2406u("Unable to configure camera cancelled");
            } else {
                C0559f fVar = C0553w1.this.f1809r;
                C0559f fVar2 = C0559f.OPENED;
                if (fVar == fVar2) {
                    C0553w1.this.mo2392g0(fVar2, C0974t1.C0975a.m3791b(4, th));
                }
                if (th instanceof CameraAccessException) {
                    C0553w1 w1Var = C0553w1.this;
                    w1Var.mo2406u("Unable to configure camera due to " + th.getMessage());
                } else if (th instanceof TimeoutException) {
                    C0949o2.m3690c("Camera2CameraImpl", "Unable to configure camera " + C0553w1.this.f1814w.mo2453a() + ", timeout!");
                }
            }
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.e.w1$c */
    static /* synthetic */ class C0556c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1821a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.e.w1$f[] r0 = androidx.camera.camera2.p003e.C0553w1.C0559f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1821a = r0
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.CLOSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.OPENED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.OPENING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.REOPENING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.e.w1$f r1 = androidx.camera.camera2.p003e.C0553w1.C0559f.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0553w1.C0556c.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.e.w1$d */
    final class C0557d extends CameraManager.AvailabilityCallback implements C0911y0.C0913b {

        /* renamed from: a */
        private final String f1822a;

        /* renamed from: b */
        private boolean f1823b = true;

        C0557d(String str) {
            this.f1822a = str;
        }

        /* renamed from: a */
        public void mo2411a() {
            if (C0553w1.this.f1809r == C0559f.PENDING_OPEN) {
                C0553w1.this.mo2402n0(false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2412b() {
            return this.f1823b;
        }

        public void onCameraAvailable(String str) {
            if (this.f1822a.equals(str)) {
                this.f1823b = true;
                if (C0553w1.this.f1809r == C0559f.PENDING_OPEN) {
                    C0553w1.this.mo2402n0(false);
                }
            }
        }

        public void onCameraUnavailable(String str) {
            if (this.f1822a.equals(str)) {
                this.f1823b = false;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.w1$e */
    final class C0558e implements C0868r0.C0871c {
        C0558e() {
        }

        /* renamed from: a */
        public void mo2415a() {
            C0553w1.this.mo2403o0();
        }

        /* renamed from: b */
        public void mo2416b(List<C0788c1> list) {
            C0553w1.this.mo2396i0((List) C1177h.m4583e(list));
        }
    }

    /* renamed from: androidx.camera.camera2.e.w1$f */
    enum C0559f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.e.w1$g */
    final class C0560g extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f1835a;

        /* renamed from: b */
        private final ScheduledExecutorService f1836b;

        /* renamed from: c */
        private C0562b f1837c;

        /* renamed from: d */
        ScheduledFuture<?> f1838d;

        /* renamed from: e */
        private final C0561a f1839e = new C0561a();

        /* renamed from: androidx.camera.camera2.e.w1$g$a */
        class C0561a {

            /* renamed from: a */
            private long f1841a = -1;

            C0561a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo2425a() {
                if (!(mo2426b() >= ((long) mo2428d()))) {
                    return true;
                }
                mo2429e();
                return false;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public long mo2426b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f1841a == -1) {
                    this.f1841a = uptimeMillis;
                }
                return uptimeMillis - this.f1841a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public int mo2427c() {
                if (!C0560g.this.mo2420f()) {
                    return 700;
                }
                long b = mo2426b();
                return b <= 120000 ? RNCWebViewManager.COMMAND_CLEAR_FORM_DATA : b <= 300000 ? 2000 : 4000;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public int mo2428d() {
                if (!C0560g.this.mo2420f()) {
                    return ModuleDescriptor.MODULE_VERSION;
                }
                return 1800000;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo2429e() {
                this.f1841a = -1;
            }
        }

        /* renamed from: androidx.camera.camera2.e.w1$g$b */
        class C0562b implements Runnable {

            /* renamed from: f */
            private Executor f1843f;

            /* renamed from: o */
            private boolean f1844o = false;

            C0562b(Executor executor) {
                this.f1843f = executor;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void mo2431c() {
                if (!this.f1844o) {
                    C1177h.m4585g(C0553w1.this.f1809r == C0559f.REOPENING);
                    if (C0560g.this.mo2420f()) {
                        C0553w1.this.mo2401m0(true);
                    } else {
                        C0553w1.this.mo2402n0(true);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2430a() {
                this.f1844o = true;
            }

            public void run() {
                this.f1843f.execute(new C0523q(this));
            }
        }

        C0560g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f1835a = executor;
            this.f1836b = scheduledExecutorService;
        }

        /* renamed from: b */
        private void m2305b(CameraDevice cameraDevice, int i) {
            boolean z = C0553w1.this.f1809r == C0559f.OPENING || C0553w1.this.f1809r == C0559f.OPENED || C0553w1.this.f1809r == C0559f.REOPENING;
            C1177h.m4586h(z, "Attempt to handle open error from non open state: " + C0553w1.this.f1809r);
            if (i == 1 || i == 2 || i == 4) {
                C0949o2.m3688a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), C0553w1.m2255y(i)}));
                m2306c(i);
                return;
            }
            C0949o2.m3690c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C0553w1.m2255y(i) + " closing camera.");
            C0553w1.this.mo2392g0(C0559f.CLOSING, C0974t1.C0975a.m3790a(i == 3 ? 5 : 6));
            C0553w1.this.mo2404q(false);
        }

        /* renamed from: c */
        private void m2306c(int i) {
            int i2 = 1;
            C1177h.m4586h(C0553w1.this.f1816y != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            C0553w1.this.mo2392g0(C0559f.REOPENING, C0974t1.C0975a.m3790a(i2));
            C0553w1.this.mo2404q(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2417a() {
            if (this.f1838d == null) {
                return false;
            }
            C0553w1 w1Var = C0553w1.this;
            w1Var.mo2406u("Cancelling scheduled re-open: " + this.f1837c);
            this.f1837c.mo2430a();
            this.f1837c = null;
            this.f1838d.cancel(false);
            this.f1838d = null;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2418d() {
            this.f1839e.mo2429e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2419e() {
            boolean z = true;
            C1177h.m4585g(this.f1837c == null);
            if (this.f1838d != null) {
                z = false;
            }
            C1177h.m4585g(z);
            if (this.f1839e.mo2425a()) {
                this.f1837c = new C0562b(this.f1835a);
                C0553w1 w1Var = C0553w1.this;
                w1Var.mo2406u("Attempting camera re-open in " + this.f1839e.mo2427c() + "ms: " + this.f1837c + " activeResuming = " + C0553w1.this.f1804N);
                this.f1838d = this.f1836b.schedule(this.f1837c, (long) this.f1839e.mo2427c(), TimeUnit.MILLISECONDS);
                return;
            }
            C0949o2.m3690c("Camera2CameraImpl", "Camera reopening attempted for " + this.f1839e.mo2428d() + "ms without success.");
            C0553w1.this.mo2394h0(C0559f.PENDING_OPEN, (C0974t1.C0975a) null, false);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.f1816y;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2420f() {
            /*
                r2 = this;
                androidx.camera.camera2.e.w1 r0 = androidx.camera.camera2.p003e.C0553w1.this
                boolean r1 = r0.f1804N
                if (r1 == 0) goto L_0x0010
                int r0 = r0.f1816y
                r1 = 4
                if (r0 == r1) goto L_0x0010
                r1 = 2
                if (r0 == r1) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0553w1.C0560g.mo2420f():boolean");
        }

        public void onClosed(CameraDevice cameraDevice) {
            C0553w1.this.mo2406u("CameraDevice.onClosed()");
            boolean z = C0553w1.this.f1815x == null;
            C1177h.m4586h(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C0556c.f1821a[C0553w1.this.f1809r.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    C0553w1 w1Var = C0553w1.this;
                    if (w1Var.f1816y != 0) {
                        w1Var.mo2406u("Camera closed due to error: " + C0553w1.m2255y(C0553w1.this.f1816y));
                        mo2419e();
                        return;
                    }
                    w1Var.mo2402n0(false);
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + C0553w1.this.f1809r);
                }
            }
            C1177h.m4585g(C0553w1.this.mo2370B());
            C0553w1.this.mo2408x();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C0553w1.this.mo2406u("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        public void onError(CameraDevice cameraDevice, int i) {
            C0553w1 w1Var = C0553w1.this;
            w1Var.f1815x = cameraDevice;
            w1Var.f1816y = i;
            int i2 = C0556c.f1821a[w1Var.f1809r.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    C0949o2.m3688a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", new Object[]{cameraDevice.getId(), C0553w1.m2255y(i), C0553w1.this.f1809r.name()}));
                    m2305b(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + C0553w1.this.f1809r);
                }
            }
            C0949o2.m3690c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", new Object[]{cameraDevice.getId(), C0553w1.m2255y(i), C0553w1.this.f1809r.name()}));
            C0553w1.this.mo2404q(false);
        }

        public void onOpened(CameraDevice cameraDevice) {
            C0553w1.this.mo2406u("CameraDevice.onOpened()");
            C0553w1 w1Var = C0553w1.this;
            w1Var.f1815x = cameraDevice;
            w1Var.f1816y = 0;
            mo2418d();
            int i = C0556c.f1821a[C0553w1.this.f1809r.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    C0553w1.this.mo2390f0(C0559f.OPENED);
                    C0553w1.this.mo2379Y();
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C0553w1.this.f1809r);
                }
            }
            C1177h.m4585g(C0553w1.this.mo2370B());
            C0553w1.this.f1815x.close();
            C0553w1.this.f1815x = null;
        }
    }

    /* renamed from: androidx.camera.camera2.e.w1$h */
    static abstract class C0563h {
        C0563h() {
        }

        /* renamed from: a */
        static C0563h m2319a(String str, Class<?> cls, C0840m2 m2Var, Size size) {
            return new C0525q1(str, cls, m2Var, size);
        }

        /* renamed from: b */
        static C0563h m2320b(C0608a3 a3Var) {
            return m2319a(C0553w1.m2256z(a3Var), a3Var.getClass(), a3Var.mo2576k(), a3Var.mo2567b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0840m2 mo2266c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Size mo2267d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract String mo2268e();

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract Class<?> mo2270f();
    }

    C0553w1(C0418m0 m0Var, String str, C0569x1 x1Var, C0911y0 y0Var, Executor executor, Handler handler) {
        C0418m0 m0Var2 = m0Var;
        String str2 = str;
        C0569x1 x1Var2 = x1Var;
        C0911y0 y0Var2 = y0Var;
        C0905x1<C0899w0.C0900a> x1Var3 = new C0905x1<>();
        this.f1810s = x1Var3;
        this.f1816y = 0;
        this.f1791A = new AtomicInteger(0);
        this.f1793C = new LinkedHashMap();
        this.f1796F = new HashSet();
        this.f1800J = new HashSet();
        this.f1802L = new Object();
        this.f1804N = false;
        this.f1806o = m0Var2;
        this.f1795E = y0Var2;
        ScheduledExecutorService f = C0744a.m3049f(handler);
        this.f1808q = f;
        Executor g = C0744a.m3050g(executor);
        this.f1807p = g;
        this.f1813v = new C0560g(g, f);
        this.f1805f = new C0895v2(str2);
        x1Var3.mo3151m(C0899w0.C0900a.CLOSED);
        C0496k2 k2Var = new C0496k2(y0Var2);
        this.f1811t = k2Var;
        C0530r2 r2Var = new C0530r2(g);
        this.f1798H = r2Var;
        this.f1817z = m2239U();
        try {
            C0542u1 u1Var = new C0542u1(m0Var.mo2139c(str), f, g, new C0558e(), x1Var.mo2459g());
            this.f1812u = u1Var;
            this.f1814w = x1Var2;
            x1Var2.mo2467o(u1Var);
            x1Var2.mo2468r(k2Var.mo2234a());
            this.f1799I = new C0349e3.C0350a(g, f, handler, r2Var, x1Var.mo2466n());
            C0557d dVar = new C0557d(str2);
            this.f1794D = dVar;
            y0Var2.mo3164e(this, g, dVar);
            m0Var2.mo2142f(g, dVar);
        } catch (C0386a0 e) {
            throw C0501l2.m2043a(e);
        }
    }

    /* renamed from: A */
    private boolean m2228A() {
        return ((C0569x1) mo2400m()).mo2466n() == 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo2371D(List list) {
        try {
            m2246k0(list);
        } finally {
            this.f1812u.mo2338l();
        }
    }

    /* renamed from: E */
    static /* synthetic */ void m2230E(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void mo2374K(String str, C0840m2 m2Var) {
        mo2406u("Use case " + str + " ACTIVE");
        this.f1805f.mo3125k(str, m2Var);
        this.f1805f.mo3129o(str, m2Var);
        mo2403o0();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void mo2375M(String str) {
        mo2406u("Use case " + str + " INACTIVE");
        this.f1805f.mo3128n(str);
        mo2403o0();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void mo2376O(String str, C0840m2 m2Var) {
        mo2406u("Use case " + str + " RESET");
        this.f1805f.mo3129o(str, m2Var);
        mo2388e0(false);
        mo2403o0();
        if (this.f1809r == C0559f.OPENED) {
            mo2379Y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void mo2377Q(String str, C0840m2 m2Var) {
        mo2406u("Use case " + str + " UPDATED");
        this.f1805f.mo3129o(str, m2Var);
        mo2403o0();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void mo2378T(boolean z) {
        this.f1804N = z;
        if (!z) {
            return;
        }
        if (this.f1809r == C0559f.PENDING_OPEN || this.f1809r == C0559f.REOPENING) {
            mo2401m0(false);
        }
    }

    /* renamed from: U */
    private C0526q2 m2239U() {
        synchronized (this.f1802L) {
            if (this.f1803M == null) {
                C0517p2 p2Var = new C0517p2();
                return p2Var;
            }
            C0583z2 z2Var = new C0583z2(this.f1803M, this.f1814w, this.f1807p, this.f1808q);
            return z2Var;
        }
    }

    /* renamed from: V */
    private void m2240V(List<C0608a3> list) {
        for (C0608a3 next : list) {
            String z = m2256z(next);
            if (!this.f1800J.contains(z)) {
                this.f1800J.add(z);
                next.mo2559B();
            }
        }
    }

    /* renamed from: W */
    private void m2241W(List<C0608a3> list) {
        for (C0608a3 next : list) {
            String z = m2256z(next);
            if (this.f1800J.contains(z)) {
                next.mo2560C();
                this.f1800J.remove(z);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: X */
    private void m2242X(boolean z) {
        if (!z) {
            this.f1813v.mo2418d();
        }
        this.f1813v.mo2417a();
        mo2406u("Opening camera.");
        mo2390f0(C0559f.OPENING);
        try {
            this.f1806o.mo2141e(this.f1814w.mo2453a(), this.f1807p, m2253t());
        } catch (C0386a0 e) {
            mo2406u("Unable to open camera due to " + e.getMessage());
            if (e.mo2075d() == 10001) {
                mo2392g0(C0559f.INITIALIZED, C0974t1.C0975a.m3791b(7, e));
            }
        } catch (SecurityException e2) {
            mo2406u("Unable to open camera due to " + e2.getMessage());
            mo2390f0(C0559f.REOPENING);
            this.f1813v.mo2419e();
        }
    }

    /* renamed from: Z */
    private void m2243Z() {
        int i = C0556c.f1821a[this.f1809r.ordinal()];
        boolean z = false;
        if (i == 1 || i == 2) {
            mo2401m0(false);
        } else if (i != 3) {
            mo2406u("open() ignored due to being in state: " + this.f1809r);
        } else {
            mo2390f0(C0559f.REOPENING);
            if (!mo2370B() && this.f1816y == 0) {
                if (this.f1815x != null) {
                    z = true;
                }
                C1177h.m4586h(z, "Camera Device should be open if session close is not complete");
                mo2390f0(C0559f.OPENED);
                mo2379Y();
            }
        }
    }

    /* renamed from: d0 */
    private void m2244d0() {
        if (this.f1797G != null) {
            C0895v2 v2Var = this.f1805f;
            v2Var.mo3127m(this.f1797G.mo2488c() + this.f1797G.hashCode());
            C0895v2 v2Var2 = this.f1805f;
            v2Var2.mo3128n(this.f1797G.mo2488c() + this.f1797G.hashCode());
            this.f1797G.mo2487a();
            this.f1797G = null;
        }
    }

    /* renamed from: j0 */
    private Collection<C0563h> m2245j0(Collection<C0608a3> collection) {
        ArrayList arrayList = new ArrayList();
        for (C0608a3 b : collection) {
            arrayList.add(C0563h.m2320b(b));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    private void m2246k0(Collection<C0563h> collection) {
        Size d;
        boolean isEmpty = this.f1805f.mo3122d().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (C0563h next : collection) {
            if (!this.f1805f.mo3123g(next.mo2268e())) {
                this.f1805f.mo3126l(next.mo2268e(), next.mo2266c());
                arrayList.add(next.mo2268e());
                if (next.mo2270f() == C0967s2.class && (d = next.mo2267d()) != null) {
                    rational = new Rational(d.getWidth(), d.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            mo2406u("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.f1812u.mo2321a0(true);
                this.f1812u.mo2308B();
            }
            m2249o();
            mo2403o0();
            mo2388e0(false);
            if (this.f1809r == C0559f.OPENED) {
                mo2379Y();
            } else {
                m2243Z();
            }
            if (rational != null) {
                this.f1812u.mo2323b0(rational);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m2232H(Collection<C0563h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (C0563h next : collection) {
            if (this.f1805f.mo3123g(next.mo2268e())) {
                this.f1805f.mo3124j(next.mo2268e());
                arrayList.add(next.mo2268e());
                if (next.mo2270f() == C0967s2.class) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            mo2406u("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            if (z) {
                this.f1812u.mo2323b0((Rational) null);
            }
            m2249o();
            if (this.f1805f.mo3122d().isEmpty()) {
                this.f1812u.mo2338l();
                mo2388e0(false);
                this.f1812u.mo2321a0(false);
                this.f1817z = m2239U();
                m2251r();
                return;
            }
            mo2403o0();
            mo2388e0(false);
            if (this.f1809r == C0559f.OPENED) {
                mo2379Y();
            }
        }
    }

    /* renamed from: n */
    private void m2248n() {
        if (this.f1797G != null) {
            C0895v2 v2Var = this.f1805f;
            v2Var.mo3126l(this.f1797G.mo2488c() + this.f1797G.hashCode(), this.f1797G.mo2489d());
            C0895v2 v2Var2 = this.f1805f;
            v2Var2.mo3125k(this.f1797G.mo2488c() + this.f1797G.hashCode(), this.f1797G.mo2489d());
        }
    }

    /* renamed from: o */
    private void m2249o() {
        C0840m2 b = this.f1805f.mo3121c().mo3054b();
        C0788c1 f = b.mo3031f();
        int size = f.mo2953d().size();
        int size2 = b.mo3034i().size();
        if (b.mo3034i().isEmpty()) {
            return;
        }
        if (f.mo2953d().isEmpty()) {
            if (this.f1797G == null) {
                this.f1797G = new C0577y2(this.f1814w.mo2463k());
            }
            m2248n();
        } else if (!(size2 == 1 && size == 1) && size < 2) {
            C0949o2.m3688a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        } else {
            m2244d0();
        }
    }

    /* renamed from: p */
    private boolean m2250p(C0788c1.C0789a aVar) {
        String str;
        if (!aVar.mo2966l().isEmpty()) {
            str = "The capture config builder already has surface inside.";
        } else {
            for (C0840m2 f : this.f1805f.mo3120b()) {
                List<C0820i1> d = f.mo3031f().mo2953d();
                if (!d.isEmpty()) {
                    for (C0820i1 f2 : d) {
                        aVar.mo2962f(f2);
                    }
                }
            }
            if (!aVar.mo2966l().isEmpty()) {
                return true;
            }
            str = "Unable to find a repeating surface to attach to CaptureConfig";
        }
        C0949o2.m3698k("Camera2CameraImpl", str);
        return false;
    }

    /* renamed from: r */
    private void m2251r() {
        mo2406u("Closing camera.");
        int i = C0556c.f1821a[this.f1809r.ordinal()];
        boolean z = false;
        if (i == 2) {
            if (this.f1815x == null) {
                z = true;
            }
            C1177h.m4585g(z);
            mo2390f0(C0559f.INITIALIZED);
        } else if (i == 4) {
            mo2390f0(C0559f.CLOSING);
            mo2404q(false);
        } else if (i == 5 || i == 6) {
            boolean a = this.f1813v.mo2417a();
            mo2390f0(C0559f.CLOSING);
            if (a) {
                C1177h.m4585g(mo2370B());
                mo2408x();
            }
        } else {
            mo2406u("close() ignored due to being in state: " + this.f1809r);
        }
    }

    /* renamed from: s */
    private void m2252s(boolean z) {
        C0517p2 p2Var = new C0517p2();
        this.f1796F.add(p2Var);
        mo2388e0(z);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        C0551w wVar = new C0551w(surface, surfaceTexture);
        C0840m2.C0842b bVar = new C0840m2.C0842b();
        C0894v1 v1Var = new C0894v1(surface);
        bVar.mo3043h(v1Var);
        bVar.mo3052r(1);
        mo2406u("Start configAndClose.");
        p2Var.mo2253g(bVar.mo3048m(), (CameraDevice) C1177h.m4583e(this.f1815x), this.f1799I.mo2006a()).mo2919e(new C0532s(this, p2Var, v1Var, wVar), this.f1807p);
    }

    /* renamed from: t */
    private CameraDevice.StateCallback m2253t() {
        ArrayList arrayList = new ArrayList(this.f1805f.mo3121c().mo3054b().mo3027b());
        arrayList.add(this.f1798H.mo2275c());
        arrayList.add(this.f1813v);
        return C0377i2.m1778a(arrayList);
    }

    /* renamed from: v */
    private void m2254v(String str, Throwable th) {
        C0949o2.m3689b("Camera2CameraImpl", String.format("{%s} %s", new Object[]{toString(), str}), th);
    }

    /* renamed from: y */
    static String m2255y(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: z */
    static String m2256z(C0608a3 a3Var) {
        return a3Var.mo2574i() + a3Var.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo2370B() {
        return this.f1793C.isEmpty() && this.f1796F.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo2379Y() {
        C1177h.m4585g(this.f1809r == C0559f.OPENED);
        C0840m2.C0846f c = this.f1805f.mo3121c();
        if (!c.mo3056d()) {
            mo2406u("Unable to create capture session due to conflicting configurations");
        } else {
            C0768f.m3075a(this.f1817z.mo2253g(c.mo3054b(), (CameraDevice) C1177h.m4583e(this.f1815x), this.f1799I.mo2006a()), new C0555b(), this.f1807p);
        }
    }

    /* renamed from: a */
    public /* synthetic */ C0957q1 mo2380a() {
        return C0893v0.m3522b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo2381a0(C0840m2 m2Var) {
        ScheduledExecutorService d = C0744a.m3047d();
        List<C0840m2.C0843c> c = m2Var.mo3028c();
        if (!c.isEmpty()) {
            m2254v("Posting surface closed", new Throwable());
            d.execute(new C0547v(c.get(0), m2Var));
        }
    }

    /* renamed from: b */
    public void mo2382b(C0608a3 a3Var) {
        C1177h.m4583e(a3Var);
        this.f1807p.execute(new C0514p(this, m2256z(a3Var), a3Var.mo2576k()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m2231F(C0517p2 p2Var, C0820i1 i1Var, Runnable runnable) {
        this.f1796F.remove(p2Var);
        C9172b<Void> c0 = mo2385c0(p2Var, false);
        i1Var.mo3001a();
        C0768f.m3087m(Arrays.asList(new C9172b[]{c0, i1Var.mo3007g()})).mo2919e(runnable, C0744a.m3044a());
    }

    /* renamed from: c */
    public /* synthetic */ C0938m1 mo2384c() {
        return C0893v0.m3521a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C9172b<Void> mo2385c0(C0526q2 q2Var, boolean z) {
        q2Var.close();
        C9172b<Void> b = q2Var.mo2247b(z);
        mo2406u("Releasing session in state " + this.f1809r.name());
        this.f1793C.put(q2Var, b);
        C0768f.m3075a(b, new C0554a(q2Var), C0744a.m3044a());
        return b;
    }

    /* renamed from: d */
    public void mo2386d(C0608a3 a3Var) {
        C1177h.m4583e(a3Var);
        this.f1807p.execute(new C0540u(this, m2256z(a3Var), a3Var.mo2576k()));
    }

    /* renamed from: e */
    public void mo2387e(C0848n0 n0Var) {
        if (n0Var == null) {
            n0Var = C0861q0.m3400a();
        }
        C0850n2 F = n0Var.mo3058F((C0850n2) null);
        this.f1801K = n0Var;
        synchronized (this.f1802L) {
            this.f1803M = F;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo2388e0(boolean z) {
        C1177h.m4585g(this.f1817z != null);
        mo2406u("Resetting Capture Session");
        C0526q2 q2Var = this.f1817z;
        C0840m2 e = q2Var.mo2251e();
        List<C0788c1> c = q2Var.mo2248c();
        C0526q2 U = m2239U();
        this.f1817z = U;
        U.mo2252f(e);
        this.f1817z.mo2250d(c);
        mo2385c0(q2Var, z);
    }

    /* renamed from: f */
    public void mo2389f(C0608a3 a3Var) {
        C1177h.m4583e(a3Var);
        this.f1807p.execute(new C0510o(this, m2256z(a3Var), a3Var.mo2576k()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo2390f0(C0559f fVar) {
        mo2392g0(fVar, (C0974t1.C0975a) null);
    }

    /* renamed from: g */
    public C0796d2<C0899w0.C0900a> mo2391g() {
        return this.f1810s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo2392g0(C0559f fVar, C0974t1.C0975a aVar) {
        mo2394h0(fVar, aVar, true);
    }

    /* renamed from: h */
    public void mo2393h(C0608a3 a3Var) {
        C1177h.m4583e(a3Var);
        this.f1807p.execute(new C0527r(this, m2256z(a3Var)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo2394h0(C0559f fVar, C0974t1.C0975a aVar, boolean z) {
        C0899w0.C0900a aVar2;
        mo2406u("Transitioning camera internal state: " + this.f1809r + " --> " + fVar);
        this.f1809r = fVar;
        switch (C0556c.f1821a[fVar.ordinal()]) {
            case 1:
                aVar2 = C0899w0.C0900a.CLOSED;
                break;
            case 2:
                aVar2 = C0899w0.C0900a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = C0899w0.C0900a.CLOSING;
                break;
            case 4:
                aVar2 = C0899w0.C0900a.OPEN;
                break;
            case 5:
            case 6:
                aVar2 = C0899w0.C0900a.OPENING;
                break;
            case 7:
                aVar2 = C0899w0.C0900a.RELEASING;
                break;
            case 8:
                aVar2 = C0899w0.C0900a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f1795E.mo3163c(this, aVar2, z);
        this.f1810s.mo3151m(aVar2);
        this.f1811t.mo2235c(aVar2, aVar);
    }

    /* renamed from: i */
    public C0868r0 mo2395i() {
        return this.f1812u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo2396i0(List<C0788c1> list) {
        ArrayList arrayList = new ArrayList();
        for (C0788c1 next : list) {
            C0788c1.C0789a k = C0788c1.C0789a.m3120k(next);
            if (!next.mo2953d().isEmpty() || !next.mo2956g() || m2250p(k)) {
                arrayList.add(k.mo2964h());
            }
        }
        mo2406u("Issue capture request");
        this.f1817z.mo2250d(arrayList);
    }

    /* renamed from: j */
    public void mo2397j(boolean z) {
        this.f1807p.execute(new C0567x(this, z));
    }

    /* renamed from: k */
    public void mo2398k(Collection<C0608a3> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.f1812u.mo2308B();
            m2240V(new ArrayList(arrayList));
            try {
                this.f1807p.execute(new C0536t(this, new ArrayList(m2245j0(arrayList))));
            } catch (RejectedExecutionException e) {
                m2254v("Unable to attach use cases.", e);
                this.f1812u.mo2338l();
            }
        }
    }

    /* renamed from: l */
    public void mo2399l(Collection<C0608a3> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(m2245j0(arrayList));
            m2241W(new ArrayList(arrayList));
            this.f1807p.execute(new C0572y(this, arrayList2));
        }
    }

    /* renamed from: m */
    public C0888u0 mo2400m() {
        return this.f1814w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo2401m0(boolean z) {
        mo2406u("Attempting to force open the camera.");
        if (!this.f1795E.mo3165f(this)) {
            mo2406u("No cameras available. Waiting for available camera before opening camera.");
            mo2390f0(C0559f.PENDING_OPEN);
            return;
        }
        m2242X(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo2402n0(boolean z) {
        mo2406u("Attempting to open the camera.");
        if (!(this.f1794D.mo2412b() && this.f1795E.mo3165f(this))) {
            mo2406u("No cameras available. Waiting for available camera before opening camera.");
            mo2390f0(C0559f.PENDING_OPEN);
            return;
        }
        m2242X(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo2403o0() {
        C0840m2.C0846f a = this.f1805f.mo3119a();
        if (a.mo3056d()) {
            this.f1812u.mo2325c0(a.mo3054b().mo3035j());
            a.mo3053a(this.f1812u.mo2346t());
            this.f1817z.mo2252f(a.mo3054b());
            return;
        }
        this.f1812u.mo2319Z();
        this.f1817z.mo2252f(this.f1812u.mo2346t());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2404q(boolean z) {
        boolean z2 = this.f1809r == C0559f.CLOSING || this.f1809r == C0559f.RELEASING || (this.f1809r == C0559f.REOPENING && this.f1816y != 0);
        C1177h.m4586h(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f1809r + " (error: " + m2255y(this.f1816y) + ")");
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29 || !m2228A() || this.f1816y != 0) {
            mo2388e0(z);
        } else {
            m2252s(z);
        }
        this.f1817z.mo2246a();
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f1814w.mo2453a()});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2406u(String str) {
        m2254v(str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0840m2 mo2407w(C0820i1 i1Var) {
        for (C0840m2 next : this.f1805f.mo3122d()) {
            if (next.mo3034i().contains(i1Var)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2408x() {
        C1177h.m4585g(this.f1809r == C0559f.RELEASING || this.f1809r == C0559f.CLOSING);
        C1177h.m4585g(this.f1793C.isEmpty());
        this.f1815x = null;
        if (this.f1809r == C0559f.CLOSING) {
            mo2390f0(C0559f.INITIALIZED);
            return;
        }
        this.f1806o.mo2143g(this.f1794D);
        mo2390f0(C0559f.RELEASED);
        C1814b.C1815a<Void> aVar = this.f1792B;
        if (aVar != null) {
            aVar.mo6308c(null);
            this.f1792B = null;
        }
    }
}
