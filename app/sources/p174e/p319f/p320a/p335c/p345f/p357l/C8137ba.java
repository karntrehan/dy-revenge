package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.ba */
final class C8137ba extends C8175da {

    /* renamed from: a */
    private String f22111a;

    /* renamed from: b */
    private Boolean f22112b;

    /* renamed from: c */
    private Integer f22113c;

    C8137ba() {
    }

    /* renamed from: a */
    public final C8175da mo21683a(boolean z) {
        this.f22112b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C8175da mo21684b(int i) {
        this.f22113c = 1;
        return this;
    }

    /* renamed from: c */
    public final C8194ea mo21685c() {
        Boolean bool;
        String str = this.f22111a;
        if (str != null && (bool = this.f22112b) != null && this.f22113c != null) {
            return new C8156ca(str, bool.booleanValue(), this.f22113c.intValue(), (C8118aa) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22111a == null) {
            sb.append(" libraryName");
        }
        if (this.f22112b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f22113c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C8175da mo21686d(String str) {
        this.f22111a = "optional-module-face";
        return this;
    }
}
