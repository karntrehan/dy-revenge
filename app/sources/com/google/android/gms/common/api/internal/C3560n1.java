package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.n1 */
public final class C3560n1 extends BroadcastReceiver {

    /* renamed from: a */
    Context f10031a;

    /* renamed from: b */
    private final C3556m1 f10032b;

    public C3560n1(C3556m1 m1Var) {
        this.f10032b = m1Var;
    }

    /* renamed from: a */
    public final void mo11388a(Context context) {
        this.f10031a = context;
    }

    /* renamed from: b */
    public final synchronized void mo11389b() {
        Context context = this.f10031a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f10031a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f10032b.mo11384a();
            mo11389b();
        }
    }
}
