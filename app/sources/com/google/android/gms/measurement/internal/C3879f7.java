package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
final class C3879f7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10671f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f10672o;

    C3879f7(C4030r7 r7Var, AtomicReference atomicReference) {
        this.f10672o = r7Var;
        this.f10671f = atomicReference;
    }

    public final void run() {
        synchronized (this.f10671f) {
            try {
                this.f10671f.set(this.f10672o.f10651a.mo12181z().mo12030x(this.f10672o.f10651a.mo12150B().mo12319s(), C3966m3.f10972M));
                this.f10671f.notify();
            } catch (Throwable th) {
                this.f10671f.notify();
                throw th;
            }
        }
    }
}
