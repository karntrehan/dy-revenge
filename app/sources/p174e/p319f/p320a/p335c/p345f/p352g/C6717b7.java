package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.b7 */
final class C6717b7 extends C6700a7 {

    /* renamed from: f */
    private final Object f18381f;

    C6717b7(Object obj) {
        this.f18381f = obj;
    }

    /* renamed from: a */
    public final Object mo19513a() {
        return this.f18381f;
    }

    /* renamed from: b */
    public final boolean mo19514b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6717b7) {
            return this.f18381f.equals(((C6717b7) obj).f18381f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18381f.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f18381f + ")";
    }
}
