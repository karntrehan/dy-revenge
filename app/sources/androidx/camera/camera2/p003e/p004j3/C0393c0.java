package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.c0 */
class C0393c0 extends C0395d0 {
    C0393c0(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, (Object) null);
    }

    /* renamed from: b */
    public int mo2081b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1506a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public int mo2082c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1506a.captureBurstRequests(list, executor, captureCallback);
    }
}
