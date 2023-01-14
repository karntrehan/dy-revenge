package p174e.p319f.p320a.p322b.p323i.p324a0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3412t;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6596d;

/* renamed from: e.f.a.b.i.a0.g */
public final class C6477g implements C6594b<C3412t> {

    /* renamed from: a */
    private final Provider<C6552a> f18028a;

    public C6477g(Provider<C6552a> provider) {
        this.f18028a = provider;
    }

    /* renamed from: a */
    public static C3412t m24886a(C6552a aVar) {
        return (C3412t) C6596d.m25200c(C6476f.m24885a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C6477g m24887b(Provider<C6552a> provider) {
        return new C6477g(provider);
    }

    /* renamed from: c */
    public C3412t get() {
        return m24886a(this.f18028a.get());
    }
}
