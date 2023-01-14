package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.C3714u;
import com.google.android.gms.common.util.C3767n;

/* renamed from: com.google.firebase.k */
public final class C4872k {

    /* renamed from: a */
    private final String f13694a;

    /* renamed from: b */
    private final String f13695b;

    /* renamed from: c */
    private final String f13696c;

    /* renamed from: d */
    private final String f13697d;

    /* renamed from: e */
    private final String f13698e;

    /* renamed from: f */
    private final String f13699f;

    /* renamed from: g */
    private final String f13700g;

    /* renamed from: com.google.firebase.k$b */
    public static final class C4874b {

        /* renamed from: a */
        private String f13701a;

        /* renamed from: b */
        private String f13702b;

        /* renamed from: c */
        private String f13703c;

        /* renamed from: d */
        private String f13704d;

        /* renamed from: e */
        private String f13705e;

        /* renamed from: f */
        private String f13706f;

        /* renamed from: g */
        private String f13707g;

        /* renamed from: a */
        public C4872k mo14837a() {
            return new C4872k(this.f13702b, this.f13701a, this.f13703c, this.f13704d, this.f13705e, this.f13706f, this.f13707g);
        }

        /* renamed from: b */
        public C4874b mo14838b(String str) {
            this.f13701a = C3705r.m14343h(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public C4874b mo14839c(String str) {
            this.f13702b = C3705r.m14343h(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public C4874b mo14840d(String str) {
            this.f13703c = str;
            return this;
        }

        /* renamed from: e */
        public C4874b mo14841e(String str) {
            this.f13704d = str;
            return this;
        }

        /* renamed from: f */
        public C4874b mo14842f(String str) {
            this.f13705e = str;
            return this;
        }

        /* renamed from: g */
        public C4874b mo14843g(String str) {
            this.f13707g = str;
            return this;
        }

        /* renamed from: h */
        public C4874b mo14844h(String str) {
            this.f13706f = str;
            return this;
        }
    }

    private C4872k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C3705r.m14350o(!C3767n.m14535a(str), "ApplicationId must be set.");
        this.f13695b = str;
        this.f13694a = str2;
        this.f13696c = str3;
        this.f13697d = str4;
        this.f13698e = str5;
        this.f13699f = str6;
        this.f13700g = str7;
    }

    /* renamed from: a */
    public static C4872k m18636a(Context context) {
        C3714u uVar = new C3714u(context);
        String a = uVar.mo11679a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C4872k(a, uVar.mo11679a("google_api_key"), uVar.mo11679a("firebase_database_url"), uVar.mo11679a("ga_trackingId"), uVar.mo11679a("gcm_defaultSenderId"), uVar.mo11679a("google_storage_bucket"), uVar.mo11679a("project_id"));
    }

    /* renamed from: b */
    public String mo14827b() {
        return this.f13694a;
    }

    /* renamed from: c */
    public String mo14828c() {
        return this.f13695b;
    }

    /* renamed from: d */
    public String mo14829d() {
        return this.f13696c;
    }

    /* renamed from: e */
    public String mo14830e() {
        return this.f13697d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4872k)) {
            return false;
        }
        C4872k kVar = (C4872k) obj;
        return C3697p.m14323b(this.f13695b, kVar.f13695b) && C3697p.m14323b(this.f13694a, kVar.f13694a) && C3697p.m14323b(this.f13696c, kVar.f13696c) && C3697p.m14323b(this.f13697d, kVar.f13697d) && C3697p.m14323b(this.f13698e, kVar.f13698e) && C3697p.m14323b(this.f13699f, kVar.f13699f) && C3697p.m14323b(this.f13700g, kVar.f13700g);
    }

    /* renamed from: f */
    public String mo14832f() {
        return this.f13698e;
    }

    /* renamed from: g */
    public String mo14833g() {
        return this.f13700g;
    }

    /* renamed from: h */
    public String mo14834h() {
        return this.f13699f;
    }

    public int hashCode() {
        return C3697p.m14324c(this.f13695b, this.f13694a, this.f13696c, this.f13697d, this.f13698e, this.f13699f, this.f13700g);
    }

    public String toString() {
        return C3697p.m14325d(this).mo11646a("applicationId", this.f13695b).mo11646a("apiKey", this.f13694a).mo11646a("databaseUrl", this.f13696c).mo11646a("gcmSenderId", this.f13698e).mo11646a("storageBucket", this.f13699f).mo11646a("projectId", this.f13700g).toString();
    }
}
