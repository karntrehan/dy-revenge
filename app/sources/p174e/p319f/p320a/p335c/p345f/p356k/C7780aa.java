package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Objects;

/* renamed from: e.f.a.c.f.k.aa */
final class C7780aa extends C7806ca {

    /* renamed from: a */
    private String f21095a;

    /* renamed from: b */
    private Boolean f21096b;

    /* renamed from: c */
    private Integer f21097c;

    C7780aa() {
    }

    /* renamed from: a */
    public final C7806ca mo21224a(boolean z) {
        this.f21096b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C7806ca mo21225b(int i) {
        this.f21097c = 1;
        return this;
    }

    /* renamed from: c */
    public final C7819da mo21226c() {
        Boolean bool;
        String str = this.f21095a;
        if (str != null && (bool = this.f21096b) != null && this.f21097c != null) {
            return new C7793ba(str, bool.booleanValue(), this.f21097c.intValue(), (C8104z9) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21095a == null) {
            sb.append(" libraryName");
        }
        if (this.f21096b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f21097c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C7806ca mo21227d(String str) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f21095a = str;
        return this;
    }
}
