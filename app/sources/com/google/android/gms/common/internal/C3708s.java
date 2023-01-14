package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.s */
public final class C3708s {

    /* renamed from: a */
    private static C3708s f10376a;

    /* renamed from: b */
    private static final C3711t f10377b = new C3711t(0, false, false, 0, 0);

    /* renamed from: c */
    private C3711t f10378c;

    private C3708s() {
    }

    /* renamed from: b */
    public static synchronized C3708s m14363b() {
        C3708s sVar;
        synchronized (C3708s.class) {
            if (f10376a == null) {
                f10376a = new C3708s();
            }
            sVar = f10376a;
        }
        return sVar;
    }

    /* renamed from: a */
    public C3711t mo11669a() {
        return this.f10378c;
    }

    /* renamed from: c */
    public final synchronized void mo11670c(C3711t tVar) {
        if (tVar == null) {
            this.f10378c = f10377b;
            return;
        }
        C3711t tVar2 = this.f10378c;
        if (tVar2 == null || tVar2.mo11672E() < tVar.mo11672E()) {
            this.f10378c = tVar;
        }
    }
}
