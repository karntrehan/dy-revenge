package p174e.p319f.p320a.p335c.p345f.p356k;

import java.lang.annotation.Annotation;

/* renamed from: e.f.a.c.f.k.i1 */
final class C7875i1 implements C7940n1 {

    /* renamed from: a */
    private final int f21480a;

    /* renamed from: b */
    private final C7927m1 f21481b;

    C7875i1(int i, C7927m1 m1Var) {
        this.f21480a = i;
        this.f21481b = m1Var;
    }

    public final Class<? extends Annotation> annotationType() {
        return C7940n1.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7940n1)) {
            return false;
        }
        C7940n1 n1Var = (C7940n1) obj;
        return this.f21480a == n1Var.zza() && this.f21481b.equals(n1Var.zzb());
    }

    public final int hashCode() {
        return (this.f21480a ^ 14552422) + (this.f21481b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f21480a + "intEncoding=" + this.f21481b + ')';
    }

    public final int zza() {
        return this.f21480a;
    }

    public final C7927m1 zzb() {
        return this.f21481b;
    }
}
