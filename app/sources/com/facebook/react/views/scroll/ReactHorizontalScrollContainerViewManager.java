package com.facebook.react.views.scroll;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.views.view.ReactClippingViewManager;

@C2639a(name = "AndroidHorizontalScrollContentView")
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<C3127c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    public C3127c createViewInstance(C3031o0 o0Var) {
        return new C3127c(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }
}
