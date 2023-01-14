package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.C2699i;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C2718b;
import com.facebook.react.devsupport.C2724g;
import com.facebook.react.devsupport.C2725h;
import com.facebook.react.devsupport.p114j.C2727a;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.devsupport.p114j.C2731e;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.C2793b;
import com.facebook.react.modules.core.C2804g;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.debug.p119c.C2815a;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.p126z.C3257a;
import com.facebook.react.uimanager.C2923b0;
import com.facebook.react.uimanager.C2926c;
import com.facebook.react.uimanager.C3045t0;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.ComponentNameResolverManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C3294a;
import com.facebook.systrace.C3296b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p267f.p270b.C6137c;
import p174e.p247e.p267f.p271c.C6138a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.o */
public class C2886o {

    /* renamed from: a */
    private static final String f8102a = "o";

    /* renamed from: A */
    private final C3090v f8103A;

    /* renamed from: B */
    private List<ViewManager> f8104B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f8105C = false;

    /* renamed from: b */
    private final Set<C2923b0> f8106b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private volatile LifecycleState f8107c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2900k f8108d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile Thread f8109e;

    /* renamed from: f */
    private final JavaScriptExecutorFactory f8110f;

    /* renamed from: g */
    private List<String> f8111g = null;

    /* renamed from: h */
    private final JSBundleLoader f8112h;

    /* renamed from: i */
    private final String f8113i;

    /* renamed from: j */
    private final List<C2906s> f8114j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C2730d f8115k;

    /* renamed from: l */
    private final boolean f8116l;

    /* renamed from: m */
    private final boolean f8117m;

    /* renamed from: n */
    private ComponentNameResolverManager f8118n;

    /* renamed from: o */
    private final NotThreadSafeBridgeIdleDebugListener f8119o;

    /* renamed from: p */
    private final Object f8120p = new Object();

    /* renamed from: q */
    private volatile ReactContext f8121q;

    /* renamed from: r */
    private final Context f8122r;

    /* renamed from: s */
    private C2793b f8123s;

    /* renamed from: t */
    private Activity f8124t;

    /* renamed from: u */
    private final Collection<C2901l> f8125u = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile boolean f8126v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile Boolean f8127w = Boolean.FALSE;

    /* renamed from: x */
    private final C2705d f8128x;

    /* renamed from: y */
    private final NativeModuleCallExceptionHandler f8129y;

    /* renamed from: z */
    private final JSIModulePackage f8130z;

    /* renamed from: com.facebook.react.o$a */
    class C2887a {
        C2887a() {
        }
    }

    /* renamed from: com.facebook.react.o$b */
    class C2888b implements C2793b {
        C2888b() {
        }

        /* renamed from: c */
        public void mo9050c() {
            C2886o.this.m11373D();
        }
    }

    /* renamed from: com.facebook.react.o$c */
    class C2889c implements C2724g {
        C2889c() {
        }
    }

    /* renamed from: com.facebook.react.o$d */
    class C2890d implements C2731e {

        /* renamed from: a */
        final /* synthetic */ C2815a f8134a;

        /* renamed from: com.facebook.react.o$d$a */
        class C2891a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ boolean f8136f;

            C2891a(boolean z) {
                this.f8136f = z;
            }

            public void run() {
                if (this.f8136f) {
                    C2886o.this.f8115k.mo8886i();
                } else if (!C2886o.this.f8115k.mo8895r() || C2890d.this.f8134a.mo9173c() || C2886o.this.f8105C) {
                    C2890d.this.f8134a.mo9171a(false);
                    C2886o.this.m11382X();
                } else {
                    C2886o.this.m11378R();
                }
            }
        }

        C2890d(C2815a aVar) {
            this.f8134a = aVar;
        }

