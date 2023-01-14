package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: com.facebook.react.jscexecutor.a */
public class C2770a implements JavaScriptExecutorFactory {

    /* renamed from: a */
    private final String f7837a;

    /* renamed from: b */
    private final String f7838b;

    public C2770a(String str, String str2) {
        this.f7837a = str;
        this.f7838b = str2;
    }

    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f7837a);
        writableNativeMap.putString("DeviceIdentity", this.f7838b);
        return new JSCExecutor(writableNativeMap);
    }

    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
