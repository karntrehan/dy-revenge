package kotlinx.coroutines.internal;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.internal.a */
public class C10729a<T> {

    /* renamed from: a */
    private Object[] f28212a = new Object[16];

    /* renamed from: b */
    private int f28213b;

    /* renamed from: c */
    private int f28214c;

    /* renamed from: b */
    private final void m36465b() {
        Object[] objArr = this.f28212a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C10341g.m35070f(objArr, objArr3, 0, this.f28213b, 0, 10, (Object) null);
        Object[] objArr4 = this.f28212a;
        int length2 = objArr4.length;
        int i = this.f28213b;
        Object[] unused2 = C10341g.m35070f(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f28212a = objArr3;
        this.f28213b = 0;
        this.f28214c = length;
    }

    /* renamed from: a */
    public final void mo26687a(T t) {
        Object[] objArr = this.f28212a;
        int i = this.f28214c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f28214c = length;
        if (length == this.f28213b) {
            m36465b();
        }
    }

    /* renamed from: c */
    public final boolean mo26688c() {
        return this.f28213b == this.f28214c;
    }

    /* renamed from: d */
    public final T mo26689d() {
        int i = this.f28213b;
        if (i == this.f28214c) {
            return null;
        }
        T[] tArr = this.f28212a;
        T t = tArr[i];
        tArr[i] = null;
        this.f28213b = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
