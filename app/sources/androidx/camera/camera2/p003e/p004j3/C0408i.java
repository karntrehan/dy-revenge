package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.i */
public final /* synthetic */ class C0408i implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1530f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1531o;

    public /* synthetic */ C0408i(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f1530f = cVar;
        this.f1531o = cameraCaptureSession;
    }

    public final void run() {
        this.f1530f.mo2097b(this.f1531o);
    }
}
