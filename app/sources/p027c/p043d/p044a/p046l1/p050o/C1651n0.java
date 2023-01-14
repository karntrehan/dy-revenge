package p027c.p043d.p044a.p046l1.p050o;

import android.util.Size;
import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.p046l1.p050o.C1625c1;

/* renamed from: c.d.a.l1.o.n0 */
final class C1651n0 extends C1625c1 {

    /* renamed from: b */
    private final String f4983b;

    /* renamed from: c */
    private final int f4984c;

    /* renamed from: d */
    private final Size f4985d;

    /* renamed from: e */
    private final int f4986e;

    /* renamed from: f */
    private final int f4987f;

    /* renamed from: g */
    private final int f4988g;

    /* renamed from: h */
    private final int f4989h;

    /* renamed from: c.d.a.l1.o.n0$b */
    static final class C1653b extends C1625c1.C1626a {

        /* renamed from: a */
        private String f4990a;

        /* renamed from: b */
        private Integer f4991b;

        /* renamed from: c */
        private Size f4992c;

        /* renamed from: d */
        private Integer f4993d;

        /* renamed from: e */
        private Integer f4994e;

        /* renamed from: f */
        private Integer f4995f;

        /* renamed from: g */
        private Integer f4996g;

        C1653b() {
        }

        /* renamed from: a */
        public C1625c1 mo5801a() {
            String str = this.f4990a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " mimeType";
            }
            if (this.f4991b == null) {
                str2 = str2 + " profile";
            }
            if (this.f4992c == null) {
                str2 = str2 + " resolution";
            }
            if (this.f4993d == null) {
                str2 = str2 + " colorFormat";
            }
            if (this.f4994e == null) {
                str2 = str2 + " frameRate";
            }
            if (this.f4995f == null) {
                str2 = str2 + " IFrameInterval";
            }
            if (this.f4996g == null) {
                str2 = str2 + " bitrate";
            }
            if (str2.isEmpty()) {
                return new C1651n0(this.f4990a, this.f4991b.intValue(), this.f4992c, this.f4993d.intValue(), this.f4994e.intValue(), this.f4995f.intValue(), this.f4996g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C1625c1.C1626a mo5802b(int i) {
            this.f4996g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C1625c1.C1626a mo5803c(int i) {
            this.f4993d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C1625c1.C1626a mo5804d(int i) {
            this.f4994e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C1625c1.C1626a mo5805e(int i) {
            this.f4995f = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C1625c1.C1626a mo5806f(String str) {
            Objects.requireNonNull(str, "Null mimeType");
            this.f4990a = str;
            return this;
        }

        /* renamed from: g */
        public C1625c1.C1626a mo5807g(Size size) {
            Objects.requireNonNull(size, "Null resolution");
            this.f4992c = size;
            return this;
        }

        /* renamed from: h */
        public C1625c1.C1626a mo5843h(int i) {
            this.f4991b = Integer.valueOf(i);
            return this;
        }
    }

    private C1651n0(String str, int i, Size size, int i2, int i3, int i4, int i5) {
        this.f4983b = str;
        this.f4984c = i;
        this.f4985d = size;
        this.f4986e = i2;
        this.f4987f = i3;
        this.f4988g = i4;
        this.f4989h = i5;
    }

    /* renamed from: c */
    public int mo5794c() {
        return this.f4989h;
    }

    /* renamed from: d */
    public int mo5795d() {
        return this.f4986e;
    }

    /* renamed from: e */
    public int mo5796e() {
        return this.f4987f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1625c1)) {
            return false;
        }
        C1625c1 c1Var = (C1625c1) obj;
        return this.f4983b.equals(c1Var.mo5798g()) && this.f4984c == c1Var.mo5799h() && this.f4985d.equals(c1Var.mo5800i()) && this.f4986e == c1Var.mo5795d() && this.f4987f == c1Var.mo5796e() && this.f4988g == c1Var.mo5797f() && this.f4989h == c1Var.mo5794c();
    }

    /* renamed from: f */
    public int mo5797f() {
        return this.f4988g;
    }

    /* renamed from: g */
    public String mo5798g() {
        return this.f4983b;
    }

    /* renamed from: h */
    public int mo5799h() {
        return this.f4984c;
    }

    public int hashCode() {
        return ((((((((((((this.f4983b.hashCode() ^ 1000003) * 1000003) ^ this.f4984c) * 1000003) ^ this.f4985d.hashCode()) * 1000003) ^ this.f4986e) * 1000003) ^ this.f4987f) * 1000003) ^ this.f4988g) * 1000003) ^ this.f4989h;
    }

    /* renamed from: i */
    public Size mo5800i() {
        return this.f4985d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f4983b + ", profile=" + this.f4984c + ", resolution=" + this.f4985d + ", colorFormat=" + this.f4986e + ", frameRate=" + this.f4987f + ", IFrameInterval=" + this.f4988g + ", bitrate=" + this.f4989h + "}";
    }
}
