package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.z0 */
final class C10852z0 implements C10727i1 {

    /* renamed from: f */
    private final boolean f28409f;

    public C10852z0(boolean z) {
        this.f28409f = z;
    }

    /* renamed from: b */
    public boolean mo26676b() {
        return this.f28409f;
    }

    /* renamed from: c */
    public C10853z1 mo26677c() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo26676b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
