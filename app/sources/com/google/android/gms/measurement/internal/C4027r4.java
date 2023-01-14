package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p174e.p319f.p320a.p335c.p345f.p352g.C6987s0;
import p174e.p319f.p320a.p335c.p345f.p352g.C7003t0;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
public final class C4027r4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f11226a;

    /* renamed from: b */
    final /* synthetic */ C4039s4 f11227b;

    C4027r4(C4039s4 s4Var, String str) {
        this.f11227b = s4Var;
        this.f11226a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C7003t0 k = C6987s0.m26464k(iBinder);
                if (k == null) {
                    this.f11227b.f11264a.mo11935b().mo12549w().mo12476a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f11227b.f11264a.mo11935b().mo12548v().mo12476a("Install Referrer Service connected");
                this.f11227b.f11264a.mo11934a().mo12110z(new C4015q4(this, k, this));
            } catch (RuntimeException e) {
                this.f11227b.f11264a.mo11935b().mo12549w().mo12477b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f11227b.f11264a.mo11935b().mo12549w().mo12476a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11227b.f11264a.mo11935b().mo12548v().mo12476a("Install Referrer Service disconnected");
    }
}
