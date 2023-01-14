package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
abstract class C3596w0 {

    /* renamed from: a */
    private final C3592v0 f10145a;

    protected C3596w0(C3592v0 v0Var) {
        this.f10145a = v0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11258a();

    /* renamed from: b */
    public final void mo11434b(C3604y0 y0Var) {
        y0Var.f10156a.lock();
        try {
            if (y0Var.f10166k == this.f10145a) {
                mo11258a();
            }
        } finally {
            y0Var.f10156a.unlock();
        }
    }
}
