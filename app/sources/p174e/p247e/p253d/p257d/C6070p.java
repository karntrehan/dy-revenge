package p174e.p247e.p253d.p257d;

/* renamed from: e.e.d.d.p */
public final class C6070p {
    /* renamed from: a */
    public static RuntimeException m22850a(Throwable th) {
        m22852c((Throwable) C6062k.m22839g(th));
        throw new RuntimeException(th);
    }

    /* renamed from: b */
    public static <X extends Throwable> void m22851b(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: c */
    public static void m22852c(Throwable th) {
        m22851b(th, Error.class);
        m22851b(th, RuntimeException.class);
    }
}
