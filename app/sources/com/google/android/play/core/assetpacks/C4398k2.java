package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.k2 */
final class C4398k2 {

    /* renamed from: a */
    private final Context f12540a;

    public C4398k2(Context context) {
        this.f12540a = context;
    }

    /* renamed from: b */
    static String m16875b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo13891a() {
        return this.f12540a;
    }
}
