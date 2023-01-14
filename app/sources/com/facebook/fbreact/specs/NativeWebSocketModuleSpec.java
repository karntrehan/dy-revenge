package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeWebSocketModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void addListener(String str);

    @C6410a
    @ReactMethod
    public abstract void close(double d, String str, double d2);

    @C6410a
    @ReactMethod
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d);

    @C6410a
    @ReactMethod
    public abstract void ping(double d);

    @C6410a
    @ReactMethod
    public abstract void removeListeners(double d);

    @C6410a
    @ReactMethod
    public abstract void send(String str, double d);

    @C6410a
    @ReactMethod
    public abstract void sendBinary(String str, double d);
}
