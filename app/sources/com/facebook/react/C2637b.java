package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.b */
public class C2637b extends C3252x {

    /* renamed from: com.facebook.react.b$a */
    class C2638a implements C2776a {

        /* renamed from: a */
        final /* synthetic */ Map f7761a;

        C2638a(Map map) {
            this.f7761a = map;
        }

        /* renamed from: a */
        public Map<String, ReactModuleInfo> mo8384a() {
            return this.f7761a;
        }
    }

    /* renamed from: e */
    public NativeModule mo8382e(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals(JSCHeapCapture.TAG)) {
            return new JSCHeapCapture(reactApplicationContext);
        }
        throw new IllegalArgumentException("In DebugCorePackage, could not find Native module for " + str);
    }

    /* renamed from: g */
    public C2776a mo8383g() {
        try {
            return (C2776a) Class.forName("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {JSCHeapCapture.class};
            HashMap hashMap = new HashMap();
            for (int i = 0; i < 1; i++) {
                Class cls = clsArr[i];
                C2639a aVar = (C2639a) cls.getAnnotation(C2639a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new C2638a(hashMap);
        } catch (InstantiationException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e2);
        }
    }
}
