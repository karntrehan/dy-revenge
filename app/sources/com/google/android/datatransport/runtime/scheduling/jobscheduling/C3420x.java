package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.x */
public final class C3420x implements C6594b<C3419w> {

    /* renamed from: a */
    private final Provider<Executor> f9685a;

    /* renamed from: b */
    private final Provider<C6501j0> f9686b;

    /* renamed from: c */
    private final Provider<C3421y> f9687c;

    /* renamed from: d */
    private final Provider<C6547b> f9688d;

    public C3420x(Provider<Executor> provider, Provider<C6501j0> provider2, Provider<C3421y> provider3, Provider<C6547b> provider4) {
        this.f9685a = provider;
        this.f9686b = provider2;
        this.f9687c = provider3;
        this.f9688d = provider4;
    }

    /* renamed from: a */
    public static C3420x m13347a(Provider<Executor> provider, Provider<C6501j0> provider2, Provider<C3421y> provider3, Provider<C6547b> provider4) {
        return new C3420x(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C3419w m13348c(Executor executor, C6501j0 j0Var, C3421y yVar, C6547b bVar) {
        return new C3419w(executor, j0Var, yVar, bVar);
    }

    /* renamed from: b */
    public C3419w get() {
        return m13348c(this.f9685a.get(), this.f9686b.get(), this.f9687c.get(), this.f9688d.get());
    }
}
