package com.google.firebase.installations.p153n;

import com.google.firebase.installations.p153n.C4866f;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.installations.n.b */
final class C4858b extends C4866f {

    /* renamed from: a */
    private final String f13670a;

    /* renamed from: b */
    private final long f13671b;

    /* renamed from: c */
    private final C4866f.C4868b f13672c;

    /* renamed from: com.google.firebase.installations.n.b$b */
    static final class C4860b extends C4866f.C4867a {

        /* renamed from: a */
        private String f13673a;

        /* renamed from: b */
        private Long f13674b;

        /* renamed from: c */
        private C4866f.C4868b f13675c;

        C4860b() {
        }

        /* renamed from: a */
        public C4866f mo14818a() {
            Long l = this.f13674b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C4858b(this.f13673a, this.f13674b.longValue(), this.f13675c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4866f.C4867a mo14819b(C4866f.C4868b bVar) {
            this.f13675c = bVar;
            return this;
        }

        /* renamed from: c */
        public C4866f.C4867a mo14820c(String str) {
            this.f13673a = str;
            return this;
        }

        /* renamed from: d */
        public C4866f.C4867a mo14821d(long j) {
            this.f13674b = Long.valueOf(j);
            return this;
        }
    }

    private C4858b(String str, long j, C4866f.C4868b bVar) {
        this.f13670a = str;
        this.f13671b = j;
        this.f13672c = bVar;
    }

    /* renamed from: b */
    public C4866f.C4868b mo14812b() {
        return this.f13672c;
    }

    /* renamed from: c */
    public String mo14813c() {
        return this.f13670a;
    }

    /* renamed from: d */
    public long mo14814d() {
        return this.f13671b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4866f)) {
            return false;
        }
        C4866f fVar = (C4866f) obj;
        String str = this.f13670a;
        if (str != null ? str.equals(fVar.mo14813c()) : fVar.mo14813c() == null) {
            if (this.f13671b == fVar.mo14814d()) {
                C4866f.C4868b bVar = this.f13672c;
                C4866f.C4868b b = fVar.mo14812b();
                if (bVar == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (bVar.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f13670a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f13671b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C4866f.C4868b bVar = this.f13672c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f13670a + ", tokenExpirationTimestamp=" + this.f13671b + ", responseCode=" + this.f13672c + "}";
    }
}
