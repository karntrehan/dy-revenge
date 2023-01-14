package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.b */
public final /* synthetic */ class C0387b implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1489f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1490o;

    /* renamed from: p */
    public final /* synthetic */ CaptureRequest f1491p;

    /* renamed from: q */
    public final /* synthetic */ CaptureResult f1492q;

    public /* synthetic */ C0387b(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f1489f = bVar;
        this.f1490o = cameraCaptureSession;
        this.f1491p = captureRequest;
        this.f1492q = captureResult;
    }

    public final void run() {
        this.f1489f.mo2086h(this.f1490o, this.f1491p, this.f1492q);
    }
}
