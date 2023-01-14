package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p406d.p407a.p409c.C9606i;

public class MlKitInitProvider extends ContentProvider {
    public final void attachInfo(@RecentlyNonNull Context context, @RecentlyNonNull ProviderInfo providerInfo) {
        C3705r.m14350o(!providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"), "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
    }

    public final int delete(@RecentlyNonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @RecentlyNullable
    public final String getType(@RecentlyNonNull Uri uri) {
        return null;
    }

    @RecentlyNullable
    public final Uri insert(@RecentlyNonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        C9606i.m32709d(context);
        return false;
    }

    @RecentlyNullable
    public final Cursor query(@RecentlyNonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(@RecentlyNonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
