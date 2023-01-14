package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.p135a.C3800a;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
final class C4478e implements C3800a.C3801a {

    /* renamed from: a */
    final /* synthetic */ C4479f f12770a;

    public C4478e(C4479f fVar) {
        this.f12770a = fVar;
    }

    /* renamed from: a */
    public final void mo11865a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && C4475b.m17086e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f12770a.f12771a.mo14002a(3, bundle2);
        }
    }
}
