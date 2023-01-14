package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p133n.C3746c;

/* renamed from: com.google.android.gms.common.internal.d1 */
public final class C3662d1 {

    /* renamed from: a */
    private static final Object f10274a = new Object();

    /* renamed from: b */
    private static boolean f10275b;

    /* renamed from: c */
    private static String f10276c;

    /* renamed from: d */
    private static int f10277d;

    /* renamed from: a */
    public static int m14243a(Context context) {
        m14244b(context);
        return f10277d;
    }

    /* renamed from: b */
    private static void m14244b(Context context) {
        synchronized (f10274a) {
            if (!f10275b) {
                f10275b = true;
                try {
                    Bundle bundle = C3746c.m14493a(context).mo11717b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f10276c = bundle.getString("com.google.app.id");
                        f10277d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
