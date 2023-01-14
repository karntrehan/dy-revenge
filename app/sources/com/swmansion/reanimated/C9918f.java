package com.swmansion.reanimated;

import com.facebook.react.C2775m;
import com.facebook.react.C2886o;
import com.facebook.react.C2906s;
import com.facebook.react.C3252x;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.C3294a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.swmansion.reanimated.f */
public class C9918f extends C3252x implements C2906s {

    /* renamed from: com.swmansion.reanimated.f$a */
    class C9919a implements C2776a {

        /* renamed from: a */
        final /* synthetic */ Map f26539a;

        C9919a(Map map) {
            this.f26539a = map;
        }

        /* renamed from: a */
        public Map<String, ReactModuleInfo> mo8384a() {
            return this.f26539a;
        }
    }

    /* renamed from: i */
    private UIManagerModule m33804i(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C3294a.m12881c(0, "createUIManagerModule");
        try {
            return new ReanimatedUIManager(reactApplicationContext, mo24816j(reactApplicationContext).mo9293z(reactApplicationContext), -1);
        } finally {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* renamed from: e */
    public NativeModule mo8382e(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(ReanimatedModule.NAME)) {
            return new ReanimatedModule(reactApplicationContext);
        }
        if (str.equals(UIManagerModule.NAME)) {
            return m33804i(reactApplicationContext);
        }
        return null;
    }

    /* renamed from: g */
    public C2776a mo8383g() {
        Class[] clsArr = {ReanimatedModule.class, ReanimatedUIManager.class};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            Class cls = clsArr[i];
            C2639a aVar = (C2639a) cls.getAnnotation(C2639a.class);
            hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), true, aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
        }
        return new C9919a(hashMap);
    }

    /* renamed from: j */
    public C2886o mo24816j(ReactApplicationContext reactApplicationContext) {
        return ((C2775m) reactApplicationContext.getApplicationContext()).mo9081a().mo9345i();
    }
}
