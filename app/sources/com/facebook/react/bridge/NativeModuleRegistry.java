package com.facebook.react.bridge;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p126z.C3257a;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.C3294a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

public class NativeModuleRegistry {
    private final String TAG = NativeModuleRegistry.class.getSimpleName();
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    private Map<String, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder module : this.mModules.values()) {
            arrayList.add(module.getModule());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mModules.entrySet()) {
            if (((ModuleHolder) next.getValue()).isCxxModule()) {
                if (C3257a.f9221b) {
                    String str = this.TAG;
                    ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Registering legacy NativeModule: Cxx NativeModule (name = \"" + ((ModuleHolder) next.getValue()).getName() + "\", className = " + ((ModuleHolder) next.getValue()).getClassName() + ")."));
                }
                arrayList.add(next.getValue());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mModules.entrySet()) {
            if (!((ModuleHolder) next.getValue()).isCxxModule()) {
                if (C3257a.f9221b) {
                    String str = this.TAG;
                    ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Registering legacy NativeModule: Java NativeModule (name = \"" + ((ModuleHolder) next.getValue()).getName() + "\", className = " + ((ModuleHolder) next.getValue()).getClassName() + ")."));
                }
                arrayList.add(new JavaModuleWrapper(jSInstance, (ModuleHolder) next.getValue()));
            }
        }
        return arrayList;
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        C2639a aVar = (C2639a) cls.getAnnotation(C2639a.class);
        if (aVar != null) {
            ModuleHolder moduleHolder = this.mModules.get(aVar.name());
            return ((ModuleHolder) C6409a.m24522d(moduleHolder, aVar.name() + " could not be found. Is it defined in " + cls.getName())).getModule();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in class " + cls.getName());
    }

    public NativeModule getModule(String str) {
        ModuleHolder moduleHolder = this.mModules.get(str);
        return ((ModuleHolder) C6409a.m24522d(moduleHolder, "Could not find module with name " + str)).getModule();
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(((C2639a) cls.getAnnotation(C2639a.class)).name());
    }

    public boolean hasModule(String str) {
        return this.mModules.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        C3294a.m12881c(0, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            for (ModuleHolder destroy : this.mModules.values()) {
                destroy.destroy();
            }
            if (C3257a.f9228i) {
                this.mModules.clear();
            }
        } finally {
            C3294a.m12885g(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        C3294a.m12881c(0, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            for (ModuleHolder markInitializable : this.mModules.values()) {
                markInitializable.markInitializable();
            }
        } finally {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        ModuleHolder moduleHolder = this.mModules.get(UIManagerModule.NAME);
        if (moduleHolder != null && moduleHolder.hasInstance()) {
            ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
        }
    }

    /* access modifiers changed from: package-private */
    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        C6409a.m24520b(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        for (Map.Entry next : nativeModuleRegistry.getModuleMap().entrySet()) {
            String str = (String) next.getKey();
            if (!this.mModules.containsKey(str)) {
                this.mModules.put(str, (ModuleHolder) next.getValue());
            }
        }
    }
}
