package p174e.p319f.p320a.p335c.p345f.p355j;

import java.lang.annotation.Annotation;

/* renamed from: e.f.a.c.f.j.d8 */
final class C7563d8 implements C7613i8 {

    /* renamed from: a */
    private final int f20331a;

    /* renamed from: b */
    private final C7603h8 f20332b;

    C7563d8(int i, C7603h8 h8Var) {
        this.f20331a = i;
        this.f20332b = h8Var;
    }

    public final Class<? extends Annotation> annotationType() {
        return C7613i8.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7613i8)) {
            return false;
        }
        C7613i8 i8Var = (C7613i8) obj;
        return this.f20331a == i8Var.zza() && this.f20332b.equals(i8Var.zzb());
    }

    public final int hashCode() {
        return (this.f20331a ^ 14552422) + (this.f20332b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f20331a + "intEncoding=" + this.f20332b + ')';
    }

    public final int zza() {
        return this.f20331a;
    }

    public final C7603h8 zzb() {
        return this.f20332b;
    }
}
