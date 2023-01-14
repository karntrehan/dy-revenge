package androidx.camera.camera2.p002d;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p008f.C0599k;
import androidx.camera.core.C1010z1;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0922z1;

/* renamed from: androidx.camera.camera2.d.b */
public final class C0304b extends C0599k {

    /* renamed from: A */
    public static final C0809g1.C0810a<CameraCaptureSession.CaptureCallback> f1295A = C0809g1.C0810a.m3180a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: B */
    public static final C0809g1.C0810a<C0308d> f1296B = C0809g1.C0810a.m3180a("camera2.cameraEvent.callback", C0308d.class);

    /* renamed from: C */
    public static final C0809g1.C0810a<Object> f1297C = C0809g1.C0810a.m3180a("camera2.captureRequest.tag", Object.class);

    /* renamed from: D */
    public static final C0809g1.C0810a<String> f1298D = C0809g1.C0810a.m3180a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: x */
    public static final C0809g1.C0810a<Integer> f1299x = C0809g1.C0810a.m3180a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: y */
    public static final C0809g1.C0810a<CameraDevice.StateCallback> f1300y = C0809g1.C0810a.m3180a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: z */
    public static final C0809g1.C0810a<CameraCaptureSession.StateCallback> f1301z = C0809g1.C0810a.m3180a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: androidx.camera.camera2.d.b$a */
    public static final class C0305a implements C1010z1<C0304b> {

        /* renamed from: a */
        private final C0714a2 f1302a = C0714a2.m2954J();

        /* renamed from: a */
        public C0304b mo1886a() {
            return new C0304b(C0802e2.m3155H(this.f1302a));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f1302a;
        }

        /* renamed from: d */
        public C0305a mo1888d(C0809g1 g1Var) {
            for (C0809g1.C0810a next : g1Var.mo2496c()) {
                this.f1302a.mo2814q(next, g1Var.mo2494a(next));
            }
            return this;
        }

        /* renamed from: e */
        public <ValueT> C0305a mo1889e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f1302a.mo2814q(C0304b.m1505G(key), valuet);
            return this;
        }
    }

    /* renamed from: androidx.camera.camera2.d.b$b */
    public static final class C0306b<T> {

        /* renamed from: a */
        C1010z1<T> f1303a;

        public C0306b(C1010z1<T> z1Var) {
            this.f1303a = z1Var;
        }

        /* renamed from: a */
        public C0306b<T> mo1890a(C0308d dVar) {
            this.f1303a.mo1887b().mo2814q(C0304b.f1296B, dVar);
            return this;
        }
    }

    public C0304b(C0809g1 g1Var) {
        super(g1Var);
    }

    /* renamed from: G */
    public static C0809g1.C0810a<Object> m1505G(CaptureRequest.Key<?> key) {
        return C0809g1.C0810a.m3181b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* renamed from: H */
    public C0308d mo1878H(C0308d dVar) {
        return (C0308d) mo2499i().mo2497d(f1296B, dVar);
    }

    /* renamed from: I */
    public C0599k mo1879I() {
        return C0599k.C0600a.m2485d(mo2499i()).mo2535a();
    }

    /* renamed from: J */
    public Object mo1880J(Object obj) {
        return mo2499i().mo2497d(f1297C, obj);
    }

    /* renamed from: K */
    public int mo1881K(int i) {
        return ((Integer) mo2499i().mo2497d(f1299x, Integer.valueOf(i))).intValue();
    }

    /* renamed from: L */
    public CameraDevice.StateCallback mo1882L(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo2499i().mo2497d(f1300y, stateCallback);
    }

    /* renamed from: M */
    public String mo1883M(String str) {
        return (String) mo2499i().mo2497d(f1298D, str);
    }

    /* renamed from: N */
    public CameraCaptureSession.CaptureCallback mo1884N(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo2499i().mo2497d(f1295A, captureCallback);
    }

    /* renamed from: O */
    public CameraCaptureSession.StateCallback mo1885O(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo2499i().mo2497d(f1301z, stateCallback);
    }
}
