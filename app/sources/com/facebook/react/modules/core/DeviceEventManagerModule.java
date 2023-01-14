package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import p174e.p247e.p317m.p318a.C6410a;

@C2639a(name = "DeviceEventManager")
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final String NAME = "DeviceEventManager";
    private final Runnable mInvokeDefaultBackPressRunnable;

    @C6410a
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    /* renamed from: com.facebook.react.modules.core.DeviceEventManagerModule$a */
    class C2788a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2793b f7873f;

        C2788a(C2793b bVar) {
            this.f7873f = bVar;
        }

        public void run() {
            UiThreadUtil.assertOnUiThread();
            this.f7873f.mo9050c();
        }
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, C2793b bVar) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new C2788a(bVar);
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", (Object) null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("url", uri.toString());
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit("url", createMap);
        }
    }

    public String getName() {
        return NAME;
    }

    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
