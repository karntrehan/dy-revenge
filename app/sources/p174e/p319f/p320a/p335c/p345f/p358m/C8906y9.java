package p174e.p319f.p320a.p335c.p345f.p358m;

/* renamed from: e.f.a.c.f.m.y9 */
final class C8906y9 extends C8597aa {

    /* renamed from: a */
    private final String f24244a;

    /* renamed from: b */
    private final boolean f24245b;

    /* renamed from: c */
    private final int f24246c;

    /* synthetic */ C8906y9(String str, boolean z, int i, C8882w9 w9Var) {
        this.f24244a = str;
        this.f24245b = z;
        this.f24246c = i;
    }

    /* renamed from: a */
    public final int mo22309a() {
        return this.f24246c;
    }

    /* renamed from: b */
    public final String mo22310b() {
        return this.f24244a;
    }

    /* renamed from: c */
    public final boolean mo22311c() {
        return this.f24245b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8597aa) {
            C8597aa aaVar = (C8597aa) obj;
            return this.f24244a.equals(aaVar.mo22310b()) && this.f24245b == aaVar.mo22311c() && this.f24246c == aaVar.mo22309a();
        }
    }

    public final int hashCode() {
        return ((((this.f24244a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f24245b ? 1237 : 1231)) * 1000003) ^ this.f24246c;
    }

    public final String toString() {
        String str = this.f24244a;
        boolean z = this.f24245b;
        int i = this.f24246c;
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
