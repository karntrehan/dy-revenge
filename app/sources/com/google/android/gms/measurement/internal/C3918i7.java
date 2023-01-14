package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
final class C3918i7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10792f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f10793o;

    C3918i7(C4030r7 r7Var, AtomicReference atomicReference) {
        this.f10793o = r7Var;
        this.f10792f = atomicReference;
    }

    public final void run() {
        synchronized (this.f10792f) {
            try {
                this.f10792f.set(Integer.valueOf(this.f10793o.f10651a.mo12181z().mo12021o(this.f10793o.f10651a.mo12150B().mo12319s(), C3966m3.f10974O)));
                this.f10792f.notify();
            } catch (Throwable th) {
                this.f10792f.notify();
                throw th;
            }
        }
    }
}
