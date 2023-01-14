package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativePermissionsAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void checkPermission(String str, Promise promise);

    @C6410a
    @ReactMethod
    public abstract void requestMultiplePermissions(ReadableArray readableArray, Promise promise);

    @C6410a
    @ReactMethod
    public abstract void requestPermission(String str, Promise promise);

    @C6410a
    @ReactMethod
    public abstract void shouldShowRequestPermissionRationale(String str, Promise promise);
}