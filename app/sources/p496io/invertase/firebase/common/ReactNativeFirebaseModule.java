package p496io.invertase.firebase.common;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: io.invertase.firebase.common.ReactNativeFirebaseModule */
public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule {
    private final C10668n executorService = new C10668n(getName());
    private String moduleName;

    public ReactNativeFirebaseModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString("message", str2);
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString("message", str2);
        createMap.putString("nativeErrorMessage", str3);
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithExceptionMap(Promise promise, Exception exc) {
        promise.reject((Throwable) exc, C10667m.m36317b(exc));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getApplicationContext() {
        return getReactApplicationContext().getApplicationContext();
    }

    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public ReactContext getContext() {
        return getReactApplicationContext();
    }

    public final ExecutorService getExecutor() {
        return this.executorService.mo26572a();
    }

    public String getName() {
        return "RNFB" + this.moduleName + "Module";
    }

    public final ExecutorService getTransactionalExecutor() {
        return this.executorService.mo26575e();
    }

    public final ExecutorService getTransactionalExecutor(String str) {
        return this.executorService.mo26576f(str);
    }

    public void initialize() {
        super.initialize();
    }

    public void onCatalystInstanceDestroy() {
        this.executorService.mo26579j();
    }

    public final void removeEventListeningExecutor(String str) {
        this.executorService.mo26578i(this.executorService.mo26574c(true, str));
    }
}
