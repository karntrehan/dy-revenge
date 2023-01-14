package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.k */
public final /* synthetic */ class C0412k implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1534f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1535o;

    public /* synthetic */ C0412k(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f1534f = cVar;
        this.f1535o = cameraCaptureSession;
    }

    public final void run() {
        this.f1534f.mo2098d(this.f1535o);
    }
}
