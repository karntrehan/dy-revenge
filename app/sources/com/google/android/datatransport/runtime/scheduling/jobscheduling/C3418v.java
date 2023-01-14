package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C3379e;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6499i0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.v */
public final class C3418v implements C6594b<C3417u> {

    /* renamed from: a */
    private final Provider<Context> f9672a;

    /* renamed from: b */
    private final Provider<C3379e> f9673b;

    /* renamed from: c */
    private final Provider<C6501j0> f9674c;

    /* renamed from: d */
    private final Provider<C3421y> f9675d;

    /* renamed from: e */
    private final Provider<Executor> f9676e;

    /* renamed from: f */
    private final Provider<C6547b> f9677f;

    /* renamed from: g */
    private final Provider<C6552a> f9678g;

    /* renamed from: h */
    private final Provider<C6552a> f9679h;

    /* renamed from: i */
    private final Provider<C6499i0> f9680i;

    public C3418v(Provider<Context> provider, Provider<C3379e> provider2, Provider<C6501j0> provider3, Provider<C3421y> provider4, Provider<Executor> provider5, Provider<C6547b> provider6, Provider<C6552a> provider7, Provider<C6552a> provider8, Provider<C6499i0> provider9) {
        this.f9672a = provider;
        this.f9673b = provider2;
        this.f9674c = provider3;
        this.f9675d = provider4;
        this.f9676e = provider5;
        this.f9677f = provider6;
        this.f9678g = provider7;
        this.f9679h = provider8;
        this.f9680i = provider9;
    }

    /* renamed from: a */
    public static C3418v m13339a(Provider<Context> provider, Provider<C3379e> provider2, Provider<C6501j0> provider3, Provider<C3421y> provider4, Provider<Executor> provider5, Provider<C6547b> provider6, Provider<C6552a> provider7, Provider<C6552a> provider8, Provider<C6499i0> provider9) {
        return new C3418v(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static C3417u m13340c(Context context, C3379e eVar, C6501j0 j0Var, C3421y yVar, Executor executor, C6547b bVar, C6552a aVar, C6552a aVar2, C6499i0 i0Var) {
        return new C3417u(context, eVar, j0Var, yVar, executor, bVar, aVar, aVar2, i0Var);
    }

    /* renamed from: b */
    public C3417u get() {
        return m13340c(this.f9672a.get(), this.f9673b.get(), this.f9674c.get(), this.f9675d.get(), this.f9676e.get(), this.f9677f.get(), this.f9678g.get(), this.f9679h.get(), this.f9680i.get());
    }
}
