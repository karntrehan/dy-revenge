package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule;
import com.facebook.react.modules.core.C2793b;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.C2963f1;
import com.facebook.react.uimanager.C3045t0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.C3294a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.a */
public class C2577a extends C3252x implements C2912u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2886o f7567a;

    /* renamed from: b */
    private final C2793b f7568b;

    /* renamed from: c */
    private final boolean f7569c;

    /* renamed from: d */
    private final int f7570d;

    /* renamed from: com.facebook.react.a$a */
    class C2578a implements C2776a {

        /* renamed from: a */
        final /* synthetic */ Map f7571a;

        C2578a(Map map) {
            this.f7571a = map;
        }

        /* renamed from: a */
        public Map<String, ReactModuleInfo> mo8384a() {
            return this.f7571a;
        }
    }

    /* renamed from: com.facebook.react.a$b */
    class C2579b implements C2963f1 {
        C2579b() {
        }

        /* renamed from: a */
        public List<String> mo8385a() {
            return C2577a.this.f7567a.mo9272A();
        }

        /* renamed from: b */
        public ViewManager mo8386b(String str) {
            return C2577a.this.f7567a.mo9289u(str);
        }
    }

    public C2577a(C2886o oVar, C2793b bVar, C3045t0 t0Var, boolean z, int i) {
        this.f7567a = oVar;
        this.f7568b = bVar;
        this.f7569c = z;
        this.f7570d = i;
    }

    /* renamed from: j */
    private UIManagerModule m10740j(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C3294a.m12881c(0, "createUIManagerModule");
        try {
            if (this.f7569c) {
                return new UIManagerModule(reactApplicationContext, (C2963f1) new C2579b(), this.f7570d);
            }
            UIManagerModule uIManagerModule = new UIManagerModule(reactApplicationContext, this.f7567a.mo9293z(reactApplicationContext), this.f7570d);
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
            return uIManagerModule;
        } finally {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* renamed from: b */
    public void mo8380b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    /* renamed from: c */
    public void mo8381c() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    /* renamed from: e */
    public NativeModule mo8382e(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals(LogBoxModule.NAME)) {
                    c = 0;
                    break;
                }
                break;
            case -1789797270:
                if (str.equals(TimingModule.NAME)) {
                    c = 1;
                    break;
                }
                break;
            case -1633589448:
                if (str.equals(DevSettingsModule.NAME)) {
                    c = 2;
                    break;
                }
                break;
            case -1520650172:
                if (str.equals(DeviceInfoModule.NAME)) {
                    c = 3;
                    break;
                }
                break;
            case -1037217463:
                if (str.equals(DeviceEventManagerModule.NAME)) {
                    c = 4;
                    break;
                }
                break;
            case -790603268:
                if (str.equals(AndroidInfoModule.NAME)) {
                    c = 5;
                    break;
                }
                break;
            case -508954630:
                if (str.equals(NativeDevSplitBundleLoaderModule.NAME)) {
                    c = 6;
                    break;
                }
                break;
            case 512434409:
                if (str.equals(ExceptionsManagerModule.NAME)) {
                    c = 7;
                    break;
                }
                break;
            case 881516744:
                if (str.equals(SourceCodeModule.NAME)) {
                    c = 8;
                    break;
                }
                break;
            case 1256514152:
                if (str.equals(HeadlessJsTaskSupportModule.NAME)) {
                    c = 9;
                    break;
                }
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new LogBoxModule(reactApplicationContext, this.f7567a.mo9292y());
            case 1:
                return new TimingModule(reactApplicationContext, this.f7567a.mo9292y());
            case 2:
                return new DevSettingsModule(reactApplicationContext, this.f7567a.mo9292y());
            case 3:
                return new DeviceInfoModule(reactApplicationContext);
            case 4:
                return new DeviceEventManagerModule(reactApplicationContext, this.f7568b);
            case 5:
                return new AndroidInfoModule(reactApplicationContext);
            case 6:
                return new NativeDevSplitBundleLoaderModule(reactApplicationContext, this.f7567a.mo9292y());
            case 7:
                return new ExceptionsManagerModule(this.f7567a.mo9292y());
            case 8:
                return new SourceCodeModule(reactApplicationContext);
            case 9:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case 10:
                return m10740j(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    /* renamed from: g */
    public C2776a mo8383g() {
        try {
            return (C2776a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class, NativeDevSplitBundleLoaderModule.class};
            HashMap hashMap = new HashMap();
            for (int i = 0; i < 11; i++) {
                Class cls = clsArr[i];
                C2639a aVar = (C2639a) cls.getAnnotation(C2639a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new C2578a(hashMap);
        } catch (InstantiationException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        }
    }
}
