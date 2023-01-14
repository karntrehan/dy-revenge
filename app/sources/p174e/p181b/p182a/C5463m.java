package p174e.p181b.p182a;

import java.util.Arrays;

/* renamed from: e.b.a.m */
public final class C5463m<V> {

    /* renamed from: a */
    private final V f15310a;

    /* renamed from: b */
    private final Throwable f15311b;

    public C5463m(V v) {
        this.f15310a = v;
        this.f15311b = null;
    }

    public C5463m(Throwable th) {
        this.f15311b = th;
        this.f15310a = null;
    }

    /* renamed from: a */
    public Throwable mo16571a() {
        return this.f15311b;
    }

    /* renamed from: b */
    public V mo16572b() {
        return this.f15310a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5463m)) {
            return false;
        }
        C5463m mVar = (C5463m) obj;
        if (mo16572b() != null && mo16572b().equals(mVar.mo16572b())) {
            return true;
        }
        if (mo16571a() == null || mVar.mo16571a() == null) {
            return false;
        }
        return mo16571a().toString().equals(mo16571a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo16572b(), mo16571a()});
    }
}
