package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.p008f.C0599k;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.e.b2 */
class C0328b2 {
    /* renamed from: a */
    private static void m1622a(CaptureRequest.Builder builder, C0809g1 g1Var) {
        C0599k a = C0599k.C0600a.m2485d(g1Var).mo2535a();
        for (C0809g1.C0810a next : a.mo2496c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) next.mo2987d();
            try {
                builder.set(key, a.mo2494a(next));
            } catch (IllegalArgumentException unused) {
                C0949o2.m3690c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: b */
    public static CaptureRequest m1623b(C0788c1 c1Var, CameraDevice cameraDevice, Map<C0820i1, Surface> map) {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d = m1625d(c1Var.mo2953d(), map);
        if (d.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c1Var.mo2955f());
        m1622a(createCaptureRequest, c1Var.mo2952c());
        C0809g1 c = c1Var.mo2952c();
        C0809g1.C0810a<Integer> aVar = C0788c1.f2357a;
        if (c.mo2495b(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c1Var.mo2952c().mo2494a(aVar));
        }
        C0809g1 c2 = c1Var.mo2952c();
        C0809g1.C0810a<Integer> aVar2 = C0788c1.f2358b;
        if (c2.mo2495b(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c1Var.mo2952c().mo2494a(aVar2)).byteValue()));
        }
        for (Surface addTarget : d) {
            createCaptureRequest.addTarget(addTarget);
        }
        createCaptureRequest.setTag(c1Var.mo2954e());
        return createCaptureRequest.build();
    }

    /* renamed from: c */
    public static CaptureRequest m1624c(C0788c1 c1Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c1Var.mo2955f());
        m1622a(createCaptureRequest, c1Var.mo2952c());
        return createCaptureRequest.build();
    }

    /* renamed from: d */
    private static List<Surface> m1625d(List<C0820i1> list, Map<C0820i1, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (C0820i1 i1Var : list) {
            Surface surface = map.get(i1Var);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
