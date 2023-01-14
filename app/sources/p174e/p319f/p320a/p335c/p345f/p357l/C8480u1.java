package p174e.p319f.p320a.p335c.p345f.p357l;

import java.lang.annotation.Annotation;

/* renamed from: e.f.a.c.f.l.u1 */
final class C8480u1 implements C8570z1 {

    /* renamed from: a */
    private final int f23101a;

    /* renamed from: b */
    private final C8552y1 f23102b;

    C8480u1(int i, C8552y1 y1Var) {
        this.f23101a = i;
        this.f23102b = y1Var;
    }

    public final Class<? extends Annotation> annotationType() {
        return C8570z1.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8570z1)) {
            return false;
        }
        C8570z1 z1Var = (C8570z1) obj;
        return this.f23101a == z1Var.zza() && this.f23102b.equals(z1Var.zzb());
    }

    public final int hashCode() {
        return (this.f23101a ^ 14552422) + (this.f23102b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f23101a + "intEncoding=" + this.f23102b + ')';
    }

    public final int zza() {
        return this.f23101a;
    }

    public final C8552y1 zzb() {
        return this.f23102b;
    }
}
