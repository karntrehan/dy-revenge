package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: e.f.c.a.z.a.d1 */
final class C9448d1 {

    /* renamed from: a */
    private static final C9448d1 f25331a = new C9448d1();

    /* renamed from: b */
    private final C9484i1 f25332b = new C9491k0();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C9467h1<?>> f25333c = new ConcurrentHashMap();

    private C9448d1() {
    }

    /* renamed from: a */
    public static C9448d1 m31455a() {
        return f25331a;
    }

    /* renamed from: b */
    public <T> void mo23520b(T t, C9464g1 g1Var, C9526q qVar) {
        mo23523e(t).mo23634f(t, g1Var, qVar);
    }

    /* renamed from: c */
    public C9467h1<?> mo23521c(Class<?> cls, C9467h1<?> h1Var) {
        C9431b0.m31423b(cls, "messageType");
        C9431b0.m31423b(h1Var, "schema");
        return this.f25333c.putIfAbsent(cls, h1Var);
    }

    /* renamed from: d */
    public <T> C9467h1<T> mo23522d(Class<T> cls) {
        C9431b0.m31423b(cls, "messageType");
        C9467h1<T> h1Var = (C9467h1) this.f25333c.get(cls);
        if (h1Var != null) {
            return h1Var;
        }
        C9467h1<T> a = this.f25332b.mo23673a(cls);
        C9467h1<?> c = mo23521c(cls, a);
        return c != null ? c : a;
    }

    /* renamed from: e */
    public <T> C9467h1<T> mo23523e(T t) {
        return mo23522d(t.getClass());
    }
}
