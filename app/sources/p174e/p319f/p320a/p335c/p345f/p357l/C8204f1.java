package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.l.f1 */
final class C8204f1<T> implements Serializable, C8185e1 {

    /* renamed from: f */
    final C8185e1<T> f22288f;

    /* renamed from: o */
    volatile transient boolean f22289o;
    @NullableDecl

    /* renamed from: p */
    transient T f22290p;

    C8204f1(C8185e1<T> e1Var) {
        Objects.requireNonNull(e1Var);
        this.f22288f = e1Var;
    }

    public final String toString() {
        Object obj;
        if (this.f22289o) {
            String valueOf = String.valueOf(this.f22290p);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f22288f;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        if (!this.f22289o) {
            synchronized (this) {
                if (!this.f22289o) {
                    T zza = this.f22288f.zza();
                    this.f22290p = zza;
                    this.f22289o = true;
                    return zza;
                }
            }
        }
        return this.f22290p;
    }
}
