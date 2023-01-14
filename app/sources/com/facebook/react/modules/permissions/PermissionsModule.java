package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.ArrayList;

@C2639a(name = "PermissionsAndroid")
public class PermissionsModule extends NativePermissionsAndroidSpec implements C2803f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED = "denied";
    private final String GRANTED = "granted";
    private final String NEVER_ASK_AGAIN = "never_ask_again";
    private final SparseArray<Callback> mCallbacks = new SparseArray<>();
    private int mRequestCode = 0;

    /* renamed from: com.facebook.react.modules.permissions.PermissionsModule$a */
    class C2859a implements Callback {

        /* renamed from: a */
        final /* synthetic */ Promise f8032a;

        /* renamed from: b */
        final /* synthetic */ String f8033b;

        C2859a(Promise promise, String str) {
            this.f8032a = promise;
            this.f8033b = str;
        }

        public void invoke(Object... objArr) {
            Promise promise;
            String str;
            int[] iArr = objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                promise = this.f8032a;
                str = "granted";
            } else if (objArr[1].shouldShowRequestPermissionRationale(this.f8033b)) {
                promise = this.f8032a;
                str = "denied";
            } else {
                promise = this.f8032a;
                str = "never_ask_again";
            }
            promise.resolve(str);
        }
    }

    /* renamed from: com.facebook.react.modules.permissions.PermissionsModule$b */
    class C2860b implements Callback {

        /* renamed from: a */
        final /* synthetic */ ArrayList f8035a;

        /* renamed from: b */
        final /* synthetic */ WritableMap f8036b;

        /* renamed from: c */
        final /* synthetic */ Promise f8037c;

        C2860b(ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f8035a = arrayList;
            this.f8036b = writableMap;
            this.f8037c = promise;
        }

        public void invoke(Object... objArr) {
            String str;
            WritableMap writableMap;
            int[] iArr = objArr[0];
            C2802e eVar = objArr[1];
            for (int i = 0; i < this.f8035a.size(); i++) {
                String str2 = (String) this.f8035a.get(i);
                if (iArr.length > 0 && iArr[i] == 0) {
                    writableMap = this.f8036b;
                    str = "granted";
                } else if (eVar.shouldShowRequestPermissionRationale(str2)) {
                    writableMap = this.f8036b;
                    str = "denied";
                } else {
                    writableMap = this.f8036b;
                    str = "never_ask_again";
                }
                writableMap.putString(str2, str);
            }
            this.f8037c.resolve(this.f8036b);
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
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

    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23 ? baseContext.checkSelfPermission(str) != 0 : baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            z = false;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    public String getName() {
        return NAME;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }

    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            String str = "granted";
            if (Build.VERSION.SDK_INT < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    str = "denied";
                }
            } else if (baseContext.checkSelfPermission(string) != 0) {
                arrayList.add(string);
            }
            writableNativeMap.putString(string, str);
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            C2802e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new C2860b(arrayList, writableNativeMap, promise));
            permissionAwareActivity.mo8378i((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }

    public void requestPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        String str2 = "granted";
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                str2 = "denied";
            }
            promise.resolve(str2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve(str2);
        } else {
            try {
                C2802e permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new C2859a(promise, str));
                permissionAwareActivity.mo8378i(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e) {
                promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
            }
        }
    }

    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 23) {
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
