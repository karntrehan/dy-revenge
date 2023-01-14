package com.mrousavy.camera.frameprocessor;

/* renamed from: com.mrousavy.camera.frameprocessor.b */
public final /* synthetic */ class C5148b implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ VisionCameraScheduler f14639f;

    public /* synthetic */ C5148b(VisionCameraScheduler visionCameraScheduler) {
        this.f14639f = visionCameraScheduler;
    }

    public final void run() {
        this.f14639f.triggerUI();
    }
}
