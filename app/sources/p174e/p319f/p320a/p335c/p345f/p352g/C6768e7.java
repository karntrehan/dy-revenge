package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Objects;

/* renamed from: e.f.a.c.f.g.e7 */
final class C6768e7 implements C6734c7 {

    /* renamed from: f */
    volatile C6734c7 f18462f;

    /* renamed from: o */
    volatile boolean f18463o;

    /* renamed from: p */
    Object f18464p;

    C6768e7(C6734c7 c7Var) {
        Objects.requireNonNull(c7Var);
        this.f18462f = c7Var;
    }

    public final String toString() {
        Object obj = this.f18462f;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f18464p + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f18463o) {
            synchronized (this) {
                if (!this.f18463o) {
                    C6734c7 c7Var = this.f18462f;
                    c7Var.getClass();
                    Object zza = c7Var.zza();
                    this.f18464p = zza;
                    this.f18463o = true;
                    this.f18462f = null;
                    return zza;
                }
            }
        }
        return this.f18464p;
    }
}
