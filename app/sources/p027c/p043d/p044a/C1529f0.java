package p027c.p043d.p044a;

import android.util.Range;
import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.C1521d0;

/* renamed from: c.d.a.f0 */
final class C1529f0 extends C1521d0 {

    /* renamed from: d */
    private final Range<Integer> f4785d;

    /* renamed from: e */
    private final int f4786e;

    /* renamed from: f */
    private final int f4787f;

    /* renamed from: g */
    private final Range<Integer> f4788g;

    /* renamed from: h */
    private final int f4789h;

    /* renamed from: c.d.a.f0$b */
    static final class C1531b extends C1521d0.C1522a {

        /* renamed from: a */
        private Range<Integer> f4790a;

        /* renamed from: b */
        private Integer f4791b;

        /* renamed from: c */
        private Integer f4792c;

        /* renamed from: d */
        private Range<Integer> f4793d;

        /* renamed from: e */
        private Integer f4794e;

        C1531b() {
        }

        /* renamed from: a */
        public C1521d0 mo5639a() {
            Range<Integer> range = this.f4790a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (range == null) {
                str = str + " bitrate";
            }
            if (this.f4791b == null) {
                str = str + " sourceFormat";
            }
            if (this.f4792c == null) {
                str = str + " source";
            }
            if (this.f4793d == null) {
                str = str + " sampleRate";
            }
            if (this.f4794e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C1529f0(this.f4790a, this.f4791b.intValue(), this.f4792c.intValue(), this.f4793d, this.f4794e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C1521d0.C1522a mo5640b(Range<Integer> range) {
            Objects.requireNonNull(range, "Null bitrate");
            this.f4790a = range;
            return this;
        }

        /* renamed from: c */
        public C1521d0.C1522a mo5641c(int i) {
            this.f4794e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C1521d0.C1522a mo5642d(Range<Integer> range) {
            Objects.requireNonNull(range, "Null sampleRate");
            this.f4793d = range;
            return this;
        }

        /* renamed from: e */
        public C1521d0.C1522a mo5643e(int i) {
            this.f4792c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C1521d0.C1522a mo5655f(int i) {
            this.f4791b = Integer.valueOf(i);
            return this;
        }
    }

    private C1529f0(Range<Integer> range, int i, int i2, Range<Integer> range2, int i3) {
        this.f4785d = range;
        this.f4786e = i;
        this.f4787f = i2;
        this.f4788g = range2;
        this.f4789h = i3;
    }

    /* renamed from: b */
    public Range<Integer> mo5634b() {
        return this.f4785d;
    }

    /* renamed from: c */
    public int mo5635c() {
        return this.f4789h;
    }

    /* renamed from: d */
    public Range<Integer> mo5636d() {
        return this.f4788g;
    }

    /* renamed from: e */
    public int mo5637e() {
        return this.f4787f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1521d0)) {
            return false;
        }
        C1521d0 d0Var = (C1521d0) obj;
        return this.f4785d.equals(d0Var.mo5634b()) && this.f4786e == d0Var.mo5638f() && this.f4787f == d0Var.mo5637e() && this.f4788g.equals(d0Var.mo5636d()) && this.f4789h == d0Var.mo5635c();
    }

    /* renamed from: f */
    public int mo5638f() {
        return this.f4786e;
    }

    public int hashCode() {
        return ((((((((this.f4785d.hashCode() ^ 1000003) * 1000003) ^ this.f4786e) * 1000003) ^ this.f4787f) * 1000003) ^ this.f4788g.hashCode()) * 1000003) ^ this.f4789h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f4785d + ", sourceFormat=" + this.f4786e + ", source=" + this.f4787f + ", sampleRate=" + this.f4788g + ", channelCount=" + this.f4789h + "}";
    }
}
