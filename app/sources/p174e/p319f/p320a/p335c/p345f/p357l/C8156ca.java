package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.ca */
final class C8156ca extends C8194ea {

    /* renamed from: a */
    private final String f22156a;

    /* renamed from: b */
    private final boolean f22157b;

    /* renamed from: c */
    private final int f22158c;

    /* synthetic */ C8156ca(String str, boolean z, int i, C8118aa aaVar) {
        this.f22156a = str;
        this.f22157b = z;
        this.f22158c = i;
    }

    /* renamed from: a */
    public final int mo21704a() {
        return this.f22158c;
    }

    /* renamed from: b */
    public final String mo21705b() {
        return this.f22156a;
    }

    /* renamed from: c */
    public final boolean mo21706c() {
        return this.f22157b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8194ea) {
            C8194ea eaVar = (C8194ea) obj;
            return this.f22156a.equals(eaVar.mo21705b()) && this.f22157b == eaVar.mo21706c() && this.f22158c == eaVar.mo21704a();
        }
    }

    public final int hashCode() {
        return ((((this.f22156a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f22157b ? 1237 : 1231)) * 1000003) ^ this.f22158c;
    }

    public final String toString() {
        String str = this.f22156a;
        boolean z = this.f22157b;
        int i = this.f22158c;
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
