package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.C3531h;

/* renamed from: com.google.android.gms.common.internal.i0 */
public abstract class C3676i0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C3676i0 m14290b(Activity activity, Intent intent, int i) {
        return new C3670g0(intent, activity, i);
    }

    /* renamed from: c */
    public static C3676i0 m14291c(C3531h hVar, Intent intent, int i) {
        return new C3673h0(intent, hVar, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11598a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo11598a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
