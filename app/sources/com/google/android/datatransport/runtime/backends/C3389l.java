package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
public final class C3389l implements C6594b<C3387k> {

    /* renamed from: a */
    private final Provider<Context> f9609a;

    /* renamed from: b */
    private final Provider<C3385i> f9610b;

    public C3389l(Provider<Context> provider, Provider<C3385i> provider2) {
        this.f9609a = provider;
        this.f9610b = provider2;
    }

    /* renamed from: a */
    public static C3389l m13272a(Provider<Context> provider, Provider<C3385i> provider2) {
        return new C3389l(provider, provider2);
    }

    /* renamed from: c */
    public static C3387k m13273c(Context context, Object obj) {
        return new C3387k(context, (C3385i) obj);
    }

    /* renamed from: b */
    public C3387k get() {
        return m13273c(this.f9609a.get(), this.f9610b.get());
    }
}
