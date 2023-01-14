package p027c.p043d.p044a.p046l1.p049n;

import androidx.camera.core.impl.C0711a0;
import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.p046l1.p049n.C1612h;

/* renamed from: c.d.a.l1.n.g */
final class C1609g extends C1612h {

    /* renamed from: a */
    private final String f4913a;

    /* renamed from: b */
    private final int f4914b;

    /* renamed from: c */
    private final C0711a0 f4915c;

    /* renamed from: c.d.a.l1.n.g$b */
    static final class C1611b extends C1612h.C1613a {

        /* renamed from: a */
        private String f4916a;

        /* renamed from: b */
        private Integer f4917b;

        /* renamed from: c */
        private C0711a0 f4918c;

        C1611b() {
        }

        /* renamed from: a */
        public C1612h mo5781a() {
            String str = this.f4916a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " mimeType";
            }
            if (this.f4917b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new C1609g(this.f4916a, this.f4917b.intValue(), this.f4918c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C1612h.C1613a mo5782b(C0711a0 a0Var) {
            this.f4918c = a0Var;
            return this;
        }

        /* renamed from: c */
        public C1612h.C1613a mo5783c(int i) {
            this.f4917b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C1612h.C1613a mo5784d(String str) {
            Objects.requireNonNull(str, "Null mimeType");
            this.f4916a = str;
            return this;
        }
    }

    private C1609g(String str, int i, C0711a0 a0Var) {
        this.f4913a = str;
        this.f4914b = i;
        this.f4915c = a0Var;
    }

    /* renamed from: b */
    public C0711a0 mo5775b() {
        return this.f4915c;
    }

    /* renamed from: c */
    public String mo5776c() {
        return this.f4913a;
    }

    /* renamed from: d */
    public int mo5777d() {
        return this.f4914b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1612h)) {
            return false;
        }
        C1612h hVar = (C1612h) obj;
        if (this.f4913a.equals(hVar.mo5776c()) && this.f4914b == hVar.mo5777d()) {
            C0711a0 a0Var = this.f4915c;
            C0711a0 b = hVar.mo5775b();
            if (a0Var == null) {
                if (b == null) {
                    return true;
                }
            } else if (a0Var.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f4913a.hashCode() ^ 1000003) * 1000003) ^ this.f4914b) * 1000003;
        C0711a0 a0Var = this.f4915c;
        return hashCode ^ (a0Var == null ? 0 : a0Var.hashCode());
    }

    public String toString() {
        return "MimeInfo{mimeType=" + this.f4913a + ", profile=" + this.f4914b + ", compatibleCamcorderProfile=" + this.f4915c + "}";
    }
}
