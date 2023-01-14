package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.c */
public final /* synthetic */ class C0392c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1498f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1499o;

    /* renamed from: p */
    public final /* synthetic */ int f1500p;

    public /* synthetic */ C0392c(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f1498f = bVar;
        this.f1499o = cameraCaptureSession;
        this.f1500p = i;
    }

    public final void run() {
        this.f1498f.mo2087j(this.f1499o, this.f1500p);
    }
}
