package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.d */
public final /* synthetic */ class C0394d implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1501f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1502o;

    /* renamed from: p */
    public final /* synthetic */ CaptureRequest f1503p;

    /* renamed from: q */
    public final /* synthetic */ long f1504q;

    /* renamed from: r */
    public final /* synthetic */ long f1505r;

    public /* synthetic */ C0394d(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f1501f = bVar;
        this.f1502o = cameraCaptureSession;
        this.f1503p = captureRequest;
        this.f1504q = j;
        this.f1505r = j2;
    }

    public final void run() {
        this.f1501f.mo2089n(this.f1502o, this.f1503p, this.f1504q, this.f1505r);
    }
}
