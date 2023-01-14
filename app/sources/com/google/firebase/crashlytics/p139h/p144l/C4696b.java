package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.b */
final class C4696b extends C4655a0 {

    /* renamed from: b */
    private final String f13228b;

    /* renamed from: c */
    private final String f13229c;

    /* renamed from: d */
    private final int f13230d;

    /* renamed from: e */
    private final String f13231e;

    /* renamed from: f */
    private final String f13232f;

    /* renamed from: g */
    private final String f13233g;

    /* renamed from: h */
    private final C4655a0.C4665e f13234h;

    /* renamed from: i */
    private final C4655a0.C4661d f13235i;

    /* renamed from: com.google.firebase.crashlytics.h.l.b$b */
    static final class C4698b extends C4655a0.C4658b {

        /* renamed from: a */
        private String f13236a;

        /* renamed from: b */
        private String f13237b;

        /* renamed from: c */
        private Integer f13238c;

        /* renamed from: d */
        private String f13239d;

        /* renamed from: e */
        private String f13240e;

        /* renamed from: f */
        private String f13241f;

        /* renamed from: g */
        private C4655a0.C4665e f13242g;

        /* renamed from: h */
        private C4655a0.C4661d f13243h;

        C4698b() {
        }

        private C4698b(C4655a0 a0Var) {
            this.f13236a = a0Var.mo14308i();
            this.f13237b = a0Var.mo14304e();
            this.f13238c = Integer.valueOf(a0Var.mo14307h());
            this.f13239d = a0Var.mo14305f();
            this.f13240e = a0Var.mo14302c();
            this.f13241f = a0Var.mo14303d();
            this.f13242g = a0Var.mo14309j();
            this.f13243h = a0Var.mo14306g();
        }

        /* renamed from: a */
        public C4655a0 mo14331a() {
            String str = this.f13236a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " sdkVersion";
            }
            if (this.f13237b == null) {
                str2 = str2 + " gmpAppId";
            }
            if (this.f13238c == null) {
                str2 = str2 + " platform";
            }
            if (this.f13239d == null) {
                str2 = str2 + " installationUuid";
            }
            if (this.f13240e == null) {
                str2 = str2 + " buildVersion";
            }
            if (this.f13241f == null) {
                str2 = str2 + " displayVersion";
            }
            if (str2.isEmpty()) {
                return new C4696b(this.f13236a, this.f13237b, this.f13238c.intValue(), this.f13239d, this.f13240e, this.f13241f, this.f13242g, this.f13243h);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4658b mo14332b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f13240e = str;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4658b mo14333c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f13241f = str;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4658b mo14334d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f13237b = str;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4658b mo14335e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f13239d = str;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4658b mo14336f(C4655a0.C4661d dVar) {
            this.f13243h = dVar;
            return this;
        }

        /* renamed from: g */
        public C4655a0.C4658b mo14337g(int i) {
            this.f13238c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public C4655a0.C4658b mo14338h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f13236a = str;
            return this;
        }

        /* renamed from: i */
        public C4655a0.C4658b mo14339i(C4655a0.C4665e eVar) {
            this.f13242g = eVar;
            return this;
        }
    }

    private C4696b(String str, String str2, int i, String str3, String str4, String str5, C4655a0.C4665e eVar, C4655a0.C4661d dVar) {
        this.f13228b = str;
        this.f13229c = str2;
        this.f13230d = i;
        this.f13231e = str3;
        this.f13232f = str4;
        this.f13233g = str5;
        this.f13234h = eVar;
        this.f13235i = dVar;
    }

    /* renamed from: c */
    public String mo14302c() {
        return this.f13232f;
    }

    /* renamed from: d */
    public String mo14303d() {
        return this.f13233g;
    }

    /* renamed from: e */
    public String mo14304e() {
        return this.f13229c;
    }

    public boolean equals(Object obj) {
        C4655a0.C4665e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0)) {
            return false;
        }
        C4655a0 a0Var = (C4655a0) obj;
        if (this.f13228b.equals(a0Var.mo14308i()) && this.f13229c.equals(a0Var.mo14304e()) && this.f13230d == a0Var.mo14307h() && this.f13231e.equals(a0Var.mo14305f()) && this.f13232f.equals(a0Var.mo14302c()) && this.f13233g.equals(a0Var.mo14303d()) && ((eVar = this.f13234h) != null ? eVar.equals(a0Var.mo14309j()) : a0Var.mo14309j() == null)) {
            C4655a0.C4661d dVar = this.f13235i;
            C4655a0.C4661d g = a0Var.mo14306g();
            if (dVar == null) {
                if (g == null) {
                    return true;
                }
            } else if (dVar.equals(g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo14305f() {
        return this.f13231e;
    }

    /* renamed from: g */
    public C4655a0.C4661d mo14306g() {
        return this.f13235i;
    }

    /* renamed from: h */
    public int mo14307h() {
        return this.f13230d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f13228b.hashCode() ^ 1000003) * 1000003) ^ this.f13229c.hashCode()) * 1000003) ^ this.f13230d) * 1000003) ^ this.f13231e.hashCode()) * 1000003) ^ this.f13232f.hashCode()) * 1000003) ^ this.f13233g.hashCode()) * 1000003;
        C4655a0.C4665e eVar = this.f13234h;
        int i = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C4655a0.C4661d dVar = this.f13235i;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    /* renamed from: i */
    public String mo14308i() {
        return this.f13228b;
    }

    /* renamed from: j */
    public C4655a0.C4665e mo14309j() {
        return this.f13234h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4655a0.C4658b mo14310k() {
        return new C4698b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f13228b + ", gmpAppId=" + this.f13229c + ", platform=" + this.f13230d + ", installationUuid=" + this.f13231e + ", buildVersion=" + this.f13232f + ", displayVersion=" + this.f13233g + ", session=" + this.f13234h + ", ndkPayload=" + this.f13235i + "}";
    }
}
