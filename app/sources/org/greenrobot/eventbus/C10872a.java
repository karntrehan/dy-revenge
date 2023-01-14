package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.a */
class C10872a implements Runnable, C10892l {

    /* renamed from: f */
    private final C10891k f28432f = new C10891k();

    /* renamed from: o */
    private final C10878c f28433o;

    C10872a(C10878c cVar) {
        this.f28433o = cVar;
    }

    /* renamed from: a */
    public void mo28467a(C10898q qVar, Object obj) {
        this.f28432f.mo28488a(C10890j.m37031a(qVar, obj));
        this.f28433o.mo28474d().execute(this);
    }

    public void run() {
        C10890j b = this.f28432f.mo28489b();
        if (b != null) {
            this.f28433o.mo28476g(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
