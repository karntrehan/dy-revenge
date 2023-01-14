package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.C2764b;
import p174e.p247e.p317m.p318a.C6410a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {
    @C6410a
    private final HybridData mHybridData = initHybrid();

    static {
        C2764b.m11078a();
    }

    private EventEmitterWrapper() {
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap, int i);

    private native void invokeUniqueEvent(String str, NativeMap nativeMap, int i);
}
