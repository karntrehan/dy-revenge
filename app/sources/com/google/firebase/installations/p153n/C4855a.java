package com.google.firebase.installations.p153n;

import com.google.firebase.installations.p153n.C4862d;

/* renamed from: com.google.firebase.installations.n.a */
final class C4855a extends C4862d {

    /* renamed from: a */
    private final String f13660a;

    /* renamed from: b */
    private final String f13661b;

    /* renamed from: c */
    private final String f13662c;

    /* renamed from: d */
    private final C4866f f13663d;

    /* renamed from: e */
    private final C4862d.C4864b f13664e;

    /* renamed from: com.google.firebase.installations.n.a$b */
    static final class C4857b extends C4862d.C4863a {

        /* renamed from: a */
        private String f13665a;

        /* renamed from: b */
        private String f13666b;

        /* renamed from: c */
        private String f13667c;

        /* renamed from: d */
        private C4866f f13668d;

        /* renamed from: e */
        private C4862d.C4864b f13669e;

        C4857b() {
        }

        /* renamed from: a */
        public C4862d mo14806a() {
            return new C4855a(this.f13665a, this.f13666b, this.f13667c, this.f13668d, this.f13669e);
        }

        /* renamed from: b */
        public C4862d.C4863a mo14807b(C4866f fVar) {
            this.f13668d = fVar;
            return this;
        }

        /* renamed from: c */
        public C4862d.C4863a mo14808c(String str) {
            this.f13666b = str;
            return this;
        }

        /* renamed from: d */
        public C4862d.C4863a mo14809d(String str) {
            this.f13667c = str;
            return this;
        }

        /* renamed from: e */
        public C4862d.C4863a mo14810e(C4862d.C4864b bVar) {
            this.f13669e = bVar;
            return this;
        }

        /* renamed from: f */
        public C4862d.C4863a mo14811f(String str) {
            this.f13665a = str;
            return this;
        }
    }

    private C4855a(String str, String str2, String str3, C4866f fVar, C4862d.C4864b bVar) {
        this.f13660a = str;
        this.f13661b = str2;
        this.f13662c = str3;
        this.f13663d = fVar;
        this.f13664e = bVar;
    }

    /* renamed from: b */
    public C4866f mo14798b() {
        return this.f13663d;
    }

    /* renamed from: c */
    public String mo14799c() {
        return this.f13661b;
    }

    /* renamed from: d */
    public String mo14800d() {
        return this.f13662c;
    }

    /* renamed from: e */
    public C4862d.C4864b mo14801e() {
        return this.f13664e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4862d)) {
            return false;
        }
        C4862d dVar = (C4862d) obj;
        String str = this.f13660a;
        if (str != null ? str.equals(dVar.mo14803f()) : dVar.mo14803f() == null) {
            String str2 = this.f13661b;
            if (str2 != null ? str2.equals(dVar.mo14799c()) : dVar.mo14799c() == null) {
                String str3 = this.f13662c;
                if (str3 != null ? str3.equals(dVar.mo14800d()) : dVar.mo14800d() == null) {
                    C4866f fVar = this.f13663d;
                    if (fVar != null ? fVar.equals(dVar.mo14798b()) : dVar.mo14798b() == null) {
                        C4862d.C4864b bVar = this.f13664e;
                        C4862d.C4864b e = dVar.mo14801e();
                        if (bVar == null) {
                            if (e == null) {
                                return true;
                            }
                        } else if (bVar.equals(e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo14803f() {
        return this.f13660a;
    }

    public int hashCode() {
        String str = this.f13660a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f13661b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13662c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C4866f fVar = this.f13663d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C4862d.C4864b bVar = this.f13664e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f13660a + ", fid=" + this.f13661b + ", refreshToken=" + this.f13662c + ", authToken=" + this.f13663d + ", responseCode=" + this.f13664e + "}";
    }
}
