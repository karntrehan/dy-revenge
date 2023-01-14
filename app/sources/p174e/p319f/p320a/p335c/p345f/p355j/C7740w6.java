package p174e.p319f.p320a.p335c.p345f.p355j;

/* renamed from: e.f.a.c.f.j.w6 */
final class C7740w6 extends C7758y6 {

    /* renamed from: a */
    private String f20836a;

    /* renamed from: b */
    private Boolean f20837b;

    /* renamed from: c */
    private Integer f20838c;

    C7740w6() {
    }

    /* renamed from: a */
    public final C7758y6 mo21181a(boolean z) {
        this.f20837b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C7758y6 mo21182b(int i) {
        this.f20838c = 1;
        return this;
    }

    /* renamed from: c */
    public final C7767z6 mo21183c() {
        Boolean bool;
        String str = this.f20836a;
        if (str != null && (bool = this.f20837b) != null && this.f20838c != null) {
            return new C7749x6(str, bool.booleanValue(), this.f20838c.intValue(), (C7731v6) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f20836a == null) {
            sb.append(" libraryName");
        }
        if (this.f20837b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f20838c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C7758y6 mo21184d(String str) {
        this.f20836a = "vision-common";
        return this;
    }
}
