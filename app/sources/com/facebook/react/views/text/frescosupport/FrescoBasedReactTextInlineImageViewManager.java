package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewManager;
import p174e.p247e.p274h.p275a.p276a.C6142c;
import p174e.p247e.p274h.p281c.C6174b;

@C2639a(name = "RCTTextInlineImage")
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, C3178a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final C6174b mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this((C6174b) null, (Object) null);
    }

    public FrescoBasedReactTextInlineImageViewManager(C6174b bVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mCallerContext = obj;
    }

    public C3178a createShadowNodeInstance() {
        C6174b bVar = this.mDraweeControllerBuilder;
        if (bVar == null) {
            bVar = C6142c.m23132g();
        }
        return new C3178a(bVar, this.mCallerContext);
    }

    public View createViewInstance(C3031o0 o0Var) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C3178a> getShadowNodeClass() {
        return C3178a.class;
    }

    public void updateExtraData(View view, Object obj) {
    }
}
