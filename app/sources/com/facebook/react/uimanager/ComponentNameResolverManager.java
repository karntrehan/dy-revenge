package com.facebook.react.uimanager;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import p174e.p247e.p317m.p318a.C6410a;

public class ComponentNameResolverManager {
    @C6410a
    private final HybridData mHybridData;

    static {
        m11488a();
    }

    public ComponentNameResolverManager(RuntimeExecutor runtimeExecutor, Object obj) {
        this.mHybridData = initHybrid(runtimeExecutor, obj);
        installJSIBindings();
    }

    /* renamed from: a */
    private static void m11488a() {
        SoLoader.m12782j("uimanagerjni");
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, Object obj);

    private native void installJSIBindings();
}
