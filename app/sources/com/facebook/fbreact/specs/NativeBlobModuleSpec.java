package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void addNetworkingHandler();

    @C6410a
    @ReactMethod
    public abstract void addWebSocketHandler(double d);

    @C6410a
    @ReactMethod
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @C6410a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> getTypedExportedConstants();

    @C6410a
    @ReactMethod
    public abstract void release(String str);

    @C6410a
    @ReactMethod
    public abstract void removeWebSocketHandler(double d);

    @C6410a
    @ReactMethod
    public abstract void sendOverSocket(ReadableMap readableMap, double d);
}
