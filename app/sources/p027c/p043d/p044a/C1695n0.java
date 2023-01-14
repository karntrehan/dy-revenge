package p027c.p043d.p044a;

import java.util.Objects;

/* renamed from: c.d.a.n0 */
final class C1695n0 extends C1519c1 {

    /* renamed from: a */
    private final long f5098a;

    /* renamed from: b */
    private final long f5099b;

    /* renamed from: c */
    private final C1526e0 f5100c;

    C1695n0(long j, long j2, C1526e0 e0Var) {
        this.f5098a = j;
        this.f5099b = j2;
        Objects.requireNonNull(e0Var, "Null audioStats");
        this.f5100c = e0Var;
    }

    /* renamed from: a */
    public C1526e0 mo5630a() {
        return this.f5100c;
    }

    /* renamed from: b */
    public long mo5631b() {
        return this.f5099b;
    }

    /* renamed from: c */
    public long mo5632c() {
        return this.f5098a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1519c1)) {
            return false;
        }
        C1519c1 c1Var = (C1519c1) obj;
        return this.f5098a == c1Var.mo5632c() && this.f5099b == c1Var.mo5631b() && this.f5100c.equals(c1Var.mo5630a());
    }

    public int hashCode() {
        long j = this.f5098a;
        long j2 = this.f5099b;
        return this.f5100c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f5098a + ", numBytesRecorded=" + this.f5099b + ", audioStats=" + this.f5100c + "}";
    }
}
