package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.e */
public class C2732e {

    /* renamed from: a */
    private final ReactApplicationContext f7815a;

    /* renamed from: b */
    private final C2886o f7816b;

    /* renamed from: c */
    private final Map<String, ModuleHolder> f7817c = new HashMap();

    public C2732e(ReactApplicationContext reactApplicationContext, C2886o oVar) {
        this.f7815a = reactApplicationContext;
        this.f7816b = oVar;
    }

    /* renamed from: a */
    public NativeModuleRegistry mo8905a() {
        return new NativeModuleRegistry(this.f7815a, this.f7817c);
    }

    /* renamed from: b */
    public void mo8906b(C2906s sVar) {
        for (ModuleHolder next : sVar instanceof C2683c ? ((C2683c) sVar).mo8798b(this.f7815a) : sVar instanceof C3252x ? ((C3252x) sVar).mo10711f(this.f7815a) : C2907t.m11484a(sVar, this.f7815a, this.f7816b)) {
            String name = next.getName();
            if (this.f7817c.containsKey(name)) {
                ModuleHolder moduleHolder = this.f7817c.get(name);
                if (next.getCanOverrideExistingModule()) {
                    this.f7817c.remove(moduleHolder);
                } else {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
            }
            this.f7817c.put(name, next);
        }
    }
}
