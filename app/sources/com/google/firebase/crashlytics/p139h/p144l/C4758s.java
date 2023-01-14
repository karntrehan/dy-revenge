package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.s */
final class C4758s extends C4655a0.C4665e.C4672d.C4688c {

    /* renamed from: a */
    private final Double f13405a;

    /* renamed from: b */
    private final int f13406b;

    /* renamed from: c */
    private final boolean f13407c;

    /* renamed from: d */
    private final int f13408d;

    /* renamed from: e */
    private final long f13409e;

    /* renamed from: f */
    private final long f13410f;

    /* renamed from: com.google.firebase.crashlytics.h.l.s$b */
    static final class C4760b extends C4655a0.C4665e.C4672d.C4688c.C4689a {

        /* renamed from: a */
        private Double f13411a;

        /* renamed from: b */
        private Integer f13412b;

        /* renamed from: c */
        private Boolean f13413c;

        /* renamed from: d */
        private Integer f13414d;

        /* renamed from: e */
        private Long f13415e;

        /* renamed from: f */
        private Long f13416f;

        C4760b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4688c mo14505a() {
            Integer num = this.f13412b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = str + " batteryVelocity";
            }
            if (this.f13413c == null) {
                str = str + " proximityOn";
            }
            if (this.f13414d == null) {
                str = str + " orientation";
            }
            if (this.f13415e == null) {
                str = str + " ramUsed";
            }
            if (this.f13416f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C4758s(this.f13411a, this.f13412b.intValue(), this.f13413c.booleanValue(), this.f13414d.intValue(), this.f13415e.longValue(), this.f13416f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4688c.C4689a mo14506b(Double d) {
            this.f13411a = d;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4688c.C4689a mo14507c(int i) {
            this.f13412b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4688c.C4689a mo14508d(long j) {
            this.f13416f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4688c.C4689a mo14509e(int i) {
            this.f13414d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4672d.C4688c.C4689a mo14510f(boolean z) {
            this.f13413c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public C4655a0.C4665e.C4672d.C4688c.C4689a mo14511g(long j) {
            this.f13415e = Long.valueOf(j);
            return this;
        }
    }

    private C4758s(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f13405a = d;
        this.f13406b = i;
        this.f13407c = z;
        this.f13408d = i2;
        this.f13409e = j;
        this.f13410f = j2;
    }

    /* renamed from: b */
    public Double mo14499b() {
        return this.f13405a;
    }

    /* renamed from: c */
    public int mo14500c() {
        return this.f13406b;
    }

    /* renamed from: d */
    public long mo14501d() {
        return this.f13410f;
    }

    /* renamed from: e */
    public int mo14502e() {
        return this.f13408d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4672d.C4688c)) {
            return false;
        }
        C4655a0.C4665e.C4672d.C4688c cVar = (C4655a0.C4665e.C4672d.C4688c) obj;
        Double d = this.f13405a;
        if (d != null ? d.equals(cVar.mo14499b()) : cVar.mo14499b() == null) {
            return this.f13406b == cVar.mo14500c() && this.f13407c == cVar.mo14504g() && this.f13408d == cVar.mo14502e() && this.f13409e == cVar.mo14503f() && this.f13410f == cVar.mo14501d();
        }
    }

    /* renamed from: f */
    public long mo14503f() {
        return this.f13409e;
    }

    /* renamed from: g */
    public boolean mo14504g() {
        return this.f13407c;
    }

    public int hashCode() {
        Double d = this.f13405a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f13406b) * 1000003;
        int i = this.f13407c ? 1231 : 1237;
        long j = this.f13409e;
        long j2 = this.f13410f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f13408d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f13405a + ", batteryVelocity=" + this.f13406b + ", proximityOn=" + this.f13407c + ", orientation=" + this.f13408d + ", ramUsed=" + this.f13409e + ", diskUsed=" + this.f13410f + "}";
    }
}
