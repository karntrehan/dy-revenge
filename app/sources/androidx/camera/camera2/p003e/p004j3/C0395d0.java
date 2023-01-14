package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.p003e.p004j3.C0388b0;
import androidx.core.util.C1177h;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.d0 */
class C0395d0 implements C0388b0.C0389a {

    /* renamed from: a */
    final CameraCaptureSession f1506a;

    /* renamed from: b */
    final Object f1507b;

    /* renamed from: androidx.camera.camera2.e.j3.d0$a */
    private static class C0396a {

        /* renamed from: a */
        final Handler f1508a;

        C0396a(Handler handler) {
            this.f1508a = handler;
        }
    }

    C0395d0(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f1506a = (CameraCaptureSession) C1177h.m4583e(cameraCaptureSession);
        this.f1507b = obj;
    }

    /* renamed from: d */
    static C0388b0.C0389a m1831d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C0395d0(cameraCaptureSession, new C0396a(handler));
    }

    /* renamed from: a */
    public CameraCaptureSession mo2080a() {
        return this.f1506a;
    }

    /* renamed from: b */
    public int mo2081b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1506a.setRepeatingRequest(captureRequest, new C0388b0.C0390b(executor, captureCallback), ((C0396a) this.f1507b).f1508a);
    }

    /* renamed from: c */
    public int mo2082c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1506a.captureBurst(list, new C0388b0.C0390b(executor, captureCallback), ((C0396a) this.f1507b).f1508a);
    }
}
