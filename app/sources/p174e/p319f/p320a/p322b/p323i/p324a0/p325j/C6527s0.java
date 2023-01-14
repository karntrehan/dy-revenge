package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p329w.C6592a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6593a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: e.f.a.b.i.a0.j.s0 */
public final class C6527s0 implements C6594b<C6521r0> {

    /* renamed from: a */
    private final Provider<C6552a> f18098a;

    /* renamed from: b */
    private final Provider<C6552a> f18099b;

    /* renamed from: c */
    private final Provider<C6503k0> f18100c;

    /* renamed from: d */
    private final Provider<C6529t0> f18101d;

    /* renamed from: e */
    private final Provider<String> f18102e;

    public C6527s0(Provider<C6552a> provider, Provider<C6552a> provider2, Provider<C6503k0> provider3, Provider<C6529t0> provider4, Provider<String> provider5) {
        this.f18098a = provider;
        this.f18099b = provider2;
        this.f18100c = provider3;
        this.f18101d = provider4;
        this.f18102e = provider5;
    }

    /* renamed from: a */
    public static C6527s0 m25032a(Provider<C6552a> provider, Provider<C6552a> provider2, Provider<C6503k0> provider3, Provider<C6529t0> provider4, Provider<String> provider5) {
        return new C6527s0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C6521r0 m25033c(C6552a aVar, C6552a aVar2, Object obj, Object obj2, C6592a<String> aVar3) {
        return new C6521r0(aVar, aVar2, (C6503k0) obj, (C6529t0) obj2, aVar3);
    }

    /* renamed from: b */
    public C6521r0 get() {
        return m25033c(this.f18098a.get(), this.f18099b.get(), this.f18100c.get(), this.f18101d.get(), C6593a.m25194a(this.f18102e));
    }
}
