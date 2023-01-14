package p496io.invertase.firebase.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p496io.invertase.firebase.app.C10652a;
import p496io.invertase.firebase.common.ReactNativeFirebaseModule;

/* renamed from: io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule */
public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
    private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
    private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
    private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
    private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
    private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
    private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
    private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
    private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
    private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
    private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
    private static final String TAG = "Utils";

    public ReactNativeFirebaseUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private WritableMap getPlayServicesStatusMap() {
        WritableMap createMap = Arguments.createMap();
        C3629e q = C3629e.m14086q();
        int i = q.mo11484i(getContext());
        createMap.putInt("status", i);
        if (i == 0) {
            createMap.putBoolean("isAvailable", true);
        } else {
            createMap.putBoolean("isAvailable", false);
            createMap.putString("error", q.mo11483g(i));
            createMap.putBoolean("isUserResolvableError", q.mo11486m(i));
            createMap.putBoolean("hasResolution", new C3623b(i).mo11457C());
        }
        return createMap;
    }

    private int isGooglePlayServicesAvailable() {
        return C3629e.m14086q().mo11484i(getContext());
    }

    private static Boolean isRunningInTestLab() {
        return Boolean.valueOf("true".equals(Settings.System.getString(C10652a.m36272a().getContentResolver(), FIREBASE_TEST_LAB)));
    }

    @ReactMethod
    public void androidGetPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void androidMakePlayServicesAvailable() {
        Activity activity;
        if (isGooglePlayServicesAvailable() != 0 && (activity = getActivity()) != null) {
            C3629e.m14086q().mo11490r(activity);
        }
    }

    @ReactMethod
    public void androidPromptForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        C3629e q = C3629e.m14086q();
        if (isGooglePlayServicesAvailable != 0 && q.mo11486m(isGooglePlayServicesAvailable) && (activity = getActivity()) != null) {
            q.mo11487n(activity, isGooglePlayServicesAvailable, isGooglePlayServicesAvailable).show();
        }
    }

    @ReactMethod
    public void androidResolutionForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        C3623b bVar = new C3623b(isGooglePlayServicesAvailable);
        if (!bVar.mo11458E() && bVar.mo11457C() && (activity = getActivity()) != null) {
            try {
                bVar.mo11459G(activity, isGooglePlayServicesAvailable);
            } catch (IntentSender.SendIntentException e) {
                Log.d(TAG, "resolutionForPlayServices", e);
            }
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isRunningInTestLab", isRunningInTestLab());
        hashMap.put("androidPlayServices", getPlayServicesStatusMap());
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        hashMap.put(KEY_MAIN_BUNDLE, HttpUrl.FRAGMENT_ENCODE_SET);
        hashMap.put(KEY_LIBRARY_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put(KEY_TEMP_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put(KEY_CACHE_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        File externalFilesDir = reactApplicationContext.getExternalFilesDir((String) null);
        if (Build.VERSION.SDK_INT >= 19) {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, externalFilesDir != null ? externalFilesDir.getAbsolutePath() : reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        if (!hashMap.containsKey(KEY_DOCUMENT_DIRECTORY)) {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        hashMap.put(KEY_PICS_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(KEY_MOVIES_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(KEY_EXT_STORAGE_DIRECTORY, externalStorageDirectory.getAbsolutePath());
        }
        if (externalFilesDir != null) {
            hashMap.put(KEY_EXTERNAL_DIRECTORY, externalFilesDir.getAbsolutePath());
        }
        return hashMap;
    }
}
