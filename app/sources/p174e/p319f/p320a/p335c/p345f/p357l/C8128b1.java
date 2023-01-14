package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.b1 */
final class C8128b1<T> extends C8515w0<T> {

    /* renamed from: f */
    private final T f22083f;

    C8128b1(T t) {
        this.f22083f = t;
    }

    /* renamed from: a */
    public final T mo21672a() {
        return this.f22083f;
    }

    /* renamed from: b */
    public final boolean mo21673b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8128b1) {
            return this.f22083f.equals(((C8128b1) obj).f22083f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22083f.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22083f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
