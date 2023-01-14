package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Objects;

/* renamed from: e.f.a.c.f.i.pa */
final class C7381pa extends C7409ra {

    /* renamed from: a */
    private String f19838a;

    /* renamed from: b */
    private Boolean f19839b;

    /* renamed from: c */
    private Integer f19840c;

    C7381pa() {
    }

    /* renamed from: a */
    public final C7409ra mo20844a(boolean z) {
        this.f19839b = Boolean.TRUE;
        return this;
    }

    /* renamed from: b */
    public final C7409ra mo20845b(int i) {
        this.f19840c = 1;
        return this;
    }

    /* renamed from: c */
    public final C7423sa mo20846c() {
        Boolean bool;
        String str = this.f19838a;
        if (str != null && (bool = this.f19839b) != null && this.f19840c != null) {
            return new C7395qa(str, bool.booleanValue(), this.f19840c.intValue(), (C7367oa) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19838a == null) {
            sb.append(" libraryName");
        }
        if (this.f19839b == null) {
            sb.append(" enableFirelog");
        }
        if (this.f19840c == null) {
            sb.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: d */
    public final C7409ra mo20847d(String str) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f19838a = str;
        return this;
    }
}
