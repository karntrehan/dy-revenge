package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a */
    private static String f7106a;

    static {
        m9895a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HermesExecutor(C2390b bVar) {
        super(initHybridDefaultConfig());
        if (bVar == null) {
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m9895a() {
        if (f7106a == null) {
            SoLoader.m12782j("hermes");
            try {
                SoLoader.m12782j("hermes-executor-debug");
                f7106a = "Debug";
            } catch (UnsatisfiedLinkError unused) {
                SoLoader.m12782j("hermes-executor-release");
                f7106a = "Release";
            }
        }
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j);

    private static native HybridData initHybridDefaultConfig();

    public String getName() {
        return "HermesExecutor" + f7106a;
    }
}
