package p174e.p319f.p320a.p322b.p323i.p324a0.p325j;

import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6503k0;

/* renamed from: e.f.a.b.i.a0.j.g0 */
final class C6493g0 extends C6503k0 {

    /* renamed from: b */
    private final long f18048b;

    /* renamed from: c */
    private final int f18049c;

    /* renamed from: d */
    private final int f18050d;

    /* renamed from: e */
    private final long f18051e;

    /* renamed from: f */
    private final int f18052f;

    /* renamed from: e.f.a.b.i.a0.j.g0$b */
    static final class C6495b extends C6503k0.C6504a {

        /* renamed from: a */
        private Long f18053a;

        /* renamed from: b */
        private Integer f18054b;

        /* renamed from: c */
        private Integer f18055c;

        /* renamed from: d */
        private Long f18056d;

        /* renamed from: e */
        private Integer f18057e;

        C6495b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6503k0 mo19264a() {
            Long l = this.f18053a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f18054b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f18055c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f18056d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f18057e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C6493g0(this.f18053a.longValue(), this.f18054b.intValue(), this.f18055c.intValue(), this.f18056d.longValue(), this.f18057e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6503k0.C6504a mo19265b(int i) {
            this.f18055c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6503k0.C6504a mo19266c(long j) {
            this.f18056d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6503k0.C6504a mo19267d(int i) {
            this.f18054b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6503k0.C6504a mo19268e(int i) {
            this.f18057e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6503k0.C6504a mo19269f(long j) {
            this.f18053a = Long.valueOf(j);
            return this;
        }
    }

    private C6493g0(long j, int i, int i2, long j2, int i3) {
        this.f18048b = j;
        this.f18049c = i;
        this.f18050d = i2;
        this.f18051e = j2;
        this.f18052f = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo19256b() {
        return this.f18050d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo19257c() {
        return this.f18051e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo19258d() {
        return this.f18049c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19259e() {
        return this.f18052f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6503k0)) {
            return false;
        }
        C6503k0 k0Var = (C6503k0) obj;
        return this.f18048b == k0Var.mo19261f() && this.f18049c == k0Var.mo19258d() && this.f18050d == k0Var.mo19256b() && this.f18051e == k0Var.mo19257c() && this.f18052f == k0Var.mo19259e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo19261f() {
        return this.f18048b;
    }

    public int hashCode() {
        long j = this.f18048b;
        long j2 = this.f18051e;
        return this.f18052f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f18049c) * 1000003) ^ this.f18050d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f18048b + ", loadBatchSize=" + this.f18049c + ", criticalSectionEnterTimeoutMs=" + this.f18050d + ", eventCleanUpAge=" + this.f18051e + ", maxBlobByteSizePerRow=" + this.f18052f + "}";
    }
}
