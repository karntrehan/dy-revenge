package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.h.l.z */
final class C4773z extends C4703c0.C4706c {

    /* renamed from: a */
    private final String f13447a;

    /* renamed from: b */
    private final String f13448b;

    /* renamed from: c */
    private final boolean f13449c;

    C4773z(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f13447a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f13448b = str2;
        this.f13449c = z;
    }

    /* renamed from: b */
    public boolean mo14576b() {
        return this.f13449c;
    }

    /* renamed from: c */
    public String mo14577c() {
        return this.f13448b;
    }

    /* renamed from: d */
    public String mo14578d() {
        return this.f13447a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4703c0.C4706c)) {
            return false;
        }
        C4703c0.C4706c cVar = (C4703c0.C4706c) obj;
        return this.f13447a.equals(cVar.mo14578d()) && this.f13448b.equals(cVar.mo14577c()) && this.f13449c == cVar.mo14576b();
    }

    public int hashCode() {
        return ((((this.f13447a.hashCode() ^ 1000003) * 1000003) ^ this.f13448b.hashCode()) * 1000003) ^ (this.f13449c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f13447a + ", osCodeName=" + this.f13448b + ", isRooted=" + this.f13449c + "}";
    }
}
