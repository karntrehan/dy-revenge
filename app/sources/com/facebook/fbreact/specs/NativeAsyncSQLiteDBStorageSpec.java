package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeAsyncSQLiteDBStorageSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAsyncSQLiteDBStorageSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void clear(Callback callback);

    @C6410a
    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    @C6410a
    @ReactMethod
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @C6410a
    @ReactMethod
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @C6410a
    @ReactMethod
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @C6410a
    @ReactMethod
    public abstract void multiSet(ReadableArray readableArray, Callback callback);
}
