package com.zoontek.rnpermissions;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import androidx.core.app.C1127l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.ArrayList;

@C2639a(name = "RNPermissions")
public class RNPermissionsModule extends ReactContextBaseJavaModule implements C2803f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String MODULE_NAME = "RNPermissions";
    private static final String SETTING_NAME = "@RNPermissions:NonRequestables";
    private final String BLOCKED = "blocked";
    private final String DENIED = "denied";
    private final String GRANTED = "granted";
    private final String UNAVAILABLE = "unavailable";
    private int mRequestCode = 0;
    private final SparseArray<C10189c> mRequests;
    /* access modifiers changed from: private */
    public final SharedPreferences mSharedPrefs;

    /* renamed from: com.zoontek.rnpermissions.RNPermissionsModule$a */
    class C10187a implements Callback {

        /* renamed from: a */
        final /* synthetic */ Promise f27279a;

        /* renamed from: b */
        final /* synthetic */ String f27280b;

        C10187a(Promise promise, String str) {
            this.f27279a = promise;
            this.f27280b = str;
        }

        @SuppressLint({"ApplySharedPref"})
        public void invoke(Object... objArr) {
            Promise promise;
            String str;
            int[] iArr = objArr[0];
            if (iArr.length <= 0 || iArr[0] != 0) {
                C2802e eVar = objArr[1];
                if (!objArr[2][0] || eVar.shouldShowRequestPermissionRationale(this.f27280b)) {
                    promise = this.f27279a;
                    str = "denied";
                } else {
                    RNPermissionsModule.this.mSharedPrefs.edit().putBoolean(this.f27280b, true).commit();
                    promise = this.f27279a;
                    str = "blocked";
                }
            } else {
                promise = this.f27279a;
                str = "granted";
            }
            promise.resolve(str);
        }
    }

    /* renamed from: com.zoontek.rnpermissions.RNPermissionsModule$b */
    class C10188b implements Callback {

        /* renamed from: a */
        final /* synthetic */ ArrayList f27282a;

        /* renamed from: b */
        final /* synthetic */ WritableMap f27283b;

        /* renamed from: c */
        final /* synthetic */ Promise f27284c;

        C10188b(ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f27282a = arrayList;
            this.f27283b = writableMap;
            this.f27284c = promise;
        }

        @SuppressLint({"ApplySharedPref"})
        public void invoke(Object... objArr) {
            String str;
            WritableMap writableMap;
            int[] iArr = objArr[0];
            C2802e eVar = objArr[1];
            boolean[] zArr = objArr[2];
            for (int i = 0; i < this.f27282a.size(); i++) {
                String str2 = (String) this.f27282a.get(i);
                if (iArr.length > 0 && iArr[i] == 0) {
                    writableMap = this.f27283b;
                    str = "granted";
                } else if (!zArr[i] || eVar.shouldShowRequestPermissionRationale(str2)) {
                    writableMap = this.f27283b;
                    str = "denied";
                } else {
                    RNPermissionsModule.this.mSharedPrefs.edit().putBoolean(str2, true).commit();
                    writableMap = this.f27283b;
                    str = "blocked";
                }
                writableMap.putString(str2, str);
            }
            this.f27284c.resolve(this.f27283b);
        }
    }

    /* renamed from: com.zoontek.rnpermissions.RNPermissionsModule$c */
    private class C10189c {

        /* renamed from: a */
        public boolean[] f27286a;

        /* renamed from: b */
        public Callback f27287b;

        public C10189c(boolean[] zArr, Callback callback) {
            this.f27286a = zArr;
            this.f27287b = callback;
        }
    }

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mSharedPrefs = reactApplicationContext.getSharedPreferences(SETTING_NAME, 0);
        this.mRequests = new SparseArray<>();
    }

    private String getFieldName(String str) {
        if (str.equals("android.permission.ACCEPT_HANDOVER")) {
            return "ACCEPT_HANDOVER";
        }
        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return "ACCESS_BACKGROUND_LOCATION";
        }
        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
            return "ACCESS_COARSE_LOCATION";
        }
        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
            return "ACCESS_FINE_LOCATION";
        }
        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
            return "ACCESS_MEDIA_LOCATION";
        }
        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
            return "ADD_VOICEMAIL";
        }
        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
            return "ACTIVITY_RECOGNITION";
        }
        if (str.equals("android.permission.ANSWER_PHONE_CALLS")) {
            return "ANSWER_PHONE_CALLS";
        }
        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
            return "BLUETOOTH_ADVERTISE";
        }
        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
            return "BLUETOOTH_CONNECT";
        }
        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
            return "BLUETOOTH_SCAN";
        }
        if (str.equals("android.permission.BODY_SENSORS")) {
            return "BODY_SENSORS";
        }
        if (str.equals("android.permission.CALL_PHONE")) {
            return "CALL_PHONE";
        }
        if (str.equals("android.permission.CAMERA")) {
            return "CAMERA";
        }
        if (str.equals("android.permission.GET_ACCOUNTS")) {
            return "GET_ACCOUNTS";
        }
        if (str.equals("android.permission.PROCESS_OUTGOING_CALLS")) {
            return "PROCESS_OUTGOING_CALLS";
        }
        if (str.equals("android.permission.READ_CALENDAR")) {
            return "READ_CALENDAR";
        }
        if (str.equals("android.permission.READ_CALL_LOG")) {
            return "READ_CALL_LOG";
        }
        if (str.equals("android.permission.READ_CONTACTS")) {
            return "READ_CONTACTS";
        }
        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
            return "READ_EXTERNAL_STORAGE";
        }
        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
            return "READ_PHONE_NUMBERS";
        }
        if (str.equals("android.permission.READ_PHONE_STATE")) {
            return "READ_PHONE_STATE";
        }
        if (str.equals("android.permission.READ_SMS")) {
            return "READ_SMS";
        }
        if (str.equals("android.permission.RECEIVE_MMS")) {
            return "RECEIVE_MMS";
        }
        if (str.equals("android.permission.RECEIVE_SMS")) {
            return "RECEIVE_SMS";
        }
        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
            return "RECEIVE_WAP_PUSH";
        }
        if (str.equals("android.permission.RECORD_AUDIO")) {
            return "RECORD_AUDIO";
        }
        if (str.equals("android.permission.SEND_SMS")) {
            return "SEND_SMS";
        }
        if (str.equals("android.permission.USE_SIP")) {
            return "USE_SIP";
        }
        if (str.equals("android.permission.WRITE_CALENDAR")) {
            return "WRITE_CALENDAR";
        }
        if (str.equals("android.permission.WRITE_CALL_LOG")) {
            return "WRITE_CALL_LOG";
        }
        if (str.equals("android.permission.WRITE_CONTACTS")) {
            return "WRITE_CONTACTS";
        }
        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            return "WRITE_EXTERNAL_STORAGE";
        }
        return null;
    }

    private C2802e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof C2802e) {
            return (C2802e) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private boolean permissionExists(String str) {
        String fieldName = getFieldName(str);
        if (fieldName == null) {
            return false;
        }
        try {
            Manifest.permission.class.getField(fieldName);
            return true;
        } catch (NoSuchFieldException unused) {
            return false;
        }
    }

    @ReactMethod
    public void checkMultiplePermissions(ReadableArray readableArray, Promise promise) {
        String str;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = getReactApplicationContext().getBaseContext();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (!permissionExists(string)) {
                str = "unavailable";
            } else {
                String str2 = "blocked";
                if (Build.VERSION.SDK_INT < 23) {
                    if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) == 0) {
                        str2 = "granted";
                    }
                } else if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, "granted");
                } else if (!this.mSharedPrefs.getBoolean(string, false)) {
                    str = "denied";
                }
                writableNativeMap.putString(string, str2);
            }
            writableNativeMap.putString(string, str);
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void checkNotifications(Promise promise) {
        boolean a = C1127l.m4384b(getReactApplicationContext()).mo3595a();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putString("status", a ? "granted" : "blocked");
        createMap.putMap("settings", createMap2);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        if (str == null || !permissionExists(str)) {
            promise.resolve("unavailable");
            return;
        }
        Context baseContext = getReactApplicationContext().getBaseContext();
        String str2 = "blocked";
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                str2 = "granted";
            }
            promise.resolve(str2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve("granted");
        } else if (this.mSharedPrefs.getBoolean(str, false)) {
            promise.resolve(str2);
        } else {
            promise.resolve("denied");
        }
    }

    public String getName() {
        return MODULE_NAME;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C10189c cVar = this.mRequests.get(i);
        cVar.f27287b.invoke(iArr, getPermissionAwareActivity(), cVar.f27286a);
        this.mRequests.remove(i);
        return this.mRequests.size() == 0;
    }

    @ReactMethod
    public void openSettings(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent intent = new Intent();
            String packageName = reactApplicationContext.getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", packageName, (String) null));
            reactApplicationContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            if (!permissionExists(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else {
                String str = "blocked";
                if (Build.VERSION.SDK_INT < 23) {
                    if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) == 0) {
                        str = "granted";
                    }
                } else if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, "granted");
                } else if (!this.mSharedPrefs.getBoolean(string, false)) {
                    arrayList.add(string);
                }
                writableNativeMap.putString(string, str);
            }
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            C2802e permissionAwareActivity = getPermissionAwareActivity();
            boolean[] zArr = new boolean[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                zArr[i3] = permissionAwareActivity.shouldShowRequestPermissionRationale((String) arrayList.get(i3));
            }
            this.mRequests.put(this.mRequestCode, new C10189c(zArr, new C10188b(arrayList, writableNativeMap, promise)));
            permissionAwareActivity.mo8378i((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }

    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        if (str == null || !permissionExists(str)) {
            promise.resolve("unavailable");
            return;
        }
        Context baseContext = getReactApplicationContext().getBaseContext();
        String str2 = "blocked";
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                str2 = "granted";
            }
            promise.resolve(str2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve("granted");
        } else if (this.mSharedPrefs.getBoolean(str, false)) {
            promise.resolve(str2);
        } else {
            try {
                C2802e permissionAwareActivity = getPermissionAwareActivity();
                this.mRequests.put(this.mRequestCode, new C10189c(new boolean[]{permissionAwareActivity.shouldShowRequestPermissionRationale(str)}, new C10187a(promise, str)));
                permissionAwareActivity.mo8378i(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e) {
                promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
            }
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (str == null || Build.VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }
}
