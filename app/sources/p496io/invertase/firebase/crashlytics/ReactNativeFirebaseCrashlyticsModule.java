package p496io.invertase.firebase.crashlytics;

import android.os.Handler;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p496io.invertase.firebase.common.C10666l;
import p496io.invertase.firebase.common.ReactNativeFirebaseModule;

/* renamed from: io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule */
public class ReactNativeFirebaseCrashlyticsModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Crashlytics";

    /* renamed from: io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule$a */
    class C10669a implements Runnable {
        C10669a() {
        }

        public void run() {
            throw new RuntimeException("Crash Test");
        }
    }

    ReactNativeFirebaseCrashlyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    static /* synthetic */ void lambda$checkForUnsentReports$0(Promise promise, C8963l lVar) {
        String message;
        if (!lVar.mo22779o()) {
            message = lVar.mo22775k() != null ? lVar.mo22775k().getMessage() : "checkForUnsentReports() request error";
        } else if (lVar.mo22776l() != null) {
            promise.resolve(lVar.mo22776l());
            return;
        } else {
            message = "Unknown result of check for unsent reports";
        }
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", message);
    }

    private Exception recordJavaScriptError(ReadableMap readableMap) {
        String string = readableMap.getString("message");
        ReadableArray array = readableMap.getArray("frames");
        Objects.requireNonNull(array);
        ReadableArray readableArray = array;
        Exception dVar = readableMap.getBoolean("isUnhandledRejection") ? new C10673d(string) : new C10671b(string);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            Objects.requireNonNull(map);
            ReadableMap readableMap2 = map;
            stackTraceElementArr[i] = new StackTraceElement(HttpUrl.FRAGMENT_ENCODE_SET, readableMap2.getString("fn"), readableMap2.getString("file"), -1);
        }
        dVar.setStackTrace(stackTraceElementArr);
        FirebaseCrashlytics.getInstance().recordException(dVar);
        return dVar;
    }

    @ReactMethod
    public void checkForUnsentReports(Promise promise) {
        FirebaseCrashlytics.getInstance().checkForUnsentReports().mo22766b(new C10670a(promise));
    }

    @ReactMethod
    public void crash() {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            new Handler().postDelayed(new C10669a(), 50);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
    }

    @ReactMethod
    public void crashWithStackPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            recordJavaScriptError(readableMap).printStackTrace(System.err);
            Log.e(TAG, "Crash logged. Terminating app.");
            System.exit(0);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void deleteUnsentReports() {
        FirebaseCrashlytics.getInstance().deleteUnsentReports();
    }

    @ReactMethod
    public void didCrashOnPreviousExecution(Promise promise) {
        promise.resolve(Boolean.valueOf(FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()));
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.m36333a()));
        hashMap.put("isErrorGenerationOnJSCrashEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.m36335c()));
        hashMap.put("isCrashlyticsJavascriptExceptionHandlerChainingEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.m36334b()));
        return hashMap;
    }

    @ReactMethod
    public void log(String str) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
    }

    @ReactMethod
    public void logPromise(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void recordError(ReadableMap readableMap) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            recordJavaScriptError(readableMap);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
    }

    @ReactMethod
    public void recordErrorPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            recordJavaScriptError(readableMap);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void sendUnsentReports() {
        FirebaseCrashlytics.getInstance().sendUnsentReports();
    }

    @ReactMethod
    public void setAttribute(String str, String str2, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                instance.setCustomKey(nextKey, readableMap.getString(nextKey));
            }
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setCrashlyticsCollectionEnabled(Boolean bool, Promise promise) {
        C10666l.m36309f().mo26570g("crashlytics_auto_collection_enabled", bool.booleanValue());
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.m36333a()) {
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
        promise.resolve((Object) null);
    }
}
