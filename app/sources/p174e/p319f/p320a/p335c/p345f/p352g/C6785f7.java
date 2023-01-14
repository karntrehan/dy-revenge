package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: e.f.a.c.f.g.f7 */
final class C6785f7 implements Serializable, C6734c7 {

    /* renamed from: f */
    final Object f18480f;

    C6785f7(Object obj) {
        this.f18480f = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6785f7)) {
            return false;
        }
        Object obj2 = this.f18480f;
        Object obj3 = ((C6785f7) obj).f18480f;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18480f});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f18480f + ")";
    }

    public final Object zza() {
        return this.f18480f;
    }
}
