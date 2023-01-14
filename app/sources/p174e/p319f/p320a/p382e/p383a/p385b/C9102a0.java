package p174e.p319f.p320a.p382e.p383a.p385b;

/* renamed from: e.f.a.e.a.b.a0 */
public final class C9102a0<T> implements C9106c0<T> {

    /* renamed from: a */
    private C9106c0<T> f24988a;

    /* renamed from: b */
    public static <T> void m30327b(C9106c0<T> c0Var, C9106c0<T> c0Var2) {
        C9127n.m30387c(c0Var2);
        C9102a0 a0Var = (C9102a0) c0Var;
        if (a0Var.f24988a == null) {
            a0Var.f24988a = c0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo13826a() {
        C9106c0<T> c0Var = this.f24988a;
        if (c0Var != null) {
            return c0Var.mo13826a();
        }
        throw new IllegalStateException();
    }
}
