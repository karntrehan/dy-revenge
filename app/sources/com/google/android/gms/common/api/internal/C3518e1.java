package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
final class C3518e1 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3523f1 f9926f;

    C3518e1(C3523f1 f1Var) {
        this.f9926f = f1Var;
    }

    public final void run() {
        C3528g1 g1Var = this.f9926f.f9950a;
        g1Var.f9957b.mo11189e(g1Var.f9957b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
