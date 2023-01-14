package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.p003e.p004j3.C0405h0;

/* renamed from: androidx.camera.camera2.e.j3.q */
public final /* synthetic */ class C0427q implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0405h0.C0407b f1555f;

    /* renamed from: o */
    public final /* synthetic */ CameraDevice f1556o;

    /* renamed from: p */
    public final /* synthetic */ int f1557p;

    public /* synthetic */ C0427q(C0405h0.C0407b bVar, CameraDevice cameraDevice, int i) {
        this.f1555f = bVar;
        this.f1556o = cameraDevice;
        this.f1557p = i;
    }

    public final void run() {
        this.f1555f.mo2127f(this.f1556o, this.f1557p);
    }
}
