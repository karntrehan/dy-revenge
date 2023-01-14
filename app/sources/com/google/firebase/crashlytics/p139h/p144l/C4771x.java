package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.C4539e;
import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.h.l.x */
final class C4771x extends C4703c0.C4704a {

    /* renamed from: a */
    private final String f13432a;

    /* renamed from: b */
    private final String f13433b;

    /* renamed from: c */
    private final String f13434c;

    /* renamed from: d */
    private final String f13435d;

    /* renamed from: e */
    private final int f13436e;

    /* renamed from: f */
    private final C4539e f13437f;

    C4771x(String str, String str2, String str3, String str4, int i, C4539e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f13432a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f13433b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f13434c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f13435d = str4;
        this.f13436e = i;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f13437f = eVar;
    }

    /* renamed from: a */
    public String mo14561a() {
        return this.f13432a;
    }

    /* renamed from: c */
    public int mo14562c() {
        return this.f13436e;
    }

    /* renamed from: d */
    public C4539e mo14563d() {
        return this.f13437f;
    }

    /* renamed from: e */
    public String mo14564e() {
        return this.f13435d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4703c0.C4704a)) {
            return false;
        }
        C4703c0.C4704a aVar = (C4703c0.C4704a) obj;
        return this.f13432a.equals(aVar.mo14561a()) && this.f13433b.equals(aVar.mo14565f()) && this.f13434c.equals(aVar.mo14566g()) && this.f13435d.equals(aVar.mo14564e()) && this.f13436e == aVar.mo14562c() && this.f13437f.equals(aVar.mo14563d());
    }

    /* renamed from: f */
    public String mo14565f() {
        return this.f13433b;
    }

    /* renamed from: g */
    public String mo14566g() {
        return this.f13434c;
    }

    public int hashCode() {
        return ((((((((((this.f13432a.hashCode() ^ 1000003) * 1000003) ^ this.f13433b.hashCode()) * 1000003) ^ this.f13434c.hashCode()) * 1000003) ^ this.f13435d.hashCode()) * 1000003) ^ this.f13436e) * 1000003) ^ this.f13437f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f13432a + ", versionCode=" + this.f13433b + ", versionName=" + this.f13434c + ", installUuid=" + this.f13435d + ", deliveryMechanism=" + this.f13436e + ", developmentPlatformProvider=" + this.f13437f + "}";
    }
}
