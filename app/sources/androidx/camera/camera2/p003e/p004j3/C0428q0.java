package androidx.camera.camera2.p003e.p004j3;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.p003e.p004j3.C0405h0;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.core.util.C1177h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.q0 */
class C0428q0 implements C0418m0.C0420b {

    /* renamed from: a */
    final CameraManager f1558a;

    /* renamed from: b */
    final Object f1559b;

    /* renamed from: androidx.camera.camera2.e.j3.q0$a */
    static final class C0429a {

        /* renamed from: a */
        final Map<CameraManager.AvailabilityCallback, C0418m0.C0419a> f1560a = new HashMap();

        /* renamed from: b */
        final Handler f1561b;

        C0429a(Handler handler) {
            this.f1561b = handler;
        }
    }

    C0428q0(Context context, Object obj) {
        this.f1558a = (CameraManager) context.getSystemService("camera");
        this.f1559b = obj;
    }

    /* renamed from: f */
    static C0428q0 m1899f(Context context, Handler handler) {
        return new C0428q0(context, new C0429a(handler));
    }

    /* renamed from: a */
    public void mo2151a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            C0418m0.C0419a aVar = null;
            C0429a aVar2 = (C0429a) this.f1559b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f1560a) {
                    aVar = aVar2.f1560a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C0418m0.C0419a(executor, availabilityCallback);
                        aVar2.f1560a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f1558a.registerAvailabilityCallback(aVar, aVar2.f1561b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    /* renamed from: b */
    public void mo2152b(CameraManager.AvailabilityCallback availabilityCallback) {
        C0418m0.C0419a aVar;
        if (availabilityCallback != null) {
            C0429a aVar2 = (C0429a) this.f1559b;
            synchronized (aVar2.f1560a) {
                aVar = aVar2.f1560a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo2147g();
        }
        this.f1558a.unregisterAvailabilityCallback(aVar);
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
        C1177h.m4583e(executor);
        C1177h.m4583e(stateCallback);
        try {
            this.f1558a.openCamera(str, new C0405h0.C0407b(executor, stateCallback), ((C0429a) this.f1559b).f1561b);
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        }
    }

    /* renamed from: e */
    public String[] mo2155e() {
        try {
            return this.f1558a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        }
    }
}
