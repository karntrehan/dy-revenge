package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
final class C3992o5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3845d f11089f;

    /* renamed from: o */
    final /* synthetic */ C3852d6 f11090o;

    C3992o5(C3852d6 d6Var, C3845d dVar) {
        this.f11090o = d6Var;
        this.f11089f = dVar;
    }

    public final void run() {
        this.f11090o.f10629a.mo12284e();
        if (this.f11089f.f10608p.mo12418o() == null) {
            this.f11090o.f10629a.mo12303s(this.f11089f);
        } else {
            this.f11090o.f10629a.mo12309y(this.f11089f);
        }
    }
}
