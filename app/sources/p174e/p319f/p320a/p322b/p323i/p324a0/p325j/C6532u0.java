package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import android.content.Context;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;

/* renamed from: e.f.a.b.i.a0.j.u0 */
public final class C6532u0 implements C6594b<C6529t0> {

    /* renamed from: a */
    private final Provider<Context> f18117a;

    /* renamed from: b */
    private final Provider<String> f18118b;

    /* renamed from: c */
    private final Provider<Integer> f18119c;

    public C6532u0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f18117a = provider;
        this.f18118b = provider2;
        this.f18119c = provider3;
    }

    /* renamed from: a */
    public static C6532u0 m25044a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new C6532u0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C6529t0 m25045c(Context context, String str, int i) {
        return new C6529t0(context, str, i);
    }

    /* renamed from: b */
    public C6529t0 get() {
        return m25045c(this.f18117a.get(), this.f18118b.get(), this.f18119c.get().intValue());
    }
}
