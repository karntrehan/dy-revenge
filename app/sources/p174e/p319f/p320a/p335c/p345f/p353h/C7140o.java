package p174e.p319f.p320a.p335c.p345f.p353h;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.h.o */
final class C7140o extends C7142q {

    /* renamed from: a */
    private String f19111a;

    /* renamed from: b */
    private Boolean f19112b;

    /* renamed from: c */
    private Integer f19113c;

    C7140o() {
    }

    /* renamed from: a */
    public final C7142q mo20545a(boolean z) {
        this.f19112b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C7142q mo20546b(int i) {
        this.f19113c = 1;
        return this;
    }

    /* renamed from: c */
    public final C7143r mo20547c() {
        String str = this.f19111a == null ? " libraryName" : HttpUrl.FRAGMENT_ENCODE_SET;
        if (this.f19112b == null) {
            str = str.concat(" enableFirelog");
        }
        if (this.f19113c == null) {
            str = String.valueOf(str).concat(" firelogEventType");
        }
        if (str.isEmpty()) {
            return new C7141p(this.f19111a, this.f19112b.booleanValue(), this.f19113c.intValue(), (C7139n) null);
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    /* renamed from: d */
    public final C7142q mo20548d(String str) {
        this.f19111a = "common";
        return this;
    }
}
