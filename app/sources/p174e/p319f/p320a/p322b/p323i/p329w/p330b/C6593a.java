package p174e.p319f.p320a.p322b.p323i.p329w.p330b;

import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.p329w.C6592a;

/* renamed from: e.f.a.b.i.w.b.a */
public final class C6593a<T> implements Provider<T>, C6592a<T> {

    /* renamed from: a */
    private static final Object f18218a = new Object();

    /* renamed from: b */
    private volatile Provider<T> f18219b;

    /* renamed from: c */
    private volatile Object f18220c = f18218a;

    private C6593a(Provider<T> provider) {
        this.f18219b = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> C6592a<T> m25194a(P p) {
        return p instanceof C6592a ? (C6592a) p : new C6593a((Provider) C6596d.m25199b(p));
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m25195b(P p) {
        C6596d.m25199b(p);
        return p instanceof C6593a ? p : new C6593a(p);
    }

    /* renamed from: c */
    public static Object m25196c(Object obj, Object obj2) {
        if (!(obj != f18218a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f18220c;
        T t2 = f18218a;
        if (t == t2) {
            synchronized (this) {
                t = this.f18220c;
                if (t == t2) {
                    t = this.f18219b.get();
                    this.f18220c = m25196c(this.f18220c, t);
                    this.f18219b = null;
                }
            }
        }
        return t;
    }
}
