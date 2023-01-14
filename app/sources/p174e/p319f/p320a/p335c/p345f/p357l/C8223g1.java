package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.l.g1 */
final class C8223g1<T> implements C8185e1<T> {

    /* renamed from: f */
    volatile C8185e1<T> f22523f;

    /* renamed from: o */
    volatile boolean f22524o;
    @NullableDecl

    /* renamed from: p */
    T f22525p;

    C8223g1(C8185e1<T> e1Var) {
        Objects.requireNonNull(e1Var);
        this.f22523f = e1Var;
    }

    public final String toString() {
        Object obj = this.f22523f;
        if (obj == null) {
            String valueOf = String.valueOf(this.f22525p);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        if (!this.f22524o) {
            synchronized (this) {
                if (!this.f22524o) {
                    T zza = this.f22523f.zza();
                    this.f22525p = zza;
                    this.f22524o = true;
                    this.f22523f = null;
                    return zza;
                }
            }
        }
        return this.f22525p;
    }
}
