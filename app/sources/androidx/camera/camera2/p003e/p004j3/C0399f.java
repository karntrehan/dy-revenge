package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.f */
public final /* synthetic */ class C0399f implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1513f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1514o;

    /* renamed from: p */
    public final /* synthetic */ CaptureRequest f1515p;

    /* renamed from: q */
    public final /* synthetic */ TotalCaptureResult f1516q;

    public /* synthetic */ C0399f(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f1513f = bVar;
        this.f1514o = cameraCaptureSession;
        this.f1515p = captureRequest;
        this.f1516q = totalCaptureResult;
    }

    public final void run() {
        this.f1513f.mo2084d(this.f1514o, this.f1515p, this.f1516q);
    }
}
