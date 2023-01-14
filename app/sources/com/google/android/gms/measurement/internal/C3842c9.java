package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
final class C3842c9 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4002p3 f10579f;

    /* renamed from: o */
    final /* synthetic */ C3881f9 f10580o;

    C3842c9(C3881f9 f9Var, C4002p3 p3Var) {
        this.f10580o = f9Var;
        this.f10579f = p3Var;
    }

    public final void run() {
        synchronized (this.f10580o) {
            this.f10580o.f10674a = false;
            if (!this.f10580o.f10676c.mo12006z()) {
                this.f10580o.f10676c.f10651a.mo11935b().mo12543q().mo12476a("Connected to remote service");
                this.f10580o.f10676c.mo12004x(this.f10579f);
            }
        }
    }
}
