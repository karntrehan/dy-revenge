package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: androidx.camera.camera2.e.j3.y */
public class C0491y {
    /* renamed from: a */
    public static <T> OutputConfiguration m2033a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: b */
    public static void m2034b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
