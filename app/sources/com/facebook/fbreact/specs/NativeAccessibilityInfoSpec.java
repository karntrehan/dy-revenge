package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void announceForAccessibility(String str);

    @C6410a
    @ReactMethod
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
    }

    @C6410a
    @ReactMethod
    public abstract void isReduceMotionEnabled(Callback callback);

    @C6410a
    @ReactMethod
    public abstract void isTouchExplorationEnabled(Callback callback);

    @C6410a
    @ReactMethod
    public abstract void setAccessibilityFocus(double d);
}
