package androidx.camera.camera2.p003e.p004j3;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.p0 */
class C0426p0 extends C0424o0 {
    C0426p0(Context context) {
        super(context);
    }

    /* renamed from: c */
    public CameraCharacteristics mo2153c(String str) {
        try {
            return this.f1558a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        }
    }

    /* renamed from: d */
    public void mo2154d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f1558a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        }
    }
}
