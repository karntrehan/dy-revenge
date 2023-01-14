package p496io.invertase.firebase.app;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.C4825h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p496io.invertase.firebase.common.C10660f;
import p496io.invertase.firebase.common.C10661g;
import p496io.invertase.firebase.common.C10662h;
import p496io.invertase.firebase.common.C10664j;
import p496io.invertase.firebase.common.C10665k;
import p496io.invertase.firebase.common.C10666l;
import p496io.invertase.firebase.common.ReactNativeFirebaseModule;

/* renamed from: io.invertase.firebase.app.ReactNativeFirebaseAppModule */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";

    ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        C4825h m = C4825h.m18438m(str);
        if (m != null) {
            m.mo14730g();
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        C10662h.m36283e().mo26543a(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(C10662h.m36283e().mo26545d());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        C10662h.m36283e().mo26549m(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        C10662h.m36283e().mo26551o(new C10661g(str, C10660f.m36279d(readableMap)));
        promise.resolve(C10660f.m36279d(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        C10662h.m36283e().mo26550n(str, bool);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C4825h a : C4825h.m18436k(getReactApplicationContext())) {
            arrayList.add(C10660f.m36276a(a));
        }
        hashMap.put("NATIVE_FIREBASE_APPS", arrayList);
        hashMap.put("FIREBASE_RAW_JSON", C10664j.m36298f().mo26563e());
        return hashMap;
    }

    public void initialize() {
        super.initialize();
        C10662h.m36283e().mo26544b(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        promise.resolve(C10660f.m36277b(C10660f.m36278c(readableMap, readableMap2, getContext())));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(C10664j.m36298f().mo26560b());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(C10665k.m36305d().mo26564a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        C10666l.m36309f().mo26566a();
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(C10666l.m36309f().mo26568c());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z, Promise promise) {
        C10666l.m36309f().mo26570g(str, z);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        C10666l.m36309f().mo26571h(str, str2);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        C4825h.m18438m(str).mo14726E(bool);
    }
}
