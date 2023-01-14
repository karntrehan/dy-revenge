package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
abstract class C3878f6 extends C3865e6 {

    /* renamed from: b */
    private boolean f10670b;

    C3878f6(C3955l5 l5Var) {
        super(l5Var);
        this.f10651a.mo12168i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo11957i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo11958j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo11959k() {
        if (!mo11962n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo11960l() {
        if (this.f10670b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo11958j()) {
            this.f10651a.mo12166g();
            this.f10670b = true;
        }
    }

    /* renamed from: m */
    public final void mo11961m() {
        if (!this.f10670b) {
            mo11957i();
            this.f10651a.mo12166g();
            this.f10670b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo11962n() {
        return this.f10670b;
    }
}
