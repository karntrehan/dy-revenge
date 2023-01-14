package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class CxxModuleWrapperBase implements NativeModule {
    @C6410a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    protected CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public boolean canOverrideExistingModule() {
        return false;
    }

    public native String getName();

    public void initialize() {
    }

    public void invalidate() {
        this.mHybridData.resetNative();
    }

    public void onCatalystInstanceDestroy() {
    }

    /* access modifiers changed from: protected */
    public void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.resetNative();
            this.mHybridData = hybridData;
        }
    }
}
