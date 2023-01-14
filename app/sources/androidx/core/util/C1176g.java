package androidx.core.util;

/* renamed from: androidx.core.util.g */
public class C1176g<T> extends Pools$SimplePool<T> {

    /* renamed from: c */
    private final Object f3264c = new Object();

    public C1176g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo3701a(T t) {
        boolean a;
        synchronized (this.f3264c) {
            a = super.mo3701a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo3702b() {
        T b;
        synchronized (this.f3264c) {
            b = super.mo3702b();
        }
        return b;
    }
}
