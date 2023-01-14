package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAnimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    @ReactMethod
    public abstract void addAnimatedEventToView(double d, String str, ReadableMap readableMap);

    @C6410a
    @ReactMethod
    public abstract void addListener(String str);

    @C6410a
    @ReactMethod
    public abstract void connectAnimatedNodeToView(double d, double d2);

    @C6410a
    @ReactMethod
    public abstract void connectAnimatedNodes(double d, double d2);

    @C6410a
    @ReactMethod
    public abstract void createAnimatedNode(double d, ReadableMap readableMap);

    @C6410a
    @ReactMethod
    public abstract void disconnectAnimatedNodeFromView(double d, double d2);

    @C6410a
    @ReactMethod
    public abstract void disconnectAnimatedNodes(double d, double d2);

    @C6410a
    @ReactMethod
    public abstract void dropAnimatedNode(double d);

    @C6410a
    @ReactMethod
    public abstract void extractAnimatedNodeOffset(double d);

    @C6410a
    @ReactMethod
    public abstract void finishOperationBatch();

    @C6410a
    @ReactMethod
    public abstract void flattenAnimatedNodeOffset(double d);

    @C6410a
    @ReactMethod
    public abstract void getValue(double d, Callback callback);

    @C6410a
    @ReactMethod
    public abstract void removeAnimatedEventFromView(double d, String str, double d2);

    @C6410a
    @ReactMethod
    public abstract void removeListeners(double d);

    @C6410a
    @ReactMethod
    public abstract void restoreDefaultValues(double d);

    @C6410a
    @ReactMethod
    public abstract void setAnimatedNodeOffset(double d, double d2);

    @C6410a
    @ReactMethod
    public abstract void setAnimatedNodeValue(double d, double d2);

    @C6410a
    @ReactMethod
    public abstract void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback);

    @C6410a
    @ReactMethod
    public abstract void startListeningToAnimatedNodeValue(double d);

    @C6410a
    @ReactMethod
    public abstract void startOperationBatch();

    @C6410a
    @ReactMethod
    public abstract void stopAnimation(double d);

    @C6410a
    @ReactMethod
    public abstract void stopListeningToAnimatedNodeValue(double d);
}
