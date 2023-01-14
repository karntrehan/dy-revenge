package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3031o0;

@C2639a(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager<View, C3202w> {
    public static final String REACT_CLASS = "RCTVirtualText";

    public C3202w createShadowNodeInstance() {
        return new C3202w();
    }

    public View createViewInstance(C3031o0 o0Var) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C3202w> getShadowNodeClass() {
        return C3202w.class;
    }

    public void updateExtraData(View view, Object obj) {
    }
}
