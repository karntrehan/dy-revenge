package com.swmansion.reanimated;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p247e.p317m.p318a.C6410a;

public class Scheduler {

    /* renamed from: a */
    private final ReactApplicationContext f26500a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f26501b = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Runnable f26502c = new C9906a();
    @C6410a
    private final HybridData mHybridData = initHybrid();

    /* renamed from: com.swmansion.reanimated.Scheduler$a */
    class C9906a implements Runnable {
        C9906a() {
        }

        public void run() {
            if (Scheduler.this.f26501b.get()) {
                Scheduler.this.triggerUI();
            }
        }
    }

    /* renamed from: com.swmansion.reanimated.Scheduler$b */
    class C9907b extends GuardedRunnable {
        C9907b(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            super(nativeModuleCallExceptionHandler);
        }

        public void runGuarded() {
            Scheduler.this.f26502c.run();
        }
    }

    public Scheduler(ReactApplicationContext reactApplicationContext) {
        this.f26500a = reactApplicationContext;
    }

    private native HybridData initHybrid();

    @C6410a
    private void scheduleOnUI() {
        UiThreadUtil.runOnUiThread(new C9907b(this.f26500a.getExceptionHandler()));
    }

    /* renamed from: c */
    public void mo24783c() {
        this.f26501b.set(false);
    }

    public native void triggerUI();
}
