package com.facebook.react.perflogger;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public abstract class NativeModulePerfLogger {

    /* renamed from: a */
    private static volatile boolean f8180a;

    /* renamed from: b */
    private final HybridData f8181b = mo9324a();

    protected NativeModulePerfLogger() {
        mo9325b();
        m11451c();
    }

    /* renamed from: c */
    private static synchronized void m11451c() {
        synchronized (NativeModulePerfLogger.class) {
            if (!f8180a) {
                SoLoader.m12782j("reactperfloggerjni");
                f8180a = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HybridData mo9324a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo9325b() {
    }

    /* renamed from: d */
    public abstract void mo9326d(String str, int i);

    /* renamed from: e */
    public abstract void mo9327e(String str, int i);

    /* renamed from: f */
    public abstract void mo9328f(String str, int i);

    /* renamed from: g */
    public abstract void mo9329g(String str, int i);

    /* renamed from: h */
    public abstract void mo9330h(String str, int i);

    /* renamed from: i */
    public abstract void mo9331i(String str, int i);

    /* renamed from: j */
    public abstract void mo9332j(String str, int i);

    /* renamed from: k */
    public abstract void mo9333k(String str, int i);

    /* renamed from: l */
    public abstract void mo9334l(String str, int i);

    /* renamed from: m */
    public abstract void mo9335m(String str, int i);
}
