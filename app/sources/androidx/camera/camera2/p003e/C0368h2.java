package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0489w;
import androidx.camera.camera2.p003e.p004j3.C0491y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.h2 */
public final class C0368h2 {

    /* renamed from: androidx.camera.camera2.e.h2$a */
    static final class C0369a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        private final List<CameraCaptureSession.StateCallback> f1458a = new ArrayList();

        C0369a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback next : list) {
                if (!(next instanceof C0370b)) {
                    this.f1458a.add(next);
                }
            }
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onActive : this.f1458a) {
                onActive.onActive(cameraCaptureSession);
            }
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback b : this.f1458a) {
                C0491y.m2034b(b, cameraCaptureSession);
            }
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onClosed : this.f1458a) {
                onClosed.onClosed(cameraCaptureSession);
            }
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onConfigureFailed : this.f1458a) {
                onConfigureFailed.onConfigureFailed(cameraCaptureSession);
            }
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onConfigured : this.f1458a) {
                onConfigured.onConfigured(cameraCaptureSession);
            }
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onReady : this.f1458a) {
                onReady.onReady(cameraCaptureSession);
            }
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback a : this.f1458a) {
                C0489w.m2031a(a, cameraCaptureSession, surface);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.h2$b */
    static final class C0370b extends CameraCaptureSession.StateCallback {
        C0370b() {
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    /* renamed from: a */
    public static CameraCaptureSession.StateCallback m1753a(List<CameraCaptureSession.StateCallback> list) {
        return list.isEmpty() ? m1754b() : list.size() == 1 ? list.get(0) : new C0369a(list);
    }

    /* renamed from: b */
    public static CameraCaptureSession.StateCallback m1754b() {
        return new C0370b();
    }
}
