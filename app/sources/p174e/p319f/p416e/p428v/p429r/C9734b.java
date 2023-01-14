package p174e.p319f.p416e.p428v.p429r;

/* renamed from: e.f.e.v.r.b */
public class C9734b {

    /* renamed from: a */
    private final int f26086a;

    /* renamed from: b */
    private final int f26087b;

    public C9734b(int i, int i2) {
        this.f26086a = i;
        this.f26087b = i2;
    }

    /* renamed from: a */
    public final int mo24365a() {
        return this.f26087b;
    }

    /* renamed from: b */
    public final int mo24366b() {
        return this.f26086a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9734b)) {
            return false;
        }
        C9734b bVar = (C9734b) obj;
        return this.f26086a == bVar.f26086a && this.f26087b == bVar.f26087b;
    }

    public final int hashCode() {
        return this.f26086a ^ this.f26087b;
    }

    public final String toString() {
        return this.f26086a + "(" + this.f26087b + ')';
    }
}
