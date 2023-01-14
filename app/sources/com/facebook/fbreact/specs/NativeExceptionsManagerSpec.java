package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public void dismissRedbox() {
    }

    @C6410a
    @ReactMethod
    public void reportException(ReadableMap readableMap) {
    }

    @C6410a
    @ReactMethod
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d);

    @C6410a
    @ReactMethod
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d);

    @C6410a
    @ReactMethod
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d);
}
