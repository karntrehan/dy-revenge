package p174e.p319f.p320a.p322b.p323i.p324a0;

import com.google.android.datatransport.runtime.backends.C3379e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3421y;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: e.f.a.b.i.a0.d */
public final class C6474d implements C6594b<C6473c> {

    /* renamed from: a */
    private final Provider<Executor> f18023a;

    /* renamed from: b */
    private final Provider<C3379e> f18024b;

    /* renamed from: c */
    private final Provider<C3421y> f18025c;

    /* renamed from: d */
    private final Provider<C6501j0> f18026d;

    /* renamed from: e */
    private final Provider<C6547b> f18027e;

    public C6474d(Provider<Executor> provider, Provider<C3379e> provider2, Provider<C3421y> provider3, Provider<C6501j0> provider4, Provider<C6547b> provider5) {
        this.f18023a = provider;
        this.f18024b = provider2;
        this.f18025c = provider3;
        this.f18026d = provider4;
        this.f18027e = provider5;
    }

    /* renamed from: a */
    public static C6474d m24881a(Provider<Executor> provider, Provider<C3379e> provider2, Provider<C3421y> provider3, Provider<C6501j0> provider4, Provider<C6547b> provider5) {
        return new C6474d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C6473c m24882c(Executor executor, C3379e eVar, C3421y yVar, C6501j0 j0Var, C6547b bVar) {
        return new C6473c(executor, eVar, yVar, j0Var, bVar);
    }

    /* renamed from: b */
    public C6473c get() {
        return m24882c(this.f18023a.get(), this.f18024b.get(), this.f18025c.get(), this.f18026d.get(), this.f18027e.get());
    }
}
