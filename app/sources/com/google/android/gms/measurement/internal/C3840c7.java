package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
final class C3840c7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10576f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f10577o;

    C3840c7(C4030r7 r7Var, AtomicReference atomicReference) {
        this.f10577o = r7Var;
        this.f10576f = atomicReference;
    }

    public final void run() {
        synchronized (this.f10576f) {
            try {
                this.f10576f.set(Boolean.valueOf(this.f10577o.f10651a.mo12181z().mo12010B(this.f10577o.f10651a.mo12150B().mo12319s(), C3966m3.f10971L)));
                this.f10576f.notify();
            } catch (Throwable th) {
                this.f10576f.notify();
                throw th;
            }
        }
    }
}
