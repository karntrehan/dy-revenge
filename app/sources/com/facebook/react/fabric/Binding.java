package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
@SuppressLint({"MissingNativeLoadLibrary"})
public class Binding {
    @C6410a
    private final HybridData mHybridData = initHybrid();

    static {
        C2764b.m11078a();
    }

    private static native HybridData initHybrid();

    private native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, Object obj, EventBeatManager eventBeatManager, ComponentFactory componentFactory, Object obj2);

    private native void uninstallFabricUIManager();

    public native void driveCxxAnimations();

    public native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    public native void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    public native void renderTemplateToSurface(int i, String str);

    public native void setConstraints(int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2);

    public native void setPixelDensity(float f);

    public native void startSurface(int i, String str, NativeMap nativeMap);

    public native void startSurfaceWithConstraints(int i, String str, NativeMap nativeMap, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2);

    public native void stopSurface(int i);

    public native void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}
