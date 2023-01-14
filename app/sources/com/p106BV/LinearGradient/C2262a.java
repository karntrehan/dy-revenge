package com.p106BV.LinearGradient;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.BV.LinearGradient.a */
public class C2262a implements C2906s {
    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new LinearGradientManager()});
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
