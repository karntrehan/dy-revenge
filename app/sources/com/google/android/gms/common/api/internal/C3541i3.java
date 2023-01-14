package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.i3 */
final class C3541i3 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ LifecycleCallback f9994f;

    /* renamed from: o */
    final /* synthetic */ String f9995o;

    /* renamed from: p */
    final /* synthetic */ zzd f9996p;

    C3541i3(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.f9996p = zzd;
        this.f9994f = lifecycleCallback;
        this.f9995o = str;
    }

    public final void run() {
        zzd zzd = this.f9996p;
        if (zzd.f10181m0 > 0) {
            this.f9994f.mo11251f(zzd.f10182n0 != null ? zzd.f10182n0.getBundle(this.f9995o) : null);
        }
        if (this.f9996p.f10181m0 >= 2) {
            this.f9994f.mo11255j();
        }
        if (this.f9996p.f10181m0 >= 3) {
            this.f9994f.mo11253h();
        }
        if (this.f9996p.f10181m0 >= 4) {
            this.f9994f.mo11256k();
        }
        if (this.f9996p.f10181m0 >= 5) {
            this.f9994f.mo11252g();
        }
    }
}
