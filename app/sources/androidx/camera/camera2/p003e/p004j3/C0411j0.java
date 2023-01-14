package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.p003e.p004j3.C0388b0;
import androidx.camera.camera2.p003e.p004j3.C0415l0;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0431a;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0435b;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.core.util.C1177h;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j3.j0 */
class C0411j0 extends C0409i0 {
    C0411j0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: h */
    static C0411j0 m1860h(CameraDevice cameraDevice, Handler handler) {
        return new C0411j0(cameraDevice, new C0415l0.C0416a(handler));
    }

    /* renamed from: a */
    public void mo2124a(C0444g gVar) {
        C0415l0.m1864c(this.f1538a, gVar);
        C0388b0.C0391c cVar = new C0388b0.C0391c(gVar.mo2187a(), gVar.mo2191e());
        List<C0435b> c = gVar.mo2189c();
        Handler handler = ((C0415l0.C0416a) C1177h.m4583e((C0415l0.C0416a) this.f1539b)).f1540a;
        C0431a b = gVar.mo2188b();
        if (b != null) {
            try {
                InputConfiguration inputConfiguration = (InputConfiguration) b.mo2161a();
                C1177h.m4583e(inputConfiguration);
                this.f1538a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C0444g.m1938g(c), cVar, handler);
            } catch (CameraAccessException e) {
                throw C0386a0.m1792e(e);
            }
        } else if (gVar.mo2190d() == 1) {
            this.f1538a.createConstrainedHighSpeedCaptureSession(C0415l0.m1866f(c), cVar, handler);
        } else {
            this.f1538a.createCaptureSessionByOutputConfigurations(C0444g.m1938g(c), cVar, handler);
        }
    }
}
