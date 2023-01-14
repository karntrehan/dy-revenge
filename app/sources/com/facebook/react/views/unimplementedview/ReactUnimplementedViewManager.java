package com.facebook.react.views.unimplementedview;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;

@C2639a(name = "UnimplementedNativeView")
public class ReactUnimplementedViewManager extends ViewGroupManager<C3234a> {
    public static final String REACT_CLASS = "UnimplementedNativeView";

    /* access modifiers changed from: protected */
    public C3234a createViewInstance(C3031o0 o0Var) {
        return new C3234a(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C2991a(name = "name")
    public void setName(C3234a aVar, String str) {
        aVar.setName(str);
    }
}
