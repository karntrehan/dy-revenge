package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a9 */
final class C3816a9 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4002p3 f10519f;

    /* renamed from: o */
    final /* synthetic */ C3881f9 f10520o;

    C3816a9(C3881f9 f9Var, C4002p3 p3Var) {
        this.f10520o = f9Var;
        this.f10519f = p3Var;
    }

    public final void run() {
        synchronized (this.f10520o) {
            this.f10520o.f10674a = false;
            if (!this.f10520o.f10676c.mo12006z()) {
                this.f10520o.f10676c.f10651a.mo11935b().mo12548v().mo12476a("Connected to service");
                this.f10520o.f10676c.mo12004x(this.f10519f);
            }
        }
    }
}
