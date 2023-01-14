package p027c.p043d.p044a;

import java.util.Objects;
import p027c.p043d.p044a.C1727y0;

/* renamed from: c.d.a.l0 */
final class C1565l0 extends C1727y0.C1729b {

    /* renamed from: j */
    private final int f4849j;

    /* renamed from: k */
    private final String f4850k;

    C1565l0(int i, String str) {
        this.f4849j = i;
        Objects.requireNonNull(str, "Null name");
        this.f4850k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo5724c() {
        return this.f4850k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo5725d() {
        return this.f4849j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1727y0.C1729b)) {
            return false;
        }
        C1727y0.C1729b bVar = (C1727y0.C1729b) obj;
        return this.f4849j == bVar.mo5725d() && this.f4850k.equals(bVar.mo5724c());
    }

    public int hashCode() {
        return ((this.f4849j ^ 1000003) * 1000003) ^ this.f4850k.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f4849j + ", name=" + this.f4850k + "}";
    }
}
