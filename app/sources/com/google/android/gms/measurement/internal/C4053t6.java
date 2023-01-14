package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
public final /* synthetic */ class C4053t6 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C4030r7 f11298f;

    public /* synthetic */ C4053t6(C4030r7 r7Var) {
        this.f11298f = r7Var;
    }

    public final void run() {
        C4030r7 r7Var = this.f11298f;
        r7Var.mo11931h();
        if (!r7Var.f10651a.mo12154F().f11123s.mo12128b()) {
            long a = r7Var.f10651a.mo12154F().f11124t.mo12147a();
            r7Var.f10651a.mo12154F().f11124t.mo12148b(1 + a);
            r7Var.f10651a.mo12181z();
            if (a >= 5) {
                r7Var.f10651a.mo11935b().mo12549w().mo12476a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                r7Var.f10651a.mo12154F().f11123s.mo12127a(true);
                return;
            }
            r7Var.f10651a.mo12169j();
            return;
        }
        r7Var.f10651a.mo11935b().mo12543q().mo12476a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
