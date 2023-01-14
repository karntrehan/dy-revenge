package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

@Deprecated
/* renamed from: com.facebook.react.q */
public abstract class C2903q implements C2906s {
    /* renamed from: b */
    public abstract List<NativeModule> mo9336b(ReactApplicationContext reactApplicationContext, C2886o oVar);

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }
}
