package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
final class C4056t9 {

    /* renamed from: a */
    private C4044s9 f11306a;

    /* renamed from: b */
    final /* synthetic */ C4104x9 f11307b;

    C4056t9(C4104x9 x9Var) {
        this.f11307b = x9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12427a(long j) {
        this.f11306a = new C4044s9(this, this.f11307b.f10651a.mo11936c().mo11730a(), j);
        this.f11307b.f11407c.postDelayed(this.f11306a, 2000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12428b() {
        this.f11307b.mo11931h();
        C4044s9 s9Var = this.f11306a;
        if (s9Var != null) {
            this.f11307b.f11407c.removeCallbacks(s9Var);
        }
        this.f11307b.f10651a.mo12154F().f11122r.mo12127a(false);
    }
}
