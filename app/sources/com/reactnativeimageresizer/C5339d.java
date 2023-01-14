package com.reactnativeimageresizer;

import com.facebook.react.C3252x;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.reactnativeimageresizer.d */
public class C5339d extends C3252x {
    /* renamed from: i */
    static /* synthetic */ Map m19787i() {
        HashMap hashMap = new HashMap();
        hashMap.put(ImageResizerModule.NAME, new ReactModuleInfo(ImageResizerModule.NAME, ImageResizerModule.NAME, false, false, true, false, false));
        return hashMap;
    }

    /* renamed from: e */
    public NativeModule mo8382e(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(ImageResizerModule.NAME)) {
            return new ImageResizerModule(reactApplicationContext);
        }
        return null;
    }

    /* renamed from: g */
    public C2776a mo8383g() {
        return C5335a.f14951a;
    }
}
