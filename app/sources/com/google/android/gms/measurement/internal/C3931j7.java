package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
final class C3931j7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f10827f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f10828o;

    C3931j7(C4030r7 r7Var, AtomicReference atomicReference) {
        this.f10828o = r7Var;
        this.f10827f = atomicReference;
    }

    public final void run() {
        synchronized (this.f10827f) {
            try {
                this.f10827f.set(Double.valueOf(this.f10828o.f10651a.mo12181z().mo12017k(this.f10828o.f10651a.mo12150B().mo12319s(), C3966m3.f10975P)));
                this.f10827f.notify();
            } catch (Throwable th) {
                this.f10827f.notify();
                throw th;
            }
        }
    }
}
