package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2990j0;
import p174e.p446g.p448b.C10200h;
import p174e.p446g.p448b.C10205j;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.i */
public final class C9881i {

    /* renamed from: a */
    public static final C9882a f26434a = new C9882a((C10452g) null);

    /* renamed from: b */
    private final ReactContext f26435b;

    /* renamed from: c */
    private final C10205j f26436c;

    /* renamed from: d */
    private final C10200h<?> f26437d;

    /* renamed from: e */
    private final ViewGroup f26438e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f26439f;

    /* renamed from: g */
    private boolean f26440g;

    /* renamed from: com.swmansion.gesturehandler.react.i$a */
    public static final class C9882a {
        private C9882a() {
        }

        public /* synthetic */ C9882a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final ViewGroup m33696b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof C2990j0)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.i$b */
    private final class C9883b extends C10200h<C9883b> {

        /* renamed from: L */
        final /* synthetic */ C9881i f26441L;

        public C9883b(C9881i iVar) {
            C10457l.m35320e(iVar, "this$0");
            this.f26441L = iVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d0 */
        public void mo24741d0() {
            this.f26441L.f26439f = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (this.f26441L.mo24737c() instanceof C2990j0) {
                ((C2990j0) this.f26441L.mo24737c()).mo9714g(obtain);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e0 */
        public void mo24742e0(MotionEvent motionEvent) {
            C10457l.m35320e(motionEvent, "event");
            if (mo25427N() == 0) {
                mo25446n();
                this.f26441L.f26439f = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                mo25465z();
            }
        }
    }

    public C9881i(ReactContext reactContext, ViewGroup viewGroup) {
        C10457l.m35320e(reactContext, "context");
        C10457l.m35320e(viewGroup, "wrappedView");
        this.f26435b = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id < 1 ? false : true) {
            NativeModule nativeModule = reactContext.getNativeModule(RNGestureHandlerModule.class);
            C10457l.m35317b(nativeModule);
            C10457l.m35319d(nativeModule, "context.getNativeModule(RNGestureHandlerModule::class.java)!!");
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
            C9880h registry = rNGestureHandlerModule.getRegistry();
            ViewGroup a = f26434a.m33696b(viewGroup);
            this.f26438e = a;
            Log.i("ReactNative", C10457l.m35326k("[GESTURE HANDLER] Initialize gesture handler for root view ", a));
            C10205j jVar = new C10205j(viewGroup, registry, new C9890m());
            jVar.mo25481z(0.1f);
            C10323s sVar = C10323s.f27547a;
            this.f26436c = jVar;
            C9883b bVar = new C9883b(this);
            bVar.mo25466z0(-id);
            this.f26437d = bVar;
            registry.mo24735j(bVar);
            registry.mo24730b(bVar.mo25428O(), id, 3);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException(C10457l.m35326k("Expect view tag to be set for ", viewGroup).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m33687e(C9881i iVar) {
        C10457l.m35320e(iVar, "this$0");
        iVar.m33689i();
    }

    /* renamed from: i */
    private final void m33689i() {
        C10200h<?> hVar = this.f26437d;
        if (hVar != null && hVar.mo25427N() == 2) {
            hVar.mo25441i();
            hVar.mo25465z();
        }
    }

    /* renamed from: b */
    public final boolean mo24736b(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "ev");
        this.f26440g = true;
        C10205j jVar = this.f26436c;
        C10457l.m35317b(jVar);
        jVar.mo25480v(motionEvent);
        this.f26440g = false;
        return this.f26439f;
    }

    /* renamed from: c */
    public final ViewGroup mo24737c() {
        return this.f26438e;
    }

    /* renamed from: d */
    public final void mo24738d(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new C9873c(this));
        }
    }

    /* renamed from: g */
    public final void mo24739g(boolean z) {
        if (this.f26436c != null && !this.f26440g) {
            m33689i();
        }
    }

    /* renamed from: h */
    public final void mo24740h() {
        Log.i("ReactNative", C10457l.m35326k("[GESTURE HANDLER] Tearing down gesture handler registered for root view ", this.f26438e));
        NativeModule nativeModule = this.f26435b.getNativeModule(RNGestureHandlerModule.class);
        C10457l.m35317b(nativeModule);
        C10457l.m35319d(nativeModule, "context.getNativeModule(RNGestureHandlerModule::class.java)!!");
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        C9880h registry = rNGestureHandlerModule.getRegistry();
        C10200h<?> hVar = this.f26437d;
        C10457l.m35317b(hVar);
        registry.mo24732f(hVar.mo25428O());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
