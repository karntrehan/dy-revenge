package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0388b0;
import java.util.List;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.b3 */
interface C0329b3 {

    /* renamed from: androidx.camera.camera2.e.b3$a */
    public static abstract class C0330a {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo1952n(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo1953o(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo1954p(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo1955q(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo1956r(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo1957s(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo1958t(C0329b3 b3Var) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo1959u(C0329b3 b3Var, Surface surface) {
        }
    }

    /* renamed from: c */
    C0330a mo1942c();

    void close();

    /* renamed from: d */
    void mo1944d();

    /* renamed from: e */
    int mo1945e(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: f */
    C0388b0 mo1946f();

    /* renamed from: g */
    void mo1947g();

    /* renamed from: h */
    CameraDevice mo1948h();

    /* renamed from: i */
    int mo1949i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: k */
    void mo1950k();

    /* renamed from: m */
    C9172b<Void> mo1951m(String str);
}
