package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Objects;

/* renamed from: e.f.a.c.f.m.x9 */
final class C8894x9 extends C8918z9 {

    /* renamed from: a */
    private String f24219a;

    /* renamed from: b */
    private Boolean f24220b;

    /* renamed from: c */
    private Integer f24221c;

    C8894x9() {
    }

    /* renamed from: a */
    public final C8918z9 mo22698a(boolean z) {
        this.f24220b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C8918z9 mo22699b(int i) {
        this.f24221c = 1;
        return this;
    }

    /* renamed from: c */
    public final C8597aa mo22700c() {
        Boolean bool;
        String str = this.f24219a;
        if (str != null && (bool = this.f24220b) != null && this.f24221c != null) {
            return new C8906y9(str, bool.booleanValue(), this.f24221c.intValue(), (C8882w9) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24219a == null) {
            sb.append(" libraryName");
        }
        if (this.f24220b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f24221c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C8918z9 mo22701d(String str) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f24219a = str;
        return this;
    }
}
