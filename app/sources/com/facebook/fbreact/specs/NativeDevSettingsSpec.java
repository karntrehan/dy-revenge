package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void addListener(String str);

    @C6410a
    @ReactMethod
    public abstract void addMenuItem(String str);

    @C6410a
    @ReactMethod
    public void onFastRefresh() {
    }

    @C6410a
    @ReactMethod
    public abstract void reload();

    @C6410a
    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @C6410a
    @ReactMethod
    public abstract void removeListeners(double d);

    @C6410a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z);

    @C6410a
    @ReactMethod
    public abstract void setIsDebuggingRemotely(boolean z);

    @C6410a
    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z);

    @C6410a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z);

    @C6410a
    @ReactMethod
    public abstract void toggleElementInspector();
}
