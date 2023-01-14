package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3412t;
import java.util.Objects;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
final class C3408r extends C3412t.C3414b {

    /* renamed from: a */
    private final long f9648a;

    /* renamed from: b */
    private final long f9649b;

    /* renamed from: c */
    private final Set<C3412t.C3416c> f9650c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r$b */
    static final class C3410b extends C3412t.C3414b.C3415a {

        /* renamed from: a */
        private Long f9651a;

        /* renamed from: b */
        private Long f9652b;

        /* renamed from: c */
        private Set<C3412t.C3416c> f9653c;

        C3410b() {
        }

        /* renamed from: a */
        public C3412t.C3414b mo10998a() {
            Long l = this.f9651a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " delta";
            }
            if (this.f9652b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f9653c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C3408r(this.f9651a.longValue(), this.f9652b.longValue(), this.f9653c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3412t.C3414b.C3415a mo10999b(long j) {
            this.f9651a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C3412t.C3414b.C3415a mo11000c(Set<C3412t.C3416c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f9653c = set;
            return this;
        }

        /* renamed from: d */
        public C3412t.C3414b.C3415a mo11001d(long j) {
            this.f9652b = Long.valueOf(j);
            return this;
        }
    }

    private C3408r(long j, long j2, Set<C3412t.C3416c> set) {
        this.f9648a = j;
        this.f9649b = j2;
        this.f9650c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo10992b() {
        return this.f9648a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C3412t.C3416c> mo10993c() {
        return this.f9650c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10994d() {
        return this.f9649b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3412t.C3414b)) {
            return false;
        }
        C3412t.C3414b bVar = (C3412t.C3414b) obj;
        return this.f9648a == bVar.mo10992b() && this.f9649b == bVar.mo10994d() && this.f9650c.equals(bVar.mo10993c());
    }

    public int hashCode() {
        long j = this.f9648a;
        long j2 = this.f9649b;
        return this.f9650c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f9648a + ", maxAllowedDelay=" + this.f9649b + ", flags=" + this.f9650c + "}";
    }
}
