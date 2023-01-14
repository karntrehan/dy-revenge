package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
final class C3864e5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f10649a;

    /* renamed from: b */
    final /* synthetic */ C3916i5 f10650b;

    public C3864e5(C3916i5 i5Var, String str) {
        this.f10650b = i5Var;
        C3705r.m14346k(str);
        this.f10649a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f10650b.f10651a.mo11935b().mo12544r().mo12477b(this.f10649a, th);
    }
}
