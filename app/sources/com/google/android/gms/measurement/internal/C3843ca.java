package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ca */
abstract class C3843ca extends C3830ba {

    /* renamed from: c */
    private boolean f10581c;

    C3843ca(C4009pa paVar) {
        super(paVar);
        this.f10552b.mo12302r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo11893i() {
        if (!mo11895k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo11894j() {
        if (!this.f10581c) {
            mo11853l();
            this.f10552b.mo12297m();
            this.f10581c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo11895k() {
        return this.f10581c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo11853l();
}
