package com.reactnativeimageresizer;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ImageResizerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ImageResizer";
    private Context context;

    public ImageResizerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
    }

    @ReactMethod
    public void createResizedImage(String str, double d, double d2, String str2, double d3, String str3, boolean z, Double d4, String str4, Boolean bool, Promise promise) {
        C5337c.m19784b(str, d, d2, str2, d3, d4, str4, bool, str3, Boolean.valueOf(z), promise, this.context, getReactApplicationContext());
    }

    public String getName() {
        return NAME;
    }
}
