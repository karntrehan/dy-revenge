package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
final class C4124z5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4045sa f11461f;

    /* renamed from: o */
    final /* synthetic */ C3844cb f11462o;

    /* renamed from: p */
    final /* synthetic */ C3852d6 f11463p;

    C4124z5(C3852d6 d6Var, C4045sa saVar, C3844cb cbVar) {
        this.f11463p = d6Var;
        this.f11461f = saVar;
        this.f11462o = cbVar;
    }

    public final void run() {
        this.f11463p.f10629a.mo12284e();
        if (this.f11461f.mo12418o() == null) {
            this.f11463p.f10629a.mo12305u(this.f11461f, this.f11462o);
        } else {
            this.f11463p.f10629a.mo12268B(this.f11461f, this.f11462o);
        }
    }
}
