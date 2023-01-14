package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.h0 */
public final class C0405h0 {

    /* renamed from: a */
    private final C0406a f1527a;

    /* renamed from: androidx.camera.camera2.e.j3.h0$a */
    interface C0406a {
        /* renamed from: a */
        void mo2124a(C0444g gVar);
    }

    /* renamed from: androidx.camera.camera2.e.j3.h0$b */
    static final class C0407b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f1528a;

        /* renamed from: b */
        private final Executor f1529b;

        C0407b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f1529b = executor;
            this.f1528a = stateCallback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo2125b(CameraDevice cameraDevice) {
            this.f1528a.onClosed(cameraDevice);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo2126d(CameraDevice cameraDevice) {
            this.f1528a.onDisconnected(cameraDevice);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo2127f(CameraDevice cameraDevice, int i) {
            this.f1528a.onError(cameraDevice, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo2128h(CameraDevice cameraDevice) {
            this.f1528a.onOpened(cameraDevice);
        }

        public void onClosed(CameraDevice cameraDevice) {
            this.f1529b.execute(new C0430r(this, cameraDevice));
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            this.f1529b.execute(new C0423o(this, cameraDevice));
        }

        public void onError(CameraDevice cameraDevice, int i) {
            this.f1529b.execute(new C0427q(this, cameraDevice, i));
        }

        public void onOpened(CameraDevice cameraDevice) {
            this.f1529b.execute(new C0425p(this, cameraDevice));
        }
    }

    private C0405h0(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f1527a = new C0413k0(cameraDevice);
        } else {
            this.f1527a = i >= 24 ? C0411j0.m1860h(cameraDevice, handler) : i >= 23 ? C0409i0.m1858g(cameraDevice, handler) : C0415l0.m1865d(cameraDevice, handler);
        }
    }

    /* renamed from: b */
    public static C0405h0 m1847b(CameraDevice cameraDevice, Handler handler) {
        return new C0405h0(cameraDevice, handler);
    }

    /* renamed from: a */
    public void mo2123a(C0444g gVar) {
        this.f1527a.mo2124a(gVar);
    }
}
