package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
final class C3980n5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3845d f11075f;

    /* renamed from: o */
    final /* synthetic */ C3844cb f11076o;

    /* renamed from: p */
    final /* synthetic */ C3852d6 f11077p;

    C3980n5(C3852d6 d6Var, C3845d dVar, C3844cb cbVar) {
        this.f11077p = d6Var;
        this.f11075f = dVar;
        this.f11076o = cbVar;
    }

    public final void run() {
        this.f11077p.f10629a.mo12284e();
        if (this.f11075f.f10608p.mo12418o() == null) {
            this.f11077p.f10629a.mo12304t(this.f11075f, this.f11076o);
        } else {
            this.f11077p.f10629a.mo12310z(this.f11075f, this.f11076o);
        }
    }
}
