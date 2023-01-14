package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.core.util.C1177h;

/* renamed from: androidx.camera.camera2.e.j3.k0 */
class C0413k0 extends C0411j0 {
    C0413k0(CameraDevice cameraDevice) {
        super((CameraDevice) C1177h.m4583e(cameraDevice), (Object) null);
    }

    /* renamed from: a */
    public void mo2124a(C0444g gVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.mo2195i();
        C1177h.m4583e(sessionConfiguration);
        try {
            this.f1538a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        }
    }
}
