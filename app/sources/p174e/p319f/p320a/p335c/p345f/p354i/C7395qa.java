package p174e.p319f.p320a.p335c.p345f.p354i;

/* renamed from: e.f.a.c.f.i.qa */
final class C7395qa extends C7423sa {

    /* renamed from: a */
    private final String f19874a;

    /* renamed from: b */
    private final boolean f19875b;

    /* renamed from: c */
    private final int f19876c;

    /* synthetic */ C7395qa(String str, boolean z, int i, C7367oa oaVar) {
        this.f19874a = str;
        this.f19875b = z;
        this.f19876c = i;
    }

    /* renamed from: a */
    public final int mo20864a() {
        return this.f19876c;
    }

    /* renamed from: b */
    public final String mo20865b() {
        return this.f19874a;
    }

    /* renamed from: c */
    public final boolean mo20866c() {
        return this.f19875b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7423sa) {
            C7423sa saVar = (C7423sa) obj;
            return this.f19874a.equals(saVar.mo20865b()) && this.f19875b == saVar.mo20866c() && this.f19876c == saVar.mo20864a();
        }
    }

    public final int hashCode() {
        return ((((this.f19874a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19875b ? 1237 : 1231)) * 1000003) ^ this.f19876c;
    }

    public final String toString() {
        String str = this.f19874a;
        boolean z = this.f19875b;
        int i = this.f19876c;
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
