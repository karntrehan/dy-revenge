package androidx.core.util;

public class Pools$SimplePool<T> implements C1175f<T> {

    /* renamed from: a */
    private final Object[] f3258a;

    /* renamed from: b */
    private int f3259b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.f3258a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m4566c(T t) {
        for (int i = 0; i < this.f3259b; i++) {
            if (this.f3258a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3701a(T t) {
        if (!m4566c(t)) {
            int i = this.f3259b;
            Object[] objArr = this.f3258a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f3259b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo3702b() {
        int i = this.f3259b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f3258a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f3259b = i - 1;
        return t;
    }
}
