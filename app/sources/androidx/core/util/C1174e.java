package androidx.core.util;

/* renamed from: androidx.core.util.e */
public class C1174e<F, S> {

    /* renamed from: a */
    public final F f3262a;

    /* renamed from: b */
    public final S f3263b;

    public C1174e(F f, S s) {
        this.f3262a = f;
        this.f3263b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1174e)) {
            return false;
        }
        C1174e eVar = (C1174e) obj;
        return C1173d.m4572a(eVar.f3262a, this.f3262a) && C1173d.m4572a(eVar.f3263b, this.f3263b);
    }

    public int hashCode() {
        F f = this.f3262a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f3263b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f3262a + " " + this.f3263b + "}";
    }
}
