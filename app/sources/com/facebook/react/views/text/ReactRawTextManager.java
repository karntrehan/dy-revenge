package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewManager;

@C2639a(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager<View, C3188l> {
    public static final String REACT_CLASS = "RCTRawText";

    public C3188l createShadowNodeInstance() {
        return new C3188l();
    }

    public C3197s createViewInstance(C3031o0 o0Var) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C3188l> getShadowNodeClass() {
        return C3188l.class;
    }

    public void updateExtraData(View view, Object obj) {
    }
}
