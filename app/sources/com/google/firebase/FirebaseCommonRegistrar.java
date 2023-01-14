package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4510r;
import com.google.firebase.p161o.C4917g;
import com.google.firebase.p164r.C4932d;
import com.google.firebase.p164r.C4934f;
import com.google.firebase.p164r.C4936h;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

public class FirebaseCommonRegistrar implements C4510r {
    /* renamed from: a */
    static /* synthetic */ String m17054a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: b */
    static /* synthetic */ String m17055b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: c */
    static /* synthetic */ String m17056c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? HttpUrl.FRAGMENT_ENCODE_SET : "embedded" : "auto" : "watch" : "tv";
    }

    /* renamed from: d */
    static /* synthetic */ String m17057d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m17058e(installerPackageName) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: e */
    private static String m17058e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C4501n<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4932d.m18796b());
        arrayList.add(C4917g.m18762b());
        arrayList.add(C4936h.m18806a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C4936h.m18806a("fire-core", "20.1.1"));
        arrayList.add(C4936h.m18806a("device-name", m17058e(Build.PRODUCT)));
        arrayList.add(C4936h.m18806a("device-model", m17058e(Build.DEVICE)));
        arrayList.add(C4936h.m18806a("device-brand", m17058e(Build.BRAND)));
        arrayList.add(C4936h.m18807b("android-target-sdk", C4821d.f13578a));
        arrayList.add(C4936h.m18807b("android-min-sdk", C4822e.f13579a));
        arrayList.add(C4936h.m18807b("android-platform", C4823f.f13580a));
        arrayList.add(C4936h.m18807b("android-installer", C4481c.f12776a));
        String a = C4934f.m18802a();
        if (a != null) {
            arrayList.add(C4936h.m18806a("kotlin", a));
        }
        return arrayList;
    }
}
