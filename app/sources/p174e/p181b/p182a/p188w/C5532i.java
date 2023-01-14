package p174e.p181b.p182a.p188w;

import androidx.core.util.C1174e;

/* renamed from: e.b.a.w.i */
public class C5532i<T> {

    /* renamed from: a */
    T f15625a;

    /* renamed from: b */
    T f15626b;

    /* renamed from: a */
    private static boolean m20605a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void mo16689b(T t, T t2) {
        this.f15625a = t;
        this.f15626b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1174e)) {
            return false;
        }
        C1174e eVar = (C1174e) obj;
        return m20605a(eVar.f3262a, this.f15625a) && m20605a(eVar.f3263b, this.f15626b);
    }

    public int hashCode() {
        T t = this.f15625a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f15626b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f15625a) + " " + String.valueOf(this.f15626b) + "}";
    }
}
