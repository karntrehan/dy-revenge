package com.mrousavy.camera.frameprocessor;

import com.facebook.jni.HybridData;
import java.util.concurrent.ExecutorService;
import p174e.p247e.p317m.p318a.C6410a;

public class VisionCameraScheduler {

    /* renamed from: a */
    private final ExecutorService f14637a;
    @C6410a
    private final HybridData mHybridData = initHybrid();

    public VisionCameraScheduler(ExecutorService executorService) {
        this.f14637a = executorService;
    }

    private native HybridData initHybrid();

    @C6410a
    private void scheduleTrigger() {
        this.f14637a.submit(new C5148b(this));
    }

    /* access modifiers changed from: private */
    public native void triggerUI();
}
