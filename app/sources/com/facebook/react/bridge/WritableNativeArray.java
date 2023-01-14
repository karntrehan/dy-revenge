package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p315l.p316a.C6409a;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    public void pushArray(ReadableArray readableArray) {
        C6409a.m24520b(readableArray == null || (readableArray instanceof WritableNativeArray), "Illegal type provided");
        pushNativeArray((WritableNativeArray) readableArray);
    }

    public native void pushBoolean(boolean z);

    public native void pushDouble(double d);

    public native void pushInt(int i);

    public void pushMap(ReadableMap readableMap) {
        C6409a.m24520b(readableMap == null || (readableMap instanceof WritableNativeMap), "Illegal type provided");
        pushNativeMap((WritableNativeMap) readableMap);
    }

    public native void pushNull();

    public native void pushString(String str);
}
