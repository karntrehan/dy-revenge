package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2753u;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import p455g.C10320p;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNSScreenStack")
public final class ScreenStackViewManager extends ViewGroupManager<C10093y> {
    public static final C10024a Companion = new C10024a((C10452g) null);
    public static final String REACT_CLASS = "RNSScreenStack";
    private final C2928c1<C10093y> mDelegate = new C2753u(this);

    /* renamed from: com.swmansion.rnscreens.ScreenStackViewManager$a */
    public static final class C10024a {
        private C10024a() {
        }

        public /* synthetic */ C10024a(C10452g gVar) {
            this();
        }
    }

    private final void prepareOutTransition(C10084w wVar) {
        startTransitionRecursive(wVar);
    }

    private final void startTransitionRecursive(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    C10457l.m35319d(childAt, "child");
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof C10097z) {
                    startTransitionRecursive(((C10097z) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) childAt);
                }
            }
        }
    }

    public void addView(C10093y yVar, View view, int i) {
        C10457l.m35320e(yVar, "parent");
        C10457l.m35320e(view, "child");
        if (view instanceof C10084w) {
            yVar.mo25091c((C10084w) view, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen".toString());
    }

    public C2987j createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "context");
        return new C10036c0(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public C10093y createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "reactContext");
        return new C10093y(o0Var);
    }

    public View getChildAt(C10093y yVar, int i) {
        C10457l.m35320e(yVar, "parent");
        return yVar.mo25095i(i);
    }

    public int getChildCount(C10093y yVar) {
        C10457l.m35320e(yVar, "parent");
        return yVar.getScreenCount();
    }

    /* access modifiers changed from: protected */
    public C2928c1<C10093y> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C10334c0.m35036f(C10320p.m35019a("topFinishTransitioning", C10334c0.m35036f(C10320p.m35019a("registrationName", "onFinishTransitioning"))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void removeViewAt(C10093y yVar, int i) {
        C10457l.m35320e(yVar, "parent");
        prepareOutTransition(yVar.mo25095i(i));
        yVar.mo25109u(i);
    }
}
