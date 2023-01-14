package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.C0783b0;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.n2 */
final class C0509n2 extends C0783b0 {

    /* renamed from: a */
    private final CameraCaptureSession.CaptureCallback f1649a;

    private C0509n2(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f1649a = captureCallback;
    }

    /* renamed from: d */
    static C0509n2 m2046d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C0509n2(captureCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public CameraCaptureSession.CaptureCallback mo2241e() {
        return this.f1649a;
    }
}
