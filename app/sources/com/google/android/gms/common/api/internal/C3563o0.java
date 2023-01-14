package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
abstract class C3563o0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3567p0 f10034f;

    /* synthetic */ C3563o0(C3567p0 p0Var, C3559n0 n0Var) {
        this.f10034f = p0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11352a();

    public final void run() {
        this.f10034f.f10037b.lock();
        try {
            if (!Thread.interrupted()) {
                mo11352a();
            }
        } catch (RuntimeException e) {
            this.f10034f.f10036a.mo11444q(e);
        } catch (Throwable th) {
            this.f10034f.f10037b.unlock();
            throw th;
        }
        this.f10034f.f10037b.unlock();
    }
}
