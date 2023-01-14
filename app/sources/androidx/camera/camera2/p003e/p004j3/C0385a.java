package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0388b0;

/* renamed from: androidx.camera.camera2.e.j3.a */
public final /* synthetic */ class C0385a implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0388b0.C0390b f1480f;

    /* renamed from: o */
    public final /* synthetic */ CameraCaptureSession f1481o;

    /* renamed from: p */
    public final /* synthetic */ CaptureRequest f1482p;

    /* renamed from: q */
    public final /* synthetic */ Surface f1483q;

    /* renamed from: r */
    public final /* synthetic */ long f1484r;

    public /* synthetic */ C0385a(C0388b0.C0390b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.f1480f = bVar;
        this.f1481o = cameraCaptureSession;
        this.f1482p = captureRequest;
        this.f1483q = surface;
        this.f1484r = j;
    }

    public final void run() {
        this.f1480f.mo2083b(this.f1481o, this.f1482p, this.f1483q, this.f1484r);
    }
}
