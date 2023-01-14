package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
final class C4019q8 extends C4010q {

    /* renamed from: e */
    final /* synthetic */ C3894g9 f11213e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4019q8(C3894g9 g9Var, C3891g6 g6Var) {
        super(g6Var);
        this.f11213e = g9Var;
    }

    /* renamed from: c */
    public final void mo12312c() {
        C3894g9 g9Var = this.f11213e;
        g9Var.mo11931h();
        if (g9Var.mo12006z()) {
            g9Var.f10651a.mo11935b().mo12548v().mo12476a("Inactivity, disconnecting from the service");
            g9Var.mo11988Q();
        }
    }
}
