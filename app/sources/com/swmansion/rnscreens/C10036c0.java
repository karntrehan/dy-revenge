package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.C3029o;
import com.facebook.react.uimanager.UIManagerModule;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.c0 */
public final class C10036c0 extends C2987j {

    /* renamed from: A */
    private ReactContext f26767A;

    public C10036c0(ReactContext reactContext) {
        C10457l.m35320e(reactContext, "mContext");
        this.f26767A = reactContext;
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m34037r1(C10036c0 c0Var, C3022n nVar) {
        C10457l.m35320e(c0Var, "this$0");
        C10457l.m35320e(nVar, "nativeViewHierarchyManager");
        View w = nVar.mo9786w(c0Var.mo9548t());
        if (w instanceof C10091x) {
            ((C10091x) w).mo25104q();
        }
    }

    /* renamed from: W */
    public void mo9520W(C3029o oVar) {
        C10457l.m35320e(oVar, "nativeViewHierarchyOptimizer");
        super.mo9520W(oVar);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f26767A.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new C10072l(this));
        }
    }
}
