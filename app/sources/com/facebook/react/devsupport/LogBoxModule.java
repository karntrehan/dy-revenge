package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C2698h;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.p109b0.p110a.C2639a;

@C2639a(name = "LogBox")
public class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    private final C2730d mDevSupportManager;
    /* access modifiers changed from: private */
    public final C2698h mSurfaceDelegate;

    /* renamed from: com.facebook.react.devsupport.LogBoxModule$a */
    class C2713a implements Runnable {
        C2713a() {
        }

        public void run() {
            LogBoxModule.this.mSurfaceDelegate.mo8828d(LogBoxModule.NAME);
        }
    }

    /* renamed from: com.facebook.react.devsupport.LogBoxModule$b */
    class C2714b implements Runnable {
        C2714b() {
        }

        public void run() {
            LogBoxModule.this.mSurfaceDelegate.mo8825a();
        }
    }

    /* renamed from: com.facebook.react.devsupport.LogBoxModule$c */
    class C2715c implements Runnable {
        C2715c() {
        }

        public void run() {
            LogBoxModule.this.mSurfaceDelegate.mo8829e();
        }
    }

    /* renamed from: com.facebook.react.devsupport.LogBoxModule$d */
    class C2716d implements Runnable {
        C2716d() {
        }

        public void run() {
            LogBoxModule.this.mSurfaceDelegate.mo8827c();
        }
    }

    public LogBoxModule(ReactApplicationContext reactApplicationContext, C2730d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
        C2698h f = dVar.mo8883f(NAME);
        this.mSurfaceDelegate = f == null ? new C2723f(dVar) : f;
        UiThreadUtil.runOnUiThread(new C2713a());
    }

    public String getName() {
        return NAME;
    }

    public void hide() {
        UiThreadUtil.runOnUiThread(new C2715c());
    }

    public void invalidate() {
        UiThreadUtil.runOnUiThread(new C2716d());
    }

    public void show() {
        if (this.mSurfaceDelegate.mo8826b()) {
            UiThreadUtil.runOnUiThread(new C2714b());
        }
    }
}
