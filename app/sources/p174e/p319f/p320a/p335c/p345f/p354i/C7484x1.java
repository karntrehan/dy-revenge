package p174e.p319f.p320a.p335c.p345f.p354i;

import java.lang.annotation.Annotation;

/* renamed from: e.f.a.c.f.i.x1 */
final class C7484x1 implements C7200d2 {

    /* renamed from: a */
    private final int f20106a;

    /* renamed from: b */
    private final C7170b2 f20107b;

    C7484x1(int i, C7170b2 b2Var) {
        this.f20106a = i;
        this.f20107b = b2Var;
    }

    public final Class<? extends Annotation> annotationType() {
        return C7200d2.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7200d2)) {
            return false;
        }
        C7200d2 d2Var = (C7200d2) obj;
        return this.f20106a == d2Var.zza() && this.f20107b.equals(d2Var.zzb());
    }

    public final int hashCode() {
        return (this.f20106a ^ 14552422) + (this.f20107b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f20106a + "intEncoding=" + this.f20107b + ')';
    }

    public final int zza() {
        return this.f20106a;
    }

    public final C7170b2 zzb() {
        return this.f20107b;
    }
}
