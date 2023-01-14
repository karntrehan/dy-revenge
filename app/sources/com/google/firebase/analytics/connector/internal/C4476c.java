package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.p135a.C3800a;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
final class C4476c implements C3800a.C3801a {

    /* renamed from: a */
    final /* synthetic */ C4477d f12765a;

    public C4476c(C4477d dVar) {
        this.f12765a = dVar;
    }

    /* renamed from: a */
    public final void mo11865a(String str, String str2, Bundle bundle, long j) {
        if (this.f12765a.f12766a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C4475b.m17082a(str2));
            this.f12765a.f12767b.mo14002a(2, bundle2);
        }
    }
}
