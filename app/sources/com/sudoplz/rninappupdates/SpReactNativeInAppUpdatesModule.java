package com.sudoplz.rninappupdates;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.p109b0.p110a.C2639a;
import com.google.android.play.core.install.C4462b;
import com.google.android.play.core.install.InstallState;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p382e.p383a.p384a.C9074a;
import p174e.p319f.p320a.p382e.p383a.p384a.C9075b;
import p174e.p319f.p320a.p382e.p383a.p384a.C9076c;
import p174e.p319f.p320a.p382e.p383a.p389f.C9156d;

@C2639a(name = "SpInAppUpdates")
public class SpReactNativeInAppUpdatesModule extends ReactContextBaseJavaModule implements C4462b, ActivityEventListener {
    public static int IN_APP_UPDATE_REQUEST_CODE = 42139;
    public static String IN_APP_UPDATE_RESULT_KEY = "in_app_update_result";
    public static String IN_APP_UPDATE_STATUS_KEY = "in_app_update_status";
    public static final String NAME = "SpInAppUpdates";
    private C9075b appUpdateManager = null;
    private boolean subscribedToUpdateStatuses = false;

    public SpReactNativeInAppUpdatesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C9075b a = C9076c.m30256a(reactApplicationContext);
        this.appUpdateManager = a;
        a.mo23055c(this);
        reactApplicationContext.addActivityEventListener(this);
    }

    private void emitToJS(String str, ReadableMap readableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, readableMap);
            } catch (Exception e) {
                Log.wtf("InAppUpdates_EMITTER", "Error sending Event: sp_in_app_updates_" + str, e);
            }
        }
    }

    private void emitToJS(String str, String str2) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, str2);
            } catch (Exception e) {
                Log.wtf("InAppUpdates_EMITTER", "Error sending Event: sp_in_app_updates_" + str, e);
            }
        }
    }

    static /* synthetic */ void lambda$checkNeedsUpdate$1(Promise promise, C9074a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("updateAvailability", aVar.mo23051r());
        createMap.putBoolean("isImmediateUpdateAllowed", aVar.mo23047n(1));
        createMap.putBoolean("isFlexibleUpdateAllowed", aVar.mo23047n(0));
        createMap.putInt("updatePriority", aVar.mo23052s());
        Integer f = aVar.mo23040f();
        if (f != null) {
            createMap.putInt("dayStaleness", f.intValue());
        }
        createMap.putInt("versionCode", aVar.mo23036b());
        String p = aVar.mo23049p();
        if (p != null) {
            createMap.putString("packageName", p);
        }
        long q = aVar.mo23050q();
        if (q >= 0) {
            createMap.putDouble("totalBytes", (double) q);
        }
        promise.resolve(createMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$startUpdate$3 */
    public /* synthetic */ void mo24638a(Promise promise, int i, C9074a aVar) {
        String str;
        if (aVar.mo23051r() != 2) {
            str = "Update unavailable, check checkNeedsUpdate.updateAvailability first";
        } else if (!aVar.mo23047n(i)) {
            str = "Update type unavailable, check checkNeedsUpdate.isImmediateUpdateAllowed or checkNeedsUpdate.isFlexibleUpdateAllowed first.";
        } else {
            try {
                this.appUpdateManager.mo23056d(aVar, i, getCurrentActivity(), IN_APP_UPDATE_REQUEST_CODE);
                promise.resolve("Done");
                return;
            } catch (IntentSender.SendIntentException e) {
                promise.reject("SendIntentException", "Error while starting the update flow: " + e.toString());
                return;
            }
        }
        promise.reject("Error", str);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void checkNeedsUpdate(Promise promise) {
        C9156d<C9074a> b = this.appUpdateManager.mo23054b();
        b.mo23126a(new C9852b(promise));
        b.mo23128c(new C9854d(promise));
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("IN_APP_UPDATE_RESULT_KEY", IN_APP_UPDATE_RESULT_KEY);
        hashMap.put("IN_APP_UPDATE_STATUS_KEY", IN_APP_UPDATE_STATUS_KEY);
        hashMap.put("UPDATE_AVAILABLE", 2);
        hashMap.put("UPDATE_NOT_AVAILABLE", 1);
        hashMap.put("UPDATE_UNKNOWN", 0);
        hashMap.put("UPDATE_DEV_TRIGGERED", 3);
        hashMap.put("INSTALL_STATUS_CANCELED", 6);
        hashMap.put("INSTALL_STATUS_DOWNLOADED", 11);
        hashMap.put("INSTALL_STATUS_DOWNLOADING", 2);
        hashMap.put("INSTALL_STATUS_FAILED", 5);
        hashMap.put("INSTALL_STATUS_INSTALLED", 4);
        hashMap.put("INSTALL_STATUS_INSTALLING", 3);
        hashMap.put("INSTALL_STATUS_PENDING", 1);
        hashMap.put("APP_UPDATE_IMMEDIATE", 1);
        hashMap.put("APP_UPDATE_FLEXIBLE", 0);
        return hashMap;
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void installUpdate() {
        this.appUpdateManager.mo23053a();
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == IN_APP_UPDATE_REQUEST_CODE) {
            emitToJS(IN_APP_UPDATE_RESULT_KEY, String.valueOf(i2 == -1 ? 4 : 6));
        }
    }

    public void onNewIntent(Intent intent) {
    }

    public void onStateUpdate(InstallState installState) {
        if (this.subscribedToUpdateStatuses) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("status", installState.mo13988d());
            createMap.putString("bytesDownloaded", installState.mo13986b() + HttpUrl.FRAGMENT_ENCODE_SET);
            createMap.putString("totalBytesToDownload", installState.mo13990f() + HttpUrl.FRAGMENT_ENCODE_SET);
            emitToJS(IN_APP_UPDATE_STATUS_KEY, (ReadableMap) createMap);
        }
    }

    @ReactMethod
    public void removeListeners(double d) {
    }

    @ReactMethod
    public void setStatusUpdateSubscription(Boolean bool) {
        this.subscribedToUpdateStatuses = bool.booleanValue();
    }

    @ReactMethod
    public void startUpdate(int i, Promise promise) {
        C9156d<C9074a> b = this.appUpdateManager.mo23054b();
        b.mo23126a(new C9851a(promise));
        b.mo23128c(new C9853c(this, promise, i));
    }
}
