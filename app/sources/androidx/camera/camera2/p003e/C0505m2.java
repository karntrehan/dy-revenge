package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0793d0;
import androidx.camera.core.impl.C0891u2;
import androidx.core.util.C1177h;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.m2 */
final class C0505m2 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final C0783b0 f1643a;

    C0505m2(C0783b0 b0Var) {
        Objects.requireNonNull(b0Var, "cameraCaptureCallback is null");
        this.f1643a = b0Var;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C0891u2 u2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C1177h.m4580b(tag instanceof C0891u2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            u2Var = (C0891u2) tag;
        } else {
            u2Var = C0891u2.m3514a();
        }
        this.f1643a.mo1920b(new C0538t1(u2Var, totalCaptureResult));
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f1643a.mo1921c(new C0793d0(C0793d0.C0794a.ERROR));
    }
}
