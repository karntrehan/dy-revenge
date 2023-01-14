package p027c.p043d.p044a;

import java.util.Objects;
import p027c.p043d.p044a.C1523d1;

/* renamed from: c.d.a.o0 */
final class C1697o0 extends C1523d1 {

    /* renamed from: d */
    private final Integer f5103d;

    /* renamed from: e */
    private final C1523d1.C1524a f5104e;

    C1697o0(Integer num, C1523d1.C1524a aVar) {
        Objects.requireNonNull(num, "Null id");
        this.f5103d = num;
        Objects.requireNonNull(aVar, "Null streamState");
        this.f5104e = aVar;
    }

    /* renamed from: a */
    public Integer mo5644a() {
        return this.f5103d;
    }

    /* renamed from: b */
    public C1523d1.C1524a mo5645b() {
        return this.f5104e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1523d1)) {
            return false;
        }
        C1523d1 d1Var = (C1523d1) obj;
        return this.f5103d.equals(d1Var.mo5644a()) && this.f5104e.equals(d1Var.mo5645b());
    }

    public int hashCode() {
        return ((this.f5103d.hashCode() ^ 1000003) * 1000003) ^ this.f5104e.hashCode();
    }

    public String toString() {
        return "StreamInfo{id=" + this.f5103d + ", streamState=" + this.f5104e + "}";
    }
}
