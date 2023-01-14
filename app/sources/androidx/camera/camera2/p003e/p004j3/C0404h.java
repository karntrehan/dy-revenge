package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.h */
public final /* synthetic */ class C0404h implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0391c f1524f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1525o;

    /* renamed from: p */
    public final /* synthetic */ Surface f1526p;

    public /* synthetic */ C0404h(C0388b0.C0391c cVar, CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f1524f = cVar;
        this.f1525o = cameraCaptureSession;
        this.f1526p = surface;
    }

    public final void run() {
        this.f1524f.mo2103n(this.f1525o, this.f1526p);
    }
}
