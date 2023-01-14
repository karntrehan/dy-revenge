package p174e.p319f.p320a.p335c.p345f.p353h;

/* renamed from: e.f.a.c.f.h.p */
final class C7141p extends C7143r {

    /* renamed from: a */
    private final String f19114a;

    /* renamed from: b */
    private final boolean f19115b;

    /* renamed from: c */
    private final int f19116c;

    /* synthetic */ C7141p(String str, boolean z, int i, C7139n nVar) {
        this.f19114a = str;
        this.f19115b = z;
        this.f19116c = i;
    }

    /* renamed from: a */
    public final int mo20549a() {
        return this.f19116c;
    }

    /* renamed from: b */
    public final String mo20550b() {
        return this.f19114a;
    }

    /* renamed from: c */
    public final boolean mo20551c() {
        return this.f19115b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7143r) {
            C7143r rVar = (C7143r) obj;
            return this.f19114a.equals(rVar.mo20550b()) && this.f19115b == rVar.mo20551c() && this.f19116c == rVar.mo20549a();
        }
    }

    public final int hashCode() {
        return ((((this.f19114a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19115b ? 1237 : 1231)) * 1000003) ^ this.f19116c;
    }

    public final String toString() {
        String str = this.f19114a;
        boolean z = this.f19115b;
        int i = this.f19116c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84);
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
