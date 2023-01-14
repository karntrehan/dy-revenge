package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.j */
public final /* synthetic */ class C0410j implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1532f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1533o;

    public /* synthetic */ C0410j(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f1532f = cVar;
        this.f1533o = cameraCaptureSession;
    }

    public final void run() {
        this.f1532f.mo2099f(this.f1533o);
    }
}
