package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
final class C3892g7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10683f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f10684o;

    C3892g7(C4030r7 r7Var, AtomicReference atomicReference) {
        this.f10684o = r7Var;
        this.f10683f = atomicReference;
    }

    public final void run() {
        synchronized (this.f10683f) {
            try {
                this.f10683f.set(Long.valueOf(this.f10684o.f10651a.mo12181z().mo12024r(this.f10684o.f10651a.mo12150B().mo12319s(), C3966m3.f10973N)));
                this.f10683f.notify();
            } catch (Throwable th) {
                this.f10683f.notify();
                throw th;
            }
        }
    }
}
