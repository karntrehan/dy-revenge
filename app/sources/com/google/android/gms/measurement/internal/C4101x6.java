package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
final class C4101x6 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f11397f;

    /* renamed from: o */
    final /* synthetic */ String f11398o;

    /* renamed from: p */
    final /* synthetic */ Object f11399p;

    /* renamed from: q */
    final /* synthetic */ long f11400q;

    /* renamed from: r */
    final /* synthetic */ C4030r7 f11401r;

    C4101x6(C4030r7 r7Var, String str, String str2, Object obj, long j) {
        this.f11401r = r7Var;
        this.f11397f = str;
        this.f11398o = str2;
        this.f11399p = obj;
        this.f11400q = j;
    }

    public final void run() {
        this.f11401r.mo12361M(this.f11397f, this.f11398o, this.f11399p, this.f11400q);
    }
}
