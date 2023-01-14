package p174e.p319f.p320a.p335c.p345f.p356k;

/* renamed from: e.f.a.c.f.k.ba */
final class C7793ba extends C7819da {

    /* renamed from: a */
    private final String f21253a;

    /* renamed from: b */
    private final boolean f21254b;

    /* renamed from: c */
    private final int f21255c;

    /* synthetic */ C7793ba(String str, boolean z, int i, C8104z9 z9Var) {
        this.f21253a = str;
        this.f21254b = z;
        this.f21255c = i;
    }

    /* renamed from: a */
    public final int mo21231a() {
        return this.f21255c;
    }

    /* renamed from: b */
    public final String mo21232b() {
        return this.f21253a;
    }

    /* renamed from: c */
    public final boolean mo21233c() {
        return this.f21254b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7819da) {
            C7819da daVar = (C7819da) obj;
            return this.f21253a.equals(daVar.mo21232b()) && this.f21254b == daVar.mo21233c() && this.f21255c == daVar.mo21231a();
        }
    }

    public final int hashCode() {
        return ((((this.f21253a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f21254b ? 1237 : 1231)) * 1000003) ^ this.f21255c;
    }

    public final String toString() {
        String str = this.f21253a;
        boolean z = this.f21254b;
        int i = this.f21255c;
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
