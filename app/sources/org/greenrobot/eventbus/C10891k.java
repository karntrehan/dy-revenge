package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.k */
final class C10891k {

    /* renamed from: a */
    private C10890j f28493a;

    /* renamed from: b */
    private C10890j f28494b;

    C10891k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo28488a(C10890j jVar) {
        if (jVar != null) {
            try {
                C10890j jVar2 = this.f28494b;
                if (jVar2 != null) {
                    jVar2.f28492d = jVar;
                    this.f28494b = jVar;
                } else if (this.f28493a == null) {
                    this.f28494b = jVar;
                    this.f28493a = jVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C10890j mo28489b() {
        C10890j jVar;
        jVar = this.f28493a;
        if (jVar != null) {
            C10890j jVar2 = jVar.f28492d;
            this.f28493a = jVar2;
            if (jVar2 == null) {
                this.f28494b = null;
            }
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C10890j mo28490c(int i) {
        if (this.f28493a == null) {
            wait((long) i);
        }
        return mo28489b();
    }
}
