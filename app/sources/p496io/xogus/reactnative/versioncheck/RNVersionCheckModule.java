package p496io.xogus.reactnative.versioncheck;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.xogus.reactnative.versioncheck.RNVersionCheckModule */
public class RNVersionCheckModule extends ReactContextBaseJavaModule {
    private final String packageName;
    private final ReactApplicationContext reactContext;

    public RNVersionCheckModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.packageName = reactApplicationContext.getPackageName();
    }

    private String getCountry() {
        return getReactApplicationContext().getResources().getConfiguration().locale.getCountry();
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("packageName", this.packageName);
        hashMap.put("country", getCountry());
        try {
            PackageInfo packageInfo = this.reactContext.getPackageManager().getPackageInfo(this.packageName, 0);
            hashMap.put("currentVersion", packageInfo.versionName);
            hashMap.put("currentBuildNumber", Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            hashMap.put("currentVersion", (Object) null);
            hashMap.put("currentBuildNumber", (Object) null);
        }
        return hashMap;
    }

    public String getName() {
        return "RNVersionCheck";
    }
}
