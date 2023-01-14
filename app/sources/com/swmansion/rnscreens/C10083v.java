package com.swmansion.rnscreens;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.v */
public final class C10083v implements C2906s {
    /* renamed from: a */
    public List<ViewManager<?, ?>> mo7573a(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "reactContext");
        return C10350l.m35140i(new ScreenContainerViewManager(), new ScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager());
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "reactContext");
        return C10350l.m35138g();
    }
}
