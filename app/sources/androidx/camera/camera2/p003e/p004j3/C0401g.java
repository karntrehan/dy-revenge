package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.g */
public final /* synthetic */ class C0401g implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1518f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1519o;

    /* renamed from: p */
    public final /* synthetic */ CaptureRequest f1520p;

    /* renamed from: q */
    public final /* synthetic */ CaptureFailure f1521q;

    public /* synthetic */ C0401g(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.f1518f = bVar;
        this.f1519o = cameraCaptureSession;
        this.f1520p = captureRequest;
        this.f1521q = captureFailure;
    }

    public final void run() {
        this.f1518f.mo2085f(this.f1519o, this.f1520p, this.f1521q);
    }
}
