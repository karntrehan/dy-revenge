package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import android.content.Context;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6596d;

/* renamed from: e.f.a.b.i.a0.j.n0 */
public final class C6511n0 implements C6594b<String> {

    /* renamed from: a */
    private final Provider<Context> f18076a;

    public C6511n0(Provider<Context> provider) {
        this.f18076a = provider;
    }

    /* renamed from: a */
    public static C6511n0 m24945a(Provider<Context> provider) {
        return new C6511n0(provider);
    }

    /* renamed from: c */
    public static String m24946c(Context context) {
        return (String) C6596d.m25200c(C6506l0.m24938b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m24946c(this.f18076a.get());
    }
}
