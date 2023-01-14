package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0388b0;
import androidx.camera.camera2.p003e.p004j3.C0405h0;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0435b;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.camera.core.C0949o2;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j3.l0 */
class C0415l0 implements C0405h0.C0406a {

    /* renamed from: a */
    final CameraDevice f1538a;

    /* renamed from: b */
    final Object f1539b;

    /* renamed from: androidx.camera.camera2.e.j3.l0$a */
    static class C0416a {

        /* renamed from: a */
        final Handler f1540a;

        C0416a(Handler handler) {
            this.f1540a = handler;
        }
    }

    C0415l0(CameraDevice cameraDevice, Object obj) {
        this.f1538a = (CameraDevice) C1177h.m4583e(cameraDevice);
        this.f1539b = obj;
    }

    /* renamed from: b */
    private static void m1863b(CameraDevice cameraDevice, List<C0435b> list) {
        String id = cameraDevice.getId();
        for (C0435b a : list) {
            String a2 = a.mo2169a();
            if (a2 != null && !a2.isEmpty()) {
                C0949o2.m3698k("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + a2 + ". Ignoring.");
            }
        }
    }

    /* renamed from: c */
    static void m1864c(CameraDevice cameraDevice, C0444g gVar) {
        C1177h.m4583e(cameraDevice);
        C1177h.m4583e(gVar);
        C1177h.m4583e(gVar.mo2191e());
        List<C0435b> c = gVar.mo2189c();
        if (c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (gVar.mo2187a() != null) {
            m1863b(cameraDevice, c);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    /* renamed from: d */
    static C0415l0 m1865d(CameraDevice cameraDevice, Handler handler) {
        return new C0415l0(cameraDevice, new C0416a(handler));
    }

    /* renamed from: f */
    static List<Surface> m1866f(List<C0435b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C0435b b : list) {
            arrayList.add(b.mo2170b());
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo2124a(C0444g gVar) {
        m1864c(this.f1538a, gVar);
        if (gVar.mo2188b() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (gVar.mo2190d() != 1) {
            C0388b0.C0391c cVar = new C0388b0.C0391c(gVar.mo2187a(), gVar.mo2191e());
            mo2137e(this.f1538a, m1866f(gVar.mo2189c()), cVar, ((C0416a) this.f1539b).f1540a);
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2137e(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e) {
            throw C0386a0.m1792e(e);
        }
    }
}
