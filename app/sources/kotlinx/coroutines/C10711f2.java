package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.f2 */
public final class C10711f2 {

    /* renamed from: a */
    public static final C10711f2 f28192a = new C10711f2();

    /* renamed from: b */
    private static final ThreadLocal<C10683a1> f28193b = new ThreadLocal<>();

    private C10711f2() {
    }

    /* renamed from: a */
    public final C10683a1 mo26664a() {
        ThreadLocal<C10683a1> threadLocal = f28193b;
        C10683a1 a1Var = threadLocal.get();
        if (a1Var != null) {
            return a1Var;
        }
        C10683a1 a = C10700d1.m36415a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo26665b() {
        f28193b.set((Object) null);
    }

    /* renamed from: c */
    public final void mo26666c(C10683a1 a1Var) {
        f28193b.set(a1Var);
    }
}
