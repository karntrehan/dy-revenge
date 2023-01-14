package p496io.invertase.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import p496io.invertase.firebase.common.C10663i;
import p496io.invertase.firebase.common.C10664j;
import p496io.invertase.firebase.common.C10665k;
import p496io.invertase.firebase.common.C10666l;

/* renamed from: io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsInitProvider */
public class ReactNativeFirebaseCrashlyticsInitProvider extends C10663i {
    /* renamed from: a */
    static boolean m36333a() {
        boolean b;
        StringBuilder sb;
        String str;
        C10664j f = C10664j.m36298f();
        C10665k d = C10665k.m36305d();
        C10666l f2 = C10666l.m36309f();
        if (f2.mo26567b("crashlytics_auto_collection_enabled")) {
            b = f2.mo26569d("crashlytics_auto_collection_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsCollectionEnabled via RNFBPreferences: ";
        } else if (f.mo26559a("crashlytics_auto_collection_enabled")) {
            b = f.mo26561c("crashlytics_auto_collection_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsCollectionEnabled via RNFBJSON: ";
        } else {
            b = d.mo26565b("crashlytics_auto_collection_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsCollectionEnabled via RNFBMeta: ";
        }
        sb.append(str);
        sb.append(b);
        Log.d("RNFBCrashlyticsInit", sb.toString());
        Log.d("RNFBCrashlyticsInit", "isCrashlyticsCollectionEnabled final value: " + b);
        return b;
    }

    /* renamed from: b */
    static boolean m36334b() {
        boolean b;
        StringBuilder sb;
        String str;
        C10664j f = C10664j.m36298f();
        C10665k d = C10665k.m36305d();
        C10666l f2 = C10666l.m36309f();
        if (f2.mo26567b("crashlytics_javascript_exception_handler_chaining_enabled")) {
            b = f2.mo26569d("crashlytics_javascript_exception_handler_chaining_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBPreferences: ";
        } else if (f.mo26559a("crashlytics_javascript_exception_handler_chaining_enabled")) {
            b = f.mo26561c("crashlytics_javascript_exception_handler_chaining_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBJSON: ";
        } else {
            b = d.mo26565b("crashlytics_javascript_exception_handler_chaining_enabled", true);
            sb = new StringBuilder();
            str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBMeta: ";
        }
        sb.append(str);
        sb.append(b);
        Log.d("RNFBCrashlyticsInit", sb.toString());
        Log.d("RNFBCrashlyticsInit", "isCrashlyticsJavascriptExceptionHandlerChainingEnabled final value: " + b);
        return b;
    }

    /* renamed from: c */
    static boolean m36335c() {
        boolean b;
        StringBuilder sb;
        String str;
        C10664j f = C10664j.m36298f();
        C10665k d = C10665k.m36305d();
        C10666l f2 = C10666l.m36309f();
        if (f2.mo26567b("crashlytics_is_error_generation_on_js_crash_enabled")) {
            b = f2.mo26569d("crashlytics_is_error_generation_on_js_crash_enabled", true);
            sb = new StringBuilder();
            str = "isErrorGenerationOnJSCrashEnabled via RNFBPreferences: ";
        } else if (f.mo26559a("crashlytics_is_error_generation_on_js_crash_enabled")) {
            b = f.mo26561c("crashlytics_is_error_generation_on_js_crash_enabled", true);
            sb = new StringBuilder();
            str = "isErrorGenerationOnJSCrashEnabled via RNFBJSON: ";
        } else {
            b = d.mo26565b("crashlytics_is_error_generation_on_js_crash_enabled", true);
            sb = new StringBuilder();
            str = "isErrorGenerationOnJSCrashEnabled via RNFBMeta: ";
        }
        sb.append(str);
        sb.append(b);
        Log.d("RNFBCrashlyticsInit", sb.toString());
        Log.d("RNFBCrashlyticsInit", "isErrorGenerationOnJSCrashEnabled final value: " + b);
        return b;
    }

    public boolean onCreate() {
        super.onCreate();
        try {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(m36333a());
            Log.i("RNFBCrashlyticsInit", "initialization successful");
            return true;
        } catch (Exception e) {
            Log.e("RNFBCrashlyticsInit", "initialization failed", e);
            return false;
        }
    }
}
