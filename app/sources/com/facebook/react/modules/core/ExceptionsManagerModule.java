package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2691c;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.util.C3087a;
import com.facebook.react.util.C3088b;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "ExceptionsManager")
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public static final String NAME = "ExceptionsManager";
    private final C2730d mDevSupportManager;

    public ExceptionsManagerModule(C2730d dVar) {
        super((ReactApplicationContext) null);
        this.mDevSupportManager = dVar;
    }

    public void dismissRedbox() {
        if (this.mDevSupportManager.mo8881d()) {
            this.mDevSupportManager.mo8884g();
        }
    }

    public String getName() {
        return NAME;
    }

    public void reportException(ReadableMap readableMap) {
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : HttpUrl.FRAGMENT_ENCODE_SET;
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        boolean z = readableMap.hasKey("isFatal") ? readableMap.getBoolean("isFatal") : false;
        String a = C3087a.m12172a(readableMap);
        if (!z) {
            C6071a.m22875i("ReactNative", C3088b.m12173a(string, array));
            if (a != null) {
                C6071a.m22869c("ReactNative", "extraData: %s", a);
                return;
            }
            return;
        }
        throw new C2691c(C3088b.m12173a(string, array)).mo8808a(a);
    }

    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        int i = (int) d;
        if (this.mDevSupportManager.mo8881d()) {
            this.mDevSupportManager.mo8898u(str, readableArray, i);
        }
    }
}
