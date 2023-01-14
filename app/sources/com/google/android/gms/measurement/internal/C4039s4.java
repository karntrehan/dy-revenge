package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.p133n.C3745b;
import com.google.android.gms.common.p133n.C3746c;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
public final class C4039s4 {

    /* renamed from: a */
    final C3955l5 f11264a;

    C4039s4(C4009pa paVar) {
        this.f11264a = paVar.mo12282c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12414a() {
        try {
            C3745b a = C3746c.m14493a(this.f11264a.mo11938f());
            if (a != null) {
                return a.mo11719d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f11264a.mo11935b().mo12548v().mo12476a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f11264a.mo11935b().mo12548v().mo12477b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
