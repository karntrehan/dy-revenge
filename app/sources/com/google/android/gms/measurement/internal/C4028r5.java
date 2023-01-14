package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
final class C4028r5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f11228a;

    /* renamed from: b */
    final /* synthetic */ String f11229b;

    /* renamed from: c */
    final /* synthetic */ String f11230c;

    /* renamed from: d */
    final /* synthetic */ C3852d6 f11231d;

    C4028r5(C3852d6 d6Var, String str, String str2, String str3) {
        this.f11231d = d6Var;
        this.f11228a = str;
        this.f11229b = str2;
        this.f11230c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f11231d.f10629a.mo12284e();
        return this.f11231d.f10629a.mo12277W().mo12212a0(this.f11228a, this.f11229b, this.f11230c);
    }
}
