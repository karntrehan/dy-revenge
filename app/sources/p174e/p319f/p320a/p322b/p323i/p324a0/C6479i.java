package p174e.p319f.p320a.p322b.p323i.p324a0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3412t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3421y;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6596d;

/* renamed from: e.f.a.b.i.a0.i */
public final class C6479i implements C6594b<C3421y> {

    /* renamed from: a */
    private final Provider<Context> f18029a;

    /* renamed from: b */
    private final Provider<C6501j0> f18030b;

    /* renamed from: c */
    private final Provider<C3412t> f18031c;

    /* renamed from: d */
    private final Provider<C6552a> f18032d;

    public C6479i(Provider<Context> provider, Provider<C6501j0> provider2, Provider<C3412t> provider3, Provider<C6552a> provider4) {
        this.f18029a = provider;
        this.f18030b = provider2;
        this.f18031c = provider3;
        this.f18032d = provider4;
    }

    /* renamed from: a */
    public static C6479i m24890a(Provider<Context> provider, Provider<C6501j0> provider2, Provider<C3412t> provider3, Provider<C6552a> provider4) {
        return new C6479i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C3421y m24891c(Context context, C6501j0 j0Var, C3412t tVar, C6552a aVar) {
        return (C3421y) C6596d.m25200c(C6478h.m24889a(context, j0Var, tVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3421y get() {
        return m24891c(this.f18029a.get(), this.f18030b.get(), this.f18031c.get(), this.f18032d.get());
    }
}
