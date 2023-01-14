package com.google.firebase.crashlytics.p139h.p142j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.p139h.C4542f;

/* renamed from: com.google.firebase.crashlytics.h.j.k */
class C4574k {

    /* renamed from: a */
    private final Float f12924a;

    /* renamed from: b */
    private final boolean f12925b;

    private C4574k(Float f, boolean z) {
        this.f12925b = z;
        this.f12924a = f;
    }

    /* renamed from: a */
    public static C4574k m17354a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m17356e(registerReceiver);
                f = m17355d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C4542f.m17259f().mo14107e("An error occurred getting battery state.", e);
        }
        return new C4574k(f, z);
    }

    /* renamed from: d */
    private static Float m17355d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    private static boolean m17356e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float mo14153b() {
        return this.f12924a;
    }

    /* renamed from: c */
    public int mo14154c() {
        Float f;
        if (!this.f12925b || (f = this.f12924a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
