package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.b3 */
final class C3504b3 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3583t f9899f;

    C3504b3(C3583t tVar) {
        this.f9899f = tVar;
    }

    public final void run() {
        this.f9899f.f10097m.lock();
        try {
            C3583t.m13944x(this.f9899f);
        } finally {
            this.f9899f.f10097m.unlock();
        }
    }
}
