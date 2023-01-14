package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
abstract class C3876f4 extends C3862e3 {

    /* renamed from: b */
    private boolean f10665b;

    C3876f4(C3955l5 l5Var) {
        super(l5Var);
        this.f10651a.mo12168i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo11949i() {
        if (!mo11953m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo11950j() {
        if (this.f10665b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo11954n()) {
            this.f10651a.mo12166g();
            this.f10665b = true;
        }
    }

    /* renamed from: k */
    public final void mo11951k() {
        if (!this.f10665b) {
            mo11952l();
            this.f10651a.mo12166g();
            this.f10665b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo11952l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo11953m() {
        return this.f10665b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo11954n();
}
