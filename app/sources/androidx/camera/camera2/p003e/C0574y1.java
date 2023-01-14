package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0490x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.y1 */
public final class C0574y1 {

    /* renamed from: androidx.camera.camera2.e.y1$a */
    private static final class C0575a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        private final List<CameraCaptureSession.CaptureCallback> f1896a = new ArrayList();

        C0575a(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback next : list) {
                if (!(next instanceof C0576b)) {
                    this.f1896a.add(next);
                }
            }
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            for (CameraCaptureSession.CaptureCallback a : this.f1896a) {
                C0490x.m2032a(a, cameraCaptureSession, captureRequest, surface, j);
            }
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            for (CameraCaptureSession.CaptureCallback onCaptureCompleted : this.f1896a) {
                onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            for (CameraCaptureSession.CaptureCallback onCaptureFailed : this.f1896a) {
                onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            for (CameraCaptureSession.CaptureCallback onCaptureProgressed : this.f1896a) {
                onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : this.f1896a) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : this.f1896a) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            for (CameraCaptureSession.CaptureCallback onCaptureStarted : this.f1896a) {
                onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.y1$b */
    static final class C0576b extends CameraCaptureSession.CaptureCallback {
        C0576b() {
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        }
    }

    /* renamed from: a */
    static CameraCaptureSession.CaptureCallback m2390a(List<CameraCaptureSession.CaptureCallback> list) {
        return new C0575a(list);
    }

    /* renamed from: b */
    public static CameraCaptureSession.CaptureCallback m2391b(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return m2390a(Arrays.asList(captureCallbackArr));
    }

    /* renamed from: c */
    public static CameraCaptureSession.CaptureCallback m2392c() {
        return new C0576b();
    }
}
