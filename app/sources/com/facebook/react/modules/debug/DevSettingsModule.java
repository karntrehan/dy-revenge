package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.p114j.C2728b;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.p109b0.p110a.C2639a;

@C2639a(name = "DevSettings")
public class DevSettingsModule extends NativeDevSettingsSpec {
    public static final String NAME = "DevSettings";
    /* access modifiers changed from: private */
    public final C2730d mDevSupportManager;

    /* renamed from: com.facebook.react.modules.debug.DevSettingsModule$a */
    class C2809a implements Runnable {
        C2809a() {
        }

        public void run() {
            DevSettingsModule.this.mDevSupportManager.mo8886i();
        }
    }

    /* renamed from: com.facebook.react.modules.debug.DevSettingsModule$b */
    class C2810b implements C2728b {

        /* renamed from: a */
        final /* synthetic */ String f7928a;

        C2810b(String str) {
            this.f7928a = str;
        }
    }

    public DevSettingsModule(ReactApplicationContext reactApplicationContext, C2730d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
    }

    public void addListener(String str) {
    }

    public void addMenuItem(String str) {
        this.mDevSupportManager.mo8889l(str, new C2810b(str));
    }

    public String getName() {
        return NAME;
    }

    public void onFastRefresh() {
    }

    public void reload() {
        if (this.mDevSupportManager.mo8881d()) {
            UiThreadUtil.runOnUiThread(new C2809a());
        }
    }

    public void reloadWithReason(String str) {
        reload();
    }

    public void removeListeners(double d) {
    }

    public void setHotLoadingEnabled(boolean z) {
        this.mDevSupportManager.mo8882e(z);
    }

    public void setIsDebuggingRemotely(boolean z) {
        this.mDevSupportManager.mo8878a(z);
    }

    public void setIsShakeToShowDevMenuEnabled(boolean z) {
    }

    public void setProfilingEnabled(boolean z) {
        this.mDevSupportManager.mo8891n(z);
    }

    public void toggleElementInspector() {
        this.mDevSupportManager.mo8893p();
    }
}
