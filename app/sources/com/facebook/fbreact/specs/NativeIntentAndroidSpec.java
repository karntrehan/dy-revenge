package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeIntentAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeIntentAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void canOpenURL(String str, Promise promise);

    @C6410a
    @ReactMethod
    public abstract void getInitialURL(Promise promise);

    @C6410a
    @ReactMethod
    public abstract void openSettings(Promise promise);

    @C6410a
    @ReactMethod
    public abstract void openURL(String str, Promise promise);

    @C6410a
    @ReactMethod
    public abstract void sendIntent(String str, ReadableArray readableArray, Promise promise);
}
