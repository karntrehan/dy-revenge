package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.C2764b;
import com.facebook.react.uimanager.events.C2942a;
import p174e.p247e.p317m.p318a.C6410a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventBeatManager implements C2942a {
    @C6410a
    private final HybridData mHybridData;

    static {
        C2764b.m11078a();
    }

    private static native HybridData initHybrid();

    private native void tick();

    /* renamed from: a */
    public void mo9044a() {
        tick();
    }
}
