package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.C2699i;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C2718b;
import com.facebook.react.devsupport.C2725h;
import com.facebook.react.uimanager.C3045t0;
import java.util.List;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.r */
public abstract class C2904r {

    /* renamed from: a */
    private final Application f8182a;

    /* renamed from: b */
    private C2886o f8183b;

    /* renamed from: com.facebook.react.r$a */
    class C2905a implements C2699i {
        C2905a() {
        }
    }

    protected C2904r(Application application) {
        this.f8182a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2886o mo9337a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        C2902p m = C2886o.m11401p().mo9309d(this.f8182a).mo9316k(mo9342f()).mo9323r(mo9351o()).mo9311f(mo9339c()).mo9320o(mo9348l()).mo9321p(mo9349m()).mo9319n(mo9347k()).mo9317l(mo9343g()).mo9322q(mo9350n()).mo9315j(mo9341e()).mo9312g(LifecycleState.BEFORE_CREATE).mo9318m(mo9346j());
        for (C2906s a : mo9344h()) {
            m.mo9307a(a);
        }
        String d = mo9340d();
        if (d != null) {
            m.mo9313h(d);
        } else {
            m.mo9310e((String) C6409a.m24521c(mo9338b()));
        }
        C2886o b = m.mo9308b();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo9338b() {
        return "index.android.bundle";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2718b mo9339c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo9340d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public JSIModulePackage mo9341e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo9342f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public JavaScriptExecutorFactory mo9343g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract List<C2906s> mo9344h();

    /* renamed from: i */
    public C2886o mo9345i() {
        if (this.f8183b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f8183b = mo9337a();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f8183b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C3090v mo9346j() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C2725h mo9347k() {
        return null;
    }

    /* renamed from: l */
    public boolean mo9348l() {
        return true;
    }

    /* renamed from: m */
    public C2699i mo9349m() {
        return new C2905a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C3045t0 mo9350n() {
        return new C3045t0();
    }

    /* renamed from: o */
    public abstract boolean mo9351o();

    /* renamed from: p */
    public boolean mo9352p() {
        return this.f8183b != null;
    }
}
