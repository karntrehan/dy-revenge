package com.proyecto26.inappbrowser;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p109b0.p110a.C2639a;

@C2639a(name = "RNInAppBrowser")
public class RNInAppBrowserModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNInAppBrowser";
    private final C5211c inAppBrowser = new C5211c();
    private final ReactApplicationContext reactContext;

    public RNInAppBrowserModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void close() {
        this.inAppBrowser.mo15801b();
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void isAvailable(Promise promise) {
        this.inAppBrowser.mo15802e(this.reactContext, promise);
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        this.inAppBrowser.mo15803f(this.reactContext, readableMap, promise, getCurrentActivity());
    }
}
