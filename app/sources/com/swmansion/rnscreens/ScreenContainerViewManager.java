package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNSScreenContainer")
public final class ScreenContainerViewManager extends ViewGroupManager<C10091x<?>> {
    public static final C10014a Companion = new C10014a((C10452g) null);
    public static final String REACT_CLASS = "RNSScreenContainer";

    /* renamed from: com.swmansion.rnscreens.ScreenContainerViewManager$a */
    public static final class C10014a {
        private C10014a() {
        }

        public /* synthetic */ C10014a(C10452g gVar) {
            this();
        }
    }

    public void addView(C10091x<?> xVar, View view, int i) {
        C10457l.m35320e(xVar, "parent");
        C10457l.m35320e(view, "child");
        if (view instanceof C10084w) {
            xVar.mo25091c((C10084w) view, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens".toString());
    }

    public C2987j createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "context");
        return new C10036c0(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public C10091x<ScreenFragment> createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "reactContext");
        return new C10091x<>(o0Var);
    }

    public View getChildAt(C10091x<?> xVar, int i) {
        C10457l.m35320e(xVar, "parent");
        return xVar.mo25095i(i);
    }

    public int getChildCount(C10091x<?> xVar) {
        C10457l.m35320e(xVar, "parent");
        return xVar.getScreenCount();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void removeAllViews(C10091x<?> xVar) {
        C10457l.m35320e(xVar, "parent");
        xVar.mo25108s();
    }

    public void removeViewAt(C10091x<?> xVar, int i) {
        C10457l.m35320e(xVar, "parent");
        xVar.mo25109u(i);
    }
}
