package p027c.p043d.p044a;

import android.util.Range;
import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.C1559j1;

/* renamed from: c.d.a.p0 */
final class C1699p0 extends C1559j1 {

    /* renamed from: d */
    private final C1731z0 f5106d;

    /* renamed from: e */
    private final Range<Integer> f5107e;

    /* renamed from: f */
    private final Range<Integer> f5108f;

    /* renamed from: g */
    private final int f5109g;

    /* renamed from: c.d.a.p0$b */
    static final class C1701b extends C1559j1.C1560a {

        /* renamed from: a */
        private C1731z0 f5110a;

        /* renamed from: b */
        private Range<Integer> f5111b;

        /* renamed from: c */
        private Range<Integer> f5112c;

        /* renamed from: d */
        private Integer f5113d;

        C1701b() {
        }

        private C1701b(C1559j1 j1Var) {
            this.f5110a = j1Var.mo5712e();
            this.f5111b = j1Var.mo5711d();
            this.f5112c = j1Var.mo5710c();
            this.f5113d = Integer.valueOf(j1Var.mo5709b());
        }

        /* renamed from: a */
        public C1559j1 mo5714a() {
            C1731z0 z0Var = this.f5110a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (z0Var == null) {
                str = str + " qualitySelector";
            }
            if (this.f5111b == null) {
                str = str + " frameRate";
            }
            if (this.f5112c == null) {
                str = str + " bitrate";
            }
            if (this.f5113d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C1699p0(this.f5110a, this.f5111b, this.f5112c, this.f5113d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1559j1.C1560a mo5715b(int i) {
            this.f5113d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C1559j1.C1560a mo5716c(Range<Integer> range) {
            Objects.requireNonNull(range, "Null bitrate");
            this.f5112c = range;
            return this;
        }

        /* renamed from: d */
        public C1559j1.C1560a mo5717d(Range<Integer> range) {
            Objects.requireNonNull(range, "Null frameRate");
            this.f5111b = range;
            return this;
        }

        /* renamed from: e */
        public C1559j1.C1560a mo5718e(C1731z0 z0Var) {
            Objects.requireNonNull(z0Var, "Null qualitySelector");
            this.f5110a = z0Var;
            return this;
        }
    }

    private C1699p0(C1731z0 z0Var, Range<Integer> range, Range<Integer> range2, int i) {
        this.f5106d = z0Var;
        this.f5107e = range;
        this.f5108f = range2;
        this.f5109g = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo5709b() {
        return this.f5109g;
    }

    /* renamed from: c */
    public Range<Integer> mo5710c() {
        return this.f5108f;
    }

    /* renamed from: d */
    public Range<Integer> mo5711d() {
        return this.f5107e;
    }

    /* renamed from: e */
    public C1731z0 mo5712e() {
        return this.f5106d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1559j1)) {
            return false;
        }
        C1559j1 j1Var = (C1559j1) obj;
        return this.f5106d.equals(j1Var.mo5712e()) && this.f5107e.equals(j1Var.mo5711d()) && this.f5108f.equals(j1Var.mo5710c()) && this.f5109g == j1Var.mo5709b();
    }

    /* renamed from: f */
    public C1559j1.C1560a mo5713f() {
        return new C1701b(this);
    }

    public int hashCode() {
        return ((((((this.f5106d.hashCode() ^ 1000003) * 1000003) ^ this.f5107e.hashCode()) * 1000003) ^ this.f5108f.hashCode()) * 1000003) ^ this.f5109g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f5106d + ", frameRate=" + this.f5107e + ", bitrate=" + this.f5108f + ", aspectRatio=" + this.f5109g + "}";
    }
}
