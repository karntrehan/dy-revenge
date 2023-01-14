package androidx.camera.core;

import androidx.camera.core.C0693h2;

/* renamed from: androidx.camera.core.t */
public final /* synthetic */ class C0972t implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0693h2.C0700g f2722f;

    /* renamed from: o */
    public final /* synthetic */ ImageProxy f2723o;

    public /* synthetic */ C0972t(C0693h2.C0700g gVar, ImageProxy imageProxy) {
        this.f2722f = gVar;
        this.f2723o = imageProxy;
    }

    public final void run() {
        this.f2722f.mo2778c(this.f2723o);
    }
}
