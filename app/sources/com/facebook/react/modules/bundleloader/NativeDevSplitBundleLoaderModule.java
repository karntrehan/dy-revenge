package com.facebook.react.modules.bundleloader;

import com.facebook.fbreact.specs.NativeDevSplitBundleLoaderSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.p114j.C2729c;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.p109b0.p110a.C2639a;

@C2639a(name = "DevSplitBundleLoader")
public class NativeDevSplitBundleLoaderModule extends NativeDevSplitBundleLoaderSpec {
    public static final String NAME = "DevSplitBundleLoader";
    private static final String REJECTION_CODE = "E_BUNDLE_LOAD_ERROR";
    private final C2730d mDevSupportManager;

    /* renamed from: com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule$a */
    class C2785a implements C2729c {

        /* renamed from: a */
        final /* synthetic */ Promise f7867a;

        C2785a(Promise promise) {
            this.f7867a = promise;
        }
    }

    public NativeDevSplitBundleLoaderModule(ReactApplicationContext reactApplicationContext, C2730d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
    }

    public String getName() {
        return NAME;
    }

    public void loadBundle(String str, Promise promise) {
        this.mDevSupportManager.mo8900w(str, new C2785a(promise));
    }
}
