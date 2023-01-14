package com.th3rdwave.safeareacontext;

import com.facebook.react.C3252x;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.h */
public final class C10111h extends C3252x {
    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final Map m34202i(Map map) {
        C10457l.m35320e(map, "$reactModuleInfoMap");
        return map;
    }

    /* renamed from: a */
    public List<ViewManager<?, ?>> mo7573a(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "reactContext");
        return C10350l.m35140i(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    /* renamed from: e */
    public NativeModule mo8382e(String str, ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(str, "name");
        C10457l.m35320e(reactApplicationContext, "reactContext");
        if (C10457l.m35316a(str, SafeAreaContextModule.NAME)) {
            return new SafeAreaContextModule(reactApplicationContext);
        }
        return null;
    }

    /* renamed from: g */
    public C2776a mo8383g() {
        int i = 0;
        Class[] clsArr = {SafeAreaContextModule.class};
        HashMap hashMap = new HashMap();
        while (i < 1) {
            Class cls = clsArr[i];
            i++;
            C2639a aVar = (C2639a) cls.getAnnotation(C2639a.class);
            if (aVar != null) {
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), true, aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
        }
        return new C10103a(hashMap);
    }
}
