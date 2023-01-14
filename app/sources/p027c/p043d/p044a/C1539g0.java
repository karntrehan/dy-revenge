package p027c.p043d.p044a;

/* renamed from: c.d.a.g0 */
final class C1539g0 extends C1526e0 {

    /* renamed from: b */
    private final int f4812b;

    /* renamed from: c */
    private final Throwable f4813c;

    C1539g0(int i, Throwable th) {
        this.f4812b = i;
        this.f4813c = th;
    }

    /* renamed from: a */
    public int mo5647a() {
        return this.f4812b;
    }

    /* renamed from: b */
    public Throwable mo5648b() {
        return this.f4813c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1526e0)) {
            return false;
        }
        C1526e0 e0Var = (C1526e0) obj;
        if (this.f4812b == e0Var.mo5647a()) {
            Throwable th = this.f4813c;
            Throwable b = e0Var.mo5648b();
            if (th == null) {
                if (b == null) {
                    return true;
                }
            } else if (th.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f4812b ^ 1000003) * 1000003;
        Throwable th = this.f4813c;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f4812b + ", errorCause=" + this.f4813c + "}";
    }
}
