package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p174e.p247e.p317m.p318a.C6410a;

public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeStatusBarManagerAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @C6410a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> getTypedExportedConstants();

    @C6410a
    @ReactMethod
    public abstract void setColor(double d, boolean z);

    @C6410a
    @ReactMethod
    public abstract void setHidden(boolean z);

    @C6410a
    @ReactMethod
    public abstract void setStyle(String str);

    @C6410a
    @ReactMethod
    public abstract void setTranslucent(boolean z);
}