        /* renamed from: a */
        public void mo8904a(boolean z) {
            UiThreadUtil.runOnUiThread(new C2891a(z));
        }
    }

    /* renamed from: com.facebook.react.o$e */
    class C2892e implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ View f8138f;

        C2892e(View view) {
            this.f8138f = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f8138f.removeOnAttachStateChangeListener(this);
            C2886o.this.f8115k.mo8887j(true);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.facebook.react.o$f */
    class C2893f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2900k f8140f;

        /* renamed from: com.facebook.react.o$f$a */
        class C2894a implements Runnable {
            C2894a() {
            }

            public void run() {
                if (C2886o.this.f8108d != null) {
                    C2886o oVar = C2886o.this;
                    oVar.m11385a0(oVar.f8108d);
                    C2900k unused = C2886o.this.f8108d = null;
                }
            }
        }

        /* renamed from: com.facebook.react.o$f$b */
        class C2895b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ ReactApplicationContext f8143f;

            C2895b(ReactApplicationContext reactApplicationContext) {
                this.f8143f = reactApplicationContext;
            }

            public void run() {
                try {
                    C2886o.this.m11387b0(this.f8143f);
                } catch (Exception e) {
                    C6071a.m22876j("ReactNative", "ReactInstanceManager caught exception in setupReactContext", e);
                    C2886o.this.f8115k.handleException(e);
                }
            }
        }

        C2893f(C2900k kVar) {
            this.f8140f = kVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000c */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x000c A[LOOP:0: B:2:0x000c->B:18:0x000c, LOOP_START, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.REACT_CONTEXT_THREAD_END
                com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r0)
                com.facebook.react.o r0 = com.facebook.react.C2886o.this
                java.lang.Boolean r0 = r0.f8127w
                monitor-enter(r0)
            L_0x000c:
                com.facebook.react.o r1 = com.facebook.react.C2886o.this     // Catch:{ all -> 0x006f }
                java.lang.Boolean r1 = r1.f8127w     // Catch:{ all -> 0x006f }
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x006f }
                if (r1 == 0) goto L_0x0022
                com.facebook.react.o r1 = com.facebook.react.C2886o.this     // Catch:{ InterruptedException -> 0x000c }
                java.lang.Boolean r1 = r1.f8127w     // Catch:{ InterruptedException -> 0x000c }
                r1.wait()     // Catch:{ InterruptedException -> 0x000c }
                goto L_0x000c
            L_0x0022:
                monitor-exit(r0)     // Catch:{ all -> 0x006f }
                com.facebook.react.o r0 = com.facebook.react.C2886o.this
                r1 = 1
                boolean unused = r0.f8126v = r1
                r0 = -4
                android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.VM_INIT     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r0)     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.o r0 = com.facebook.react.C2886o.this     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.o$k r1 = r3.f8140f     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.JavaScriptExecutorFactory r1 = r1.mo9305b()     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.JavaScriptExecutor r1 = r1.create()     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.o$k r2 = r3.f8140f     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.JSBundleLoader r2 = r2.mo9304a()     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.ReactApplicationContext r0 = r0.m11404s(r1, r2)     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.o r1 = com.facebook.react.C2886o.this     // Catch:{ Exception -> 0x0064 }
                r2 = 0
                java.lang.Thread unused = r1.f8109e = r2     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.ReactMarkerConstants r1 = com.facebook.react.bridge.ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r1)     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.o$f$a r1 = new com.facebook.react.o$f$a     // Catch:{ Exception -> 0x0064 }
                r1.<init>()     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.o$f$b r2 = new com.facebook.react.o$f$b     // Catch:{ Exception -> 0x0064 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0064 }
                r0.runOnNativeModulesQueueThread(r2)     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r1)     // Catch:{ Exception -> 0x0064 }
                goto L_0x006e
            L_0x0064:
                r0 = move-exception
                com.facebook.react.o r1 = com.facebook.react.C2886o.this
                com.facebook.react.devsupport.j.d r1 = r1.f8115k
                r1.handleException(r0)
            L_0x006e:
                return
            L_0x006f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C2886o.C2893f.run():void");
        }
    }

    /* renamed from: com.facebook.react.o$g */
    class C2896g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2901l[] f8145f;

        /* renamed from: o */
        final /* synthetic */ ReactApplicationContext f8146o;

        C2896g(C2901l[] lVarArr, ReactApplicationContext reactApplicationContext) {
            this.f8145f = lVarArr;
            this.f8146o = reactApplicationContext;
        }

        public void run() {
            for (C2901l lVar : this.f8145f) {
                if (lVar != null) {
                    lVar.mo9306a(this.f8146o);
                }
            }
        }
    }

    /* renamed from: com.facebook.react.o$h */
    class C2897h implements Runnable {
        C2897h() {
        }

        public void run() {
            Process.setThreadPriority(0);
            ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
        }
    }

    /* renamed from: com.facebook.react.o$i */
    class C2898i implements Runnable {
        C2898i() {
        }

        public void run() {
            Process.setThreadPriority(0);
        }
    }

    /* renamed from: com.facebook.react.o$j */
    class C2899j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f8150f;

        /* renamed from: o */
        final /* synthetic */ C2923b0 f8151o;

        C2899j(int i, C2923b0 b0Var) {
            this.f8150f = i;
            this.f8151o = b0Var;
        }

        public void run() {
            C3294a.m12883e(0, "pre_rootView.onAttachedToReactInstance", this.f8150f);
            this.f8151o.mo9472a(101);
        }
    }

    /* renamed from: com.facebook.react.o$k */
    private class C2900k {

        /* renamed from: a */
        private final JavaScriptExecutorFactory f8153a;

        /* renamed from: b */
        private final JSBundleLoader f8154b;

        public C2900k(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f8153a = (JavaScriptExecutorFactory) C6409a.m24521c(javaScriptExecutorFactory);
            this.f8154b = (JSBundleLoader) C6409a.m24521c(jSBundleLoader);
        }

        /* renamed from: a */
        public JSBundleLoader mo9304a() {
            return this.f8154b;
        }

        /* renamed from: b */
        public JavaScriptExecutorFactory mo9305b() {
            return this.f8153a;
        }
    }

    /* renamed from: com.facebook.react.o$l */
    public interface C2901l {
        /* renamed from: a */
        void mo9306a(ReactContext reactContext);
    }

    C2886o(Context context, Activity activity, C2793b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<C2906s> list, boolean z, C2718b bVar2, boolean z2, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, C3045t0 t0Var, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, C2725h hVar, boolean z3, C2727a aVar, int i, int i2, JSIModulePackage jSIModulePackage, Map<String, ?> map, C3090v vVar, C2699i iVar) {
        Context context2 = context;
        boolean z4 = z;
        C6071a.m22868b(f8102a, "ReactInstanceManager.ctor()");
        m11372C(context);
        C2926c.m11507f(context);
        this.f8122r = context2;
        this.f8124t = activity;
        this.f8123s = bVar;
        this.f8110f = javaScriptExecutorFactory;
        this.f8112h = jSBundleLoader;
        String str2 = str;
        this.f8113i = str2;
        ArrayList arrayList = new ArrayList();
        this.f8114j = arrayList;
        this.f8116l = z4;
        this.f8117m = z2;
        C3294a.m12881c(0, "ReactInstanceManager.initDevSupportManager");
        C2730d a = bVar2.mo8877a(context, m11403r(), str2, z, hVar, aVar, i, map, iVar);
        this.f8115k = a;
        C3294a.m12885g(0);
        this.f8119o = notThreadSafeBridgeIdleDebugListener;
        this.f8107c = lifecycleState;
        this.f8128x = new C2705d(context2);
        this.f8129y = nativeModuleCallExceptionHandler;
        synchronized (arrayList) {
            C6137c.m23120a().mo18151c(C6138a.f16818c, "RNCore: Use Split Packages");
            arrayList.add(new C2577a(this, new C2888b(), t0Var, z3, i2));
            if (z4) {
                arrayList.add(new C2637b());
            }
            arrayList.addAll(list);
        }
        this.f8130z = jSIModulePackage;
        C2804g.m11195j();
        if (z4) {
            a.mo8894q();
        }
        mo9285Z();
    }

    /* renamed from: C */
    static void m11372C(Context context) {
        SoLoader.m12778f(context, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m11373D() {
        UiThreadUtil.assertOnUiThread();
        C2793b bVar = this.f8123s;
        if (bVar != null) {
            bVar.mo9050c();
        }
    }

    /* renamed from: E */
    private synchronized void m11374E() {
        if (this.f8107c == LifecycleState.RESUMED) {
            m11377H(true);
        }
    }

    /* renamed from: F */
    private synchronized void m11375F() {
        ReactContext x = mo9291x();
        if (x != null) {
            if (this.f8107c == LifecycleState.RESUMED) {
                x.onHostPause();
                this.f8107c = LifecycleState.BEFORE_RESUME;
            }
            if (this.f8107c == LifecycleState.BEFORE_RESUME) {
                x.onHostDestroy();
            }
        }
        this.f8107c = LifecycleState.BEFORE_CREATE;
    }

    /* renamed from: G */
    private synchronized void m11376G() {
        ReactContext x = mo9291x();
        if (x != null) {
            if (this.f8107c == LifecycleState.BEFORE_CREATE) {
                x.onHostResume(this.f8124t);
            } else if (this.f8107c == LifecycleState.RESUMED) {
            }
            x.onHostPause();
        }
        this.f8107c = LifecycleState.BEFORE_RESUME;
    }

    /* renamed from: H */
    private synchronized void m11377H(boolean z) {
        ReactContext x = mo9291x();
        if (x != null && (z || this.f8107c == LifecycleState.BEFORE_RESUME || this.f8107c == LifecycleState.BEFORE_CREATE)) {
            x.onHostResume(this.f8124t);
        }
        this.f8107c = LifecycleState.RESUMED;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m11378R() {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        m11381W(this.f8110f, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f8115k.mo8888k(), this.f8115k.mo8879b()));
    }

    /* renamed from: U */
    private void m11379U(C2906s sVar, C2732e eVar) {
        C3296b.m12892a(0, "processPackage").mo10751b("className", sVar.getClass().getSimpleName()).mo10752c();
        boolean z = sVar instanceof C2912u;
        if (z) {
            ((C2912u) sVar).mo8380b();
        }
        eVar.mo8906b(sVar);
        if (z) {
            ((C2912u) sVar).mo8381c();
        }
        C3296b.m12893b(0).mo10752c();
    }

    /* renamed from: V */
    private NativeModuleRegistry m11380V(ReactApplicationContext reactApplicationContext, List<C2906s> list, boolean z) {
        C2732e eVar = new C2732e(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f8114j) {
            for (C2906s next : list) {
                if (!z || !this.f8114j.contains(next)) {
                    C3294a.m12881c(0, "createAndProcessCustomReactPackage");
                    if (z) {
                        try {
                            this.f8114j.add(next);
                        } catch (Throwable th) {
                            C3294a.m12885g(0);
                            throw th;
                        }
                    }
                    m11379U(next, eVar);
                    C3294a.m12885g(0);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        C3294a.m12881c(0, "buildNativeModuleRegistry");
        try {
            return eVar.mo8905a();
        } finally {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    /* renamed from: W */
    private void m11381W(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        C2900k kVar = new C2900k(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f8109e == null) {
            m11385a0(kVar);
        } else {
            this.f8108d = kVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m11382X() {
        C6071a.m22868b(f8102a, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        C6137c.m23120a().mo18151c(C6138a.f16818c, "RNCore: load from BundleLoader");
        m11381W(this.f8110f, this.f8112h);
    }

    /* renamed from: Y */
    private void m11383Y() {
        C6071a.m22868b(f8102a, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        C6137c.m23120a().mo18151c(C6138a.f16818c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f8116l && this.f8113i != null) {
            C2815a o = this.f8115k.mo8892o();
            if (!C3294a.m12886h(0)) {
                if (this.f8112h == null) {
                    this.f8115k.mo8886i();
                    return;
                } else {
                    this.f8115k.mo8899v(new C2890d(o));
                    return;
                }
            }
        }
        m11382X();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m11385a0(C2900k kVar) {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f8106b) {
            synchronized (this.f8120p) {
                if (this.f8121q != null) {
                    m11390d0(this.f8121q);
                    this.f8121q = null;
                }
            }
        }
        this.f8109e = new Thread((ThreadGroup) null, new C2893f(kVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f8109e.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m11387b0(ReactApplicationContext reactApplicationContext) {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        C3294a.m12881c(0, "setupReactContext");
        synchronized (this.f8106b) {
            synchronized (this.f8120p) {
                this.f8121q = (ReactContext) C6409a.m24521c(reactApplicationContext);
            }
            CatalystInstance catalystInstance = (CatalystInstance) C6409a.m24521c(reactApplicationContext.getCatalystInstance());
            catalystInstance.initialize();
            this.f8115k.mo8885h(reactApplicationContext);
            this.f8128x.mo8850a(catalystInstance);
            m11374E();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (C2923b0 next : this.f8106b) {
                if (next.getState().compareAndSet(0, 1)) {
                    m11400o(next);
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new C2896g((C2901l[]) this.f8125u.toArray(new C2901l[this.f8125u.size()]), reactApplicationContext));
        C3294a.m12885g(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
        reactApplicationContext.runOnJSQueueThread(new C2897h());
        reactApplicationContext.runOnNativeModulesQueueThread(new C2898i());
    }

    /* renamed from: d0 */
    private void m11390d0(ReactContext reactContext) {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f8107c == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f8106b) {
            for (C2923b0 q : this.f8106b) {
                m11402q(q);
            }
        }
        this.f8128x.mo8851c(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f8115k.mo8897t(reactContext);
    }

    /* renamed from: o */
    private void m11400o(C2923b0 b0Var) {
        int i;
        C6071a.m22868b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        C3294a.m12881c(0, "attachRootViewToInstance");
        UIManager f = C3051u0.m12089f(this.f8121q, b0Var.getUIManagerType());
        if (f != null) {
            Bundle appProperties = b0Var.getAppProperties();
            if (b0Var.getUIManagerType() == 2) {
                i = f.startSurface(b0Var.getRootViewGroup(), b0Var.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), b0Var.getWidthMeasureSpec(), b0Var.getHeightMeasureSpec());
                b0Var.setRootViewTag(i);
                b0Var.setShouldLogContentAppeared(true);
            } else {
                i = f.addRootView(b0Var.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), b0Var.getInitialUITemplate());
                b0Var.setRootViewTag(i);
                b0Var.mo9473b();
            }
            C3294a.m12879a(0, "pre_rootView.onAttachedToReactInstance", i);
            UiThreadUtil.runOnUiThread(new C2899j(i, b0Var));
            C3294a.m12885g(0);
            return;
        }
        throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
    }

    /* renamed from: p */
    public static C2902p m11401p() {
        return new C2902p();
    }

    /* renamed from: q */
    private void m11402q(C2923b0 b0Var) {
        UiThreadUtil.assertOnUiThread();
        b0Var.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = b0Var.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    /* renamed from: r */
    private C2724g m11403r() {
        return new C2889c();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: s */
    public ReactApplicationContext m11404s(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.f8122r);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.f8129y;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.f8115k;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(m11380V(reactApplicationContext, this.f8114j, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        C3294a.m12881c(0, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            if (!C3257a.f9220a || this.f8103A == null) {
                JSIModulePackage jSIModulePackage = this.f8130z;
                if (jSIModulePackage != null) {
                    build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
                }
                if (C3257a.f9224e) {
                    build.getJSIModule(JSIModuleType.UIManager);
                }
                NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f8119o;
                if (notThreadSafeBridgeIdleDebugListener != null) {
                    build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
                }
                if (C3294a.m12886h(0)) {
                    build.setGlobalVariable("__RCTProfileIsProfiling", "true");
                }
                if (C3257a.f9225f) {
                    this.f8118n = new ComponentNameResolverManager(build.getRuntimeExecutor(), new C2887a());
                    build.setGlobalVariable("__fbStaticViewConfig", "true");
                }
                ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
                C3294a.m12881c(0, "runJSBundle");
                build.runJSBundle();
                C3294a.m12885g(0);
                return reactApplicationContext;
            }
            throw null;
        } catch (Throwable th) {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    /* renamed from: w */
    private void m11405w(C2923b0 b0Var, CatalystInstance catalystInstance) {
        C6071a.m22868b("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (b0Var.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(b0Var.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(b0Var.getRootViewTag());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r4 = r10.f8114j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r10.f8111g != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r0 = new java.util.HashSet();
        r5 = r10.f8114j.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r5.hasNext() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r6 = r5.next();
        com.facebook.systrace.C3296b.m12892a(0, "ReactInstanceManager.getViewManagerName").mo10751b("Package", r6.getClass().getSimpleName()).mo10752c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ((r6 instanceof com.facebook.react.C3256y) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r6 = ((com.facebook.react.C3256y) r6).mo10721b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r6 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r0.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        com.facebook.systrace.C3296b.m12893b(0).mo10752c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        com.facebook.systrace.C3294a.m12885g(0);
        r10.f8111g = new java.util.ArrayList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r0 = r10.f8111g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        return r0;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo9272A() {
        /*
            r10 = this;
            java.lang.String r0 = "ReactInstanceManager.getViewManagerNames"
            r1 = 0
            com.facebook.systrace.C3294a.m12881c(r1, r0)
            java.util.List<java.lang.String> r0 = r10.f8111g
            if (r0 == 0) goto L_0x000c
            return r0
        L_0x000c:
            java.lang.Object r0 = r10.f8120p
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r3 = r10.mo9291x()     // Catch:{ all -> 0x007f }
            com.facebook.react.bridge.ReactApplicationContext r3 = (com.facebook.react.bridge.ReactApplicationContext) r3     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x007c
            boolean r4 = r3.hasActiveReactInstance()     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x001e
            goto L_0x007c
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            java.util.List<com.facebook.react.s> r4 = r10.f8114j
            monitor-enter(r4)
            java.util.List<java.lang.String> r0 = r10.f8111g     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0075
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0079 }
            r0.<init>()     // Catch:{ all -> 0x0079 }
            java.util.List<com.facebook.react.s> r5 = r10.f8114j     // Catch:{ all -> 0x0079 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0079 }
        L_0x0031:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0079 }
            if (r6 == 0) goto L_0x006b
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0079 }
            com.facebook.react.s r6 = (com.facebook.react.C2906s) r6     // Catch:{ all -> 0x0079 }
            java.lang.String r7 = "ReactInstanceManager.getViewManagerName"
            com.facebook.systrace.b$b r7 = com.facebook.systrace.C3296b.m12892a(r1, r7)     // Catch:{ all -> 0x0079 }
            java.lang.String r8 = "Package"
            java.lang.Class r9 = r6.getClass()     // Catch:{ all -> 0x0079 }
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x0079 }
            com.facebook.systrace.b$b r7 = r7.mo10751b(r8, r9)     // Catch:{ all -> 0x0079 }
            r7.mo10752c()     // Catch:{ all -> 0x0079 }
            boolean r7 = r6 instanceof com.facebook.react.C3256y     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x0063
            com.facebook.react.y r6 = (com.facebook.react.C3256y) r6     // Catch:{ all -> 0x0079 }
            java.util.List r6 = r6.mo10721b(r3)     // Catch:{ all -> 0x0079 }
            if (r6 == 0) goto L_0x0063
            r0.addAll(r6)     // Catch:{ all -> 0x0079 }
        L_0x0063:
            com.facebook.systrace.b$b r6 = com.facebook.systrace.C3296b.m12893b(r1)     // Catch:{ all -> 0x0079 }
            r6.mo10752c()     // Catch:{ all -> 0x0079 }
            goto L_0x0031
        L_0x006b:
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0079 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0079 }
            r1.<init>(r0)     // Catch:{ all -> 0x0079 }
            r10.f8111g = r1     // Catch:{ all -> 0x0079 }
        L_0x0075:
            java.util.List<java.lang.String> r0 = r10.f8111g     // Catch:{ all -> 0x0079 }
            monitor-exit(r4)     // Catch:{ all -> 0x0079 }
            return r0
        L_0x0079:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0079 }
            throw r0
        L_0x007c:
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return r1
        L_0x007f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C2886o.mo9272A():java.util.List");
    }

    /* renamed from: B */
    public void mo9273B(Exception exc) {
        this.f8115k.handleException(exc);
    }

    /* renamed from: I */
    public void mo9274I(Activity activity, int i, int i2, Intent intent) {
        ReactContext x = mo9291x();
        if (x != null) {
            x.onActivityResult(activity, i, i2, intent);
        }
    }

    /* renamed from: J */
    public void mo9275J() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f8121q;
        if (reactContext == null) {
            C6071a.m22859G(f8102a, "Instance detached from instance manager");
            m11373D();
            return;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
        if (deviceEventManagerModule != null) {
            deviceEventManagerModule.emitHardwareBackPressed();
        }
    }

    /* renamed from: K */
    public void mo9276K(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext x = mo9291x();
        if (x != null && (appearanceModule = (AppearanceModule) x.getNativeModule(AppearanceModule.class)) != null) {
            appearanceModule.onConfigurationChanged(context);
        }
    }

    /* renamed from: L */
    public void mo9277L() {
        UiThreadUtil.assertOnUiThread();
        if (this.f8116l) {
            this.f8115k.mo8887j(false);
        }
        m11375F();
        this.f8124t = null;
    }

    /* renamed from: M */
    public void mo9278M(Activity activity) {
        if (activity == this.f8124t) {
            mo9277L();
        }
    }

    /* renamed from: N */
    public void mo9279N() {
        UiThreadUtil.assertOnUiThread();
        this.f8123s = null;
        if (this.f8116l) {
            this.f8115k.mo8887j(false);
        }
        m11376G();
    }

    /* renamed from: O */
    public void mo9280O(Activity activity) {
        boolean z = true;
        if (this.f8117m) {
            C6409a.m24519a(this.f8124t != null);
        }
        Activity activity2 = this.f8124t;
        if (activity2 != null) {
            if (activity != activity2) {
                z = false;
            }
            C6409a.m24520b(z, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f8124t.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        mo9279N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2.f8117m == false) goto L_0x0027;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9281P(android.app.Activity r3) {
        /*
            r2 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            r2.f8124t = r3
            boolean r0 = r2.f8116l
            if (r0 == 0) goto L_0x002c
            r0 = 1
            if (r3 == 0) goto L_0x0023
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            boolean r1 = p027c.p064i.p072j.C1988t.m8359Q(r3)
            if (r1 != 0) goto L_0x0027
            com.facebook.react.o$e r0 = new com.facebook.react.o$e
            r0.<init>(r3)
            r3.addOnAttachStateChangeListener(r0)
            goto L_0x002c
        L_0x0023:
            boolean r3 = r2.f8117m
            if (r3 != 0) goto L_0x002c
        L_0x0027:
            com.facebook.react.devsupport.j.d r3 = r2.f8115k
            r3.mo8887j(r0)
        L_0x002c:
            r3 = 0
            r2.m11377H(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C2886o.mo9281P(android.app.Activity):void");
    }

    /* renamed from: Q */
    public void mo9282Q(Activity activity, C2793b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.f8123s = bVar;
        mo9281P(activity);
    }

    /* renamed from: S */
    public void mo9283S(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext x = mo9291x();
        if (x == null) {
            C6071a.m22859G(f8102a, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) x.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        x.onNewIntent(this.f8124t, intent);
    }

    /* renamed from: T */
    public void mo9284T(boolean z) {
        UiThreadUtil.assertOnUiThread();
        ReactContext x = mo9291x();
        if (x != null) {
            x.onWindowFocusChange(z);
        }
    }

    /* renamed from: Z */
    public void mo9285Z() {
        Method method;
        try {
            method = C2886o.class.getMethod("B", new Class[]{Exception.class});
        } catch (NoSuchMethodException e) {
            C6071a.m22876j("ReactInstanceHolder", "Failed to set cxx error hanlder function", e);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    /* renamed from: c0 */
    public void mo9286c0() {
        UiThreadUtil.assertOnUiThread();
        this.f8115k.mo8896s();
    }

    /* renamed from: n */
    public void mo9287n(C2923b0 b0Var) {
        UiThreadUtil.assertOnUiThread();
        if (this.f8106b.add(b0Var)) {
            m11402q(b0Var);
        }
        ReactContext x = mo9291x();
        if (this.f8109e == null && x != null && b0Var.getState().compareAndSet(0, 1)) {
            m11400o(b0Var);
        }
    }

    /* renamed from: t */
    public void mo9288t() {
        C6071a.m22868b(f8102a, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (!this.f8126v) {
            this.f8126v = true;
            m11383Y();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.f8114j.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 instanceof com.facebook.react.C3256y) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4 = ((com.facebook.react.C3256y) r4).mo10720a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r6.f8114j;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.uimanager.ViewManager mo9289u(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8120p
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r1 = r6.mo9291x()     // Catch:{ all -> 0x003e }
            com.facebook.react.bridge.ReactApplicationContext r1 = (com.facebook.react.bridge.ReactApplicationContext) r1     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r1 == 0) goto L_0x003c
            boolean r3 = r1.hasActiveReactInstance()     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x0013
            goto L_0x003c
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            java.util.List<com.facebook.react.s> r3 = r6.f8114j
            monitor-enter(r3)
            java.util.List<com.facebook.react.s> r0 = r6.f8114j     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x001d:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0037
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0039 }
            com.facebook.react.s r4 = (com.facebook.react.C2906s) r4     // Catch:{ all -> 0x0039 }
            boolean r5 = r4 instanceof com.facebook.react.C3256y     // Catch:{ all -> 0x0039 }
            if (r5 == 0) goto L_0x001d
            com.facebook.react.y r4 = (com.facebook.react.C3256y) r4     // Catch:{ all -> 0x0039 }
            com.facebook.react.uimanager.ViewManager r4 = r4.mo10720a(r1, r7)     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r2
        L_0x0039:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r7
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r2
        L_0x003e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C2886o.mo9289u(java.lang.String):com.facebook.react.uimanager.ViewManager");
    }

    /* renamed from: v */
    public void mo9290v(C2923b0 b0Var) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f8106b) {
            if (this.f8106b.contains(b0Var)) {
                ReactContext x = mo9291x();
                this.f8106b.remove(b0Var);
                if (x != null && x.hasActiveReactInstance()) {
                    m11405w(b0Var, x.getCatalystInstance());
                }
            }
        }
    }

    /* renamed from: x */
    public ReactContext mo9291x() {
        ReactContext reactContext;
        synchronized (this.f8120p) {
            reactContext = this.f8121q;
        }
        return reactContext;
    }

    /* renamed from: y */
    public C2730d mo9292y() {
        return this.f8115k;
    }

    /* renamed from: z */
    public List<ViewManager> mo9293z(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        C3294a.m12881c(0, "createAllViewManagers");
        try {
            if (this.f8104B == null) {
                synchronized (this.f8114j) {
                    if (this.f8104B == null) {
                        this.f8104B = new ArrayList();
                        for (C2906s a : this.f8114j) {
                            this.f8104B.addAll(a.mo7573a(reactApplicationContext));
                        }
                        list = this.f8104B;
                    }
                }
                C3294a.m12885g(0);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                return list;
            }
            list = this.f8104B;
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th) {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }
}
