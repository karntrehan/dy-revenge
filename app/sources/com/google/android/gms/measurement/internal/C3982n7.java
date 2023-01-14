package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
final class C3982n7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ boolean f11078f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f11079o;

    C3982n7(C4030r7 r7Var, boolean z) {
        this.f11079o = r7Var;
        this.f11078f = z;
    }

    public final void run() {
        boolean o = this.f11079o.f10651a.mo12174o();
        boolean n = this.f11079o.f10651a.mo12173n();
        this.f11079o.f10651a.mo12170k(this.f11078f);
        if (n == this.f11078f) {
            this.f11079o.f10651a.mo11935b().mo12548v().mo12477b("Default data collection state already set to", Boolean.valueOf(this.f11078f));
        }
        if (this.f11079o.f10651a.mo12174o() == o || this.f11079o.f10651a.mo12174o() != this.f11079o.f10651a.mo12173n()) {
            this.f11079o.f10651a.mo11935b().mo12550x().mo12478c("Default data collection is different than actual status", Boolean.valueOf(this.f11078f), Boolean.valueOf(o));
        }
        this.f11079o.m15238P();
    }
}
