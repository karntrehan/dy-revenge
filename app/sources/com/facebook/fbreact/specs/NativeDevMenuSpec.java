package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void debugRemotely(boolean z);

    @C6410a
    @ReactMethod
    public abstract void reload();

    @C6410a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z);

    @C6410a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z);

    @C6410a
    @ReactMethod
    public abstract void show();
}
