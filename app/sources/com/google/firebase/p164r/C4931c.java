package com.google.firebase.p164r;

import java.util.Objects;

/* renamed from: com.google.firebase.r.c */
final class C4931c extends C4935g {

    /* renamed from: a */
    private final String f13788a;

    /* renamed from: b */
    private final String f13789b;

    C4931c(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f13788a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f13789b = str2;
    }

    /* renamed from: b */
    public String mo14937b() {
        return this.f13788a;
    }

    /* renamed from: c */
    public String mo14938c() {
        return this.f13789b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4935g)) {
            return false;
        }
        C4935g gVar = (C4935g) obj;
        return this.f13788a.equals(gVar.mo14937b()) && this.f13789b.equals(gVar.mo14938c());
    }

    public int hashCode() {
        return ((this.f13788a.hashCode() ^ 1000003) * 1000003) ^ this.f13789b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f13788a + ", version=" + this.f13789b + "}";
    }
}
