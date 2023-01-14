package com.mrousavy.camera.frameprocessor;

import androidx.annotation.Keep;
import androidx.camera.core.ImageProxy;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
@Keep
public abstract class FrameProcessorPlugin {
    private final String mName;

    protected FrameProcessorPlugin(String str) {
        this.mName = str;
    }

    public static void register(FrameProcessorPlugin frameProcessorPlugin) {
        FrameProcessorRuntimeManager.f14632a.mo15760b().add(frameProcessorPlugin);
    }

    @C6410a
    @Keep
    public abstract Object callback(ImageProxy imageProxy, Object[] objArr);

    @C6410a
    @Keep
    public String getName() {
        return this.mName;
    }
}
