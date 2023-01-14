package com.facebook.react.uimanager;

import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final String REACT_CLASS = "RootView";

    /* access modifiers changed from: protected */
    public ViewGroup createViewInstance(C3031o0 o0Var) {
        return new FrameLayout(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }
}
