package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.l */
public final /* synthetic */ class C0414l implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1536f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1537o;

    public /* synthetic */ C0414l(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f1536f = cVar;
        this.f1537o = cameraCaptureSession;
    }

    public final void run() {
        this.f1536f.mo2101j(this.f1537o);
    }
}
