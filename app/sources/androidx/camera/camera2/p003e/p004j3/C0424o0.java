package androidx.camera.camera2.p003e.p004j3;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.o0 */
class C0424o0 extends C0428q0 {
    C0424o0(Context context) {
        super(context, (Object) null);
    }

    /* renamed from: g */
    static C0424o0 m1889g(Context context) {
        return new C0424o0(context);
    }

    /* renamed from: h */
    private boolean m1890h(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m1891i(th);
    }

    /* renamed from: i */
    private static boolean m1891i(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: j */
    private void m1892j(Throwable th) {
        throw new C0386a0(10001, th);
    }

    /* renamed from: a */
    public void mo2151a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1558a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    /* renamed from: b */
    public void mo2152b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1558a.unregisterAvailabilityCallback(availabilityCallback);
    }

    /* renamed from: c */
    public CameraCharacteristics mo2153c(String str) {
        try {
            return super.mo2153c(str);
        } catch (RuntimeException e) {
            if (m1890h(e)) {
                m1892j(e);
            }
            throw e;
        }
    }

    /* renamed from: d */
    public void mo2154d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f1558a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        } catch (IllegalArgumentException | SecurityException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (m1890h(e3)) {
                m1892j(e3);
            }
            throw e3;
        }
    }
}
