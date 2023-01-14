package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.h */
final class C4727h extends C4655a0.C4665e.C4666a {

    /* renamed from: a */
    private final String f13302a;

    /* renamed from: b */
    private final String f13303b;

    /* renamed from: c */
    private final String f13304c;

    /* renamed from: d */
    private final C4655a0.C4665e.C4666a.C4668b f13305d;

    /* renamed from: e */
    private final String f13306e;

    /* renamed from: f */
    private final String f13307f;

    /* renamed from: g */
    private final String f13308g;

    /* renamed from: com.google.firebase.crashlytics.h.l.h$b */
    static final class C4729b extends C4655a0.C4665e.C4666a.C4667a {

        /* renamed from: a */
        private String f13309a;

        /* renamed from: b */
        private String f13310b;

        /* renamed from: c */
        private String f13311c;

        /* renamed from: d */
        private C4655a0.C4665e.C4666a.C4668b f13312d;

        /* renamed from: e */
        private String f13313e;

        /* renamed from: f */
        private String f13314f;

        /* renamed from: g */
        private String f13315g;

        C4729b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4666a mo14377a() {
            String str = this.f13309a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " identifier";
            }
            if (this.f13310b == null) {
                str2 = str2 + " version";
            }
            if (str2.isEmpty()) {
                return new C4727h(this.f13309a, this.f13310b, this.f13311c, this.f13312d, this.f13313e, this.f13314f, this.f13315g);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4666a.C4667a mo14378b(String str) {
            this.f13314f = str;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4666a.C4667a mo14379c(String str) {
            this.f13315g = str;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4666a.C4667a mo14380d(String str) {
            this.f13311c = str;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4666a.C4667a mo14381e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f13309a = str;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4666a.C4667a mo14382f(String str) {
            this.f13313e = str;
            return this;
        }

        /* renamed from: g */
        public C4655a0.C4665e.C4666a.C4667a mo14383g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f13310b = str;
            return this;
        }
    }

    private C4727h(String str, String str2, String str3, C4655a0.C4665e.C4666a.C4668b bVar, String str4, String str5, String str6) {
        this.f13302a = str;
        this.f13303b = str2;
        this.f13304c = str3;
        this.f13305d = bVar;
        this.f13306e = str4;
        this.f13307f = str5;
        this.f13308g = str6;
    }

    /* renamed from: b */
    public String mo14370b() {
        return this.f13307f;
    }

    /* renamed from: c */
    public String mo14371c() {
        return this.f13308g;
    }

    /* renamed from: d */
    public String mo14372d() {
        return this.f13304c;
    }

    /* renamed from: e */
    public String mo14373e() {
        return this.f13302a;
    }

    public boolean equals(Object obj) {
        String str;
        C4655a0.C4665e.C4666a.C4668b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4666a)) {
            return false;
        }
        C4655a0.C4665e.C4666a aVar = (C4655a0.C4665e.C4666a) obj;
        if (this.f13302a.equals(aVar.mo14373e()) && this.f13303b.equals(aVar.mo14376h()) && ((str = this.f13304c) != null ? str.equals(aVar.mo14372d()) : aVar.mo14372d() == null) && ((bVar = this.f13305d) != null ? bVar.equals(aVar.mo14375g()) : aVar.mo14375g() == null) && ((str2 = this.f13306e) != null ? str2.equals(aVar.mo14374f()) : aVar.mo14374f() == null) && ((str3 = this.f13307f) != null ? str3.equals(aVar.mo14370b()) : aVar.mo14370b() == null)) {
            String str4 = this.f13308g;
            String c = aVar.mo14371c();
            if (str4 == null) {
                if (c == null) {
                    return true;
                }
            } else if (str4.equals(c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo14374f() {
        return this.f13306e;
    }

    /* renamed from: g */
    public C4655a0.C4665e.C4666a.C4668b mo14375g() {
        return this.f13305d;
    }

    /* renamed from: h */
    public String mo14376h() {
        return this.f13303b;
    }

    public int hashCode() {
        int hashCode = (((this.f13302a.hashCode() ^ 1000003) * 1000003) ^ this.f13303b.hashCode()) * 1000003;
        String str = this.f13304c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C4655a0.C4665e.C4666a.C4668b bVar = this.f13305d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f13306e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13307f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f13308g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f13302a + ", version=" + this.f13303b + ", displayVersion=" + this.f13304c + ", organization=" + this.f13305d + ", installationUuid=" + this.f13306e + ", developmentPlatform=" + this.f13307f + ", developmentPlatformVersion=" + this.f13308g + "}";
    }
}
