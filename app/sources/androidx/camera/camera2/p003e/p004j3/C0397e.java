package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.e */
public final /* synthetic */ class C0397e implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1509f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1510o;

    /* renamed from: p */
    public final /* synthetic */ int f1511p;

    /* renamed from: q */
    public final /* synthetic */ long f1512q;

    public /* synthetic */ C0397e(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.f1509f = bVar;
        this.f1510o = cameraCaptureSession;
        this.f1511p = i;
        this.f1512q = j;
    }

    public final void run() {
        this.f1509f.mo2088l(this.f1510o, this.f1511p, this.f1512q);
    }
}
