package com.reactnativecommunity.toolbarandroid;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.reactnativecommunity.toolbarandroid.c */
public class C5295c implements C2906s {
    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new ReactToolbarManager()});
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
