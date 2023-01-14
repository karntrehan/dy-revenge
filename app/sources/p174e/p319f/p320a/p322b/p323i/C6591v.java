package p174e.p319f.p320a.p322b.p323i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3417u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3419w;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p324a0.C6475e;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: e.f.a.b.i.v */
public final class C6591v implements C6594b<C6588t> {

    /* renamed from: a */
    private final Provider<C6552a> f18213a;

    /* renamed from: b */
    private final Provider<C6552a> f18214b;

    /* renamed from: c */
    private final Provider<C6475e> f18215c;

    /* renamed from: d */
    private final Provider<C3417u> f18216d;

    /* renamed from: e */
    private final Provider<C3419w> f18217e;

    public C6591v(Provider<C6552a> provider, Provider<C6552a> provider2, Provider<C6475e> provider3, Provider<C3417u> provider4, Provider<C3419w> provider5) {
        this.f18213a = provider;
        this.f18214b = provider2;
        this.f18215c = provider3;
        this.f18216d = provider4;
        this.f18217e = provider5;
    }

    /* renamed from: a */
    public static C6591v m25191a(Provider<C6552a> provider, Provider<C6552a> provider2, Provider<C6475e> provider3, Provider<C3417u> provider4, Provider<C3419w> provider5) {
        return new C6591v(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C6588t m25192c(C6552a aVar, C6552a aVar2, C6475e eVar, C3417u uVar, C3419w wVar) {
        return new C6588t(aVar, aVar2, eVar, uVar, wVar);
    }

    /* renamed from: b */
    public C6588t get() {
        return m25192c(this.f18213a.get(), this.f18214b.get(), this.f18215c.get(), this.f18216d.get(), this.f18217e.get());
    }
}
