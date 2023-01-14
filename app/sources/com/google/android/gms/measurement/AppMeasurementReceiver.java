package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4051t4;
import com.google.android.gms.measurement.internal.C4063u4;
import p027c.p090q.p091a.C2067a;

public final class AppMeasurementReceiver extends C2067a implements C4051t4 {

    /* renamed from: p */
    private C4063u4 f10490p;

    /* renamed from: a */
    public void mo11776a(Context context, Intent intent) {
        C2067a.m8877c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f10490p == null) {
            this.f10490p = new C4063u4(this);
        }
        this.f10490p.mo12441a(context, intent);
    }
}
