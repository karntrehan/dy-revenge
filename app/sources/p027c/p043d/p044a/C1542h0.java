package p027c.p043d.p044a;

import java.util.Objects;
import p027c.p043d.p044a.C1703q0;

/* renamed from: c.d.a.h0 */
final class C1542h0 extends C1703q0.C1705b {

    /* renamed from: b */
    private final C1727y0 f4816b;

    /* renamed from: c */
    private final int f4817c;

    C1542h0(C1727y0 y0Var, int i) {
        Objects.requireNonNull(y0Var, "Null fallbackQuality");
        this.f4816b = y0Var;
        this.f4817c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1727y0 mo5677c() {
        return this.f4816b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo5678d() {
        return this.f4817c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1703q0.C1705b)) {
            return false;
        }
        C1703q0.C1705b bVar = (C1703q0.C1705b) obj;
        return this.f4816b.equals(bVar.mo5677c()) && this.f4817c == bVar.mo5678d();
    }

    public int hashCode() {
        return ((this.f4816b.hashCode() ^ 1000003) * 1000003) ^ this.f4817c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f4816b + ", fallbackRule=" + this.f4817c + "}";
    }
}
