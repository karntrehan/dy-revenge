package p027c.p043d.p044a.p046l1;

import okhttp3.HttpUrl;
import p027c.p043d.p044a.p046l1.C1572g;

/* renamed from: c.d.a.l1.i */
final class C1582i extends C1572g.C1579g {

    /* renamed from: a */
    private final int f4886a;

    /* renamed from: b */
    private final int f4887b;

    /* renamed from: c */
    private final int f4888c;

    /* renamed from: d */
    private final int f4889d;

    /* renamed from: c.d.a.l1.i$b */
    static final class C1584b extends C1572g.C1579g.C1580a {

        /* renamed from: a */
        private Integer f4890a;

        /* renamed from: b */
        private Integer f4891b;

        /* renamed from: c */
        private Integer f4892c;

        /* renamed from: d */
        private Integer f4893d;

        C1584b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1572g.C1579g mo5757a() {
            Integer num = this.f4890a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = str + " audioSource";
            }
            if (this.f4891b == null) {
                str = str + " sampleRate";
            }
            if (this.f4892c == null) {
                str = str + " channelCount";
            }
            if (this.f4893d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C1582i(this.f4890a.intValue(), this.f4891b.intValue(), this.f4892c.intValue(), this.f4893d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: c */
        public C1572g.C1579g.C1580a mo5759c(int i) {
            this.f4893d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C1572g.C1579g.C1580a mo5760d(int i) {
            this.f4890a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C1572g.C1579g.C1580a mo5761e(int i) {
            this.f4892c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C1572g.C1579g.C1580a mo5762f(int i) {
            this.f4891b = Integer.valueOf(i);
            return this;
        }
    }

    private C1582i(int i, int i2, int i3, int i4) {
        this.f4886a = i;
        this.f4887b = i2;
        this.f4888c = i3;
        this.f4889d = i4;
    }

    /* renamed from: b */
    public int mo5753b() {
        return this.f4889d;
    }

    /* renamed from: c */
    public int mo5754c() {
        return this.f4886a;
    }

    /* renamed from: d */
    public int mo5755d() {
        return this.f4888c;
    }

    /* renamed from: e */
    public int mo5756e() {
        return this.f4887b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1572g.C1579g)) {
            return false;
        }
        C1572g.C1579g gVar = (C1572g.C1579g) obj;
        return this.f4886a == gVar.mo5754c() && this.f4887b == gVar.mo5756e() && this.f4888c == gVar.mo5755d() && this.f4889d == gVar.mo5753b();
    }

    public int hashCode() {
        return ((((((this.f4886a ^ 1000003) * 1000003) ^ this.f4887b) * 1000003) ^ this.f4888c) * 1000003) ^ this.f4889d;
    }

    public String toString() {
        return "Settings{audioSource=" + this.f4886a + ", sampleRate=" + this.f4887b + ", channelCount=" + this.f4888c + ", audioFormat=" + this.f4889d + "}";
    }
}
