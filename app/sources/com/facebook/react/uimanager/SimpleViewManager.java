package com.facebook.react.uimanager;

import android.view.View;

public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, C2987j> {
    public C2987j createShadowNodeInstance() {
        return new C2987j();
    }

    public Class<C2987j> getShadowNodeClass() {
        return C2987j.class;
    }

    public void updateExtraData(T t, Object obj) {
    }
}
