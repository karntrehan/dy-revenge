package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* renamed from: com.facebook.hermes.reactexecutor.a */
public class C2389a implements JavaScriptExecutorFactory {

    /* renamed from: a */
    private final C2390b f7107a;

    public C2389a() {
        this((C2390b) null);
    }

    public C2389a(C2390b bVar) {
    }

    public JavaScriptExecutor create() {
        return new HermesExecutor(this.f7107a);
    }

    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }
}
