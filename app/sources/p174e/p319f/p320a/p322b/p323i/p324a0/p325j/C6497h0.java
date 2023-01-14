package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import java.util.Objects;
import p174e.p319f.p320a.p322b.p323i.C6573j;
import p174e.p319f.p320a.p322b.p323i.C6583p;

/* renamed from: e.f.a.b.i.a0.j.h0 */
final class C6497h0 extends C6519q0 {

    /* renamed from: a */
    private final long f18059a;

    /* renamed from: b */
    private final C6583p f18060b;

    /* renamed from: c */
    private final C6573j f18061c;

    C6497h0(long j, C6583p pVar, C6573j jVar) {
        this.f18059a = j;
        Objects.requireNonNull(pVar, "Null transportContext");
        this.f18060b = pVar;
        Objects.requireNonNull(jVar, "Null event");
        this.f18061c = jVar;
    }

    /* renamed from: b */
    public C6573j mo19270b() {
        return this.f18061c;
    }

    /* renamed from: c */
    public long mo19271c() {
        return this.f18059a;
    }

    /* renamed from: d */
    public C6583p mo19272d() {
        return this.f18060b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6519q0)) {
            return false;
        }
        C6519q0 q0Var = (C6519q0) obj;
        return this.f18059a == q0Var.mo19271c() && this.f18060b.equals(q0Var.mo19272d()) && this.f18061c.equals(q0Var.mo19270b());
    }

    public int hashCode() {
        long j = this.f18059a;
        return this.f18061c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f18060b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f18059a + ", transportContext=" + this.f18060b + ", event=" + this.f18061c + "}";
    }
}
