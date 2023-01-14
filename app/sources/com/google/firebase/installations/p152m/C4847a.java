package com.google.firebase.installations.p152m;

import com.google.firebase.installations.p152m.C4851c;
import com.google.firebase.installations.p152m.C4853d;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.installations.m.a */
final class C4847a extends C4853d {

    /* renamed from: b */
    private final String f13634b;

    /* renamed from: c */
    private final C4851c.C4852a f13635c;

    /* renamed from: d */
    private final String f13636d;

    /* renamed from: e */
    private final String f13637e;

    /* renamed from: f */
    private final long f13638f;

    /* renamed from: g */
    private final long f13639g;

    /* renamed from: h */
    private final String f13640h;

    /* renamed from: com.google.firebase.installations.m.a$b */
    static final class C4849b extends C4853d.C4854a {

        /* renamed from: a */
        private String f13641a;

        /* renamed from: b */
        private C4851c.C4852a f13642b;

        /* renamed from: c */
        private String f13643c;

        /* renamed from: d */
        private String f13644d;

        /* renamed from: e */
        private Long f13645e;

        /* renamed from: f */
        private Long f13646f;

        /* renamed from: g */
        private String f13647g;

        C4849b() {
        }

        private C4849b(C4853d dVar) {
            this.f13641a = dVar.mo14766d();
            this.f13642b = dVar.mo14770g();
            this.f13643c = dVar.mo14764b();
            this.f13644d = dVar.mo14769f();
            this.f13645e = Long.valueOf(dVar.mo14765c());
            this.f13646f = Long.valueOf(dVar.mo14771h());
            this.f13647g = dVar.mo14767e();
        }

        /* renamed from: a */
        public C4853d mo14775a() {
            C4851c.C4852a aVar = this.f13642b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (aVar == null) {
                str = str + " registrationStatus";
            }
            if (this.f13645e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f13646f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C4847a(this.f13641a, this.f13642b, this.f13643c, this.f13644d, this.f13645e.longValue(), this.f13646f.longValue(), this.f13647g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4853d.C4854a mo14776b(String str) {
            this.f13643c = str;
            return this;
        }

        /* renamed from: c */
        public C4853d.C4854a mo14777c(long j) {
            this.f13645e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C4853d.C4854a mo14778d(String str) {
            this.f13641a = str;
            return this;
        }

        /* renamed from: e */
        public C4853d.C4854a mo14779e(String str) {
            this.f13647g = str;
            return this;
        }

        /* renamed from: f */
        public C4853d.C4854a mo14780f(String str) {
            this.f13644d = str;
            return this;
        }

        /* renamed from: g */
        public C4853d.C4854a mo14781g(C4851c.C4852a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f13642b = aVar;
            return this;
        }

        /* renamed from: h */
        public C4853d.C4854a mo14782h(long j) {
            this.f13646f = Long.valueOf(j);
            return this;
        }
    }

    private C4847a(String str, C4851c.C4852a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f13634b = str;
        this.f13635c = aVar;
        this.f13636d = str2;
        this.f13637e = str3;
        this.f13638f = j;
        this.f13639g = j2;
        this.f13640h = str4;
    }

    /* renamed from: b */
    public String mo14764b() {
        return this.f13636d;
    }

    /* renamed from: c */
    public long mo14765c() {
        return this.f13638f;
    }

    /* renamed from: d */
    public String mo14766d() {
        return this.f13634b;
    }

    /* renamed from: e */
    public String mo14767e() {
        return this.f13640h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4853d)) {
            return false;
        }
        C4853d dVar = (C4853d) obj;
        String str3 = this.f13634b;
        if (str3 != null ? str3.equals(dVar.mo14766d()) : dVar.mo14766d() == null) {
            if (this.f13635c.equals(dVar.mo14770g()) && ((str = this.f13636d) != null ? str.equals(dVar.mo14764b()) : dVar.mo14764b() == null) && ((str2 = this.f13637e) != null ? str2.equals(dVar.mo14769f()) : dVar.mo14769f() == null) && this.f13638f == dVar.mo14765c() && this.f13639g == dVar.mo14771h()) {
                String str4 = this.f13640h;
                String e = dVar.mo14767e();
                if (str4 == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (str4.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo14769f() {
        return this.f13637e;
    }

    /* renamed from: g */
    public C4851c.C4852a mo14770g() {
        return this.f13635c;
    }

    /* renamed from: h */
    public long mo14771h() {
        return this.f13639g;
    }

    public int hashCode() {
        String str = this.f13634b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f13635c.hashCode()) * 1000003;
        String str2 = this.f13636d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13637e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f13638f;
        long j2 = this.f13639g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f13640h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C4853d.C4854a mo14773n() {
        return new C4849b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f13634b + ", registrationStatus=" + this.f13635c + ", authToken=" + this.f13636d + ", refreshToken=" + this.f13637e + ", expiresInSecs=" + this.f13638f + ", tokenCreationEpochInSecs=" + this.f13639g + ", fisError=" + this.f13640h + "}";
    }
}
