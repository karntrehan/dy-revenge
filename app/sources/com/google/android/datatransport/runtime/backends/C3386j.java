package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
public final class C3386j implements C6594b<C3385i> {

    /* renamed from: a */
    private final Provider<Context> f9601a;

    /* renamed from: b */
    private final Provider<C6552a> f9602b;

    /* renamed from: c */
    private final Provider<C6552a> f9603c;

    public C3386j(Provider<Context> provider, Provider<C6552a> provider2, Provider<C6552a> provider3) {
        this.f9601a = provider;
        this.f9602b = provider2;
        this.f9603c = provider3;
    }

    /* renamed from: a */
    public static C3386j m13265a(Provider<Context> provider, Provider<C6552a> provider2, Provider<C6552a> provider3) {
        return new C3386j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C3385i m13266c(Context context, C6552a aVar, C6552a aVar2) {
        return new C3385i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C3385i get() {
        return m13266c(this.f9601a.get(), this.f9602b.get(), this.f9603c.get());
    }
}
