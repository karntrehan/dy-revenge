package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p174e.p247e.p315l.p316a.C6409a;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    public void merge(ReadableMap readableMap) {
        C6409a.m24520b(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    public void putArray(String str, ReadableArray readableArray) {
        C6409a.m24520b(readableArray == null || (readableArray instanceof WritableNativeArray), "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) readableArray);
    }

    public native void putBoolean(String str, boolean z);

    public native void putDouble(String str, double d);

    public native void putInt(String str, int i);

    public void putMap(String str, ReadableMap readableMap) {
        C6409a.m24520b(readableMap == null || (readableMap instanceof WritableNativeMap), "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) readableMap);
    }

    public native void putNull(String str);

    public native void putString(String str, String str2);
}
