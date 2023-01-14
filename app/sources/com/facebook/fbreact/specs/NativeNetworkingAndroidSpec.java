package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeNetworkingAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void abortRequest(double d);

    @C6410a
    @ReactMethod
    public abstract void addListener(String str);

    @C6410a
    @ReactMethod
    public abstract void clearCookies(Callback callback);

    @C6410a
    @ReactMethod
    public abstract void removeListeners(double d);

    @C6410a
    @ReactMethod
    public abstract void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2);
}
