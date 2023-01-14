package androidx.camera.camera2.p003e;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p003e.C0542u1;

/* renamed from: androidx.camera.camera2.e.h */
public final /* synthetic */ class C0365h implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0542u1.C0544b f1450f;

    /* renamed from: o */
    public final /* synthetic */ TotalCaptureResult f1451o;

    public /* synthetic */ C0365h(C0542u1.C0544b bVar, TotalCaptureResult totalCaptureResult) {
        this.f1450f = bVar;
        this.f1451o = totalCaptureResult;
    }

    public final void run() {
        this.f1450f.mo2355c(this.f1451o);
    }
}
