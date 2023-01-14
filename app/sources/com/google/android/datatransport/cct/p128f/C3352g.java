package com.google.android.datatransport.cct.p128f;

import com.google.android.datatransport.cct.p128f.C3365m;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.datatransport.cct.f.g */
final class C3352g extends C3365m {

    /* renamed from: a */
    private final long f9505a;

    /* renamed from: b */
    private final long f9506b;

    /* renamed from: c */
    private final C3360k f9507c;

    /* renamed from: d */
    private final Integer f9508d;

    /* renamed from: e */
    private final String f9509e;

    /* renamed from: f */
    private final List<C3363l> f9510f;

    /* renamed from: g */
    private final C3372p f9511g;

    /* renamed from: com.google.android.datatransport.cct.f.g$b */
    static final class C3354b extends C3365m.C3366a {

        /* renamed from: a */
        private Long f9512a;

        /* renamed from: b */
        private Long f9513b;

        /* renamed from: c */
        private C3360k f9514c;

        /* renamed from: d */
        private Integer f9515d;

        /* renamed from: e */
        private String f9516e;

        /* renamed from: f */
        private List<C3363l> f9517f;

        /* renamed from: g */
        private C3372p f9518g;

        C3354b() {
        }

        /* renamed from: a */
        public C3365m mo10925a() {
            Long l = this.f9512a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " requestTimeMs";
            }
            if (this.f9513b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C3352g(this.f9512a.longValue(), this.f9513b.longValue(), this.f9514c, this.f9515d, this.f9516e, this.f9517f, this.f9518g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3365m.C3366a mo10926b(C3360k kVar) {
            this.f9514c = kVar;
            return this;
        }

        /* renamed from: c */
        public C3365m.C3366a mo10927c(List<C3363l> list) {
            this.f9517f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3365m.C3366a mo10928d(Integer num) {
            this.f9515d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3365m.C3366a mo10929e(String str) {
            this.f9516e = str;
            return this;
        }

        /* renamed from: f */
        public C3365m.C3366a mo10930f(C3372p pVar) {
            this.f9518g = pVar;
            return this;
        }

        /* renamed from: g */
        public C3365m.C3366a mo10931g(long j) {
            this.f9512a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C3365m.C3366a mo10932h(long j) {
            this.f9513b = Long.valueOf(j);
            return this;
        }
    }

    private C3352g(long j, long j2, C3360k kVar, Integer num, String str, List<C3363l> list, C3372p pVar) {
        this.f9505a = j;
        this.f9506b = j2;
        this.f9507c = kVar;
        this.f9508d = num;
        this.f9509e = str;
        this.f9510f = list;
        this.f9511g = pVar;
    }

    /* renamed from: b */
    public C3360k mo10915b() {
        return this.f9507c;
    }

    /* renamed from: c */
    public List<C3363l> mo10916c() {
        return this.f9510f;
    }

    /* renamed from: d */
    public Integer mo10917d() {
        return this.f9508d;
    }

    /* renamed from: e */
    public String mo10918e() {
        return this.f9509e;
    }

    public boolean equals(Object obj) {
        C3360k kVar;
        Integer num;
        String str;
        List<C3363l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3365m)) {
            return false;
        }
        C3365m mVar = (C3365m) obj;
        if (this.f9505a == mVar.mo10921g() && this.f9506b == mVar.mo10922h() && ((kVar = this.f9507c) != null ? kVar.equals(mVar.mo10915b()) : mVar.mo10915b() == null) && ((num = this.f9508d) != null ? num.equals(mVar.mo10917d()) : mVar.mo10917d() == null) && ((str = this.f9509e) != null ? str.equals(mVar.mo10918e()) : mVar.mo10918e() == null) && ((list = this.f9510f) != null ? list.equals(mVar.mo10916c()) : mVar.mo10916c() == null)) {
            C3372p pVar = this.f9511g;
            C3372p f = mVar.mo10920f();
            if (pVar == null) {
                if (f == null) {
                    return true;
                }
            } else if (pVar.equals(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C3372p mo10920f() {
        return this.f9511g;
    }

    /* renamed from: g */
    public long mo10921g() {
        return this.f9505a;
    }

    /* renamed from: h */
    public long mo10922h() {
        return this.f9506b;
    }

    public int hashCode() {
        long j = this.f9505a;
        long j2 = this.f9506b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C3360k kVar = this.f9507c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f9508d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f9509e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C3363l> list = this.f9510f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C3372p pVar = this.f9511g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f9505a + ", requestUptimeMs=" + this.f9506b + ", clientInfo=" + this.f9507c + ", logSource=" + this.f9508d + ", logSourceName=" + this.f9509e + ", logEvents=" + this.f9510f + ", qosTier=" + this.f9511g + "}";
    }
}
