package com.emeraldsanto.encryptedstorage;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p027c.p096t.p097a.C2092a;
import p027c.p096t.p097a.C2098b;

public class RNEncryptedStorageModule extends ReactContextBaseJavaModule {
    private static final String NATIVE_MODULE_NAME = "RNEncryptedStorage";
    private static final String SHARED_PREFERENCES_FILENAME = "RN_ENCRYPTED_STORAGE_SHARED_PREF";
    private SharedPreferences sharedPreferences;

    public RNEncryptedStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        try {
            this.sharedPreferences = C2092a.m8964a(reactApplicationContext, SHARED_PREFERENCES_FILENAME, new C2098b.C2100b(reactApplicationContext).mo7054c(C2098b.C2101c.AES256_GCM).mo7053a(), C2092a.C2096d.AES256_SIV, C2092a.C2097e.AES256_GCM);
        } catch (Exception e) {
            Log.e(NATIVE_MODULE_NAME, "Failed to create encrypted shared preferences! Failing back to standard SharedPreferences", e);
            this.sharedPreferences = reactApplicationContext.getSharedPreferences(SHARED_PREFERENCES_FILENAME, 0);
        }
    }

    @ReactMethod
    public void clear(Promise promise) {
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        if (sharedPreferences2 == null) {
            promise.reject((Throwable) new NullPointerException("Could not initialize SharedPreferences"));
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.clear();
        if (edit.commit()) {
            promise.resolve((Object) null);
        } else {
            promise.reject((Throwable) new Exception("An error occured while clearing SharedPreferences"));
        }
    }

    @ReactMethod
    public void getItem(String str, Promise promise) {
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        if (sharedPreferences2 == null) {
            promise.reject((Throwable) new NullPointerException("Could not initialize SharedPreferences"));
        } else {
            promise.resolve(sharedPreferences2.getString(str, (String) null));
        }
    }

    public String getName() {
        return NATIVE_MODULE_NAME;
    }

    @ReactMethod
    public void removeItem(String str, Promise promise) {
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        if (sharedPreferences2 == null) {
            promise.reject((Throwable) new NullPointerException("Could not initialize SharedPreferences"));
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.remove(str);
        if (edit.commit()) {
            promise.resolve(str);
            return;
        }
        promise.reject((Throwable) new Exception(String.format("An error occured while removing %s", new Object[]{str})));
    }

    @ReactMethod
    public void setItem(String str, String str2, Promise promise) {
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        if (sharedPreferences2 == null) {
            promise.reject((Throwable) new NullPointerException("Could not initialize SharedPreferences"));
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putString(str, str2);
        if (edit.commit()) {
            promise.resolve(str2);
            return;
        }
        promise.reject((Throwable) new Exception(String.format("An error occurred while saving %s", new Object[]{str})));
    }
}
