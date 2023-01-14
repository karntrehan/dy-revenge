package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
public final class C3889g4 extends C3843ca {
    public C3889g4(C4009pa paVar) {
        super(paVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo11970m() {
        mo11893i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10651a.mo11938f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
