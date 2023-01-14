package com.reactnativecommunity.webview;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.reactnativecommunity.webview.c */
public final class C5314c implements C2906s {
    /* renamed from: a */
    public List<RNCWebViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        C10457l.m35321f(reactApplicationContext, "reactContext");
        return C10349k.m35133b(new RNCWebViewManager());
    }

    /* renamed from: d */
    public List<RNCWebViewModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        C10457l.m35321f(reactApplicationContext, "reactContext");
        return C10349k.m35133b(new RNCWebViewModule(reactApplicationContext));
    }
}
