package com.facebook.react.bridge;

import com.facebook.react.p126z.C3257a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

public class JSIModuleRegistry {
    private final Map<JSIModuleType, JSIModuleHolder> mModules = new HashMap();

    public JSIModule getModule(JSIModuleType jSIModuleType) {
        JSIModuleHolder jSIModuleHolder = this.mModules.get(jSIModuleType);
        if (jSIModuleHolder != null) {
            return (JSIModule) C6409a.m24521c(jSIModuleHolder.getJSIModule());
        }
        throw new IllegalArgumentException("Unable to find JSIModule for class " + jSIModuleType);
    }

    public void notifyJSInstanceDestroy() {
        for (Map.Entry next : this.mModules.entrySet()) {
            if (((JSIModuleType) next.getKey()) != JSIModuleType.TurboModuleManager) {
                ((JSIModuleHolder) next.getValue()).notifyJSInstanceDestroy();
            }
        }
        if (C3257a.f9228i) {
            this.mModules.clear();
        }
    }

    public void registerModules(List<JSIModuleSpec> list) {
        for (JSIModuleSpec next : list) {
            this.mModules.put(next.getJSIModuleType(), new JSIModuleHolder(next));
        }
    }
}
