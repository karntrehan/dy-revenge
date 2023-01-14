package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.p139h.C4542f;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class JniNativeApi implements C4815f {

    /* renamed from: a */
    private static final boolean f13544a;

    /* renamed from: b */
    private static final FilenameFilter f13545b = C4811c.f13553a;

    /* renamed from: c */
    private final Context f13546c;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            C4542f f = C4542f.m17259f();
            f.mo14106d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e.getLocalizedMessage());
            z = false;
        }
        f13544a = z;
    }

    public JniNativeApi(Context context) {
        this.f13546c = context;
    }

    @TargetApi(21)
    /* renamed from: b */
    public static void m18371b(List<String> list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", new Object[]{m18373d(packageInfo)}));
        if (!file.exists()) {
            C4542f.m17259f().mo14104b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(f13545b);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        C4542f.m17259f().mo14104b("Found " + listFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : listFiles) {
            C4542f.m17259f().mo14104b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    /* renamed from: c */
    private static int m18372c() {
        return Build.VERSION.SDK_INT >= 24 ? 9216 : 1024;
    }

    /* renamed from: d */
    private static String m18373d(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    /* renamed from: e */
    public static boolean m18374e() {
        return Build.VERSION.SDK_INT >= 21;
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    /* renamed from: a */
    public boolean mo14706a(String str, AssetManager assetManager) {
        String[] g = mo14707g(Build.CPU_ABI);
        if (g.length < 2) {
            return false;
        }
        String str2 = g[0];
        String str3 = g[1];
        if (!f13544a) {
            return false;
        }
        return nativeInit(new String[]{str2, str3, str}, assetManager);
    }

    /* renamed from: g */
    public String[] mo14707g(String str) {
        String path;
        try {
            PackageInfo packageInfo = this.f13546c.getPackageManager().getPackageInfo(this.f13546c.getPackageName(), m18372c());
            ArrayList<String> arrayList = new ArrayList<>(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (m18374e()) {
                m18371b(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    path = new File(parentFile, "arm64").getPath();
                } else if (str.startsWith("arm")) {
                    path = new File(parentFile, "arm").getPath();
                }
                arrayList2.add(path);
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e) {
            C4542f.m17259f().mo14107e("Unable to compose package paths", e);
            throw new RuntimeException(e);
        }
    }
}
