package p496io.invertase.firebase.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p496io.invertase.firebase.app.C10652a;

/* renamed from: io.invertase.firebase.common.k */
public class C10665k {

    /* renamed from: a */
    private static C10665k f28143a = new C10665k();

    /* renamed from: c */
    private Bundle m36304c() {
        ApplicationInfo applicationInfo;
        try {
            Context a = C10652a.m36272a();
            PackageManager packageManager = a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static C10665k m36305d() {
        return f28143a;
    }

    /* renamed from: a */
    public WritableMap mo26564a() {
        Bundle c = m36304c();
        WritableMap createMap = Arguments.createMap();
        if (c == null) {
            return createMap;
        }
        for (String str : c.keySet()) {
            if (str.startsWith("rnfirebase_")) {
                Object obj = c.get(str);
                if (obj == null) {
                    createMap.putNull(str);
                } else if (obj instanceof String) {
                    createMap.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(str, ((Boolean) obj).booleanValue());
                }
            }
        }
        return createMap;
    }

    /* renamed from: b */
    public boolean mo26565b(String str, boolean z) {
        Bundle c = m36304c();
        if (c == null) {
            return z;
        }
        return c.getBoolean("rnfirebase_" + str, z);
    }
}
