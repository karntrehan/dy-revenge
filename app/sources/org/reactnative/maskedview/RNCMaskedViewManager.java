package org.reactnative.maskedview;

import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;

public class RNCMaskedViewManager extends ViewGroupManager<C10999a> {
    private static final String REACT_CLASS = "RNCMaskedView";

    /* access modifiers changed from: protected */
    public C10999a createViewInstance(C3031o0 o0Var) {
        return new C10999a(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }
}
