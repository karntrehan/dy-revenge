package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.n */
public final /* synthetic */ class C0421n implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1549f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1550o;

    public /* synthetic */ C0421n(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f1549f = cVar;
        this.f1550o = cameraCaptureSession;
    }

    public final void run() {
        this.f1549f.mo2102l(this.f1550o);
    }
}
