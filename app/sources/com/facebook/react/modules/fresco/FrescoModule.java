package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.C2837a;
import com.facebook.react.modules.network.C2839c;
import com.facebook.react.modules.network.C2848g;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p274h.p275a.p276a.C6142c;
import p174e.p247e.p294k.p297b.p298a.C6259a;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p302f.C6331i;

@C2639a(name = "FrescoModule", needsEagerInit = true)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private C6331i mConfig;
    private C6327h mImagePipeline;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, (C6331i) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C6327h hVar, boolean z) {
        this(reactApplicationContext, z);
        this.mImagePipeline = hVar;
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, (C6331i) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, C6331i iVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = iVar;
    }

    private static C6331i getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).mo18763K();
    }

    public static C6331i.C6333b getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new C2821c());
        OkHttpClient a = C2848g.m11298a();
        ((C2837a) a.cookieJar()).mo9208b(new JavaNetCookieJar(new C2839c(reactContext)));
        return C6259a.m23726a(reactContext.getApplicationContext(), a).mo18765M(new C2820b(a)).mo18764L(false).mo18766N(hashSet);
    }

    private C6327h getImagePipeline() {
        if (this.mImagePipeline == null) {
            this.mImagePipeline = C6142c.m23126a();
        }
        return this.mImagePipeline;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        getImagePipeline().mo18708a();
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            C6142c.m23128c(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            C6071a.m22859G("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            getImagePipeline().mo18710c();
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }
}
