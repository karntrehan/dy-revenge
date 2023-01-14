package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2741i;
import com.facebook.react.p115e0.C2742j;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3025n0;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.modal.C3115c;
import java.util.Map;

@C2639a(name = "RCTModalHostView")
public class ReactModalHostManager extends ViewGroupManager<C3115c> implements C2742j<C3115c> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final C2928c1<C3115c> mDelegate = new C2741i(this);

    /* renamed from: com.facebook.react.views.modal.ReactModalHostManager$a */
    class C3111a implements C3115c.C3120c {

        /* renamed from: a */
        final /* synthetic */ C2945d f8648a;

        /* renamed from: b */
        final /* synthetic */ C3031o0 f8649b;

        /* renamed from: c */
        final /* synthetic */ C3115c f8650c;

        C3111a(C2945d dVar, C3031o0 o0Var, C3115c cVar) {
            this.f8648a = dVar;
            this.f8649b = o0Var;
            this.f8650c = cVar;
        }

        /* renamed from: a */
        public void mo10008a(DialogInterface dialogInterface) {
            this.f8648a.mo9651c(new C3121d(C3051u0.m12087d(this.f8649b), this.f8650c.getId()));
        }
    }

    /* renamed from: com.facebook.react.views.modal.ReactModalHostManager$b */
    class C3112b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C2945d f8652a;

        /* renamed from: b */
        final /* synthetic */ C3031o0 f8653b;

        /* renamed from: c */
        final /* synthetic */ C3115c f8654c;

        C3112b(C2945d dVar, C3031o0 o0Var, C3115c cVar) {
            this.f8652a = dVar;
            this.f8653b = o0Var;
            this.f8654c = cVar;
        }

        public void onShow(DialogInterface dialogInterface) {
            this.f8652a.mo9651c(new C3122e(C3051u0.m12087d(this.f8653b), this.f8654c.getId()));
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C3115c cVar) {
        C2945d b = C3051u0.m12085b(o0Var, cVar.getId());
        if (b != null) {
            cVar.setOnRequestCloseListener(new C3111a(b, o0Var, cVar));
            cVar.setOnShowListener(new C3112b(b, o0Var, cVar));
            cVar.setEventDispatcher(b);
        }
    }

    public C2987j createShadowNodeInstance() {
        return new C3114b();
    }

    /* access modifiers changed from: protected */
    public C3115c createViewInstance(C3031o0 o0Var) {
        return new C3115c(o0Var);
    }

    public C2928c1<C3115c> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b("topRequestClose", C2693e.m10914d("registrationName", "onRequestClose")).mo8815b("topShow", C2693e.m10914d("registrationName", "onShow")).mo8814a();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<? extends C2987j> getShadowNodeClass() {
        return C3114b.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C3115c cVar) {
        super.onAfterUpdateTransaction(cVar);
        cVar.mo10013d();
    }

    public void onDropViewInstance(C3115c cVar) {
        super.onDropViewInstance(cVar);
        cVar.mo10012c();
    }

    public void setAnimated(C3115c cVar, boolean z) {
    }

    @C2991a(name = "animationType")
    public void setAnimationType(C3115c cVar, String str) {
        if (str != null) {
            cVar.setAnimationType(str);
        }
    }

    @C2991a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(C3115c cVar, boolean z) {
        cVar.setHardwareAccelerated(z);
    }

    public void setIdentifier(C3115c cVar, int i) {
    }

    public void setPresentationStyle(C3115c cVar, String str) {
    }

    @C2991a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C3115c cVar, boolean z) {
        cVar.setStatusBarTranslucent(z);
    }

    public void setSupportedOrientations(C3115c cVar, ReadableArray readableArray) {
    }

    @C2991a(name = "transparent")
    public void setTransparent(C3115c cVar, boolean z) {
        cVar.setTransparent(z);
    }

    @C2991a(name = "visible")
    public void setVisible(C3115c cVar, boolean z) {
    }

    public Object updateState(C3115c cVar, C2962f0 f0Var, C3025n0 n0Var) {
        cVar.getFabricViewStateManager().mo9496e(n0Var);
        Point a = C3113a.m12246a(cVar.getContext());
        cVar.mo10016f(a.x, a.y);
        return null;
    }
}
