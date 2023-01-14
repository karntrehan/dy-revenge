package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class CoreComponentsRegistry {
    @C6410a
    private final HybridData mHybridData;

    static {
        SoLoader.m12782j("fabricjni");
    }

    @C6410a
    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @C6410a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @C6410a
    public static CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return new CoreComponentsRegistry(componentFactory);
    }
}
