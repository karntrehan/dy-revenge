package p174e.p446g.p448b;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.f */
public final class C10197f {
    /* renamed from: a */
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter m34502a(ReactContext reactContext) {
        C10457l.m35320e(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C10457l.m35319d(jSModule, "this.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    /* renamed from: b */
    public static final UIManagerModule m34503b(ReactContext reactContext) {
        C10457l.m35320e(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        C10457l.m35317b(nativeModule);
        C10457l.m35319d(nativeModule, "this.getNativeModule(UIManagerModule::class.java)!!");
        return (UIManagerModule) nativeModule;
    }
}
