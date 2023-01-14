package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.o0 */
public class C3031o0 extends ReactContext {

    /* renamed from: a */
    private final ReactApplicationContext f8419a;

    /* renamed from: b */
    private final String f8420b;

    /* renamed from: c */
    private final int f8421c;

    public C3031o0(ReactApplicationContext reactApplicationContext, Context context, String str, int i) {
        super(context);
        if (reactApplicationContext.hasCatalystInstance()) {
            initializeWithInstance(reactApplicationContext.getCatalystInstance());
        }
        this.f8419a = reactApplicationContext;
        this.f8420b = str;
        this.f8421c = i;
    }

    /* renamed from: a */
    public String mo9806a() {
        return this.f8420b;
    }

    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f8419a.addLifecycleEventListener(lifecycleEventListener);
    }

    /* renamed from: b */
    public ReactApplicationContext mo9807b() {
        return this.f8419a;
    }

    /* renamed from: c */
    public int mo9808c() {
        return this.f8421c;
    }

    public Activity getCurrentActivity() {
        return this.f8419a.getCurrentActivity();
    }

    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        return isBridgeless() ? this.f8419a.getJSIModule(jSIModuleType) : super.getJSIModule(jSIModuleType);
    }

    public boolean hasCurrentActivity() {
        return this.f8419a.hasCurrentActivity();
    }

    public boolean isBridgeless() {
        return this.f8419a.isBridgeless();
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f8419a.removeLifecycleEventListener(lifecycleEventListener);
    }
}
