package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.C2389a;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.C2699i;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C2717a;
import com.facebook.react.devsupport.C2718b;
import com.facebook.react.devsupport.C2725h;
import com.facebook.react.devsupport.p114j.C2727a;
import com.facebook.react.jscexecutor.C2770a;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.react.modules.core.C2793b;
import com.facebook.react.modules.systeminfo.C2878a;
import com.facebook.react.uimanager.C3045t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.p */
public class C2902p {

    /* renamed from: a */
    private final List<C2906s> f8156a = new ArrayList();

    /* renamed from: b */
    private String f8157b;

    /* renamed from: c */
    private JSBundleLoader f8158c;

    /* renamed from: d */
    private String f8159d;

    /* renamed from: e */
    private NotThreadSafeBridgeIdleDebugListener f8160e;

    /* renamed from: f */
    private Application f8161f;

    /* renamed from: g */
    private boolean f8162g;

    /* renamed from: h */
    private C2718b f8163h;

    /* renamed from: i */
    private boolean f8164i;

    /* renamed from: j */
    private LifecycleState f8165j;

    /* renamed from: k */
    private C3045t0 f8166k;

    /* renamed from: l */
    private NativeModuleCallExceptionHandler f8167l;

    /* renamed from: m */
    private Activity f8168m;

    /* renamed from: n */
    private C2793b f8169n;

    /* renamed from: o */
    private C2725h f8170o;

    /* renamed from: p */
    private boolean f8171p;

    /* renamed from: q */
    private C2727a f8172q;

    /* renamed from: r */
    private JavaScriptExecutorFactory f8173r;

    /* renamed from: s */
    private int f8174s = 1;

    /* renamed from: t */
    private int f8175t = -1;

    /* renamed from: u */
    private JSIModulePackage f8176u;

    /* renamed from: v */
    private Map<String, ?> f8177v;

    /* renamed from: w */
    private C3090v f8178w;

    /* renamed from: x */
    private C2699i f8179x;

    C2902p() {
    }

    /* renamed from: c */
    private JavaScriptExecutorFactory m11433c(String str, String str2, Context context) {
        try {
            C2886o.m11372C(context);
            JSCExecutor.m11086a();
            return new C2770a(str, str2);
        } catch (UnsatisfiedLinkError e) {
            if (!e.getMessage().contains("__cxa_bad_typeid")) {
                try {
                    HermesExecutor.m9895a();
                    return new C2389a();
                } catch (UnsatisfiedLinkError e2) {
                    e2.printStackTrace();
                    throw e;
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: a */
    public C2902p mo9307a(C2906s sVar) {
        this.f8156a.add(sVar);
        return this;
    }

    /* renamed from: b */
    public C2886o mo9308b() {
        String str;
        C6409a.m24522d(this.f8161f, "Application property has not been set with this builder");
        if (this.f8165j == LifecycleState.RESUMED) {
            C6409a.m24522d(this.f8168m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z = true;
        C6409a.m24520b((!this.f8162g && this.f8157b == null && this.f8158c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f8159d == null && this.f8157b == null && this.f8158c == null) {
            z = false;
        }
        C6409a.m24520b(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.f8166k == null) {
            this.f8166k = new C3045t0();
        }
        String packageName = this.f8161f.getPackageName();
        String a = C2878a.m11356a();
        Application application = this.f8161f;
        Activity activity = this.f8168m;
        C2793b bVar = this.f8169n;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f8173r;
        JavaScriptExecutorFactory c = javaScriptExecutorFactory == null ? m11433c(packageName, a, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoader = this.f8158c;
        if (jSBundleLoader == null && (str = this.f8157b) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.f8161f, str, false);
        }
        JSBundleLoader jSBundleLoader2 = jSBundleLoader;
        String str2 = this.f8159d;
        List<C2906s> list = this.f8156a;
        boolean z2 = this.f8162g;
        C2718b bVar2 = this.f8163h;
        if (bVar2 == null) {
            bVar2 = new C2717a();
        }
        return new C2886o(application, activity, bVar, c, jSBundleLoader2, str2, list, z2, bVar2, this.f8164i, this.f8160e, (LifecycleState) C6409a.m24522d(this.f8165j, "Initial lifecycle state was not set"), this.f8166k, this.f8167l, this.f8170o, this.f8171p, this.f8172q, this.f8174s, this.f8175t, this.f8176u, this.f8177v, this.f8178w, this.f8179x);
    }

    /* renamed from: d */
    public C2902p mo9309d(Application application) {
        this.f8161f = application;
        return this;
    }

    /* renamed from: e */
    public C2902p mo9310e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f8157b = str2;
        this.f8158c = null;
        return this;
    }

    /* renamed from: f */
    public C2902p mo9311f(C2718b bVar) {
        this.f8163h = bVar;
        return this;
    }

    /* renamed from: g */
    public C2902p mo9312g(LifecycleState lifecycleState) {
        this.f8165j = lifecycleState;
        return this;
    }

    /* renamed from: h */
    public C2902p mo9313h(String str) {
        if (!str.startsWith("assets://")) {
            return mo9314i(JSBundleLoader.createFileLoader(str));
        }
        this.f8157b = str;
        this.f8158c = null;
        return this;
    }

    /* renamed from: i */
    public C2902p mo9314i(JSBundleLoader jSBundleLoader) {
        this.f8158c = jSBundleLoader;
        this.f8157b = null;
        return this;
    }

    /* renamed from: j */
    public C2902p mo9315j(JSIModulePackage jSIModulePackage) {
        this.f8176u = jSIModulePackage;
        return this;
    }

    /* renamed from: k */
    public C2902p mo9316k(String str) {
        this.f8159d = str;
        return this;
    }

    /* renamed from: l */
    public C2902p mo9317l(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f8173r = javaScriptExecutorFactory;
        return this;
    }

    /* renamed from: m */
    public C2902p mo9318m(C3090v vVar) {
        return this;
    }

    /* renamed from: n */
    public C2902p mo9319n(C2725h hVar) {
        this.f8170o = hVar;
        return this;
    }

    /* renamed from: o */
    public C2902p mo9320o(boolean z) {
        this.f8164i = z;
        return this;
    }

    /* renamed from: p */
    public C2902p mo9321p(C2699i iVar) {
        this.f8179x = iVar;
        return this;
    }

    /* renamed from: q */
    public C2902p mo9322q(C3045t0 t0Var) {
        this.f8166k = t0Var;
        return this;
    }

    /* renamed from: r */
    public C2902p mo9323r(boolean z) {
        this.f8162g = z;
        return this;
    }
}
