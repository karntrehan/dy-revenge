package com.reactnativecommunity.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.p109b0.p110a.C2639a;
import com.reactnativecommunity.netinfo.C5252b;

@C2639a(name = "RNCNetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule implements C5252b.C5254b {
    public static final String NAME = "RNCNetInfo";
    private final C5252b mAmazonConnectivityChecker;
    private final C5260d mConnectivityReceiver;
    private int numberOfListeners = 0;

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mConnectivityReceiver = Build.VERSION.SDK_INT >= 24 ? new C5263g(reactApplicationContext) : new C5257c(reactApplicationContext);
        this.mAmazonConnectivityChecker = new C5252b(reactApplicationContext, this);
    }

    @ReactMethod
    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.f14796e = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.mo15889d(str, promise);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        this.mConnectivityReceiver.mo15882g();
        this.mAmazonConnectivityChecker.mo15878g();
    }

    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        this.mConnectivityReceiver.mo15892i(z);
    }

    public void onCatalystInstanceDestroy() {
        this.mAmazonConnectivityChecker.mo15879k();
        this.mConnectivityReceiver.mo15883j();
        this.mConnectivityReceiver.f14796e = false;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        int intValue = this.numberOfListeners - num.intValue();
        this.numberOfListeners = intValue;
        if (intValue == 0) {
            this.mConnectivityReceiver.f14796e = false;
        }
    }
}
