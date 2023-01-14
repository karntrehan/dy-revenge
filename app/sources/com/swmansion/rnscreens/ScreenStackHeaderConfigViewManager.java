package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2749q;
import com.facebook.react.p115e0.C2750r;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.Map;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNSScreenStackHeaderConfig")
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<C10097z> implements C2750r<C10097z> {
    public static final C10022a Companion = new C10022a((C10452g) null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final C2928c1<C10097z> mDelegate = new C2749q(this);

    /* renamed from: com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager$a */
    public static final class C10022a {
        private C10022a() {
        }

        public /* synthetic */ C10022a(C10452g gVar) {
            this();
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("RN SCREENS", str + " prop is not available on Android");
    }

    public void addView(C10097z zVar, View view, int i) {
        C10457l.m35320e(zVar, "parent");
        C10457l.m35320e(view, "child");
        if (view instanceof C10028a0) {
            zVar.mo25125a((C10028a0) view, i);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    /* access modifiers changed from: protected */
    public C10097z createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "reactContext");
        return new C10097z(o0Var);
    }

    public View getChildAt(C10097z zVar, int i) {
        C10457l.m35320e(zVar, "parent");
        return zVar.mo25127c(i);
    }

    public int getChildCount(C10097z zVar) {
        C10457l.m35320e(zVar, "parent");
        return zVar.getConfigSubviewsCount();
    }

    /* access modifiers changed from: protected */
    public C2928c1<C10097z> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b("onAttached", C2693e.m10914d("registrationName", "onAttached")).mo8815b("onDetached", C2693e.m10914d("registrationName", "onDetached")).mo8814a();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C10097z zVar) {
        C10457l.m35320e(zVar, "parent");
        super.onAfterUpdateTransaction(zVar);
        zVar.mo25128g();
    }

    public void onDropViewInstance(C10097z zVar) {
        C10457l.m35320e(zVar, "view");
        zVar.mo25126b();
    }

    public void removeAllViews(C10097z zVar) {
        C10457l.m35320e(zVar, "parent");
        zVar.mo25132h();
    }

    public void removeViewAt(C10097z zVar, int i) {
        C10457l.m35320e(zVar, "parent");
        zVar.mo25133i(i);
    }

    @C2991a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(C10097z zVar, boolean z) {
        C10457l.m35320e(zVar, "config");
        zVar.setBackButtonInCustomView(z);
    }

    public void setBackTitle(C10097z zVar, String str) {
        logNotAvailable("backTitle");
    }

    public void setBackTitleFontFamily(C10097z zVar, String str) {
        logNotAvailable("backTitleFontFamily");
    }

    public void setBackTitleFontSize(C10097z zVar, int i) {
        logNotAvailable("backTitleFontSize");
    }

    @C2991a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(C10097z zVar, Integer num) {
        C10457l.m35320e(zVar, "config");
        zVar.setBackgroundColor(num);
    }

    @C2991a(customType = "Color", name = "color")
    public void setColor(C10097z zVar, Integer num) {
        C10457l.m35320e(zVar, "config");
        zVar.setTintColor(num != null ? num.intValue() : 0);
    }

    @C2991a(name = "direction")
    public void setDirection(C10097z zVar, String str) {
        C10457l.m35320e(zVar, "config");
        zVar.setDirection(str);
    }

    public void setDisableBackButtonMenu(C10097z zVar, boolean z) {
        logNotAvailable("disableBackButtonMenu");
    }

    @C2991a(name = "hidden")
    public void setHidden(C10097z zVar, boolean z) {
        C10457l.m35320e(zVar, "config");
        zVar.setHidden(z);
    }

    @C2991a(name = "hideBackButton")
    public void setHideBackButton(C10097z zVar, boolean z) {
        C10457l.m35320e(zVar, "config");
        zVar.setHideBackButton(z);
    }

    @C2991a(name = "hideShadow")
    public void setHideShadow(C10097z zVar, boolean z) {
        C10457l.m35320e(zVar, "config");
        zVar.setHideShadow(z);
    }

    public void setLargeTitle(C10097z zVar, boolean z) {
        logNotAvailable("largeTitle");
    }

    public void setLargeTitleBackgroundColor(C10097z zVar, Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    public void setLargeTitleColor(C10097z zVar, Integer num) {
        logNotAvailable("largeTitleColor");
    }

    public void setLargeTitleFontFamily(C10097z zVar, String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    public void setLargeTitleFontSize(C10097z zVar, int i) {
        logNotAvailable("largeTitleFontSize");
    }

    public void setLargeTitleFontWeight(C10097z zVar, String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    public void setLargeTitleHideShadow(C10097z zVar, boolean z) {
        logNotAvailable("largeTitleHideShadow");
    }

    @C2991a(name = "title")
    public void setTitle(C10097z zVar, String str) {
        C10457l.m35320e(zVar, "config");
        zVar.setTitle(str);
    }

    @C2991a(customType = "Color", name = "titleColor")
    public void setTitleColor(C10097z zVar, Integer num) {
        C10457l.m35320e(zVar, "config");
        if (num != null) {
            zVar.setTitleColor(num.intValue());
        }
    }

    @C2991a(name = "titleFontFamily")
    public void setTitleFontFamily(C10097z zVar, String str) {
        C10457l.m35320e(zVar, "config");
        zVar.setTitleFontFamily(str);
    }

    @C2991a(name = "titleFontSize")
    public void setTitleFontSize(C10097z zVar, int i) {
        C10457l.m35320e(zVar, "config");
        zVar.setTitleFontSize((float) i);
    }

    @C2991a(name = "titleFontWeight")
    public void setTitleFontWeight(C10097z zVar, String str) {
        C10457l.m35320e(zVar, "config");
        zVar.setTitleFontWeight(str);
    }

    @C2991a(name = "topInsetEnabled")
    public void setTopInsetEnabled(C10097z zVar, boolean z) {
        C10457l.m35320e(zVar, "config");
        zVar.setTopInsetEnabled(z);
    }

    @C2991a(name = "translucent")
    public void setTranslucent(C10097z zVar, boolean z) {
        C10457l.m35320e(zVar, "config");
        zVar.setTranslucent(z);
    }
}
