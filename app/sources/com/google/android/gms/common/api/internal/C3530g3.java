package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.g3 */
final class C3530g3 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ LifecycleCallback f9969f;

    /* renamed from: o */
    final /* synthetic */ String f9970o;

    /* renamed from: p */
    final /* synthetic */ C3535h3 f9971p;

    C3530g3(C3535h3 h3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f9971p = h3Var;
        this.f9969f = lifecycleCallback;
        this.f9970o = str;
    }

    public final void run() {
        C3535h3 h3Var = this.f9971p;
        if (h3Var.f9977p > 0) {
            this.f9969f.mo11251f(h3Var.f9978q != null ? h3Var.f9978q.getBundle(this.f9970o) : null);
        }
        if (this.f9971p.f9977p >= 2) {
            this.f9969f.mo11255j();
        }
        if (this.f9971p.f9977p >= 3) {
            this.f9969f.mo11253h();
        }
        if (this.f9971p.f9977p >= 4) {
            this.f9969f.mo11256k();
        }
        if (this.f9971p.f9977p >= 5) {
            this.f9969f.mo11252g();
        }
    }
}
