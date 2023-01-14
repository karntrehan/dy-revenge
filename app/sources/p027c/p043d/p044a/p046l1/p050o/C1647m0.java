package p027c.p043d.p044a.p046l1.p050o;

import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.p046l1.p050o.C1644l0;

/* renamed from: c.d.a.l1.o.m0 */
final class C1647m0 extends C1644l0 {

    /* renamed from: b */
    private final String f4971b;

    /* renamed from: c */
    private final int f4972c;

    /* renamed from: d */
    private final int f4973d;

    /* renamed from: e */
    private final int f4974e;

    /* renamed from: f */
    private final int f4975f;

    /* renamed from: c.d.a.l1.o.m0$b */
    static final class C1649b extends C1644l0.C1645a {

        /* renamed from: a */
        private String f4976a;

        /* renamed from: b */
        private Integer f4977b;

        /* renamed from: c */
        private Integer f4978c;

        /* renamed from: d */
        private Integer f4979d;

        /* renamed from: e */
        private Integer f4980e;

        C1649b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1644l0 mo5829a() {
            String str = this.f4976a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " mimeType";
            }
            if (this.f4977b == null) {
                str2 = str2 + " profile";
            }
            if (this.f4978c == null) {
                str2 = str2 + " bitrate";
            }
            if (this.f4979d == null) {
                str2 = str2 + " sampleRate";
            }
            if (this.f4980e == null) {
                str2 = str2 + " channelCount";
            }
            if (str2.isEmpty()) {
                return new C1647m0(this.f4976a, this.f4977b.intValue(), this.f4978c.intValue(), this.f4979d.intValue(), this.f4980e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: c */
        public C1644l0.C1645a mo5831c(int i) {
            this.f4978c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C1644l0.C1645a mo5832d(int i) {
            this.f4980e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C1644l0.C1645a mo5833e(String str) {
            Objects.requireNonNull(str, "Null mimeType");
            this.f4976a = str;
            return this;
        }

        /* renamed from: f */
        public C1644l0.C1645a mo5834f(int i) {
            this.f4977b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public C1644l0.C1645a mo5835g(int i) {
            this.f4979d = Integer.valueOf(i);
            return this;
        }
    }

    private C1647m0(String str, int i, int i2, int i3, int i4) {
        this.f4971b = str;
        this.f4972c = i;
        this.f4973d = i2;
        this.f4974e = i3;
        this.f4975f = i4;
    }

    /* renamed from: c */
    public int mo5824c() {
        return this.f4973d;
    }

    /* renamed from: d */
    public int mo5825d() {
        return this.f4975f;
    }

    /* renamed from: e */
    public String mo5826e() {
        return this.f4971b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1644l0)) {
            return false;
        }
        C1644l0 l0Var = (C1644l0) obj;
        return this.f4971b.equals(l0Var.mo5826e()) && this.f4972c == l0Var.mo5827f() && this.f4973d == l0Var.mo5824c() && this.f4974e == l0Var.mo5828g() && this.f4975f == l0Var.mo5825d();
    }

    /* renamed from: f */
    public int mo5827f() {
        return this.f4972c;
    }

    /* renamed from: g */
    public int mo5828g() {
        return this.f4974e;
    }

    public int hashCode() {
        return ((((((((this.f4971b.hashCode() ^ 1000003) * 1000003) ^ this.f4972c) * 1000003) ^ this.f4973d) * 1000003) ^ this.f4974e) * 1000003) ^ this.f4975f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f4971b + ", profile=" + this.f4972c + ", bitrate=" + this.f4973d + ", sampleRate=" + this.f4974e + ", channelCount=" + this.f4975f + "}";
    }
}
