package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: e.f.a.c.f.g.d7 */
final class C6751d7 implements Serializable, C6734c7 {

    /* renamed from: f */
    final C6734c7 f18433f;

    /* renamed from: o */
    volatile transient boolean f18434o;

    /* renamed from: p */
    transient Object f18435p;

    C6751d7(C6734c7 c7Var) {
        Objects.requireNonNull(c7Var);
        this.f18433f = c7Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f18434o) {
            obj = "<supplier that returned " + this.f18435p + ">";
        } else {
            obj = this.f18433f;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f18434o) {
            synchronized (this) {
                if (!this.f18434o) {
                    Object zza = this.f18433f.zza();
                    this.f18435p = zza;
                    this.f18434o = true;
                    return zza;
                }
            }
        }
        return this.f18435p;
    }
}
