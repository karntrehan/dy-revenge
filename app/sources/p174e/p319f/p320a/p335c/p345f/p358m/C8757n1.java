package p174e.p319f.p320a.p335c.p345f.p358m;

import java.lang.annotation.Annotation;

/* renamed from: e.f.a.c.f.m.n1 */
final class C8757n1 implements C8822s1 {

    /* renamed from: a */
    private final int f23930a;

    /* renamed from: b */
    private final C8809r1 f23931b;

    C8757n1(int i, C8809r1 r1Var) {
        this.f23930a = i;
        this.f23931b = r1Var;
    }

    public final Class<? extends Annotation> annotationType() {
        return C8822s1.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8822s1)) {
            return false;
        }
        C8822s1 s1Var = (C8822s1) obj;
        return this.f23930a == s1Var.zza() && this.f23931b.equals(s1Var.zzb());
    }

    public final int hashCode() {
        return (this.f23930a ^ 14552422) + (this.f23931b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f23930a + "intEncoding=" + this.f23931b + ')';
    }

    public final int zza() {
        return this.f23930a;
    }

    public final C8809r1 zzb() {
        return this.f23931b;
    }
}
