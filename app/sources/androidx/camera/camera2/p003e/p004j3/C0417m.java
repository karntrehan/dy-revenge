package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.m */
public final /* synthetic */ class C0417m implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1541f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1542o;

    public /* synthetic */ C0417m(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession) {
        this.f1541f = cVar;
        this.f1542o = cameraCaptureSession;
    }

    public final void run() {
        this.f1541f.mo2100h(this.f1542o);
    }
}
