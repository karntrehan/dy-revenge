package com.swmansion.gesturehandler.react;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2746n;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import p455g.C10320p;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNGestureHandlerRootView")
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<C9884j> {
    public static final C9870a Companion = new C9870a((C10452g) null);
    public static final String REACT_CLASS = "RNGestureHandlerRootView";
    private final C2928c1<C9884j> mDelegate = new C2746n(this);

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager$a */
    public static final class C9870a {
        private C9870a() {
        }

        public /* synthetic */ C9870a(C10452g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public C9884j createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "reactContext");
        return new C9884j(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C9884j> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return C10334c0.m35036f(C10320p.m35019a("onGestureHandlerEvent", C10334c0.m35036f(C10320p.m35019a("registrationName", "onGestureHandlerEvent"))), C10320p.m35019a("onGestureHandlerStateChange", C10334c0.m35036f(C10320p.m35019a("registrationName", "onGestureHandlerStateChange"))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void onDropViewInstance(C9884j jVar) {
        C10457l.m35320e(jVar, "view");
        jVar.mo24743B();
    }
}
