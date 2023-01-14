package p174e.p319f.p320a.p335c.p345f.p355j;

/* renamed from: e.f.a.c.f.j.x6 */
final class C7749x6 extends C7767z6 {

    /* renamed from: a */
    private final String f20857a;

    /* renamed from: b */
    private final boolean f20858b;

    /* renamed from: c */
    private final int f20859c;

    /* synthetic */ C7749x6(String str, boolean z, int i, C7731v6 v6Var) {
        this.f20857a = str;
        this.f20858b = z;
        this.f20859c = i;
    }

    /* renamed from: a */
    public final int mo21189a() {
        return this.f20859c;
    }

    /* renamed from: b */
    public final String mo21190b() {
        return this.f20857a;
    }

    /* renamed from: c */
    public final boolean mo21191c() {
        return this.f20858b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7767z6) {
            C7767z6 z6Var = (C7767z6) obj;
            return this.f20857a.equals(z6Var.mo21190b()) && this.f20858b == z6Var.mo21191c() && this.f20859c == z6Var.mo21189a();
        }
    }

    public final int hashCode() {
        return ((((this.f20857a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20858b ? 1237 : 1231)) * 1000003) ^ this.f20859c;
    }

    public final String toString() {
        String str = this.f20857a;
        boolean z = this.f20858b;
        int i = this.f20859c;
        StringBuilder sb = new StringBuilder(str.length() + 84);
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
