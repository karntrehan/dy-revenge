package androidx.camera.camera2.p003e.p004j3;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.core.impl.p014a3.C0742l;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.m0 */
public final class C0418m0 {

    /* renamed from: a */
    private final C0420b f1543a;

    /* renamed from: b */
    private final Map<String, C0402g0> f1544b = new ArrayMap(4);

    /* renamed from: androidx.camera.camera2.e.j3.m0$a */
    static final class C0419a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f1545a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f1546b;

        /* renamed from: c */
        private final Object f1547c = new Object();

        /* renamed from: d */
        private boolean f1548d = false;

        C0419a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f1545a = executor;
            this.f1546b = availabilityCallback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo2144b() {
            C0492z.m2035a(this.f1546b);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo2145d(String str) {
            this.f1546b.onCameraAvailable(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo2146f(String str) {
            this.f1546b.onCameraUnavailable(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2147g() {
            synchronized (this.f1547c) {
                this.f1548d = true;
            }
        }

        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f1547c) {
                if (!this.f1548d) {
                    this.f1545a.execute(new C0448s(this));
                }
            }
        }

        public void onCameraAvailable(String str) {
            synchronized (this.f1547c) {
                if (!this.f1548d) {
                    this.f1545a.execute(new C0472t(this, str));
                }
            }
        }

        public void onCameraUnavailable(String str) {
            synchronized (this.f1547c) {
                if (!this.f1548d) {
                    this.f1545a.execute(new C0487u(this, str));
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.j3.m0$b */
    public interface C0420b {
        /* renamed from: a */
        void mo2151a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: b */
        void mo2152b(CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: c */
        CameraCharacteristics mo2153c(String str);

        /* renamed from: d */
        void mo2154d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        /* renamed from: e */
        String[] mo2155e();
    }

    private C0418m0(C0420b bVar) {
        this.f1543a = bVar;
    }

    /* renamed from: a */
    public static C0418m0 m1869a(Context context) {
        return m1870b(context, C0742l.m3041a());
    }

    /* renamed from: b */
    public static C0418m0 m1870b(Context context, Handler handler) {
        return new C0418m0(C0422n0.m1888a(context, handler));
    }

    /* renamed from: c */
    public C0402g0 mo2139c(String str) {
        C0402g0 g0Var;
        synchronized (this.f1544b) {
            g0Var = this.f1544b.get(str);
            if (g0Var == null) {
                try {
                    g0Var = C0402g0.m1840e(this.f1543a.mo2153c(str));
                    this.f1544b.put(str, g0Var);
                } catch (AssertionError e) {
                    throw new C0386a0(10002, e.getMessage(), e);
                }
            }
        }
        return g0Var;
    }

    /* renamed from: d */
    public String[] mo2140d() {
        return this.f1543a.mo2155e();
    }

    /* renamed from: e */
    public void mo2141e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f1543a.mo2154d(str, executor, stateCallback);
    }

    /* renamed from: f */
    public void mo2142f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1543a.mo2151a(executor, availabilityCallback);
    }

    /* renamed from: g */
    public void mo2143g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1543a.mo2152b(availabilityCallback);
    }
}
