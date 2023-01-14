package p496io.invertase.firebase.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import p496io.invertase.firebase.app.C10652a;

/* renamed from: io.invertase.firebase.common.i */
public class C10663i extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        if (C10652a.m36272a() != null) {
            return false;
        }
        Context context = getContext();
        if (!(context == null || context.getApplicationContext() == null)) {
            context = context.getApplicationContext();
        }
        C10652a.m36273b(context);
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
